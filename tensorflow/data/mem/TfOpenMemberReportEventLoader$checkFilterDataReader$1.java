package com.bilibili.tensorflow.data.mem;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/mem/TfOpenMemberReportEventLoader$checkFilterDataReader$1.class */
final class TfOpenMemberReportEventLoader$checkFilterDataReader$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final TfOpenMemberReportEventLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TfOpenMemberReportEventLoader$checkFilterDataReader$1(TfOpenMemberReportEventLoader tfOpenMemberReportEventLoader, Continuation<? super TfOpenMemberReportEventLoader$checkFilterDataReader$1> continuation) {
        super(continuation);
        this.this$0 = tfOpenMemberReportEventLoader;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        TfOpenMemberReportEventLoader tfOpenMemberReportEventLoader = this.this$0;
        TfOpenMemberReportEventLoader tfOpenMemberReportEventLoader2 = TfOpenMemberReportEventLoader.f110745a;
        return tfOpenMemberReportEventLoader.a(this);
    }
}
