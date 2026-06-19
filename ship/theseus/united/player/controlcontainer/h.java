package com.bilibili.ship.theseus.united.player.controlcontainer;

import com.bilibili.playerbizcommonv2.widget.speed.PlayerSpeedWidget;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractHistoriesWidget;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/h.class */
public final /* synthetic */ class h implements a {
    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.a
    public final void a(com.bilibili.app.gemini.player.widget.a aVar) {
        int iIndexOf;
        List list = aVar.k;
        if (list == null || (iIndexOf = list.indexOf(PlayerSpeedWidget.class)) < 0) {
            return;
        }
        list.add(iIndexOf, TheseusInteractHistoriesWidget.class);
    }
}
