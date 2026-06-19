package com.bilibili.playerbizcommonv2.web;

import androidx.core.view.WindowInsetsCompat;
import com.bilibili.app.comm.aghanim.api.WebContainerInsetsDispatcher;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$collectWindowInsetsCompat$2.class */
final class PlayerV3WebGeneralUIComponent$collectWindowInsetsCompat$2 extends SuspendLambda implements Function2<WindowInsetsCompat, Continuation<? super Unit>, Object> {
    final WebContainerInsetsDispatcher $dispatcher;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerV3WebGeneralUIComponent$collectWindowInsetsCompat$2(WebContainerInsetsDispatcher webContainerInsetsDispatcher, Continuation<? super PlayerV3WebGeneralUIComponent$collectWindowInsetsCompat$2> continuation) {
        super(2, continuation);
        this.$dispatcher = webContainerInsetsDispatcher;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerV3WebGeneralUIComponent$collectWindowInsetsCompat$2 playerV3WebGeneralUIComponent$collectWindowInsetsCompat$2 = new PlayerV3WebGeneralUIComponent$collectWindowInsetsCompat$2(this.$dispatcher, continuation);
        playerV3WebGeneralUIComponent$collectWindowInsetsCompat$2.L$0 = obj;
        return playerV3WebGeneralUIComponent$collectWindowInsetsCompat$2;
    }

    public final Object invoke(WindowInsetsCompat windowInsetsCompat, Continuation<? super Unit> continuation) {
        return create(windowInsetsCompat, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) this.L$0;
        if (windowInsetsCompat == null) {
            return Unit.INSTANCE;
        }
        this.$dispatcher.dispatch(windowInsetsCompat);
        return Unit.INSTANCE;
    }
}
