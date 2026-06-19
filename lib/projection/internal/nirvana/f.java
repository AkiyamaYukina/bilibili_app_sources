package com.bilibili.lib.projection.internal.nirvana;

import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/f.class */
public final class f<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NirvanaEngine.a f63321a;

    public f(NirvanaEngine.a aVar) {
        this.f63321a = aVar;
    }

    public final Object apply(Object obj) {
        NirvanaEngine.a aVar = this.f63321a;
        aVar.getClass();
        return Observable.create(new oi.b(aVar)).materialize();
    }
}
