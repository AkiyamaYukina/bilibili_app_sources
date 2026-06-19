package com.bilibili.lib.ui.webview2;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/k.class */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile k f64990c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f64991a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f64992b = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/k$a.class */
    public final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/k$b.class */
    public final class b {
    }

    @NonNull
    public static k a() {
        if (f64990c == null) {
            synchronized (k.class) {
                try {
                    if (f64990c == null) {
                        f64990c = new k();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f64990c;
    }
}
