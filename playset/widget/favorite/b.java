package com.bilibili.playset.widget.favorite;

import android.view.View;
import com.bilibili.playset.widget.favorite.FavSnackBarUtil;
import com.bilibili.playset.widget.favorite.snackbar.SnackBarManager;
import kotlin.NoWhenBranchMatchedException;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/b.class */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavSnackBarUtil.c f85738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavSnackBarUtil.b f85739b;

    public b(FavSnackBarUtil.c cVar, FavSnackBarUtil.b bVar) {
        this.f85738a = cVar;
        this.f85739b = bVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NoWhenBranchMatchedException {
        BLog.i("FavSnackBarUtil", "dismiss cause of click btn");
        SnackBarManager.a();
        FavSnackBarUtil.a(false, this.f85738a);
        this.f85739b.onClick();
    }
}
