package com.bilibili.ship.theseus.ugc.playercontainer;

import android.widget.LinearLayout;
import com.bilibili.app.gemini.player.widget.comment.GeminiPlayerLandscapeCommentWidget;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/s.class */
public final /* synthetic */ class s implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rW0.b f98358a;

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        GeminiPlayerLandscapeCommentWidget geminiPlayerLandscapeCommentWidget = new GeminiPlayerLandscapeCommentWidget(aVar.f104444a);
        this.f98358a.injectMembers(geminiPlayerLandscapeCommentWidget);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(NewPlayerUtilsKt.toPx(44.0f), -1);
        layoutParams.rightMargin = NewPlayerUtilsKt.toPx(10.0f);
        geminiPlayerLandscapeCommentWidget.setLayoutParams(layoutParams);
        geminiPlayerLandscapeCommentWidget.setWidgetFrom(1);
        return geminiPlayerLandscapeCommentWidget;
    }
}
