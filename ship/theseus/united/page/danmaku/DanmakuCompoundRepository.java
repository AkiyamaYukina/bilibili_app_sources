package com.bilibili.ship.theseus.united.page.danmaku;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bapis.bilibili.community.service.dm.v1.PostStatus;
import com.bapis.bilibili.community.service.dm.v1.ToastV2;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.playerbizcommonv2.danmaku.postpanel.DanmakuTimerService;
import com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository$special$$inlined$map$1;
import java.util.HashSet;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.InteractLayerServiceKtxKt;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosBiz;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosScene;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository.class */
@StabilityInferred(parameters = 0)
public final class DanmakuCompoundRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f99365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f99367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IReporterService f99368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IToastService f99369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final DanmakuTimerService f99370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final DanmakuInputWindowService f99371g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f99372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final m f99373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f99374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f99375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final StateFlow<PostPanelV2> f99376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<ToastV2> f99377n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Flow<DanmakuParams> f99378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final StateFlow<DmViewReply> f99379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final HashSet<Object> f99382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99383t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99384u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f99385v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f99386w;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DanmakuCompoundRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DanmakuCompoundRepository danmakuCompoundRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = danmakuCompoundRepository;
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
                DanmakuCompoundRepository danmakuCompoundRepository = this.this$0;
                this.label = 1;
                danmakuCompoundRepository.getClass();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new DanmakuCompoundRepository$transformToPlayerToast$2(danmakuCompoundRepository, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DanmakuCompoundRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DanmakuCompoundRepository f99387a;

            public a(DanmakuCompoundRepository danmakuCompoundRepository) {
                this.f99387a = danmakuCompoundRepository;
            }

            public final Object emit(Object obj, Continuation continuation) {
                tv.danmaku.biliplayerv2.service.interact.biz.c cVar = (tv.danmaku.biliplayerv2.service.interact.biz.c) obj;
                DanmakuCompoundRepository danmakuCompoundRepository = this.f99387a;
                danmakuCompoundRepository.f99383t.setValue(Boxing.boxBoolean(cVar.a));
                danmakuCompoundRepository.f99374k.e(cVar.a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(DanmakuCompoundRepository danmakuCompoundRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = danmakuCompoundRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowB = InteractLayerServiceKtxKt.b(this.this$0.f99367c);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowB.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f99388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f99389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f99390c;

        public a(long j7, long j8, long j9) {
            this.f99388a = j7;
            this.f99389b = j8;
            this.f99390c = j9;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f99391a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BusinessType.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BusinessType.CHEESE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f99391a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Inject
    public DanmakuCompoundRepository(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull IInteractLayerService iInteractLayerService, @NotNull IReporterService iReporterService, @NotNull IToastService iToastService, @NotNull DanmakuTimerService danmakuTimerService, @NotNull DanmakuInputWindowService danmakuInputWindowService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull BiliAccountInfo biliAccountInfo, @NotNull BusinessType businessType, @NotNull m mVar, @NotNull a aVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull IPlayerSettingService iPlayerSettingService) throws NoWhenBranchMatchedException {
        ChronosBiz chronosBiz;
        boolean z6;
        this.f99365a = context;
        this.f99366b = coroutineScope;
        this.f99367c = iInteractLayerService;
        this.f99368d = iReporterService;
        this.f99369e = iToastService;
        this.f99370f = danmakuTimerService;
        this.f99371g = danmakuInputWindowService;
        this.h = cVar;
        this.f99372i = biliAccountInfo;
        this.f99373j = mVar;
        this.f99374k = theseusCastScreenRepository;
        this.f99375l = iPlayerSettingService;
        final Flow flowCallbackFlow = FlowKt.callbackFlow(new DanmakuCompoundRepository$postPanelFlow$2(danmakuTimerService, null));
        Flow<PostPanelV2> flow = new Flow<PostPanelV2>(flowCallbackFlow) { // from class: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f99394a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f99395a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$special$$inlined$map$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    Object result;
                    final AnonymousClass2 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                        super(continuation);
                        this.this$0 = anonymousClass2;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f99395a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L83
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        kotlin.Pair r0 = (kotlin.Pair) r0
                        java.lang.Object r0 = r0.getSecond()
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f99395a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L83
                        r0 = r9
                        return r0
                    L83:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f99394a = flowCallbackFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f99394a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.f99376m = FlowKt.stateIn(flow, coroutineScope, companion.getEagerly(), (Object) null);
        this.f99377n = SharedFlowKt.MutableSharedFlow$default(1, 0, (BufferOverflow) null, 6, (Object) null);
        final Flow<DanmakuParams> flowA = InteractLayerServiceKtxKt.a(iInteractLayerService);
        this.f99378o = flowA;
        this.f99379p = FlowKt.stateIn(new Flow<DmViewReply>(flowA) { // from class: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f99396a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f99397a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$special$$inlined$map$2$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    Object result;
                    final AnonymousClass2 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                        super(continuation);
                        this.this$0 = anonymousClass2;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f99397a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$2$2$1 r0 = (com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$2$2$1 r0 = new com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$2$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L83
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams r0 = (tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams) r0
                        com.bapis.bilibili.community.service.dm.v1.DmViewReply r0 = r0.getDmViewReply()
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f99397a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L83
                        r0 = r9
                        return r0
                    L83:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f99396a = flowA;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f99396a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, coroutineScope, companion.getEagerly(), (Object) null);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f99380q = MutableStateFlow;
        this.f99381r = FlowKt.asStateFlow(MutableStateFlow);
        this.f99382s = new HashSet<>();
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.valueOf(iInteractLayerService.isDanmakuVisible()));
        this.f99383t = MutableStateFlow2;
        this.f99384u = FlowKt.stateIn(FlowKt.distinctUntilChanged(FlowKt.combine(MutableStateFlow2, theseusCastScreenRepository.f99132j, new TheseusCastScreenRepository$special$$inlined$map$1(theseusCastScreenRepository.f99126c), new DanmakuCompoundRepository$danmakuShowFlow$1(null))), coroutineScope, companion.getEagerly(), MutableStateFlow2.getValue());
        this.f99385v = true;
        int i7 = b.f99391a[businessType.ordinal()];
        if (i7 == 1) {
            chronosBiz = ChronosBiz.BIZ_UGC;
        } else if (i7 == 2) {
            chronosBiz = ChronosBiz.BIZ_OGV;
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            chronosBiz = ChronosBiz.BIZ_PUGV;
        }
        iInteractLayerService.setSceneAndBizParams(ChronosScene.SCENE_DETAIL, chronosBiz);
        IRemoteHandler remoteHandler = iInteractLayerService.getRemoteHandler();
        if (remoteHandler != null) {
            long j7 = aVar.f99388a;
            long jA = aVar2.a();
            long j8 = aVar.f99390c;
            Long lValueOf = j8 == 0 ? null : Long.valueOf(j8);
            remoteHandler.setDanmakuExposureParam(j7, jA, lValueOf != null ? lValueOf.longValue() : aVar2.c(), aVar.f99389b);
        }
        iInteractLayerService.blockDmids(CollectionsKt.arrayListOf(new Long[]{Long.valueOf(aVar.f99388a), Long.valueOf(aVar.f99389b)}));
        if (theseusCastScreenRepository.c()) {
            if (iPlayerSettingService.getBoolean("danmaku_switch_save", false)) {
                ProjectionClient projectionClientA = theseusCastScreenRepository.a();
                z6 = (projectionClientA == null || !projectionClientA.getDanmakuShow()) ? false : z6;
                theseusCastScreenRepository.e(z6);
            } else {
                theseusCastScreenRepository.e(true);
            }
            z6 = true;
            theseusCastScreenRepository.e(z6);
        } else {
            theseusCastScreenRepository.e(d());
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    @Nullable
    public final PostPanelV2 a() {
        return (PostPanelV2) this.f99376m.getValue();
    }

    public final boolean b() {
        m mVar = this.f99373j;
        return !mVar.f99536a.e() && mVar.f99536a.b();
    }

    public final boolean c() {
        PostPanelV2 postPanelV2A = a();
        return (postPanelV2A != null ? postPanelV2A.getPostStatus() : null) == PostStatus.PostStatusClosed;
    }

    public final boolean d() {
        return ((Boolean) this.f99384u.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository r0 = r0.f99374k
            boolean r0 = r0.c()
            if (r0 == 0) goto L66
            r0 = r3
            kotlinx.coroutines.flow.StateFlow<com.bapis.bilibili.community.service.dm.v1.DmViewReply> r0 = r0.f99379p
            java.lang.Object r0 = r0.getValue()
            com.bapis.bilibili.community.service.dm.v1.DmViewReply r0 = (com.bapis.bilibili.community.service.dm.v1.DmViewReply) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L66
            r0 = r5
            java.util.List r0 = r0.getPostPanel2List()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L66
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof java.util.Collection
            if (r0 == 0) goto L3f
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3f
            goto L66
        L3f:
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L46:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L66
            r0 = r5
            java.lang.Object r0 = r0.next()
            com.bapis.bilibili.community.service.dm.v1.PostPanelV2 r0 = (com.bapis.bilibili.community.service.dm.v1.PostPanelV2) r0
            com.bapis.bilibili.community.service.dm.v1.PostStatus r0 = r0.getPostStatus()
            com.bapis.bilibili.community.service.dm.v1.PostStatus r1 = com.bapis.bilibili.community.service.dm.v1.PostStatus.PostStatusClosed
            if (r0 != r1) goto L46
            r0 = 1
            r4 = r0
            goto L68
        L66:
            r0 = 0
            r4 = r0
        L68:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository.e():boolean");
    }
}
