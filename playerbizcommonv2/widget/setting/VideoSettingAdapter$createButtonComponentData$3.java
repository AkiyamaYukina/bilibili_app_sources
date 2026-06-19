package com.bilibili.playerbizcommonv2.widget.setting;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/VideoSettingAdapter$createButtonComponentData$3.class */
final class VideoSettingAdapter$createButtonComponentData$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;

    public VideoSettingAdapter$createButtonComponentData$3(Continuation<? super VideoSettingAdapter$createButtonComponentData$3> continuation) {
        super(1, continuation);
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new VideoSettingAdapter$createButtonComponentData$3(continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
