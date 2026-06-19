package com.bilibili.search2.result.base;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultFragment$viewModelsObserve$1.class */
public final /* synthetic */ class BaseSearchResultFragment$viewModelsObserve$1 extends AdaptedFunctionReference implements Function2<u, Continuation<? super Unit>, Object>, SuspendFunction {
    public BaseSearchResultFragment$viewModelsObserve$1(Object obj) {
        super(2, obj, BaseSearchResultViewModel.class, "send", "send(Lcom/bilibili/search2/result/base/SearchIntent;)V", 4);
    }

    public final Object invoke(u uVar, Continuation<? super Unit> continuation) {
        BaseSearchResultViewModel baseSearchResultViewModel = (BaseSearchResultViewModel) ((AdaptedFunctionReference) this).receiver;
        KProperty<Object>[] kPropertyArr = BaseSearchResultFragment.f87471t;
        baseSearchResultViewModel.V0(uVar);
        return Unit.INSTANCE;
    }
}
