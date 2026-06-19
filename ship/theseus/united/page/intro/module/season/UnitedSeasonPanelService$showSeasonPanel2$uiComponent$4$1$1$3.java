package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$3.class */
public final class UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final D $uiComponent;
    int label;
    final UnitedSeasonPanelService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$3(UnitedSeasonPanelService unitedSeasonPanelService, D d7, Continuation<? super UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$3> continuation) {
        super(1, continuation);
        this.this$0 = unitedSeasonPanelService;
        this.$uiComponent = d7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(D d7, boolean z6) {
        return d7.c();
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$3(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BackActionRepository backActionRepository = this.this$0.f101601l;
            final D d7 = this.$uiComponent;
            Function1<? super Boolean, Boolean> function1 = new Function1(d7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.T

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final D f101502a;

                {
                    this.f101502a = d7;
                }

                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$3.invokeSuspend$lambda$0(this.f101502a, ((Boolean) obj2).booleanValue()));
                }
            };
            this.label = 1;
            if (backActionRepository.b(function1, this) == coroutine_suspended) {
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
