package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.window.core.layout.WindowSizeClass;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$4.class */
public final class UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final D $uiComponent;
    int label;
    final UnitedSeasonPanelService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$4$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$4$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<WindowSizeClass, Pair<? extends Integer, ? extends Integer>, Continuation<? super Pair<? extends WindowSizeClass, ? extends Pair<? extends Integer, ? extends Integer>>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Pair<Integer, Integer> pair, Continuation<? super Pair<WindowSizeClass, Pair<Integer, Integer>>> continuation) {
            return UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$4.invokeSuspend$lambda$0(windowSizeClass, pair, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$4$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$4$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends WindowSizeClass, ? extends Pair<? extends Integer, ? extends Integer>>, Continuation<? super Unit>, Object> {
        final D $uiComponent;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(D d7, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$uiComponent = d7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$uiComponent, continuation);
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
            Pair pair = (Pair) this.L$0;
            WindowSizeClass windowSizeClass = (WindowSizeClass) pair.component1();
            this.$uiComponent.l(com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.e.a((Pair) pair.component2(), com.bilibili.ship.theseus.united.page.screensize.b.c(windowSizeClass)));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$4(UnitedSeasonPanelService unitedSeasonPanelService, D d7, Continuation<? super UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$4> continuation) {
        super(1, continuation);
        this.this$0 = unitedSeasonPanelService;
        this.$uiComponent = d7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(WindowSizeClass windowSizeClass, Pair pair, Continuation continuation) {
        return new Pair(windowSizeClass, pair);
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$4(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UnitedSeasonPanelService unitedSeasonPanelService = this.this$0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(unitedSeasonPanelService.f101605p.f102939c, unitedSeasonPanelService.f101607r.b(), AnonymousClass3.INSTANCE));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$uiComponent, null);
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
