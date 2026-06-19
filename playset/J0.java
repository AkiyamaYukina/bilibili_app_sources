package com.bilibili.playset;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.supermenu.share.v2.ShareCallback;
import com.bilibili.droid.ToastHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/J0.class */
public final class J0 implements ShareCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f83879a;

    public J0(FragmentActivity fragmentActivity) {
        this.f83879a = fragmentActivity;
    }

    public final boolean onShareCancel(String str, int i7) {
        return false;
    }

    public final boolean onShareFail(String str, int i7, String str2) {
        ToastHelper.showToastLong(this.f83879a, str2);
        return true;
    }

    public final boolean onShareSuccess(String str, String str2) {
        ToastHelper.showToastLong(this.f83879a, 2131848273);
        return true;
    }
}
