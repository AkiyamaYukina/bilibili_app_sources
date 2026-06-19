package com.bilibili.sistersplayer.p2p.peer;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.A;
import com.bilibili.ad.adview.pegasus.holders.inline.card134.l0;
import com.bilibili.sistersplayer.p2p.P2PContext;
import com.bilibili.sistersplayer.p2p.peer.IceCandidateModel;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import com.bilibili.sistersplayer.p2p.utils.SDPConsole;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpTransceiver;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer.class */
public final class NyaPeer implements PeerConnection.Observer, DataChannel.Observer {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "RTCPeer";

    @NotNull
    private final List<IceCandidateData> candidates;

    @Nullable
    private volatile DataChannel dc;

    @NotNull
    private final NyaPeerExtData extUserData;

    @NotNull
    private final AtomicBoolean isDestroyed;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final MessageHandler msgHandler;

    @NotNull
    private final Observer observer;

    @Nullable
    private Function1<? super IceCandidateData, Unit> onCandidate;

    @NotNull
    private final P2PContext p2pContext;

    @Nullable
    private PeerConnection peerConnection;

    @NotNull
    private final Map<Integer, CancellableContinuation<MsgQuery>> pendingRequests;
    private int requestId;

    @NotNull
    private final SDPConsole sdpConsole;

    @Nullable
    private PeerConnection.SignalingState signalingState;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$IceCandidateData.class */
    public static final class IceCandidateData {

        @NotNull
        private String candidate;
        private int sdpMLineIndex;

        @NotNull
        private String sdpMid;

        public IceCandidateData(@NotNull String str, int i7, @NotNull String str2) {
            this.candidate = str;
            this.sdpMLineIndex = i7;
            this.sdpMid = str2;
        }

        @NotNull
        public final String getCandidate() {
            return this.candidate;
        }

        public final int getSdpMLineIndex() {
            return this.sdpMLineIndex;
        }

        @NotNull
        public final String getSdpMid() {
            return this.sdpMid;
        }

        public final void setCandidate(@NotNull String str) {
            this.candidate = str;
        }

        public final void setSdpMLineIndex(int i7) {
            this.sdpMLineIndex = i7;
        }

