package com.bilibili.playset.editor.widget;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/EditorCommonKt$HideKeyboardEffect$1$1.class */
public final class EditorCommonKt$HideKeyboardEffect$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $isImeVisible;
    final SoftwareKeyboardController $keyboardController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorCommonKt$HideKeyboardEffect$1$1(boolean z6, SoftwareKeyboardController softwareKeyboardController, Continuation<? super EditorCommonKt$HideKeyboardEffect$1$1> continuation) {
        super(2, continuation);
        this.$isImeVisible = z6;
        this.$keyboardController = softwareKeyboardController;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EditorCommonKt$HideKeyboardEffect$1$1(this.$isImeVisible, this.$keyboardController, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        SoftwareKeyboardController softwareKeyboardController;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isImeVisible && (softwareKeyboardController = this.$keyboardController) != null) {
            softwareKeyboardController.hide();
        }
        return Unit.INSTANCE;
    }
}
