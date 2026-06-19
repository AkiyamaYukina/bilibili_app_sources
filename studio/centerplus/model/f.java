package com.bilibili.studio.centerplus.model;

import androidx.fragment.app.FragmentActivity;
import bolts.Continuation;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/f.class */
public final class f<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f105163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentActivity f105164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafeContinuation f105166d;

    public f(g gVar, FragmentActivity fragmentActivity, int i7, SafeContinuation safeContinuation) {
        this.f105163a = gVar;
        this.f105164b = fragmentActivity;
        this.f105165c = i7;
        this.f105166d = safeContinuation;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    @Override // bolts.Continuation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object then(bolts.Task r5) {
        /*
            r4 = this;
            r0 = r5
            boolean r0 = r0.isCancelled()
            r7 = r0
            r0 = r4
            kotlin.coroutines.SafeContinuation r0 = r0.f105166d
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L40
            r0 = r4
            com.bilibili.studio.centerplus.model.g r0 = r0.f105163a
            java.lang.Class r0 = r0.getClass()
            r0 = r4
            androidx.fragment.app.FragmentActivity r0 = r0.f105164b
            r8 = r0
            r0 = r4
            int r0 = r0.f105165c
            r6 = r0
            r0 = r8
            r1 = r6
            boolean r0 = com.bilibili.studio.centerplus.model.g.J0(r0, r1)
            if (r0 != 0) goto L40
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r8 = r0
            r0 = r5
            java.lang.Integer[] r1 = com.bilibili.studio.centerplus.model.g.f105169i
            r2 = r6
            r1 = r1[r2]
            java.lang.Object r1 = kotlin.Result.constructor-impl(r1)
            r0.resumeWith(r1)
            goto L4a
        L40:
            r0 = r5
            r1 = 0
            java.lang.Object r1 = kotlin.Result.constructor-impl(r1)
            r0.resumeWith(r1)
        L4a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.model.f.then(bolts.Task):java.lang.Object");
    }
}
