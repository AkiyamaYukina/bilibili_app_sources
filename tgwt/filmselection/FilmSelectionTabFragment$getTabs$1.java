package com.bilibili.tgwt.filmselection;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/FilmSelectionTabFragment$getTabs$1.class */
final class FilmSelectionTabFragment$getTabs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final FilmSelectionTabFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilmSelectionTabFragment$getTabs$1(FilmSelectionTabFragment filmSelectionTabFragment, Continuation<? super FilmSelectionTabFragment$getTabs$1> continuation) {
        super(2, continuation);
        this.this$0 = filmSelectionTabFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FilmSelectionTabFragment$getTabs$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[PHI: r6
  0x007e: PHI (r6v8 com.bilibili.ogvcommon.deprecated.EmptyStateView) = (r6v7 com.bilibili.ogvcommon.deprecated.EmptyStateView), (r6v9 com.bilibili.ogvcommon.deprecated.EmptyStateView) binds: [B:21:0x00a0, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.filmselection.FilmSelectionTabFragment$getTabs$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
