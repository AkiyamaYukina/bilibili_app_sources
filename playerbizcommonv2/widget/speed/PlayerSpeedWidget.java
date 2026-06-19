package com.bilibili.playerbizcommonv2.widget.speed;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.view.FromTextView;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.ControlWidgetChangedObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerSpeedChangedObserver;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/PlayerSpeedWidget.class */
@StabilityInferred(parameters = 0)
public final class PlayerSpeedWidget extends FromTextView implements IControlWidget {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f83399k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Inject
    public IControlContainerService f83400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    public IPlayerCoreService f83401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    public IReporterService f83402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public AbsFunctionWidgetService f83403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Inject
    public IPlayerSettingService f83404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f83405g;

    @NotNull
    public final c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final b f83406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f83407j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/PlayerSpeedWidget$a.class */
    public static final class a implements ControlWidgetChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSpeedWidget f83408a;

        public a(PlayerSpeedWidget playerSpeedWidget) {
            this.f83408a = playerSpeedWidget;
        }

        public final void onControllerWidgetChanged() {
            int i7 = PlayerSpeedWidget.f83399k;
            this.f83408a.K();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/PlayerSpeedWidget$b.class */
    public static final class b implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSpeedWidget f83409a;

        public b(PlayerSpeedWidget playerSpeedWidget) {
            this.f83409a = playerSpeedWidget;
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
            if (z6) {
                int i7 = PlayerSpeedWidget.f83399k;
                this.f83409a.J();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/PlayerSpeedWidget$c.class */
    public static final class c implements IPlayerSpeedChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSpeedWidget f83410a;

        public c(PlayerSpeedWidget playerSpeedWidget) {
            this.f83410a = playerSpeedWidget;
        }

        public final void onChanged(float f7) {
            int i7 = PlayerSpeedWidget.f83399k;
            this.f83410a.J();
        }
    }

    public PlayerSpeedWidget(@NotNull Context context) {
        super(context);
        this.f83405g = new a(this);
        this.h = new c(this);
        this.f83406i = new b(this);
        this.f83407j = true;
    }

    public PlayerSpeedWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83405g = new a(this);
        this.h = new c(this);
        this.f83406i = new b(this);
        this.f83407j = true;
    }

    public final void J() {
        float playSpeed$default = IPlayerCoreService.getPlaySpeed$default(getPlayCoreService(), false, 1, (Object) null);
        float f7 = playSpeed$default;
        if (playSpeed$default == 1.99f) {
            f7 = 2.0f;
        }
        if (f7 != 1.0f && f7 <= 2.0f) {
            setText(getContext().getString(2131832781, String.valueOf(f7)));
            setContentDescription(getContext().getString(2131845723, String.valueOf(f7)));
        } else {
            setText(getContext().getString(2131845530));
            setContentDescription(getContext().getString(2131847174));
        }
    }

    public final void K() {
        if (getWidgetFrom() == 1) {
            Oi1.d cloudConfig = getPlayerSettingService().getCloudConfig();
            setVisibility((cloudConfig.p() && cloudConfig.L()) ? 0 : 8);
        }
    }

    @NotNull
    public final IControlContainerService getControlContainerService() {
        IControlContainerService iControlContainerService = this.f83400b;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
        return null;
    }

    @NotNull
    public final AbsFunctionWidgetService getFunctionWidgetService() {
        AbsFunctionWidgetService absFunctionWidgetService = this.f83403e;
        if (absFunctionWidgetService != null) {
            return absFunctionWidgetService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
        return null;
    }

    public boolean getMembersInjector() {
        return this.f83407j;
    }

    @NotNull
    public final IPlayerCoreService getPlayCoreService() {
        IPlayerCoreService iPlayerCoreService = this.f83401c;
        if (iPlayerCoreService != null) {
            return iPlayerCoreService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playCoreService");
        return null;
    }

    @NotNull
    public final IPlayerSettingService getPlayerSettingService() {
        IPlayerSettingService iPlayerSettingService = this.f83404f;
        if (iPlayerSettingService != null) {
            return iPlayerSettingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
        return null;
    }

    @NotNull
    public final IReporterService getReporterService() {
        IReporterService iReporterService = this.f83402d;
        if (iReporterService != null) {
            return iReporterService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        return null;
    }

    public final void onWidgetActive() {
        getControlContainerService().registerWidgetChangedObserver(this.f83405g);
        J();
        K();
        getPlayCoreService().addPlayerSpeedChangedObserver(this.h);
        getControlContainerService().registerControlContainerVisible(this.f83406i);
        setOnClickListener(new Uf1.a(this, 1));
    }

    public final void onWidgetInactive() {
        setOnClickListener(null);
        getPlayCoreService().removePlayerSpeedChangedObserver(this.h);
        getControlContainerService().unregisterControlContainerVisible(this.f83406i);
        getControlContainerService().registerWidgetChangedObserver(this.f83405g);
    }

    public final void setControlContainerService(@NotNull IControlContainerService iControlContainerService) {
        this.f83400b = iControlContainerService;
    }

    public final void setFunctionWidgetService(@NotNull AbsFunctionWidgetService absFunctionWidgetService) {
        this.f83403e = absFunctionWidgetService;
    }

    public final void setPlayCoreService(@NotNull IPlayerCoreService iPlayerCoreService) {
        this.f83401c = iPlayerCoreService;
    }

    public final void setPlayerSettingService(@NotNull IPlayerSettingService iPlayerSettingService) {
        this.f83404f = iPlayerSettingService;
    }

    public final void setReporterService(@NotNull IReporterService iReporterService) {
        this.f83402d = iReporterService;
    }
}
