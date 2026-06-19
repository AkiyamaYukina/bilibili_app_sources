package com.bilibili.tgwt.player.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.player.widget.PlayerChatPopupLayer;
import com.bilibili.tgwt.service.ChatService;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.panel.BuiltInLayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/f.class */
@StabilityInferred(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BangumiPlayerContainerService f111641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChatService f111642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public ScreenModeType f111646f = ScreenModeType.THUMB;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f111647g;

    @Nullable
    public PlayerChatPopupLayer h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f111648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final e f111649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final d f111650k;

    @Inject
    public f(@NotNull BangumiPlayerContainerService bangumiPlayerContainerService, @NotNull ChatService chatService, @NotNull ChatRoomManagerService chatRoomManagerService, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.tgwt.player.widget.i iVar) {
        this.f111641a = bangumiPlayerContainerService;
        this.f111642b = chatService;
        this.f111643c = chatRoomManagerService;
        this.f111644d = coroutineScope;
        e eVar = new e(this);
        this.f111649j = eVar;
        d dVar = new d(this);
        this.f111650k = dVar;
        this.h = (PlayerChatPopupLayer) iVar.get();
        bangumiPlayerContainerService.addOnWidgetStateChangeListener(eVar);
        FlowKt.launchIn(FlowKt.onEach(chatRoomManagerService.f110932y, new TogetherWatchChatPopupProcessor$start$1(this, null)), coroutineScope);
        bangumiPlayerContainerService.getPlayerServiceController().t(dVar);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchChatPopupProcessor$1(this, null), 3, (Object) null);
    }

    public final void a() {
        if (this.f111648i) {
            PlayerChatPopupLayer playerChatPopupLayer = this.h;
            if (playerChatPopupLayer != null) {
                this.f111641a.getPlayerServiceController().v(playerChatPopupLayer);
                playerChatPopupLayer.b();
            }
            this.f111648i = false;
        }
    }

    public final void b() {
        if (!this.f111642b.f111872U && this.f111645e == 0 && this.f111646f == ScreenModeType.LANDSCAPE_FULLSCREEN && this.f111647g == 0 && !this.f111648i) {
            PlayerChatPopupLayer playerChatPopupLayer = this.h;
            if (playerChatPopupLayer != null) {
                Rl.e playerServiceController = this.f111641a.getPlayerServiceController();
                playerServiceController.b.addPlayerLayer(BuiltInLayer.LayerControl, playerChatPopupLayer);
                playerChatPopupLayer.a();
            }
            this.f111648i = true;
        }
    }
}
