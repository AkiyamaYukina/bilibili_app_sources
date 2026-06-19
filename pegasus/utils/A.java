package com.bilibili.pegasus.utils;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.supermenu.share.v2.ShareCallback;
import com.bilibili.droid.ToastHelper;
import com.bilibili.pegasus.api.modelv2.ThreePointV4Item;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/A.class */
public final class A implements ShareCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreePointV4Item.SharePlaneItem f78844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentActivity f78845b;

    public A(ThreePointV4Item.SharePlaneItem sharePlaneItem, FragmentActivity fragmentActivity) {
        this.f78844a = sharePlaneItem;
        this.f78845b = fragmentActivity;
    }

    public final boolean onShareCancel(String str, int i7) {
        return false;
    }

    public final boolean onShareFail(String str, int i7, String str2) {
        FragmentActivity fragmentActivity = this.f78845b;
        String string = str2;
        if (str2 == null) {
            string = fragmentActivity.getString(2131845359);
        }
        ToastHelper.showToastLong(fragmentActivity, string);
        return true;
    }

    public final boolean onShareSuccess(String str, String str2) {
        boolean z6;
        ThreePointV4Item.SharePlaneItem sharePlaneItem = this.f78844a;
        if ((sharePlaneItem != null ? sharePlaneItem.getAvId() : 0L) > 0) {
            z6 = false;
        } else {
            ToastHelper.showToastLong(this.f78845b, 2131848273);
            z6 = true;
        }
        return z6;
    }
}
