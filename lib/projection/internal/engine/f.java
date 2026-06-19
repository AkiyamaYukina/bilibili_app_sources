package com.bilibili.lib.projection.internal.engine;

import ie0.C7564c;
import io.reactivex.rxjava3.functions.Consumer;
import le0.C7838f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/f.class */
public final class f<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C7838f f63149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultProjectionEngineManager f63150b;

    public f(C7838f c7838f, DefaultProjectionEngineManager defaultProjectionEngineManager) {
        this.f63149a = c7838f;
        this.f63150b = defaultProjectionEngineManager;
    }

    public final void accept(Object obj) {
        ((C7564c) this.f63150b.getContext()).getApp();
        this.f63149a.v();
    }
}
