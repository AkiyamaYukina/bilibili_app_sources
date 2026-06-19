package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1.class */
final class UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $text;
    int label;
    final UnitedSeasonPanelService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1(String str, UnitedSeasonPanelService unitedSeasonPanelService, Continuation<? super UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1> continuation) {
        super(2, continuation);
        this.$text = str;
        this.this$0 = unitedSeasonPanelService;
    }

    private static final Unit invokeSuspend$lambda$0(UnitedSeasonPanelService unitedSeasonPanelService, D d7, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$1(unitedSeasonPanelService, d7, null));
        cVar.b(new UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$2(unitedSeasonPanelService, d7, null));
        cVar.b(new UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$3(unitedSeasonPanelService, d7, null));
        cVar.b(new UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1$1$4(unitedSeasonPanelService, d7, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnitedSeasonPanelService$showSeasonPanel2$uiComponent$4$1(this.$text, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            D d7 = new D(this.$text, this.this$0.f101605p);
            UnitedSeasonPanelService unitedSeasonPanelService = this.this$0;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(unitedSeasonPanelService, d7, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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
