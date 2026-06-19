package com.bilibili.playerbizcommonv2.widget.subtitle;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/n0.class */
public final class n0 implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5865e0 f83742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f83743b;

    public n0(C5865e0 c5865e0, List list) {
        this.f83742a = c5865e0;
        this.f83743b = list;
    }

    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return this.f83742a.invoke(Integer.valueOf(iIntValue), this.f83743b.get(iIntValue));
    }
}
