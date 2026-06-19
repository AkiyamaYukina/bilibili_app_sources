package com.bilibili.lib.tf.utils;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/utils/AutoCloseableLock.class */
public class AutoCloseableLock implements AutoCloseable {
    private boolean isLocked;

    @NonNull
    private final Lock lock;

    private AutoCloseableLock(@NonNull Lock lock, boolean z6) {
        this.lock = lock;
        this.isLocked = z6;
    }

    @AnyThread
    public static AutoCloseableLock lock(@NonNull Lock lock) {
        lock.lock();
        return new AutoCloseableLock(lock, true);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (!this.isLocked) {
            throw new IllegalStateException("Lock isn't locked.");
        }
        this.isLocked = false;
        this.lock.unlock();
    }
}
