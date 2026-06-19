package com.bilibili.sistersplayer.p2p.peer;

import G.p;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Build;
import android.os.SystemClock;
import androidx.appcompat.widget.C3259x;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.content.ContextCompat;
import com.bilibili.bililive.mediastreaming.rtccore.nativec.BLiveRTCLoader;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.sistersplayer.p2p.P2PConfig;
import com.bilibili.sistersplayer.p2p.P2PContext;
import com.bilibili.sistersplayer.p2p.fragment.LiveFragment;
import com.bilibili.sistersplayer.p2p.fragment.LiveFragmentBlock;
import com.bilibili.sistersplayer.p2p.peer.DownloadAndStatResponse;
import com.bilibili.sistersplayer.p2p.peer.NyaPeer;
import com.bilibili.sistersplayer.p2p.peer.NyaPeerManager;
import com.bilibili.sistersplayer.p2p.stun.StunCheck;
import com.bilibili.sistersplayer.p2p.tracker.NyaTracker;
import com.bilibili.sistersplayer.p2p.tracker.Tracker;
import com.bilibili.sistersplayer.p2p.utils.ConditionalVariable;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import com.tencent.map.geolocation.TencentLocation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.webrtc.Logging;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager.class */
public final class NyaPeerManager implements NyaPeer.MessageHandler, NyaPeer.RelayChannel {
    public static final int ADAPTER_TYPE_ANY = 32;
    public static final int ADAPTER_TYPE_CELLULAR = 4;
    public static final int ADAPTER_TYPE_ETHERNET = 1;
    public static final int ADAPTER_TYPE_LOOPBACK = 16;
    public static final int ADAPTER_TYPE_UNKNOWN = 0;
    public static final int ADAPTER_TYPE_VPN = 8;
    public static final int ADAPTER_TYPE_WIFI = 2;

    @NotNull
    public static final String TAG = "RTCPeerManager";
    private static boolean inited;

    @Nullable
    private Context appContext;

    @NotNull
    private final P2PConfig config;

    @NotNull
    private final ConditionalVariable connectCV;

    @NotNull
    private final Mutex connectMutex;

    @Nullable
    private Job connectPeerJob;

    @NotNull
    private final HashMap<String, NyaPeer> connectedPeers;

    @NotNull
    private final Set<Integer> curSliceIds;

    @NotNull
    private final HashMap<String, NyaPeer> incomingPeers;

    @NotNull
    private String interfaceName;

    @NotNull
    private final P2PLogger logger;

    @Nullable
    private volatile NyaTracker nyaTracker;

    @NotNull
    private final HashMap<String, NyaPeer> outcomingPeers;

    @NotNull
    private final P2PContext p2pContext;

    @NotNull
    private final P2pFieldTrial p2pFieldTrial;

    @NotNull
    private AtomicReference<PeerConnectionFactory> sFactory;

