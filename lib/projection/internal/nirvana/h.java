package com.bilibili.lib.projection.internal.nirvana;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/h.class */
public final class h<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h<T, R> f63323a = (h<T, R>) new Object();

    public final Object apply(Object obj) {
        return Boolean.valueOf(((ProjectionDeviceInternal.PlayerState) obj) == ProjectionDeviceInternal.PlayerState.PLAYING);
    }
}
