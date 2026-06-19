package com.bilibili.tgwt.square;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/MovieSquareFragment$loadNextPage$1.class */
final class MovieSquareFragment$loadNextPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MovieSquareFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSquareFragment$loadNextPage$1(MovieSquareFragment movieSquareFragment, Continuation<? super MovieSquareFragment$loadNextPage$1> continuation) {
        super(2, continuation);
        this.this$0 = movieSquareFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovieSquareFragment$loadNextPage$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.square.MovieSquareFragment$loadNextPage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
