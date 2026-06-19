package com.bilibili.playset.editor.widget;

import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/PlaySetEditorBottomSheetKt$PlaySetEditorBottomSheetContent$1$1.class */
public final class PlaySetEditorBottomSheetKt$PlaySetEditorBottomSheetContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FocusManager $focusManager;
    final SoftwareKeyboardController $keyboardController;
    final Function1<Function0<Unit>, Unit> $onHideKeyboardCallbackReady;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaySetEditorBottomSheetKt$PlaySetEditorBottomSheetContent$1$1(Function1<? super Function0<Unit>, Unit> function1, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, Continuation<? super PlaySetEditorBottomSheetKt$PlaySetEditorBottomSheetContent$1$1> continuation) {
        super(2, continuation);
        this.$onHideKeyboardCallbackReady = function1;
        this.$focusManager = focusManager;
        this.$keyboardController = softwareKeyboardController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        focusManager.clearFocus(true);
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaySetEditorBottomSheetKt$PlaySetEditorBottomSheetContent$1$1(this.$onHideKeyboardCallbackReady, this.$focusManager, this.$keyboardController, continuation);
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
        Function1<Function0<Unit>, Unit> function1 = this.$onHideKeyboardCallbackReady;
        final FocusManager focusManager = this.$focusManager;
        final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
        function1.invoke(new Function0(focusManager, softwareKeyboardController) { // from class: com.bilibili.playset.editor.widget.I

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FocusManager f84898a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SoftwareKeyboardController f84899b;

            {
                this.f84898a = focusManager;
                this.f84899b = softwareKeyboardController;
            }

            public final Object invoke() {
                return PlaySetEditorBottomSheetKt$PlaySetEditorBottomSheetContent$1$1.invokeSuspend$lambda$0(this.f84898a, this.f84899b);
            }
        });
        return Unit.INSTANCE;
    }
}
