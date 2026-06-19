package com.bilibili.ogv.operation.entrance.filmlist;

import com.bilibili.droid.ToastHelper;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/m.class */
public final class m<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OGVFilmListFragment f70053a;

    public m(OGVFilmListFragment oGVFilmListFragment) {
        this.f70053a = oGVFilmListFragment;
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        ToastHelper.showToastShort(this.f70053a.getContext(), 2131832098);
        if (com.bilibili.ogv.infra.util.e.a(th)) {
            return;
        }
        com.bilibili.ogv.infra.util.e.b(th);
    }
}
