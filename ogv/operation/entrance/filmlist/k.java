package com.bilibili.ogv.operation.entrance.filmlist;

import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.sharewrapper.ShareHelper;
import com.bilibili.lib.sharewrapper.ShareResult;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/k.class */
public final class k implements ShareHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OGVFilmListFragment f70050a;

    public k(OGVFilmListFragment oGVFilmListFragment) {
        this.f70050a = oGVFilmListFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e2  */
    @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle getShareContent(java.lang.String r8) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.entrance.filmlist.k.getShareContent(java.lang.String):android.os.Bundle");
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
    public final void onShareCancel(String str, ShareResult shareResult) {
        this.f70050a.f69994g = null;
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
    public final void onShareFail(String str, ShareResult shareResult) {
        OGVFilmListFragment oGVFilmListFragment = this.f70050a;
        ToastHelper.showToastShort(oGVFilmListFragment.getContext(), 2131822095);
        oGVFilmListFragment.f69994g = null;
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
    public final void onShareSuccess(String str, ShareResult shareResult) {
        OGVFilmListFragment oGVFilmListFragment = this.f70050a;
        ToastHelper.showToastShort(oGVFilmListFragment.getContext(), 2131822098);
        oGVFilmListFragment.f69994g = null;
    }
}
