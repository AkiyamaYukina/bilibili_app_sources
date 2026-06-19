package com.bilibili.ship.theseus.ugc.recommend;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ugc.feature.o;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.ship.theseus.ugc.recommend.b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.ControlWidgetChangedObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/h.class */
@StabilityInferred(parameters = 0)
public final class h extends LinearLayout implements IControlWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPanelContainer f98434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final g f98435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f98436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f98437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final BiliImageView f98438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f98439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f98440g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f98441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f98442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f98443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f98444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f98445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f98446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f98447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final b f98448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final a f98449q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/h$a.class */
    public static final class a implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f98450a;

        public a(h hVar) {
            this.f98450a = hVar;
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
            if (z6) {
                h hVar = this.f98450a;
                hVar.setTranslationX(hVar.f98444l);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/h$b.class */
    public static final class b implements ControlWidgetChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f98451a;

        public b(h hVar) {
            this.f98451a = hVar;
        }

        public final void onControllerWidgetChanged() {
            h hVar = this.f98451a;
            hVar.c(hVar.f98435b.f98433e);
        }
    }

    @Inject
    public h(@NotNull Context context, @NotNull IPanelContainer iPanelContainer, @NotNull g gVar, @NotNull IControlContainerService iControlContainerService, @NotNull IPlayerSettingService iPlayerSettingService) {
        super(context);
        this.f98434a = iPanelContainer;
        this.f98435b = gVar;
        this.f98436c = iControlContainerService;
        this.f98437d = iPlayerSettingService;
        this.h = (int) DpUtils.dp2px(context, 90.0f);
        this.f98441i = (int) DpUtils.dp2px(context, 62.0f);
        this.f98444l = DpUtils.dp2px(context, 88.0f);
        int iDp2px = (int) DpUtils.dp2px(context, 150.0f);
        this.f98445m = iDp2px;
        int iDp2px2 = (int) DpUtils.dp2px(context, 90.0f);
        this.f98446n = iDp2px2;
        this.f98447o = iDp2px / iDp2px2;
        this.f98448p = new b(this);
        this.f98449q = new a(this);
        setOrientation(0);
        setGravity(16);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(AppCompatResources.getDrawable(context, 2131239977));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams((int) DpUtils.dp2px(context, 10.0f), (int) DpUtils.dp2px(context, 40.0f)));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(AppCompatResources.getDrawable(context, 2131236181));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) DpUtils.dp2px(context, 8.0f), (int) DpUtils.dp2px(context, 22.0f));
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        frameLayout.addView(imageView);
        addView(frameLayout);
        BiliImageView biliImageView = new BiliImageView(context);
        int iDp2px3 = (int) DpUtils.dp2px(context, 4.0f);
        biliImageView.setPadding(iDp2px3, iDp2px3, iDp2px3, iDp2px3);
        biliImageView.setBackground(AppCompatResources.getDrawable(context, 2131239978));
        biliImageView.setLayoutParams(new LinearLayout.LayoutParams((int) DpUtils.dp2px(context, 170.0f), (int) DpUtils.dp2px(context, 106.0f)));
        addView(biliImageView);
        this.f98438e = biliImageView;
        setTranslationX(this.f98444l);
    }

    public final void a(int i7) {
        int i8 = this.f98440g + i7;
        this.f98440g = i8;
        int i9 = i8;
        if (i8 < (-(getWidth() - this.f98441i))) {
            i9 = -(getWidth() - this.f98441i);
        }
        float f7 = i9;
        if (f7 == getTranslationX()) {
            return;
        }
        setTranslationX(f7 + this.f98444l);
    }

    public final void b(boolean z6) {
        int[] iArr = new int[2];
        this.f98434a.location(this, iArr);
        g gVar = this.f98435b;
        int top = 0;
        float f7 = iArr[0];
        float f8 = iArr[1];
        BiliImageView biliImageView = this.f98438e;
        if (biliImageView != null) {
            top = biliImageView.getTop();
        }
        b.a aVar = new b.a(f7, f8 + top, getRootView().getHeight(), z6);
        gVar.getClass();
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
        layoutParams.setLayoutType(4);
        BuildersKt.launch$default(gVar.f98429a, (CoroutineContext) null, (CoroutineStart) null, new FullScreenPlayingBottomRecommendService$showRecommendCards$1(gVar, (com.bilibili.ship.theseus.ugc.recommend.b) gVar.f98432d.get(), layoutParams, aVar, null), 3, (Object) null);
    }

    public final void c(List<o> list) {
        o oVar;
        Oi1.d cloudConfig = this.f98437d.getCloudConfig();
        setVisibility(((list != null ? ((ArrayList) list).size() : 0) > 3 && cloudConfig.a.getRecommendConf().b(true) && cloudConfig.O()) ? 0 : 8);
        if (getVisibility() == 0) {
            String str = (list == null || (oVar = (o) CollectionsKt.first(list)) == null) ? null : oVar.e;
            if (str == null || this.f98438e == null) {
                return;
            }
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.setCornersRadius(DpUtils.dp2px(getContext(), 6.0f));
            ImageRequestBuilder.placeholderImageResId$default(BiliImageLoader.INSTANCE.with(getContext()).actualImageScaleType(ScaleType.CENTER_CROP), 2131231978, (ScaleType) null, 2, (Object) null).roundingParams(roundingParams).url(str).into(this.f98438e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f98439f = rawX;
            this.f98443k = rawX;
            this.f98442j = false;
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                int i7 = this.f98443k;
                if ((1 <= i7 && i7 < rawX) || this.f98442j) {
                    return true;
                }
                int i8 = this.f98439f;
                if (this.f98440g < (-this.h)) {
                    this.f98442j = true;
                    b(false);
                    setTranslationX(this.f98444l);
                    this.f98440g = 0;
                } else {
                    a(rawX - i8);
                }
                this.f98439f = rawX;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        int i9 = this.f98443k - rawX;
        if (!this.f98442j && (i9 > this.h / 2 || i9 == 0)) {
            b(true);
        }
        a(-this.f98440g);
        this.f98440g = 0;
        this.f98443k = 0;
        this.f98442j = false;
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        BiliImageView biliImageView = this.f98438e;
        if (biliImageView != null && (layoutParams4 = biliImageView.getLayoutParams()) != null) {
            layoutParams4.width = this.f98445m;
        }
        BiliImageView biliImageView2 = this.f98438e;
        if (biliImageView2 != null && (layoutParams3 = biliImageView2.getLayoutParams()) != null) {
            layoutParams3.height = this.f98446n;
        }
        super.onMeasure(i7, i8);
        int measuredHeight = getMeasuredHeight();
        BiliImageView biliImageView3 = this.f98438e;
        if (measuredHeight < (biliImageView3 != null ? biliImageView3.getMeasuredHeight() : 0)) {
            int i9 = (int) (measuredHeight * this.f98447o);
            BiliImageView biliImageView4 = this.f98438e;
            if (biliImageView4 != null && (layoutParams2 = biliImageView4.getLayoutParams()) != null) {
                layoutParams2.width = i9;
            }
            BiliImageView biliImageView5 = this.f98438e;
            if (biliImageView5 != null && (layoutParams = biliImageView5.getLayoutParams()) != null) {
                layoutParams.height = measuredHeight;
            }
            super.onMeasure(i7, i8);
        }
        float measuredWidth = (this.f98438e != null ? r0.getMeasuredWidth() : 0) - DpUtils.dp2px(getContext(), 62.0f);
        this.f98444l = measuredWidth;
        setTranslationX(measuredWidth + this.f98440g);
        int measuredWidth2 = getMeasuredWidth();
        BiliImageView biliImageView6 = this.f98438e;
        int measuredHeight2 = 0;
        if (biliImageView6 != null) {
            measuredHeight2 = biliImageView6.getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth2, measuredHeight2);
    }

    public final void onWidgetActive() {
        this.f98436c.registerWidgetChangedObserver(this.f98448p);
        this.f98436c.registerControlContainerVisible(this.f98449q);
        c(this.f98435b.f98433e);
    }

    public final void onWidgetInactive() {
        this.f98436c.unregisterWidgetChangedObserver(this.f98448p);
        this.f98436c.unregisterControlContainerVisible(this.f98449q);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        setTranslationX(i7 != 0 ? 0.0f : this.f98444l);
    }
}
