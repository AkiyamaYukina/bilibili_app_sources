package com.bilibili.ship.theseus.cheese.biz.aioral;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.e;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/aioral/CheeseAiOralService$showPanel$2$3.class */
final class CheeseAiOralService$showPanel$2$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final b $component;
    int label;
    final CheeseAiOralService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.aioral.CheeseAiOralService$showPanel$2$3$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/aioral/CheeseAiOralService$showPanel$2$3$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<WindowSizeClass, Pair<? extends Integer, ? extends Integer>, Continuation<? super Pair<? extends WindowSizeClass, ? extends Pair<? extends Integer, ? extends Integer>>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Pair<Integer, Integer> pair, Continuation<? super Pair<WindowSizeClass, Pair<Integer, Integer>>> continuation) {
            return CheeseAiOralService$showPanel$2$3.invokeSuspend$lambda$0(windowSizeClass, pair, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.aioral.CheeseAiOralService$showPanel$2$3$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/aioral/CheeseAiOralService$showPanel$2$3$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends WindowSizeClass, ? extends Pair<? extends Integer, ? extends Integer>>, Continuation<? super Unit>, Object> {
        final b $component;
        Object L$0;
        int label;
        final CheeseAiOralService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(b bVar, CheeseAiOralService cheeseAiOralService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$component = bVar;
            this.this$0 = cheeseAiOralService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$component, this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(Pair<WindowSizeClass, Pair<Integer, Integer>> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$component.l(e.a((Pair) ((Pair) this.L$0).component2(), this.this$0.h.h()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAiOralService$showPanel$2$3(CheeseAiOralService cheeseAiOralService, b bVar, Continuation<? super CheeseAiOralService$showPanel$2$3> continuation) {
        super(1, continuation);
        this.this$0 = cheeseAiOralService;
        this.$component = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(WindowSizeClass windowSizeClass, Pair pair, Continuation continuation) {
        return new Pair(windowSizeClass, pair);
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseAiOralService$showPanel$2$3(this.this$0, this.$component, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseAiOralService cheeseAiOralService = this.this$0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(cheeseAiOralService.h.f102939c, cheeseAiOralService.f89007i.b(), AnonymousClass3.INSTANCE));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$component, this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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
