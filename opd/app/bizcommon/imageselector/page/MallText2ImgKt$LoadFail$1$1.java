package com.bilibili.opd.app.bizcommon.imageselector.page;

import com.bilibili.lib.neuron.api.Neurons;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallText2ImgKt$LoadFail$1$1.class */
public final class MallText2ImgKt$LoadFail$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public MallText2ImgKt$LoadFail$1$1(Continuation<? super MallText2ImgKt$LoadFail$1$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallText2ImgKt$LoadFail$1$1(continuation);
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
        Neurons.reportExposure$default(false, "mall.circle-publish.album.text-to-image-change-retry.show", new HashMap(), (List) null, 8, (Object) null);
        return Unit.INSTANCE;
    }
}
