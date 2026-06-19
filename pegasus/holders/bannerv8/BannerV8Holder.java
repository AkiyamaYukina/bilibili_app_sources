package com.bilibili.pegasus.holders.bannerv8;

import De0.M;
import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.adcommon.data.AdInfo;
import com.bilibili.app.comm.list.common.utils.CommonExtensionKt;
import com.bilibili.app.comm.list.widget.banneradapter.BannerItem;
import com.bilibili.app.comm.list.widget.banneradapter.VideoBannerHolder;
import com.bilibili.app.comm.list.widget.swiper.CircleIndicator;
import com.bilibili.app.comm.list.widget.swiper.Indicator;
import com.bilibili.app.comm.list.widget.swiper.SwiperBanner;
import com.bilibili.app.comm.list.widget.utils.AttachCoroutineScope;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.ViewAttachScopeKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.gripper.api.ad.biz.pegasus.banner.BannerItemDataMirror;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.report.ExtraParams;
import com.bilibili.gripper.api.ad.core.report.IAdReporter;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.card.InlineParent;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import com.bilibili.pegasus.HolderExtra;
import com.bilibili.pegasus.HolderVisibleState;
import com.bilibili.pegasus.PegasusDDConfigKt;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.holders.AbstractC5652d;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.Q;
import tv.danmaku.android.log.BLog;
import zo0.C9208a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerV8Holder.class */
@StabilityInferred(parameters = 0)
public final class BannerV8Holder extends AbstractC5652d<gp0.c> implements InlineParent {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f77681u = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final V8Banner f77682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final CircleIndicator f77683g;

    @NotNull
    public final List<gp0.b> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final f f77684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f77685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<cY.a> f77686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f77687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f77688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public WindowSizeClass f77689n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f77690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77691p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public WindowSizeClass f77692q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public gp0.c f77693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public w f77694s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final SparseArray<ViewPager2.OnPageChangeCallback> f77695t;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerV8Holder$a.class */
    public final class a implements Indicator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final CircleIndicator f77696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public Function2<? super Integer, ? super Integer, ? extends View> f77697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BannerV8Holder f77698c;

        public a(@NotNull BannerV8Holder bannerV8Holder, CircleIndicator circleIndicator) {
            this.f77698c = bannerV8Holder;
            this.f77696a = circleIndicator;
            this.f77697b = circleIndicator.getViewCreator();
        }

        @NotNull
        public final View getContentView() {
            return this.f77696a.getContentView();
        }

        @NotNull
        public final Function2<Integer, Integer, View> getViewCreator() {
            return this.f77697b;
        }

        public final boolean isVisible() {
            return this.f77696a.isVisible();
        }

        public final void select(int i7, int i8) {
            int i9 = i8;
            if (this.f77698c.f77688m) {
                i9 = i8;
                if (1 <= i8) {
                    i9 = i8;
                    if (i8 < 4) {
                        i9 = 3;
                    }
                }
            }
            this.f77696a.select(i7, i9);
        }

        public final void setViewCreator(@NotNull Function2<? super Integer, ? super Integer, ? extends View> function2) {
            this.f77697b = function2;
        }

