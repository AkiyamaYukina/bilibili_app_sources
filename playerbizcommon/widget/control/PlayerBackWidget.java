package com.bilibili.playerbizcommon.widget.control;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.magicasakura.widgets.TintImageView;
import kntr.base.android.legacy.context.ContextUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerBackWidget.class */
public final class PlayerBackWidget extends TintImageView implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public PlayerContainer f80461e;

    public PlayerBackWidget(@NotNull Context context) {
        super(context);
        q();
    }

    public PlayerBackWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        q();
    }

    public PlayerBackWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        q();
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80461e = playerContainer;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        IReporterService reporterService;
        PlayerLog.i("[player]orientation halfscreen");
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(getContext());
        if (activityFindActivityOrNull != null) {
            activityFindActivityOrNull.onBackPressed();
        }
        PlayerContainer playerContainer = this.f80461e;
        if (playerContainer == null || (reporterService = playerContainer.getReporterService()) == null) {
            return;
        }
        reporterService.report(new NeuronsEvents.NormalEvent("player.player.back.0.player", new String[0]));
    }

    public void onWidgetActive() {
    }

    public void onWidgetInactive() {
    }

    public final void q() {
        setContentDescription("返回");
        setOnClickListener(this);
    }
}
