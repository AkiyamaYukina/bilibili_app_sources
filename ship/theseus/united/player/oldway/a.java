package com.bilibili.ship.theseus.united.player.oldway;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.D;
import com.bilibili.app.gemini.player.feature.snapshot.GeminiSnapshotGifWidget;
import com.bilibili.app.gemini.player.widget.PlayerNetworkTextWidget;
import com.bilibili.app.gemini.player.widget.PlayerNextWidget;
import com.bilibili.app.gemini.player.widget.anchor.GeminiHalfAnchorWidget;
import com.bilibili.app.gemini.player.widget.audio.GeminiAudioControlWidget;
import com.bilibili.app.gemini.player.widget.base.GeminiPlayerTitleWidget;
import com.bilibili.app.gemini.player.widget.coin.GeminiPlayerCoinWidget;
import com.bilibili.app.gemini.player.widget.danmaku.GeminiPlayerDanmakuRecommendWidget;
import com.bilibili.app.gemini.player.widget.danmaku.PlayerDanmakuSendWidget;
import com.bilibili.app.gemini.player.widget.follow.GeminiPlayerFollowWithFaceWidget;
import com.bilibili.app.gemini.player.widget.forward.GeminiSeekForwardOrBackwardWidget;
import com.bilibili.app.gemini.player.widget.like.GeminiPlayerLikeWidget;
import com.bilibili.app.gemini.player.widget.progress.GeminiHeatPeakView;
import com.bilibili.app.gemini.player.widget.progress.GeminiProgressTextWidget;
import com.bilibili.app.gemini.player.widget.selector.GeminiVideoListSelectorWidget;
import com.bilibili.app.gemini.player.widget.share.GeminiPlayerShareIconWidget;
import com.bilibili.app.gemini.player.widget.speed.GeminiHalfSpeedWidget;
import com.bilibili.app.gemini.player.widget.story.GeminiPlayerFullStoryWidget;
import com.bilibili.app.gemini.player.widget.story.GeminiPlayerFullscreenWidget;
import com.bilibili.app.gemini.player.widget.watchpoint.GeminiHalfWatchpointTextWidget;
import com.bilibili.app.gemini.player.widget.watchpoint.GeminiHalfWatchpointWidget;
import com.bilibili.app.gemini.player.widget.watchpoint.GeminiWatchpointIconsWidget;
import com.bilibili.app.gemini.player.widget.watchpoint.GeminiWatchpointTextWidget;
import com.bilibili.app.gemini.ugc.feature.GeminiPlayerChargeWidget;
import com.bilibili.app.gemini.ugc.feature.GeminiPlayerDislikeWidget;
import com.bilibili.pegasus.components.G;
import com.bilibili.playerbizcommonv2.danmaku.setting.PlayerDanmakuSettingWidget;
import com.bilibili.playerbizcommonv2.danmaku.widget.PlayerDanmakuToggleWidget;
import com.bilibili.playerbizcommonv2.widget.base.PlayerBackWidget;
import com.bilibili.playerbizcommonv2.widget.base.PlayerInsetControllerWidget;
import com.bilibili.playerbizcommonv2.widget.base.PlayerLockWidget;
import com.bilibili.playerbizcommonv2.widget.base.PlayerPlayPauseWidget;
import com.bilibili.playerbizcommonv2.widget.base.PlayerProgressTextWidget;
import com.bilibili.playerbizcommonv2.widget.device.PlayerDateTextWidget;
import com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3;
import com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingWidget;
import com.bilibili.playerbizcommonv2.widget.speed.PlayerSpeedWidget;
import com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.PlayerContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/a.class */
@StabilityInferred(parameters = 0)
public final class a implements ei1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<? extends Class<? extends Object>, ei1.c<? extends Object>> f104725a;

    @Inject
    public a(@NotNull PlayerContainer playerContainer, @NotNull rW0.b<PlayerDateTextWidget> bVar, @NotNull rW0.b<PlayerSettingWidget> bVar2, @NotNull rW0.b<PlayerNetworkTextWidget> bVar3, @NotNull rW0.b<PlayerLockWidget> bVar4, @NotNull rW0.b<PlayerBackWidget> bVar5, @NotNull rW0.b<GeminiWatchpointIconsWidget> bVar6, @NotNull rW0.b<GeminiSnapshotGifWidget> bVar7, @NotNull rW0.b<GeminiPlayerTitleWidget> bVar8, @NotNull rW0.b<GeminiPlayerShareIconWidget> bVar9, @NotNull rW0.b<GeminiPlayerLikeWidget> bVar10, @NotNull rW0.b<GeminiPlayerFullscreenWidget> bVar11, @NotNull rW0.b<GeminiWatchpointTextWidget> bVar12, @NotNull rW0.b<PlayerProgressTextWidget> bVar13, @NotNull rW0.b<GeminiPlayerDanmakuRecommendWidget> bVar14, @NotNull rW0.b<PlayerDanmakuSendWidget> bVar15, @NotNull rW0.b<PlayerDanmakuSettingWidget> bVar16, @NotNull rW0.b<PlayerDanmakuToggleWidget> bVar17, @NotNull rW0.b<PlayerNextWidget> bVar18, @NotNull rW0.b<PlayerPlayPauseWidget> bVar19, @NotNull rW0.b<com.bilibili.app.gemini.player.widget.d> bVar20, @NotNull rW0.b<PlayerSeekWidget3> bVar21, @NotNull rW0.b<GeminiPlayerFullStoryWidget> bVar22, @NotNull rW0.b<GeminiPlayerChargeWidget> bVar23, @NotNull rW0.b<PlayerInsetControllerWidget> bVar24, @NotNull rW0.b<GeminiPlayerFollowWithFaceWidget> bVar25, @NotNull rW0.b<GeminiAudioControlWidget> bVar26, @NotNull rW0.b<GeminiPlayerCoinWidget> bVar27, @NotNull rW0.b<com.bilibili.app.gemini.player.widget.operation.a> bVar28, @NotNull rW0.b<GeminiVideoListSelectorWidget> bVar29, @NotNull rW0.b<SubtitleAndAiWidget> bVar30, @NotNull rW0.b<PlayerSpeedWidget> bVar31, @NotNull rW0.b<GeminiPlayerDislikeWidget> bVar32, @NotNull rW0.b<GeminiSeekForwardOrBackwardWidget> bVar33, @NotNull rW0.b<GeminiHalfSpeedWidget> bVar34, @NotNull rW0.b<GeminiHalfWatchpointTextWidget> bVar35, @NotNull rW0.b<GeminiHalfWatchpointWidget> bVar36, @NotNull rW0.b<GeminiProgressTextWidget> bVar37, @NotNull rW0.b<GeminiHalfAnchorWidget> bVar38, @NotNull rW0.b<com.bilibili.app.gemini.player.widget.base.a> bVar39, @NotNull rW0.b<GeminiHeatPeakView> bVar40) {
        this.f104725a = MapsKt.mapOf(new Pair[]{G.a(bVar32, GeminiPlayerDislikeWidget.class), G.a(bVar31, PlayerSpeedWidget.class), G.a(bVar29, GeminiVideoListSelectorWidget.class), G.a(bVar30, SubtitleAndAiWidget.class), G.a(bVar28, com.bilibili.app.gemini.player.widget.operation.a.class), G.a(bVar27, GeminiPlayerCoinWidget.class), G.a(bVar26, GeminiAudioControlWidget.class), G.a(bVar25, GeminiPlayerFollowWithFaceWidget.class), G.a(bVar, PlayerDateTextWidget.class), G.a(bVar2, PlayerSettingWidget.class), G.a(bVar3, PlayerNetworkTextWidget.class), G.a(bVar4, PlayerLockWidget.class), G.a(bVar5, PlayerBackWidget.class), G.a(bVar6, GeminiWatchpointIconsWidget.class), G.a(bVar7, GeminiSnapshotGifWidget.class), G.a(bVar8, GeminiPlayerTitleWidget.class), G.a(bVar9, GeminiPlayerShareIconWidget.class), G.a(bVar10, GeminiPlayerLikeWidget.class), G.a(bVar11, GeminiPlayerFullscreenWidget.class), G.a(bVar12, GeminiWatchpointTextWidget.class), G.a(bVar13, PlayerProgressTextWidget.class), G.a(bVar14, GeminiPlayerDanmakuRecommendWidget.class), G.a(bVar15, PlayerDanmakuSendWidget.class), G.a(bVar16, PlayerDanmakuSettingWidget.class), G.a(bVar17, PlayerDanmakuToggleWidget.class), G.a(bVar18, PlayerNextWidget.class), G.a(bVar19, PlayerPlayPauseWidget.class), G.a(bVar20, com.bilibili.app.gemini.player.widget.d.class), G.a(bVar21, PlayerSeekWidget3.class), G.a(bVar22, GeminiPlayerFullStoryWidget.class), G.a(bVar23, GeminiPlayerChargeWidget.class), G.a(bVar24, PlayerInsetControllerWidget.class), G.a(bVar33, GeminiSeekForwardOrBackwardWidget.class), G.a(bVar34, GeminiHalfSpeedWidget.class), G.a(bVar35, GeminiHalfWatchpointTextWidget.class), G.a(bVar37, GeminiProgressTextWidget.class), G.a(bVar36, GeminiHalfWatchpointWidget.class), G.a(bVar38, GeminiHalfAnchorWidget.class), G.a(bVar39, com.bilibili.app.gemini.player.widget.base.a.class), G.a(bVar40, GeminiHeatPeakView.class)});
        playerContainer.getPlayerServiceManager().setMembersInjector(this);
    }

    public final void a(@NotNull tv.danmaku.biliplayerv2.widget.a aVar) {
        ei1.c<? extends Object> cVar = this.f104725a.get(aVar.getClass());
        if (cVar == null) {
            defpackage.a.b("[theseus-united-ControlContainerMembersInjectorService-injectMembers] ", D.a(aVar.getClass(), "no membersInjector for widget: "), "ControlContainerMembersInjectorService-injectMembers");
        } else {
            cVar.a(aVar);
        }
    }
}
