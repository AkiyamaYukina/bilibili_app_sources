package com.bilibili.playerbizcommonv2.widget.setting;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingComposeKt$PlayerSettingTop$1$1.class */
public final class PlayerSettingComposeKt$PlayerSettingTop$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final L $item;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSettingComposeKt$PlayerSettingTop$1$1(L l7, Continuation<? super PlayerSettingComposeKt$PlayerSettingTop$1$1> continuation) {
        super(2, continuation);
        this.$item = l7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerSettingComposeKt$PlayerSettingTop$1$1(this.$item, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function0<Unit> function0 = this.$item.f83104f;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
