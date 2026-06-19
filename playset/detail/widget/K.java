package com.bilibili.playset.detail.widget;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/K.class */
public final class K implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aS.c f84611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f84612b;

    public K(aS.c cVar, List list) {
        this.f84611a = cVar;
        this.f84612b = list;
    }

    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return this.f84611a.invoke(Integer.valueOf(iIntValue), this.f84612b.get(iIntValue));
    }
}
