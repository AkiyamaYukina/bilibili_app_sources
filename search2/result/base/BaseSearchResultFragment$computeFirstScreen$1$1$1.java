package com.bilibili.search2.result.base;

import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.result.base.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultFragment$computeFirstScreen$1$1$1.class */
final class BaseSearchResultFragment$computeFirstScreen$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RecyclerView $recyclerView;
    final BaseSearchResultViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSearchResultFragment$computeFirstScreen$1$1$1(RecyclerView recyclerView, BaseSearchResultViewModel baseSearchResultViewModel, Continuation<? super BaseSearchResultFragment$computeFirstScreen$1$1$1> continuation) {
        super(2, continuation);
        this.$recyclerView = recyclerView;
        this.$viewModel = baseSearchResultViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseSearchResultFragment$computeFirstScreen$1$1$1(this.$recyclerView, this.$viewModel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$recyclerView.computeVerticalScrollRange() > this.$recyclerView.computeVerticalScrollExtent()) {
            this.$viewModel.V0(new u.j(new k()));
        } else {
            this.$viewModel.V0(new u.j(new k()));
        }
        return Unit.INSTANCE;
    }
}
