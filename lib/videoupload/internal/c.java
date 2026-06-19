package com.bilibili.lib.videoupload.internal;

import WS0.t;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final t f65075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Job f65076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f65077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f65078e;

    public c(long j7, @Nullable t tVar) {
        this.f65074a = j7;
        this.f65075b = tVar;
    }

    public final void a() {
        Job job = this.f65076c;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
