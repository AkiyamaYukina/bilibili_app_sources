package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/PageModel$komponent$1$refreshData$1.class */
final class PageModel$komponent$1$refreshData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $extra;
    final Ref.ObjectRef<Boolean> $lastIsNormalWindow;
    final Ref.ObjectRef<q91.i> $lastRefreshTime;
    final MutableState<p> $uiState$delegate;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageModel$komponent$1$refreshData$1(Ref.ObjectRef<q91.i> objectRef, o oVar, String str, Ref.ObjectRef<Boolean> objectRef2, MutableState<p> mutableState, Continuation<? super PageModel$komponent$1$refreshData$1> continuation) {
        super(2, continuation);
        this.$lastRefreshTime = objectRef;
        this.this$0 = oVar;
        this.$extra = str;
        this.$lastIsNormalWindow = objectRef2;
        this.$uiState$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageModel$komponent$1$refreshData$1(this.$lastRefreshTime, this.this$0, this.$extra, this.$lastIsNormalWindow, this.$uiState$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.page.PageModel$komponent$1$refreshData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
