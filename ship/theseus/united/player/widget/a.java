package com.bilibili.ship.theseus.united.player.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bilibili.app.comment3.CommentV3Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.WindowInset;
import tv.danmaku.biliplayerv2.service.f;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/widget/a.class */
@StabilityInferred(parameters = 0)
public final class a extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InjectPlayerService
    public IControlContainerService f104816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f104817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public FragmentActivity f104818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public FragmentManager f104819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f104820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f104821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f104822g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f104823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f104824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public CommentV3Fragment f104825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public FrameLayout f104826l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/widget/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C1172a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FragmentActivity f104827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final FragmentManager f104828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f104829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f104830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f104831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f104832f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f104833g;
        public final long h;

        public C1172a(@NotNull FragmentActivity fragmentActivity, @NotNull FragmentManager fragmentManager, long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j8) {
            this.f104827a = fragmentActivity;
            this.f104828b = fragmentManager;
            this.f104829c = j7;
            this.f104830d = str;
            this.f104831e = str2;
            this.f104832f = str3;
            this.f104833g = str4;
            this.h = j8;
        }
    }

    public a(@NotNull Context context) {
        super(context);
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        int iDp2px = (int) DpUtils.dp2px(context, 12.0f);
        int iDp2px2 = (int) DpUtils.dp2px(context, 12.0f);
        int iDp2px3 = (int) DpUtils.dp2px(context, 10.0f);
        float fDp2px = DpUtils.dp2px(context, 12.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fDp2px);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(View.generateViewId());
        frameLayout2.setBackground(gradientDrawable);
        frameLayout2.setClipToOutline(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = iDp2px;
        layoutParams.bottomMargin = iDp2px;
        layoutParams.setMarginEnd(iDp2px2);
        layoutParams.setMarginStart(iDp2px3);
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.f104826l = frameLayout2;
        return frameLayout;
    }

    @NotNull
    public final f getFunctionInsetConfig() {
        return new f(0, 30);
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.persistent(false);
        return builder.build();
    }

    public final void h(AbsFunctionWidget.Configuration configuration) {
        if (configuration instanceof C1172a) {
            C1172a c1172a = (C1172a) configuration;
            this.f104818c = c1172a.f104827a;
            this.f104819d = c1172a.f104828b;
            this.f104820e = c1172a.f104829c;
            this.f104821f = c1172a.f104830d;
            this.f104822g = c1172a.f104831e;
            this.h = c1172a.f104832f;
            this.f104823i = c1172a.f104833g;
            this.f104824j = c1172a.h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:33:0x01d3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.widget.a.i():void");
    }

    public final void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        h(configuration);
        i();
    }

    public final void onRelease() {
        this.f104826l = null;
        this.f104818c = null;
        this.f104819d = null;
    }

    public final void onWidgetDismiss() {
        CommentV3Fragment commentV3Fragment;
        super.onWidgetDismiss();
        FragmentManager fragmentManager = this.f104819d;
        if (fragmentManager == null || (commentV3Fragment = this.f104825k) == null) {
            return;
        }
        try {
            fragmentManager.beginTransaction().remove(commentV3Fragment).commitNowAllowingStateLoss();
        } catch (Exception e7) {
        }
        this.f104825k = null;
    }

    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        super.onWidgetShow(configuration);
        IControlContainerService iControlContainerService = this.f104816a;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService = null;
        }
        iControlContainerService.hide();
        h(configuration);
        i();
    }

    public final void onWindowInsetChanged(@NotNull WindowInset windowInset) {
        if (getFunctionInsetConfig().a) {
            getView().setPadding(0, 0, Math.max(windowInset.getRightPadding(), 0), 0);
        }
    }
}
