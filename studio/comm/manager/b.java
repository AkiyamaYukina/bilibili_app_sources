package com.bilibili.studio.comm.manager;

import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/b.class */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f105378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105380c;

    public /* synthetic */ b(Collection collection, int i7, int i8) {
        this.f105378a = collection;
        this.f105379b = i7;
        this.f105380c = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            java.util.Collection r0 = r0.f105378a
            r9 = r0
            r0 = r5
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r5 = r0
            r0 = r5
            java.lang.Object r0 = r0.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r7 = r0
            r0 = r5
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r5 = r0
            r0 = r9
            r1 = r7
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L84
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L3b:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L79
            r0 = r10
            java.lang.Object r0 = r0.next()
            r5 = r0
            r0 = r5
            kotlin.Pair r0 = (kotlin.Pair) r0
            r9 = r0
            r0 = r9
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = r4
            int r1 = r1.f105379b
            int r0 = r0 * r1
            r1 = r9
            java.lang.Object r1 = r1.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r4
            int r2 = r2.f105380c
            int r1 = r1 * r2
            if (r0 != r1) goto L3b
            goto L7b
        L79:
            r0 = 0
            r5 = r0
        L7b:
            r0 = r5
            if (r0 == 0) goto L84
            r0 = 1
            r6 = r0
            goto L86
        L84:
            r0 = 0
            r6 = r0
        L86:
            r0 = r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.manager.b.invoke(java.lang.Object):java.lang.Object");
    }
}
