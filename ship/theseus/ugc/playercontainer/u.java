package com.bilibili.ship.theseus.ugc.playercontainer;

import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.bilibili.app.gemini.player.widget.online.GeminiPlayerOnlineWidget;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/u.class */
public final /* synthetic */ class u implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rW0.b f98360a;

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        GeminiPlayerOnlineWidget geminiPlayerOnlineWidget = new GeminiPlayerOnlineWidget(aVar.f104444a, 0);
        this.f98360a.injectMembers(geminiPlayerOnlineWidget);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) DpUtils.dp2px(aVar.f104444a, 44.0f);
        layoutParams.gravity = GravityCompat.START;
        geminiPlayerOnlineWidget.setLayoutParams(layoutParams);
        int iDp2px = (int) DpUtils.dp2px(aVar.f104444a, 2.0f);
        geminiPlayerOnlineWidget.setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
        geminiPlayerOnlineWidget.setSingleLine();
        geminiPlayerOnlineWidget.setTextColor(ContextCompat.getColor(aVar.f104444a, 2131100123));
        geminiPlayerOnlineWidget.setTextSize(10.0f);
        geminiPlayerOnlineWidget.setVisibility(8);
        return geminiPlayerOnlineWidget;
    }
}
