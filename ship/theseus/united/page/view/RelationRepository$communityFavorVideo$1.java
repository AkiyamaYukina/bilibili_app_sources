package com.bilibili.ship.theseus.united.page.view;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/RelationRepository$communityFavorVideo$1.class */
final class RelationRepository$communityFavorVideo$1 extends ContinuationImpl {
    int label;
    Object result;
    final RelationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelationRepository$communityFavorVideo$1(RelationRepository relationRepository, Continuation<? super RelationRepository$communityFavorVideo$1> continuation) {
        super(continuation);
        this.this$0 = relationRepository;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objC = this.this$0.c(false, this);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Result.box-impl(objC);
    }
}
