package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$1.class */
public final class UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final D $uiComponent;
    Object L$0;
    Object L$1;
    int label;
    final UnitedSeasonPanelService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$1(UnitedSeasonPanelService unitedSeasonPanelService, D d7, Continuation<? super UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = unitedSeasonPanelService;
        this.$uiComponent = d7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0$0(UnitedSeasonPanelService unitedSeasonPanelService) {
        return unitedSeasonPanelService.f101605p.f() ? 3 : 1;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$1(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.screenstate.c cVar;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            com.bilibili.ship.theseus.united.page.screenstate.c cVar2 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                cVar = cVar2;
                cVar.j(str, false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                cVar = cVar2;
                th = th;
                cVar.j(str, false);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final UnitedSeasonPanelService unitedSeasonPanelService = this.this$0;
        cVar = unitedSeasonPanelService.h;
        UIComponent<?> uIComponent = this.$uiComponent;
        cVar.j("UgcSeasonPanelService", true);
        try {
            uIComponent.j(!unitedSeasonPanelService.f101605p.f());
            TheseusFloatLayerService theseusFloatLayerService = unitedSeasonPanelService.f101600k;
            TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, new Function0(unitedSeasonPanelService) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.S

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UnitedSeasonPanelService f101501a;

                {
                    this.f101501a = unitedSeasonPanelService;
                }

                public final Object invoke() {
                    return Integer.valueOf(UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$1.invokeSuspend$lambda$0$0(this.f101501a));
                }
            }, 12);
            this.L$0 = cVar;
            this.L$1 = "UgcSeasonPanelService";
            this.label = 1;
            if (theseusFloatLayerService.e(uIComponent, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = "UgcSeasonPanelService";
            cVar.j(str, false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            str = "UgcSeasonPanelService";
            cVar.j(str, false);
            throw th;
        }
    }
}
