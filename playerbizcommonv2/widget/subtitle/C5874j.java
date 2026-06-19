package com.bilibili.playerbizcommonv2.widget.subtitle;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/j.class */
public final class C5874j implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5860c f83724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f83725b;

    public C5874j(C5860c c5860c, List list) {
        this.f83724a = c5860c;
        this.f83725b = list;
    }

    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return this.f83724a.invoke(Integer.valueOf(iIntValue), ((ArrayList) this.f83725b).get(iIntValue));
    }
}
