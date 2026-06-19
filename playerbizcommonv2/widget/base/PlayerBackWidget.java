package com.bilibili.playerbizcommonv2.widget.base;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintImageView;
import javax.inject.Inject;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerBackWidget.class */
@StabilityInferred(parameters = 0)
public final class PlayerBackWidget extends TintImageView implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public IReporterService f82338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f82339f;

    public PlayerBackWidget(@NotNull Context context) {
        super(context);
        this.f82339f = true;
        q();
    }

    public PlayerBackWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82339f = true;
        q();
    }

    public boolean getMembersInjector() {
        return this.f82339f;
    }

    @NotNull
    public final IReporterService getReporterService() {
        IReporterService iReporterService = this.f82338e;
        if (iReporterService != null) {
            return iReporterService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        PlayerLog.i("[player]orientation halfscreen");
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(getContext());
        if (activityFindActivityOrNull != null) {
            activityFindActivityOrNull.onBackPressed();
        }
        getReporterService().report(new NeuronsEvents.NormalEvent("player.player.back.0.player", new String[0]));
    }

    public final void q() {
        setContentDescription("返回");
        setOnClickListener(this);
    }

    public final void setReporterService(@NotNull IReporterService iReporterService) {
        this.f82338e = iReporterService;
    }
}
