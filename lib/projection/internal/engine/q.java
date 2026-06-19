package com.bilibili.lib.projection.internal.engine;

import com.bilibili.lib.projection.internal.projectionitem.base.ProjectionPlayRecord;
import io.reactivex.rxjava3.functions.Consumer;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/q.class */
public final class q<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionPlayRecord f63174a;

    public q(ProjectionPlayRecord projectionPlayRecord) {
        this.f63174a = projectionPlayRecord;
    }

    public final void accept(Object obj) {
        BLog.e("ProjectionEngineManager", "Restore last record " + this.f63174a + " failed.", (Throwable) obj);
    }
}
