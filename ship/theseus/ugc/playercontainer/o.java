package com.bilibili.ship.theseus.ugc.playercontainer;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import com.bilibili.app.gemini.player.widget.GeminiLandscapeTripleWrapperWidget;
import com.bilibili.app.gemini.player.widget.coin.GeminiPlayerCoinWidget;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/o.class */
public final /* synthetic */ class o implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rW0.b f98348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rW0.b f98349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IPlayerSettingService f98350c;

    public /* synthetic */ o(rW0.b bVar, rW0.b bVar2, IPlayerSettingService iPlayerSettingService) {
        this.f98348a = bVar;
        this.f98349b = bVar2;
        this.f98350c = iPlayerSettingService;
    }

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        int iDp2px = (int) DpUtils.dp2px(aVar.f104444a, 22.0f);
        GeminiPlayerCoinWidget geminiPlayerCoinWidget = new GeminiPlayerCoinWidget(aVar.f104444a);
        this.f98348a.injectMembers(geminiPlayerCoinWidget);
        geminiPlayerCoinWidget.setWidgetFrom(1);
        geminiPlayerCoinWidget.setGravity(17);
        Drawable drawable = AppCompatResources.getDrawable(aVar.f104444a, 2131233503);
        if (drawable != null) {
            drawable.setBounds(0, 0, iDp2px, iDp2px);
        }
        geminiPlayerCoinWidget.setCompoundDrawables(null, drawable, null, null);
        GeminiLandscapeTripleWrapperWidget geminiLandscapeTripleWrapperWidget = new GeminiLandscapeTripleWrapperWidget(aVar.f104444a, geminiPlayerCoinWidget, (StateFlow) null, new com.bilibili.biligame.ui.pay.cdk.j(this.f98350c, 3));
        this.f98349b.injectMembers(geminiLandscapeTripleWrapperWidget);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) DpUtils.dp2px(aVar.f104444a, 44.0f), -1);
        layoutParams.rightMargin = (int) DpUtils.dp2px(aVar.f104444a, 10.0f);
        geminiLandscapeTripleWrapperWidget.setLayoutParams(layoutParams);
        return geminiLandscapeTripleWrapperWidget;
    }
}
