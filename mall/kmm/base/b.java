package com.bilibili.mall.kmm.base;

import fh0.W;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/base/b.class */
public abstract class b<T extends W> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T f65585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f65586b;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.mall.kmm.base.a, java.lang.Object] */
    public b(@NotNull T t7) {
        this.f65585a = t7;
        ?? obj = new Object();
        obj.f65580a = MallBaseModuleLayoutType.SELF_HEIGHT;
        obj.f65584e = "Wh0";
        this.f65586b = obj;
        a();
    }

    public abstract void a();
}
