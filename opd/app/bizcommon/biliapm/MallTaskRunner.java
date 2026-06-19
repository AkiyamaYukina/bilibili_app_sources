package com.bilibili.opd.app.bizcommon.biliapm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/biliapm/MallTaskRunner.class */
public class MallTaskRunner {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile MallTaskRunner f73496b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f73497a = Executors.newFixedThreadPool(2);

    public static MallTaskRunner getInstance() {
        if (f73496b != null) {
            return f73496b;
        }
        synchronized (MallTaskRunner.class) {
            try {
                if (f73496b == null) {
                    f73496b = new MallTaskRunner();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f73496b;
    }

    public void submit(Runnable runnable) {
        if (runnable != null) {
            this.f73497a.submit(runnable);
        }
    }
}
