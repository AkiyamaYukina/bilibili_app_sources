package com.bilibili.playerbizcommonv2.widget.subtitle;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/o0.class */
public final class o0 implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f83747a;

    public o0(List list) {
        this.f83747a = list;
    }

    public final Object invoke(Object obj) {
        this.f83747a.get(((Number) obj).intValue());
        return null;
    }
}
