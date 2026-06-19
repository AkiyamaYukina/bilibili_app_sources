package com.bilibili.ship.theseus.playlist.di.cache;

import android.content.Context;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.ship.theseus.united.page.videoquality.O;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/a.class */
public final /* synthetic */ class a implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95404a;

    @Override // com.bilibili.ship.theseus.united.page.videoquality.O
    public final void invoke() {
        Context context = this.f95404a;
        if (ConnectivityMonitor.getInstance().isNetworkActive()) {
            return;
        }
        ToastHelper.showToastShort(context, 2131851666);
    }
}
