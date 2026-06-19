package com.bilibili.ship.theseus.ogv.playercontainer;

import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/a.class */
public final /* synthetic */ class a implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.ogv.dubbing.i f94314a;

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        com.bilibili.ship.theseus.ogv.dubbing.i iVar = this.f94314a;
        iVar.setLayoutParams(layoutParams);
        int iA = (int) Uj0.c.a(11, aVar.f104444a);
        iVar.setTextColor(AppCompatResources.getColorStateList(aVar.f104444a, 2131100123));
        iVar.setTextSize(14.0f);
        iVar.setGravity(17);
        iVar.setPadding(iA, iA, iA, iA);
        return iVar;
    }
}
