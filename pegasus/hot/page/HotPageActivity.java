package com.bilibili.pegasus.hot.page;

import Bp0.i;
import Bp0.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.garb.GarbWatcher;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.pegasus.api.modelv2.HotPageConfig;
import com.bilibili.pegasus.hot.page.HotPageActivity;
import com.bilibili.pegasus.widgets.ReportPagerSlidingTabStrip;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.spmid.SPMID;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.swiperefresh.TintSwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/page/HotPageActivity.class */
@StabilityInferred(parameters = 0)
public final class HotPageActivity extends BaseAppCompatActivity implements SwipeRefreshLayout.OnRefreshListener, pc1.b, IPvTracker, GarbWatcher.Observer {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f78125X = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Garb f78127C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f78128D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public CollapsingToolbarLayout f78129E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public CoordinatorLayout f78130F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public TintImageView f78131G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public TintImageView f78132H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public TextView f78133I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public TintToolbar f78134J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public AppBarLayout f78135K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public ColorDrawable f78136L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public BiliImageView f78137M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public i f78138N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public ReportPagerSlidingTabStrip f78139O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public TintSwipeRefreshLayout f78140P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public k f78141Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public ViewPager f78142R;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final Bus f78126B = new Bus(GameCenterBottomTabConfig.TAB_TYPE_ACT);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @NotNull
    public final List<HotPageConfig.TopItem> f78143S = new ArrayList();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @NotNull
    public final HashSet<Long> f78144T = new HashSet<>();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f78145U = true;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final Bp0.b f78146V = new AppBarLayout.OnOffsetChangedListener(this) { // from class: Bp0.b

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HotPageActivity f849a;

        {
            this.f849a = this;
        }

        public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
            int colorById;
            HotPageActivity hotPageActivity = this.f849a;
            if (hotPageActivity.f78128D) {
                int statusBarHeight = StatusBarCompat.getStatusBarHeight(hotPageActivity);
                CollapsingToolbarLayout collapsingToolbarLayout = hotPageActivity.f78129E;
                if (collapsingToolbarLayout != null) {
                    int height = collapsingToolbarLayout.getHeight();
                    if (hotPageActivity.f78134J != null) {
                        float fCoerceAtMost = RangesKt.coerceAtMost(1.0f, RangesKt.coerceAtLeast(0.0f, (-i7) / ((height - r0.getHeight()) - statusBarHeight)));
                        TintSwipeRefreshLayout tintSwipeRefreshLayout = hotPageActivity.f78140P;
                        if (tintSwipeRefreshLayout != null) {
                            tintSwipeRefreshLayout.setEnabled(i7 >= 0);
                        }
                        CollapsingToolbarLayout collapsingToolbarLayout2 = hotPageActivity.f78129E;
                        boolean z6 = height + i7 < (collapsingToolbarLayout2 != null ? collapsingToolbarLayout2.getScrimVisibleHeightTrigger() : 0);
                        if (z6) {
                            TextView textView = hotPageActivity.f78133I;
                            if (textView != null) {
                                textView.setAlpha(fCoerceAtMost);
                            }
                            if (hotPageActivity.f78145U) {
                                return;
                            }
                            Garb garb = hotPageActivity.f78127C;
                            Garb garb2 = garb;
                            if (garb == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                                garb2 = null;
                            }
                            if (garb2.isPure()) {
                                colorById = ThemeUtils.getColorById(hotPageActivity, 2131103971);
                            } else {
                                Garb garb3 = hotPageActivity.f78127C;
                                Garb garb4 = garb3;
                                if (garb3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                                    garb4 = null;
                                }
                                colorById = garb4.getSecondaryPageColor();
                            }
                            StatusBarCompat.tintStatusBar(hotPageActivity, colorById);
                            Garb garb5 = hotPageActivity.f78127C;
                            Garb garb6 = garb5;
                            if (garb5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                                garb6 = null;
                            }
                            if (garb6.isPure()) {
                                hotPageActivity.Q6(2131103911);
                                TextView textView2 = hotPageActivity.f78133I;
                                if (textView2 != null) {
                                    textView2.setTextColor(ThemeUtils.getColorById(hotPageActivity, 2131103911));
                                }
                            } else {
                                TintImageView tintImageView = hotPageActivity.f78131G;
                                Drawable drawable = tintImageView != null ? tintImageView.getDrawable() : null;
                                Garb garb7 = hotPageActivity.f78127C;
                                Garb garb8 = garb7;
                                if (garb7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                                    garb8 = null;
                                }
                                Drawable drawableTintDrawable = ThemeUtils.tintDrawable(drawable, garb8.getFontColor());
                                TintImageView tintImageView2 = hotPageActivity.f78131G;
                                if (tintImageView2 != null) {
                                    tintImageView2.setImageDrawable(drawableTintDrawable);
                                }
                                TintImageView tintImageView3 = hotPageActivity.f78132H;
                                Drawable drawable2 = tintImageView3 != null ? tintImageView3.getDrawable() : null;
                                Garb garb9 = hotPageActivity.f78127C;
                                Garb garb10 = garb9;
                                if (garb9 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                                    garb10 = null;
                                }
                                Drawable drawableTintDrawable2 = ThemeUtils.tintDrawable(drawable2, garb10.getFontColor());
                                TintImageView tintImageView4 = hotPageActivity.f78132H;
                                if (tintImageView4 != null) {
                                    tintImageView4.setImageDrawable(drawableTintDrawable2);
                                }
                                TextView textView3 = hotPageActivity.f78133I;
                                if (textView3 != null) {
                                    Garb garb11 = hotPageActivity.f78127C;
                                    if (garb11 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                                        garb11 = null;
                                    }
                                    textView3.setTextColor(ColorStateList.valueOf(garb11.getFontColor()));
                                }
                            }
                        } else {
                            TextView textView4 = hotPageActivity.f78133I;
                            if (textView4 != null) {
                                textView4.setAlpha(0.0f);
                            }
                            if (!hotPageActivity.f78145U) {
                                return;
                            }
                            StatusBarCompat.tintStatusBar(hotPageActivity, ContextCompat.getColor(hotPageActivity, R.color.transparent));
                            hotPageActivity.Q6(R$color.Wh0_u);
                            TextView textView5 = hotPageActivity.f78133I;
                            if (textView5 != null) {
                                textView5.setTextColor(ThemeUtils.getColorById(hotPageActivity, R.color.transparent));
                            }
                        }
                        hotPageActivity.f78145U = z6;
                    }
                }
            }
        }
    };

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @NotNull
    public final b f78147W = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/page/HotPageActivity$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f78148a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f78148a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/page/HotPageActivity$b.class */
    public static final class b implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HotPageActivity f78149a;

        public b(HotPageActivity hotPageActivity) {
            this.f78149a = hotPageActivity;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onPageSelected(int r6) {
            /*
                r5 = this;
                r0 = r5
                com.bilibili.pegasus.hot.page.HotPageActivity r0 = r0.f78149a
                r10 = r0
                r0 = r10
                java.util.List<com.bilibili.pegasus.api.modelv2.HotPageConfig$TopItem> r0 = r0.f78143S
                r1 = r6
                java.lang.Object r0 = kotlin.collections.CollectionsKt.getOrNull(r0, r1)
                com.bilibili.pegasus.api.modelv2.HotPageConfig$TopItem r0 = (com.bilibili.pegasus.api.modelv2.HotPageConfig.TopItem) r0
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L81
                r0 = r9
                int r0 = r0.type
                r1 = 1
                if (r0 != r1) goto L81
                r0 = r10
                java.util.List<com.bilibili.pegasus.api.modelv2.HotPageConfig$TopItem> r0 = r0.f78143S
                r1 = r6
                java.lang.Object r0 = kotlin.collections.CollectionsKt.getOrNull(r0, r1)
                com.bilibili.pegasus.api.modelv2.HotPageConfig$TopItem r0 = (com.bilibili.pegasus.api.modelv2.HotPageConfig.TopItem) r0
                r11 = r0
                r0 = r11
                if (r0 != 0) goto L38
                goto L81
            L38:
                r0 = r10
                Bp0.k r0 = r0.f78141Q
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L75
                r0 = r12
                androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r0.f869e
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L75
                r0 = r11
                long r0 = r0.entranceId
                r7 = r0
                r0 = r12
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r12 = r0
                r0 = r12
                if (r0 != 0) goto L68
                goto L75
            L68:
                r0 = r7
                r1 = r12
                long r1 = r1.longValue()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L75
                goto L81
            L75:
                r0 = 0
                java.lang.String r1 = "creation.hot-page.hot-channel.0.click"
                r2 = r6
                r3 = r11
                java.util.Map r2 = com.bilibili.pegasus.hot.page.HotPageActivity.P6(r2, r3)
                com.bilibili.lib.neuron.api.Neurons.reportClick(r0, r1, r2)
            L81:
                r0 = r10
                Bp0.k r0 = r0.f78141Q
                r10 = r0
                r0 = r10
                if (r0 == 0) goto La9
                r0 = r9
                if (r0 == 0) goto L9b
                r0 = r9
                long r0 = r0.entranceId
                r7 = r0
                goto L9d
            L9b:
                r0 = 0
                r7 = r0
            L9d:
                r0 = r10
                androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r0.f869e
                r1 = r7
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.setValue(r1)
            La9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.hot.page.HotPageActivity.b.onPageSelected(int):void");
        }
    }

    public static Map P6(int i7, HotPageConfig.TopItem topItem) {
        return MapsKt.mapOf(new Pair[]{TuplesKt.to("channel_order", String.valueOf(i7)), TuplesKt.to("channel_name", topItem.title), TuplesKt.to("channel_id", String.valueOf(topItem.entranceId))});
    }

    public final void Q6(@ColorRes int i7) {
        VectorDrawableCompat vectorDrawableCompatCreate;
        TintImageView tintImageView = this.f78131G;
        if (tintImageView != null) {
            Drawable drawable = ResourcesCompat.getDrawable(getResources(), 2131233551, null);
            if (drawable == null) {
                return;
            }
            Drawable drawableWrap = DrawableCompat.wrap(drawable);
            DrawableCompat.setTint(drawableWrap, ThemeUtils.getColorById(this, i7));
            tintImageView.setImageDrawable(drawableWrap);
        }
        TintImageView tintImageView2 = this.f78132H;
        if (tintImageView2 == null || (vectorDrawableCompatCreate = VectorDrawableCompat.create(getResources(), 2131236373, null)) == null) {
            return;
        }
        DrawableCompat.setTint(vectorDrawableCompatCreate, ThemeUtils.getColorById(this, i7));
        tintImageView2.setImageDrawable(vectorDrawableCompatCreate);
    }

    public final void R6() {
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPure()) {
            StatusBarCompat.tintStatusBar(this, ThemeUtils.getThemeAttrColor(this, 2130968986));
        } else {
            StatusBarCompat.tintStatusBar(this, curGarb.getSecondaryPageColor(), curGarb.isDarkMode() ? 1 : 2);
        }
    }

    @NotNull
    public final Bus S3() {
        return this.f78126B;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.spmid.SPMTrackNodeWrapper
    @Nullable
    public final Pair<SPMID, HashMap<String, String>> fillTrackParams() {
        return new Pair<>(new SPMID("creation", SPMID.Segment.First), (Object) null);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "creation.hot-page.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final /* bridge */ /* synthetic */ Bundle getPvExtra() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0299  */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.hot.page.HotPageActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        GarbWatcher.INSTANCE.unSubscribe(this);
        this.f78126B.unregister(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        AppBarLayout appBarLayout = this.f78135K;
        if (appBarLayout != null) {
            appBarLayout.removeOnOffsetChangedListener(this.f78146V);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        int colorById = ThemeUtils.getColorById(this, 2131103971);
        getWindow().setStatusBarColor(0);
        getWindow().addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        R6();
        CoordinatorLayout coordinatorLayout = this.f78130F;
        if (coordinatorLayout != null) {
            coordinatorLayout.setStatusBarBackgroundColor(0);
        }
        CollapsingToolbarLayout collapsingToolbarLayout = this.f78129E;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setStatusBarScrimColor(colorById);
        }
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.f78129E;
        if (collapsingToolbarLayout2 != null) {
            collapsingToolbarLayout2.setContentScrimColor(colorById);
        }
        Garb garb = this.f78127C;
        Garb garb2 = garb;
        if (garb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb2 = null;
        }
        if (garb2.isPure()) {
            return;
        }
        CollapsingToolbarLayout collapsingToolbarLayout3 = this.f78129E;
        if (collapsingToolbarLayout3 != null) {
            collapsingToolbarLayout3.setStatusBarScrimColor(garb2.getSecondaryPageColor());
        }
        CollapsingToolbarLayout collapsingToolbarLayout4 = this.f78129E;
        if (collapsingToolbarLayout4 != null) {
            collapsingToolbarLayout4.setContentScrimColor(garb2.getSecondaryPageColor());
        }
        TintImageView tintImageView = this.f78131G;
        Drawable drawable = tintImageView != null ? tintImageView.getDrawable() : null;
        Garb garb3 = this.f78127C;
        Garb garb4 = garb3;
        if (garb3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb4 = null;
        }
        Drawable drawableTintDrawable = ThemeUtils.tintDrawable(drawable, garb4.getFontColor());
        TintImageView tintImageView2 = this.f78131G;
        if (tintImageView2 != null) {
            tintImageView2.setImageDrawable(drawableTintDrawable);
        }
        TintImageView tintImageView3 = this.f78132H;
        Drawable drawable2 = tintImageView3 != null ? tintImageView3.getDrawable() : null;
        Garb garb5 = this.f78127C;
        if (garb5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb5 = null;
        }
        Drawable drawableTintDrawable2 = ThemeUtils.tintDrawable(drawable2, garb5.getFontColor());
        TintImageView tintImageView4 = this.f78132H;
        if (tintImageView4 != null) {
            tintImageView4.setImageDrawable(drawableTintDrawable2);
        }
        TextView textView = this.f78133I;
        if (textView != null) {
            textView.setTextColor(ColorStateList.valueOf(garb2.getFontColor()));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        TintSwipeRefreshLayout tintSwipeRefreshLayout;
        boolean zJ0;
        k kVar = this.f78141Q;
        boolean z6 = false;
        if (kVar != null) {
            Long value = kVar.f869e.getValue();
            if (value != null) {
                long jLongValue = value.longValue();
                if (jLongValue == 0) {
                    kVar.f868d = "";
                }
                String str = kVar.f866b.get(jLongValue);
                zJ0 = kVar.J0(jLongValue, 0, str != null ? str : "", true);
            } else {
                zJ0 = false;
            }
            z6 = false;
            if (zJ0) {
                z6 = true;
            }
        }
        if (!z6 || (tintSwipeRefreshLayout = this.f78140P) == null) {
            return;
        }
        tintSwipeRefreshLayout.setRefreshing(true);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        AppBarLayout appBarLayout = this.f78135K;
        if (appBarLayout != null) {
            appBarLayout.addOnOffsetChangedListener(this.f78146V);
        }
    }

    @Override // com.bilibili.lib.ui.garb.GarbWatcher.Observer
    public final void onSkinChange(@NotNull Garb garb) {
        if (garb.isPure()) {
            R6();
        } else {
            R6();
        }
    }
}
