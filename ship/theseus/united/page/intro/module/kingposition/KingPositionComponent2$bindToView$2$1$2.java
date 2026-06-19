package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.app.gemini.ui.UIComponent;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$bindToView$2$1$2.class */
public final class KingPositionComponent2$bindToView$2$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Map.Entry<UIComponent<?>, UIComponent.ViewEntry> $it;
    final UIComponent.ViewEntry $king;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingPositionComponent2$bindToView$2$1$2(Map.Entry<? extends UIComponent<?>, ? extends UIComponent.ViewEntry> entry, UIComponent.ViewEntry viewEntry, Continuation<? super KingPositionComponent2$bindToView$2$1$2> continuation) {
        super(2, continuation);
        this.$it = entry;
        this.$king = viewEntry;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KingPositionComponent2$bindToView$2$1$2(this.$it, this.$king, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UIComponent<?> key = this.$it.getKey();
            UIComponent<?> uIComponent = key instanceof UIComponent ? key : null;
            if (uIComponent != null) {
                UIComponent.ViewEntry viewEntry = this.$king;
                this.label = 1;
                if (uIComponent.bindToView(viewEntry, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
