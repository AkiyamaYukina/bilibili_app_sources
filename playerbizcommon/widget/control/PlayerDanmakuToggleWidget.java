package com.bilibili.playerbizcommon.widget.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.ControlWidgetChangedObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.core.DanmakuVisibleObserver;
import tv.danmaku.biliplayerv2.service.interact.core.IInteractCoreService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuToggleWidget.class */
public final class PlayerDanmakuToggleWidget extends Zq0.e implements IControlWidget, View.OnClickListener, DanmakuVisibleObserver {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PlayerContainer f80495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f80496g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuToggleWidget$a.class */
    public static final class a implements ControlWidgetChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuToggleWidget f80497a;

        public a(PlayerDanmakuToggleWidget playerDanmakuToggleWidget) {
            this.f80497a = playerDanmakuToggleWidget;
        }

        public final void onControllerWidgetChanged() {
            this.f80497a.v();
        }
    }

    public PlayerDanmakuToggleWidget(@NotNull Context context) {
        super(context);
        this.f80496g = new a(this);
        q();
    }

    public PlayerDanmakuToggleWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80496g = new a(this);
        q();
    }

    public PlayerDanmakuToggleWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f80496g = new a(this);
        q();
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80495f = playerContainer;
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

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        IPlayerContainer iPlayerContainer = this.f80495f;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        IInteractLayerService interactLayerService = iPlayerContainer2.getInteractLayerService();
        if (interactLayerService.isDanmakuEnable()) {
            boolean zIsDanmakuVisible = interactLayerService.isDanmakuVisible();
            HashMap map = new HashMap(interactLayerService.getDanmakuReportCommonParameters());
            if (zIsDanmakuVisible) {
                setImageLevel(1);
                IInteractCoreService.hideDanmaku$default(interactLayerService, false, 1, (Object) null);
                map.put("switch", "2");
            } else {
                setImageLevel(0);
                IInteractCoreService.showDanmaku$default(interactLayerService, false, 1, (Object) null);
                map.put("switch", "1");
            }
            IPlayerContainer iPlayerContainer3 = this.f80495f;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            com.bilibili.app.gemini.player.widget.watchpoint.f.a("player.player.danmaku-switch.0.player", map, iPlayerContainer3.getReporterService());
        }
    }

    public void onDanmakuVisibleChanged(boolean z6, boolean z7) {
        if (z6) {
            setImageLevel(0);
            setContentDescription("关闭弹幕");
        } else {
            setImageLevel(1);
            setContentDescription("打开弹幕");
        }
    }

    public void onWidgetActive() {
        IPlayerContainer iPlayerContainer = this.f80495f;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getInteractLayerService().registerDanmakuVisibleObserver(this);
        IPlayerContainer iPlayerContainer3 = this.f80495f;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getControlContainerService().registerWidgetChangedObserver(this.f80496g);
        IPlayerContainer iPlayerContainer5 = this.f80495f;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer5 = null;
        }
        if (iPlayerContainer5.getInteractLayerService().isDanmakuVisible()) {
            setImageLevel(0);
            setContentDescription("关闭弹幕");
        } else {
            setImageLevel(1);
            setContentDescription("打开弹幕");
        }
        v();
    }

    public void onWidgetInactive() {
        IPlayerContainer iPlayerContainer = this.f80495f;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getInteractLayerService().unregisterDanmakuVisibleObserver(this);
        IPlayerContainer iPlayerContainer3 = this.f80495f;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        iPlayerContainer3.getControlContainerService().unregisterWidgetChangedObserver(this.f80496g);
    }

    public final void q() {
        setContentDescription("bbplayer_fullscreen_dmswitch");
        setOnClickListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() {
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
            if (r0 != r1) goto L44
        L16:
            r0 = r3
            tv.danmaku.biliplayerv2.PlayerContainer r0 = r0.f80495f
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L2b
            java.lang.String r0 = "mPlayerContainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r6 = r0
        L2b:
            r0 = r6
            tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.getPlayerSettingService()
            Oi1.d r0 = r0.getCloudConfig()
            boolean r0 = r0.w()
            if (r0 == 0) goto L41
            r0 = r5
            r4 = r0
            goto L44
        L41:
            r0 = 8
            r4 = r0
        L44:
            r0 = r3
            r1 = r4
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.PlayerDanmakuToggleWidget.v():void");
    }
}
