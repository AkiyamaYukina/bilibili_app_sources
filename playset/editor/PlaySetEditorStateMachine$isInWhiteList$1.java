package com.bilibili.playset.editor;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorStateMachine$isInWhiteList$1.class */
final class PlaySetEditorStateMachine$isInWhiteList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final J this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaySetEditorStateMachine$isInWhiteList$1(J j7, Continuation<? super PlaySetEditorStateMachine$isInWhiteList$1> continuation) {
        super(continuation);
        this.this$0 = j7;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objH = J.h(this.this$0, null, this);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Result.box-impl(objH);
    }
}
