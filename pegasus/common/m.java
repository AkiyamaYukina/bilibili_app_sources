package com.bilibili.pegasus.common;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.supermenu.share.v2.ShareCallback;
import com.bilibili.droid.ToastHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/m.class */
public final class m implements ShareCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharePlane f75654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentActivity f75655b;

    public m(SharePlane sharePlane, FragmentActivity fragmentActivity) {
        this.f75654a = sharePlane;
        this.f75655b = fragmentActivity;
    }

    public final boolean onShareCancel(String str, int i7) {
        return false;
    }

    public final boolean onShareFail(String str, int i7, String str2) {
        ToastHelper.showToastLong(this.f75655b, str2);
        return true;
    }

    public final boolean onShareSuccess(String str, String str2) {
        boolean z6;
        SharePlane sharePlane = this.f75654a;
        if ((sharePlane != null ? sharePlane.getAvId() : 0L) > 0) {
            z6 = false;
        } else {
            ToastHelper.showToastLong(this.f75655b, 2131848273);
            z6 = true;
        }
        return z6;
    }
}
