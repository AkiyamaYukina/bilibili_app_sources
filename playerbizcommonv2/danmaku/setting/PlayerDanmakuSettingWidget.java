package com.bilibili.playerbizcommonv2.danmaku.setting;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import com.bapis.bilibili.community.service.dm.v1.BubbleType;
import com.bapis.bilibili.community.service.dm.v1.BubbleV2;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.playerbizcommonv2.danmaku.postpanel.DanmakuTimerService;
import com.bilibili.playerbizcommonv2.danmaku.setting.a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.ControlWidgetChangedObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.s;
import tv.danmaku.biliplayerv2.service.interact.core.DanmakuVisibleObserver;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/PlayerDanmakuSettingWidget.class */
@StabilityInferred(parameters = 0)
public class PlayerDanmakuSettingWidget extends Ir0.c implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f81227u = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Inject
    @InjectPlayerService
    public DanmakuTimerService f81228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Inject
    @InjectPlayerService
    public IControlContainerService f81229g;

    @Inject
    @InjectPlayerService
    public IInteractLayerService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Inject
    @InjectPlayerService
    public IReporterService f81230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Inject
    @InjectPlayerService
    public AbsFunctionWidgetService f81231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Inject
    @InjectPlayerService
    public IPlayDirector f81232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Inject
    @InjectPlayerService
    public IPlayerCoreService f81233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Inject
    @InjectPlayerService
    public Er0.a f81234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Inject
    @InjectPlayerService
    public IPlayerSettingService f81235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public String f81236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final c f81237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final b f81238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final d f81239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final e f81240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f81241t;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/PlayerDanmakuSettingWidget$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f81242a;

        static {
            int[] iArr = new int[BubbleType.values().length];
            try {
                iArr[BubbleType.BubbleTypeDmSettingPanel.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f81242a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/PlayerDanmakuSettingWidget$b.class */
    public static final class b implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSettingWidget f81243a;

        public b(PlayerDanmakuSettingWidget playerDanmakuSettingWidget) {
            this.f81243a = playerDanmakuSettingWidget;
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
            if (z6) {
                int i7 = PlayerDanmakuSettingWidget.f81227u;
                this.f81243a.z();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/PlayerDanmakuSettingWidget$c.class */
    public static final class c implements ControlWidgetChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSettingWidget f81244a;

        public c(PlayerDanmakuSettingWidget playerDanmakuSettingWidget) {
            this.f81244a = playerDanmakuSettingWidget;
        }

        public final void onControllerWidgetChanged() {
            int i7 = PlayerDanmakuSettingWidget.f81227u;
            this.f81244a.F();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/PlayerDanmakuSettingWidget$d.class */
    public static final class d implements DanmakuVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSettingWidget f81245a;

        public d(PlayerDanmakuSettingWidget playerDanmakuSettingWidget) {
            this.f81245a = playerDanmakuSettingWidget;
        }

        public final void onDanmakuVisibleChanged(boolean z6, boolean z7) {
            int i7 = PlayerDanmakuSettingWidget.f81227u;
            PlayerDanmakuSettingWidget playerDanmakuSettingWidget = this.f81245a;
            if (playerDanmakuSettingWidget.getInteractLayerService().isDanmakuForbidden()) {
                playerDanmakuSettingWidget.setAlpha(0.5f);
            } else {
                playerDanmakuSettingWidget.setAlpha(1.0f);
            }
            playerDanmakuSettingWidget.F();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/PlayerDanmakuSettingWidget$e.class */
    public static final class e implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSettingWidget f81246a;

        public e(PlayerDanmakuSettingWidget playerDanmakuSettingWidget) {
            this.f81246a = playerDanmakuSettingWidget;
        }

        public final void onPostPanelActive(int i7, PostPanelV2 postPanelV2) {
            int i8 = PlayerDanmakuSettingWidget.f81227u;
            this.f81246a.v();
        }

        public final void onPostPanelInactive(int i7, PostPanelV2 postPanelV2) {
            int i8 = PlayerDanmakuSettingWidget.f81227u;
            this.f81246a.v();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/PlayerDanmakuSettingWidget$f.class */
    public static final class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuSettingWidget f81247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlayerDanmakuSettingWidget f81248b;

        public f(PlayerDanmakuSettingWidget playerDanmakuSettingWidget, PlayerDanmakuSettingWidget playerDanmakuSettingWidget2) {
            this.f81247a = playerDanmakuSettingWidget;
            this.f81248b = playerDanmakuSettingWidget2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PlayerDanmakuSettingWidget playerDanmakuSettingWidget = this.f81247a;
            Rect rect = new Rect();
            playerDanmakuSettingWidget.getGlobalVisibleRect(rect);
            IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-2, -2);
            layoutParams.setLayoutType(9);
            layoutParams.setFunctionType(2);
            layoutParams.setExitAnim(-1);
            layoutParams.setEnterAnim(-1);
            layoutParams.setBottomMargin(rect.bottom - rect.top);
            this.f81248b.getFunctionWidgetService().showWidget(com.bilibili.playerbizcommonv2.danmaku.setting.a.class, layoutParams, new a.C0529a(rect, this.f81248b.f81236o));
            this.f81248b.getControlContainerService().unregisterControlContainerVisible(this.f81248b.f81238q);
        }
    }

    public PlayerDanmakuSettingWidget(@NotNull Context context) {
        super(context);
        this.f81237p = new c(this);
        this.f81238q = new b(this);
        this.f81239r = new d(this);
        this.f81240s = new e(this);
        this.f81241t = true;
        q();
    }

    public PlayerDanmakuSettingWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81237p = new c(this);
        this.f81238q = new b(this);
        this.f81239r = new d(this);
        this.f81240s = new e(this);
        this.f81241t = true;
        q();
    }

    private final PostPanelV2 getCurrentPostPanel() {
        return getDanmakuTimerService().f81212c;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            r3 = this;
            r0 = r3
            tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.getPlayerSettingService()
            Oi1.d r0 = r0.getCloudConfig()
            boolean r0 = r0.I()
            r5 = r0
            r0 = 0
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L18
        L13:
            r0 = 0
            r5 = r0
            goto L57
        L18:
            r0 = r3
            tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService r0 = r0.getInteractLayerService()
            boolean r0 = r0.isDanmakuForbidden()
            r6 = r0
            r0 = 1
            r5 = r0
            r0 = r6
            if (r0 == 0) goto L2b
            goto L57
        L2b:
            r0 = r3
            tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService r0 = r0.getInteractLayerService()
            boolean r0 = r0.isDanmakuVisible()
            if (r0 != 0) goto L3a
            goto L13
        L3a:
            r0 = r3
            int r0 = r0.getWidgetFrom()
            r1 = 1
            if (r0 == r1) goto L4a
            r0 = r3
            int r0 = r0.getWidgetFrom()
            r1 = 2
            if (r0 != r1) goto L57
        L4a:
            r0 = r3
            tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.getPlayerSettingService()
            Oi1.d r0 = r0.getCloudConfig()
            boolean r0 = r0.w()
            r5 = r0
        L57:
            r0 = r5
            if (r0 == 0) goto L5e
            goto L61
        L5e:
            r0 = 8
            r4 = r0
        L61:
            r0 = r3
            r1 = r4
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.setting.PlayerDanmakuSettingWidget.F():void");
    }

    @NotNull
    public final IControlContainerService getControlContainerService() {
        IControlContainerService iControlContainerService = this.f81229g;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
        return null;
    }

    @NotNull
    public final DanmakuTimerService getDanmakuTimerService() {
        DanmakuTimerService danmakuTimerService = this.f81228f;
        if (danmakuTimerService != null) {
            return danmakuTimerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("danmakuTimerService");
        return null;
    }

    @NotNull
    public final Er0.a getDelegateStoreService() {
        Er0.a aVar = this.f81234m;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
        return null;
    }

    @NotNull
    public final AbsFunctionWidgetService getFunctionWidgetService() {
        AbsFunctionWidgetService absFunctionWidgetService = this.f81231j;
        if (absFunctionWidgetService != null) {
            return absFunctionWidgetService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
        return null;
    }

    @NotNull
    public final IInteractLayerService getInteractLayerService() {
        IInteractLayerService iInteractLayerService = this.h;
        if (iInteractLayerService != null) {
            return iInteractLayerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
        return null;
    }

    public boolean getMembersInjector() {
        return this.f81241t;
    }

    @NotNull
    public final IPlayDirector getPlayDirector() {
        IPlayDirector iPlayDirector = this.f81232k;
        if (iPlayDirector != null) {
            return iPlayDirector;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playDirector");
        return null;
    }

    @NotNull
    public final IPlayerCoreService getPlayerCoreService() {
        IPlayerCoreService iPlayerCoreService = this.f81233l;
        if (iPlayerCoreService != null) {
            return iPlayerCoreService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
        return null;
    }

    @NotNull
    public final IPlayerSettingService getPlayerSettingService() {
        IPlayerSettingService iPlayerSettingService = this.f81235n;
        if (iPlayerSettingService != null) {
            return iPlayerSettingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
        return null;
    }

    @NotNull
    public final IReporterService getReporterService() {
        IReporterService iReporterService = this.f81230i;
        if (iReporterService != null) {
            return iReporterService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(@org.jetbrains.annotations.Nullable android.view.View r8) {
        /*
            r7 = this;
            r0 = r7
            tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService r0 = r0.getInteractLayerService()
            boolean r0 = r0.isDanmakuForbidden()
            if (r0 == 0) goto Ld
            return
        Ld:
            r0 = r7
            android.content.Context r0 = r0.getContext()
            r8 = r0
            r0 = r7
            tv.danmaku.biliplayerv2.service.IControlContainerService r0 = r0.getControlContainerService()
            r10 = r0
            r0 = r7
            tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService r0 = r0.getFunctionWidgetService()
            r9 = r0
            r0 = r7
            Er0.a r0 = r0.getDelegateStoreService()
            r13 = r0
            r0 = r7
            tv.danmaku.biliplayerv2.service.report.IReporterService r0 = r0.getReporterService()
            r12 = r0
            r0 = r7
            tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService r0 = r0.getInteractLayerService()
            r11 = r0
            r0 = r10
            tv.danmaku.biliplayerv2.ScreenModeType r0 = r0.getScreenModeType()
            tv.danmaku.biliplayerv2.ScreenModeType r1 = tv.danmaku.biliplayerv2.ScreenModeType.THUMB
            if (r0 != r1) goto L7b
            r0 = r13
            com.bilibili.playerbizcommonv2.utils.r$a r1 = com.bilibili.playerbizcommonv2.utils.r.a.f81944a
            java.lang.Object r0 = r0.get(r1)
            com.bilibili.playerbizcommonv2.utils.r r0 = (com.bilibili.playerbizcommonv2.utils.r) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L7b
            r0 = r13
            boolean r0 = com.bilibili.playerbizcommonv2.utils.q.a(r0)
            r1 = 1
            if (r0 != r1) goto L7b
            r0 = r8
            androidx.fragment.app.FragmentActivity r0 = kntr.base.android.legacy.context.ContextUtilKt.findFragmentActivityOrNull(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L61
            goto L63
        L61:
            r0 = 0
            r8 = r0
        L63:
            r0 = r8
            if (r0 == 0) goto L7b
            com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsDialog r0 = new com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsDialog
            r1 = r0
            r2 = r8
            r3 = r11
            r4 = r12
            r5 = 24
            r1.<init>(r2, r3, r4, r5)
            r0.show()
            goto L99
        L7b:
            com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget$a r0 = com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget.Companion
            r8 = r0
            r0 = r10
            tv.danmaku.biliplayerv2.ScreenModeType r0 = r0.getScreenModeType()
            r10 = r0
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            r0 = r9
            java.lang.Class<com.bilibili.playerbizcommonv2.danmaku.setting.v2.P> r1 = com.bilibili.playerbizcommonv2.danmaku.setting.v2.P.class
            r2 = r10
            tv.danmaku.biliplayerv2.widget.IFunctionContainer$LayoutParams r2 = com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget.a.a(r2)
            tv.danmaku.biliplayerv2.service.FunctionWidgetToken r0 = r0.showWidget(r1, r2)
        L99:
            r0 = r7
            tv.danmaku.biliplayerv2.service.IControlContainerService r0 = r0.getControlContainerService()
            r0.hide()
            r0 = r7
            tv.danmaku.biliplayerv2.service.report.IReporterService r0 = r0.getReporterService()
            tv.danmaku.biliplayerv2.service.report.NeuronsEvents$NormalEvent r1 = new tv.danmaku.biliplayerv2.service.report.NeuronsEvents$NormalEvent
            r2 = r1
            java.lang.String r3 = "player.player.danmaku-set.0.player"
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            r2.<init>(r3, r4)
            r0.report(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.setting.PlayerDanmakuSettingWidget.onClick(android.view.View):void");
    }

    public final void onWidgetActive() {
        getInteractLayerService().registerDanmakuVisibleObserver(this.f81239r);
        getControlContainerService().registerWidgetChangedObserver(this.f81237p);
        getControlContainerService().registerControlContainerVisible(this.f81238q);
        if (getInteractLayerService().isDanmakuForbidden()) {
            setAlpha(0.5f);
        } else {
            setAlpha(1.0f);
        }
        F();
        v();
        getDanmakuTimerService().c(this.f81240s);
    }

    public final void onWidgetInactive() {
        getInteractLayerService().unregisterDanmakuVisibleObserver(this.f81239r);
        getControlContainerService().unregisterWidgetChangedObserver(this.f81237p);
        getControlContainerService().unregisterControlContainerVisible(this.f81238q);
        getDanmakuTimerService().d(this.f81240s);
    }

    public final void q() {
        setContentDescription("弹幕设置");
        setOnClickListener(this);
    }

    public final void setControlContainerService(@NotNull IControlContainerService iControlContainerService) {
        this.f81229g = iControlContainerService;
    }

    public final void setDanmakuTimerService(@NotNull DanmakuTimerService danmakuTimerService) {
        this.f81228f = danmakuTimerService;
    }

    public final void setDelegateStoreService(@NotNull Er0.a aVar) {
        this.f81234m = aVar;
    }

    public final void setFunctionWidgetService(@NotNull AbsFunctionWidgetService absFunctionWidgetService) {
        this.f81231j = absFunctionWidgetService;
    }

    public final void setInteractLayerService(@NotNull IInteractLayerService iInteractLayerService) {
        this.h = iInteractLayerService;
    }

    public final void setPlayDirector(@NotNull IPlayDirector iPlayDirector) {
        this.f81232k = iPlayDirector;
    }

    public final void setPlayerCoreService(@NotNull IPlayerCoreService iPlayerCoreService) {
        this.f81233l = iPlayerCoreService;
    }

    public final void setPlayerSettingService(@NotNull IPlayerSettingService iPlayerSettingService) {
        this.f81235n = iPlayerSettingService;
    }

    public final void setReporterService(@NotNull IReporterService iReporterService) {
        this.f81230i = iReporterService;
    }

    public final void v() {
        BubbleV2 bubble;
        PostPanelV2 currentPostPanel = getCurrentPostPanel();
        BubbleType bubbleType = null;
        BubbleType bubbleType2 = (currentPostPanel == null || (bubble = currentPostPanel.getBubble()) == null) ? null : bubble.getBubbleType();
        if ((bubbleType2 == null ? -1 : a.f81242a[bubbleType2.ordinal()]) == 1) {
            PostPanelV2 currentPostPanel2 = getCurrentPostPanel();
            BubbleV2 bubble2 = currentPostPanel2 != null ? currentPostPanel2.getBubble() : null;
            if (bubble2 != null) {
                bubbleType = bubble2.getBubbleType();
            }
            if (bubbleType == BubbleType.BubbleTypeDmSettingPanel) {
                this.f81236o = bubble2.getText();
                if (getControlContainerService().isShowing()) {
                    z();
                }
            }
        }
    }

    public final void z() {
        String str = this.f81236o;
        if (str == null || str.length() == 0 || getVisibility() != 0 || !getInteractLayerService().isDanmakuVisible() || getControlContainerService().getScreenModeType() != ScreenModeType.LANDSCAPE_FULLSCREEN || BiliAccounts.get(getContext()).mid() == getPlayerSettingService().getLong("danmaku_spoiler_bubble_show", 0L)) {
            return;
        }
        OneShotPreDrawListener.add(this, new f(this, this));
    }
}
