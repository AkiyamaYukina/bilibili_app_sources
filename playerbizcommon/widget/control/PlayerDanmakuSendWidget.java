package com.bilibili.playerbizcommon.widget.control;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bapis.bilibili.community.service.dm.v1.ClickButtonV2;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bapis.bilibili.community.service.dm.v1.ExposureType;
import com.bapis.bilibili.community.service.dm.v1.PostPanelBizType;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bapis.bilibili.community.service.dm.v1.PostStatus;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.playerbizcommon.features.danmaku.input.DanmakuInputWindowService;
import com.bilibili.playerbizcommon.view.FromTextView;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.collection.Collections;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.ControlWidgetChangedObserver;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.LifecycleObserver;
import tv.danmaku.biliplayerv2.service.LifecycleState;
import tv.danmaku.biliplayerv2.service.PlayerDataSource;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.DanmakuInputClickInterceptor;
import tv.danmaku.biliplayerv2.service.interact.biz.s;
import tv.danmaku.biliplayerv2.service.interact.core.DanmakuVisibleObserver;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuSendWidget.class */
public final class PlayerDanmakuSendWidget extends FromTextView implements IControlWidget, View.OnClickListener, View.OnKeyListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f80469s = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PlayerContainer f80470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<DanmakuInputWindowService> f80471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<pq0.c> f80472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f80473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f80474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Zq0.c f80475g;

    @Nullable
    public ViewPropertyAnimator h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final g f80477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final d f80478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final c f80479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final h f80480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final e f80481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final f f80482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final b f80483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final a f80484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final i f80485r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuSendWidget$a.class */
    public static final class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSendWidget f80486a;

        public a(PlayerDanmakuSendWidget playerDanmakuSendWidget) {
            this.f80486a = playerDanmakuSendWidget;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PlayerDanmakuSendWidget playerDanmakuSendWidget = this.f80486a;
            int i7 = PlayerDanmakuSendWidget.f80469s;
            playerDanmakuSendWidget.setAlpha(0.0f);
            playerDanmakuSendWidget.setEnabled(false);
            playerDanmakuSendWidget.setClickable(false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuSendWidget$b.class */
    public static final class b implements PassportObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSendWidget f80487a;

        public b(PlayerDanmakuSendWidget playerDanmakuSendWidget) {
            this.f80487a = playerDanmakuSendWidget;
        }

        public final void onChange(Topic topic) {
            if (topic == Topic.ACCOUNT_INFO_UPDATE) {
                PlayerDanmakuSendWidget playerDanmakuSendWidget = this.f80487a;
                if (playerDanmakuSendWidget.getContext() != null && playerDanmakuSendWidget.f80476i) {
                    playerDanmakuSendWidget.f80476i = false;
                    playerDanmakuSendWidget.O();
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuSendWidget$c.class */
    public static final class c implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSendWidget f80488a;

        public c(PlayerDanmakuSendWidget playerDanmakuSendWidget) {
            this.f80488a = playerDanmakuSendWidget;
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
            if (z6) {
                PlayerDanmakuSendWidget playerDanmakuSendWidget = this.f80488a;
                if ((playerDanmakuSendWidget.f80473e || !BiliAccounts.get(playerDanmakuSendWidget.getContext()).isLogin()) && playerDanmakuSendWidget.getCurrentPostPanel() == null) {
                    return;
                }
                playerDanmakuSendWidget.Q();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuSendWidget$d.class */
    public static final class d implements ControlWidgetChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSendWidget f80489a;

        public d(PlayerDanmakuSendWidget playerDanmakuSendWidget) {
            this.f80489a = playerDanmakuSendWidget;
        }

        public final void onControllerWidgetChanged() {
            int i7 = PlayerDanmakuSendWidget.f80469s;
            this.f80489a.S();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuSendWidget$e.class */
    public static final class e implements DanmakuVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSendWidget f80490a;

        public e(PlayerDanmakuSendWidget playerDanmakuSendWidget) {
            this.f80490a = playerDanmakuSendWidget;
        }

        public final void onDanmakuVisibleChanged(boolean z6, boolean z7) {
            ViewPropertyAnimator viewPropertyAnimator;
            ViewPropertyAnimator viewPropertyAnimatorAlpha;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator listener;
            ViewPropertyAnimator viewPropertyAnimator2;
            ViewPropertyAnimator viewPropertyAnimatorAlpha2;
            ViewPropertyAnimator duration2;
            ViewPropertyAnimator listener2;
            int i7 = PlayerDanmakuSendWidget.f80469s;
            PlayerDanmakuSendWidget playerDanmakuSendWidget = this.f80490a;
            if (playerDanmakuSendWidget.getVisibility() != 0) {
                playerDanmakuSendWidget.Q();
                return;
            }
            if (playerDanmakuSendWidget.h == null) {
                playerDanmakuSendWidget.h = playerDanmakuSendWidget.animate();
            }
            ViewPropertyAnimator viewPropertyAnimator3 = playerDanmakuSendWidget.h;
            if (viewPropertyAnimator3 != null) {
                viewPropertyAnimator3.cancel();
            }
            if (z6) {
                if (playerDanmakuSendWidget.getAlpha() == 1.0f || (viewPropertyAnimator2 = playerDanmakuSendWidget.h) == null || (viewPropertyAnimatorAlpha2 = viewPropertyAnimator2.alpha(1.0f)) == null || (duration2 = viewPropertyAnimatorAlpha2.setDuration(250L)) == null || (listener2 = duration2.setListener(playerDanmakuSendWidget.f80485r)) == null) {
                    return;
                }
                listener2.start();
                return;
            }
            if (playerDanmakuSendWidget.getAlpha() == 0.0f || (viewPropertyAnimator = playerDanmakuSendWidget.h) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimator.alpha(0.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(250L)) == null || (listener = duration.setListener(playerDanmakuSendWidget.f80484q)) == null) {
                return;
            }
            listener.start();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuSendWidget$f.class */
    public static final class f implements LifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSendWidget f80491a;

        public f(PlayerDanmakuSendWidget playerDanmakuSendWidget) {
            this.f80491a = playerDanmakuSendWidget;
        }

        public final void onLifecycleChanged(LifecycleState lifecycleState) {
            if (lifecycleState == LifecycleState.ACTIVITY_RESUME) {
                PlayerDanmakuSendWidget playerDanmakuSendWidget = this.f80491a;
                if (playerDanmakuSendWidget.f80476i && !BiliAccounts.get(playerDanmakuSendWidget.getContext()).isLogin()) {
                    playerDanmakuSendWidget.f80476i = false;
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuSendWidget$g.class */
    public static final class g implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSendWidget f80492a;

        public g(PlayerDanmakuSendWidget playerDanmakuSendWidget) {
            this.f80492a = playerDanmakuSendWidget;
        }

        public final void onPostPanelActive(int i7, PostPanelV2 postPanelV2) {
            int i8 = PlayerDanmakuSendWidget.f80469s;
            this.f80492a.R();
        }

        public final void onPostPanelInactive(int i7, PostPanelV2 postPanelV2) {
            int i8 = PlayerDanmakuSendWidget.f80469s;
            this.f80492a.R();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuSendWidget$h.class */
    public static final class h implements IVideosPlayDirectorService.VideoPlayEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSendWidget f80493a;

        public h(PlayerDanmakuSendWidget playerDanmakuSendWidget) {
            this.f80493a = playerDanmakuSendWidget;
        }

        public final void onVideoStart(Video video) {
            int i7 = PlayerDanmakuSendWidget.f80469s;
            PlayerDanmakuSendWidget playerDanmakuSendWidget = this.f80493a;
            IPlayerContainer iPlayerContainer = playerDanmakuSendWidget.f80470b;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            DanmakuVisibleObserver.onDanmakuVisibleChanged$default(playerDanmakuSendWidget.f80481n, iPlayerContainer2.getInteractLayerService().isDanmakuVisible(), false, 2, (Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDanmakuSendWidget$i.class */
    public static final class i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSendWidget f80494a;

        public i(PlayerDanmakuSendWidget playerDanmakuSendWidget) {
            this.f80494a = playerDanmakuSendWidget;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PlayerDanmakuSendWidget playerDanmakuSendWidget = this.f80494a;
            int i7 = PlayerDanmakuSendWidget.f80469s;
            playerDanmakuSendWidget.M();
            this.f80494a.Q();
        }
    }

    public PlayerDanmakuSendWidget(@NotNull Context context) {
        this(context, null, 0);
    }

    public PlayerDanmakuSendWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerDanmakuSendWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 0);
        this.f80471c = new PlayerServiceManager.Client<>();
        this.f80472d = new PlayerServiceManager.Client<>();
        this.f80477j = new g(this);
        this.f80478k = new d(this);
        this.f80479l = new c(this);
        this.f80480m = new h(this);
        this.f80481n = new e(this);
        this.f80482o = new f(this);
        this.f80483p = new b(this);
        this.f80484q = new a(this);
        this.f80485r = new i(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dq0.e.f116622b, 0, 0);
        this.f80474f = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        setContentDescription("bbplayer_fullscreen_dminput");
        setOnClickListener(this);
    }

    private final String getClickButtonHint() {
        PostPanelV2 currentPostPanel = getCurrentPostPanel();
        String landscapeText = "";
        if (currentPostPanel != null) {
            ClickButtonV2 clickButton = currentPostPanel.getClickButton();
            if (clickButton == null) {
                landscapeText = "";
            } else {
                landscapeText = "";
                if (clickButton.getLandscapeTextCount() == 1) {
                    landscapeText = (clickButton.getExposureOnce() && clickButton.getExposureType() == ExposureType.ExposureTypeDMSend && getDmSent()) ? "" : clickButton.getLandscapeText(0);
                }
            }
        }
        return landscapeText;
    }

    private final String getClickButtonPostWord() {
        PostPanelV2 currentPostPanel = getCurrentPostPanel();
        ClickButtonV2 clickButton = currentPostPanel != null ? currentPostPanel.getClickButton() : null;
        String landscapeText = null;
        if (clickButton != null) {
            landscapeText = null;
            if (clickButton.getLandscapeTextCount() == 1) {
                landscapeText = null;
                if (clickButton.getTextInputPost()) {
                    landscapeText = (clickButton.getExposureOnce() && clickButton.getExposureType() == ExposureType.ExposureTypeDMSend && getDmSent()) ? null : clickButton.getLandscapeText(0);
                }
            }
        }
        return landscapeText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostPanelV2 getCurrentPostPanel() {
        pq0.c cVar = (pq0.c) this.f80472d.getService();
        return cVar != null ? cVar.f125562b : null;
    }

    private final boolean getDmSent() {
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        return iPlayerContainer2.getPlayerSettingService().getBoolean("danmaku_danmaku_sent", false);
    }

    private final DmViewReply getDmViewReply() {
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        return iPlayerContainer2.getInteractLayerService().getDanmakuParams().getDmViewReply();
    }

    private final String getNewType() {
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        DmViewReply dmViewReply = iPlayerContainer2.getInteractLayerService().getDanmakuParams().getDmViewReply();
        return (dmViewReply != null ? dmViewReply.getSendBoxStyle() : 0) == 0 ? "1" : "2";
    }

    private final Video.ReportCommonParams getReportCommonParams() {
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayerContainer2.getVideoPlayDirectorService().getCurrentPlayableParams();
        Video.ReportCommonParams reportCommonParams = null;
        if (currentPlayableParams != null) {
            reportCommonParams = currentPlayableParams.getReportCommonParams();
        }
        return reportCommonParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getSectionClosedHint() {
        /*
            r3 = this;
            r0 = r3
            com.bapis.bilibili.community.service.dm.v1.PostPanelV2 r0 = r0.getCurrentPostPanel()
            r6 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            if (r0 == 0) goto L14
            r0 = r6
            com.bapis.bilibili.community.service.dm.v1.ClickButtonV2 r0 = r0.getClickButton()
            r6 = r0
            goto L16
        L14:
            r0 = 0
            r6 = r0
        L16:
            r0 = r6
            if (r0 == 0) goto L22
            r0 = r6
            int r0 = r0.getLandscapeTextCount()
            r4 = r0
            goto L24
        L22:
            r0 = 0
            r4 = r0
        L24:
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 < r1) goto L9d
            r0 = r8
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L4f
            r0 = r6
            java.util.List r0 = r0.getLandscapeTextList()
            r9 = r0
            r0 = r8
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L4f
            r0 = r9
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
        L4f:
            r0 = r5
            r4 = r0
            r0 = r7
            if (r0 == 0) goto L67
            r0 = r7
            int r0 = r0.length()
            if (r0 != 0) goto L65
            r0 = r5
            r4 = r0
            goto L67
        L65:
            r0 = 0
            r4 = r0
        L67:
            r0 = r4
            if (r0 == 0) goto L6e
            goto L9d
        L6e:
            r0 = r6
            if (r0 == 0) goto L8f
            r0 = r6
            java.util.List r0 = r0.getLandscapeTextList()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L8f
            r0 = r6
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto La8
        L8f:
            r0 = r3
            android.content.Context r0 = r0.getContext()
            r1 = 2131845729(0x7f116261, float:1.9324887E38)
            java.lang.String r0 = r0.getString(r1)
            r6 = r0
            goto La8
        L9d:
            r0 = r3
            android.content.Context r0 = r0.getContext()
            r1 = 2131845729(0x7f116261, float:1.9324887E38)
            java.lang.String r0 = r0.getString(r1)
            r6 = r0
        La8:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.PlayerDanmakuSendWidget.getSectionClosedHint():java.lang.String");
    }

    private final long getVideoOwner() {
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        Video currentVideo = iPlayerContainer2.getVideoPlayDirectorService().getCurrentVideo();
        long mid = 0;
        if (currentVideo != null) {
            IPlayerContainer iPlayerContainer3 = this.f80470b;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            PlayerDataSource playerDataSource = iPlayerContainer3.getVideoPlayDirectorService().getPlayerDataSource();
            mid = 0;
            if (playerDataSource != null) {
                Video.PlayableParams videoItem = playerDataSource.getVideoItem(currentVideo, currentVideo.getCurrentIndex());
                mid = 0;
                if (videoItem != null) {
                    Video.DisplayParams displayParams = videoItem.getDisplayParams();
                    mid = 0;
                    if (displayParams != null) {
                        mid = displayParams.getMid();
                    }
                }
            }
        }
        return mid;
    }

    public final boolean K(View view, String str, String str2) {
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        DmViewReply dmViewReply = iPlayerContainer2.getInteractLayerService().getDanmakuParams().getDmViewReply();
        if (dmViewReply != null && dmViewReply.getClosed()) {
            return false;
        }
        PostPanelV2 currentPostPanel = getCurrentPostPanel();
        if ((currentPostPanel != null ? currentPostPanel.getPostStatus() : null) == PostStatus.PostStatusClosed) {
            return false;
        }
        if (!BiliAccounts.get(getContext()).isLogin()) {
            this.f80476i = true;
            PlayerRouteUris.Routers.INSTANCE.loginDanmaku(getContext(), 2334, "danmaku", "player.player.textarea-danmaku.0.player");
            L("2", str, str2);
            return false;
        }
        if (O()) {
            HashMap map = new HashMap();
            int answerStatus = BiliAccountInfo.Companion.get().getAnswerStatus();
            if (answerStatus == 1) {
                map.put("state", "begin");
            } else if (answerStatus == 2) {
                map.put("state", "on");
            }
            Neurons.reportClick(false, "community.ugc-video-detail.dm-send.answer.click", map);
            L("3", str, str2);
            return false;
        }
        IPlayerContainer iPlayerContainer3 = this.f80470b;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        DanmakuInputClickInterceptor danmakuInputClickInterceptor = iPlayerContainer3.getInteractLayerService().getDanmakuInputClickInterceptor();
        if (danmakuInputClickInterceptor != null) {
            danmakuInputClickInterceptor.onDanmakuInterceptor(view);
            return false;
        }
        L("1", str, str2);
        return true;
    }

    public final void L(String str, String str2, String str3) {
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.dm-send.textarea-danmaku.player", new String[]{ThirdPartyExtraBuilder.KEY_RESULT, str, "new_ui", getNewType(), "recommender", str2, "position", str3, "is_cheer_time", getCurrentPostPanel() != null ? "1" : "0"}));
    }

    public final void M() {
        setAlpha(1.0f);
        setEnabled(true);
        setClickable(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O() {
        /*
            r8 = this;
            r0 = r8
            tv.danmaku.biliplayerv2.service.Video$ReportCommonParams r0 = r0.getReportCommonParams()
            r18 = r0
            r0 = r8
            long r0 = r0.getVideoOwner()
            r10 = r0
            com.bilibili.lib.accountinfo.BiliAccountInfo$Companion r0 = com.bilibili.lib.accountinfo.BiliAccountInfo.Companion
            com.bilibili.lib.accountinfo.BiliAccountInfo r0 = r0.get()
            int r0 = r0.getAnswerStatus()
            r9 = r0
            r0 = r8
            android.content.Context r0 = r0.getContext()
            com.bilibili.lib.accounts.BiliAccounts r0 = com.bilibili.lib.accounts.BiliAccounts.get(r0)
            long r0 = r0.mid()
            r1 = r10
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto La2
            r0 = r9
            r1 = 2
            if (r0 == r1) goto L2e
            r0 = r9
            r1 = 1
            if (r0 != r1) goto La2
        L2e:
            com.bilibili.lib.blrouter.BLRouter r0 = com.bilibili.lib.blrouter.BLRouter.INSTANCE
            java.lang.Class<com.bilibili.moduleservice.main.b> r1 = com.bilibili.moduleservice.main.b.class
            r2 = 0
            r3 = 2
            r4 = 0
            java.lang.Object r0 = com.bilibili.lib.blrouter.BLRouter.get$default(r0, r1, r2, r3, r4)
            com.bilibili.moduleservice.main.b r0 = (com.bilibili.moduleservice.main.b) r0
            r17 = r0
            r0 = r17
            if (r0 == 0) goto La0
            r0 = r8
            android.content.Context r0 = r0.getContext()
            r16 = r0
            r0 = r18
            if (r0 == 0) goto L65
            r0 = r18
            java.lang.String r0 = r0.getSpmid()
            r15 = r0
            r0 = r15
            r14 = r0
            r0 = r15
            if (r0 != 0) goto L62
            goto L65
        L62:
            goto L6c
        L65:
            java.lang.String r0 = ""
            r14 = r0
            goto L62
        L6c:
            r0 = 0
            r12 = r0
            r0 = r18
            if (r0 == 0) goto L7d
            r0 = r18
            long r0 = r0.getAvid()
            r10 = r0
            goto L7f
        L7d:
            r0 = 0
            r10 = r0
        L7f:
            r0 = r18
            if (r0 == 0) goto L8b
            r0 = r18
            long r0 = r0.getCid()
            r12 = r0
        L8b:
            r0 = r17
            r1 = r16
            r2 = r14
            r3 = r10
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 0
            r5 = r12
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.c(r1, r2, r3, r4, r5)
        La0:
            r0 = 1
            return r0
        La2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.PlayerDanmakuSendWidget.O():boolean");
    }

    public final void P(String str) {
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
        layoutParams.setEnterAnim(-1);
        layoutParams.setLayoutType(32);
        DanmakuInputWindowService danmakuInputWindowService = (DanmakuInputWindowService) this.f80471c.getService();
        if (danmakuInputWindowService != null) {
            getCurrentPostPanel();
            danmakuInputWindowService.r0(new com.bilibili.playerbizcommon.features.danmaku.input.d(str, getClickButtonPostWord(), 24));
        }
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getControlContainerService().hide();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q() {
        /*
            r4 = this;
            r0 = r4
            com.bapis.bilibili.community.service.dm.v1.DmViewReply r0 = r0.getDmViewReply()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L56
            r0 = r5
            boolean r0 = r0.getClosed()
            if (r0 == 0) goto L33
            r0 = r5
            java.lang.String r0 = r0.getInputPlaceholder()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L22
            r0 = r6
            r5 = r0
            r0 = r6
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L2d
        L22:
            r0 = r4
            android.content.Context r0 = r0.getContext()
            r1 = 2131846717(0x7f11663d, float:1.9326891E38)
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
        L2d:
            r0 = r4
            r1 = r5
            r0.setText(r1)
            return
        L33:
            r0 = r4
            com.bapis.bilibili.community.service.dm.v1.PostPanelV2 r0 = r0.getCurrentPostPanel()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L44
            r0 = r5
            com.bapis.bilibili.community.service.dm.v1.PostStatus r0 = r0.getPostStatus()
            r5 = r0
            goto L46
        L44:
            r0 = 0
            r5 = r0
        L46:
            r0 = r5
            com.bapis.bilibili.community.service.dm.v1.PostStatus r1 = com.bapis.bilibili.community.service.dm.v1.PostStatus.PostStatusClosed
            if (r0 != r1) goto L56
            r0 = r4
            r1 = r4
            java.lang.String r1 = r1.getSectionClosedHint()
            r0.setText(r1)
            return
        L56:
            r0 = r4
            android.content.Context r0 = r0.getContext()
            r1 = 2131846896(0x7f1166f0, float:1.9327254E38)
            java.lang.String r0 = r0.getString(r1)
            r7 = r0
            com.bilibili.lib.dd.DeviceDecision r0 = com.bilibili.lib.dd.DeviceDecision.INSTANCE
            java.lang.String r1 = "dd.danmaku_input_hint"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.dd(r1, r2)
            r6 = r0
            r0 = r4
            java.lang.String r0 = r0.getClickButtonHint()
            r5 = r0
            r0 = r5
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L7c
            goto L90
        L7c:
            r0 = r7
            r5 = r0
            r0 = r6
            if (r0 == 0) goto L90
            r0 = r7
            r5 = r0
            r0 = r6
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            r1 = 1
            r0 = r0 ^ r1
            r1 = 1
            if (r0 != r1) goto L90
            r0 = r6
            r5 = r0
        L90:
            r0 = r4
            r1 = r4
            android.content.Context r1 = r1.getContext()
            com.bilibili.lib.accounts.BiliAccounts r1 = com.bilibili.lib.accounts.BiliAccounts.get(r1)
            boolean r1 = r1.isLogin()
            r0.f80473e = r1
            r0 = r4
            r1 = r5
            r0.setText(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r1 = ", 文本栏"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.toString()
            r0.setContentDescription(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.PlayerDanmakuSendWidget.Q():void");
    }

    public final void R() {
        PostPanelV2 currentPostPanel = getCurrentPostPanel();
        ClickButtonV2 clickButton = currentPostPanel != null ? currentPostPanel.getClickButton() : null;
        if ((clickButton != null ? clickButton.getLandscapeTextCount() : 0) < 2) {
            Q();
        }
        if (this.f80475g == null && this.f80474f > 0) {
            this.f80475g = (Zq0.c) getRootView().findViewById(this.f80474f);
        }
    }

    public final void S() {
        if (getWidgetFrom() == 1 || getWidgetFrom() == 2) {
            IPlayerContainer iPlayerContainer = this.f80470b;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            int i7 = iPlayerContainer2.getPlayerSettingService().getCloudConfig().w() ? 0 : 8;
            if (i7 != getVisibility()) {
                setVisibility(i7);
                if (i7 == 0) {
                    IPlayerContainer iPlayerContainer3 = this.f80470b;
                    if (iPlayerContainer3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        iPlayerContainer3 = null;
                    }
                    if (iPlayerContainer3.getInteractLayerService().isDanmakuVisible()) {
                        M();
                        return;
                    }
                    setAlpha(0.0f);
                    setEnabled(false);
                    setClickable(false);
                }
            }
        }
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80470b = playerContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        if (this.f80475g == null && this.f80474f > 0) {
            this.f80475g = (Zq0.c) getRootView().findViewById(this.f80474f);
        }
        PostPanelV2 currentPostPanel = getCurrentPostPanel();
        boolean z6 = (currentPostPanel != null ? currentPostPanel.getBizType() : null) == PostPanelBizType.PostPanelBizTypeNFTDM;
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.textarea-danmaku.0.player", new String[]{"if_nft", z6 ? "1" : "2"}));
        String currentRecommendWord = "";
        if (getCurrentPostPanel() != null) {
            Zq0.c cVar = this.f80475g;
            currentRecommendWord = "";
            if (cVar != null) {
                currentRecommendWord = cVar.getCurrentRecommendWord();
                if (currentRecommendWord == null) {
                    currentRecommendWord = "";
                }
            }
        }
        if (K(view, currentRecommendWord, "2")) {
            P(null);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BiliAccounts.get(getContext()).unsubscribe(this.f80483p, new Topic[]{Topic.ACCOUNT_INFO_UPDATE});
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(@Nullable View view, int i7, @Nullable KeyEvent keyEvent) {
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        int state = iPlayerContainer2.getPlayerCoreService().getState();
        if (keyEvent == null || keyEvent.getAction() != 0 || i7 != 66) {
            return false;
        }
        if (state != 4 && state != 5) {
            return false;
        }
        performClick();
        return true;
    }

    public final void onWidgetActive() {
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        DanmakuVisibleObserver.onDanmakuVisibleChanged$default(this.f80481n, iPlayerContainer2.getInteractLayerService().isDanmakuVisible(), false, 2, (Object) null);
        IPlayerContainer iPlayerContainer3 = this.f80470b;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.addOnKeyListener(this);
        Q();
        IPlayerContainer iPlayerContainer5 = this.f80470b;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        IPlayerServiceManager playerServiceManager = iPlayerContainer6.getPlayerServiceManager();
        PlayerServiceManager.ServiceDescriptor.Companion companion = PlayerServiceManager.ServiceDescriptor.Companion;
        playerServiceManager.bindService(companion.obtain(DanmakuInputWindowService.class), this.f80471c);
        IPlayerContainer iPlayerContainer7 = this.f80470b;
        IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer8 = null;
        }
        iPlayerContainer8.getPlayerServiceManager().bindService(companion.obtain(pq0.c.class), this.f80472d);
        R();
        pq0.c cVar = (pq0.c) this.f80472d.getService();
        if (cVar != null) {
            g gVar = this.f80477j;
            Collections.SafeIteratorList<s> safeIteratorList = cVar.f125563c;
            if (!safeIteratorList.contains(gVar)) {
                safeIteratorList.add(gVar);
            }
        }
        IPlayerContainer iPlayerContainer9 = this.f80470b;
        IPlayerContainer iPlayerContainer10 = iPlayerContainer9;
        if (iPlayerContainer9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer10 = null;
        }
        iPlayerContainer10.getInteractLayerService().registerDanmakuVisibleObserver(this.f80481n);
        IPlayerContainer iPlayerContainer11 = this.f80470b;
        IPlayerContainer iPlayerContainer12 = iPlayerContainer11;
        if (iPlayerContainer11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer12 = null;
        }
        iPlayerContainer12.getVideoPlayDirectorService().addVideoPlayEventListener(this.f80480m);
        IPlayerContainer iPlayerContainer13 = this.f80470b;
        IPlayerContainer iPlayerContainer14 = iPlayerContainer13;
        if (iPlayerContainer13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer14 = null;
        }
        iPlayerContainer14.getControlContainerService().registerControlContainerVisible(this.f80479l);
        IPlayerContainer iPlayerContainer15 = this.f80470b;
        IPlayerContainer iPlayerContainer16 = iPlayerContainer15;
        if (iPlayerContainer15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer16 = null;
        }
        iPlayerContainer16.getControlContainerService().registerWidgetChangedObserver(this.f80478k);
        IPlayerContainer iPlayerContainer17 = this.f80470b;
        if (iPlayerContainer17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer17 = null;
        }
        iPlayerContainer17.getActivityStateService().registerLifecycle(this.f80482o, new LifecycleState[]{LifecycleState.ACTIVITY_RESUME});
        BiliAccounts.get(getContext()).subscribe(this.f80483p, new Topic[]{Topic.ACCOUNT_INFO_UPDATE});
        S();
    }

    public final void onWidgetInactive() {
        ViewPropertyAnimator viewPropertyAnimator = this.h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        IPlayerContainer iPlayerContainer = this.f80470b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.removeOnKeyListener(this);
        IPlayerContainer iPlayerContainer3 = this.f80470b;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        IPlayerServiceManager playerServiceManager = iPlayerContainer4.getPlayerServiceManager();
        PlayerServiceManager.ServiceDescriptor.Companion companion = PlayerServiceManager.ServiceDescriptor.Companion;
        playerServiceManager.unbindService(companion.obtain(DanmakuInputWindowService.class), this.f80471c);
        pq0.c cVar = (pq0.c) this.f80472d.getService();
        if (cVar != null) {
            g gVar = this.f80477j;
            Collections.SafeIteratorList<s> safeIteratorList = cVar.f125563c;
            if (safeIteratorList.contains(gVar)) {
                safeIteratorList.remove(gVar);
            }
        }
        IPlayerContainer iPlayerContainer5 = this.f80470b;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        iPlayerContainer6.getPlayerServiceManager().unbindService(companion.obtain(pq0.c.class), this.f80472d);
        IPlayerContainer iPlayerContainer7 = this.f80470b;
        IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer8 = null;
        }
        iPlayerContainer8.getInteractLayerService().unregisterDanmakuVisibleObserver(this.f80481n);
        IPlayerContainer iPlayerContainer9 = this.f80470b;
        IPlayerContainer iPlayerContainer10 = iPlayerContainer9;
        if (iPlayerContainer9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer10 = null;
        }
        iPlayerContainer10.getVideoPlayDirectorService().removeVideoPlayEventListener(this.f80480m);
        IPlayerContainer iPlayerContainer11 = this.f80470b;
        IPlayerContainer iPlayerContainer12 = iPlayerContainer11;
        if (iPlayerContainer11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer12 = null;
        }
        iPlayerContainer12.getControlContainerService().unregisterControlContainerVisible(this.f80479l);
        IPlayerContainer iPlayerContainer13 = this.f80470b;
        IPlayerContainer iPlayerContainer14 = iPlayerContainer13;
        if (iPlayerContainer13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer14 = null;
        }
        iPlayerContainer14.getControlContainerService().unregisterWidgetChangedObserver(this.f80478k);
        IPlayerContainer iPlayerContainer15 = this.f80470b;
        if (iPlayerContainer15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer15 = null;
        }
        iPlayerContainer15.getActivityStateService().unregisterLifecycle(this.f80482o);
        BiliAccounts.get(getContext()).unsubscribe(this.f80483p, new Topic[]{Topic.ACCOUNT_INFO_UPDATE});
    }
}
