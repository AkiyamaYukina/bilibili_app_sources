package com.bilibili.playset.detail.widget;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/M.class */
public final class M implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f84615a;

    public M(List list) {
        this.f84615a = list;
    }

    public final Object invoke(Object obj) {
        this.f84615a.get(((Number) obj).intValue());
        return null;
    }
}
