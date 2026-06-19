package com.bilibili.lib.videoupload.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/r.class */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ExecutorService f65114a;

    public static void a(Runnable runnable) {
        if (f65114a == null) {
            synchronized (r.class) {
                try {
                    if (f65114a == null) {
                        f65114a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new q());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ((ThreadPoolExecutor) f65114a).execute(runnable);
    }
}
