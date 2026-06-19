package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.framework.exposure.core.ExposureLayoutInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$excludeWhenFloatShowing$1.class */
final class DetailRelateService$excludeWhenFloatShowing$1 extends SuspendLambda implements Function3<ExposureLayoutInfo, Boolean, Continuation<? super ExposureLayoutInfo>, Object> {
    Object L$0;
    boolean Z$0;
    int label;

    public DetailRelateService$excludeWhenFloatShowing$1(Continuation<? super DetailRelateService$excludeWhenFloatShowing$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(ExposureLayoutInfo exposureLayoutInfo, boolean z6, Continuation<? super ExposureLayoutInfo> continuation) {
        DetailRelateService$excludeWhenFloatShowing$1 detailRelateService$excludeWhenFloatShowing$1 = new DetailRelateService$excludeWhenFloatShowing$1(continuation);
        detailRelateService$excludeWhenFloatShowing$1.L$0 = exposureLayoutInfo;
        detailRelateService$excludeWhenFloatShowing$1.Z$0 = z6;
        return detailRelateService$excludeWhenFloatShowing$1.invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ExposureLayoutInfo) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super ExposureLayoutInfo>) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ExposureLayoutInfo exposureLayoutInfo = (ExposureLayoutInfo) this.L$0;
        if (this.Z$0) {
            exposureLayoutInfo = null;
        }
        return exposureLayoutInfo;
    }
}
