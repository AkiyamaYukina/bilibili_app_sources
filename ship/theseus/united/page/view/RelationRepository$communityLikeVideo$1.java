package com.bilibili.ship.theseus.united.page.view;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/RelationRepository$communityLikeVideo$1.class */
final class RelationRepository$communityLikeVideo$1 extends ContinuationImpl {
    int label;
    Object result;
    final RelationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelationRepository$communityLikeVideo$1(RelationRepository relationRepository, Continuation<? super RelationRepository$communityLikeVideo$1> continuation) {
        super(continuation);
        this.this$0 = relationRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objD = this.this$0.d(this);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Result.box-impl(objD);
    }
}
