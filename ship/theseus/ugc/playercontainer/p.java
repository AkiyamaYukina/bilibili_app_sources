package com.bilibili.ship.theseus.ugc.playercontainer;

import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bilibili.app.gemini.ugc.feature.GeminiPlayerBgmWidget;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/p.class */
public final /* synthetic */ class p implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rW0.b f98351a;

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        GeminiPlayerBgmWidget geminiPlayerBgmWidget = new GeminiPlayerBgmWidget(aVar.f104444a);
        this.f98351a.injectMembers(geminiPlayerBgmWidget);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = (int) DpUtils.dp2px(aVar.f104444a, 12.0f);
        layoutParams.gravity = GravityCompat.END;
        geminiPlayerBgmWidget.setLayoutParams(layoutParams);
        geminiPlayerBgmWidget.setVisibility(8);
        geminiPlayerBgmWidget.setId(2131320473);
        return geminiPlayerBgmWidget;
    }
}
