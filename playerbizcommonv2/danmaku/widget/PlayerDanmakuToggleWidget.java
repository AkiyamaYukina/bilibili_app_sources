package com.bilibili.playerbizcommonv2.danmaku.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.ControlWidgetChangedObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.core.DanmakuVisibleObserver;
import tv.danmaku.biliplayerv2.service.interact.core.IInteractCoreService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/PlayerDanmakuToggleWidget.class */
@StabilityInferred(parameters = 0)
public final class PlayerDanmakuToggleWidget extends Zq0.e implements IControlWidget, View.OnClickListener, DanmakuVisibleObserver {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f81618l = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Inject
    public IControlContainerService f81619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Inject
    public IInteractLayerService f81620g;

    @Inject
    public IReporterService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Inject
    public IPlayerSettingService f81621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a f81622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f81623k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/PlayerDanmakuToggleWidget$a.class */
    public static final class a implements ControlWidgetChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuToggleWidget f81624a;

        public a(PlayerDanmakuToggleWidget playerDanmakuToggleWidget) {
            this.f81624a = playerDanmakuToggleWidget;
        }

        public final void onControllerWidgetChanged() {
            int i7 = PlayerDanmakuToggleWidget.f81618l;
            this.f81624a.z();
        }
    }

    public PlayerDanmakuToggleWidget(@NotNull Context context) {
        super(context);
        this.f81622j = new a(this);
        this.f81623k = true;
        q();
    }

    public PlayerDanmakuToggleWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81622j = new a(this);
        this.f81623k = true;
        q();
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        if (playerContainer2.getPlayerParams().getConfig().getTheme() == 2) {
            setImageResource(2131232504);
        } else {
            setImageResource(2131232502);
        }
    }

    @NotNull
    public final IControlContainerService getControlContainerService() {
        IControlContainerService iControlContainerService = this.f81619f;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
        return null;
    }

    @NotNull
    public final IInteractLayerService getInteractLayerService() {
        IInteractLayerService iInteractLayerService = this.f81620g;
        if (iInteractLayerService != null) {
            return iInteractLayerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
        return null;
    }

    public boolean getMembersInjector() {
        return this.f81623k;
    }

    @NotNull
    public final IPlayerSettingService getPlayerSettingService() {
        IPlayerSettingService iPlayerSettingService = this.f81621i;
        if (iPlayerSettingService != null) {
            return iPlayerSettingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
        return null;
    }

    @NotNull
    public final IReporterService getReporterService() {
        IReporterService iReporterService = this.h;
        if (iReporterService != null) {
            return iReporterService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        IInteractLayerService interactLayerService = getInteractLayerService();
        if (!interactLayerService.isDanmakuEnable() || interactLayerService.isDanmakuForbidden()) {
            BLog.i("PlayerDanmakuToggleWidget", "onClick: danmaku is forbidden or not enable");
            return;
        }
        boolean zIsDanmakuVisible = interactLayerService.isDanmakuVisible();
        HashMap map = new HashMap(interactLayerService.getDanmakuReportCommonParameters());
        j4.t.a("onClick: isDanmakuOpen = ", "PlayerDanmakuToggleWidget", zIsDanmakuVisible);
        if (zIsDanmakuVisible) {
            setImageLevel(1);
            IInteractCoreService.hideDanmaku$default(interactLayerService, false, 1, (Object) null);
            map.put("switch", "2");
        } else {
            setImageLevel(0);
            IInteractCoreService.showDanmaku$default(interactLayerService, false, 1, (Object) null);
            map.put("switch", "1");
        }
        com.bilibili.app.gemini.player.widget.watchpoint.f.a("player.player.danmaku-switch.0.player", map, getReporterService());
    }

    public final void onDanmakuVisibleChanged(boolean z6, boolean z7) {
        v(z6);
    }

    public final void onWidgetActive() {
        getInteractLayerService().registerDanmakuVisibleObserver(this);
        getControlContainerService().registerWidgetChangedObserver(this.f81622j);
        v(getInteractLayerService().isDanmakuVisible());
        z();
    }

    public final void onWidgetInactive() {
        getInteractLayerService().unregisterDanmakuVisibleObserver(this);
        getControlContainerService().unregisterWidgetChangedObserver(this.f81622j);
    }

    public final void q() {
        setContentDescription("bbplayer_fullscreen_dmswitch");
        setOnClickListener(this);
    }

    public final void setControlContainerService(@NotNull IControlContainerService iControlContainerService) {
        this.f81619f = iControlContainerService;
    }

    public final void setInteractLayerService(@NotNull IInteractLayerService iInteractLayerService) {
        this.f81620g = iInteractLayerService;
    }

    public final void setPlayerSettingService(@NotNull IPlayerSettingService iPlayerSettingService) {
        this.f81621i = iPlayerSettingService;
    }

    public final void setReporterService(@NotNull IReporterService iReporterService) {
        this.h = iReporterService;
    }

    public final void v(boolean z6) {
        if (getInteractLayerService().isDanmakuForbidden()) {
            setImageLevel(1);
            setAlpha(0.5f);
            setContentDescription("弹幕禁用");
            BLog.i("PlayerDanmakuToggleWidget", "updateState: Danmaku is forbidden");
            return;
        }
        if (z6) {
            setImageLevel(0);
            setAlpha(1.0f);
            setContentDescription("关闭弹幕");
            BLog.i("PlayerDanmakuToggleWidget", "updateState: danmakuShow is true");
            return;
        }
        setImageLevel(1);
        setAlpha(1.0f);
        setContentDescription("打开弹幕");
        BLog.i("PlayerDanmakuToggleWidget", "updateState: danmakuShow is false");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.getWidgetFrom()
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 == r1) goto L16
            r0 = r5
            r4 = r0
            r0 = r3
            int r0 = r0.getWidgetFrom()
            r1 = 2
            if (r0 != r1) goto L2d
        L16:
            r0 = r3
            tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.getPlayerSettingService()
            Oi1.d r0 = r0.getCloudConfig()
            boolean r0 = r0.w()
            if (r0 == 0) goto L2a
            r0 = r5
            r4 = r0
            goto L2d
        L2a:
            r0 = 8
            r4 = r0
        L2d:
            r0 = r3
            r1 = r4
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.widget.PlayerDanmakuToggleWidget.z():void");
    }
}
