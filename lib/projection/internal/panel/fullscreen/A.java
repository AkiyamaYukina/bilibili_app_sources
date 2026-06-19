package com.bilibili.lib.projection.internal.panel.fullscreen;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/A.class */
public final class A<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A<T, R> f63337a = (A<T, R>) new Object();

    public final Object apply(Object obj) {
        return ((com.bilibili.lib.projection.internal.device.a) obj).getDevice().i();
    }
}
