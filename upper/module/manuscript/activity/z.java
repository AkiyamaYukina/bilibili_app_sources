package com.bilibili.upper.module.manuscript.activity;

import jJ0.C7653b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/z.class */
public final class z extends C7653b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ManuscriptsSearchActivity f113564b;

    public z(ManuscriptsSearchActivity manuscriptsSearchActivity) {
        this.f113564b = manuscriptsSearchActivity;
    }

    @Override // jJ0.C7653b
    public final void onLastItemVisible() {
        int i7 = ManuscriptsSearchActivity.f113490Z;
        ManuscriptsSearchActivity manuscriptsSearchActivity = this.f113564b;
        manuscriptsSearchActivity.S6(1, true);
        manuscriptsSearchActivity.P6();
    }
}
