package com.bilibili.search2.share;

import android.content.Context;
import com.bilibili.app.comm.list.common.inlineshare.PageObscuredListener;
import com.bilibili.app.comm.supermenu.share.pic.IPosterShareListener;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.sharewrapper.ShareResult;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/share/v.class */
public final class v implements IPosterShareListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PageObscuredListener f88727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f88728b;

    public v(PageObscuredListener pageObscuredListener, Context context) {
        this.f88727a = pageObscuredListener;
        this.f88728b = context;
    }

    public final void onDismiss() {
        PageObscuredListener pageObscuredListener = this.f88727a;
        if (pageObscuredListener != null) {
            pageObscuredListener.onObscureStateChanged(false);
        }
    }

    public final void onShareClick(String str) {
    }

    public final void onShareSuccess(String str, ShareResult shareResult) {
        ToastHelper.showToastLong(this.f88728b, 2131848273);
    }
}
