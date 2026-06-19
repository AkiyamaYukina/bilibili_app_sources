package com.bilibili.sistersplayer.p2p;

import androidx.appcompat.widget.C3259x;
import com.bilibili.sistersplayer.hls.Fetcher;
import com.bilibili.sistersplayer.p2p.controller.ShareQuotaController;
import com.bilibili.sistersplayer.p2p.controller.SliceIdController;
import com.bilibili.sistersplayer.p2p.fragment.DataRoleType;
import com.bilibili.sistersplayer.p2p.fragment.LiveFragmentSet;
import com.bilibili.sistersplayer.p2p.peer.NyaPeerManager;
import com.bilibili.sistersplayer.p2p.peer.PeerRole;
import com.bilibili.sistersplayer.p2p.stun.StunCheck;
import com.bilibili.sistersplayer.p2p.utils.ExtKt;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext.class */
public final class P2PContext {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "P2PContext";

    @NotNull
    private final ExecutorCoroutineDispatcher corCtx;

    @NotNull
    private final CoroutineScope coroutineScope;

    @Nullable
    private String curPeerId;

    @NotNull
    private final FragmentDownloader dataFetch;

    @NotNull
    private final LiveFragmentSet fragMan;

    @NotNull
    private final Set<String> ghostPeerIds;

    @NotNull
    private final CoroutineDispatcher iOCoroutineContext;

    @NotNull
    private final AtomicBoolean isDestroyed;

    @NotNull
    private final P2PLogger logger;

    @Nullable
    private Long p2pBufferLength;

    @Nullable
    private Function0<Unit> p2pBufferLengthUpdateListener;

    @NotNull
    private final P2PConfig p2pConfig;

    @NotNull
    private final P2PDataCollection p2pDataCollection;

    @NotNull
    private final List<P2PDataCollectionRefresh> p2pDataListener;

    @Nullable
    private IP2PEventReport p2pEventReportCallback;

    @Nullable
    private NyaPeerManager rtcManager;

    @NotNull
    private final ShareQuotaController shareQuotaController;

    @Nullable
    private SliceIdController sliceIdController;

    @NotNull
    private final StunCheck stunCheck;

    @NotNull
    private final StunCheck stunCheckV6;
    private int timeShift;
    private int trackerPositionInServers;

    @NotNull
    private PeerRole peerRole = PeerRole.PEER;

