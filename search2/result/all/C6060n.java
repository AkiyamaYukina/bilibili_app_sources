package com.bilibili.search2.result.all;

import com.bilibili.app.comm.list.common.search.IOgvThemeColorCallback;
import com.bilibili.gripper.api.ad.biz.search.OGVTheme;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/n.class */
public final class C6060n implements OGVTheme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f87305a;

    public C6060n(p pVar) {
        this.f87305a = pVar;
    }

    public final IOgvThemeColorCallback getOgvThemeColorCallback() {
        BaseFragment baseFragment = this.f87305a.f87307e;
        if (baseFragment instanceof SearchResultAllFragment) {
            return ((SearchResultAllFragment) baseFragment).K2();
        }
        BLog.e("SearchResultAllAdapter", "getOgvThemeColorCallback error ");
        return null;
    }

    public final int getOgvTitleHeight() {
        return (int) OgvThemeColorHelper.f88261s;
    }
}
