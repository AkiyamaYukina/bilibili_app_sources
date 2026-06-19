package com.bilibili.ogv.operation.modular.modules;

import android.content.Context;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.HashSet;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/E.class */
public final class E<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f70345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f70346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f70347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f70348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f70349e;

    public E(F f7, long j7, boolean z6, Context context, int i7) {
        this.f70345a = f7;
        this.f70346b = j7;
        this.f70347c = z6;
        this.f70348d = context;
        this.f70349e = i7;
    }

    public final void accept(Object obj) {
        F f7 = this.f70345a;
        HashSet<Long> hashSet = f7.f70353d;
        long j7 = this.f70346b;
        hashSet.remove(Long.valueOf(j7));
        F.O(f7, this.f70347c, j7);
        Context context = this.f70348d;
        String message = ((Throwable) obj).getMessage();
        F.N(this.f70345a, context, this.f70347c, this.f70349e, true, message);
    }
}
