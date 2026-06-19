package com.bilibili.ogv.filmlist.part;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/part/m.class */
public final class m implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f67788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f67789b;

    public m(k kVar, List list) {
        this.f67788a = kVar;
        this.f67789b = list;
    }

    public final Object invoke(Object obj) {
        return this.f67788a.invoke(this.f67789b.get(((Number) obj).intValue()));
    }
}
