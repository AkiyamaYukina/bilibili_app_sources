package com.bilibili.playerbizcommonv2.widget.subtitle;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/j0.class */
public final class C5875j0 implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f83726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f83727b;

    public C5875j0(Z z6, List list) {
        this.f83726a = z6;
        this.f83727b = list;
    }

    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return this.f83726a.invoke(Integer.valueOf(iIntValue), this.f83727b.get(iIntValue));
    }
}
