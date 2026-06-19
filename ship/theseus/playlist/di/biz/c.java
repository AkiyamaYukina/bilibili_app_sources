package com.bilibili.ship.theseus.playlist.di.biz;

import com.bilibili.app.gemini.player.widget.selector.GeminiVideoListSelectorWidget;
import com.bilibili.ship.theseus.playlist.selector.o;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/c.class */
public final /* synthetic */ class c implements com.bilibili.ship.theseus.united.player.controlcontainer.a {
    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.a
    public final void a(com.bilibili.app.gemini.player.widget.a aVar) {
        List list = aVar.k;
        if (list != null) {
            list.set(list.indexOf(GeminiVideoListSelectorWidget.class), o.class);
        }
    }
}
