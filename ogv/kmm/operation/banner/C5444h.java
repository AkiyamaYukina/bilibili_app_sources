package com.bilibili.ogv.kmm.operation.banner;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/h.class */
public final class C5444h implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f68115a;

    public C5444h(List list) {
        this.f68115a = list;
    }

    public final Object invoke(Object obj) {
        ((ArrayList) this.f68115a).get(((Number) obj).intValue());
        return null;
    }
}
