package com.bilibili.playset;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.list.common.utils.share.ListShareHelper;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import com.bilibili.playset.api.MultitypeMedia;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/K0.class */
public final class K0 implements ShareContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultitypeMedia f83881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H0 f83882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FragmentActivity f83883c;

    public K0(FragmentActivity fragmentActivity, H0 h02, MultitypeMedia multitypeMedia) {
        this.f83881a = multitypeMedia;
        this.f83882b = h02;
        this.f83883c = fragmentActivity;
    }

    public final Bundle getShareContent(String str) {
        ListShareHelper listShareHelper = ListShareHelper.INSTANCE;
        MultitypeMedia multitypeMedia = this.f83881a;
        int i7 = multitypeMedia.totalPage;
        long shareSid = multitypeMedia.getShareSid();
        this.f83882b.getClass();
        int iE = H0.e(multitypeMedia);
        boolean zF = H0.f(multitypeMedia);
        MultitypeMedia.OGV ogv = multitypeMedia.ogv;
        Bundle shareContent$default = ListShareHelper.getShareContent$default(listShareHelper, this.f83883c, multitypeMedia, str, (String) null, iE, (String) null, Integer.valueOf(i7), Long.valueOf(shareSid), true, false, zF, ogv != null ? ogv.seasonType : 0, 552, (Object) null);
        Bundle bundle = shareContent$default;
        if (shareContent$default == null) {
            bundle = new Bundle();
        }
        return bundle;
    }
}
