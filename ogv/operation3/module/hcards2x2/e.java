package com.bilibili.ogv.operation3.module.hcards2x2;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/hcards2x2/e.class */
public final class e implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f71372a;

    public e(List list) {
        this.f71372a = list;
    }

    public final Object invoke(Object obj) {
        this.f71372a.get(((Number) obj).intValue());
        return null;
    }
}
