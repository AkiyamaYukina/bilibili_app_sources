package com.bilibili.ogv.rank.part;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/x.class */
public final class x implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f72128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f72129b;

    public x(u uVar, List list) {
        this.f72128a = uVar;
        this.f72129b = list;
    }

    public final Object invoke(Object obj) {
        return this.f72128a.invoke(this.f72129b.get(((Number) obj).intValue()));
    }
}
