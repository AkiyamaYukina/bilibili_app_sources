package com.bilibili.ogv.kmm.operation.vippreview;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/f.class */
public final class f implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f68935a;

    public f(List list) {
        this.f68935a = list;
    }

    public final Object invoke(Object obj) {
        ((ArrayList) this.f68935a).get(((Number) obj).intValue());
        return null;
    }
}
