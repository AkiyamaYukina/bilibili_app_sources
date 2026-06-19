package com.bilibili.ogv.secondary.part;

import androidx.compose.foundation.lazy.T;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/L.class */
public final class L implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f72784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f72785b;

    public L(T t7, List list) {
        this.f72784a = t7;
        this.f72785b = list;
    }

    public final Object invoke(Object obj) {
        return this.f72784a.invoke(this.f72785b.get(((Number) obj).intValue()));
    }
}
