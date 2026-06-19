package com.bilibili.ship.theseus.playlist.di.biz.ugc;

import com.bilibili.ship.theseus.ugc.recommend.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/b.class */
public final /* synthetic */ class b implements com.bilibili.ship.theseus.united.player.controlcontainer.a {
    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.a
    public final void a(com.bilibili.app.gemini.player.widget.a aVar) {
        List listB = aVar.b();
        if (listB != null) {
            ((ArrayList) listB).remove(h.class);
        }
    }
}
