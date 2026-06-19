package com.bilibili.search2.result.bangumi;

import android.view.View;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.search2.api.SearchBangumiItem;

/* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/h.class */
public final class C6068h extends BiliApiDataCallback<SearchPgcFavoriteResult> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6066f f87423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f87424c;

    public C6068h(C6066f c6066f, View view) {
        this.f87423b = c6066f;
        this.f87424c = view;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(SearchPgcFavoriteResult searchPgcFavoriteResult) {
        SearchPgcFavoriteResult searchPgcFavoriteResult2 = searchPgcFavoriteResult;
        C6066f c6066f = this.f87423b;
        ((SearchBangumiItem) c6066f.getData()).setAtten(1);
        c6066f.w0();
        ToastHelper.showToastShort(this.f87424c.getContext(), searchPgcFavoriteResult2 != null ? searchPgcFavoriteResult2.getToast() : null);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        ToastHelper.showToastShort(this.f87424c.getContext(), 2131841343);
    }
}
