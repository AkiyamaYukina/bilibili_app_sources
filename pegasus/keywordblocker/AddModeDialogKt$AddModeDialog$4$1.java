package com.bilibili.pegasus.keywordblocker;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/AddModeDialogKt$AddModeDialog$4$1.class */
public final class AddModeDialogKt$AddModeDialog$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FocusRequester $focusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddModeDialogKt$AddModeDialog$4$1(FocusRequester focusRequester, Continuation<? super AddModeDialogKt$AddModeDialog$4$1> continuation) {
        super(2, continuation);
        this.$focusRequester = focusRequester;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddModeDialogKt$AddModeDialog$4$1(this.$focusRequester, continuation);
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
        BLog.d("KeywordBlockerPage", "AddModeDialog: LaunchedEffect");
        FocusRequester.m2409requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
        return Unit.INSTANCE;
    }
}
