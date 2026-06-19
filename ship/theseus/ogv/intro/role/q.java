package com.bilibili.ship.theseus.ogv.intro.role;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/q.class */
public final class q implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f93502a;

    public q(List list) {
        this.f93502a = list;
    }

    public final Object invoke(Object obj) {
        this.f93502a.get(((Number) obj).intValue());
        return null;
    }
}