        public final void setSdpMid(@NotNull String str) {
            this.sdpMid = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$MessageHandler.class */
    public interface MessageHandler {
        boolean handlePeerMessage(@NotNull NyaPeer nyaPeer, @NotNull MsgQuery msgQuery);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$Observer.class */
    public interface Observer {
        void connected(@NotNull NyaPeer nyaPeer);

        void disconnected(@NotNull NyaPeer nyaPeer);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$RelayChannel.class */
    public interface RelayChannel {
        void sendCandidate(@NotNull NyaPeer nyaPeer, @NotNull IceCandidateData iceCandidateData);

        void sendSDP(@NotNull NyaPeer nyaPeer, @NotNull String str);
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeer$sendRequestMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$sendRequestMessage$1.class */
    public static final class C64931 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final NyaPeer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64931(NyaPeer nyaPeer, Continuation<? super C64931> continuation) {
            super(continuation);
            this.this$0 = nyaPeer;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendRequestMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeer$sendRequestMessage$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$sendRequestMessage$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MsgQuery>, Object> {
        final IMsgPackSeriable $msg;
        Object L$0;
        Object L$1;
        int label;
        final NyaPeer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NyaPeer nyaPeer, IMsgPackSeriable iMsgPackSeriable, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = nyaPeer;
            this.$msg = iMsgPackSeriable;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$msg, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MsgQuery> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                NyaPeer nyaPeer = this.this$0;
                IMsgPackSeriable iMsgPackSeriable = this.$msg;
                this.L$0 = nyaPeer;
                this.L$1 = iMsgPackSeriable;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                if (nyaPeer.isDestroyed.get()) {
                    cancellableContinuationImpl.resumeWith(Result.constructor-impl((Object) null));
                } else {
                    nyaPeer.pendingRequests.put(Boxing.boxInt(iMsgPackSeriable.getRequestId()), cancellableContinuationImpl);
                    nyaPeer.send(iMsgPackSeriable);
                }
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                obj = result;
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeer$waitForCandidate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$waitForCandidate$1.class */
    public static final class C64941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function1<IceCandidateData, Unit> $onCandidate;
        final String $sdp;
        int label;
        final NyaPeer this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeer$waitForCandidate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$waitForCandidate$1$1.class */
        public static final class C11771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;
            final NyaPeer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11771(NyaPeer nyaPeer, Continuation<? super C11771> continuation) {
                super(2, continuation);
                this.this$0 = nyaPeer;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11771(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    NyaPeer nyaPeer = this.this$0;
                    this.L$0 = nyaPeer;
                    this.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    nyaPeer.getExtUserData().setCandidateJob(cancellableContinuationImpl);
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    obj = result;
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C64941(NyaPeer nyaPeer, String str, Function1<? super IceCandidateData, Unit> function1, Continuation<? super C64941> continuation) {
            super(2, continuation);
            this.this$0 = nyaPeer;
            this.$sdp = str;
            this.$onCandidate = function1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64941(this.this$0, this.$sdp, this.$onCandidate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j7 = this.this$0.p2pContext.getSistersConfiguration().candidateWaitMaxTimeMs;
                    C11771 c11771 = new C11771(this.this$0, null);
                    this.label = 1;
                    if (TimeoutKt.withTimeoutOrNull(j7, c11771, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e7) {
            }
            PeerConnection peerConnection$bilirtc_release = this.this$0.getPeerConnection$bilirtc_release();
            String str = null;
            if (peerConnection$bilirtc_release != null) {
                SessionDescription localDescription = peerConnection$bilirtc_release.getLocalDescription();
                str = null;
                if (localDescription != null) {
                    str = localDescription.description;
                }
            }
            if (str == null) {
                str = this.$sdp;
            } else {
                this.this$0.candidates.clear();
            }
            this.this$0.setCandidateCallback(this.$onCandidate);
            NyaPeerManager rtcManager = this.this$0.p2pContext.getRtcManager();
            if (rtcManager != null) {
                rtcManager.sendSDP(this.this$0, str);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public NyaPeer(@NotNull P2PContext p2PContext, @NotNull Observer observer, @NotNull MessageHandler messageHandler, @NotNull NyaPeerExtData nyaPeerExtData) {
        this.p2pContext = p2PContext;
        this.observer = observer;
        this.msgHandler = messageHandler;
        this.extUserData = nyaPeerExtData;
        P2PLogger logger = p2PContext.getLogger();
        this.logger = logger;
        this.sdpConsole = new SDPConsole(logger);
        this.candidates = new ArrayList();
        this.pendingRequests = new LinkedHashMap();
        this.isDestroyed = new AtomicBoolean(false);
        this.onCandidate = new l0(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(NyaPeer nyaPeer, IceCandidateData iceCandidateData) {
        nyaPeer.candidates.add(iceCandidateData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCandidateCallback(Function1<? super IceCandidateData, Unit> function1) {
        Iterator<T> it = this.candidates.iterator();
        while (it.hasNext()) {
            function1.invoke((IceCandidateData) it.next());
        }
        this.onCandidate = function1;
        this.candidates.clear();
    }

    private final void terminateAllPendingRequests() {
        for (Map.Entry<Integer, CancellableContinuation<MsgQuery>> entry : this.pendingRequests.entrySet()) {
            if (entry.getValue().isActive()) {
                CancellableContinuation.DefaultImpls.cancel$default(entry.getValue(), (Throwable) null, 1, (Object) null);
            }
        }
        this.pendingRequests.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void waitForCandidate(String str, Function1<? super IceCandidateData, Unit> function1) {
        P2PContext.launch$default(this.p2pContext, null, new C64941(this, str, function1, null), 1, null);
    }

    public final void acceptAnswer(@NotNull String str) {
        String strRemoveBrowserLocalCandidate = this.sdpConsole.removeBrowserLocalCandidate(str, this.extUserData.getPeerId());
        PeerConnection peerConnection = this.peerConnection;
        if (peerConnection != null) {
            peerConnection.setRemoteDescription(new SdpObserver(this) { // from class: com.bilibili.sistersplayer.p2p.peer.NyaPeer.acceptAnswer.1
                final NyaPeer this$0;

                {
                    this.this$0 = this;
                }

                public void onCreateFailure(String str2) {
                    P2PLogger.logI$default(this.this$0.logger, NyaPeer.TAG, C4496a.a("acceptAnswer onCreateFailure ", str2), null, 4, null);
                }

                public void onCreateSuccess(SessionDescription sessionDescription) {
                }

                public void onSetFailure(String str2) {
                    this.this$0.getExtUserData().setAnswerAccepted(false);
                    P2PLogger.logI$default(this.this$0.logger, NyaPeer.TAG, C4496a.a("acceptAnswer onSetFailure ", str2), null, 4, null);
                }

                public void onSetSuccess() {
                    this.this$0.getExtUserData().setAnswerAccepted(true);
                }
            }, new SessionDescription(SessionDescription.Type.ANSWER, strRemoveBrowserLocalCandidate));
        }
    }

    public final void addCandidate(@NotNull IceCandidateData iceCandidateData) {
        IceCandidate iceCandidate = new IceCandidate(iceCandidateData.getSdpMid(), iceCandidateData.getSdpMLineIndex(), iceCandidateData.getCandidate());
        PeerConnection peerConnection = this.peerConnection;
        if (peerConnection != null) {
            peerConnection.addIceCandidate(iceCandidate);
        }
    }

    public final void createAnswer(@NotNull String str, @NotNull RelayChannel relayChannel) {
        String strRemoveBrowserLocalCandidate = this.sdpConsole.removeBrowserLocalCandidate(str, this.extUserData.getPeerId());
        PeerConnection peerConnection = this.peerConnection;
        if (peerConnection != null) {
            peerConnection.setRemoteDescription(new NyaPeer$createAnswer$1$sdpObserver$1(peerConnection, this, relayChannel), new SessionDescription(SessionDescription.Type.OFFER, strRemoveBrowserLocalCandidate));
        }
    }

    public final void createOffer(@NotNull RelayChannel relayChannel) {
        PeerConnection peerConnection = this.peerConnection;
        if (peerConnection != null) {
            NyaPeer$createOffer$1$sdpObserver$1 nyaPeer$createOffer$1$sdpObserver$1 = new NyaPeer$createOffer$1$sdpObserver$1(peerConnection, this, relayChannel);
            DataChannel.Init init = new DataChannel.Init();
            init.negotiated = false;
            init.ordered = false;
            init.maxRetransmitTimeMs = 2500;
            DataChannel dataChannelCreateDataChannel = peerConnection.createDataChannel("misaka-denpa", init);
            this.dc = dataChannelCreateDataChannel;
            dataChannelCreateDataChannel.registerObserver(this);
            MediaConstraints mediaConstraints = new MediaConstraints();
            mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveAudio", "false"));
            mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "false"));
            peerConnection.createOffer(nyaPeer$createOffer$1$sdpObserver$1, mediaConstraints);
        }
    }

    public final void destroy() {
        Job connectionTimeoutJob;
        NyaPeerManager rtcManager;
        if (this.isDestroyed.get()) {
            return;
        }
        this.isDestroyed.set(true);
        if (this.dc == null && this.peerConnection == null) {
            return;
        }
        if (!this.extUserData.isDownloadBlockReport() && this.extUserData.isAnswerAccepted() && (rtcManager = this.p2pContext.getRtcManager()) != null) {
            rtcManager.reportDownloadBlockAwaysFail(this);
        }
        terminateAllPendingRequests();
        Job connectionTimeoutJob2 = this.extUserData.getConnectionTimeoutJob();
        if (connectionTimeoutJob2 != null && connectionTimeoutJob2.isActive() && (connectionTimeoutJob = this.extUserData.getConnectionTimeoutJob()) != null) {
            Job.DefaultImpls.cancel$default(connectionTimeoutJob, (CancellationException) null, 1, (Object) null);
        }
        this.observer.disconnected(this);
        DataChannel dataChannel = this.dc;
        synchronized (this) {
            this.dc = null;
            Unit unit = Unit.INSTANCE;
        }
        if (dataChannel != null) {
            dataChannel.unregisterObserver();
            dataChannel.close();
            dataChannel.dispose();
        }
        PeerConnection peerConnection = this.peerConnection;
        if (peerConnection != null) {
            peerConnection.dispose();
        }
        this.peerConnection = null;
    }

    @NotNull
    public final NyaPeerExtData getExtUserData() {
        return this.extUserData;
    }

    @Nullable
    public final PeerConnection getPeerConnection$bilirtc_release() {
        return this.peerConnection;
    }

    public void onAddStream(@Nullable MediaStream mediaStream) {
    }

    public void onAddTrack(@Nullable RtpReceiver rtpReceiver, @Nullable MediaStream[] mediaStreamArr) {
    }

    public void onBufferedAmountChange(long j7) {
    }

    public void onConnectionChange(@Nullable PeerConnection.PeerConnectionState peerConnectionState) {
        if (peerConnectionState == null || this.isDestroyed.get() || this.p2pContext.isDestroyed()) {
            return;
        }
        P2PContext.launch$default(this.p2pContext, null, new NyaPeer$onConnectionChange$1$1(peerConnectionState, this, null), 1, null);
    }

    public void onDataChannel(@Nullable DataChannel dataChannel) {
        if (dataChannel != null && Intrinsics.areEqual(dataChannel.label(), "misaka-denpa")) {
            synchronized (this) {
                dataChannel.registerObserver(this);
                this.dc = dataChannel;
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        if (dataChannel != null) {
            dataChannel.close();
        }
        if (dataChannel != null) {
            dataChannel.dispose();
        }
    }

    public final void onDownloadBlockFailed() {
        if (this.extUserData.getPeerRole() == PeerRole.SEEDBOX) {
            NyaPeerExtData nyaPeerExtData = this.extUserData;
            nyaPeerExtData.setSeedScore(nyaPeerExtData.getSeedScore() - this.p2pContext.getSistersConfiguration().seedScoreDown);
            if (this.extUserData.getSeedScore() <= 0) {
                destroy();
            }
        }
    }

    public final void onDownloadBlockSucceed() {
        if (this.extUserData.getPeerRole() == PeerRole.SEEDBOX) {
            NyaPeerExtData nyaPeerExtData = this.extUserData;
            nyaPeerExtData.setSeedScore(nyaPeerExtData.getSeedScore() + this.p2pContext.getSistersConfiguration().seedScoreUp);
            if (this.extUserData.getSeedScore() >= this.p2pContext.getSistersConfiguration().seedBoxScoreMax) {
                this.extUserData.setSeedScore(this.p2pContext.getSistersConfiguration().seedBoxScoreMax);
            } else if (this.extUserData.getSeedScore() <= 0) {
                destroy();
            }
        }
    }

    public void onIceCandidate(@Nullable IceCandidate iceCandidate) {
        if (iceCandidate == null || StringsKt.trim(iceCandidate.sdp).toString().length() == 0) {
            return;
        }
        IceCandidateData iceCandidateData = new IceCandidateData(iceCandidate.sdp, iceCandidate.sdpMLineIndex, iceCandidate.sdpMid);
        Function1<? super IceCandidateData, Unit> function1 = this.onCandidate;
        if (function1 != null) {
            function1.invoke(iceCandidateData);
        }
    }

    public void onIceCandidatesRemoved(@Nullable IceCandidate[] iceCandidateArr) {
    }

    public void onIceConnectionChange(@Nullable PeerConnection.IceConnectionState iceConnectionState) {
    }

    public void onIceConnectionReceivingChange(boolean z6) {
    }

    public void onIceGatheringChange(@Nullable PeerConnection.IceGatheringState iceGatheringState) {
        CancellableContinuation<Boolean> candidateJob;
        if (iceGatheringState == null || !iceGatheringState.equals(PeerConnection.IceGatheringState.COMPLETE) || (candidateJob = this.extUserData.getCandidateJob()) == null) {
            return;
        }
        Result.Companion companion = Result.Companion;
        candidateJob.resumeWith(Result.constructor-impl(Boolean.TRUE));
    }

    public void onMessage(@Nullable DataChannel.Buffer buffer) {
        if (buffer != null) {
            try {
                if (buffer.binary) {
                    byte[] bArr = new byte[buffer.data.limit()];
                    buffer.data.get(bArr);
                    MsgQuery msgQuery = new MsgQuery(MsgPack.Companion.unpack(bArr));
                    if (this.p2pContext.isDestroyed()) {
                    } else {
                        P2PContext.launch$default(this.p2pContext, null, new NyaPeer$onMessage$1$1(msgQuery, this, null), 1, null);
                    }
                } else {
                    P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][p2p_error=peer_message] message is not binary", null, 4, null);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e7) {
                this.logger.logE(TAG, "[LiveP2PProblem][p2p_error=peer_message] onMessage exception: ", e7);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public void onRemoveStream(@Nullable MediaStream mediaStream) {
    }

    public void onRemoveTrack(@Nullable RtpReceiver rtpReceiver) {
    }

    public void onRenegotiationNeeded() {
    }

    public void onSelectedCandidatePairChanged(@Nullable CandidatePairChangeEvent candidatePairChangeEvent) {
        IceCandidate iceCandidate;
        IceCandidate iceCandidate2;
        IceCandidate iceCandidate3;
        IceCandidateModel.Companion companion = IceCandidateModel.Companion;
        String port = null;
        IceCandidateModel iceCandidate4 = companion.parseIceCandidate((candidatePairChangeEvent == null || (iceCandidate3 = candidatePairChangeEvent.local) == null) ? null : iceCandidate3.sdp);
        IceCandidateModel iceCandidate5 = companion.parseIceCandidate((candidatePairChangeEvent == null || (iceCandidate2 = candidatePairChangeEvent.remote) == null) ? null : iceCandidate2.sdp);
        NyaPeerExtData nyaPeerExtData = this.extUserData;
        String address = iceCandidate4 != null ? iceCandidate4.getAddress() : null;
        String port2 = iceCandidate4 != null ? iceCandidate4.getPort() : null;
        PeerConnection.AdapterType adapterType = (candidatePairChangeEvent == null || (iceCandidate = candidatePairChangeEvent.local) == null) ? null : iceCandidate.adapterType;
        String address2 = iceCandidate5 != null ? iceCandidate5.getAddress() : null;
        if (iceCandidate5 != null) {
            port = iceCandidate5.getPort();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(address);
        sb.append(":");
        sb.append(port2);
        sb.append(" <");
        sb.append(adapterType);
        nyaPeerExtData.setConnectDescription(A.a("> ", address2, ":", port, sb));
        P2PLogger.logD$default(this.logger, TAG, C4496a.a("onSelectedCandidatePairChanged ", this.extUserData.getConnectDescription()), null, 4, null);
    }

    public void onSignalingChange(@Nullable PeerConnection.SignalingState signalingState) {
        this.signalingState = signalingState;
    }

    public void onStandardizedIceConnectionChange(@Nullable PeerConnection.IceConnectionState iceConnectionState) {
    }

    public void onStateChange() {
        DataChannel.State state;
        synchronized (this) {
            DataChannel dataChannel = this.dc;
            if (dataChannel != null) {
                state = dataChannel.state();
                Unit unit = Unit.INSTANCE;
            } else {
                state = null;
            }
        }
        if (this.isDestroyed.get() || this.p2pContext.isDestroyed() || state == null) {
            return;
        }
        P2PContext.launch$default(this.p2pContext, null, new NyaPeer$onStateChange$2$1(state, this, this, null), 1, null);
    }

    public void onTrack(@Nullable RtpTransceiver rtpTransceiver) {
    }

    public final boolean send(@NotNull IMsgPackSeriable iMsgPackSeriable) {
        DataChannel dataChannel = this.dc;
        if (dataChannel == null) {
            return false;
        }
        if (dataChannel.bufferedAmount() > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            return true;
        }
        MessageBufferPacker messageBufferPackerNewDefaultBufferPacker = MessagePack.newDefaultBufferPacker();
        PeerMessageKt.pack(messageBufferPackerNewDefaultBufferPacker, iMsgPackSeriable);
        dataChannel.send(new DataChannel.Buffer(ByteBuffer.wrap(messageBufferPackerNewDefaultBufferPacker.toByteArray()), true));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendRequestMessage(@org.jetbrains.annotations.NotNull com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.p2p.peer.MsgQuery> r7) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.peer.NyaPeer.sendRequestMessage(com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setPeerConnection$bilirtc_release(@Nullable PeerConnection peerConnection) {
        this.peerConnection = peerConnection;
    }

    public final boolean shouldUsedAsSeed() {
        return ((int) Math.floor(Math.random() * ((double) 100))) < this.extUserData.getSeedScore();
    }
}
