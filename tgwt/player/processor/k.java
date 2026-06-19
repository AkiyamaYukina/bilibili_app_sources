package com.bilibili.tgwt.player.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.tgwt.service.ChatService;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/k.class */
@StabilityInferred(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChatService f111659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ScreenStateService f111660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BangumiPlayerContainerService f111661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.tgwt.player.widget.g f111662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.tgwt.player.h f111663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Job f111665g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final j f111666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final i f111667j;

    @Inject
    public k(@NotNull ChatService chatService, @NotNull ScreenStateService screenStateService, @NotNull BangumiPlayerContainerService bangumiPlayerContainerService, @NotNull Lifecycle lifecycle, @NotNull com.bilibili.tgwt.player.widget.g gVar, @NotNull com.bilibili.tgwt.player.h hVar, @NotNull CoroutineScope coroutineScope) {
        this.f111659a = chatService;
        this.f111660b = screenStateService;
        this.f111661c = bangumiPlayerContainerService;
        this.f111662d = gVar;
        this.f111663e = hVar;
        this.f111664f = coroutineScope;
        ScreenModeType screenModeType = ScreenModeType.THUMB;
        j jVar = new j(this);
        this.f111666i = jVar;
        i iVar = new i(this);
        this.f111667j = iVar;
        bangumiPlayerContainerService.getPlayerServiceController().a.c().addOnWidgetStateChangeListener(jVar);
        FlowKt.launchIn(FlowKt.onEach(chatService.f111856E, new TogetherWatchChatVoicePopupProcessor$start$1(this, null)), coroutineScope);
        bangumiPlayerContainerService.getPlayerServiceController().t(iVar);
        lifecycle.addObserver(new h(this));
    }
}
