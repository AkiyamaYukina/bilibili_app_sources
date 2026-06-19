package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.content.DialogInterface;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/s.class */
public final /* synthetic */ class s implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KingPositionService f100475a;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        KingPositionRepository kingPositionRepository = this.f100475a.f100379j;
        kingPositionRepository.f100322H.setValue(Boolean.FALSE);
    }
}
