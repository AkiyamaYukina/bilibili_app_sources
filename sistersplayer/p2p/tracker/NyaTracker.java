package com.bilibili.sistersplayer.p2p.tracker;

import androidx.appcompat.widget.C3259x;
import com.bilibili.sistersplayer.p2p.P2PContext;
import com.bilibili.sistersplayer.p2p.peer.NyaPeer;
import com.bilibili.sistersplayer.p2p.peer.NyaPeerManager;
import com.bilibili.sistersplayer.p2p.tracker.Tracker;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import com.tencent.map.geolocation.TencentLocation;
import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/NyaTracker.class */
public final class NyaTracker implements Tracker.TrackerMessageSink {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "NyaTracker";
    private boolean curVisibilityState;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final P2PContext p2pContext;

    @NotNull
    private final NyaPeerManager peerManager;

    @Nullable
    private Tracker tracker;

    @NotNull
    private final String trackerSourceParam;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/NyaTracker$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NyaTracker connect(@NotNull P2PContext p2PContext, @NotNull String str, @NotNull NyaPeerManager nyaPeerManager, @NotNull P2PLogger p2PLogger) {
            NyaTracker nyaTracker = new NyaTracker(p2PContext, str, nyaPeerManager, p2PLogger, null);
            Tracker.Companion.connect(p2PContext, str, nyaTracker, p2PLogger);
            return nyaTracker;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.tracker.NyaTracker$getPeerList$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/NyaTracker$getPeerList$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final NyaTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NyaTracker nyaTracker, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = nyaTracker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getPeerList(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.tracker.NyaTracker$onServerMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/NyaTracker$onServerMessage$1.class */
    public static final class C65091 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final NyaTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65091(NyaTracker nyaTracker, Continuation<? super C65091> continuation) {
            super(continuation);
            this.this$0 = nyaTracker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onServerMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.tracker.NyaTracker$onTrackerConnected$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/NyaTracker$onTrackerConnected$1.class */
    public static final class C65101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final NyaTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65101(NyaTracker nyaTracker, Continuation<? super C65101> continuation) {
            super(2, continuation);
            this.this$0 = nyaTracker;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C65101(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                NyaTracker nyaTracker = this.this$0;
                boolean z6 = nyaTracker.curVisibilityState;
                this.label = 1;
                if (nyaTracker.setSelfVisible(z6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.tracker.NyaTracker$onTrackerConnected$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/NyaTracker$onTrackerConnected$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final NyaTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NyaTracker nyaTracker, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = nyaTracker;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.this$0.p2pContext.getTrackerPositionInServers() == 0) {
                    long j7 = this.this$0.p2pContext.getSistersConfiguration().reconnectWaitTimeSec;
                    this.label = 1;
                    if (DelayKt.delay(j7 * 1000, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            P2PLogger.logI$default(this.this$0.logger, Tracker.TAG, "begin to reconnect tracker...", null, 4, null);
            Tracker.Companion companion = Tracker.Companion;
            P2PContext p2PContext = this.this$0.p2pContext;
            String str = this.this$0.trackerSourceParam;
            NyaTracker nyaTracker = this.this$0;
            companion.connect(p2PContext, str, nyaTracker, nyaTracker.logger);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.tracker.NyaTracker$setNatType$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/NyaTracker$setNatType$1.class */
    public static final class C65111 extends ContinuationImpl {
        int label;
        Object result;
        final NyaTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65111(NyaTracker nyaTracker, Continuation<? super C65111> continuation) {
            super(continuation);
            this.this$0 = nyaTracker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.setNatType(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.tracker.NyaTracker$setSelfVisible$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/NyaTracker$setSelfVisible$1.class */
    public static final class C65121 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        Object result;
        final NyaTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65121(NyaTracker nyaTracker, Continuation<? super C65121> continuation) {
            super(continuation);
            this.this$0 = nyaTracker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.setSelfVisible(false, this);
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    private NyaTracker(P2PContext p2PContext, String str, NyaPeerManager nyaPeerManager, P2PLogger p2PLogger) {
        this.p2pContext = p2PContext;
        this.trackerSourceParam = str;
        this.peerManager = nyaPeerManager;
        this.logger = p2PLogger;
        this.curVisibilityState = true;
        P2PLogger.logI$default(p2PLogger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> NyaTracker init "), null, 4, null);
    }

    public /* synthetic */ NyaTracker(P2PContext p2PContext, String str, NyaPeerManager nyaPeerManager, P2PLogger p2PLogger, DefaultConstructorMarker defaultConstructorMarker) {
        this(p2PContext, str, nyaPeerManager, p2PLogger);
    }

    public static /* synthetic */ Object sendPeerRequest$default(NyaTracker nyaTracker, String str, String str2, Object obj, Continuation continuation, int i7, Object obj2) {
        if ((i7 & 4) != 0) {
            obj = null;
        }
        return nyaTracker.sendPeerRequest(str, str2, obj, continuation);
    }

    public static /* synthetic */ Object sendPeerResponse$default(NyaTracker nyaTracker, String str, int i7, String str2, Object obj, Continuation continuation, int i8, Object obj2) {
        if ((i8 & 8) != 0) {
            obj = null;
        }
        return nyaTracker.sendPeerResponse(str, i7, str2, obj, continuation);
    }

    public final void destroy() {
        P2PLogger.logI$default(this.logger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> NyaTracker destroy "), null, 4, null);
        P2PLogger.logI$default(this.logger, TAG, "destroy", null, 4, null);
        Tracker tracker = this.tracker;
        if (tracker != null) {
            tracker.destroy();
        }
        this.tracker = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getPeerList(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.p2p.tracker.GetPeersResult> r7) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.tracker.NyaTracker.getPeerList(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean getVisibilityState() {
        return this.curVisibilityState;
    }

    @Override // com.bilibili.sistersplayer.p2p.tracker.Tracker.TrackerMessageSink
    public void onPeerMessage(@NotNull Tracker.TrackerMessage trackerMessage) {
        this.peerManager.onPeerRelayMessage(trackerMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.bilibili.sistersplayer.p2p.tracker.Tracker.TrackerMessageSink
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object onServerMessage(@org.jetbrains.annotations.NotNull com.bilibili.sistersplayer.p2p.tracker.Tracker.TrackerMessage r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.tracker.NyaTracker.onServerMessage(com.bilibili.sistersplayer.p2p.tracker.Tracker$TrackerMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.sistersplayer.p2p.tracker.Tracker.TrackerMessageSink
    public void onTrackerConnected(boolean z6) {
        P2PLogger.logI$default(this.logger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> NyaTracker onTrackerConnected "), null, 4, null);
        if (!z6) {
            P2PLogger.logI$default(this.logger, Tracker.TAG, "tracker connect fail", null, 4, null);
            P2PContext.launch$default(this.p2pContext, null, new AnonymousClass2(this, null), 1, null);
            return;
        }
        P2PLogger.logI$default(this.logger, Tracker.TAG, "tracker connect ok", null, 4, null);
        P2PContext.launch$default(this.p2pContext, null, new C65101(this, null), 1, null);
        this.p2pContext.reportNatType(false);
        this.p2pContext.reportNatType(true);
        this.peerManager.beginConnectPeers();
    }

    @Override // com.bilibili.sistersplayer.p2p.tracker.Tracker.TrackerMessageSink
    public void onTrackerInit(@NotNull Tracker tracker) {
        Tracker tracker2 = this.tracker;
        if (tracker2 != null) {
            if (tracker2 != null) {
                tracker2.destroy();
            }
            this.tracker = null;
        }
        this.tracker = tracker;
    }

    public final void reportDownloadBlockStatus(@NotNull String str, boolean z6) {
        Tracker tracker = this.tracker;
        if (tracker != null) {
            P2PContext.launch$default(this.p2pContext, null, new NyaTracker$reportDownloadBlockStatus$1$1(z6, str, tracker, null), 1, null);
        }
    }

    @Nullable
    public final Object sendPeerCandidate(@NotNull String str, @NotNull String str2, @NotNull NyaPeer.IceCandidateData iceCandidateData, @NotNull Continuation<? super Tracker.TrackerMessage> continuation) {
        Tracker.TrackerMessage trackerMessage;
        Tracker tracker = this.tracker;
        if (tracker != null) {
            HashMap map = new HashMap();
            map.put(TencentLocation.EXTRA_DIRECTION, str2);
            map.put("cand", iceCandidateData);
            Object objSendPeerRequest = tracker.sendPeerRequest(str, "candidate", -1, map, continuation);
            if (objSendPeerRequest == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objSendPeerRequest;
            }
            trackerMessage = (Tracker.TrackerMessage) objSendPeerRequest;
        } else {
            trackerMessage = null;
        }
        return trackerMessage;
    }

    @Nullable
    public final Object sendPeerRequest(@NotNull String str, @NotNull String str2, @Nullable Object obj, @NotNull Continuation<? super Tracker.TrackerMessage> continuation) {
        Tracker tracker = this.tracker;
        if (tracker != null) {
            return tracker.sendPeerRequest(str, str2, 0, obj, continuation);
        }
        return null;
    }

    @Nullable
    public final Object sendPeerResponse(@NotNull String str, int i7, @NotNull String str2, @Nullable Object obj, @NotNull Continuation<? super Tracker.TrackerMessage> continuation) {
        Tracker tracker = this.tracker;
        if (tracker == null || tracker == null) {
            return null;
        }
        return tracker.sendPeerResponse(str, i7, str2, obj, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setNatType(@org.jetbrains.annotations.NotNull com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType r8, boolean r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.tracker.NyaTracker.setNatType(com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setSelfVisible(boolean r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.tracker.NyaTracker.setSelfVisible(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
