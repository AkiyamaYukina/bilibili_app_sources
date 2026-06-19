package com.bilibili.ogv.rank.part;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/w.class */
public final class w implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f72126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f72127b;

    public w(t tVar, List list) {
        this.f72126a = tVar;
        this.f72127b = list;
    }

    public final Object invoke(Object obj) {
        return this.f72126a.invoke(this.f72127b.get(((Number) obj).intValue()));
    }
}
