package com.bilibili.search2.result.holder.recommend;

import com.bilibili.search2.result.all.SearchResultAllFragment;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/c.class */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchResultAllFragment f88166a;

    public /* synthetic */ c(SearchResultAllFragment searchResultAllFragment) {
        this.f88166a = searchResultAllFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        return RecAfterClickManager$onClick$1.invokeSuspend$lambda$2(this.f88166a, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }
}
