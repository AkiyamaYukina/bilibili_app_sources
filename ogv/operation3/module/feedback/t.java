package com.bilibili.ogv.operation3.module.feedback;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/t.class */
public final class t implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f71250a;

    public t(List list) {
        this.f71250a = list;
    }

    public final Object invoke(Object obj) {
        this.f71250a.get(((Number) obj).intValue());
        return null;
    }
}
