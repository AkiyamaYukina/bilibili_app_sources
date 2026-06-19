package com.bilibili.opd.app.bizcommon.imageselector.page;

import Jm0.C2423A;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallText2ImgKt$Content$2$1.class */
public final class MallText2ImgKt$Content$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Boolean> $isKeyboardVisible;
    final MutableState<Dp> $textFieldHeight;
    final MutableState<Dp> $textFieldPadding;
    final C2423A $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallText2ImgKt$Content$2$1(MutableState<Boolean> mutableState, MutableState<Dp> mutableState2, MutableState<Dp> mutableState3, C2423A c2423a, Continuation<? super MallText2ImgKt$Content$2$1> continuation) {
        super(2, continuation);
        this.$isKeyboardVisible = mutableState;
        this.$textFieldHeight = mutableState2;
        this.$textFieldPadding = mutableState3;
        this.$vm = c2423a;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallText2ImgKt$Content$2$1(this.$isKeyboardVisible, this.$textFieldHeight, this.$textFieldPadding, this.$vm, continuation);
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
        if (this.$isKeyboardVisible.getValue().booleanValue()) {
            this.$textFieldHeight.setValue(Dp.m3878boximpl(Dp.m3880constructorimpl(228)));
            this.$textFieldPadding.setValue(Dp.m3878boximpl(Dp.m3880constructorimpl(88)));
            this.$vm.f11504e.setValue(Boxing.boxBoolean(true));
        } else {
            this.$textFieldHeight.setValue(Dp.m3878boximpl(Dp.m3880constructorimpl(358)));
            this.$textFieldPadding.setValue(Dp.m3878boximpl(Dp.m3880constructorimpl(148)));
            this.$vm.f11504e.setValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
