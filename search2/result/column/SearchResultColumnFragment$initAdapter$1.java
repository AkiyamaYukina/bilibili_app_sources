package com.bilibili.search2.result.column;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/SearchResultColumnFragment$initAdapter$1.class */
final /* synthetic */ class SearchResultColumnFragment$initAdapter$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public SearchResultColumnFragment$initAdapter$1(Object obj) {
        super(1, obj, SearchResultColumnFragment.class, "loadData", "loadData(Z)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z6) {
        ((SearchResultColumnFragment) ((CallableReference) this).receiver).loadData(z6);
    }
}
