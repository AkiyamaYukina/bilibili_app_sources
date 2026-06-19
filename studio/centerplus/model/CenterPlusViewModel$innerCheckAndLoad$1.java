package com.bilibili.studio.centerplus.model;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$innerCheckAndLoad$1.class */
final class CenterPlusViewModel$innerCheckAndLoad$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    Object result;
    final CenterPlusViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterPlusViewModel$innerCheckAndLoad$1(CenterPlusViewModel centerPlusViewModel, Continuation<? super CenterPlusViewModel$innerCheckAndLoad$1> continuation) {
        super(continuation);
        this.this$0 = centerPlusViewModel;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CenterPlusViewModel.access$innerCheckAndLoad(this.this$0, null, false, this);
    }
}
