package com.bilibili.ogv.infra.tempfile;

import com.bilibili.ogv.infra.tempfile.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/tempfile/TempFileManager$State$run$1.class */
final class TempFileManager$State$run$1 extends ContinuationImpl {
    int label;
    Object result;
    final e.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempFileManager$State$run$1(e.a aVar, Continuation<? super TempFileManager$State$run$1> continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
