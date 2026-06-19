package com.bilibili.playerbizcommon.widget.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.magicasakura.widgets.TintImageView;
import fr0.ViewOnClickListenerC7168p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSettingWidget.class */
public final class PlayerSettingWidget extends TintImageView implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public PlayerContainer f80561e;

    public PlayerSettingWidget(@NotNull Context context) {
        super(context);
        q();
    }

    public PlayerSettingWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        q();
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80561e = playerContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        IReporterService reporterService;
        IControlContainerService controlContainerService;
        PlayerContainer playerContainer = this.f80561e;
        if (playerContainer == null) {
            return;
        }
        ScreenModeType screenModeType = (playerContainer == null || (controlContainerService = playerContainer.getControlContainerService()) == null) ? null : controlContainerService.getScreenModeType();
        ScreenModeType screenModeType2 = ScreenModeType.VERTICAL_FULLSCREEN;
        IFunctionContainer.LayoutParams layoutParams = screenModeType == screenModeType2 ? new IFunctionContainer.LayoutParams(-1, (int) DpUtils.dp2px(getContext(), 380.0f)) : new IFunctionContainer.LayoutParams((int) DpUtils.dp2px(getContext(), 320.0f), -1);
        layoutParams.setFunctionType(2);
        layoutParams.setLayoutType(screenModeType == screenModeType2 ? layoutParams.getLayoutType() | 8 : layoutParams.getLayoutType() | 4);
        this.f80561e.getFunctionWidgetService().showWidget(ViewOnClickListenerC7168p.class, layoutParams);
        PlayerContainer playerContainer2 = this.f80561e;
        if (playerContainer2 == null || (reporterService = playerContainer2.getReporterService()) == null) {
            return;
        }
        reporterService.report(new NeuronsEvents.NormalEvent("player.player.full-more.entrance.player", new String[0]));
    }

    public final void onWidgetActive() {
        if (this.f80561e != null) {
            setOnClickListener(this);
        }
    }

    public final void onWidgetInactive() {
        if (this.f80561e != null) {
            setOnClickListener(null);
        }
    }

    public final void q() {
        setContentDescription("更多操作");
    }
}
