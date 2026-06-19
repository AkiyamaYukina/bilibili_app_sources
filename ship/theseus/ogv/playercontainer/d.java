package com.bilibili.ship.theseus.ogv.playercontainer;

import android.widget.LinearLayout;
import com.bilibili.ship.theseus.ogv.followseason.OgvPlayerFollowSeasonWidget;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import dagger.internal.Provider;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/d.class */
public final /* synthetic */ class d implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f94316a;

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        OgvPlayerFollowSeasonWidget ogvPlayerFollowSeasonWidget = (OgvPlayerFollowSeasonWidget) this.f94316a.get();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (aVar.f104445b == ControlContainerType.VERTICAL_FULLSCREEN) {
            layoutParams.leftMargin = Uj0.c.b(12.0f, aVar.f104444a);
        } else {
            layoutParams.leftMargin = Uj0.c.b(16.0f, aVar.f104444a);
        }
        layoutParams.topMargin = Uj0.c.b(15.0f, aVar.f104444a);
        ogvPlayerFollowSeasonWidget.setLayoutParams(layoutParams);
        ogvPlayerFollowSeasonWidget.setClipChildren(false);
        return ogvPlayerFollowSeasonWidget;
    }
}
