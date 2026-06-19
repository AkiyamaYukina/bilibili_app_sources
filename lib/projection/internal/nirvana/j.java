package com.bilibili.lib.projection.internal.nirvana;

import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import ue0.C8721d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/j.class */
public final class j<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NirvanaEngine.a f63325a;

    public j(NirvanaEngine.a aVar) {
        this.f63325a = aVar;
    }

    public final Object apply(Object obj) {
        NirvanaEngine.a aVar = this.f63325a;
        aVar.getClass();
        return Observable.create(new C8721d(aVar)).materialize();
    }
}
