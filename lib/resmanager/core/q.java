package com.bilibili.lib.resmanager.core;

import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.resmanager.ResCallback;
import com.bilibili.lib.resmanager.ResDownloadRequest;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/q.class */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f64329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f64330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f64331c = new Object();

    public q(@NotNull b bVar) {
        this.f64329a = bVar;
    }

    public final void a(@NotNull final ResDownloadRequest resDownloadRequest, @Nullable final DefaultResCache defaultResCache, @Nullable final ResCallback resCallback) {
        if (this.f64330b) {
            this.f64329a.b(resDownloadRequest, defaultResCache, resCallback);
        } else {
            HandlerThreads.post(2, new Runnable(this, defaultResCache, resDownloadRequest, resCallback) { // from class: com.bilibili.lib.resmanager.core.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final q f64325a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DefaultResCache f64326b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ResDownloadRequest f64327c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final ResCallback f64328d;

                {
                    this.f64325a = this;
                    this.f64326b = defaultResCache;
                    this.f64327c = resDownloadRequest;
                    this.f64328d = resCallback;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    q qVar = this.f64325a;
                    DefaultResCache defaultResCache2 = this.f64326b;
                    ResDownloadRequest resDownloadRequest2 = this.f64327c;
                    ResCallback resCallback2 = this.f64328d;
                    qVar.b(defaultResCache2);
                    qVar.f64329a.b(resDownloadRequest2, defaultResCache2, resCallback2);
                }
            });
        }
    }

    public final void b(DefaultResCache defaultResCache) {
        synchronized (this.f64331c) {
            if (!this.f64330b) {
                this.f64330b = defaultResCache != null ? defaultResCache.a() : false;
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
