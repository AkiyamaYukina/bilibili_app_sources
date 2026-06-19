package com.bilibili.ogv.kmm.operation.inlinevideo;

import com.bilibili.ogv.kmm.operation.inlinevideo.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/l.class */
public final class l<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f68511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f68512b;

    public l(m mVar, b bVar) {
        this.f68511a = mVar;
        this.f68512b = bVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
        j.a aVar = (j.a) obj;
        boolean zAreEqual = Intrinsics.areEqual(aVar, j.a.C0414a.f68509a);
        b bVar = this.f68512b;
        m mVar = this.f68511a;
        if (zAreEqual) {
            mVar.a(bVar);
        } else {
            if (!(aVar instanceof j.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            mVar.f68513a.put(bVar, (j.a.b) aVar);
            mVar.b();
        }
        return Unit.INSTANCE;
    }
}
