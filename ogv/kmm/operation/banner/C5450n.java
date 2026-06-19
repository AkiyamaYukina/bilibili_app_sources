package com.bilibili.ogv.kmm.operation.banner;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/n.class */
public final class C5450n implements Function0<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<C5449m> f68131a;

    public C5450n(List<C5449m> list) {
        this.f68131a = list;
    }

    public final Object invoke() {
        return Integer.valueOf(this.f68131a.size() * 1000);
    }
}
