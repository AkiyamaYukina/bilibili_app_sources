package com.bilibili.lib.projection.internal.nirvana;

import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/a.class */
public final class a extends NirvanaEngine.a.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final NirvanaEngine.a f63310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ref.IntRef f63311g;
    public final Triple<Integer, Integer, Integer> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NirvanaEngine.a aVar, Pair<Long, String> pair, Ref.IntRef intRef, Triple<Integer, Integer, Integer> triple) {
        super(aVar, "volume", pair);
        this.f63310f = aVar;
        this.f63311g = intRef;
        this.h = triple;
    }

    @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.c, com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
    /* JADX INFO: renamed from: c */
    public final void b(com.bilibili.lib.nirvana.api.a aVar) {
        super.b(aVar);
        AndroidSchedulers.mainThread().scheduleDirect(new com.bilibili.bfs.c(this.f63310f, 3, this.f63311g, this.h));
    }
}
