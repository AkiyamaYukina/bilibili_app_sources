package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/x.class */
public final class x implements BiliGuideBubble.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KingPositionService f100488a;

    public x(KingPositionService kingPositionService) {
        this.f100488a = kingPositionService;
    }

    @Override // com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble.a
    public final void onClick() {
        KingPositionService kingPositionService = this.f100488a;
        BiliGuideBubble biliGuideBubble = kingPositionService.f100368R;
        if (biliGuideBubble != null && biliGuideBubble.isShowing()) {
            kingPositionService.f100370T = false;
            BiliGuideBubble biliGuideBubble2 = kingPositionService.f100368R;
            if (biliGuideBubble2 != null) {
                biliGuideBubble2.dismiss();
            }
        }
        kingPositionService.f100381l.f126351b.tryEmit(Unit.INSTANCE);
    }
}
