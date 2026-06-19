package com.bilibili.playerbizcommonv2.widget.quality;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.media.resource.VodIndex;
import com.bilibili.video.story.player.quality.StoryVipQualityTrialService;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/SimpleQualityListWidget.class */
@StabilityInferred(parameters = 0)
public final class SimpleQualityListWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final StateFlow f82742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<MediaResource> f82743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final IReporterService f82744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final StoryVipQualityTrialService f82745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function0<Integer> f82746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final com.bilibili.video.story.player.quality.b f82747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final YI0.j f82748g;

    @NotNull
    public final QualityItemStyle h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public RecyclerView f82749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public i0 f82750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CoroutineScope f82751k;

    public SimpleQualityListWidget(@Nullable StateFlow stateFlow, @NotNull Function0 function0, @Nullable IReporterService iReporterService, @Nullable StoryVipQualityTrialService storyVipQualityTrialService, @NotNull Function0 function02, @Nullable com.bilibili.video.story.player.quality.b bVar, @Nullable YI0.j jVar, @NotNull Lg0.b bVar2, @NotNull QualityItemStyle qualityItemStyle) {
        this.f82742a = stateFlow;
        this.f82743b = function0;
        this.f82744c = iReporterService;
        this.f82745d = storyVipQualityTrialService;
        this.f82746e = function02;
        this.f82747f = bVar;
        this.f82748g = jVar;
        this.h = qualityItemStyle;
    }

    public final void a() {
        VodIndex vodIndex;
        PlayIndex playIndex;
        PlayIndex playIndex2 = null;
        boolean z6 = true;
        CoroutineScope coroutineScopeA = com.bilibili.ad.core.click.K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());
        this.f82751k = coroutineScopeA;
        if (coroutineScopeA == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Constants.PARAM_SCOPE);
            coroutineScopeA = null;
        }
        BuildersKt.launch$default(coroutineScopeA, (CoroutineContext) null, (CoroutineStart) null, new SimpleQualityListWidget$onWidgetShow$1(this, null), 3, (Object) null);
        if (this.f82749i == null) {
            return;
        }
        if (this.f82750j == null) {
            i0 i0Var = new i0(this.f82744c, this.h);
            i0Var.f82833c = this.f82747f;
            i0Var.f82834d = this.f82748g;
            this.f82750j = i0Var;
            RecyclerView recyclerView = this.f82749i;
            if (recyclerView != null) {
                recyclerView.setAdapter(i0Var);
            }
        }
        MediaResource mediaResource = (MediaResource) this.f82743b.invoke();
        int iIntValue = ((Number) this.f82746e.invoke()).intValue();
        com.bilibili.biligame.ui.feed.preload.b.a("[playerbizcommonv2-SimpleQualityListWidget-onWidgetShow] ", "init quality: " + iIntValue + ", currentPlayIndex: " + ((mediaResource == null || (playIndex = mediaResource.getPlayIndex()) == null) ? null : Integer.valueOf(playIndex.mQuality)), "SimpleQualityListWidget-onWidgetShow");
        i0 i0Var2 = this.f82750j;
        if (i0Var2 != null) {
            ArrayList arrayList = (mediaResource == null || (vodIndex = mediaResource.mVodIndex) == null) ? null : vodIndex.mVodList;
            if (mediaResource != null) {
                playIndex2 = mediaResource.getPlayIndex();
            }
            StoryVipQualityTrialService storyVipQualityTrialService = this.f82745d;
            if (storyVipQualityTrialService == null || !storyVipQualityTrialService.b()) {
                z6 = false;
            }
            i0Var2.N(arrayList, iIntValue, playIndex2, z6);
        }
        i0 i0Var3 = this.f82750j;
        if (i0Var3 != null) {
            i0Var3.notifyDataSetChanged();
        }
    }
}