    @Nullable
    private String trackerSourceParam;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static Object initLock = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$beginConnectPeers$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$beginConnectPeers$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        long J$0;
        Object L$0;
        int label;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NyaPeerManager nyaPeerManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = nyaPeerManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(NyaPeerManager nyaPeerManager) {
            boolean z6 = true;
            if (nyaPeerManager.getNyaTracker() != null) {
                Job job = nyaPeerManager.connectPeerJob;
                z6 = true;
                if (job != null) {
                    z6 = true;
                    if (job.isActive()) {
                        NyaTracker nyaTracker = nyaPeerManager.getNyaTracker();
                        z6 = nyaTracker != null && nyaTracker.getVisibilityState();
                    }
                }
            }
            return z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x03be  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x03f4 A[PHI: r13
  0x03f4: PHI (r13v0 long) = (r13v1 long), (r13v2 long) binds: [B:149:0x03f4, B:35:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0416  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x03f4 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0413 -> B:22:0x0070). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0428 -> B:22:0x0070). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0105 -> B:22:0x0070). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x012f -> B:22:0x0070). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 1077
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$checkVisibilityStateNeedChange$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$checkVisibilityStateNeedChange$1.class */
    public static final class C64951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64951(NyaPeerManager nyaPeerManager, Continuation<? super C64951> continuation) {
            super(2, continuation);
            this.this$0 = nyaPeerManager;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64951(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            NyaTracker nyaTracker;
            NyaTracker nyaTracker2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.this$0.connectedPeers.size() < this.this$0.p2pContext.getSistersConfiguration().connectedLimit;
                boolean z7 = this.this$0.connectedPeers.size() <= this.this$0.p2pContext.getSistersConfiguration().revisibleMark;
                if (this.this$0.getNyaTracker() != null) {
                    if (z6 && z7 && (nyaTracker2 = this.this$0.getNyaTracker()) != null && !nyaTracker2.getVisibilityState()) {
                        P2PLogger.logI$default(this.this$0.logger, NyaPeerManager.TAG, "Misaka will visible.", null, 4, null);
                        NyaTracker nyaTracker3 = this.this$0.getNyaTracker();
                        if (nyaTracker3 != null) {
                            this.label = 1;
                            Object selfVisible = nyaTracker3.setSelfVisible(true, this);
                            obj = selfVisible;
                            if (selfVisible == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (!z6 && !z7 && (nyaTracker = this.this$0.getNyaTracker()) != null && nyaTracker.getVisibilityState()) {
                        P2PLogger.logI$default(this.this$0.logger, NyaPeerManager.TAG, "Misaka will invisible.", null, 4, null);
                        NyaTracker nyaTracker4 = this.this$0.getNyaTracker();
                        if (nyaTracker4 != null) {
                            this.label = 2;
                            Object selfVisible2 = nyaTracker4.setSelfVisible(false, this);
                            obj = selfVisible2;
                            if (selfVisible2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                }
            } else if (i7 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$closePeer$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$closePeer$1.class */
    public static final class C64961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $peerId;
        int label;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64961(NyaPeerManager nyaPeerManager, String str, Continuation<? super C64961> continuation) {
            super(2, continuation);
            this.this$0 = nyaPeerManager;
            this.$peerId = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64961(this.this$0, this.$peerId, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NyaPeer nyaPeer = (NyaPeer) this.this$0.connectedPeers.remove(this.$peerId);
            if (nyaPeer != null) {
                nyaPeer.destroy();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$createConnectPeerTask$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$createConnectPeerTask$1.class */
    public static final class C64971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final NyaPeerExtData $extUserData;
        private Object L$0;
        int label;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64971(NyaPeerManager nyaPeerManager, NyaPeerExtData nyaPeerExtData, Continuation<? super C64971> continuation) {
            super(2, continuation);
            this.this$0 = nyaPeerManager;
            this.$extUserData = nyaPeerExtData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$6(NyaPeerManager nyaPeerManager, CoroutineScope coroutineScope, NyaPeerExtData nyaPeerExtData) {
            Job job = nyaPeerManager.connectPeerJob;
            if (job != null && !job.isActive()) {
                CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
                Mutex.DefaultImpls.unlock$default(nyaPeerManager.connectMutex, (Object) null, 1, (Object) null);
            }
            if (nyaPeerManager.outcomingPeers.size() >= nyaPeerManager.p2pContext.getSistersConfiguration().outConnectingLimit && ((nyaPeerManager.p2pContext.getSistersConfiguration().connectedLimit - nyaPeerManager.connectedPeers.size()) - nyaPeerManager.outcomingPeers.size()) - nyaPeerManager.incomingPeers.size() <= 0) {
                return false;
            }
            if (nyaPeerExtData.getPeerRole() == PeerRole.SEEDBOX) {
                Iterator<T> it = nyaPeerExtData.getSeedSliceIds().iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    Collection collectionValues = nyaPeerManager.outcomingPeers.values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collectionValues) {
                        NyaPeer nyaPeer = (NyaPeer) obj;
                        if (nyaPeer.getExtUserData().getPeerRole() == PeerRole.SEEDBOX && nyaPeer.getExtUserData().getSeedSliceIds().contains(Integer.valueOf(iIntValue))) {
                            arrayList.add(obj);
                        }
                    }
                    int size = arrayList.size();
                    List<NyaPeer> connectedPeers = nyaPeerManager.getConnectedPeers();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : connectedPeers) {
                        NyaPeer nyaPeer2 = (NyaPeer) obj2;
                        if (nyaPeer2.getExtUserData().getPeerRole() == PeerRole.SEEDBOX && nyaPeer2.getExtUserData().getSeedSliceIds().contains(Integer.valueOf(iIntValue))) {
                            arrayList2.add(obj2);
                        }
                    }
                    if ((nyaPeerManager.p2pContext.getSistersConfiguration().seedboxConnectNumBySliceId - arrayList2.size()) - size > 0) {
                        return true;
                    }
                }
                Iterator<T> it2 = nyaPeerExtData.getSeedSliceIds().iterator();
                boolean z6 = false;
                while (it2.hasNext()) {
                    if (nyaPeerManager.getSeedboxNeedConnectNum(((Number) it2.next()).intValue()) > 0) {
                        z6 = true;
                    }
                }
                if (!z6) {
                    CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
                    Mutex.DefaultImpls.unlock$default(nyaPeerManager.connectMutex, (Object) null, 1, (Object) null);
                }
            }
            if (nyaPeerExtData.getPeerRole() == PeerRole.LEECH) {
                List<NyaPeer> connectedPeers2 = nyaPeerManager.getConnectedPeers();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : connectedPeers2) {
                    if (((NyaPeer) obj3).getExtUserData().getPeerRole() == PeerRole.LEECH) {
                        arrayList3.add(obj3);
                    }
                }
                int size2 = arrayList3.size();
                int i7 = nyaPeerManager.p2pContext.getSistersConfiguration().leechConnectNum;
                if (size2 >= i7) {
                    CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
                    Mutex.DefaultImpls.unlock$default(nyaPeerManager.connectMutex, (Object) null, 1, (Object) null);
                }
                Collection collectionValues2 = nyaPeerManager.outcomingPeers.values();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : collectionValues2) {
                    if (((NyaPeer) obj4).getExtUserData().getPeerRole() == PeerRole.LEECH) {
                        arrayList4.add(obj4);
                    }
                }
                if (arrayList4.size() < i7) {
                    return true;
                }
            }
            return nyaPeerExtData.getPeerRole() == PeerRole.PEER;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C64971 c64971 = new C64971(this.this$0, this.$extUserData, continuation);
            c64971.L$0 = obj;
            return c64971;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                Mutex mutex = this.this$0.connectMutex;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (Mutex.DefaultImpls.lock$default(mutex, (Object) null, this, 1, (Object) null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.connect(this.$extUserData);
                    Mutex.DefaultImpls.unlock$default(this.this$0.connectMutex, (Object) null, 1, (Object) null);
                    return Unit.INSTANCE;
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
            }
            ConditionalVariable conditionalVariable = this.this$0.connectCV;
            Mutex mutex2 = this.this$0.connectMutex;
            final NyaPeerManager nyaPeerManager = this.this$0;
            final CoroutineScope coroutineScope3 = coroutineScope;
            final NyaPeerExtData nyaPeerExtData = this.$extUserData;
            Function0<Boolean> function0 = new Function0(nyaPeerManager, coroutineScope3, nyaPeerExtData) { // from class: com.bilibili.sistersplayer.p2p.peer.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NyaPeerManager f104964a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CoroutineScope f104965b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final NyaPeerExtData f104966c;

                {
                    this.f104964a = nyaPeerManager;
                    this.f104965b = coroutineScope3;
                    this.f104966c = nyaPeerExtData;
                }

                public final Object invoke() {
                    return Boolean.valueOf(NyaPeerManager.C64971.invokeSuspend$lambda$6(this.f104964a, this.f104965b, this.f104966c));
                }
            };
            this.L$0 = null;
            this.label = 2;
            if (conditionalVariable.waitUntil(mutex2, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.this$0.connect(this.$extUserData);
            Mutex.DefaultImpls.unlock$default(this.this$0.connectMutex, (Object) null, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$notifyVisibilityStateChanged$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$notifyVisibilityStateChanged$1.class */
    public static final class C64991 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64991(NyaPeerManager nyaPeerManager, Continuation<? super C64991> continuation) {
            super(continuation);
            this.this$0 = nyaPeerManager;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.notifyVisibilityStateChanged(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$onPeerConnectComplete$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$onPeerConnectComplete$1.class */
    public static final class C65001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $isConnected;
        final NyaPeer $peer;
        int label;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65001(NyaPeer nyaPeer, NyaPeerManager nyaPeerManager, boolean z6, Continuation<? super C65001> continuation) {
            super(2, continuation);
            this.$peer = nyaPeer;
            this.this$0 = nyaPeerManager;
            this.$isConnected = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C65001(this.$peer, this.this$0, this.$isConnected, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            NyaPeerExtData extUserData;
            Job connectionTimeoutJob;
            NyaPeer nyaPeer;
            NyaPeerExtData extUserData2;
            Job connectionTimeoutJob2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String peerId = this.$peer.getExtUserData().getPeerId();
            HashMap map = this.$peer.getExtUserData().getIncoming() ? this.this$0.incomingPeers : this.this$0.outcomingPeers;
            NyaPeer nyaPeer2 = (NyaPeer) map.get(peerId);
            if (nyaPeer2 != null && (extUserData = nyaPeer2.getExtUserData()) != null && (connectionTimeoutJob = extUserData.getConnectionTimeoutJob()) != null && connectionTimeoutJob.isActive() && (nyaPeer = (NyaPeer) map.get(peerId)) != null && (extUserData2 = nyaPeer.getExtUserData()) != null && (connectionTimeoutJob2 = extUserData2.getConnectionTimeoutJob()) != null) {
                Job.DefaultImpls.cancel$default(connectionTimeoutJob2, (CancellationException) null, 1, (Object) null);
            }
            if (!this.$isConnected) {
                NyaPeer nyaPeer3 = (NyaPeer) this.this$0.connectedPeers.remove(peerId);
                if (nyaPeer3 != null) {
                    nyaPeer3.destroy();
                }
                this.$peer.destroy();
            } else if (((NyaPeer) this.this$0.connectedPeers.get(peerId)) == null) {
                this.this$0.connectedPeers.put(peerId, this.$peer);
            } else {
                this.$peer.destroy();
            }
            this.this$0.checkVisibilityStateNeedChange();
            this.this$0.connectCV.notifyWhole();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$onPeerRelayMessage$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$onPeerRelayMessage$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Tracker.TrackerMessage $msg;
        int label;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NyaPeerManager nyaPeerManager, Tracker.TrackerMessage trackerMessage, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = nyaPeerManager;
            this.$msg = trackerMessage;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$msg, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                NyaTracker nyaTracker = this.this$0.getNyaTracker();
                if (nyaTracker != null) {
                    String from = this.$msg.getFrom();
                    int iIntValue = this.$msg.getRequestId().intValue();
                    this.label = 1;
                    Object objSendPeerResponse$default = NyaTracker.sendPeerResponse$default(nyaTracker, from, iIntValue, "refused", null, this, 8, null);
                    obj = objSendPeerResponse$default;
                    if (objSendPeerResponse$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$onPeerRelayMessage$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$onPeerRelayMessage$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Tracker.TrackerMessage $msg;
        int label;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(NyaPeerManager nyaPeerManager, Tracker.TrackerMessage trackerMessage, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = nyaPeerManager;
            this.$msg = trackerMessage;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$msg, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                NyaTracker nyaTracker = this.this$0.getNyaTracker();
                if (nyaTracker != null) {
                    String from = this.$msg.getFrom();
                    int iIntValue = this.$msg.getRequestId().intValue();
                    this.label = 1;
                    Object objSendPeerResponse$default = NyaTracker.sendPeerResponse$default(nyaTracker, from, iIntValue, "protocol_incompatible", null, this, 8, null);
                    obj = objSendPeerResponse$default;
                    if (objSendPeerResponse$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$onPeerRelayMessage$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$onPeerRelayMessage$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Tracker.TrackerMessage $msg;
        int label;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(NyaPeerManager nyaPeerManager, Tracker.TrackerMessage trackerMessage, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = nyaPeerManager;
            this.$msg = trackerMessage;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$msg, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                NyaTracker nyaTracker = this.this$0.getNyaTracker();
                if (nyaTracker != null) {
                    String from = this.$msg.getFrom();
                    int iIntValue = this.$msg.getRequestId().intValue();
                    this.label = 1;
                    Object objSendPeerResponse$default = NyaTracker.sendPeerResponse$default(nyaTracker, from, iIntValue, "not_implemented", null, this, 8, null);
                    obj = objSendPeerResponse$default;
                    if (objSendPeerResponse$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$reconnectTracker$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$reconnectTracker$1.class */
    public static final class C65011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65011(NyaPeerManager nyaPeerManager, Continuation<? super C65011> continuation) {
            super(2, continuation);
            this.this$0 = nyaPeerManager;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C65011(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.this$0.getNyaTracker() != null) {
                P2PLogger.logI$default(this.this$0.logger, NyaPeerManager.TAG, "Misaka will reconnect to the Last Order. (Service Redirect)", null, 4, null);
                NyaTracker nyaTracker = this.this$0.getNyaTracker();
                if (nyaTracker != null) {
                    nyaTracker.destroy();
                }
                this.this$0.setNyaTracker(null);
            }
            String str = this.this$0.trackerSourceParam;
            if (str != null) {
                NyaPeerManager nyaPeerManager = this.this$0;
                nyaPeerManager.setNyaTracker(NyaTracker.Companion.connect(nyaPeerManager.p2pContext, str, nyaPeerManager, nyaPeerManager.logger));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$sendCandidate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$sendCandidate$1.class */
    public static final class C65021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final NyaPeer.IceCandidateData $cand;
        final NyaPeer $sender;
        int label;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65021(NyaPeerManager nyaPeerManager, NyaPeer nyaPeer, NyaPeer.IceCandidateData iceCandidateData, Continuation<? super C65021> continuation) {
            super(2, continuation);
            this.this$0 = nyaPeerManager;
            this.$sender = nyaPeer;
            this.$cand = iceCandidateData;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C65021(this.this$0, this.$sender, this.$cand, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                NyaTracker nyaTracker = this.this$0.getNyaTracker();
                if (nyaTracker != null) {
                    String peerId = this.$sender.getExtUserData().getPeerId();
                    String str = this.$sender.getExtUserData().getOfferRequestId() == null ? "offer" : "answer";
                    NyaPeer.IceCandidateData iceCandidateData = this.$cand;
                    this.label = 1;
                    Object objSendPeerCandidate = nyaTracker.sendPeerCandidate(peerId, str, iceCandidateData, this);
                    obj = objSendPeerCandidate;
                    if (objSendPeerCandidate == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$sendSDP$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$sendSDP$1.class */
    public static final class C65031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $sdp;
        final NyaPeer $sender;
        Object L$0;
        Object L$1;
        int label;
        final NyaPeerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65031(NyaPeer nyaPeer, String str, NyaPeerManager nyaPeerManager, Continuation<? super C65031> continuation) {
            super(2, continuation);
            this.$sender = nyaPeer;
            this.$sdp = str;
            this.this$0 = nyaPeerManager;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C65031(this.$sender, this.$sdp, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x017b A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x020e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 786
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager.C65031.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public NyaPeerManager(@NotNull P2PContext p2PContext, @Nullable Context context, @NotNull P2PConfig p2PConfig, @NotNull P2PLogger p2PLogger) {
        this.p2pContext = p2PContext;
        this.appContext = context;
        this.config = p2PConfig;
        this.logger = p2PLogger;
        this.connectedPeers = new HashMap<>();
        this.incomingPeers = new HashMap<>();
        this.outcomingPeers = new HashMap<>();
        this.curSliceIds = new LinkedHashSet();
        this.sFactory = new AtomicReference<>();
        this.connectMutex = MutexKt.Mutex$default(false, 1, (Object) null);
        this.connectCV = new ConditionalVariable();
        this.interfaceName = "";
        P2pFieldTrial p2pFieldTrial = new P2pFieldTrial(p2PLogger);
        p2pFieldTrial.setTrials("WebRTC-RtcEventLogKillSwitch", "Enabled");
        p2pFieldTrial.setTrials("Fake-BILI-WebRTC-NO-CALL", "Enabled");
        this.p2pFieldTrial = p2pFieldTrial;
        P2PLogger.logI$default(p2PLogger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> RTCPeerManager init "), null, 4, null);
    }

    public /* synthetic */ NyaPeerManager(P2PContext p2PContext, Context context, P2PConfig p2PConfig, P2PLogger p2PLogger, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(p2PContext, (i7 & 2) != 0 ? null : context, p2PConfig, p2PLogger);
    }

    @Invocation(category = InvocationCategory.INVOKE_STATIC, name = "checkSelfPermission", owner = {"androidx.core.content.ContextCompat"}, scope = {})
    private static int __Ghost$Insertion$com_bilibili_infra_base_aop_StoragePermissionHook_checkSelfPermission(Context context, String str) {
        String str2 = str;
        if (Build.VERSION.SDK_INT >= 33) {
            if ("android.permission.READ_EXTERNAL_STORAGE".equals(str)) {
                str2 = "android.permission.READ_MEDIA_IMAGES";
            } else {
                str2 = str;
                if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) {
                    return 0;
                }
            }
        }
        return ContextCompat.checkSelfPermission(context, str2);
    }

    private final void accept(NyaPeerExtData nyaPeerExtData, String str) {
        NyaPeer nyaPeerCreateNyaPeer = createNyaPeer(getConnectObserver(), this, nyaPeerExtData);
        if (nyaPeerCreateNyaPeer != null) {
            this.incomingPeers.put(nyaPeerExtData.getPeerId(), nyaPeerCreateNyaPeer);
            nyaPeerCreateNyaPeer.createAnswer(str, this);
            if (this.p2pContext.isDestroyed()) {
                nyaPeerCreateNyaPeer.destroy();
            } else {
                nyaPeerExtData.setConnectionTimeoutJob(P2PContext.launch$default(this.p2pContext, null, new NyaPeerManager$accept$1$1(this, nyaPeerCreateNyaPeer, nyaPeerCreateNyaPeer, null), 1, null));
            }
        }
        if (nyaPeerCreateNyaPeer == null) {
            P2PLogger.logI$default(this.logger, TAG, android.support.v4.media.a.a("createNyaPeer fail, ", nyaPeerExtData.getPeerId(), " is null"), null, 4, null);
        }
    }

    private final boolean allowedInconnectNewPeer() {
        boolean z6 = this.incomingPeers.size() < this.p2pContext.getSistersConfiguration().inConnectingLimit;
        boolean z7 = this.connectedPeers.size() < this.p2pContext.getSistersConfiguration().connectedLimit;
        boolean z8 = false;
        if (z6) {
            z8 = false;
            if (z7) {
                z8 = true;
            }
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkVisibilityStateNeedChange() {
        if (this.nyaTracker == null) {
            return;
        }
        P2PContext.launch$default(this.p2pContext, null, new C64951(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean connect(NyaPeerExtData nyaPeerExtData) {
        String peerId = nyaPeerExtData.getPeerId();
        Job job = this.connectPeerJob;
        if (job != null && !job.isActive()) {
            return false;
        }
        if (this.p2pContext.getGhostPeerIds().contains(peerId)) {
            P2PLogger.logI$default(this.logger, TAG, C4496a.a("has a ghost peerId: ", peerId), null, 4, null);
            return false;
        }
        if (this.outcomingPeers.containsKey(peerId) || this.connectedPeers.containsKey(peerId) || Intrinsics.areEqual(peerId, this.p2pContext.getCurPeerId())) {
            return false;
        }
        NyaPeer nyaPeerCreateNyaPeer = createNyaPeer(getConnectObserver(), this, nyaPeerExtData);
        if (nyaPeerCreateNyaPeer == null) {
            P2PLogger.logI$default(this.logger, TAG, android.support.v4.media.a.a("createNyaPeer fail, peer:", peerId, " is null"), null, 4, null);
            return false;
        }
        this.outcomingPeers.put(peerId, nyaPeerCreateNyaPeer);
        nyaPeerCreateNyaPeer.createOffer(this);
        if (this.p2pContext.isDestroyed()) {
            nyaPeerCreateNyaPeer.destroy();
            return false;
        }
        nyaPeerExtData.setConnectionTimeoutJob(P2PContext.launch$default(this.p2pContext, null, new NyaPeerManager$connect$1$1(this, nyaPeerCreateNyaPeer, nyaPeerCreateNyaPeer, null), 1, null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job createConnectPeerTask(NyaPeerExtData nyaPeerExtData) {
        return this.p2pContext.launch(CoroutineStart.LAZY, new C64971(this, nyaPeerExtData, null));
    }

    private final NyaPeer createNyaPeer(NyaPeer.Observer observer, NyaPeer.MessageHandler messageHandler, NyaPeerExtData nyaPeerExtData) {
        NyaPeer nyaPeer;
        try {
            String interfaceName = getInterfaceName();
            P2PLogger.logI$default(this.logger, TAG, "createNyaPeer cacheInterface: " + this.interfaceName + " current: " + interfaceName + " peer:" + nyaPeerExtData + " " + hashCode(), null, 4, null);
            if (this.config.getCheckInterfaceNameChange() && this.interfaceName.length() > 0 && interfaceName.length() > 0 && !Intrinsics.areEqual(interfaceName, this.interfaceName)) {
                P2PLogger.logW$default(this.logger, TAG, "interfaceName changed, reload RTCFactory", null, 4, null);
            }
            this.interfaceName = interfaceName;
            if (this.sFactory.get() == null) {
                if (this.appContext == null) {
                    P2PLogger.logE$default(this.logger, TAG, "appCtx is null", null, 4, null);
                    return null;
                }
                synchronized (initLock) {
                    if (this.interfaceName.length() <= 0 || !this.config.getRtcKeepMainNetwork()) {
                        this.p2pFieldTrial.setTrials("BILI-Keep-Active-Network", "");
                    } else {
                        this.p2pFieldTrial.setTrials("BILI-Keep-Active-Network", this.interfaceName);
                    }
                    PeerConnectionFactory.InitializationOptions.Builder nativeLibraryName = PeerConnectionFactory.InitializationOptions.builder(this.appContext).setEnableInternalTracer(false).setInjectableLogger(new d(), Logging.Severity.LS_INFO).setNativeLibraryLoader(new BLiveRTCLoader()).setNativeLibraryName("bilirtclibrary");
                    if (!this.config.getDisableGlobalField()) {
                        nativeLibraryName.setFieldTrials(this.p2pFieldTrial.toRTCTrials());
                    }
                    PeerConnectionFactory.initialize(nativeLibraryName.createInitializationOptions());
                    Unit unit = Unit.INSTANCE;
                }
                PeerConnectionFactory.Builder builder = PeerConnectionFactory.builder();
                PeerConnectionFactory.Options options = new PeerConnectionFactory.Options();
                options.disableNetworkMonitor = true;
                options.networkIgnoreMask = 16;
                PeerConnectionFactory.Builder options2 = builder.setOptions(options);
                if (this.config.getDisableGlobalField()) {
                    options2.setFieldTrialInterface(this.p2pFieldTrial);
                }
                PeerConnectionFactory peerConnectionFactoryCreatePeerConnectionFactory = options2.createPeerConnectionFactory();
                if (peerConnectionFactoryCreatePeerConnectionFactory != null) {
                    this.sFactory.set(peerConnectionFactoryCreatePeerConnectionFactory);
                }
            }
            if (this.sFactory.get() == null) {
                P2PLogger.logI$default(this.logger, TAG, "PeerConnectionFactory is still null", null, 4, null);
                return null;
            }
            PeerConnectionFactory peerConnectionFactory = this.sFactory.get();
            if (peerConnectionFactory == null) {
                return null;
            }
            NyaPeer nyaPeer2 = new NyaPeer(this.p2pContext, observer, messageHandler, nyaPeerExtData);
            PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(CollectionsKt.arrayListOf(new PeerConnection.IceServer[]{PeerConnection.IceServer.builder(this.p2pContext.getSistersConfiguration().stunServers).createIceServer()}));
            rTCConfiguration.iceCandidatePoolSize = this.p2pContext.getSistersConfiguration().iceCandidatePoolSize;
            rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.ALL;
            rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.DISABLED;
            rTCConfiguration.candidateNetworkPolicy = PeerConnection.CandidateNetworkPolicy.LOW_COST;
            rTCConfiguration.maxIPv6Networks = 1;
            nyaPeer2.setPeerConnection$bilirtc_release(peerConnectionFactory.createPeerConnection(rTCConfiguration, nyaPeer2));
            if (nyaPeer2.getPeerConnection$bilirtc_release() == null) {
                P2PLogger.logI$default(this.logger, TAG, "[LiveP2PProblem][p2p_error=create_peer] " + nyaPeerExtData.getPeerId() + " create peerConnection fail", null, 4, null);
                nyaPeer = null;
            } else {
                nyaPeer = nyaPeer2;
            }
            return nyaPeer;
        } catch (Exception e7) {
            this.logger.logE(TAG, android.support.v4.media.a.a("[LiveP2PProblem][p2p_error=create_peer] ", nyaPeerExtData.getPeerId(), " has an exception"), e7);
            return null;
        }
    }

    private final NyaPeer.Observer getConnectObserver() {
        return new NyaPeer.Observer(this) { // from class: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager.getConnectObserver.1
            final NyaPeerManager this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.sistersplayer.p2p.peer.NyaPeer.Observer
            public void connected(NyaPeer nyaPeer) {
                this.this$0.onPeerConnectComplete(nyaPeer, true);
            }

            @Override // com.bilibili.sistersplayer.p2p.peer.NyaPeer.Observer
            public void disconnected(NyaPeer nyaPeer) {
                this.this$0.onPeerConnectComplete(nyaPeer, false);
            }
        };
    }

    private final String getInterfaceName() {
        Context context = this.appContext;
        if (context == null) {
            return "";
        }
        String interfaceName = "";
        if (__Ghost$Insertion$com_bilibili_infra_base_aop_StoragePermissionHook_checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            Context context2 = this.appContext;
            ConnectivityManager connectivityManager = (ConnectivityManager) (context2 != null ? context2.getSystemService("connectivity") : null);
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return "";
            }
            LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
            P2PLogger.logD$default(this.logger, TAG, "getInterfaceName linkProperties:" + linkProperties, null, 4, null);
            interfaceName = "";
            if (linkProperties != null) {
                interfaceName = linkProperties.getInterfaceName();
                if (interfaceName == null) {
                    interfaceName = "";
                }
            }
        }
        return interfaceName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getLeechNeedConnectNum() {
        int i7 = this.p2pContext.getSistersConfiguration().leechConnectNum;
        List<NyaPeer> connectedPeers = getConnectedPeers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : connectedPeers) {
            if (((NyaPeer) obj).getExtUserData().getPeerRole() == PeerRole.LEECH) {
                arrayList.add(obj);
            }
        }
        return i7 - arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSeedboxNeedConnectNum(int i7) {
        List<NyaPeer> connectedPeers = getConnectedPeers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : connectedPeers) {
            NyaPeer nyaPeer = (NyaPeer) obj;
            if (nyaPeer.getExtUserData().getPeerRole() == PeerRole.SEEDBOX && nyaPeer.getExtUserData().getSeedSliceIds().contains(Integer.valueOf(i7))) {
                arrayList.add(obj);
            }
        }
        return Math.max(0, this.p2pContext.getSistersConfiguration().seedboxConnectNumBySliceId - arrayList.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePeerMessage$lambda$11(long j7, NyaPeerManager nyaPeerManager, LiveFragment liveFragment, Integer num, int i7, Ref.ObjectRef objectRef, NyaPeer nyaPeer, byte[] bArr) {
        if (bArr != null && SystemClock.uptimeMillis() - j7 <= nyaPeerManager.p2pContext.getSistersConfiguration().uploadMaxWaitTimeoutMs) {
            nyaPeerManager.p2pContext.getP2pDataCollection().addP2PSendSizeRealtime(bArr.length);
            DownloadAndStatResponse downloadAndStatResponse = new DownloadAndStatResponse();
            downloadAndStatResponse.setRequestId(i7);
            downloadAndStatResponse.setStatus("ok");
            DownloadAndStatResponse.Data data = new DownloadAndStatResponse.Data();
            data.setBlock(bArr);
            Object obj = objectRef.element;
            Iterable iterable = (Iterable) obj;
            byte[] bArr2 = new byte[((List) obj).size()];
            int i8 = 0;
            for (Object obj2 : iterable) {
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                bArr2[i8] = (byte) ((Number) obj2).intValue();
                i8++;
            }
            data.setDistances(bArr2);
            downloadAndStatResponse.setData(data);
            nyaPeer.send(downloadAndStatResponse);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPeerConnectComplete(NyaPeer nyaPeer, boolean z6) {
        P2PContext.launch$default(this.p2pContext, null, new C65001(nyaPeer, this, z6, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parsePeerRole(NyaPeerExtData nyaPeerExtData, Map<String, ? extends Object> map) {
        String str = (String) (map != null ? map.get("type") : null);
        Object obj = null;
        if (map != null) {
            obj = map.get("sliceProvider");
        }
        List list = (List) obj;
        if (map == null || str == null) {
            return;
        }
        if (Intrinsics.areEqual(str, "leech")) {
            nyaPeerExtData.setPeerRole(PeerRole.LEECH);
            return;
        }
        if (Intrinsics.areEqual(str, "seed") && list != null) {
            List list2 = list;
            if (!list2.isEmpty()) {
                nyaPeerExtData.setPeerRole(PeerRole.SEEDBOX);
                nyaPeerExtData.getSeedSliceIds().addAll(list2);
                return;
            }
        }
        if (Intrinsics.areEqual(str, KE0.b.f12724c)) {
            nyaPeerExtData.setPeerRole(PeerRole.PEER);
        } else {
            nyaPeerExtData.setPeerRole(PeerRole.PEER);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void parsePeerRole$default(NyaPeerManager nyaPeerManager, NyaPeerExtData nyaPeerExtData, Map map, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            map = null;
        }
        nyaPeerManager.parsePeerRole(nyaPeerExtData, map);
    }

    public final void addSliceId(int i7) {
        this.curSliceIds.add(Integer.valueOf(i7));
    }

    public final void beginConnectPeers() {
        if (this.connectPeerJob != null) {
            return;
        }
        this.connectPeerJob = P2PContext.launch$default(this.p2pContext, null, new AnonymousClass1(this, null), 1, null);
    }

    public final void closePeer(@NotNull String str) {
        P2PContext.launch$default(this.p2pContext, null, new C64961(this, str, null), 1, null);
    }

    public final void connectTracker(@NotNull String str) {
        this.trackerSourceParam = str;
        P2PLogger p2PLogger = this.logger;
        int iHashCode = hashCode();
        NyaTracker nyaTracker = this.nyaTracker;
        P2PLogger.logI$default(p2PLogger, TAG, G.f.a(iHashCode, nyaTracker != null ? nyaTracker.hashCode() : 0, "P2PLifeCycle-> RTCPeerManager connectTracker ", " nyaTracker "), null, 4, null);
        this.nyaTracker = NyaTracker.Companion.connect(this.p2pContext, str, this, this.logger);
    }

    public final void destroy() {
        Job job;
        P2PLogger.logI$default(this.logger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> RTCPeerManager destory "), null, 4, null);
        NyaTracker nyaTracker = this.nyaTracker;
        if (nyaTracker != null) {
            nyaTracker.destroy();
        }
        this.nyaTracker = null;
        Job job2 = this.connectPeerJob;
        if (job2 != null && job2.isActive() && (job = this.connectPeerJob) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.connectPeerJob = null;
        Iterator<T> it = this.connectedPeers.values().iterator();
        while (it.hasNext()) {
            ((NyaPeer) it.next()).destroy();
        }
        this.connectedPeers.clear();
        Iterator<T> it2 = this.incomingPeers.values().iterator();
        while (it2.hasNext()) {
            ((NyaPeer) it2.next()).destroy();
        }
        this.incomingPeers.clear();
        Iterator<T> it3 = this.outcomingPeers.values().iterator();
        while (it3.hasNext()) {
            ((NyaPeer) it3.next()).destroy();
        }
        this.outcomingPeers.clear();
        PeerConnectionFactory peerConnectionFactory = this.sFactory.get();
        if (peerConnectionFactory != null) {
            peerConnectionFactory.dispose();
        }
        this.sFactory.set(null);
        this.appContext = null;
    }

    @NotNull
    public final List<NyaPeer> getConnectedPeers() {
        return CollectionsKt.toList(this.connectedPeers.values());
    }

    @NotNull
    public final List<NyaPeer> getInComingPeers() {
        return CollectionsKt.toList(this.incomingPeers.values());
    }

    @Nullable
    public final NyaTracker getNyaTracker() {
        return this.nyaTracker;
    }

    @NotNull
    public final List<NyaPeer> getOutcomingPeers() {
        return CollectionsKt.toList(this.outcomingPeers.values());
    }

    @NotNull
    public final Set<Integer> getSliceIds() {
        return this.curSliceIds;
    }

    @Override // com.bilibili.sistersplayer.p2p.peer.NyaPeer.MessageHandler
    public boolean handlePeerMessage(@NotNull final NyaPeer nyaPeer, @NotNull MsgQuery msgQuery) {
        if (!Intrinsics.areEqual(msgQuery.get("type").getString(), "request") || !Intrinsics.areEqual(msgQuery.get("action").getString(), "downloadAndStat") || this.p2pContext.getPeerRole() == PeerRole.LEECH) {
            return false;
        }
        String string = msgQuery.get("data").get("frag").getString();
        Integer num = msgQuery.get("requestId").getInt();
        int iIntValue = num != null ? num.intValue() : -1;
        final Integer num2 = msgQuery.get("data").get("blockId").getInt();
        final LiveFragment fragment = this.p2pContext.getFragMan().getFragment(string);
        LiveFragmentBlock block = fragment != null ? fragment.getBlock(num2) : null;
        if (fragment == null) {
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setRequestId(iIntValue);
            errorResponse.setStatus("not_found");
            nyaPeer.send(errorResponse);
            return false;
        }
        if (num2 == null || (num2.intValue() >= 0 && block == null)) {
            ErrorResponse errorResponse2 = new ErrorResponse();
            errorResponse2.setRequestId(iIntValue);
            errorResponse2.setStatus("not_found");
            nyaPeer.send(errorResponse2);
            return false;
        }
        if (!fragment.canShare()) {
            ErrorResponse errorResponse3 = new ErrorResponse();
            errorResponse3.setRequestId(iIntValue);
            errorResponse3.setStatus("overload");
            nyaPeer.send(errorResponse3);
            return false;
        }
        Boolean bool = msgQuery.get("data").get("nonblocking").getBoolean();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = fragment.getDistance();
        if (this.p2pContext.getSistersConfiguration().enableHideOwner) {
            int[] intArray = CollectionsKt.toIntArray((Collection) objectRef.element);
            ArrayList arrayList = new ArrayList(intArray.length);
            int length = intArray.length;
            int iA = 0;
            while (true) {
                int i7 = iA;
                if (i7 >= length) {
                    break;
                }
                iA = F1.b.a(intArray[i7] & SearchBangumiItem.TYPE_FULLNET_BANGUMI, arrayList, i7, 1);
            }
            objectRef.element = new ArrayList(arrayList);
        }
        if (block != null && (block.isSucceed() || (bool != null && !bool.booleanValue()))) {
            Pair<Integer, Integer> blockByteRange = fragment.getBlockByteRange(num2.intValue());
            fragment.addShareData(num2.intValue(), ((Number) blockByteRange.getSecond()).intValue() - ((Number) blockByteRange.getFirst()).intValue());
            final long jUptimeMillis = SystemClock.uptimeMillis();
            final int i8 = iIntValue;
            block.onDataResolved(new Function1(jUptimeMillis, this, fragment, num2, i8, objectRef, nyaPeer) { // from class: com.bilibili.sistersplayer.p2p.peer.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f104956a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final NyaPeerManager f104957b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final LiveFragment f104958c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Integer f104959d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f104960e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Ref.ObjectRef f104961f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final NyaPeer f104962g;

                {
                    this.f104956a = jUptimeMillis;
                    this.f104957b = this;
                    this.f104958c = fragment;
                    this.f104959d = num2;
                    this.f104960e = i8;
                    this.f104961f = objectRef;
                    this.f104962g = nyaPeer;
                }

                public final Object invoke(Object obj) {
                    LiveFragment liveFragment = this.f104958c;
                    Integer num3 = this.f104959d;
                    Ref.ObjectRef objectRef2 = this.f104961f;
                    return NyaPeerManager.handlePeerMessage$lambda$11(this.f104956a, this.f104957b, liveFragment, num3, this.f104960e, objectRef2, this.f104962g, (byte[]) obj);
                }
            });
            return false;
        }
        DownloadAndStatResponse downloadAndStatResponse = new DownloadAndStatResponse();
        downloadAndStatResponse.setRequestId(iIntValue);
        downloadAndStatResponse.setStatus("ok");
        DownloadAndStatResponse.Data data = new DownloadAndStatResponse.Data();
        data.setBlock(null);
        Object obj = objectRef.element;
        Iterable iterable = (Iterable) obj;
        byte[] bArr = new byte[((List) obj).size()];
        int i9 = 0;
        for (Object obj2 : iterable) {
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            bArr[i9] = (byte) ((Number) obj2).intValue();
            i9++;
        }
        data.setDistances(bArr);
        downloadAndStatResponse.setData(data);
        nyaPeer.send(downloadAndStatResponse);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object notifyVisibilityStateChanged(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.sistersplayer.p2p.peer.NyaPeerManager.C64991
            if (r0 == 0) goto L27
            r0 = r7
            com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$notifyVisibilityStateChanged$1 r0 = (com.bilibili.sistersplayer.p2p.peer.NyaPeerManager.C64991) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L27
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L31
        L27:
            com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$notifyVisibilityStateChanged$1 r0 = new com.bilibili.sistersplayer.p2p.peer.NyaPeerManager$notifyVisibilityStateChanged$1
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L31:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L64
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L59
            r0 = r7
            java.lang.Object r0 = r0.L$0
            com.bilibili.sistersplayer.p2p.peer.NyaPeerManager r0 = (com.bilibili.sistersplayer.p2p.peer.NyaPeerManager) r0
            r7 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L8a
        L59:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            kotlinx.coroutines.sync.Mutex r0 = r0.connectMutex
            r10 = r0
            r0 = r7
            r1 = r6
            r0.L$0 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = 0
            r2 = r7
            r3 = 1
            r4 = 0
            java.lang.Object r0 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r0, r1, r2, r3, r4)
            r1 = r9
            if (r0 != r1) goto L88
            r0 = r9
            return r0
        L88:
            r0 = r6
            r7 = r0
        L8a:
            r0 = r7
            com.bilibili.sistersplayer.p2p.utils.ConditionalVariable r0 = r0.connectCV
            r0.notifyWhole()
            r0 = r7
            kotlinx.coroutines.sync.Mutex r0 = r0.connectMutex
            r1 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r0, r1, r2, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.peer.NyaPeerManager.notifyVisibilityStateChanged(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void onPeerRelayMessage(@NotNull Tracker.TrackerMessage trackerMessage) {
        if (this.nyaTracker == null || trackerMessage.getFrom() == null || trackerMessage.getRequestId() == null) {
            return;
        }
        String action = trackerMessage.getAction();
        NyaPeer nyaPeer = null;
        if (!Intrinsics.areEqual(action, "connect")) {
            if (!Intrinsics.areEqual(action, "candidate")) {
                P2PContext.launch$default(this.p2pContext, null, new AnonymousClass4(this, trackerMessage, null), 1, null);
                return;
            }
            Map map = (Map) trackerMessage.getData();
            Map map2 = (Map) map.get("cand");
            Object obj = map.get(TencentLocation.EXTRA_DIRECTION);
            String from = trackerMessage.getFrom();
            if (from == null || from.length() == 0 || trackerMessage.getRequestId() == null) {
                P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][tracker=error_message] candidate msg data error, peerId is " + trackerMessage.getFrom() + ", requestId is " + trackerMessage.getRequestId(), null, 4, null);
            }
            if (Intrinsics.areEqual(obj, "offer")) {
                nyaPeer = this.incomingPeers.get(trackerMessage.getFrom());
            } else if (Intrinsics.areEqual(obj, "answer")) {
                nyaPeer = this.outcomingPeers.get(trackerMessage.getFrom());
            }
            if (map2 == null || map2.isEmpty() || nyaPeer == null) {
                return;
            }
            NyaPeer.IceCandidateData iceCandidateData = new NyaPeer.IceCandidateData((String) map2.get("candidate"), ((Integer) map2.get("sdpMLineIndex")).intValue(), (String) map2.get("sdpMid"));
            if (StringsKt.trim(iceCandidateData.getCandidate()).toString().length() == 0 || StringsKt.n(iceCandidateData.getCandidate(), ".local")) {
                return;
            }
            nyaPeer.addCandidate(iceCandidateData);
            return;
        }
        Map map3 = (Map) trackerMessage.getData();
        Integer num = (Integer) (map3 != null ? map3.get("protocol") : null);
        boolean z6 = false;
        int iIntValue = num != null ? num.intValue() : 0;
        Map map4 = (Map) trackerMessage.getData();
        Map map5 = (Map) (map4 != null ? map4.get("offer") : null);
        String str = (String) (map5 != null ? map5.get("sdp") : null);
        Map map6 = (Map) trackerMessage.getData();
        Map<String, ? extends Object> map7 = (Map) (map6 != null ? map6.get("role") : null);
        String from2 = trackerMessage.getFrom();
        if (from2 == null || from2.length() == 0 || trackerMessage.getRequestId() == null) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][tracker=error_message] connect msg data error, peerId is " + trackerMessage.getFrom() + ", requestId is " + trackerMessage.getRequestId(), null, 4, null);
            return;
        }
        NyaPeerExtData nyaPeerExtData = new NyaPeerExtData();
        parsePeerRole(nyaPeerExtData, map7);
        if (nyaPeerExtData.getPeerRole() == PeerRole.SEEDBOX) {
            Iterator<T> it = nyaPeerExtData.getSeedSliceIds().iterator();
            boolean z7 = false;
            while (it.hasNext()) {
                if (getSeedboxNeedConnectNum(((Number) it.next()).intValue()) > 0) {
                    z7 = true;
                }
            }
            z6 = !z7;
        }
        boolean z8 = z6;
        if (nyaPeerExtData.getPeerRole() == PeerRole.LEECH) {
            z8 = z6;
            if (getLeechNeedConnectNum() <= 0) {
                z8 = true;
            }
        }
        if (this.connectedPeers.get(trackerMessage.getFrom()) != null || !allowedInconnectNewPeer() || this.incomingPeers.containsKey(trackerMessage.getFrom()) || this.p2pContext.getGhostPeerIds().contains(trackerMessage.getFrom()) || z8) {
            P2PContext.launch$default(this.p2pContext, null, new AnonymousClass2(this, trackerMessage, null), 1, null);
            return;
        }
        if (iIntValue != this.p2pContext.getSistersConfiguration().ProtocolVersion) {
            P2PContext.launch$default(this.p2pContext, null, new AnonymousClass3(this, trackerMessage, null), 1, null);
            return;
        }
        if (str == null || str.length() == 0) {
            P2PLogger.logE$default(this.logger, TAG, p.a(trackerMessage.getFrom(), ": offer is null"), null, 4, null);
            return;
        }
        nyaPeerExtData.setPeerId(trackerMessage.getFrom());
        nyaPeerExtData.setOfferRequestId(trackerMessage.getRequestId());
        nyaPeerExtData.setIncoming(true);
        accept(nyaPeerExtData, str);
    }

    public final void reconnectTracker() {
        P2PLogger p2PLogger = this.logger;
        int iHashCode = hashCode();
        NyaTracker nyaTracker = this.nyaTracker;
        P2PLogger.logI$default(p2PLogger, TAG, G.f.a(iHashCode, nyaTracker != null ? nyaTracker.hashCode() : 0, "P2PLifeCycle-> RTCPeerManager reconnectTracker ", ", nyaTracker "), null, 4, null);
        P2PContext.launch$default(this.p2pContext, null, new C65011(this, null), 1, null);
    }

    public final void removeSliceId(int i7) {
        this.curSliceIds.remove(Integer.valueOf(i7));
    }

    public final void reportDownloadBlockAwaysFail(@NotNull NyaPeer nyaPeer) {
        NyaTracker nyaTracker;
        if (Math.random() >= this.p2pContext.getSistersConfiguration().reportPeerFailedProbability || (nyaTracker = this.nyaTracker) == null) {
            return;
        }
        nyaTracker.reportDownloadBlockStatus(nyaPeer.getExtUserData().getPeerId(), false);
    }

    public final void reportDownloadBlockSuccess(@NotNull NyaPeer nyaPeer) {
        NyaTracker nyaTracker;
        if (nyaPeer.getExtUserData().isDownloadBlockReport()) {
            return;
        }
        nyaPeer.getExtUserData().setDownloadBlockReport(true);
        if (Math.random() >= this.p2pContext.getSistersConfiguration().reportPeerSuccessProbability || (nyaTracker = this.nyaTracker) == null) {
            return;
        }
        nyaTracker.reportDownloadBlockStatus(nyaPeer.getExtUserData().getPeerId(), true);
    }

    @Override // com.bilibili.sistersplayer.p2p.peer.NyaPeer.RelayChannel
    public void sendCandidate(@NotNull NyaPeer nyaPeer, @NotNull NyaPeer.IceCandidateData iceCandidateData) {
        if (StringsKt.trim(iceCandidateData.getCandidate()).toString().length() == 0) {
            return;
        }
        P2PContext.launch$default(this.p2pContext, null, new C65021(this, nyaPeer, iceCandidateData, null), 1, null);
    }

    @Override // com.bilibili.sistersplayer.p2p.peer.NyaPeer.RelayChannel
    public void sendSDP(@NotNull NyaPeer nyaPeer, @NotNull String str) {
        P2PContext.launch$default(this.p2pContext, null, new C65031(nyaPeer, str, this, null), 1, null);
    }

    @Nullable
    public final Object setNatType(@NotNull StunCheck.NyaNatType nyaNatType, boolean z6, @NotNull Continuation<? super Unit> continuation) {
        Object natType;
        NyaTracker nyaTracker = this.nyaTracker;
        if (nyaTracker != null && (natType = nyaTracker.setNatType(nyaNatType, z6, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return natType;
        }
        return Unit.INSTANCE;
    }

    public final void setNyaTracker(@Nullable NyaTracker nyaTracker) {
        this.nyaTracker = nyaTracker;
    }
}
