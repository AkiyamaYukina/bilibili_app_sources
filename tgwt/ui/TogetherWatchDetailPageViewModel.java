package com.bilibili.tgwt.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.bilibili.bangumi.logic.page.detail.report.PageReportService;
import com.bilibili.bangumi.logic.page.detail.service.BangumiFullscreenWebContainerService;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerBizService;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPreloadPlayHandlerService;
import com.bilibili.bangumi.logic.page.detail.service.ChronosBizService;
import com.bilibili.bangumi.logic.page.detail.service.CommunityService;
import com.bilibili.bangumi.logic.page.detail.service.DetailRightPanelService;
import com.bilibili.bangumi.logic.page.detail.service.OGVDolbyService;
import com.bilibili.bangumi.logic.page.detail.service.OGVToastProcessService;
import com.bilibili.bangumi.logic.page.detail.service.PageViewService;
import com.bilibili.bangumi.logic.page.detail.service.ParentViewService;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.bangumi.logic.page.detail.service.PlayHistoryService;
import com.bilibili.bangumi.logic.page.detail.service.PlaySeekBarTimeService;
import com.bilibili.bangumi.logic.page.detail.service.PlayStrategyControlService;
import com.bilibili.bangumi.logic.page.detail.service.PlayerHelper;
import com.bilibili.bangumi.logic.page.detail.service.ScreenModeService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.SeekBizService;
import com.bilibili.bangumi.logic.page.detail.service.SwitchDubbingService;
import com.bilibili.bangumi.logic.page.detail.service.ToolbarService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiDanmakuService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopFragmentService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.LegacyPagePopService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSectionService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.OGVNonAutoPlayService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.OGVPlayerLoadingCoverService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.OGVVipService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.PlayLimitedLayerService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.pay.NewPayService;
import com.bilibili.bangumi.player.commonplayer.utils.di.ServiceInFieldsHelper;
import com.bilibili.bangumi.ui.page.detail.processor.dragmode.DetailVideoContainerDragModeProcessor;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.player.processor.TogetherWatchChatImageProcessor;
import com.bilibili.tgwt.player.processor.TogetherWatchEndPageProcessor;
import com.bilibili.tgwt.player.processor.TogetherWatchPlayProcessor;
import com.bilibili.tgwt.player.processor.k;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.service.ChatVoiceRtcService;
import com.bilibili.tgwt.service.TogetherWatchToolbarService;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageViewModel.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchDetailPageViewModel extends ViewModel implements dm.a {
    public static final int $stable = 8;

    @Inject
    public ActivityContextParamsService activityContextParamsService;

    @Inject
    public BangumiPlayerBizService bangumiPlayerBizService;

    @Inject
    public ChatRoomManagerService chatRoomManagerService;

    @Inject
    public ChatService chatService;

    @Inject
    public TogetherWatchToolbarService chatToolBarService;

    @Inject
    public ChatVoiceRtcService chatVoiceRtcService;

    @Inject
    public ChronosBizService chronosBizService;

    @Inject
    public CommunityService communityService;

    @Inject
    public BangumiDanmakuService danmakuService;

    @Inject
    public Hl.a detailChatService;

    @Inject
    public DetailVideoContainerDragModeProcessor detailVideoContainerDragModeService;

    @Inject
    public OGVDolbyService dolbyService;

    @Inject
    public com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.b drmService;

    @Inject
    public BangumiFullscreenWebContainerService fullscreenWebContainerService;

    @Inject
    public OGVNonAutoPlayService nonAutoPlayService;

    @Inject
    public PageReportService pageReportService;

    @Inject
    public PageViewService pageViewService;

    @Inject
    public ParentViewService parentViewService;

    @Inject
    public NewPayService payService;

    @Inject
    public pm.a pgcBackgroundPlayControlBridge;

    @Inject
    public PlayControlService playControlService;

    @Inject
    public PlayHistoryService playHistoryService;

    @Inject
    public PlayLimitedLayerService playLimitedLayerService;

    @Inject
    public PlaySeekBarTimeService playSeekBarTimeService;

    @Inject
    public PlayStrategyControlService playStrategyControlService;

    @Inject
    public BangumiPlayerContainerService playerContainerService;

    @Inject
    public PlayerHelper playerHelper;

    @Inject
    public OGVPlayerLoadingCoverService playerLoadingCoverService;

    @Inject
    public com.bilibili.tgwt.watermark.b playerWatermarkService;

    @Inject
    public BangumiPopFragmentService popFragmentService;

    @Inject
    public BangumiPreloadPlayHandlerService preloadPlayHandlerService;

    @Inject
    public com.bilibili.bangumi.ui.page.detail.playerV2.processor.c qualityProcessorService;

    @Inject
    public DetailRightPanelService rightPanelService;

    @Inject
    public ScreenModeService screenModeService;

    @Inject
    public ScreenStateService screenStateService;

    @Inject
    public NewSeasonService seasonService;

    @Inject
    public NewSectionService sectionService;

    @Inject
    public SeekBizService seekBizService;

    @NotNull
    private final ServiceInFieldsHelper serviceInFieldsHelper = new ServiceInFieldsHelper();

    @Inject
    public NewShareService shareService;

    @Inject
    public SwitchDubbingService switchDubbingService;

    @Inject
    public OGVToastProcessService toastService;

    @Inject
    public TogetherWatchPlayProcessor togetherPlayProcessor;

    @Inject
    public com.bilibili.tgwt.player.processor.a togetherWatchAutoFullScreenProcessor;

    @Inject
    public TogetherWatchChatImageProcessor togetherWatchChatImageProcessor;

    @Inject
    public com.bilibili.tgwt.player.processor.f togetherWatchChatPopupProcessService;

    @Inject
    public k togetherWatchChatVoicePopupProcessor;

    @Inject
    public TogetherWatchEndPageProcessor togetherWatchEndPageProcessor;

    @Inject
    public ToolbarService toolbarService;

    @Inject
    public OGVVipService vipService;

    @Inject
    public LegacyPagePopService webAndExternalBusinessPagePopService;

    @Inject
    public TogetherWatchDetailPageViewModel() {
    }

    public final void clearServiceCache() {
        this.serviceInFieldsHelper.clear();
    }

    @NotNull
    public final ActivityContextParamsService getActivityContextParamsService() {
        ActivityContextParamsService activityContextParamsService = this.activityContextParamsService;
        if (activityContextParamsService != null) {
            return activityContextParamsService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityContextParamsService");
        return null;
    }

    @NotNull
    public final BangumiPlayerBizService getBangumiPlayerBizService() {
        BangumiPlayerBizService bangumiPlayerBizService = this.bangumiPlayerBizService;
        if (bangumiPlayerBizService != null) {
            return bangumiPlayerBizService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bangumiPlayerBizService");
        return null;
    }

    @NotNull
    public final ChatRoomManagerService getChatRoomManagerService() {
        ChatRoomManagerService chatRoomManagerService = this.chatRoomManagerService;
        if (chatRoomManagerService != null) {
            return chatRoomManagerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chatRoomManagerService");
        return null;
    }

    @NotNull
    public final ChatService getChatService() {
        ChatService chatService = this.chatService;
        if (chatService != null) {
            return chatService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chatService");
        return null;
    }

    @NotNull
    public final TogetherWatchToolbarService getChatToolBarService() {
        TogetherWatchToolbarService togetherWatchToolbarService = this.chatToolBarService;
        if (togetherWatchToolbarService != null) {
            return togetherWatchToolbarService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chatToolBarService");
        return null;
    }

    @NotNull
    public final ChatVoiceRtcService getChatVoiceRtcService() {
        ChatVoiceRtcService chatVoiceRtcService = this.chatVoiceRtcService;
        if (chatVoiceRtcService != null) {
            return chatVoiceRtcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chatVoiceRtcService");
        return null;
    }

    @NotNull
    public final ChronosBizService getChronosBizService() {
        ChronosBizService chronosBizService = this.chronosBizService;
        if (chronosBizService != null) {
            return chronosBizService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chronosBizService");
        return null;
    }

    @NotNull
    public final CommunityService getCommunityService() {
        CommunityService communityService = this.communityService;
        if (communityService != null) {
            return communityService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("communityService");
        return null;
    }

    @NotNull
    public final BangumiDanmakuService getDanmakuService() {
        BangumiDanmakuService bangumiDanmakuService = this.danmakuService;
        if (bangumiDanmakuService != null) {
            return bangumiDanmakuService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
        return null;
    }

    @NotNull
    public final Hl.a getDetailChatService() {
        Hl.a aVar = this.detailChatService;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("detailChatService");
        return null;
    }

    @NotNull
    public final DetailVideoContainerDragModeProcessor getDetailVideoContainerDragModeService() {
        DetailVideoContainerDragModeProcessor detailVideoContainerDragModeProcessor = this.detailVideoContainerDragModeService;
        if (detailVideoContainerDragModeProcessor != null) {
            return detailVideoContainerDragModeProcessor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("detailVideoContainerDragModeService");
        return null;
    }

    @NotNull
    public final OGVDolbyService getDolbyService() {
        OGVDolbyService oGVDolbyService = this.dolbyService;
        if (oGVDolbyService != null) {
            return oGVDolbyService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dolbyService");
        return null;
    }

    @NotNull
    public final com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.b getDrmService() {
        com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.b bVar = this.drmService;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drmService");
        return null;
    }

    @NotNull
    public final BangumiFullscreenWebContainerService getFullscreenWebContainerService() {
        BangumiFullscreenWebContainerService bangumiFullscreenWebContainerService = this.fullscreenWebContainerService;
        if (bangumiFullscreenWebContainerService != null) {
            return bangumiFullscreenWebContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fullscreenWebContainerService");
        return null;
    }

    @NotNull
    public final OGVNonAutoPlayService getNonAutoPlayService() {
        OGVNonAutoPlayService oGVNonAutoPlayService = this.nonAutoPlayService;
        if (oGVNonAutoPlayService != null) {
            return oGVNonAutoPlayService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nonAutoPlayService");
        return null;
    }

    @NotNull
    public final PageReportService getPageReportService() {
        PageReportService pageReportService = this.pageReportService;
        if (pageReportService != null) {
            return pageReportService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pageReportService");
        return null;
    }

    @NotNull
    public final PageViewService getPageViewService() {
        PageViewService pageViewService = this.pageViewService;
        if (pageViewService != null) {
            return pageViewService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pageViewService");
        return null;
    }

    @NotNull
    public final ParentViewService getParentViewService() {
        ParentViewService parentViewService = this.parentViewService;
        if (parentViewService != null) {
            return parentViewService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parentViewService");
        return null;
    }

    @NotNull
    public final NewPayService getPayService() {
        NewPayService newPayService = this.payService;
        if (newPayService != null) {
            return newPayService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("payService");
        return null;
    }

    @NotNull
    public final pm.a getPgcBackgroundPlayControlBridge() {
        pm.a aVar = this.pgcBackgroundPlayControlBridge;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pgcBackgroundPlayControlBridge");
        return null;
    }

    @NotNull
    public final PlayControlService getPlayControlService() {
        PlayControlService playControlService = this.playControlService;
        if (playControlService != null) {
            return playControlService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playControlService");
        return null;
    }

    @NotNull
    public final PlayHistoryService getPlayHistoryService() {
        PlayHistoryService playHistoryService = this.playHistoryService;
        if (playHistoryService != null) {
            return playHistoryService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playHistoryService");
        return null;
    }

    @NotNull
    public final PlayLimitedLayerService getPlayLimitedLayerService() {
        PlayLimitedLayerService playLimitedLayerService = this.playLimitedLayerService;
        if (playLimitedLayerService != null) {
            return playLimitedLayerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playLimitedLayerService");
        return null;
    }

    @NotNull
    public final PlaySeekBarTimeService getPlaySeekBarTimeService() {
        PlaySeekBarTimeService playSeekBarTimeService = this.playSeekBarTimeService;
        if (playSeekBarTimeService != null) {
            return playSeekBarTimeService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playSeekBarTimeService");
        return null;
    }

    @NotNull
    public final PlayStrategyControlService getPlayStrategyControlService() {
        PlayStrategyControlService playStrategyControlService = this.playStrategyControlService;
        if (playStrategyControlService != null) {
            return playStrategyControlService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playStrategyControlService");
        return null;
    }

    @NotNull
    public final BangumiPlayerContainerService getPlayerContainerService() {
        BangumiPlayerContainerService bangumiPlayerContainerService = this.playerContainerService;
        if (bangumiPlayerContainerService != null) {
            return bangumiPlayerContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerContainerService");
        return null;
    }

    @NotNull
    public final PlayerHelper getPlayerHelper() {
        PlayerHelper playerHelper = this.playerHelper;
        if (playerHelper != null) {
            return playerHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerHelper");
        return null;
    }

    @NotNull
    public final OGVPlayerLoadingCoverService getPlayerLoadingCoverService() {
        OGVPlayerLoadingCoverService oGVPlayerLoadingCoverService = this.playerLoadingCoverService;
        if (oGVPlayerLoadingCoverService != null) {
            return oGVPlayerLoadingCoverService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerLoadingCoverService");
        return null;
    }

    @NotNull
    public final com.bilibili.tgwt.watermark.b getPlayerWatermarkService() {
        com.bilibili.tgwt.watermark.b bVar = this.playerWatermarkService;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerWatermarkService");
        return null;
    }

    @NotNull
    public final BangumiPopFragmentService getPopFragmentService() {
        BangumiPopFragmentService bangumiPopFragmentService = this.popFragmentService;
        if (bangumiPopFragmentService != null) {
            return bangumiPopFragmentService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("popFragmentService");
        return null;
    }

    @NotNull
    public final BangumiPreloadPlayHandlerService getPreloadPlayHandlerService() {
        BangumiPreloadPlayHandlerService bangumiPreloadPlayHandlerService = this.preloadPlayHandlerService;
        if (bangumiPreloadPlayHandlerService != null) {
            return bangumiPreloadPlayHandlerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preloadPlayHandlerService");
        return null;
    }

    @NotNull
    public final com.bilibili.bangumi.ui.page.detail.playerV2.processor.c getQualityProcessorService() {
        com.bilibili.bangumi.ui.page.detail.playerV2.processor.c cVar = this.qualityProcessorService;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("qualityProcessorService");
        return null;
    }

    @NotNull
    public final DetailRightPanelService getRightPanelService() {
        DetailRightPanelService detailRightPanelService = this.rightPanelService;
        if (detailRightPanelService != null) {
            return detailRightPanelService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rightPanelService");
        return null;
    }

    @NotNull
    public final ScreenModeService getScreenModeService() {
        ScreenModeService screenModeService = this.screenModeService;
        if (screenModeService != null) {
            return screenModeService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenModeService");
        return null;
    }

    @NotNull
    public final ScreenStateService getScreenStateService() {
        ScreenStateService screenStateService = this.screenStateService;
        if (screenStateService != null) {
            return screenStateService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenStateService");
        return null;
    }

    @NotNull
    public final NewSeasonService getSeasonService() {
        NewSeasonService newSeasonService = this.seasonService;
        if (newSeasonService != null) {
            return newSeasonService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seasonService");
        return null;
    }

    @NotNull
    public final NewSectionService getSectionService() {
        NewSectionService newSectionService = this.sectionService;
        if (newSectionService != null) {
            return newSectionService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sectionService");
        return null;
    }

    @NotNull
    public final SeekBizService getSeekBizService() {
        SeekBizService seekBizService = this.seekBizService;
        if (seekBizService != null) {
            return seekBizService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seekBizService");
        return null;
    }

    @NotNull
    public <T> T getService(@NotNull Class<T> cls) {
        return (T) this.serviceInFieldsHelper.requireService(this, cls);
    }

    @NotNull
    public final NewShareService getShareService() {
        NewShareService newShareService = this.shareService;
        if (newShareService != null) {
            return newShareService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shareService");
        return null;
    }

    @NotNull
    public final SwitchDubbingService getSwitchDubbingService() {
        SwitchDubbingService switchDubbingService = this.switchDubbingService;
        if (switchDubbingService != null) {
            return switchDubbingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("switchDubbingService");
        return null;
    }

    @NotNull
    public final OGVToastProcessService getToastService() {
        OGVToastProcessService oGVToastProcessService = this.toastService;
        if (oGVToastProcessService != null) {
            return oGVToastProcessService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toastService");
        return null;
    }

    @NotNull
    public final TogetherWatchPlayProcessor getTogetherPlayProcessor() {
        TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.togetherPlayProcessor;
        if (togetherWatchPlayProcessor != null) {
            return togetherWatchPlayProcessor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("togetherPlayProcessor");
        return null;
    }

    @NotNull
    public final com.bilibili.tgwt.player.processor.a getTogetherWatchAutoFullScreenProcessor() {
        com.bilibili.tgwt.player.processor.a aVar = this.togetherWatchAutoFullScreenProcessor;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("togetherWatchAutoFullScreenProcessor");
        return null;
    }

    @NotNull
    public final TogetherWatchChatImageProcessor getTogetherWatchChatImageProcessor() {
        TogetherWatchChatImageProcessor togetherWatchChatImageProcessor = this.togetherWatchChatImageProcessor;
        if (togetherWatchChatImageProcessor != null) {
            return togetherWatchChatImageProcessor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("togetherWatchChatImageProcessor");
        return null;
    }

    @NotNull
    public final com.bilibili.tgwt.player.processor.f getTogetherWatchChatPopupProcessService() {
        com.bilibili.tgwt.player.processor.f fVar = this.togetherWatchChatPopupProcessService;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("togetherWatchChatPopupProcessService");
        return null;
    }

    @NotNull
    public final k getTogetherWatchChatVoicePopupProcessor() {
        k kVar = this.togetherWatchChatVoicePopupProcessor;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("togetherWatchChatVoicePopupProcessor");
        return null;
    }

    @NotNull
    public final TogetherWatchEndPageProcessor getTogetherWatchEndPageProcessor() {
        TogetherWatchEndPageProcessor togetherWatchEndPageProcessor = this.togetherWatchEndPageProcessor;
        if (togetherWatchEndPageProcessor != null) {
            return togetherWatchEndPageProcessor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("togetherWatchEndPageProcessor");
        return null;
    }

    @NotNull
    public final ToolbarService getToolbarService() {
        ToolbarService toolbarService = this.toolbarService;
        if (toolbarService != null) {
            return toolbarService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toolbarService");
        return null;
    }

    @NotNull
    public final OGVVipService getVipService() {
        OGVVipService oGVVipService = this.vipService;
        if (oGVVipService != null) {
            return oGVVipService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vipService");
        return null;
    }

    @NotNull
    public final LegacyPagePopService getWebAndExternalBusinessPagePopService() {
        LegacyPagePopService legacyPagePopService = this.webAndExternalBusinessPagePopService;
        if (legacyPagePopService != null) {
            return legacyPagePopService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webAndExternalBusinessPagePopService");
        return null;
    }

    public final void setActivityContextParamsService(@NotNull ActivityContextParamsService activityContextParamsService) {
        this.activityContextParamsService = activityContextParamsService;
    }

    public final void setBangumiPlayerBizService(@NotNull BangumiPlayerBizService bangumiPlayerBizService) {
        this.bangumiPlayerBizService = bangumiPlayerBizService;
    }

    public final void setChatRoomManagerService(@NotNull ChatRoomManagerService chatRoomManagerService) {
        this.chatRoomManagerService = chatRoomManagerService;
    }

    public final void setChatService(@NotNull ChatService chatService) {
        this.chatService = chatService;
    }

    public final void setChatToolBarService(@NotNull TogetherWatchToolbarService togetherWatchToolbarService) {
        this.chatToolBarService = togetherWatchToolbarService;
    }

    public final void setChatVoiceRtcService(@NotNull ChatVoiceRtcService chatVoiceRtcService) {
        this.chatVoiceRtcService = chatVoiceRtcService;
    }

    public final void setChronosBizService(@NotNull ChronosBizService chronosBizService) {
        this.chronosBizService = chronosBizService;
    }

    public final void setCommunityService(@NotNull CommunityService communityService) {
        this.communityService = communityService;
    }

    public final void setDanmakuService(@NotNull BangumiDanmakuService bangumiDanmakuService) {
        this.danmakuService = bangumiDanmakuService;
    }

    public final void setDetailChatService(@NotNull Hl.a aVar) {
        this.detailChatService = aVar;
    }

    public final void setDetailVideoContainerDragModeService(@NotNull DetailVideoContainerDragModeProcessor detailVideoContainerDragModeProcessor) {
        this.detailVideoContainerDragModeService = detailVideoContainerDragModeProcessor;
    }

    public final void setDolbyService(@NotNull OGVDolbyService oGVDolbyService) {
        this.dolbyService = oGVDolbyService;
    }

    public final void setDrmService(@NotNull com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.b bVar) {
        this.drmService = bVar;
    }

    public final void setFullscreenWebContainerService(@NotNull BangumiFullscreenWebContainerService bangumiFullscreenWebContainerService) {
        this.fullscreenWebContainerService = bangumiFullscreenWebContainerService;
    }

    public final void setNonAutoPlayService(@NotNull OGVNonAutoPlayService oGVNonAutoPlayService) {
        this.nonAutoPlayService = oGVNonAutoPlayService;
    }

    public final void setPageReportService(@NotNull PageReportService pageReportService) {
        this.pageReportService = pageReportService;
    }

    public final void setPageViewService(@NotNull PageViewService pageViewService) {
        this.pageViewService = pageViewService;
    }

    public final void setParentViewService(@NotNull ParentViewService parentViewService) {
        this.parentViewService = parentViewService;
    }

    public final void setPayService(@NotNull NewPayService newPayService) {
        this.payService = newPayService;
    }

    public final void setPgcBackgroundPlayControlBridge(@NotNull pm.a aVar) {
        this.pgcBackgroundPlayControlBridge = aVar;
    }

    public final void setPlayControlService(@NotNull PlayControlService playControlService) {
        this.playControlService = playControlService;
    }

    public final void setPlayHistoryService(@NotNull PlayHistoryService playHistoryService) {
        this.playHistoryService = playHistoryService;
    }

    public final void setPlayLimitedLayerService(@NotNull PlayLimitedLayerService playLimitedLayerService) {
        this.playLimitedLayerService = playLimitedLayerService;
    }

    public final void setPlaySeekBarTimeService(@NotNull PlaySeekBarTimeService playSeekBarTimeService) {
        this.playSeekBarTimeService = playSeekBarTimeService;
    }

    public final void setPlayStrategyControlService(@NotNull PlayStrategyControlService playStrategyControlService) {
        this.playStrategyControlService = playStrategyControlService;
    }

    public final void setPlayerContainerService(@NotNull BangumiPlayerContainerService bangumiPlayerContainerService) {
        this.playerContainerService = bangumiPlayerContainerService;
    }

    public final void setPlayerHelper(@NotNull PlayerHelper playerHelper) {
        this.playerHelper = playerHelper;
    }

    public final void setPlayerLoadingCoverService(@NotNull OGVPlayerLoadingCoverService oGVPlayerLoadingCoverService) {
        this.playerLoadingCoverService = oGVPlayerLoadingCoverService;
    }

    public final void setPlayerWatermarkService(@NotNull com.bilibili.tgwt.watermark.b bVar) {
        this.playerWatermarkService = bVar;
    }

    public final void setPopFragmentService(@NotNull BangumiPopFragmentService bangumiPopFragmentService) {
        this.popFragmentService = bangumiPopFragmentService;
    }

    public final void setPreloadPlayHandlerService(@NotNull BangumiPreloadPlayHandlerService bangumiPreloadPlayHandlerService) {
        this.preloadPlayHandlerService = bangumiPreloadPlayHandlerService;
    }

    public final void setQualityProcessorService(@NotNull com.bilibili.bangumi.ui.page.detail.playerV2.processor.c cVar) {
        this.qualityProcessorService = cVar;
    }

    public final void setRightPanelService(@NotNull DetailRightPanelService detailRightPanelService) {
        this.rightPanelService = detailRightPanelService;
    }

    public final void setScreenModeService(@NotNull ScreenModeService screenModeService) {
        this.screenModeService = screenModeService;
    }

    public final void setScreenStateService(@NotNull ScreenStateService screenStateService) {
        this.screenStateService = screenStateService;
    }

    public final void setSeasonService(@NotNull NewSeasonService newSeasonService) {
        this.seasonService = newSeasonService;
    }

    public final void setSectionService(@NotNull NewSectionService newSectionService) {
        this.sectionService = newSectionService;
    }

    public final void setSeekBizService(@NotNull SeekBizService seekBizService) {
        this.seekBizService = seekBizService;
    }

    public final void setShareService(@NotNull NewShareService newShareService) {
        this.shareService = newShareService;
    }

    public final void setSwitchDubbingService(@NotNull SwitchDubbingService switchDubbingService) {
        this.switchDubbingService = switchDubbingService;
    }

    public final void setToastService(@NotNull OGVToastProcessService oGVToastProcessService) {
        this.toastService = oGVToastProcessService;
    }

    public final void setTogetherPlayProcessor(@NotNull TogetherWatchPlayProcessor togetherWatchPlayProcessor) {
        this.togetherPlayProcessor = togetherWatchPlayProcessor;
    }

    public final void setTogetherWatchAutoFullScreenProcessor(@NotNull com.bilibili.tgwt.player.processor.a aVar) {
        this.togetherWatchAutoFullScreenProcessor = aVar;
    }

    public final void setTogetherWatchChatImageProcessor(@NotNull TogetherWatchChatImageProcessor togetherWatchChatImageProcessor) {
        this.togetherWatchChatImageProcessor = togetherWatchChatImageProcessor;
    }

    public final void setTogetherWatchChatPopupProcessService(@NotNull com.bilibili.tgwt.player.processor.f fVar) {
        this.togetherWatchChatPopupProcessService = fVar;
    }

    public final void setTogetherWatchChatVoicePopupProcessor(@NotNull k kVar) {
        this.togetherWatchChatVoicePopupProcessor = kVar;
    }

    public final void setTogetherWatchEndPageProcessor(@NotNull TogetherWatchEndPageProcessor togetherWatchEndPageProcessor) {
        this.togetherWatchEndPageProcessor = togetherWatchEndPageProcessor;
    }

    public final void setToolbarService(@NotNull ToolbarService toolbarService) {
        this.toolbarService = toolbarService;
    }

    public final void setVipService(@NotNull OGVVipService oGVVipService) {
        this.vipService = oGVVipService;
    }

    public final void setWebAndExternalBusinessPagePopService(@NotNull LegacyPagePopService legacyPagePopService) {
        this.webAndExternalBusinessPagePopService = legacyPagePopService;
    }
}
