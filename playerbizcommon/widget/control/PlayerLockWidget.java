package com.bilibili.playerbizcommon.widget.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bilibili.magicasakura.widgets.TintImageView;
import dr0.ViewOnClickListenerC6833a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.ControlWidgetChangedObserver;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.LifecycleObserver;
import tv.danmaku.biliplayerv2.service.LifecycleState;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerLockWidget.class */
public final class PlayerLockWidget extends TintImageView implements IControlWidget, View.OnClickListener {
    public static final int h = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public PlayerContainer f80499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final b f80500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f80501g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerLockWidget$a.class */
    public static final class a implements LifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerLockWidget f80502a;

        public a(PlayerLockWidget playerLockWidget) {
            this.f80502a = playerLockWidget;
        }

        public final void onLifecycleChanged(LifecycleState lifecycleState) {
            int i7 = PlayerLockWidget.h;
            this.f80502a.v();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerLockWidget$b.class */
    public static final class b implements ControlWidgetChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerLockWidget f80503a;

        public b(PlayerLockWidget playerLockWidget) {
            this.f80503a = playerLockWidget;
        }

        public final void onControllerWidgetChanged() {
            int i7 = PlayerLockWidget.h;
            this.f80503a.v();
        }
    }

    public PlayerLockWidget(@NotNull Context context) {
        super(context);
        this.f80500f = new b(this);
        this.f80501g = new a(this);
        q();
    }

    public PlayerLockWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80500f = new b(this);
        this.f80501g = new a(this);
        q();
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80499e = playerContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        AbsFunctionWidgetService functionWidgetService;
        IReporterService reporterService;
        IControlContainerService controlContainerService;
        PlayerLog.i("[player]player lockscreen on");
        PlayerContainer playerContainer = this.f80499e;
        if (playerContainer != null && (controlContainerService = playerContainer.getControlContainerService()) != null) {
            controlContainerService.hide();
        }
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
        layoutParams.setFunctionType(3);
        PlayerContainer playerContainer2 = this.f80499e;
        if (playerContainer2 != null && (reporterService = playerContainer2.getReporterService()) != null) {
            reporterService.report(new NeuronsEvents.NormalEvent("player.player.lock.0.player", new String[]{"lock_type", "1"}));
        }
        PlayerContainer playerContainer3 = this.f80499e;
        if (playerContainer3 == null || (functionWidgetService = playerContainer3.getFunctionWidgetService()) == null) {
            return;
        }
        functionWidgetService.showWidget(ViewOnClickListenerC6833a.class, layoutParams);
    }

    public final void onWidgetActive() {
        IActivityStateService activityStateService;
        IControlContainerService controlContainerService;
        setOnClickListener(this);
        PlayerContainer playerContainer = this.f80499e;
        if (playerContainer != null && (controlContainerService = playerContainer.getControlContainerService()) != null) {
            controlContainerService.registerWidgetChangedObserver(this.f80500f);
        }
        v();
        PlayerContainer playerContainer2 = this.f80499e;
        if (playerContainer2 == null || (activityStateService = playerContainer2.getActivityStateService()) == null) {
            return;
        }
        activityStateService.registerLifecycle(this.f80501g, new LifecycleState[]{LifecycleState.ACTIVITY_RESUME});
    }

    public final void onWidgetInactive() {
        IControlContainerService controlContainerService;
        IActivityStateService activityStateService;
        setOnClickListener(null);
        PlayerContainer playerContainer = this.f80499e;
        if (playerContainer != null && (activityStateService = playerContainer.getActivityStateService()) != null) {
            activityStateService.unregisterLifecycle(this.f80501g);
        }
        PlayerContainer playerContainer2 = this.f80499e;
        if (playerContainer2 == null || (controlContainerService = playerContainer2.getControlContainerService()) == null) {
            return;
        }
        controlContainerService.unregisterWidgetChangedObserver(this.f80500f);
    }

    public final void q() {
        setContentDescription("锁定屏幕");
        setImageResource(2131239258);
        setBackgroundResource(2131239634);
        setScaleType(ImageView.ScaleType.CENTER);
    }

    public final void v() {
        PlayerContainer playerContainer = this.f80499e;
        if (playerContainer == null) {
            return;
        }
        Oi1.d cloudConfig = playerContainer.getPlayerSettingService().getCloudConfig();
        setVisibility((cloudConfig.a.getLockScreenConf().b(true) && cloudConfig.F()) ? 0 : 8);
    }
}
