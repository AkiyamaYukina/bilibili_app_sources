package com.bilibili.search2.result.ogv.aggregate.subpage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/subpage/SearchAggregateFragment$initUI$1$1$1.class */
final /* synthetic */ class SearchAggregateFragment$initUI$1$1$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public SearchAggregateFragment$initUI$1$1$1(Object obj) {
        super(1, obj, SearchAggregateFragment.class, "loadData", "loadData(Z)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z6) {
        ((SearchAggregateFragment) ((CallableReference) this).receiver).loadData(z6);
    }
}
