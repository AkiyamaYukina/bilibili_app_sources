package com.bilibili.search2.utils;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.supermenu.share.v2.ShareCallback;
import com.bilibili.droid.ToastHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/w.class */
public final class w implements ShareCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f88869a;

    public w(FragmentActivity fragmentActivity) {
        this.f88869a = fragmentActivity;
    }

    public final boolean onShareCancel(String str, int i7) {
        return false;
    }

    public final boolean onShareFail(String str, int i7, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        FragmentActivity fragmentActivity = this.f88869a;
        if (zIsEmpty) {
            str2 = fragmentActivity.getString(2131848270);
        }
        ToastHelper.showToast(fragmentActivity, str2, 1);
        return true;
    }

    public final boolean onShareSuccess(String str, String str2) {
        return false;
    }
}
