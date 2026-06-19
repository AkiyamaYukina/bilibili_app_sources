package com.bilibili.search2.ogv;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/ogv/OgvSearchResultFragment$onViewCreated$1$adapter$1.class */
public final /* synthetic */ class OgvSearchResultFragment$onViewCreated$1$adapter$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public OgvSearchResultFragment$onViewCreated$1$adapter$1(Object obj) {
        super(1, obj, OgvSearchResultFragment.class, "loadData", "loadData(Z)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z6) {
        ((OgvSearchResultFragment) ((CallableReference) this).receiver).loadData(z6);
    }
}
