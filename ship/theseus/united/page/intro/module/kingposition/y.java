package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.playset.widget.favorite.FavSnackBarUtil;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/y.class */
public final class y implements FavSnackBarUtil.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KingPositionTripleService f100489a;

    public y(KingPositionTripleService kingPositionTripleService) {
        this.f100489a = kingPositionTripleService;
    }

    @Override // com.bilibili.playset.widget.favorite.FavSnackBarUtil.b
    public final void onClick() {
        this.f100489a.f100439g.f100316B.tryEmit(Unit.INSTANCE);
    }

    @Override // com.bilibili.playset.widget.favorite.FavSnackBarUtil.b
    public final void onDismiss() {
        if (sh1.d.a.getBoolean("pref_key_fav_guide_exposed_unite", false)) {
            return;
        }
        this.f100489a.f100439g.f100320F.tryEmit(Unit.INSTANCE);
    }
}
