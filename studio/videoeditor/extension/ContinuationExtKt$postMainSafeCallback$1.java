package com.bilibili.studio.videoeditor.extension;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/ContinuationExtKt$postMainSafeCallback$1.class */
final class ContinuationExtKt$postMainSafeCallback$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;

    public ContinuationExtKt$postMainSafeCallback$1(Continuation<? super ContinuationExtKt$postMainSafeCallback$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.a(null, null, null, this);
    }
}
