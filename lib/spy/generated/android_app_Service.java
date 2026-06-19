package com.bilibili.lib.spy.generated;

import Sf0.C2860a;
import android.app.Service;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/spy/generated/android_app_Service.class */
public class android_app_Service extends Service {
    public android_app_Service() {
        __combined___init_();
    }

    private void __combined___init_() {
        com_bilibili_lib_ui_life_MixinService__init_();
        com_bilibili_lib_spy_generated_android_app_Service__init_();
    }

    private void com_bilibili_lib_spy_generated_android_app_Service__init_() {
    }

    private void com_bilibili_lib_ui_life_MixinService__init_() {
        C2860a.f22925a.a(this);
    }

    private void com_bilibili_lib_ui_life_MixinService_onCreate() {
        C2860a.f22925a.b(this);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onCreate() {
        com_bilibili_lib_ui_life_MixinService_onCreate();
    }

    public void release() {
        stopSelf();
    }
}
