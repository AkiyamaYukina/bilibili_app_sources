package com.bilibili.lib.projection.internal.nirvana;

import com.bilibili.lib.nirvana.api.UPnPActionException;
import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import io.reactivex.rxjava3.core.ObservableEmitter;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/c.class */
public final class c extends NirvanaEngine.a.AbstractC0349a<com.bilibili.lib.nirvana.api.b<Short>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NirvanaEngine.a f63314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.IntRef f63315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ref.IntRef f63316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ObservableEmitter<Triple<Integer, Integer, Integer>> f63317g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NirvanaEngine.a aVar, Ref.IntRef intRef, Ref.IntRef intRef2, ObservableEmitter<Triple<Integer, Integer, Integer>> observableEmitter, Pair<Long, String> pair) {
        super(aVar, "noreport", pair);
        this.f63314d = aVar;
        this.f63315e = intRef;
        this.f63316f = intRef2;
        this.f63317g = observableEmitter;
    }

    @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
    public final void a(UPnPActionException uPnPActionException) {
        super.a(uPnPActionException);
        NirvanaEngine.a.x(this.f63314d, this.f63317g, this.f63315e.element, this.f63316f.element);
    }

    @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
    public final void b(com.bilibili.lib.nirvana.api.g gVar) {
        com.bilibili.lib.nirvana.api.b bVar = (com.bilibili.lib.nirvana.api.b) gVar;
        super.b(bVar);
        short sShortValue = ((Number) bVar.a).shortValue();
        Ref.IntRef intRef = this.f63315e;
        int i7 = intRef.element;
        ObservableEmitter<Triple<Integer, Integer, Integer>> observableEmitter = this.f63317g;
        Ref.IntRef intRef2 = this.f63316f;
        if (i7 > sShortValue || sShortValue >= intRef2.element) {
            NirvanaEngine.a.x(this.f63314d, observableEmitter, i7, intRef2.element);
        } else {
            observableEmitter.onNext(new Triple(Integer.valueOf(((Number) bVar.a).shortValue()), Integer.valueOf(intRef.element), Integer.valueOf(intRef2.element)));
            observableEmitter.onComplete();
        }
    }
}
