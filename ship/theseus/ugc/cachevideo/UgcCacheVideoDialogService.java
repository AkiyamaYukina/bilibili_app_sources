package com.bilibili.ship.theseus.ugc.cachevideo;

import K3.k;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoDialogService.class */
@StabilityInferred(parameters = 0)
public final class UgcCacheVideoDialogService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f96344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f96345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7893a f96346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f96347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f96348f = LazyKt.lazy(new k(5));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<mE0.b> f96349g = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);

    @NotNull
    public final StateFlow<Long> h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoDialogService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcCacheVideoDialogService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoDialogService$1$1.class */
        public static final class C08141 extends SuspendLambda implements Function2<mE0.b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcCacheVideoDialogService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08141(UgcCacheVideoDialogService ugcCacheVideoDialogService, Continuation<? super C08141> continuation) {
                super(2, continuation);
                this.this$0 = ugcCacheVideoDialogService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08141 c08141 = new C08141(this.this$0, continuation);
                c08141.L$0 = obj;
                return c08141;
            }

            public final Object invoke(mE0.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    mE0.b bVar = (mE0.b) this.L$0;
                    UgcCacheVideoDialogService ugcCacheVideoDialogService = this.this$0;
                    this.label = 1;
                    ugcCacheVideoDialogService.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcCacheVideoDialogService$showDownloadDialog$2(ugcCacheVideoDialogService, bVar, null), this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcCacheVideoDialogService ugcCacheVideoDialogService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcCacheVideoDialogService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UgcCacheVideoDialogService ugcCacheVideoDialogService = this.this$0;
                MutableSharedFlow<mE0.b> mutableSharedFlow = ugcCacheVideoDialogService.f96349g;
                C08141 c08141 = new C08141(ugcCacheVideoDialogService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableSharedFlow, c08141, this) == coroutine_suspended) {
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

    @Inject
    public UgcCacheVideoDialogService(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull h hVar, @NotNull C7893a c7893a, @NotNull BackActionRepository backActionRepository) {
        this.f96343a = coroutineScope;
        this.f96344b = fragmentActivity;
        this.f96345c = hVar;
        this.f96346d = c7893a;
        this.f96347e = backActionRepository;
        final StateFlow<C7893a.C1318a> stateFlow = c7893a.f123393f;
        this.h = FlowKt.stateIn(new Flow<Long>(stateFlow) { // from class: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f96351a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoDialogService$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f96352a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoDialogService$special$$inlined$map$1$2$1.class */
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
                    this.f96352a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r11 = r0
                        r0 = r11
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r11
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r11
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$special$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r12 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r11 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r12
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L99
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r12
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        lv0.a$a r0 = (lv0.C7893a.C1318a) r0
                        r6 = r0
                        r0 = r6
                        if (r0 == 0) goto L78
                        r0 = r6
                        lv0.a$a$a r0 = r0.f123395a
                        long r0 = r0.f123398b
                        r9 = r0
                        goto L7b
                    L78:
                        r0 = 0
                        r9 = r0
                    L7b:
                        r0 = r9
                        java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f96352a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r11
                        if (r0 != r1) goto L99
                        r0 = r11
                        return r0
                    L99:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoDialogService$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f96351a = stateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f96351a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, coroutineScope, SharingStarted.Companion.getEagerly(), 0L);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
