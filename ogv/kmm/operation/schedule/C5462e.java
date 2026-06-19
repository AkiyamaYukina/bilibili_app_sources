package com.bilibili.ogv.kmm.operation.schedule;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.schedule.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/e.class */
public final class C5462e implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f68782a;

    public C5462e(List list) {
        this.f68782a = list;
    }

    public final Object invoke(Object obj) {
        ((ArrayList) this.f68782a).get(((Number) obj).intValue());
        return null;
    }
}
