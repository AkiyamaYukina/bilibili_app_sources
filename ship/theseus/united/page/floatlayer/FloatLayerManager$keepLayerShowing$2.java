package com.bilibili.ship.theseus.united.page.floatlayer;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FloatLayerManager$keepLayerShowing$2.class */
final class FloatLayerManager$keepLayerShowing$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FloatLayerManager.c $animationConfig;
    final UIComponent<?> $uiComponent;
    int I$0;
    private Object L$0;
    int label;
    final FloatLayerManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatLayerManager$keepLayerShowing$2(FloatLayerManager floatLayerManager, UIComponent<?> uIComponent, FloatLayerManager.c cVar, Continuation<? super FloatLayerManager$keepLayerShowing$2> continuation) {
        super(2, continuation);
        this.this$0 = floatLayerManager;
        this.$uiComponent = uIComponent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FloatLayerManager$keepLayerShowing$2 floatLayerManager$keepLayerShowing$2 = new FloatLayerManager$keepLayerShowing$2(this.this$0, this.$uiComponent, null, continuation);
        floatLayerManager$keepLayerShowing$2.L$0 = obj;
        return floatLayerManager$keepLayerShowing$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager$keepLayerShowing$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
