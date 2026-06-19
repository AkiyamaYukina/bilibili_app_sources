package com.bilibili.search2.result;

import com.bilibili.search2.result.all.SearchResultAllViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment$viewModelsObserve$8.class */
final /* synthetic */ class BiliMainSearchResultFragment$viewModelsObserve$8 extends AdaptedFunctionReference implements Function2<com.bilibili.search2.result.base.u, Continuation<? super Unit>, Object>, SuspendFunction {
    public BiliMainSearchResultFragment$viewModelsObserve$8(Object obj) {
        super(2, obj, SearchResultAllViewModel.class, "send", "send(Lcom/bilibili/search2/result/base/SearchIntent;)V", 4);
    }

    public final Object invoke(com.bilibili.search2.result.base.u uVar, Continuation<? super Unit> continuation) {
        ((SearchResultAllViewModel) ((AdaptedFunctionReference) this).receiver).V0(uVar);
        return Unit.INSTANCE;
    }
}
