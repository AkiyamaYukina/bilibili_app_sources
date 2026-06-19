package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/J.class */
public final class J implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f89637a;

    public J(List list) {
        this.f89637a = list;
    }

    public final Object invoke(Object obj) {
        this.f89637a.get(((Number) obj).intValue());
        return null;
    }
}
