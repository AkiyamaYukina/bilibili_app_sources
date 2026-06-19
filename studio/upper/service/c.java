package com.bilibili.studio.upper.service;

import java.util.TimerTask;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/service/c.class */
public final class c extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f108689a;

    public c(d dVar) {
        this.f108689a = dVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f108689a.a();
    }
}
