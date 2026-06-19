package com.bilibili.playerbizcommon.widget.function.feedback;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.bplus.im.pblink.w;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.playerbizcommon.widget.function.feedback.PlayerFeedbackFragment;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerConfiguration;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerParamsV2;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.PlayerDataSource;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/c.class */
public final class c extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public PlayerContainer f80668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f80669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public FragmentManager f80670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public PlayerFeedbackFragment f80671d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/c$a.class */
    public static final class a implements PlayerFeedbackFragment.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f80672a;

        public a(c cVar) {
            this.f80672a = cVar;
        }

        @Override // com.bilibili.playerbizcommon.widget.function.feedback.PlayerFeedbackFragment.a
        public final void onFinish() {
            AbsFunctionWidgetService functionWidgetService;
            c cVar = this.f80672a;
            PlayerContainer playerContainer = cVar.f80668a;
            if (playerContainer == null || (functionWidgetService = playerContainer.getFunctionWidgetService()) == null) {
                return;
            }
            functionWidgetService.hideWidget(cVar.getToken());
        }
    }

    public c(@NotNull Context context) {
        super(context);
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80668a = playerContainer;
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        this.f80669b = LayoutInflater.from(context).inflate(2131495187, (ViewGroup) null);
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(context);
        if (fragmentActivityFindFragmentActivityOrNull != null) {
            this.f80670c = fragmentActivityFindFragmentActivityOrNull.getSupportFragmentManager();
        }
        View view = this.f80669b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            view = null;
        }
        return view;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.launchType(1);
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.persistent(true);
        builder.changeOrientationDisableWhenShow(true);
        return builder.build();
    }

    @NotNull
    public final String getTag() {
        return "PlayerFeedbackFunctionWidget";
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        FragmentManager fragmentManager = this.f80670c;
        if (fragmentManager == null) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager != null ? fragmentManager.beginTransaction() : null;
        PlayerFeedbackFragment playerFeedbackFragment = this.f80671d;
        if (playerFeedbackFragment != null && fragmentTransactionBeginTransaction != null) {
            fragmentTransactionBeginTransaction.remove(playerFeedbackFragment);
        }
        if (fragmentTransactionBeginTransaction != null) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }

    public final void onWidgetShow() {
        IVideosPlayDirectorService videoPlayDirectorService;
        PlayerDataSource playerDataSource;
        PlayerContainer playerContainer;
        IVideosPlayDirectorService videoPlayDirectorService2;
        Video currentVideo;
        Video.PlayableParams videoItem;
        PlayerParamsV2 playerParams;
        PlayerConfiguration config;
        IPlayerCoreService playerCoreService;
        IControlContainerService controlContainerService;
        super.onWidgetShow();
        PlayerContainer playerContainer2 = this.f80668a;
        if (((playerContainer2 == null || (controlContainerService = playerContainer2.getControlContainerService()) == null) ? null : controlContainerService.getScreenModeType()) == ScreenModeType.LANDSCAPE_FULLSCREEN) {
            View view = this.f80669b;
            View view2 = view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                view2 = null;
            }
            ((LinearLayout) view2.findViewById(2131301947)).setPadding(0, 0, (int) LA.f.a(44.0f, 1), 0);
        }
        PlayerContainer playerContainer3 = this.f80668a;
        if (playerContainer3 == null || (videoPlayDirectorService = playerContainer3.getVideoPlayDirectorService()) == null || (playerDataSource = videoPlayDirectorService.getPlayerDataSource()) == null || (playerContainer = this.f80668a) == null || (videoPlayDirectorService2 = playerContainer.getVideoPlayDirectorService()) == null || (currentVideo = videoPlayDirectorService2.getCurrentVideo()) == null || (videoItem = playerDataSource.getVideoItem(currentVideo, currentVideo.getCurrentIndex())) == null) {
            return;
        }
        Video.FeedbackParams feedbackParams = videoItem.getFeedbackParams();
        long aId = feedbackParams.getAId();
        long cId = feedbackParams.getCId();
        long seasonId = feedbackParams.getSeasonId();
        PlayerContainer playerContainer4 = this.f80668a;
        MediaResource mediaResource = (playerContainer4 == null || (playerCoreService = playerContainer4.getPlayerCoreService()) == null) ? null : playerCoreService.getMediaResource();
        String str = null;
        if (mediaResource != null) {
            PlayIndex playIndex = mediaResource.getPlayIndex();
            str = null;
            if (playIndex != null) {
                str = playIndex.mDescription;
            }
        }
        String spmid = feedbackParams.getSpmid();
        String fromSpmid = feedbackParams.getFromSpmid();
        FragmentManager fragmentManager = this.f80670c;
        if (fragmentManager == null) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        boolean zIsBangumi = feedbackParams.isBangumi();
        boolean zIsShowBangumiSkipHeadOption = feedbackParams.isShowBangumiSkipHeadOption();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        PlayerContainer playerContainer5 = this.f80668a;
        int theme = (playerContainer5 == null || (playerParams = playerContainer5.getPlayerParams()) == null || (config = playerParams.getConfig()) == null) ? 1 : config.getTheme();
        Bundle bundleA = w.a(aId, "key_avid");
        bundleA.putLong("key_cid", cId);
        bundleA.putLong("key_season_id", seasonId);
        bundleA.putBoolean("key_is_bangumi", zIsBangumi);
        bundleA.putBoolean("key_is_show_bangumi_skip_head_option", zIsShowBangumiSkipHeadOption);
        bundleA.putBoolean("key_from_player", true);
        bundleA.putString("key_player_tag", str2);
        bundleA.putString("key_spmid", spmid);
        bundleA.putString("key_from_spmid", fromSpmid);
        bundleA.putInt("theme", theme);
        PlayerFeedbackFragment playerFeedbackFragment = new PlayerFeedbackFragment();
        playerFeedbackFragment.setArguments(bundleA);
        this.f80671d = playerFeedbackFragment;
        PlayerContainer playerContainer6 = this.f80668a;
        boolean zIsToastAvailable = true;
        if (playerContainer6 != null) {
            IToastService toastService = playerContainer6.getToastService();
            zIsToastAvailable = true;
            if (toastService != null) {
                zIsToastAvailable = toastService.isToastAvailable();
            }
        }
        PlayerFeedbackFragment playerFeedbackFragment2 = this.f80671d;
        if (playerFeedbackFragment2 != null) {
            playerFeedbackFragment2.h = zIsToastAvailable;
        }
        if (playerFeedbackFragment2 != null) {
            playerFeedbackFragment2.f80653k = new a(this);
        }
        if (playerFeedbackFragment2 != null && fragmentTransactionBeginTransaction != null) {
            fragmentTransactionBeginTransaction.add(2131301947, playerFeedbackFragment2);
        }
        if (fragmentTransactionBeginTransaction != null) {
            fragmentTransactionBeginTransaction.commit();
        }
    }
}
