package com.bilibili.playerbizcommonv2.widget.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingWidget.class */
@StabilityInferred(parameters = 0)
public final class PlayerSettingWidget extends TintImageView implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public IControlContainerService f83144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Inject
    public IReporterService f83145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Inject
    public AbsFunctionWidgetService f83146g;
    public final boolean h;

    public PlayerSettingWidget(@NotNull Context context) {
        super(context);
        this.h = true;
        q();
    }

    public PlayerSettingWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = true;
        q();
    }

    @NotNull
    public final IControlContainerService getControlContainerService() {
        IControlContainerService iControlContainerService = this.f83144e;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
        return null;
    }

    @NotNull
    public final AbsFunctionWidgetService getFunctionWidgetService() {
        AbsFunctionWidgetService absFunctionWidgetService = this.f83146g;
        if (absFunctionWidgetService != null) {
            return absFunctionWidgetService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
        return null;
    }

    public boolean getMembersInjector() {
        return this.h;
    }

    @NotNull
    public final IReporterService getReporterService() {
        IReporterService iReporterService = this.f83145f;
        if (iReporterService != null) {
            return iReporterService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        ScreenModeType screenModeType = getControlContainerService().getScreenModeType();
        AbsFunctionWidgetService functionWidgetService = getFunctionWidgetService();
        RightInsetWithShadowFunctionWidget.Companion.getClass();
        functionWidgetService.showWidget(PlayerSettingFunctionWidget2.class, RightInsetWithShadowFunctionWidget.a.a(screenModeType));
        getReporterService().report(new NeuronsEvents.NormalEvent("player.player.full-more.entrance.player", new String[0]));
    }

    public final void onWidgetActive() {
        setOnClickListener(this);
    }

    public final void onWidgetInactive() {
        setOnClickListener(null);
    }

    public final void q() {
        setContentDescription("更多操作");
    }

    public final void setControlContainerService(@NotNull IControlContainerService iControlContainerService) {
        this.f83144e = iControlContainerService;
    }

    public final void setFunctionWidgetService(@NotNull AbsFunctionWidgetService absFunctionWidgetService) {
        this.f83146g = absFunctionWidgetService;
    }

    public final void setReporterService(@NotNull IReporterService iReporterService) {
        this.f83145f = iReporterService;
    }
}
