package com.bilibili.lib.stagger.internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/c.class */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f64500a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/c$a.class */
    public static final class a extends c {
        @Override // com.bilibili.lib.stagger.internal.c
        public final void a(String str, String str2, Throwable... thArr) {
        }

        @Override // com.bilibili.lib.stagger.internal.c
        public final void b(String str, String str2, Throwable... thArr) {
        }

        @Override // com.bilibili.lib.stagger.internal.c
        public final void d(String str, String str2, Throwable... thArr) {
        }

        @Override // com.bilibili.lib.stagger.internal.c
        public final void e(String str, String str2, Throwable... thArr) {
        }
    }

    public static c c() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f64500a == null) {
                    f64500a = new a();
                }
                cVar = f64500a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void e(String str, String str2, Throwable... thArr);
}
