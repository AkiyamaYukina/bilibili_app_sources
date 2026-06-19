package com.bilibili.lib.spy.generated;

import Sf0.C2860a;
import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;
import com.bilibili.lib.performance.EntryPointKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/spy/generated/android_content_ContentProvider.class */
public class android_content_ContentProvider extends ContentProvider {
    public android_content_ContentProvider() {
        __combined___init_();
    }

    private void __combined___init_() {
        com_bilibili_lib_ui_life_MixinContentProvider__init_();
        com_bilibili_lib_spy_generated_android_content_ContentProvider__init_();
    }

    private void com_bilibili_lib_spy_generated_android_content_ContentProvider__init_() {
    }

    private void com_bilibili_lib_ui_life_MixinContentProvider__init_() {
    }

    private void com_bilibili_lib_ui_life_MixinContentProvider_attachInfo(@Nullable Context context, @Nullable ProviderInfo providerInfo) {
        if (!EntryPointKt.getHwPushOpt() || !getClass().getName().equals("com.huawei.hms.aaid.InitProvider")) {
            super.attachInfo(context, providerInfo);
        }
        C2860a.f22925a.e(this);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        com_bilibili_lib_ui_life_MixinContentProvider_attachInfo(context, providerInfo);
    }
}
