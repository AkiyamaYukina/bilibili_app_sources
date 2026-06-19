package com.bilibili.lib.projection.internal.nirvana;

import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/m.class */
public final class m<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StandardProjectionPlayableItem f63329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NirvanaEngine.a f63330b;

    public m(NirvanaEngine.a aVar, StandardProjectionPlayableItem standardProjectionPlayableItem) {
        this.f63329a = standardProjectionPlayableItem;
        this.f63330b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object apply(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r5
            com.bilibili.lib.nirvana.api.f r0 = (com.bilibili.lib.nirvana.api.f) r0
            r5 = r0
            r0 = r5
            java.lang.Object r0 = r0.c
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r6 = r0
            r0 = r5
            java.lang.Object r0 = r0.c
            r5 = r0
            r0 = r4
            com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem r0 = r0.f63329a
            r8 = r0
            r0 = r4
            com.bilibili.lib.projection.internal.nirvana.NirvanaEngine$a r0 = r0.f63330b
            r7 = r0
            r0 = r6
            if (r0 <= 0) goto L48
            r0 = r7
            boolean r0 = r0.M()
            r0 = r8
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = Ie0.d.b(r0, r1)
            if (r0 == 0) goto L48
            r0 = r7
            io.reactivex.rxjava3.subjects.a<com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem> r0 = r0.h
            r1 = r8
            r0.onNext(r1)
            r0 = r7
            io.reactivex.rxjava3.core.Observable r0 = io.reactivex.rxjava3.core.Observable.just(r0)
            r5 = r0
            goto L9d
        L48:
            r0 = r7
            java.lang.String r0 = r0.h()
            r7 = r0
            r0 = r8
            java.lang.String r0 = r0.x()
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Restoring device "
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r1 = " playing url: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r1 = " different from record '"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r1 = "'."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "NirvanaEngine"
            r1 = r8
            java.lang.String r1 = r1.toString()
            tv.danmaku.android.log.BLog.i(r0, r1)
            io.reactivex.rxjava3.core.Observable r0 = io.reactivex.rxjava3.core.Observable.empty()
            r5 = r0
        L9d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.nirvana.m.apply(java.lang.Object):java.lang.Object");
    }
}
