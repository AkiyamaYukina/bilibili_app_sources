package com.bilibili.ogv.kmm.operation.inlinevideo;

import H3.S;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/b.class */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f68475b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f68478e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f68480g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f68476c = LazyKt.lazy(new S(5));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableState f68477d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f68479f = new j();

    public b(String str, g gVar, c cVar) {
        this.f68480g = cVar;
        this.f68474a = str;
        this.f68475b = gVar;
        this.f68478e = cVar.f68482b;
    }

    @Override // com.bilibili.ogv.kmm.operation.inlinevideo.k
    public final Object a(Continuation<? super Unit> continuation) {
        Object objC = this.f68480g.f68481a.c(this, continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.ogv.kmm.operation.inlinevideo.k
    public final boolean b() {
        return ((Boolean) this.f68477d.getValue()).booleanValue();
    }

    @Override // com.bilibili.ogv.kmm.operation.inlinevideo.k
    public final String c() {
        return this.f68478e;
    }

    @Override // com.bilibili.ogv.kmm.operation.inlinevideo.k
    public final g d() {
        return this.f68475b;
    }

    @Override // com.bilibili.ogv.kmm.operation.inlinevideo.k
    public final void e(boolean z6) {
        this.f68477d.setValue(Boolean.valueOf(z6));
    }

    @Override // com.bilibili.ogv.kmm.operation.inlinevideo.k
    public final j f() {
        return this.f68479f;
    }

    @Override // com.bilibili.ogv.kmm.operation.inlinevideo.k
    public final n g() {
        return (n) this.f68476c.getValue();
    }

    @Override // com.bilibili.ogv.kmm.operation.inlinevideo.k
    public final String getModuleType() {
        return this.f68474a;
    }
}
