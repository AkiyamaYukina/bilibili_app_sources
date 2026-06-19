package com.bilibili.upper.module.manuscript.activity;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.upper.api.service.UpperVerifyCodeApiService;
import lI0.InterfaceC7820a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/y.class */
public final class y implements InterfaceC7820a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManuscriptsSearchActivity f113563a;

    public y(ManuscriptsSearchActivity manuscriptsSearchActivity) {
        this.f113563a = manuscriptsSearchActivity;
    }

    @Override // lI0.InterfaceC7820a
    public final void a(nI0.n nVar) {
        BLog.i("ManuscriptsSearchActivity", "ManuscriptListFragment beforeDelete");
        int i7 = ManuscriptsSearchActivity.f113490Z;
        ManuscriptsSearchActivity manuscriptsSearchActivity = this.f113563a;
        manuscriptsSearchActivity.getClass();
        ((UpperVerifyCodeApiService) ServiceGenerator.createService(UpperVerifyCodeApiService.class)).getEncodeMobileNumber().enqueue(new A(manuscriptsSearchActivity, nVar));
    }
}
