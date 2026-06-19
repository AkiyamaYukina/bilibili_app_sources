package com.bilibili.playerbizcommonv2.widget.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintImageView;
import dr0.ViewOnClickListenerC6833a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.ControlWidgetChangedObserver;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.LifecycleObserver;
import tv.danmaku.biliplayerv2.service.LifecycleState;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerLockWidget.class */
@StabilityInferred(parameters = 0)
public final class PlayerLockWidget extends TintImageView implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f82351m = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public AbsFunctionWidgetService f82352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Inject
    public IControlContainerService f82353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Inject
    public IReporterService f82354g;

    @Inject
    public IPlayerSettingService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Inject
    public IActivityStateService f82355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a f82356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final b f82357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f82358l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerLockWidget$a.class */
    public static final class a implements ControlWidgetChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerLockWidget f82359a;

        public a(PlayerLockWidget playerLockWidget) {
            this.f82359a = playerLockWidget;
        }

        public final void onControllerWidgetChanged() {
            int i7 = PlayerLockWidget.f82351m;
            this.f82359a.v();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerLockWidget$b.class */
    public static final class b implements LifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerLockWidget f82360a;

        public b(PlayerLockWidget playerLockWidget) {
            this.f82360a = playerLockWidget;
        }

        public final void onLifecycleChanged(LifecycleState lifecycleState) {
            int i7 = PlayerLockWidget.f82351m;
            this.f82360a.v();
        }
    }

    public PlayerLockWidget(@NotNull Context context) {
        super(context);
        this.f82356j = new a(this);
        this.f82357k = new b(this);
        this.f82358l = true;
        q();
    }

    public PlayerLockWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82356j = new a(this);
        this.f82357k = new b(this);
        this.f82358l = true;
        q();
    }

    @NotNull
    public final IActivityStateService getActivityStateService() {
        IActivityStateService iActivityStateService = this.f82355i;
        if (iActivityStateService != null) {
            return iActivityStateService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityStateService");
        return null;
    }

    @NotNull
    public final IControlContainerService getControlContainerservice() {
        IControlContainerService iControlContainerService = this.f82353f;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerservice");
        return null;
    }

    @NotNull
    public final AbsFunctionWidgetService getFunctionWidgetService() {
        AbsFunctionWidgetService absFunctionWidgetService = this.f82352e;
        if (absFunctionWidgetService != null) {
            return absFunctionWidgetService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
        return null;
    }

    public boolean getMembersInjector() {
        return this.f82358l;
    }

    @NotNull
    public final IPlayerSettingService getPlayerSettingService() {
        IPlayerSettingService iPlayerSettingService = this.h;
        if (iPlayerSettingService != null) {
            return iPlayerSettingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
        return null;
    }

    @NotNull
    public final IReporterService getReporterService() {
        IReporterService iReporterService = this.f82354g;
        if (iReporterService != null) {
            return iReporterService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        PlayerLog.i("[player]player lockscreen on");
        getControlContainerservice().hide();
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
        layoutParams.setFunctionType(3);
        getReporterService().report(new NeuronsEvents.NormalEvent("player.player.lock.0.player", new String[]{"lock_type", "1"}));
        getFunctionWidgetService().showWidget(ViewOnClickListenerC6833a.class, layoutParams);
    }

    public final void onWidgetActive() {
        setOnClickListener(this);
        getControlContainerservice().registerWidgetChangedObserver(this.f82356j);
        v();
        getActivityStateService().registerLifecycle(this.f82357k, new LifecycleState[]{LifecycleState.ACTIVITY_RESUME});
    }

    public final void onWidgetInactive() {
        setOnClickListener(null);
        getActivityStateService().unregisterLifecycle(this.f82357k);
        getControlContainerservice().unregisterWidgetChangedObserver(this.f82356j);
    }

    public final void q() {
        setContentDescription("锁定屏幕");
        setImageResource(2131239258);
        setBackgroundResource(com.bilibili.playerbizcommonv2.utils.f.b() ? 2131245406 : 2131239634);
        setScaleType(ImageView.ScaleType.CENTER);
    }

    public final void setActivityStateService(@NotNull IActivityStateService iActivityStateService) {
        this.f82355i = iActivityStateService;
    }

    public final void setControlContainerservice(@NotNull IControlContainerService iControlContainerService) {
        this.f82353f = iControlContainerService;
    }

    public final void setFunctionWidgetService(@NotNull AbsFunctionWidgetService absFunctionWidgetService) {
        this.f82352e = absFunctionWidgetService;
    }

    public final void setPlayerSettingService(@NotNull IPlayerSettingService iPlayerSettingService) {
        this.h = iPlayerSettingService;
    }

    public final void setReporterService(@NotNull IReporterService iReporterService) {
        this.f82354g = iReporterService;
    }

    public final void v() {
        Oi1.d cloudConfig = getPlayerSettingService().getCloudConfig();
        setVisibility((cloudConfig.a.getLockScreenConf().b(true) && cloudConfig.F()) ? 0 : 8);
    }
}
