package com.bilibili.ship.theseus.ugc.playercontainer;

import android.widget.LinearLayout;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import dagger.internal.Provider;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/q.class */
public final /* synthetic */ class q implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f98352a;

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        Object obj = this.f98352a.get();
        com.bilibili.ship.theseus.ugc.recommend.h hVar = (com.bilibili.ship.theseus.ugc.recommend.h) obj;
        hVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        hVar.setId(2131313236);
        return (IControlWidget) obj;
    }
}
