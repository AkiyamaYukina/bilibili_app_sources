package com.bilibili.ogv.operation.entrance.filmlist;

import com.bilibili.droid.ToastHelper;
import com.bilibili.ogv.community.bean.BangumiFollowStatus;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/l.class */
public final class l<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f70051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OGVFilmListFragment f70052b;

    public l(q qVar, OGVFilmListFragment oGVFilmListFragment) {
        this.f70051a = qVar;
        this.f70052b = oGVFilmListFragment;
    }

    public final void accept(Object obj) {
        BangumiFollowStatus bangumiFollowStatus = (BangumiFollowStatus) obj;
        q qVar = this.f70051a;
        boolean z6 = qVar.f70093q;
        boolean z7 = !z6;
        if (z7 != z6) {
            qVar.f70093q = z7;
            qVar.notifyPropertyChanged(216);
        }
        ToastHelper.showToastShort(this.f70052b.getContext(), bangumiFollowStatus.f67504b);
    }
}
