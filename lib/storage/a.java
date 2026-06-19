package com.bilibili.lib.storage;

import com.bilibili.droid.thread.BThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf0.C8658f;
import uf0.AbstractC8725a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/storage/a.class */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f64582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String[] f64583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String[] f64584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String[] f64585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AbstractC8725a f64586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Function1<Object, Unit> f64587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Boolean f64588g;

    /* JADX INFO: renamed from: com.bilibili.lib.storage.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/storage/a$a.class */
    public static final class C0360a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public String f64589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public AbstractC8725a f64590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String[] f64591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String[] f64592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String[] f64593e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Function1<Object, Unit> f64594f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Boolean f64595g;
    }

    public a(@NotNull C0360a c0360a) {
        this.f64582a = c0360a.f64589a;
        this.f64583b = c0360a.f64591c;
        this.f64584c = c0360a.f64592d;
        this.f64585d = c0360a.f64593e;
        this.f64586e = c0360a.f64590b;
        this.f64587f = c0360a.f64594f;
        this.f64588g = c0360a.f64595g;
    }

    public final void a() {
        if (Intrinsics.areEqual(this.f64588g, Boolean.TRUE)) {
            ((BThreadPoolExecutor) C8658f.f127507b.getValue()).execute(this);
        } else {
            ((BThreadPoolExecutor) C8658f.f127506a.getValue()).execute(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f64586e.c(this.f64582a, this.f64583b, this.f64584c, this.f64585d, this.f64587f);
    }
}
