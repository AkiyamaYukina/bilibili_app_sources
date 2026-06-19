package com.bilibili.ship.theseus.ugc.playercontainer;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/n.class */
public final /* synthetic */ class n implements com.bilibili.ship.theseus.united.player.controlcontainer.a {
    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.a
    public final void a(com.bilibili.app.gemini.player.widget.a aVar) {
        List listB = aVar.b();
        if (listB != null) {
            ((ArrayList) listB).add(0, com.bilibili.ship.theseus.ugc.recommend.h.class);
        }
    }
}
