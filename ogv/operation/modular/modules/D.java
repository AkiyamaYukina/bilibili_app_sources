package com.bilibili.ogv.operation.modular.modules;

import android.content.Context;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.HashSet;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/D.class */
public final class D<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f70340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f70341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f70342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f70343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f70344e;

    public D(F f7, long j7, boolean z6, Context context, int i7) {
        this.f70340a = f7;
        this.f70341b = j7;
        this.f70342c = z6;
        this.f70343d = context;
        this.f70344e = i7;
    }

    public final void accept(Object obj) {
        F f7 = this.f70340a;
        HashSet<Long> hashSet = f7.f70353d;
        long j7 = this.f70341b;
        hashSet.remove(Long.valueOf(j7));
        boolean z6 = !this.f70342c;
        F.O(f7, z6, j7);
        F.N(this.f70340a, this.f70343d, z6, this.f70344e, false, null);
    }
}
