package com.bilibili.ship.theseus.ogv.intro.download.ui;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/X.class */
public final class X implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f92517a;

    public X(List list) {
        this.f92517a = list;
    }

    public final Object invoke(Object obj) {
        this.f92517a.get(((Number) obj).intValue());
        return null;
    }
}
