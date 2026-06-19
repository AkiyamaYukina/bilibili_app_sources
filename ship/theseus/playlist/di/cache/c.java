package com.bilibili.ship.theseus.playlist.di.cache;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/c.class */
public final /* synthetic */ class c implements com.bilibili.ship.theseus.united.player.controlcontainer.a {
    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.a
    public final void a(com.bilibili.app.gemini.player.widget.a aVar) {
        List listC = aVar.c();
        if (listC != null) {
            ((ArrayList) listC).clear();
        }
        List list = aVar.i;
        if (list != null) {
            list.clear();
        }
        List listB = aVar.b();
        if (listB != null) {
            ((ArrayList) listB).clear();
        }
        List listF = aVar.f();
        if (listF != null) {
            ((ArrayList) listF).clear();
        }
    }
}
