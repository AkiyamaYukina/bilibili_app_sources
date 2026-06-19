package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/i.class */
public final class i implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f92800a;

    public i(List list) {
        this.f92800a = list;
    }

    public final Object invoke(Object obj) {
        this.f92800a.get(((Number) obj).intValue());
        return null;
    }
}
