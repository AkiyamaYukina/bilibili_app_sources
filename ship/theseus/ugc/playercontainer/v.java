package com.bilibili.ship.theseus.ugc.playercontainer;

import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import com.bilibili.app.gemini.ugc.feature.GeminiPlayerDislikeWidget;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/v.class */
public final /* synthetic */ class v implements com.bilibili.ship.theseus.united.player.controlcontainer.d {
    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        GeminiPlayerDislikeWidget geminiPlayerDislikeWidget = new GeminiPlayerDislikeWidget(aVar.f104444a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) DpUtils.dp2px(aVar.f104444a, 44.0f), -1);
        layoutParams.rightMargin = (int) DpUtils.dp2px(aVar.f104444a, 10.0f);
        geminiPlayerDislikeWidget.setLayoutParams(layoutParams);
        int iDp2px = (int) DpUtils.dp2px(aVar.f104444a, 11.0f);
        geminiPlayerDislikeWidget.setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
        geminiPlayerDislikeWidget.setWidgetFrom(1);
        geminiPlayerDislikeWidget.setCompoundDrawablesWithIntrinsicBounds(null, AppCompatResources.getDrawable(aVar.f104444a, 2131233505), null, null);
        return geminiPlayerDislikeWidget;
    }
}