    @NotNull
    private final SistersConfiguration sistersConfiguration = new SistersConfiguration();

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2PContext$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final P2PContext this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(P2PContext p2PContext, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = p2PContext;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            List listA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                listA = B0.b.a(obj);
                ArrayList<String> arrayList = this.this$0.getSistersConfiguration().stunServers;
                this.L$0 = listA;
                this.label = 1;
                if (ExtKt.stunHostname2HostAddress(arrayList, listA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                listA = list;
            }
            this.this$0.getSistersConfiguration().stunServers.clear();
            this.this$0.getSistersConfiguration().stunServers.addAll(listA);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2PContext$addP2PDataCollectionUpdateListener$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$addP2PDataCollectionUpdateListener$1.class */
    public static final class C64731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $callbackIntervalMs;
        final boolean $isClearData;
        final IP2PDataCollectionListener $listener;
        int label;
        final P2PContext this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64731(P2PContext p2PContext, IP2PDataCollectionListener iP2PDataCollectionListener, long j7, boolean z6, Continuation<? super C64731> continuation) {
            super(2, continuation);
            this.this$0 = p2PContext;
            this.$listener = iP2PDataCollectionListener;
            this.$callbackIntervalMs = j7;
            this.$isClearData = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64731(this.this$0, this.$listener, this.$callbackIntervalMs, this.$isClearData, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0180  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0061 -> B:14:0x0067). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            /*
                Method dump skipped, instruction units count: 400
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.P2PContext.C64731.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2PContext$async$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$async$1.class */
    public static final class C64741<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final Function2<CoroutineScope, Continuation<? super T>, Object> $action;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64741(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super C64741> continuation) {
            super(2, continuation);
            this.$action = function2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C64741 c64741 = new C64741(this.$action, continuation);
            c64741.L$0 = obj;
            return c64741;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function2<CoroutineScope, Continuation<? super T>, Object> function2 = this.$action;
                    this.label = 1;
                    Object objInvoke = function2.invoke(coroutineScope, this);
                    obj = objInvoke;
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            } catch (Exception e7) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2PContext$checkNatTypeAndUpdate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$checkNatTypeAndUpdate$1.class */
    public static final class C64751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final P2PContext this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2PContext$checkNatTypeAndUpdate$1$WhenMappings */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$checkNatTypeAndUpdate$1$WhenMappings.class */
        public final /* synthetic */ class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StunCheck.NyaNatType.values().length];
                try {
                    iArr[StunCheck.NyaNatType.FullConeOrRestrictedCone.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[StunCheck.NyaNatType.PortRestrictedCone.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[StunCheck.NyaNatType.Symmetric.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[StunCheck.NyaNatType.UnknownCone.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[StunCheck.NyaNatType.UDPBlock.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64751(P2PContext p2PContext, Continuation<? super C64751> continuation) {
            super(2, continuation);
            this.this$0 = p2PContext;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64751(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StunCheck.NyaNatType currentNatType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z6 = (this.this$0.getSistersConfiguration().natCheckStunServers.isEmpty() || this.this$0.getSistersConfiguration().natFilteringCheckServers.isEmpty()) ? false : true;
                StunCheck.Companion companion = StunCheck.Companion;
                boolean zCacheInvalid = companion.cacheInvalid(this.this$0.getSistersConfiguration().natKakushinTimeoutMs);
                currentNatType = companion.getCurrentNatType();
                if (z6 && (zCacheInvalid || currentNatType == StunCheck.NyaNatType.Unknown)) {
                    StunCheck stunCheck = this.this$0.stunCheck;
                    ArrayList<String> arrayList = this.this$0.getSistersConfiguration().natCheckStunServers;
                    ArrayList<String> arrayList2 = this.this$0.getSistersConfiguration().natFilteringCheckServers;
                    this.L$0 = currentNatType;
                    this.label = 1;
                    obj = stunCheck.check(arrayList, arrayList2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            currentNatType = (StunCheck.NyaNatType) this.L$0;
            ResultKt.throwOnFailure(obj);
            StunCheck.NyaNatType nyaNatType = (StunCheck.NyaNatType) obj;
            if (nyaNatType == null) {
                return Unit.INSTANCE;
            }
            if (nyaNatType.natValid()) {
                int i8 = WhenMappings.$EnumSwitchMapping$0[nyaNatType.ordinal()];
                if (i8 == 1 || i8 == 2) {
                    StunCheck.Companion.upDateCurrentNatType(nyaNatType, false, this.this$0.getLogger());
                } else if (i8 == 3 || i8 == 4) {
                    StunCheck.Companion.upDateCurrentNatType(nyaNatType, true, this.this$0.getLogger());
                }
                if (currentNatType != nyaNatType) {
                    this.this$0.reportNatType(false);
                }
            } else {
                StunCheck.Companion.upDateCurrentNatType(StunCheck.NyaNatType.Unknown, true, this.this$0.getLogger());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2PContext$checkNatV6TypeAndUpdate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$checkNatV6TypeAndUpdate$1.class */
    public static final class C64761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final P2PContext this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2PContext$checkNatV6TypeAndUpdate$1$WhenMappings */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$checkNatV6TypeAndUpdate$1$WhenMappings.class */
        public final /* synthetic */ class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StunCheck.NyaNatType.values().length];
                try {
                    iArr[StunCheck.NyaNatType.FullConeOrRestrictedCone.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[StunCheck.NyaNatType.PortRestrictedCone.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[StunCheck.NyaNatType.Symmetric.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[StunCheck.NyaNatType.UnknownCone.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[StunCheck.NyaNatType.UDPBlock.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64761(P2PContext p2PContext, Continuation<? super C64761> continuation) {
            super(2, continuation);
            this.this$0 = p2PContext;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64761(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StunCheck.NyaNatType currentV6NatType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z6 = (this.this$0.getSistersConfiguration().nat6CheckStunServers.isEmpty() || this.this$0.getSistersConfiguration().nat6FilteringCheckServers.isEmpty()) ? false : true;
                StunCheck.Companion companion = StunCheck.Companion;
                boolean zCacheInvalidV6 = companion.cacheInvalidV6(this.this$0.getSistersConfiguration().natKakushinTimeoutMs);
                currentV6NatType = companion.getCurrentV6NatType();
                if (z6 && (zCacheInvalidV6 || currentV6NatType == StunCheck.NyaNatType.Unknown)) {
                    StunCheck stunCheck = this.this$0.stunCheckV6;
                    ArrayList<String> arrayList = this.this$0.getSistersConfiguration().nat6CheckStunServers;
                    ArrayList<String> arrayList2 = this.this$0.getSistersConfiguration().nat6FilteringCheckServers;
                    this.L$0 = currentV6NatType;
                    this.label = 1;
                    obj = stunCheck.checkV6(arrayList, arrayList2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            currentV6NatType = (StunCheck.NyaNatType) this.L$0;
            ResultKt.throwOnFailure(obj);
            StunCheck.NyaNatType nyaNatType = (StunCheck.NyaNatType) obj;
            if (nyaNatType == null) {
                return Unit.INSTANCE;
            }
            if (nyaNatType.natValid()) {
                int i8 = WhenMappings.$EnumSwitchMapping$0[nyaNatType.ordinal()];
                if (i8 == 1 || i8 == 2) {
                    StunCheck.Companion.upDateCurrentV6NatType(nyaNatType, false, this.this$0.getLogger());
                } else if (i8 == 3 || i8 == 4) {
                    StunCheck.Companion.upDateCurrentV6NatType(nyaNatType, true, this.this$0.getLogger());
                }
                if (currentV6NatType != nyaNatType) {
                    this.this$0.reportNatType(true);
                }
            } else {
                StunCheck.Companion.upDateCurrentV6NatType(StunCheck.NyaNatType.Unknown, true, this.this$0.getLogger());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2PContext$destroy$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$destroy$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final P2PContext this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(P2PContext p2PContext, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = p2PContext;
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
                P2PLogger.logI$default(this.this$0.getLogger(), P2PContext.TAG, "--destroy--", null, 4, null);
                SliceIdController sliceIdController = this.this$0.getSliceIdController();
                if (sliceIdController != null) {
                    sliceIdController.destroy();
                }
                this.this$0.setSliceIdController(null);
                FragmentDownloader dataFetch = this.this$0.getDataFetch();
                this.label = 1;
                if (dataFetch.destroy(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.getFragMan().destroy();
            this.this$0.setP2pEventReportCallback(null);
            NyaPeerManager rtcManager = this.this$0.getRtcManager();
            if (rtcManager != null) {
                rtcManager.destroy();
            }
            this.this$0.setRtcManager(null);
            P2PLogger.logI$default(this.this$0.getLogger(), P2PContext.TAG, "--destroy---OK---", null, 4, null);
            this.this$0.corCtx.close();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2PContext$launch$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$launch$1.class */
    public static final class C64771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function2<CoroutineScope, Continuation<? super Unit>, Object> $action;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64771(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C64771> continuation) {
            super(2, continuation);
            this.$action = function2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C64771 c64771 = new C64771(this.$action, continuation);
            c64771.L$0 = obj;
            return c64771;
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
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$action;
                    this.label = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
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
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2PContext$reportNatType$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$reportNatType$1.class */
    public static final class C64781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final StunCheck.NyaNatType $currentNatType;
        final boolean $v6;
        int label;
        final P2PContext this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64781(P2PContext p2PContext, StunCheck.NyaNatType nyaNatType, boolean z6, Continuation<? super C64781> continuation) {
            super(2, continuation);
            this.this$0 = p2PContext;
            this.$currentNatType = nyaNatType;
            this.$v6 = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64781(this.this$0, this.$currentNatType, this.$v6, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                NyaPeerManager rtcManager = this.this$0.getRtcManager();
                if (rtcManager != null) {
                    StunCheck.NyaNatType nyaNatType = this.$currentNatType;
                    boolean z6 = this.$v6;
                    this.label = 1;
                    if (rtcManager.setNatType(nyaNatType, z6, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2PContext$setConfiguration$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PContext$setConfiguration$1.class */
    public static final class C64791 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        Object result;
        final P2PContext this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64791(P2PContext p2PContext, Continuation<? super C64791> continuation) {
            super(continuation);
            this.this$0 = p2PContext;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.setConfiguration(null, this);
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public P2PContext(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Fetcher fetcher, @NotNull P2PConfig p2PConfig, @NotNull P2PLogger p2PLogger) {
        this.iOCoroutineContext = coroutineDispatcher;
        this.p2pConfig = p2PConfig;
        this.logger = p2PLogger;
        LiveFragmentSet liveFragmentSet = new LiveFragmentSet(this, p2PLogger);
        this.fragMan = liveFragmentSet;
        FragmentDownloader fragmentDownloader = new FragmentDownloader(this, liveFragmentSet, fetcher, p2PConfig, p2PLogger);
        this.dataFetch = fragmentDownloader;
        this.stunCheck = new StunCheck(this, p2PLogger);
        this.stunCheckV6 = new StunCheck(this, p2PLogger);
        this.p2pDataCollection = new P2PDataCollection();
        this.p2pDataListener = new ArrayList();
        this.shareQuotaController = new ShareQuotaController();
        this.ghostPeerIds = new LinkedHashSet();
        ExecutorCoroutineDispatcher executorCoroutineDispatcherNewSingleThreadContext = ThreadPoolDispatcherKt.newSingleThreadContext("MisakaNetwork");
        this.corCtx = executorCoroutineDispatcherNewSingleThreadContext;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(executorCoroutineDispatcherNewSingleThreadContext);
        this.isDestroyed = new AtomicBoolean(false);
        P2PLogger.logI$default(p2PLogger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> P2PContext init "), null, 4, null);
        fragmentDownloader.initSeedAndLackedSemaphoreInstance();
        launch$default(this, null, new AnonymousClass1(this, null), 1, null);
    }

    public static /* synthetic */ Deferred async$default(P2PContext p2PContext, CoroutineStart coroutineStart, Function2 function2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return p2PContext.async(coroutineStart, function2);
    }

    private final Job checkNatTypeAndUpdate() {
        return launch$default(this, null, new C64751(this, null), 1, null);
    }

    private final Job checkNatV6TypeAndUpdate() {
        return launch$default(this, null, new C64761(this, null), 1, null);
    }

    public static /* synthetic */ Job launch$default(P2PContext p2PContext, CoroutineStart coroutineStart, Function2 function2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return p2PContext.launch(coroutineStart, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit setConfiguration$lambda$0(com.bilibili.sistersplayer.p2p.P2PContext r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.P2PContext.setConfiguration$lambda$0(com.bilibili.sistersplayer.p2p.P2PContext, java.lang.String, java.lang.String, boolean):kotlin.Unit");
    }

    public final void addP2PDataCollectionUpdateListener(@NotNull IP2PDataCollectionListener iP2PDataCollectionListener, long j7, boolean z6) {
        launch$default(this, null, new C64731(this, iP2PDataCollectionListener, j7, z6, null), 1, null);
    }

    public final void addP2PEventReport(@NotNull IP2PEventReport iP2PEventReport) {
        this.p2pEventReportCallback = iP2PEventReport;
    }

    @Nullable
    public final <T> Deferred<T> async(@NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        if (this.isDestroyed.get()) {
            return null;
        }
        return BuildersKt.async(this.coroutineScope, this.corCtx, coroutineStart, new C64741(function2, null));
    }

    public final void destroy() {
        P2PLogger.logI$default(this.logger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> P2PContext destory "), null, 4, null);
        if (this.isDestroyed.get()) {
            P2PLogger.logI$default(this.logger, TAG, "--had destroy--", null, 4, null);
            return;
        }
        this.isDestroyed.set(true);
        try {
            CoroutineScopeKt.cancel$default(this.coroutineScope, (CancellationException) null, 1, (Object) null);
        } catch (Exception e7) {
        }
        Iterator<T> it = this.p2pDataListener.iterator();
        while (it.hasNext()) {
            IP2PDataCollectionListener listener = ((P2PDataCollectionRefresh) it.next()).getListener();
            long p2PDownload = this.p2pDataCollection.getP2PDownload();
            long wastedDataSize = this.p2pDataCollection.getWastedDataSize(WastedDataType.P2P_LATE);
            long wastedDataSize2 = this.p2pDataCollection.getWastedDataSize(WastedDataType.ERROR_DATA);
            long p2PSend = this.p2pDataCollection.getP2PSend();
            long serverDownload = this.p2pDataCollection.getServerDownload();
            long wastedDataSize3 = this.p2pDataCollection.getWastedDataSize(WastedDataType.CDN_REPEAT);
            long fetchErrorNum = this.p2pDataCollection.getFetchErrorNum(FetchErrorType.ERROR_NO_EFFECT);
            int queryServerFragNum = this.p2pDataCollection.getQueryServerFragNum();
            int queryServerQueryNum = this.p2pDataCollection.getQueryServerQueryNum();
            int queryServerlargestQPF = this.p2pDataCollection.getQueryServerlargestQPF();
            long roleDataSize = this.p2pDataCollection.getRoleDataSize(DataRoleType.SEED);
            long roleDataSize2 = this.p2pDataCollection.getRoleDataSize(DataRoleType.EXCHANGE);
            long roleDataSize3 = this.p2pDataCollection.getRoleDataSize(DataRoleType.LACKED);
            int i7 = this.timeShift;
            Fetcher.Companion companion = Fetcher.Companion;
            String engineType = companion.getEngineType();
            String currentHttpProtocol = companion.getCurrentHttpProtocol();
            StunCheck.Companion companion2 = StunCheck.Companion;
            listener.onP2PDataUpdate(new P2PDataBean(p2PDownload, wastedDataSize, wastedDataSize2, p2PSend, serverDownload, wastedDataSize3, fetchErrorNum, queryServerFragNum, queryServerQueryNum, queryServerlargestQPF, roleDataSize, roleDataSize2, roleDataSize3, i7, engineType, currentHttpProtocol, companion2.getCurrentNatType().name(), companion2.getCurrentV6NatType().name()));
        }
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(this.corCtx), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    @Nullable
    public final String getCurPeerId() {
        return this.curPeerId;
    }

    @NotNull
    public final FragmentDownloader getDataFetch() {
        return this.dataFetch;
    }

    @NotNull
    public final LiveFragmentSet getFragMan() {
        return this.fragMan;
    }

    @NotNull
    public final Set<String> getGhostPeerIds() {
        return this.ghostPeerIds;
    }

    @NotNull
    public final CoroutineDispatcher getIOCoroutineContext() {
        return this.iOCoroutineContext;
    }

    @NotNull
    public final P2PLogger getLogger() {
        return this.logger;
    }

    @Nullable
    public final Long getP2pBufferLength() {
        return this.p2pBufferLength;
    }

    @Nullable
    public final Function0<Unit> getP2pBufferLengthUpdateListener() {
        return this.p2pBufferLengthUpdateListener;
    }

    @NotNull
    public final P2PConfig getP2pConfig() {
        return this.p2pConfig;
    }

    @NotNull
    public final P2PDataCollection getP2pDataCollection() {
        return this.p2pDataCollection;
    }

    @NotNull
    public final List<P2PDataCollectionRefresh> getP2pDataListener() {
        return this.p2pDataListener;
    }

    @Nullable
    public final IP2PEventReport getP2pEventReportCallback() {
        return this.p2pEventReportCallback;
    }

    @NotNull
    public final PeerRole getPeerRole() {
        return this.peerRole;
    }

    @Nullable
    public final NyaPeerManager getRtcManager() {
        return this.rtcManager;
    }

    @NotNull
    public final ShareQuotaController getShareQuotaController() {
        return this.shareQuotaController;
    }

    @NotNull
    public final SistersConfiguration getSistersConfiguration() {
        return this.sistersConfiguration;
    }

    @Nullable
    public final SliceIdController getSliceIdController() {
        return this.sliceIdController;
    }

    public final int getTimeShift() {
        return this.timeShift;
    }

    public final int getTrackerPositionInServers() {
        return this.trackerPositionInServers;
    }

    public final boolean isDestroyed() {
        return this.isDestroyed.get();
    }

    @Nullable
    public final Job launch(@NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        if (this.isDestroyed.get()) {
            return null;
        }
        return BuildersKt.launch(this.coroutineScope, this.corCtx, coroutineStart, new C64771(function2, null));
    }

    public final void reportNatType(boolean z6) {
        StunCheck.NyaNatType currentV6NatType = z6 ? StunCheck.Companion.getCurrentV6NatType() : StunCheck.Companion.getCurrentNatType();
        if (currentV6NatType.natValid()) {
            launch$default(this, null, new C64781(this, currentV6NatType, z6, null), 1, null);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:204:0x050d -> B:205:0x0514). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:484:0x0b9c -> B:558:0x0dab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:486:0x0bc2 -> B:558:0x0dab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:520:0x0c95 -> B:558:0x0dab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:530:0x0cd8 -> B:558:0x0dab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:545:0x0d3b -> B:558:0x0dab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:547:0x0d56 -> B:558:0x0dab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:557:0x0d9b -> B:558:0x0dab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01d1 -> B:558:0x0dab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setConfiguration(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public final void setCurPeerId(@Nullable String str) {
        this.curPeerId = str;
    }

    public final void setP2pBufferLength(@Nullable Long l7) {
        this.p2pBufferLength = l7;
    }

    public final void setP2pBufferLengthUpdateListener(@Nullable Function0<Unit> function0) {
        this.p2pBufferLengthUpdateListener = function0;
    }

    public final void setP2pEventReportCallback(@Nullable IP2PEventReport iP2PEventReport) {
        this.p2pEventReportCallback = iP2PEventReport;
    }

    public final void setPeerRole(@NotNull PeerRole peerRole) {
        this.peerRole = peerRole;
    }

    public final void setRtcManager(@Nullable NyaPeerManager nyaPeerManager) {
        this.rtcManager = nyaPeerManager;
    }

    public final void setSliceIdController(@Nullable SliceIdController sliceIdController) {
        this.sliceIdController = sliceIdController;
    }

    public final void setTimeShift(int i7) {
        this.timeShift = i7;
    }

    public final void setTrackerPositionInServers(int i7) {
        this.trackerPositionInServers = i7;
    }
}
