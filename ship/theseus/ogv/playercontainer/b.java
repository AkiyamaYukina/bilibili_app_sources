package com.bilibili.ship.theseus.ogv.playercontainer;

import android.widget.LinearLayout;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import dagger.internal.Provider;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/b.class */
public final /* synthetic */ class b implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f94315a;

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        Nu0.a aVar2 = (Nu0.a) this.f94315a.get();
        aVar2.setLayoutParams(new LinearLayout.LayoutParams(Uj0.c.b(55, aVar.f104444a), Uj0.c.b(44, aVar.f104444a)));
        aVar2.setClipChildren(false);
        return aVar2;
    }
}
