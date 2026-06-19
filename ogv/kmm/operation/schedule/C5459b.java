package com.bilibili.ogv.kmm.operation.schedule;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.schedule.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/b.class */
public final class C5459b implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f68777a;

    public C5459b(List list) {
        this.f68777a = list;
    }

    public final Object invoke(Object obj) {
        this.f68777a.get(((Number) obj).intValue());
        return null;
    }
}
