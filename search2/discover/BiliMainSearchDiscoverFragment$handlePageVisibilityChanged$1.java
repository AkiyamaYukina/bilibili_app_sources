package com.bilibili.search2.discover;

import com.bilibili.lib.ui.mixin.IFragmentShowHideKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/BiliMainSearchDiscoverFragment$handlePageVisibilityChanged$1.class */
final class BiliMainSearchDiscoverFragment$handlePageVisibilityChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BiliMainSearchDiscoverFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliMainSearchDiscoverFragment$handlePageVisibilityChanged$1(BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment, Continuation<? super BiliMainSearchDiscoverFragment$handlePageVisibilityChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = biliMainSearchDiscoverFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliMainSearchDiscoverFragment$handlePageVisibilityChanged$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            p pVarOf = this.this$0.of();
            boolean z6 = this.this$0.isResumed() && IFragmentShowHideKt.isFragmentShown(this.this$0);
            this.label = 1;
            Object objEmit = pVarOf.h.emit(Boxing.boxBoolean(z6), this);
            if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objEmit = Unit.INSTANCE;
            }
            if (objEmit == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
