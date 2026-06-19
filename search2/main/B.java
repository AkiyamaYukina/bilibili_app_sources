package com.bilibili.search2.main;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.search2.api.SearchSquareType;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/B.class */
public final class B extends BiliApiDataCallback<List<? extends SearchSquareType>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainSearchViewModel f86619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f86620c;

    public B(MainSearchViewModel mainSearchViewModel, J j7) {
        this.f86619b = mainSearchViewModel;
        this.f86620c = j7;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(List<? extends SearchSquareType> list) {
        List<? extends SearchSquareType> list2 = list;
        List<? extends SearchSquareType> list3 = null;
        if (list2 != null) {
            if (list2.isEmpty()) {
                list2 = null;
            }
            list3 = null;
            if (list2 != null) {
                list3 = list2;
            }
        }
        com.bilibili.search2.main.data.i iVar = new com.bilibili.search2.main.data.i(list3);
        MainSearchViewModel mainSearchViewModel = this.f86619b;
        mainSearchViewModel.f86734g.setValue(iVar);
        this.f86620c.invoke(mainSearchViewModel.f86735i.getValue(), mainSearchViewModel.f86736j.getValue());
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        BLog.e("MainSearchViewModel", "Request square data error", th);
        this.f86620c.invoke(null, null);
    }
}
