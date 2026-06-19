package com.bilibili.pegasus.utils;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.supermenu.share.v2.ShareCallback;
import com.bilibili.droid.ToastHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/C.class */
public final class C implements ShareCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharePlane f78851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentActivity f78852b;

    public C(SharePlane sharePlane, FragmentActivity fragmentActivity) {
        this.f78851a = sharePlane;
        this.f78852b = fragmentActivity;
    }

    public final boolean onShareCancel(String str, int i7) {
        return false;
    }

    public final boolean onShareFail(String str, int i7, String str2) {
        ToastHelper.showToastLong(this.f78852b, str2);
        return true;
    }

    public final boolean onShareSuccess(String str, String str2) {
        boolean z6;
        SharePlane sharePlane = this.f78851a;
        if ((sharePlane != null ? sharePlane.getAvId() : 0L) > 0) {
            z6 = false;
        } else {
            ToastHelper.showToastLong(this.f78852b, 2131848273);
            z6 = true;
        }
        return z6;
    }
}
