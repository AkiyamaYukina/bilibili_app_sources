package com.bilibili.playset.widget.favorite.snackbar;

import androidx.core.util.Consumer;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/snackbar/b.class */
public final /* synthetic */ class b implements Consumer {
    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        BLog.i("SnackBarManager", "dismiss cause of Configuration change");
        SnackBarManager.a();
    }
}
