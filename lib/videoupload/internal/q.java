package com.bilibili.lib.videoupload.internal;

import com.bilibili.lib.fasthybrid.uimodule.imageviewer.s;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/q.class */
public final class q implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f65113a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, s.b(this.f65113a, new StringBuilder("Upload Single Thread#")));
        thread.setPriority(10);
        return thread;
    }
}
