package com.bilibili.lib.ui.webview2;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/b.class */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebProxy f64981a;

    public static void c(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void a() {
    }

    public void b() {
    }

    public void d() {
    }
}
