package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/p.class */
public final class p implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f89564a;

    public p(List list) {
        this.f89564a = list;
    }

    public final Object invoke(Object obj) {
        this.f89564a.get(((Number) obj).intValue());
        return null;
    }
}
