package com.bilibili.lib.projection.internal.nirvana;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/i.class */
public final class i<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f63324a;

    public i(boolean z6) {
        this.f63324a = z6;
    }

    public final Object apply(Object obj) {
        Observable observableEmpty;
        if (((Boolean) obj).booleanValue()) {
            observableEmpty = Observable.interval(1L, this.f63324a ? 1L : 2L, TimeUnit.SECONDS);
        } else {
            observableEmpty = Observable.empty();
        }
        return observableEmpty;
    }
}
