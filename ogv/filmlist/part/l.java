package com.bilibili.ogv.filmlist.part;

import com.bilibili.app.comm.aghanim.ui.compose.H;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/part/l.class */
public final class l implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f67786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f67787b;

    public l(H h, List list) {
        this.f67786a = h;
        this.f67787b = list;
    }

    public final Object invoke(Object obj) {
        return this.f67786a.invoke(this.f67787b.get(((Number) obj).intValue()));
    }
}
