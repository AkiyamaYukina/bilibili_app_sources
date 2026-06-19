package com.bilibili.ogv.infra.tempfile;

import com.bilibili.lib.okdownloader.BiliDownloader;
import com.bilibili.lib.okdownloader.Task;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/tempfile/b.class */
public final class b implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f67936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Task f67937b;

    public b(d dVar, Task task) {
        this.f67936a = dVar;
        this.f67937b = task;
    }

    public final Object invoke(Object obj) {
        BiliDownloader.Companion.getInstance(this.f67936a.f67941b).cancel(this.f67937b.getTaskId());
        return Unit.INSTANCE;
    }
}
