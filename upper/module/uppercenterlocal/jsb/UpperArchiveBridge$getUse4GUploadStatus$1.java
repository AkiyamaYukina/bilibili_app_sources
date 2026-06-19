package com.bilibili.upper.module.uppercenterlocal.jsb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/jsb/UpperArchiveBridge$getUse4GUploadStatus$1.class */
final class UpperArchiveBridge$getUse4GUploadStatus$1 extends ContinuationImpl {
    int label;
    Object result;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperArchiveBridge$getUse4GUploadStatus$1(d dVar, Continuation<? super UpperArchiveBridge$getUse4GUploadStatus$1> continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.r1(null, this);
    }
}
