package com.bilibili.ogv.misc.timeline.ui;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/v.class */
public final class v implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f69605a;

    public v(List list) {
        this.f69605a = list;
    }

    public final Object invoke(Object obj) {
        this.f69605a.get(((Number) obj).intValue());
        return null;
    }
}
