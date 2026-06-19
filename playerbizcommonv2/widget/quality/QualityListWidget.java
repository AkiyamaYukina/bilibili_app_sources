package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.video.story.player.quality.StoryVipQualityTrialService;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/QualityListWidget.class */
@StabilityInferred(parameters = 0)
public final class QualityListWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f82720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f82721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final StateFlow f82722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ZF0.i f82723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final IReporterService f82724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final StoryVipQualityTrialService f82725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Md.d f82726g;

    @Nullable
    public final com.bilibili.video.story.action.functionwidget.h h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final com.bilibili.video.story.action.functionwidget.g f82727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Md0.b f82728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.text.input.internal.selection.B f82729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public RecyclerView f82730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public i0 f82731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public ViewGroup f82732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public TextView f82733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public TextView f82734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ImageView f82735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public View f82736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Job f82737s;

    public QualityListWidget(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @Nullable StateFlow stateFlow, @NotNull ZF0.i iVar, @Nullable IReporterService iReporterService, @Nullable StoryVipQualityTrialService storyVipQualityTrialService, @NotNull Md.d dVar, @Nullable com.bilibili.video.story.action.functionwidget.h hVar, @Nullable com.bilibili.video.story.action.functionwidget.g gVar, @NotNull Md0.b bVar, @NotNull androidx.compose.foundation.text.input.internal.selection.B b7) {
        this.f82720a = context;
        this.f82721b = coroutineScope;
        this.f82722c = stateFlow;
        this.f82723d = iVar;
        this.f82724e = iReporterService;
        this.f82725f = storyVipQualityTrialService;
        this.f82726g = dVar;
        this.h = hVar;
        this.f82727i = gVar;
        this.f82728j = bVar;
        this.f82729k = b7;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.QualityListWidget.a():void");
    }
}
