package com.bilibili.opd.app.bizcommon.imageselector.page;

import Jm0.C2423A;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallText2ImgKt$Content$3$1.class */
public final class MallText2ImgKt$Content$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FocusRequester $focusRequester;
    final C2423A $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallText2ImgKt$Content$3$1(C2423A c2423a, FocusRequester focusRequester, Continuation<? super MallText2ImgKt$Content$3$1> continuation) {
        super(2, continuation);
        this.$vm = c2423a;
        this.$focusRequester = focusRequester;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallText2ImgKt$Content$3$1(this.$vm, this.$focusRequester, continuation);
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
        if (this.$vm.f11507i.getIntValue() == 1) {
            try {
                FocusRequester.m2409requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        return Unit.INSTANCE;
    }
}
