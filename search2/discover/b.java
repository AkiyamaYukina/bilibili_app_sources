package com.bilibili.search2.discover;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.search2.api.SearchReferral;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/b.class */
public final class b extends BiliApiDataCallback<SearchReferral> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f86427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f86428c;

    public b(int i7, k kVar) {
        this.f86427b = i7;
        this.f86428c = kVar;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(SearchReferral searchReferral) {
        SearchReferral searchReferral2 = searchReferral;
        List<SearchReferral.Guess> list = searchReferral2 != null ? searchReferral2.getList() : null;
        if (list != null) {
            for (SearchReferral.Guess guess : list) {
                guess.trackId = searchReferral2.getTrackId();
                guess.abtestId = searchReferral2.getExpStr();
                guess.from = this.f86427b;
            }
        }
        k kVar = this.f86428c;
        if (kVar != null) {
            kVar.b(list);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
    }
}
