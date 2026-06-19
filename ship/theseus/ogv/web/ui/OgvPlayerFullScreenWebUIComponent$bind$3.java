package com.bilibili.ship.theseus.ogv.web.ui;

import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import zu0.P0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/ui/OgvPlayerFullScreenWebUIComponent$bind$3.class */
final class OgvPlayerFullScreenWebUIComponent$bind$3 extends SuspendLambda implements Function2<UIComponent.ViewEntry, Continuation<? super Unit>, Object> {
    final P0 $binding;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPlayerFullScreenWebUIComponent$bind$3(P0 p02, Continuation<? super OgvPlayerFullScreenWebUIComponent$bind$3> continuation) {
        super(2, continuation);
        this.$binding = p02;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvPlayerFullScreenWebUIComponent$bind$3 ogvPlayerFullScreenWebUIComponent$bind$3 = new OgvPlayerFullScreenWebUIComponent$bind$3(this.$binding, continuation);
        ogvPlayerFullScreenWebUIComponent$bind$3.L$0 = obj;
        return ogvPlayerFullScreenWebUIComponent$bind$3;
    }

    public final Object invoke(UIComponent.ViewEntry viewEntry, Continuation<? super Unit> continuation) {
        return create(viewEntry, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$binding.f130548c.addView(((UIComponent.ViewEntry) this.L$0).getRoot());
        return Unit.INSTANCE;
    }
}
