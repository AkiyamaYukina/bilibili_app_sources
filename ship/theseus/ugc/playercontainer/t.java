package com.bilibili.ship.theseus.ugc.playercontainer;

import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import com.bilibili.app.gemini.ugc.feature.GeminiPlayerChargeWidget;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/t.class */
public final /* synthetic */ class t implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rW0.b f98359a;

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        GeminiPlayerChargeWidget geminiPlayerChargeWidget = new GeminiPlayerChargeWidget(aVar.f104444a);
        this.f98359a.injectMembers(geminiPlayerChargeWidget);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) DpUtils.dp2px(aVar.f104444a, 44.0f), -1);
        layoutParams.rightMargin = (int) DpUtils.dp2px(aVar.f104444a, 10.0f);
        geminiPlayerChargeWidget.setLayoutParams(layoutParams);
        int iDp2px = (int) DpUtils.dp2px(aVar.f104444a, 11.0f);
        geminiPlayerChargeWidget.setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
        geminiPlayerChargeWidget.setWidgetFrom(1);
        geminiPlayerChargeWidget.setCompoundDrawablesWithIntrinsicBounds(null, AppCompatResources.getDrawable(aVar.f104444a, 2131233501), null, null);
        return geminiPlayerChargeWidget;
    }
}
