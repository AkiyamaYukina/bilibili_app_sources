package com.bilibili.search2.share;

import android.content.Context;
import com.bilibili.app.comm.supermenu.share.v2.ShareCallback;
import com.bilibili.droid.ToastHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/share/s.class */
public final class s implements ShareCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f88716b;

    public s(String str, Context context) {
        this.f88715a = str;
        this.f88716b = context;
    }

    public final boolean onShareCancel(String str, int i7) {
        return false;
    }

    public final boolean onShareFail(String str, int i7, String str2) {
        ToastHelper.showToastLong(this.f88716b, str2);
        return true;
    }

    public final boolean onShareSuccess(String str, String str2) {
        boolean z6;
        if (this.f88715a != null) {
            z6 = false;
        } else {
            ToastHelper.showToastLong(this.f88716b, 2131848273);
            z6 = true;
        }
        return z6;
    }
}
