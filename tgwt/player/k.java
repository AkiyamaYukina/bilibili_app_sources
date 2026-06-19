package com.bilibili.tgwt.player;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.logic.page.detail.report.PlayerReportService;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.bangumi.logic.page.detail.service.PlayHistoryService;
import com.bilibili.bangumi.logic.page.detail.service.SeekBizService;
import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import com.bilibili.playerbizcommon.features.danmaku.input.DanmakuInputWindowService;
import com.bilibili.playerbizcommon.features.delegate.DelegateStoreService;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.SeekService;
import tv.danmaku.biliplayerv2.service.business.ShutOffTimingService;
import tv.danmaku.biliplayerv2.service.interact.biz.InteractLayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/k.class */
@StabilityInferred(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final pm.d f111554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayControlService f111555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayHistoryService f111556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SeekBizService f111557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Set<Class<? extends IPlayerService>> f111558e = SetsKt.setOf(new Class[]{BackgroundPlayService.class, com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.i.class, ShutOffTimingService.class, PlayerReportService.class, com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.j.class, DelegateStoreService.class, DanmakuInputWindowService.class, InteractLayerService.class, SeekService.class});

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final j f111559f = new j(this);

    public k(@NotNull pm.d dVar, @NotNull dm.a aVar) {
        this.f111554a = dVar;
        this.f111555b = (PlayControlService) aVar.getService(PlayControlService.class);
        this.f111556c = (PlayHistoryService) aVar.getService(PlayHistoryService.class);
        this.f111557d = (SeekBizService) aVar.getService(SeekBizService.class);
    }
}
