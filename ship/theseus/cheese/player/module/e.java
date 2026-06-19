package com.bilibili.ship.theseus.cheese.player.module;

import com.bilibili.app.gemini.player.widget.online.GeminiPlayerOnlineWidget;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/e.class */
public final /* synthetic */ class e implements com.bilibili.ship.theseus.united.player.controlcontainer.a {
    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.a
    public final void a(com.bilibili.app.gemini.player.widget.a aVar) {
        List listC = aVar.c();
        if (listC != null) {
            ((ArrayList) listC).remove(GeminiPlayerOnlineWidget.class);
        }
    }
}
