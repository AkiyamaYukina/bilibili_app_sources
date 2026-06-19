package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$2$2.class */
final class UnitedSeasonPanelService$showSeasonPanel2$2$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final C6360w $uiComponent;
    int label;
    final UnitedSeasonPanelService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelService$showSeasonPanel2$2$2(UnitedSeasonPanelService unitedSeasonPanelService, C6360w c6360w, Continuation<? super UnitedSeasonPanelService$showSeasonPanel2$2$2> continuation) {
        super(1, continuation);
        this.this$0 = unitedSeasonPanelService;
        this.$uiComponent = c6360w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(C6360w c6360w, boolean z6) {
        return c6360w.c();
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedSeasonPanelService$showSeasonPanel2$2$2(this.this$0, this.$uiComponent, continuation);
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
            final C6360w c6360w = this.$uiComponent;
            Function1<? super Boolean, Boolean> function1 = new Function1(c6360w) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.Q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6360w f101500a;

                {
                    this.f101500a = c6360w;
                }

                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(UnitedSeasonPanelService$showSeasonPanel2$2$2.invokeSuspend$lambda$0(this.f101500a, ((Boolean) obj2).booleanValue()));
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
