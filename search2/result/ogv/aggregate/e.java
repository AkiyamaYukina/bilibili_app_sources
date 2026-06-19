package com.bilibili.search2.result.ogv.aggregate;

import android.view.View;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.result.bangumi.SearchPgcFavoriteResult;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/e.class */
public final class e extends BiliApiDataCallback<SearchPgcFavoriteResult> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f88353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f88354c;

    public e(d dVar, View view) {
        this.f88353b = dVar;
        this.f88354c = view;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(SearchPgcFavoriteResult searchPgcFavoriteResult) {
        SearchPgcFavoriteResult searchPgcFavoriteResult2 = searchPgcFavoriteResult;
        d dVar = this.f88353b;
        ((SearchBangumiItem) dVar.getData()).setAtten(0);
        dVar.w0();
        ToastHelper.showToastShort(this.f88354c.getContext(), searchPgcFavoriteResult2 != null ? searchPgcFavoriteResult2.getToast() : null);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        ToastHelper.showToastShort(this.f88354c.getContext(), 2131841343);
    }
}
