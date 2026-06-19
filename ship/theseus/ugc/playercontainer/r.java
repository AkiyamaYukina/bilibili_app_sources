package com.bilibili.ship.theseus.ugc.playercontainer;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.animation.core.v0;
import com.bilibili.app.gemini.player.widget.GeminiLandscapeTripleWrapperWidget;
import com.bilibili.app.gemini.ugc.feature.actions.GeminiPlayerFavoriteWidget;
import com.bilibili.ogv.infra.coroutine.StateFlowTransformKt;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/r.class */
public final /* synthetic */ class r implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rW0.b f98353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelationRepository f98354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f98355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rW0.b f98356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IPlayerSettingService f98357e;

    public /* synthetic */ r(rW0.b bVar, RelationRepository relationRepository, CoroutineScope coroutineScope, rW0.b bVar2, IPlayerSettingService iPlayerSettingService) {
        this.f98353a = bVar;
        this.f98354b = relationRepository;
        this.f98355c = coroutineScope;
        this.f98356d = bVar2;
        this.f98357e = iPlayerSettingService;
    }

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        int iDp2px = (int) DpUtils.dp2px(aVar.f104444a, 22.0f);
        GeminiPlayerFavoriteWidget geminiPlayerFavoriteWidget = new GeminiPlayerFavoriteWidget(aVar.f104444a);
        this.f98353a.injectMembers(geminiPlayerFavoriteWidget);
        geminiPlayerFavoriteWidget.setWidgetFrom(1);
        geminiPlayerFavoriteWidget.setGravity(17);
        Drawable drawable = AppCompatResources.getDrawable(aVar.f104444a, 2131233507);
        if (drawable != null) {
            drawable.setBounds(0, 0, iDp2px, iDp2px);
        }
        geminiPlayerFavoriteWidget.setCompoundDrawables(null, drawable, null, null);
        GeminiLandscapeTripleWrapperWidget geminiLandscapeTripleWrapperWidget = new GeminiLandscapeTripleWrapperWidget(aVar.f104444a, geminiPlayerFavoriteWidget, StateFlowTransformKt.a(this.f98354b.f104004m, this.f98355c, new v0(3)), new K9.h(this.f98357e, 6));
        this.f98356d.injectMembers(geminiLandscapeTripleWrapperWidget);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) DpUtils.dp2px(aVar.f104444a, 44.0f), -1);
        layoutParams.rightMargin = (int) DpUtils.dp2px(aVar.f104444a, 10.0f);
        geminiLandscapeTripleWrapperWidget.setLayoutParams(layoutParams);
        return geminiLandscapeTripleWrapperWidget;
    }
}
