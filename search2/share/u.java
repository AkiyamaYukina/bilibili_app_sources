package com.bilibili.search2.share;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.common.utils.share.ListShareHelper;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import dt0.InterfaceC6845h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/share/u.class */
public final class u implements ShareContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC6845h f88721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentActivity f88722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f88725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f88726f;

    public u(InterfaceC6845h interfaceC6845h, FragmentActivity fragmentActivity, String str, int i7, boolean z6, boolean z7) {
        this.f88721a = interfaceC6845h;
        this.f88722b = fragmentActivity;
        this.f88723c = str;
        this.f88724d = i7;
        this.f88725e = z6;
        this.f88726f = z7;
    }

    public final Bundle getShareContent(String str) {
        ListShareHelper listShareHelper = ListShareHelper.INSTANCE;
        InterfaceC6845h interfaceC6845h = this.f88721a;
        Bundle shareContent$default = ListShareHelper.getShareContent$default(listShareHelper, this.f88722b, interfaceC6845h.getSharePanel(), str, this.f88723c, this.f88724d, (String) null, (Integer) null, (Long) null, false, this.f88725e, this.f88726f, interfaceC6845h.getOgvSubType(), WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, (Object) null);
        Bundle bundle = shareContent$default;
        if (shareContent$default == null) {
            bundle = new Bundle();
        }
        return bundle;
    }
}
