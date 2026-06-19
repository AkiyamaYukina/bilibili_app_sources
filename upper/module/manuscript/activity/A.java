package com.bilibili.upper.module.manuscript.activity;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.upper.api.bean.manuscript.EncodeMobileBean;
import com.bilibili.upper.module.manuscript.fragment.ManuscriptDeleteVerifyDialog;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/A.class */
public final class A extends BiliApiDataCallback<EncodeMobileBean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nI0.n f113393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ManuscriptsSearchActivity f113394c;

    public A(ManuscriptsSearchActivity manuscriptsSearchActivity, nI0.n nVar) {
        this.f113394c = manuscriptsSearchActivity;
        this.f113393b = nVar;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(@Nullable EncodeMobileBean encodeMobileBean) {
        EncodeMobileBean encodeMobileBean2 = encodeMobileBean;
        BLog.i("ManuscriptsSearchActivity", "getEnCodeMobileNumber onDataSuccess");
        nI0.n nVar = this.f113393b;
        ManuscriptsSearchActivity manuscriptsSearchActivity = this.f113394c;
        if (encodeMobileBean2 == null || TextUtils.isEmpty(encodeMobileBean2.countryCode) || TextUtils.isEmpty(encodeMobileBean2.tel)) {
            ToastHelper.showToastShort(manuscriptsSearchActivity, 2131851008);
            return;
        }
        ManuscriptDeleteVerifyDialog manuscriptDeleteVerifyDialog = new ManuscriptDeleteVerifyDialog();
        String str = encodeMobileBean2.tel;
        String str2 = encodeMobileBean2.countryCode;
        manuscriptDeleteVerifyDialog.f113591e = str;
        manuscriptDeleteVerifyDialog.f113592f = str2;
        manuscriptDeleteVerifyDialog.f113607v = nVar;
        manuscriptDeleteVerifyDialog.showNow(manuscriptsSearchActivity.getSupportFragmentManager(), "ManuscriptDeleteVerifyDialog");
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        BLog.i("ManuscriptsSearchActivity", "getEnCodeMobileNumber onError");
        ToastHelper.showToastShort(this.f113394c, 2131851008);
    }
}
