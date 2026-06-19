package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.droid.DimenUtilsKt;
import dv0.K0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$initWebUIByConfig$3.class */
final class TheseusWebUIComponent$initWebUIByConfig$3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final K0 $viewBinding;
    boolean Z$0;
    int label;
    final TheseusWebUIComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusWebUIComponent$initWebUIByConfig$3(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Continuation<? super TheseusWebUIComponent$initWebUIByConfig$3> continuation) {
        super(2, continuation);
        this.this$0 = theseusWebUIComponent;
        this.$viewBinding = k02;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusWebUIComponent$initWebUIByConfig$3 theseusWebUIComponent$initWebUIByConfig$3 = new TheseusWebUIComponent$initWebUIByConfig$3(this.this$0, this.$viewBinding, continuation);
        theseusWebUIComponent$initWebUIByConfig$3.Z$0 = ((Boolean) obj).booleanValue();
        return theseusWebUIComponent$initWebUIByConfig$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        float fDpToPx = this.Z$0 ? 0.0f : DimenUtilsKt.dpToPx(12.0f);
        TheseusWebUIComponent.c(this.this$0, this.$viewBinding.f116809b, fDpToPx);
        TheseusWebUIComponent.c(this.this$0, this.$viewBinding.f116818l, fDpToPx);
        TheseusWebUIComponent theseusWebUIComponent = this.this$0;
        if (!theseusWebUIComponent.f104184c.f104200a) {
            TheseusWebUIComponent.c(theseusWebUIComponent, this.$viewBinding.f116815i, fDpToPx);
            TheseusWebUIComponent.c(this.this$0, this.$viewBinding.f116813f, fDpToPx);
            TheseusWebUIComponent.c(this.this$0, this.$viewBinding.f116814g, fDpToPx);
        }
        return Unit.INSTANCE;
    }
}
