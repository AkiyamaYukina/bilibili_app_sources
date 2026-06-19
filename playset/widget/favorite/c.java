package com.bilibili.playset.widget.favorite;

import com.bilibili.playset.widget.favorite.FavSnackBarUtil;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/c.class */
public final class c implements com.bilibili.playset.widget.favorite.snackbar.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavSnackBarUtil.c f85740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavSnackBarUtil.b f85741b;

    public c(FavSnackBarUtil.c cVar, FavSnackBarUtil.b bVar) {
        this.f85740a = cVar;
        this.f85741b = bVar;
    }

    @Override // com.bilibili.playset.widget.favorite.snackbar.a
    public final void onDismiss() {
        this.f85741b.onDismiss();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.playset.widget.favorite.snackbar.a
    public final void onShow() throws NoWhenBranchMatchedException {
        FavSnackBarUtil.a(true, this.f85740a);
        this.f85741b.onShow();
    }
}
