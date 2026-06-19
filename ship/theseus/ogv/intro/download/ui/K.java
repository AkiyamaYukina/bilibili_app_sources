package com.bilibili.ship.theseus.ogv.intro.download.ui;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/K.class */
public final class K implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f92475a;

    public K(List list) {
        this.f92475a = list;
    }

    public final Object invoke(Object obj) {
        this.f92475a.get(((Number) obj).intValue());
        return null;
    }
}
