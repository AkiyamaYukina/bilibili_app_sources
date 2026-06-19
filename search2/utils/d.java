package com.bilibili.search2.utils;

import com.bilibili.search2.api.BaseSearchItem;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/d.class */
public final /* synthetic */ class d implements Function1 {
    public final Object invoke(Object obj) {
        return Boolean.valueOf(CollectionsKt.contains(f.f88823a, ((BaseSearchItem) obj).getGoTo()));
    }
}
