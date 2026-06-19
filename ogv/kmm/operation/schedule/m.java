package com.bilibili.ogv.kmm.operation.schedule;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/m.class */
public final class m implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f68813a;

    public m(List list) {
        this.f68813a = list;
    }

    public final Object invoke(Object obj) {
        ((ArrayList) this.f68813a).get(((Number) obj).intValue());
        return null;
    }
}
