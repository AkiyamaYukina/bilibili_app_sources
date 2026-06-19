package com.bilibili.playset.editor;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorStateMachine$editPlaySet$1.class */
final class PlaySetEditorStateMachine$editPlaySet$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    Object result;
    final J this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaySetEditorStateMachine$editPlaySet$1(J j7, Continuation<? super PlaySetEditorStateMachine$editPlaySet$1> continuation) {
        super(continuation);
        this.this$0 = j7;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objG = J.g(this.this$0, null, null, null, null, 0, 0L, this);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : Result.box-impl(objG);
    }
}
