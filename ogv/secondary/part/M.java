package com.bilibili.ogv.secondary.part;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/M.class */
public final class M implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f72786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f72787b;

    public M(H h, List list) {
        this.f72786a = h;
        this.f72787b = list;
    }

    public final Object invoke(Object obj) {
        return this.f72786a.invoke(this.f72787b.get(((Number) obj).intValue()));
    }
}
