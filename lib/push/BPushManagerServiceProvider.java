package com.bilibili.lib.push;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushManagerServiceProvider.class */
public final class BPushManagerServiceProvider {
    public static final BPushManagerServiceProvider INSTANCE = new BPushManagerServiceProvider();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IPushManagerService f64206a;

    @NonNull
    public IPushManagerService get() {
        if (this.f64206a == null) {
            synchronized (BPushManagerServiceProvider.class) {
                try {
                    if (this.f64206a == null) {
                        IPushManagerService iPushManagerService = (IPushManagerService) Utils.constructNewInstance("com.bilibili.lib.push.BPushManagerService");
                        this.f64206a = iPushManagerService;
                        if (iPushManagerService == null) {
                            this.f64206a = new m();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f64206a;
    }
}
