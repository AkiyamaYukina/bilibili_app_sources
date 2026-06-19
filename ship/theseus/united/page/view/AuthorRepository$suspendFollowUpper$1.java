package com.bilibili.ship.theseus.united.page.view;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/AuthorRepository$suspendFollowUpper$1.class */
final class AuthorRepository$suspendFollowUpper$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    Object result;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorRepository$suspendFollowUpper$1(d dVar, Continuation<? super AuthorRepository$suspendFollowUpper$1> continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objH = this.this$0.h(null, this, false);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Result.box-impl(objH);
    }
}