        public final void setVisible(boolean z6) {
            this.f77696a.setVisible(z6);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerV8Holder$b.class */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f77699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BannerV8Holder f77701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final WindowSizeClass f77702d;

        public b(View view, int i7, BannerV8Holder bannerV8Holder, WindowSizeClass windowSizeClass) {
            this.f77699a = view;
            this.f77700b = i7;
            this.f77701c = bannerV8Holder;
            this.f77702d = windowSizeClass;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i7 = this.f77700b;
            BannerV8Holder bannerV8Holder = this.f77701c;
            if (i7 == bannerV8Holder.f77690o) {
                bannerV8Holder.N0(this.f77702d);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerV8Holder$c.class */
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f77703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BannerV8Holder f77704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowSizeClass f77705c;

        public c(View view, BannerV8Holder bannerV8Holder, WindowSizeClass windowSizeClass) {
            this.f77703a = view;
            this.f77704b = bannerV8Holder;
            this.f77705c = windowSizeClass;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zE0;
            if (Intrinsics.areEqual(this.f77704b.f77692q, this.f77705c)) {
                BannerV8Holder bannerV8Holder = this.f77704b;
                bannerV8Holder.f77692q = null;
                gp0.c cVar = bannerV8Holder.f77693r;
                if (cVar == null) {
                    return;
                }
                WindowSizeClass windowSizeClass = this.f77705c;
                V8Banner v8Banner = bannerV8Holder.f77682f;
                if (v8Banner == null) {
                    zE0 = true;
                } else {
                    Integer numI0 = bannerV8Holder.I0();
                    if (numI0 != null) {
                        int iIntValue = numI0.intValue();
                        bannerV8Holder.f77689n = null;
                        w wVarA0 = bannerV8Holder.A0(windowSizeClass, iIntValue);
                        bannerV8Holder.y0(v8Banner, windowSizeClass, wVarA0);
                        zE0 = BannerV8Holder.E0(v8Banner, wVarA0);
                    } else {
                        zE0 = false;
                    }
                }
                if (zE0) {
                    this.f77704b.z0(cVar);
                    return;
                }
                BannerV8Holder bannerV8Holder2 = this.f77704b;
                bannerV8Holder2.f77693r = cVar;
                bannerV8Holder2.K0(this.f77705c);
            }
        }
    }

    public BannerV8Holder(@NotNull TintConstraintLayout tintConstraintLayout, boolean z6) {
        super(tintConstraintLayout);
        BannerV8Container bannerV8Container = tintConstraintLayout instanceof BannerV8Container ? (BannerV8Container) tintConstraintLayout : null;
        View viewFindViewById = tintConstraintLayout.findViewById(2131296911);
        V8Banner v8Banner = (V8Banner) (viewFindViewById instanceof V8Banner ? viewFindViewById : null);
        this.f77682f = v8Banner;
        CircleIndicator circleIndicatorFindViewById = tintConstraintLayout.findViewById(2131303617);
        CircleIndicator circleIndicator = circleIndicatorFindViewById instanceof CircleIndicator ? circleIndicatorFindViewById : null;
        this.f77683g = circleIndicator;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f77685j = ListExtentionsKt.toPx(8);
        this.f77687l = true;
        if (v8Banner == null || circleIndicator == null) {
            BLog.e("BannerV8Holder", "initial error banner view is null");
        } else {
            f fVar = new f(arrayList, z6 ? new g() : new g(), v8Banner, ListExtentionsKt.toPx(4), new p(this, 0));
            this.f77684i = fVar;
            RecyclerView recyclerView = v8Banner.getRecyclerView();
            if (recyclerView != null) {
                recyclerView.setNestedScrollingEnabled(false);
                ViewCompat.setAccessibilityDelegate(recyclerView, new AccessibilityDelegateCompat());
            }
            v8Banner.setLoopInterval(2000L);
            v8Banner.setIndicator(new a(this, circleIndicator));
            v8Banner.setAutoLoop(false);
            v8Banner.getViewPager2().setOffscreenPageLimit(1);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            v8Banner.getViewPager2().registerOnPageChangeCallback(new r(this, booleanRef));
            v8Banner.setAdapter(fVar);
            if (bannerV8Container != null) {
                bannerV8Container.setOnWidthChanged(new M(this, 1));
            }
        }
        List<cY.a> listMutableListOf = null;
        if (v8Banner != null) {
            eY.d dVar = new eY.d(v8Banner.getViewPager2());
            dVar.g = false;
            listMutableListOf = CollectionsKt.mutableListOf(new cY.a[]{new cY.b(dVar, -1.0f)});
        }
        this.f77686k = listMutableListOf;
        this.f77695t = new SparseArray<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean E0(V8Banner v8Banner, w wVar) {
        boolean z6;
        int iIntValue;
        int height = v8Banner.getHeight();
        Integer numValueOf = Integer.valueOf(height);
        if (height <= 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            int measuredHeight = v8Banner.getMeasuredHeight();
            Integer numValueOf2 = null;
            if (measuredHeight > 0) {
                numValueOf2 = Integer.valueOf(measuredHeight);
            }
            z6 = false;
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue();
            }
            return z6;
        }
        iIntValue = numValueOf.intValue();
        int i7 = wVar.f77830c;
        z6 = false;
        if (iIntValue <= i7 + 1) {
            z6 = false;
            if (i7 - 1 <= iIntValue) {
                z6 = true;
            }
        }
        return z6;
    }

    public final w A0(WindowSizeClass windowSizeClass, int i7) {
        boolean zIsWidthLarge = PegasusDDConfigKt.isWidthLarge(windowSizeClass);
        boolean zIsWidthMedium = PegasusDDConfigKt.isWidthMedium(windowSizeClass);
        int px = ListExtentionsKt.toPx(444);
        int px2 = ListExtentionsKt.toPx(365);
        int px3 = ListExtentionsKt.toPx(12);
        int px4 = ListExtentionsKt.toPx(8);
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i7, 0);
        int iCoerceAtMost = RangesKt.coerceAtMost(zIsWidthLarge ? px : zIsWidthMedium ? px2 : iCoerceAtLeast, iCoerceAtLeast);
        int i8 = (int) ((iCoerceAtMost / 16.0f) * 9.0f);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast((int) ((iCoerceAtLeast - iCoerceAtMost) / 2.0f), 0);
        boolean z6 = zIsWidthLarge || zIsWidthMedium;
        int i9 = zIsWidthLarge ? px3 : this.f77685j;
        int i10 = 1;
        if (z6) {
            i10 = 3;
        }
        return new w(iCoerceAtLeast, iCoerceAtMost, i8, iCoerceAtLeast2, i9, iCoerceAtLeast2 + px4, z6, i10);
    }

    public final void B0() {
        Indicator indicator;
        BannerItem currentItem;
        f fVar = this.f77684i;
        boolean zAllowShowIndicator = (fVar == null || (currentItem = fVar.getCurrentItem()) == null) ? true : currentItem.allowShowIndicator();
        V8Banner v8Banner = this.f77682f;
        if (v8Banner == null || (indicator = v8Banner.getIndicator()) == null) {
            return;
        }
        indicator.setVisible(zAllowShowIndicator && !F0());
    }

    public final void C0(long j7) {
        boolean z6 = HolderVisibleState.isPageVisible-impl(getVisibleState-mkcru2c());
        V8Banner v8Banner = this.f77682f;
        if (!z6 || !HolderVisibleState.isAttached-impl(getVisibleState-mkcru2c())) {
            if (v8Banner != null && v8Banner.getAutoLoop()) {
                v8Banner.setAutoLoop(false);
            }
            R9.v.a("checkAndSetLoopState failed visibleState:", HolderVisibleState.toString-impl(getVisibleState-mkcru2c()), "BannerV8Holder");
            return;
        }
        f fVar = this.f77684i;
        String logName = null;
        BannerItem currentItem = fVar != null ? fVar.getCurrentItem() : null;
        boolean zIsConsumingLoopEvent = currentItem != null ? currentItem.isConsumingLoopEvent() : false;
        if (zIsConsumingLoopEvent) {
            if (currentItem != null) {
                logName = currentItem.getLogName();
            }
            R9.v.a("tryStartAutoLoop failed forbidden by ", logName, "BannerV8Holder");
        }
        if (F0() || zIsConsumingLoopEvent) {
            if (v8Banner != null) {
                v8Banner.setAutoLoop(false);
            }
        } else {
            if (v8Banner == null || v8Banner.isLoopTaskRunning()) {
                return;
            }
            v8Banner.startAutoLoop(j7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long D0() {
        WindowManager windowManager;
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(this.itemView.getContext());
        return (long) Math.ceil(1000 / (((activityFindActivityOrNull == null || (windowManager = activityFindActivityOrNull.getWindowManager()) == null) ? null : windowManager.getDefaultDisplay()) != null ? r5.getRefreshRate() : 60.0f));
    }

    public final boolean F0() {
        FragmentActivity fragmentActivityP3;
        Fragment fragment = getFragment();
        WindowSizeClass windowSizeClassWindowSize = (fragment == null || (fragmentActivityP3 = fragment.p3()) == null) ? null : ScreenAdjustUtilsKt.windowSize(fragmentActivityP3);
        boolean z6 = false;
        if ((windowSizeClassWindowSize == null || PegasusDDConfigKt.isWidthNormal(windowSizeClassWindowSize)) && ((ArrayList) this.h).size() == 1) {
            z6 = true;
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final void u0(@NotNull gp0.c cVar) {
        boolean zE0;
        FragmentActivity fragmentActivityP3;
        V8Banner v8Banner = this.f77682f;
        BLog.i("BannerV8Holder", "bind , selectedPosition:" + (v8Banner != null ? Integer.valueOf(v8Banner.getSelectPosition()) : null) + "  ");
        f fVar = this.f77684i;
        if (fVar != null) {
            fVar.setMFragment(getFragment());
        }
        if (fVar != null) {
            fVar.f77739m = getInlineControl();
        }
        Fragment fragment = getFragment();
        WindowSizeClass windowSizeClassWindowSize = (fragment == null || (fragmentActivityP3 = fragment.p3()) == null) ? null : ScreenAdjustUtilsKt.windowSize(fragmentActivityP3);
        if (windowSizeClassWindowSize != null) {
            if (v8Banner == null) {
                zE0 = true;
            } else {
                Integer numI0 = I0();
                if (numI0 != null) {
                    int iIntValue = numI0.intValue();
                    this.f77689n = null;
                    w wVarA0 = A0(windowSizeClassWindowSize, iIntValue);
                    y0(v8Banner, windowSizeClassWindowSize, wVarA0);
                    zE0 = E0(v8Banner, wVarA0);
                } else {
                    zE0 = false;
                }
            }
            if (!zE0) {
                this.f77693r = cVar;
                K0(windowSizeClassWindowSize);
                return;
            }
        }
        z0(cVar);
    }

    public final void H0(int i7, boolean z6) {
        BasePegasusData basePegasusDataM;
        AdInfo adInfo;
        gp0.b bVar = (gp0.b) CollectionsKt.getOrNull(this.h, i7);
        if (bVar == null || (basePegasusDataM = bVar.m()) == null) {
            return;
        }
        if (basePegasusDataM instanceof gp0.g) {
        } else if (basePegasusDataM instanceof gp0.d) {
        }
        String type = bVar.getType();
        if (h.a(type) || Intrinsics.areEqual("ad_compose", type) || !z6 || (adInfo = basePegasusDataM.getAdInfo()) == null) {
            return;
        }
        if (adInfo.isAdLoc()) {
            IAdReporter.exposeAll$default(GAdCoreKt.getGAdReport(), adInfo.getReportInfo(), new ExtraParams((Bundle) null, 1, (DefaultConstructorMarker) null).IS_PEGASUS_V3(), (String) null, false, (List) null, (String) null, false, SearchBangumiItem.TYPE_FULLNET_VARIETY, (Object) null);
        } else {
            GAdCoreKt.getGAdReport().exposeContent(adInfo.getReportInfo());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer I0() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.bannerv8.BannerV8Holder.I0():java.lang.Integer");
    }

    public final void J0(WindowSizeClass windowSizeClass, boolean z6) {
        SwiperBanner swiperBanner = this.f77682f;
        if (swiperBanner == null) {
            return;
        }
        if (z6 || !Intrinsics.areEqual(this.f77689n, windowSizeClass)) {
            this.f77689n = windowSizeClass;
            int i7 = this.f77690o + 1;
            this.f77690o = i7;
            OneShotPreDrawListener.add(swiperBanner, new b(swiperBanner, i7, this, windowSizeClass));
        }
    }

    public final void K0(WindowSizeClass windowSizeClass) {
        SwiperBanner swiperBanner = this.f77682f;
        if (swiperBanner == null || Intrinsics.areEqual(this.f77692q, windowSizeClass)) {
            return;
        }
        this.f77692q = windowSizeClass;
        OneShotPreDrawListener.add(swiperBanner, new c(swiperBanner, this, windowSizeClass));
    }

    public final void L0(V8Banner v8Banner, int i7) {
        int i8 = this.f77691p + 1;
        this.f77691p = i8;
        View recyclerView = v8Banner.getRecyclerView();
        if (recyclerView == null) {
            recyclerView = v8Banner.getViewPager2();
        }
        OneShotPreDrawListener.add(recyclerView, new s(recyclerView, i8, this, v8Banner, i7));
    }

    public final void M0() {
        V8Banner v8Banner = this.f77682f;
        if (v8Banner == null) {
            return;
        }
        int iCoerceIn = RangesKt.coerceIn(v8Banner.getSelectPosition(), 0, RangesKt.coerceAtLeast(((ArrayList) this.h).size() - 1, 0));
        CircleIndicator circleIndicator = this.f77683g;
        if (circleIndicator != null) {
            int size = ((ArrayList) this.h).size();
            int i7 = size;
            if (this.f77688m) {
                i7 = size;
                if (1 <= size) {
                    i7 = size;
                    if (size < 3) {
                        i7 = 3;
                    }
                }
            }
            circleIndicator.select(iCoerceIn, i7);
        }
    }

    public final void N0(WindowSizeClass windowSizeClass) {
        V8Banner v8Banner = this.f77682f;
        if (v8Banner == null) {
            return;
        }
        Integer numI0 = I0();
        if (numI0 == null) {
            J0(windowSizeClass, false);
            return;
        }
        this.f77689n = null;
        w wVarA0 = A0(windowSizeClass, numI0.intValue());
        y0(v8Banner, windowSizeClass, wVarA0);
        if (!E0(v8Banner, wVarA0)) {
            if (this.f77693r != null) {
                K0(windowSizeClass);
            }
        } else {
            gp0.c cVar = this.f77693r;
            if (cVar == null) {
                return;
            }
            this.f77692q = null;
            z0(cVar);
        }
    }

    public final void addScrollListenerIfNotExist(@NotNull InlineParent.ScrollStateChangeListener scrollStateChangeListener) {
        ViewPager2 viewPager2;
        V8Banner v8Banner = this.f77682f;
        if (v8Banner == null || (viewPager2 = v8Banner.getViewPager2()) == null) {
            return;
        }
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f77695t.get(scrollStateChangeListener.hashCode());
        ViewPager2.OnPageChangeCallback a7 = onPageChangeCallback;
        if (onPageChangeCallback == null) {
            a7 = new A(scrollStateChangeListener, null, null);
            this.f77695t.put(scrollStateChangeListener.hashCode(), a7);
        }
        viewPager2.unregisterOnPageChangeCallback(a7);
        viewPager2.registerOnPageChangeCallback(a7);
    }

    @Deprecated(message = "不应该限定是RecyclerView")
    public final void addScrollListenerIfNotExistForRv(@NotNull RecyclerView.OnScrollListener onScrollListener) {
        ViewPager2 viewPager2;
        RecyclerView recyclerView;
        V8Banner v8Banner = this.f77682f;
        if (v8Banner == null || (viewPager2 = v8Banner.getViewPager2()) == null || (recyclerView = v8Banner.getRecyclerView()) == null) {
            return;
        }
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f77695t.get(onScrollListener.hashCode());
        ViewPager2.OnPageChangeCallback a7 = onPageChangeCallback;
        if (onPageChangeCallback == null) {
            a7 = new A(null, onScrollListener, recyclerView);
            this.f77695t.put(onScrollListener.hashCode(), a7);
        }
        viewPager2.unregisterOnPageChangeCallback(a7);
        viewPager2.registerOnPageChangeCallback(a7);
    }

    @Nullable
    public final List<cY.a> getExposeChildren() {
        return this.f77686k;
    }

    @NotNull
    public final List<IInlineCard<?>> getInlineCards() {
        RecyclerView recyclerView;
        V8Banner v8Banner = this.f77682f;
        if (v8Banner == null || (recyclerView = v8Banner.getRecyclerView()) == null) {
            return CollectionsKt.emptyList();
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(v8Banner.getViewPager2().getCurrentItem());
        return viewHolderFindViewHolderForAdapterPosition instanceof IInlineCard ? CollectionsKt.listOf(viewHolderFindViewHolderForAdapterPosition) : CollectionsKt.emptyList();
    }

    @Deprecated(message = "不应该在限定是RecyclerView")
    @Nullable
    public final RecyclerView getParentContainer() {
        V8Banner v8Banner = this.f77682f;
        return v8Banner != null ? v8Banner.getRecyclerView() : null;
    }

    public final boolean hasInlinePlayItem() {
        gp0.b bVar;
        gp0.c cVar = (gp0.c) getBindData();
        boolean z6 = false;
        if (cVar != null) {
            List<gp0.b> listK = cVar.k();
            z6 = false;
            if (listK != null) {
                List<gp0.b> list = listK;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z6 = false;
                } else {
                    Iterator<T> it = list.iterator();
                    do {
                        z6 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        bVar = (gp0.b) it.next();
                        BannerItemDataMirror bannerItemDataMirror = bVar.f120534m;
                        if ((bannerItemDataMirror != null && bannerItemDataMirror.getHasValidatePlayableData()) || bVar.h() != null || bVar.k() != null) {
                            break;
                        }
                    } while (bVar.l() == null);
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final void onExposeEnd(int i7, @NotNull View view) {
        HolderExtra holderExtra;
        gp0.c cVar = (gp0.c) getBindData();
        if (cVar == null || (holderExtra = cVar.f120535A) == null) {
            return;
        }
        holderExtra.setCardStartTime(0L);
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final void onExposeStart(int i7, @NotNull View view) {
        HolderExtra holderExtra;
        gp0.c cVar = (gp0.c) getBindData();
        if (cVar == null || (holderExtra = cVar.f120535A) == null) {
            return;
        }
        holderExtra.setCardStartTime(System.currentTimeMillis());
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final /* bridge */ /* synthetic */ void onFirstExpose(PegasusHolderData pegasusHolderData, int i7) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: onHolderVisibleStateChanged-9yN0R78, reason: not valid java name */
    public final void m8120onHolderVisibleStateChanged9yN0R78(int i7, int i8) {
        Fragment fragment;
        FragmentActivity fragmentActivityP3;
        AttachCoroutineScope attachScope;
        RecyclerView recyclerView;
        super/*com.bilibili.pegasus.PegasusHolder*/.onHolderVisibleStateChanged-9yN0R78(i7, i8);
        Q.a("onVisibleStateChanged PV:", " VV:", "BannerV8Holder", HolderVisibleState.isPageVisible-impl(i8), HolderVisibleState.isAttached-impl(i8));
        SwiperBanner swiperBanner = this.f77682f;
        if (swiperBanner != null && (recyclerView = swiperBanner.getRecyclerView()) != null) {
            Iterator it = ViewGroupKt.getChildren(recyclerView).iterator();
            while (it.hasNext()) {
                VideoBannerHolder childViewHolder = recyclerView.getChildViewHolder((View) it.next());
                VideoBannerHolder videoBannerHolder = childViewHolder instanceof VideoBannerHolder ? childViewHolder : null;
                if (videoBannerHolder != null) {
                    videoBannerHolder.onVisibleStateChanged(HolderVisibleState.isPageVisible-impl(i8), HolderVisibleState.isAttached-impl(i8));
                }
            }
        }
        f fVar = this.f77684i;
        if (fVar != null) {
            fVar.f77741o = HolderVisibleState.isPageVisible-impl(i8);
        }
        if (swiperBanner == null) {
            return;
        }
        int i9 = (HolderVisibleState.getAllVisible-impl(i8) && this.f77687l) ? 500 : 0;
        this.f77687l = false;
        if (HolderVisibleState.isAttached-impl(i8) && (fragment = getFragment()) != null && (fragmentActivityP3 = fragment.p3()) != null) {
            SplashViewModel splashViewModelA = R0.k.a(fragmentActivityP3, SplashViewModel.class);
            if (splashViewModelA.getSplashExit().getValue() == 0 && (attachScope = ViewAttachScopeKt.getAttachScope(swiperBanner)) != null) {
                BuildersKt.launch$default(attachScope, (CoroutineContext) null, (CoroutineStart) null, new BannerV8Holder$checkTopView$1(splashViewModelA, this, null), 3, (Object) null);
            }
        }
        if ((HolderVisibleState.isPageVisible-impl(i8) && !HolderVisibleState.isPageVisible-impl(i7)) || (HolderVisibleState.isAttached-impl(i8) && !HolderVisibleState.isAttached-impl(i7))) {
            BLog.i("BannerV8Holder", "Page Visible changed report item show");
            H0(swiperBanner.getSelectPosition(), false);
        }
        if (HolderVisibleState.isPageVisible-impl(i8) && HolderVisibleState.isAttached-impl(i8)) {
            C9208a.f130340a.getClass();
            if (C9208a.a()) {
                BuildersKt.launch$default(ViewAttachScopeKt.getAttachScope(this.itemView), (CoroutineContext) null, (CoroutineStart) null, new BannerV8Holder$onHolderVisibleStateChanged$2(((long) i9) + 1500, this, null), 3, (Object) null);
            } else {
                HandlerThreads.postDelayed(0, new com.bilibili.bililive.room.ui.matchcard.views.A(this, 2), ((long) i9) + 1500);
            }
            System.currentTimeMillis();
        } else if (!HolderVisibleState.isPageVisible-impl(i8) || !HolderVisibleState.isAttached-impl(i8)) {
            swiperBanner.setAutoLoop(false);
        }
        if (!HolderVisibleState.isAttached-impl(i8)) {
            swiperBanner.getViewPager2().setCurrentItem(swiperBanner.getViewPager2().getCurrentItem(), false);
        }
        if (HolderVisibleState.isPageVisible-impl(i8)) {
            B0();
        }
        if (HolderVisibleState.isPageVisible-impl(i8) == HolderVisibleState.isPageVisible-impl(i7) || fVar == null) {
            return;
        }
        fVar.dispatchPageVisible(HolderVisibleState.isPageVisible-impl(i8));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0291  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onNestedChildExpose(int r12, final int r13, @org.jetbrains.annotations.NotNull android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.bannerv8.BannerV8Holder.onNestedChildExpose(int, int, android.view.View):void");
    }

    public final void onPageScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
        RecyclerView recyclerView2;
        super/*com.bilibili.pegasus.PegasusHolder*/.onPageScrollStateChanged(recyclerView, i7);
        V8Banner v8Banner = this.f77682f;
        if (v8Banner == null || (recyclerView2 = v8Banner.getRecyclerView()) == null) {
            return;
        }
        Iterator it = ViewGroupKt.getChildren(recyclerView2).iterator();
        while (it.hasNext()) {
            VideoBannerHolder childViewHolder = recyclerView2.getChildViewHolder((View) it.next());
            VideoBannerHolder videoBannerHolder = childViewHolder instanceof VideoBannerHolder ? childViewHolder : null;
            if (videoBannerHolder != null) {
                videoBannerHolder.onParentScrollStateChanged(i7);
            }
        }
    }

    public final void onWindowSizeChanged(@NotNull WindowSizeClass windowSizeClass) {
        super/*com.bilibili.pegasus.PegasusHolder*/.onWindowSizeChanged(windowSizeClass);
        N0(windowSizeClass);
        J0(windowSizeClass, true);
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: v0 */
    public final /* bridge */ /* synthetic */ void onFirstExpose(BasePegasusData basePegasusData, int i7) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0(V8Banner v8Banner, WindowSizeClass windowSizeClass, w wVar) {
        boolean zAreEqual = Intrinsics.areEqual(this.f77694s, wVar);
        boolean z6 = wVar.f77834g;
        if (zAreEqual) {
            this.f77688m = z6;
        } else {
            CircleIndicator circleIndicator = this.f77683g;
            if (circleIndicator != null) {
                CommonExtensionKt.setMarginRight(circleIndicator, wVar.f77833f);
            }
            this.f77688m = z6;
            ViewGroup.LayoutParams layoutParams = v8Banner.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = wVar.f77830c;
            v8Banner.setLayoutParams(layoutParams);
            ViewPager2 viewPager2 = v8Banner.getViewPager2();
            int i7 = 0;
            viewPager2.setPadding(0, 0, 0, 0);
            viewPager2.setClipToPadding(false);
            viewPager2.setClipChildren(false);
            viewPager2.setOffscreenPageLimit(wVar.h);
            RecyclerView recyclerView = v8Banner.getRecyclerView();
            if (recyclerView != null) {
                int i8 = wVar.f77831d;
                recyclerView.setPadding(i8, 0, i8, 0);
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
            }
            if (!F0()) {
                i7 = wVar.f77832e;
            }
            L0(v8Banner, i7);
            this.f77694s = wVar;
        }
        RecyclerView recyclerView2 = v8Banner.getRecyclerView();
        if (recyclerView2 != null) {
            Iterator it = ViewGroupKt.getChildren(recyclerView2).iterator();
            while (it.hasNext()) {
                VideoBannerHolder childViewHolder = recyclerView2.getChildViewHolder((View) it.next());
                VideoBannerHolder videoBannerHolder = childViewHolder instanceof VideoBannerHolder ? childViewHolder : null;
                if (videoBannerHolder != null) {
                    videoBannerHolder.onWindowSizeChanged(windowSizeClass);
                }
            }
        }
        f fVar = this.f77684i;
        if (fVar != null) {
            fVar.dispatchWindowSize(windowSizeClass);
        }
        M0();
        B0();
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x030c A[PHI: r10
  0x030c: PHI (r10v22 java.lang.Long) = (r10v20 java.lang.Long), (r10v24 java.lang.Long) binds: [B:136:0x0342, B:125:0x0309] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z0(gp0.c r10) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.bannerv8.BannerV8Holder.z0(gp0.c):void");
    }
}
