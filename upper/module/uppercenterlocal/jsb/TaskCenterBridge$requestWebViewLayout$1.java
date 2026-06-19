package com.bilibili.upper.module.uppercenterlocal.jsb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/jsb/TaskCenterBridge$requestWebViewLayout$1.class */
final class TaskCenterBridge$requestWebViewLayout$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskCenterBridge$requestWebViewLayout$1(a aVar, Continuation<? super TaskCenterBridge$requestWebViewLayout$1> continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.V0(null, null, this);
    }
}
