package com.bilibili.ship.theseus.ogv.playercontainer;

import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.GravityCompat;
import com.bilibili.app.gemini.player.widget.online.GeminiPlayerOnlineWidget;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/e.class */
public final /* synthetic */ class e implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rW0.b f94317a;

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        GeminiPlayerOnlineWidget geminiPlayerOnlineWidget = new GeminiPlayerOnlineWidget(aVar.f104444a, 0);
        this.f94317a.injectMembers(geminiPlayerOnlineWidget);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = Uj0.c.b(44, aVar.f104444a);
        layoutParams.gravity = GravityCompat.START;
        geminiPlayerOnlineWidget.setLayoutParams(layoutParams);
        int iB = Uj0.c.b(2, aVar.f104444a);
        geminiPlayerOnlineWidget.setPadding(iB, iB, iB, iB);
        geminiPlayerOnlineWidget.setSingleLine();
        geminiPlayerOnlineWidget.setTextColor(AppCompatResources.getColorStateList(aVar.f104444a, 2131100123));
        geminiPlayerOnlineWidget.setTextSize(10.0f);
        geminiPlayerOnlineWidget.setVisibility(8);
        return geminiPlayerOnlineWidget;
    }
}
