package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.ship.theseus.united.page.ad.AdRepository;
import com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService;
import com.bilibili.ship.theseus.united.page.playingarea.a;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$collectPausedPageAnchor$2.class */
final class PausedPageService$collectPausedPageAnchor$2 extends SuspendLambda implements Function2<PausedPageService.c, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final PausedPageService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPausedPageAnchor$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$collectPausedPageAnchor$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function4<Pair<? extends Integer, ? extends Integer>, a.C1102a, Integer, Continuation<? super Integer>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PausedPageService pausedPageService, Continuation<? super AnonymousClass3> continuation) {
            super(4, continuation);
            this.this$0 = pausedPageService;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((Pair<Integer, Integer>) obj, (a.C1102a) obj2, ((Number) obj3).intValue(), (Continuation<? super Integer>) obj4);
        }

        public final Object invoke(Pair<Integer, Integer> pair, a.C1102a c1102a, int i7, Continuation<? super Integer> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = pair;
            anonymousClass3.L$1 = c1102a;
            anonymousClass3.I$0 = i7;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            a.C1102a c1102a = (a.C1102a) this.L$1;
            int i7 = this.I$0;
            int iCoerceAtLeast = RangesKt.coerceAtLeast(((Number) pair.getSecond()).intValue(), 0);
            int iCoerceAtLeast2 = RangesKt.coerceAtLeast(iCoerceAtLeast - RangesKt.coerceIn(RangesKt.coerceAtLeast(c1102a.f102352b, 0) + i7, 0, iCoerceAtLeast), 0);
            int iCoerceAtLeast3 = RangesKt.coerceAtLeast(this.this$0.f102158m.f102262n, 0);
            boolean z6 = false;
            if (iCoerceAtLeast3 > 0) {
                z6 = false;
                if (i7 <= (-iCoerceAtLeast3)) {
                    z6 = true;
                }
            }
            this.this$0.f102141G = z6;
            return Boxing.boxInt(iCoerceAtLeast2);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPausedPageAnchor$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$collectPausedPageAnchor$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function3<Pair<? extends Integer, ? extends Integer>, a.C1102a, Continuation<? super Integer>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(3, continuation);
        }

        public final Object invoke(Pair<Integer, Integer> pair, a.C1102a c1102a, Continuation<? super Integer> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
            anonymousClass4.L$0 = pair;
            anonymousClass4.L$1 = c1102a;
            return anonymousClass4.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxInt(RangesKt.coerceAtLeast(RangesKt.coerceAtLeast(((Number) ((Pair) this.L$0).getSecond()).intValue(), 0) - RangesKt.coerceAtLeast(((a.C1102a) this.L$1).f102352b, 0), 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausedPageService$collectPausedPageAnchor$2(PausedPageService pausedPageService, Continuation<? super PausedPageService$collectPausedPageAnchor$2> continuation) {
        super(2, continuation);
        this.this$0 = pausedPageService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0(PausedPageService pausedPageService) {
        return pausedPageService.f102157l.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$1(PausedPageService pausedPageService) {
        int iIntValue = ((Number) pausedPageService.f102157l.d().getSecond()).intValue();
        int i7 = pausedPageService.f102157l.c().f102352b;
        int iIntValue2 = ((Number) pausedPageService.f102158m.f102255f.getValue()).intValue();
        int iCoerceIn = 0;
        if (iIntValue > 0) {
            iCoerceIn = RangesKt.coerceIn(iIntValue2 + i7, 0, iIntValue);
        }
        return iCoerceIn;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PausedPageService$collectPausedPageAnchor$2 pausedPageService$collectPausedPageAnchor$2 = new PausedPageService$collectPausedPageAnchor$2(this.this$0, continuation);
        pausedPageService$collectPausedPageAnchor$2.L$0 = obj;
        return pausedPageService$collectPausedPageAnchor$2;
    }

    public final Object invoke(PausedPageService.c cVar, Continuation<? super Unit> continuation) {
        return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (((PausedPageService.c) this.L$0) == null) {
            final PausedPageService pausedPageService = this.this$0;
            pausedPageService.f102149c.f98927b.f98918r = new Function0(pausedPageService) { // from class: com.bilibili.ship.theseus.united.page.pausedpage.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PausedPageService f102211a;

                {
                    this.f102211a = pausedPageService;
                }

                public final Object invoke() {
                    return Integer.valueOf(PausedPageService$collectPausedPageAnchor$2.invokeSuspend$lambda$0(this.f102211a));
                }
            };
            pausedPageService.f102141G = false;
            this.this$0.f102149c.f98927b.f98922v = FlowKt.flowOf(Boxing.boxInt(0));
            return Unit.INSTANCE;
        }
        final PausedPageService pausedPageService2 = this.this$0;
        AdRepository adRepository = pausedPageService2.f102149c;
        adRepository.f98927b.f98918r = new Function0(pausedPageService2) { // from class: com.bilibili.ship.theseus.united.page.pausedpage.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PausedPageService f102212a;

            {
                this.f102212a = pausedPageService2;
            }

            public final Object invoke() {
                return Integer.valueOf(PausedPageService$collectPausedPageAnchor$2.invokeSuspend$lambda$1(this.f102212a));
            }
        };
        StateFlow<Pair<Integer, Integer>> stateFlowB = pausedPageService2.f102157l.b();
        StateFlow<a.C1102a> stateFlowG = this.this$0.f102157l.g();
        PausedPageService pausedPageService3 = this.this$0;
        adRepository.f98927b.f98922v = FlowKt.distinctUntilChanged(FlowKt.combine(stateFlowB, stateFlowG, pausedPageService3.f102158m.f102255f, new AnonymousClass3(pausedPageService3, null)));
        PausedPageService pausedPageService4 = this.this$0;
        pausedPageService4.f102149c.f98927b.f98923w = FlowKt.distinctUntilChanged(FlowKt.combine(pausedPageService4.f102157l.b(), this.this$0.f102157l.g(), new AnonymousClass4(null)));
        return Unit.INSTANCE;
    }
}
