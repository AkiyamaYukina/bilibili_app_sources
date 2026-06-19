package com.bilibili.ship.theseus.ogv.playercontainer;

import com.bilibili.app.gemini.player.widget.online.GeminiPlayerOnlineWidget;
import com.bilibili.ship.theseus.ogv.followseason.OgvPlayerFollowSeasonWidget;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/c.class */
public final /* synthetic */ class c implements com.bilibili.ship.theseus.united.player.controlcontainer.a {
    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.a
    public final void a(com.bilibili.app.gemini.player.widget.a aVar) {
        List list = aVar.i;
        if (list != null) {
            list.add(0, Nu0.a.class);
        }
        List list2 = aVar.k;
        if (list2 != null) {
            list2.add(0, com.bilibili.ship.theseus.ogv.dubbing.i.class);
        }
        List listC = aVar.c();
        if (listC != null) {
            ((ArrayList) listC).add(0, OgvPlayerFollowSeasonWidget.class);
        }
        List listC2 = aVar.c();
        if (listC2 != null) {
            ((ArrayList) listC2).add(0, GeminiPlayerOnlineWidget.class);
        }
        List listF = aVar.f();
        if (listF != null) {
            ((ArrayList) listF).add(0, OgvPlayerFollowSeasonWidget.class);
        }
        List listG = aVar.g();
        if (listG != null) {
            ((ArrayList) listG).add(0, GeminiPlayerOnlineWidget.class);
        }
    }
}
