package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.window.core.layout.WindowSizeClass;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$2.class */
public final class UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final D $uiComponent;
    int label;
    final UnitedSeasonPanelService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
        final D $uiComponent;
        int label;
        final UnitedSeasonPanelService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(D d7, UnitedSeasonPanelService unitedSeasonPanelService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$uiComponent = d7;
            this.this$0 = unitedSeasonPanelService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$uiComponent, this.this$0, continuation);
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
            return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$uiComponent.j(!this.this$0.f101605p.f());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$2(UnitedSeasonPanelService unitedSeasonPanelService, D d7, Continuation<? super UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = unitedSeasonPanelService;
        this.$uiComponent = d7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$2(this.this$0, this.$uiComponent, continuation);
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
            StateFlow<WindowSizeClass> stateFlow = unitedSeasonPanelService.f101605p.f102939c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$uiComponent, unitedSeasonPanelService, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
