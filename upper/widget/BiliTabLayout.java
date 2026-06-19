package com.bilibili.upper.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.adcommon.utils.ext.AdExtensions;
import com.bilibili.studio.videoeditor.CaptionFx;
import com.bilibili.upper.module.contribute.picker.common.fragment.AlbumCommonLatestFragment;
import com.bilibili.upper.widget.BiliTabLayout;
import eJ0.C6924b;
import eJ0.C6931i;
import java.util.List;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.math.MathKt;
import n.C8047a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/BiliTabLayout.class */
@StabilityInferred(parameters = 0)
public final class BiliTabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final FastOutSlowInInterpolator f114313p0 = new FastOutSlowInInterpolator();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f114314A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f114315B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float f114316C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final float f114317D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f114318E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f114319F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f114320G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f114321H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f114322I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public final RectF f114323J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public final Paint f114324K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public final Paint f114325L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public final Rect f114326M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public ViewPager f114327N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public List<String> f114328O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public final LinearLayout f114329P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public ValueAnimator f114330Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public b f114331R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public a f114332S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @NotNull
    public final ScaleStrategy f114333T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @NotNull
    public final FollowScrollStrategy f114334U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final ColorChangeStrategy f114335V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final boolean f114336W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114337a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public b70.n f114338a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114340c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final d f114341c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f114342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f114344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f114345g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f114346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f114347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f114348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f114349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f114350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f114351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f114352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f114353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f114354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f114355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f114356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f114357t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f114358u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f114359v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f114360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f114361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f114362y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f114363z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/BiliTabLayout$ColorChangeStrategy.class */
    public static final class ColorChangeStrategy {
        private static final EnumEntries $ENTRIES;
        private static final ColorChangeStrategy[] $VALUES;
        public static final ColorChangeStrategy OPEN = new ColorChangeStrategy("OPEN", 0);
        public static final ColorChangeStrategy SHUTDOWN = new ColorChangeStrategy("SHUTDOWN", 1);

        private static final /* synthetic */ ColorChangeStrategy[] $values() {
            return new ColorChangeStrategy[]{OPEN, SHUTDOWN};
        }

        static {
            ColorChangeStrategy[] colorChangeStrategyArr$values = $values();
            $VALUES = colorChangeStrategyArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(colorChangeStrategyArr$values);
        }

        private ColorChangeStrategy(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ColorChangeStrategy> getEntries() {
            return $ENTRIES;
        }

        public static ColorChangeStrategy valueOf(String str) {
            return (ColorChangeStrategy) Enum.valueOf(ColorChangeStrategy.class, str);
        }

        public static ColorChangeStrategy[] values() {
            return (ColorChangeStrategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/BiliTabLayout$FollowScrollStrategy.class */
    public static final class FollowScrollStrategy {
        private static final EnumEntries $ENTRIES;
        private static final FollowScrollStrategy[] $VALUES;
        public static final FollowScrollStrategy OPEN = new FollowScrollStrategy("OPEN", 0);
        public static final FollowScrollStrategy OPEN_WHEN_MORE_THAN_TWO = new FollowScrollStrategy("OPEN_WHEN_MORE_THAN_TWO", 1);
        public static final FollowScrollStrategy SHUTDOWN = new FollowScrollStrategy("SHUTDOWN", 2);

        private static final /* synthetic */ FollowScrollStrategy[] $values() {
            return new FollowScrollStrategy[]{OPEN, OPEN_WHEN_MORE_THAN_TWO, SHUTDOWN};
        }

        static {
            FollowScrollStrategy[] followScrollStrategyArr$values = $values();
            $VALUES = followScrollStrategyArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(followScrollStrategyArr$values);
        }

        private FollowScrollStrategy(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<FollowScrollStrategy> getEntries() {
            return $ENTRIES;
        }

        public static FollowScrollStrategy valueOf(String str) {
            return (FollowScrollStrategy) Enum.valueOf(FollowScrollStrategy.class, str);
        }

        public static FollowScrollStrategy[] values() {
            return (FollowScrollStrategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/BiliTabLayout$ScaleStrategy.class */
    public static final class ScaleStrategy {
        private static final EnumEntries $ENTRIES;
        private static final ScaleStrategy[] $VALUES;
        public static final ScaleStrategy OPEN_DOWN_THEN_UP = new ScaleStrategy("OPEN_DOWN_THEN_UP", 0);
        public static final ScaleStrategy OPEN_DOWN_WHEN_UP = new ScaleStrategy("OPEN_DOWN_WHEN_UP", 1);
        public static final ScaleStrategy SHUTDOWN = new ScaleStrategy("SHUTDOWN", 2);

        private static final /* synthetic */ ScaleStrategy[] $values() {
            return new ScaleStrategy[]{OPEN_DOWN_THEN_UP, OPEN_DOWN_WHEN_UP, SHUTDOWN};
        }

        static {
            ScaleStrategy[] scaleStrategyArr$values = $values();
            $VALUES = scaleStrategyArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(scaleStrategyArr$values);
        }

        private ScaleStrategy(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ScaleStrategy> getEntries() {
            return $ENTRIES;
        }

        public static ScaleStrategy valueOf(String str) {
            return (ScaleStrategy) Enum.valueOf(ScaleStrategy.class, str);
        }

        public static ScaleStrategy[] values() {
            return (ScaleStrategy[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/BiliTabLayout$a.class */
    public interface a {
        void a(int i7, int i8);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/BiliTabLayout$b.class */
    public final class b implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliTabLayout f114364a;

        public b(BiliTabLayout biliTabLayout) {
            this.f114364a = biliTabLayout;
        }

        public final void a(View view, View view2, boolean z6, float f7) {
            BLog.d("TabLayout tabColorTranslation:" + f7 + "  toRight" + z6);
            boolean z7 = view instanceof c;
            if (z7 && (view2 instanceof c)) {
                if (z6) {
                    ((c) view).g(f7, true);
                    ((c) view2).g(f7, false);
                } else {
                    float f8 = 1 - f7;
                    ((c) view).g(f8, false);
                    ((c) view2).g(f8, true);
                }
            }
            if (z7 && (view2 instanceof c)) {
                ScaleStrategy scaleStrategy = ScaleStrategy.OPEN_DOWN_THEN_UP;
                BiliTabLayout biliTabLayout = this.f114364a;
                ScaleStrategy scaleStrategy2 = biliTabLayout.f114333T;
                if (scaleStrategy != scaleStrategy2) {
                    if (ScaleStrategy.OPEN_DOWN_WHEN_UP == scaleStrategy2 && (view instanceof c) && (view2 instanceof c) && f7 != 0.0d) {
                        float f9 = biliTabLayout.f114361x;
                        float f10 = 1;
                        float f11 = f9 - ((f9 - f10) * f7);
                        c cVar = (c) view;
                        cVar.setScaleX(f11);
                        cVar.setScaleY(f11);
                        float fA = C8047a.a(biliTabLayout.f114361x, f10, f7, f10);
                        c cVar2 = (c) view2;
                        cVar2.setScaleX(fA);
                        cVar2.setScaleY(fA);
                        return;
                    }
                    return;
                }
                if ((view instanceof c) && (view2 instanceof c)) {
                    double d7 = f7;
                    if (d7 == 0.0d) {
                        return;
                    }
                    if (d7 <= 0.5d) {
                        float f12 = biliTabLayout.f114361x;
                        float f13 = 2 * f7;
                        float fA2 = C8047a.a(1, f13, f12, f13);
                        c cVar3 = (c) view;
                        cVar3.setScaleX(fA2);
                        cVar3.setScaleY(fA2);
                        return;
                    }
                    float f14 = biliTabLayout.f114361x;
                    float f15 = 2;
                    float f16 = ((((f14 - 1) * f15) * f7) + f15) - f14;
                    c cVar4 = (c) view2;
                    cVar4.setScaleX(f16);
                    cVar4.setScaleY(f16);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
            BiliTabLayout biliTabLayout = this.f114364a;
            biliTabLayout.f114350m = biliTabLayout.f114351n;
            biliTabLayout.f114351n = i7;
            if (i7 == 0) {
                int i8 = biliTabLayout.f114343e;
                int i9 = biliTabLayout.f114353p;
                if (i8 != i9) {
                    biliTabLayout.f114343e = i9;
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
            int iRoundToInt;
            if (Float.isNaN(f7)) {
                return;
            }
            BiliTabLayout biliTabLayout = this.f114364a;
            if (!(i7 == 0 && f7 == 0.0f && biliTabLayout.f114351n == 0) && (iRoundToInt = MathKt.roundToInt(i7 + f7)) >= 0 && iRoundToInt < biliTabLayout.f114329P.getChildCount()) {
                biliTabLayout.f114360w = f7;
                biliTabLayout.j(i7);
                if (biliTabLayout.f114351n == 2 && biliTabLayout.f114350m == 0) {
                    return;
                }
                int iF = biliTabLayout.f(i7, i7 < biliTabLayout.f114343e);
                int iE = biliTabLayout.e(i7, i7 < biliTabLayout.f114343e);
                biliTabLayout.getClass();
                FollowScrollStrategy followScrollStrategy = FollowScrollStrategy.OPEN;
                FollowScrollStrategy followScrollStrategy2 = biliTabLayout.f114334U;
                if (followScrollStrategy != followScrollStrategy2 && (FollowScrollStrategy.OPEN_WHEN_MORE_THAN_TWO != followScrollStrategy2 || biliTabLayout.f114329P.getChildCount() <= 2)) {
                    int iF2 = biliTabLayout.f(i7, false);
                    int iF3 = iF2 + ((int) ((biliTabLayout.f(r0, false) - iF2) * biliTabLayout.f114360w));
                    biliTabLayout.setIndicatorStart(iF3);
                    biliTabLayout.setIndicatorEnd(iF3 + biliTabLayout.f114344f);
                    a(biliTabLayout.f114329P.getChildAt(i7), biliTabLayout.f114329P.getChildAt(i7 + 1), false, biliTabLayout.f114360w);
                    return;
                }
                if (i7 >= biliTabLayout.f114343e) {
                    float f8 = biliTabLayout.f114360w;
                    if (f8 == 0.0d) {
                        biliTabLayout.setIndicatorStart(biliTabLayout.f(i7, false));
                        biliTabLayout.setIndicatorEnd(biliTabLayout.e(i7, false));
                    } else if (f8 <= 0.0f || f8 > 0.5d) {
                        biliTabLayout.setIndicatorStart(iF + ((int) (((biliTabLayout.f114360w * 2) - 1) * (biliTabLayout.f(r0, false) - iF))));
                        biliTabLayout.setIndicatorEnd(biliTabLayout.e(i7 + 1, false));
                    } else {
                        biliTabLayout.setIndicatorStart(iF);
                        biliTabLayout.setIndicatorEnd(iE + ((int) ((biliTabLayout.e(i7 + 1, false) - iE) * biliTabLayout.f114360w * 2)));
                    }
                    a(biliTabLayout.f114329P.getChildAt(i7), biliTabLayout.f114329P.getChildAt(i7 + 1), true, biliTabLayout.f114360w);
                    return;
                }
                float f9 = biliTabLayout.f114360w;
                if (f9 == 0.0d) {
                    biliTabLayout.setIndicatorStart(biliTabLayout.f(i7, true));
                    biliTabLayout.setIndicatorEnd(biliTabLayout.e(i7, true));
                } else if (f9 <= 0.0f || f9 > 0.5d) {
                    biliTabLayout.setIndicatorStart(biliTabLayout.f(i7 + 1, true));
                    biliTabLayout.setIndicatorEnd(iE + ((int) (((biliTabLayout.f114360w * 2) - 1) * (biliTabLayout.e(r0, true) - iE))));
                } else {
                    biliTabLayout.setIndicatorStart(iF + ((int) (biliTabLayout.f114360w * 2 * (biliTabLayout.f(i7 + 1, true) - iF))));
                    biliTabLayout.setIndicatorEnd(iE);
                }
                a(biliTabLayout.f114329P.getChildAt(i7), biliTabLayout.f114329P.getChildAt(i7 + 1), false, biliTabLayout.f114360w);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            BiliTabLayout biliTabLayout = this.f114364a;
            int i8 = biliTabLayout.f114351n;
            if (i8 == 0 || (i8 == 2 && biliTabLayout.f114350m == 0 && biliTabLayout.f114327N != null)) {
                BLog.d("TabLayout ENSURE select position:" + i7);
                biliTabLayout.k(i7, 2);
            } else {
                BLog.d("TabLayout INTERRUPT select position:" + i7);
                biliTabLayout.h(i7, 1);
            }
            biliTabLayout.f114353p = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/BiliTabLayout$c.class */
    public final class c extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public TextView f114365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public TextView f114366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public View f114367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final RelativeLayout f114368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public ValueAnimator f114369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public ValueAnimator f114370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final BiliTabLayout f114371g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@Nullable BiliTabLayout biliTabLayout, Context context) {
            super(context);
            this.f114371g = biliTabLayout;
            RelativeLayout relativeLayout = new RelativeLayout(context);
            this.f114368d = relativeLayout;
            ViewCompat.setPaddingRelative(this, biliTabLayout.f114357t, 0, biliTabLayout.f114358u, biliTabLayout.f114356s);
            addView(relativeLayout, new FrameLayout.LayoutParams(-2, -2, 17));
            setClickable(true);
        }

        public static void e(TextView textView, boolean z6) {
            if (z6) {
                if (textView != null) {
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                }
            } else if (textView != null) {
                textView.setTypeface(Typeface.DEFAULT);
            }
        }

        public final void a(@Nullable View view, @NotNull RelativeLayout.LayoutParams layoutParams) {
            RelativeLayout relativeLayout;
            View view2 = this.f114367c;
            if (view2 != null && (relativeLayout = this.f114368d) != null) {
                relativeLayout.removeView(view2);
            }
            this.f114367c = view;
            TextView textView = this.f114366b;
            if (textView != null) {
                layoutParams.addRule(1, textView.getId());
            } else {
                TextView textView2 = this.f114365a;
                if (textView2 != null) {
                    layoutParams.addRule(1, textView2.getId());
                }
            }
            if (isSelected()) {
                this.f114367c.setSelected(true);
            }
            RelativeLayout relativeLayout2 = this.f114368d;
            if (relativeLayout2 != null) {
                relativeLayout2.addView(this.f114367c, layoutParams);
            }
        }

        public final void b(@NotNull View view) {
            TextView textView = this.f114365a;
            if (textView != null) {
                textView.setEnabled(true);
            }
            TextView textView2 = this.f114365a;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f114366b;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            RelativeLayout relativeLayout = this.f114368d;
            if (relativeLayout != null) {
                relativeLayout.removeView(view);
            }
        }

        public final void c(int i7, boolean z6) {
            setSelected(z6);
            TextView textView = this.f114366b;
            if (textView == null) {
                return;
            }
            if (z6) {
                BiliTabLayout biliTabLayout = this.f114371g;
                FastOutSlowInInterpolator fastOutSlowInInterpolator = BiliTabLayout.f114313p0;
                textView.setTextSize(0, biliTabLayout.i() ? this.f114371g.f114317D : this.f114371g.f114316C);
                e(this.f114366b, this.f114371g.f114321H);
            } else {
                textView.setTextSize(0, this.f114371g.f114317D);
                e(this.f114366b, this.f114371g.f114320G);
            }
            TextView textView2 = this.f114366b;
            BiliTabLayout biliTabLayout2 = this.f114371g;
            h(z6, i7, textView2, biliTabLayout2.f114316C, biliTabLayout2.f114317D);
            if (this.f114370f == null) {
                this.f114370f = new ValueAnimator();
            }
            TextView textView3 = this.f114366b;
            BiliTabLayout biliTabLayout3 = this.f114371g;
            f(z6, i7, textView3, biliTabLayout3.f114340c, biliTabLayout3.f114342d, this.f114370f);
        }

        public final void d(int i7, boolean z6) {
            setSelected(z6);
            if (z6) {
                e(this.f114365a, this.f114371g.f114319F);
                c(i7, true);
            } else {
                e(this.f114365a, this.f114371g.f114318E);
                c(i7, false);
            }
            TextView textView = this.f114365a;
            BiliTabLayout biliTabLayout = this.f114371g;
            h(z6, i7, textView, biliTabLayout.f114362y, biliTabLayout.f114363z);
            if (this.f114369e == null) {
                this.f114369e = new ValueAnimator();
            }
            TextView textView2 = this.f114365a;
            BiliTabLayout biliTabLayout2 = this.f114371g;
            f(z6, i7, textView2, biliTabLayout2.f114337a, biliTabLayout2.f114339b, this.f114369e);
        }

        public final void f(boolean z6, int i7, final TextView textView, int i8, int i9, ValueAnimator valueAnimator) {
            int currentTextColor;
            if (textView == null) {
                return;
            }
            BiliTabLayout biliTabLayout = this.f114371g;
            FastOutSlowInInterpolator fastOutSlowInInterpolator = BiliTabLayout.f114313p0;
            biliTabLayout.getClass();
            if (ColorChangeStrategy.OPEN != biliTabLayout.f114335V || i7 == 0) {
                if (!z6) {
                    i8 = i9;
                }
                textView.setTextColor(i8);
                return;
            }
            if (i7 == 1) {
                return;
            }
            if (z6) {
                if (textView.getCurrentTextColor() == i8) {
                    return;
                } else {
                    currentTextColor = textView.getCurrentTextColor();
                }
            } else {
                if (textView.getCurrentTextColor() == i9) {
                    return;
                }
                currentTextColor = textView.getCurrentTextColor();
                i8 = i9;
            }
            valueAnimator.setDuration(200L);
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            valueAnimator.removeAllUpdateListeners();
            final int i10 = currentTextColor;
            final int i11 = i8;
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(textView, i10, i11) { // from class: com.bilibili.upper.widget.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TextView f114501a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f114502b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f114503c;

                {
                    this.f114501a = textView;
                    this.f114502b = i10;
                    this.f114503c = i11;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f114501a.setTextColor(C6924b.a(((Float) valueAnimator2.getAnimatedValue()).floatValue(), this.f114502b, this.f114503c));
                }
            });
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.start();
            BLog.d("TabLayout updateColor isSelect :" + z6 + " startColor" + currentTextColor);
        }

        public final void g(float f7, boolean z6) {
            int iA;
            int iA2;
            float f8 = f7;
            if (f7 > 1.0f) {
                f8 = 1.0f;
            }
            if (z6) {
                BiliTabLayout biliTabLayout = this.f114371g;
                iA = C6924b.a(f8, biliTabLayout.f114337a, biliTabLayout.f114339b);
                BiliTabLayout biliTabLayout2 = this.f114371g;
                iA2 = C6924b.a(f8, biliTabLayout2.f114340c, biliTabLayout2.f114342d);
            } else {
                BiliTabLayout biliTabLayout3 = this.f114371g;
                iA = C6924b.a(f8, biliTabLayout3.f114339b, biliTabLayout3.f114337a);
                BiliTabLayout biliTabLayout4 = this.f114371g;
                iA2 = C6924b.a(f8, biliTabLayout4.f114342d, biliTabLayout4.f114340c);
            }
            TextView textView = this.f114365a;
            if (textView != null) {
                textView.setTextColor(iA);
            }
            TextView textView2 = this.f114366b;
            if (textView2 != null) {
                textView2.setTextColor(iA2);
            }
        }

        @Nullable
        public final View getExtraView() {
            return this.f114367c;
        }

        @Nullable
        public final String getSubTileText() {
            TextView textView = this.f114366b;
            return textView == null ? null : textView.getText().toString();
        }

        @Nullable
        public final TextView getSubTitleView() {
            return this.f114366b;
        }

        @NotNull
        public final String getTitleText() {
            return this.f114365a.getText().toString();
        }

        @Nullable
        public final TextView getTitleView() {
            return this.f114365a;
        }

        public final void h(boolean z6, int i7, TextView textView, float f7, float f8) {
            if (textView == null) {
                return;
            }
            BiliTabLayout biliTabLayout = this.f114371g;
            FastOutSlowInInterpolator fastOutSlowInInterpolator = BiliTabLayout.f114313p0;
            if (!biliTabLayout.i()) {
                if (!z6) {
                    f7 = f8;
                }
                textView.setTextSize(0, f7);
                return;
            }
            if (i7 == 1) {
                return;
            }
            if (!z6) {
                if (i7 == 0) {
                    textView.setTextSize(0, f8);
                    setScaleX(1.0f);
                    setScaleY(1.0f);
                    return;
                } else {
                    if (getScaleX() == 1.0f && getScaleY() == 1.0f) {
                        return;
                    }
                    animate().scaleX(1.0f).scaleY(1.0f).start();
                    return;
                }
            }
            if (i7 == 0) {
                textView.setTextSize(0, f8);
                setScaleX(this.f114371g.f114361x);
                setScaleY(this.f114371g.f114361x);
            } else {
                if (getScaleX() == this.f114371g.f114361x && getScaleY() == this.f114371g.f114361x) {
                    return;
                }
                float f9 = this.f114371g.f114361x;
                animate().scaleX(f9).scaleY(f9).start();
            }
        }

        public final void setSubTitleView(@Nullable TextView textView) {
            this.f114366b = textView;
        }

        public final void setTitleView(@Nullable TextView textView) {
            this.f114365a = textView;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/BiliTabLayout$d.class */
    public static final class d extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliTabLayout f114372a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BiliTabLayout biliTabLayout, Looper looper) {
            super(looper);
            this.f114372a = biliTabLayout;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 111) {
                int i7 = message.arg1;
                int i8 = message.arg2;
                BiliTabLayout biliTabLayout = this.f114372a;
                int childCount = biliTabLayout.f114329P.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    if (i7 == i9) {
                        BLog.d("TabLayout updateTabItemStyle select position:" + i7);
                        ((c) biliTabLayout.f114329P.getChildAt(i9)).d(i8, true);
                    } else {
                        ((c) biliTabLayout.f114329P.getChildAt(i9)).d(i8, false);
                    }
                }
            }
        }
    }

    @JvmOverloads
    public BiliTabLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public BiliTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BiliTabLayout(Context context, AttributeSet attributeSet, int i7) {
        LinearLayout linearLayout;
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f114322I = true;
        this.f114336W = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IE0.a.f10163c, 0, 0);
        this.f114344f = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, C6931i.a(context, 24.0f));
        this.f114346i = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, C6931i.a(context, 3.0f));
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(25, C6931i.a(context, 14.0f));
        this.f114363z = dimensionPixelSize;
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(21, C6931i.a(context, 16.0f));
        this.f114362y = dimensionPixelSize2;
        this.f114314A = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1);
        this.f114315B = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.f114317D = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, C6931i.a(context, 11.0f));
        this.f114316C = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, C6931i.a(context, 12.0f));
        this.f114359v = typedArrayObtainStyledAttributes.getDimensionPixelSize(27, 1);
        this.f114345g = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, C6931i.a(getContext(), 1.5f));
        this.f114354q = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, C6931i.a(context, 30.0f));
        this.f114339b = typedArrayObtainStyledAttributes.getColor(24, context.getResources().getColor(2131103856));
        this.f114337a = typedArrayObtainStyledAttributes.getColor(20, ResourcesCompat.getColor(context.getResources(), 2131103857, null));
        this.f114342d = typedArrayObtainStyledAttributes.getColor(16, ResourcesCompat.getColor(context.getResources(), 2131103856, null));
        this.f114340c = typedArrayObtainStyledAttributes.getColor(12, ResourcesCompat.getColor(context.getResources(), 2131103857, null));
        this.h = typedArrayObtainStyledAttributes.getColor(6, ResourcesCompat.getColor(context.getResources(), 2131103855, null));
        this.f114349l = typedArrayObtainStyledAttributes.getColor(26, 0);
        this.f114318E = typedArrayObtainStyledAttributes.getBoolean(23, false);
        this.f114319F = typedArrayObtainStyledAttributes.getBoolean(22, true);
        this.f114321H = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f114320G = typedArrayObtainStyledAttributes.getBoolean(15, false);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f114355r = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, C6931i.a(context, 5.0f));
        this.f114356s = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0);
        this.f114357t = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.f114358u = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f114333T = ScaleStrategy.OPEN_DOWN_WHEN_UP;
        this.f114334U = FollowScrollStrategy.SHUTDOWN;
        this.f114335V = ColorChangeStrategy.OPEN;
        this.f114324K = new Paint(1);
        this.f114323J = new RectF();
        this.f114326M = new Rect();
        this.f114325L = new Paint();
        setClipChildren(true);
        setClipToPadding(true);
        this.f114329P = new LinearLayout(getContext());
        setFillViewport(true);
        this.f114361x = dimensionPixelSize2 / dimensionPixelSize;
        LinearLayout linearLayout2 = this.f114329P;
        if (linearLayout2 != null) {
            linearLayout2.setPadding(dimensionPixelSize3, 0, dimensionPixelSize4, 0);
        }
        if (z6 && (linearLayout = this.f114329P) != null) {
            linearLayout.setGravity(1);
        }
        View view = this.f114329P;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (z6) {
            layoutParams.gravity = 1;
        }
        Unit unit = Unit.INSTANCE;
        addView(view, 0, layoutParams);
        this.f114341c0 = new d(this, Looper.getMainLooper());
    }

    public static void a(BiliTabLayout biliTabLayout, ValueAnimator valueAnimator) {
        biliTabLayout.setIndicatorStart(((Integer) valueAnimator.getAnimatedValue()).intValue());
        biliTabLayout.setIndicatorEnd(((Integer) valueAnimator.getAnimatedValue()).intValue() + biliTabLayout.f114344f);
    }

    private final int getIndicatorStart() {
        LinearLayout linearLayout = this.f114329P;
        int left = 0;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                linearLayout = null;
            }
            left = 0;
            if (linearLayout != null) {
                left = linearLayout.getChildAt(0).getLeft() + linearLayout.getPaddingLeft();
            }
        }
        return left;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int getMinimumTabWidth() {
        /*
            r4 = this;
            r0 = r4
            int r0 = r0.f114352o
            if (r0 != 0) goto L4d
            r0 = r4
            androidx.viewpager.widget.ViewPager r0 = r0.f114327N
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L24
            r0 = r5
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L24
            r0 = r5
            int r0 = r0.getCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = r0
            goto L26
        L24:
            r0 = 0
            r5 = r0
        L26:
            r0 = r5
            if (r0 == 0) goto L33
            r0 = r5
            r6 = r0
            r0 = r5
            int r0 = r0.intValue()
            if (r0 != 0) goto L38
        L33:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = r0
        L38:
            r0 = r4
            int r0 = r0.getMeasuredWidth()
            r0 = r4
            r1 = r4
            android.content.Context r1 = r1.getContext()
            int r1 = Jf1.h.d(r1)
            r2 = r6
            int r2 = r2.intValue()
            int r1 = r1 / r2
            r0.f114352o = r1
        L4d:
            r0 = r4
            int r0 = r0.f114352o
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.widget.BiliTabLayout.getMinimumTabWidth():int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIndicatorEnd(int i7) {
        this.f114348k = i7;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIndicatorStart(int i7) {
        this.f114347j = i7;
        postInvalidateOnAnimation();
    }

    public final void d(final int i7, String str) {
        TextView textView;
        final c cVar = new c(this, getContext());
        if (!TextUtils.isEmpty(str)) {
            if (cVar.f114365a == null) {
                TextView textView2 = new TextView(cVar.getContext());
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setSingleLine(true);
                textView2.setId(2131309987);
                RelativeLayout relativeLayout = cVar.f114368d;
                if (relativeLayout != null) {
                    relativeLayout.addView(textView2);
                }
                cVar.f114365a = textView2;
            }
            int i8 = this.f114314A;
            if (i8 > 0 && (textView = cVar.f114365a) != null) {
                textView.setMaxWidth(i8);
            }
            cVar.f114365a.setText(str);
            cVar.d(0, cVar.isSelected());
        }
        cVar.setMinimumWidth(getMinimumTabWidth());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 1;
        LinearLayout linearLayout = this.f114329P;
        if (linearLayout != null) {
            linearLayout.addView(cVar, i7, layoutParams);
        }
        cVar.setOnClickListener(new View.OnClickListener(cVar, this, i7) { // from class: com.bilibili.upper.widget.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliTabLayout.c f114497a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliTabLayout f114498b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f114499c;

            {
                this.f114497a = cVar;
                this.f114498b = this;
                this.f114499c = i7;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BiliTabLayout.c cVar2 = this.f114497a;
                BiliTabLayout biliTabLayout = this.f114498b;
                int i9 = this.f114499c;
                FastOutSlowInInterpolator fastOutSlowInInterpolator = BiliTabLayout.f114313p0;
                TextView titleView = cVar2.getTitleView();
                if (titleView == null || !titleView.isEnabled() || biliTabLayout.f114327N == null) {
                    return;
                }
                BiliTabLayout.a aVar = biliTabLayout.f114332S;
                if (aVar != null) {
                    aVar.a(i9, biliTabLayout.f114343e);
                }
                ViewPager viewPager = biliTabLayout.f114327N;
                if (viewPager != null) {
                    viewPager.setCurrentItem(i9, true);
                }
            }
        });
        b70.n nVar = this.f114338a0;
        if (nVar == null || i7 != 2) {
            return;
        }
        TextView titleView = cVar.getTitleView();
        ((AlbumCommonLatestFragment) nVar.a).getClass();
        if (titleView == null) {
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(titleView.getContext(), 2131236410);
        titleView.setCompoundDrawablePadding(AdExtensions.getToPx(4));
        titleView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    public final int e(int i7, boolean z6) {
        return f(i7, !z6);
    }

    public final int f(int i7, boolean z6) {
        if (this.f114329P.getChildCount() < 1) {
            return 0;
        }
        int childCount = i7;
        if (i7 >= this.f114329P.getChildCount()) {
            childCount = this.f114329P.getChildCount() - 1;
        }
        int indicatorStart = getIndicatorStart();
        for (int i8 = 0; i8 < childCount; i8++) {
            indicatorStart += this.f114329P.getChildAt(i8).getWidth();
        }
        int width = indicatorStart;
        if (childCount >= 0) {
            if (childCount >= this.f114329P.getChildCount()) {
                width = indicatorStart;
            } else {
                View childAt = this.f114329P.getChildAt(childCount);
                childAt.getLeft();
                width = indicatorStart + (z6 ? (childAt.getWidth() + this.f114344f) / 2 : (childAt.getWidth() - this.f114344f) / 2);
            }
        }
        return width;
    }

    @Nullable
    public final c g(int i7) {
        View childAt = this.f114329P.getChildAt(i7);
        return childAt instanceof c ? (c) childAt : null;
    }

    public final int getItemCount() {
        return this.f114329P.getChildCount();
    }

    public final void h(int i7, int i8) {
        this.f114341c0.removeMessages(CaptionFx.BUBBLEPATH_FIELD_NUMBER);
        Message message = new Message();
        message.what = CaptionFx.BUBBLEPATH_FIELD_NUMBER;
        message.arg1 = i7;
        message.arg2 = i8;
        this.f114341c0.sendMessageDelayed(message, 50L);
    }

    public final boolean i() {
        return ScaleStrategy.SHUTDOWN != this.f114333T;
    }

    public final void j(int i7) {
        if (this.f114329P.getChildCount() < 1) {
            return;
        }
        View childAt = this.f114329P.getChildAt(i7);
        int i8 = i7 + 1;
        View childAt2 = i8 < this.f114329P.getChildCount() ? this.f114329P.getChildAt(i8) : null;
        int left = 0;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        if (childAt != null) {
            left = childAt.getLeft();
        }
        scrollTo((((width / 2) + left) - (getWidth() / 2)) + ((int) ((width + width2) * 0.5f * this.f114360w)), i7);
    }

    public final void k(int i7, int i8) {
        h(i7, i8);
        if (this.f114330Q == null) {
            this.f114330Q = new ValueAnimator();
        }
        if (this.f114330Q.isRunning()) {
            this.f114330Q.cancel();
        }
        this.f114330Q.setInterpolator(f114313p0);
        this.f114330Q.setDuration(200L);
        this.f114330Q.setIntValues(f(this.f114343e, false), f(i7, false));
        this.f114330Q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.upper.widget.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliTabLayout f114500a;

            {
                this.f114500a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BiliTabLayout.a(this.f114500a, valueAnimator);
            }
        });
        this.f114330Q.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f114327N;
        if (viewPager != null) {
            if (viewPager != null) {
                viewPager.setAdapter(null);
            }
            this.f114327N = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        ViewPager viewPager;
        super.onDraw(canvas);
        if (this.f114329P.getChildCount() < 1 || (viewPager = this.f114327N) == null) {
            return;
        }
        if (this.f114347j <= 0 || this.f114348k <= 0) {
            int currentItem = viewPager.getCurrentItem();
            this.f114353p = currentItem;
            this.f114343e = currentItem;
            int iF = f(this.f114327N.getCurrentItem(), false);
            this.f114347j = iF;
            setIndicatorEnd(iF + this.f114344f);
        }
        this.f114324K.setColor(this.f114349l);
        this.f114324K.setStrokeWidth(this.f114359v);
        canvas.drawLine(0.0f, getHeight() - this.f114356s, getScrollX() + getWidth(), getHeight() - this.f114356s, this.f114324K);
        int i7 = this.f114347j;
        int i8 = this.f114348k;
        if (i7 > i8) {
            this.f114323J.set(i8, (getHeight() - this.f114346i) - this.f114356s, this.f114347j, getHeight() - this.f114356s);
        } else {
            this.f114323J.set(i7, (getHeight() - this.f114346i) - this.f114356s, this.f114348k, getHeight() - this.f114356s);
        }
        this.f114324K.setColor(this.h);
        this.f114324K.setStrokeWidth(this.f114346i);
        RectF rectF = this.f114323J;
        int i9 = this.f114345g;
        canvas.drawRoundRect(rectF, i9, i9, this.f114324K);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int iWidth;
        int i9;
        super.onMeasure(i7, i8);
        if (this.f114322I) {
            this.f114322I = false;
            int childCount = this.f114329P.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                c cVar = (c) this.f114329P.getChildAt(i10);
                int measuredWidth = cVar.getMeasuredWidth();
                String titleText = cVar.getTitleText();
                if (TextUtils.isEmpty(titleText)) {
                    iWidth = 0;
                } else {
                    Paint paint = this.f114325L;
                    i();
                    paint.setTextSize(this.f114362y);
                    if (this.f114319F) {
                        this.f114325L.setFakeBoldText(true);
                    }
                    this.f114325L.getTextBounds(titleText, 0, titleText.length(), this.f114326M);
                    int iWidth2 = this.f114326M.width();
                    iWidth = this.f114314A;
                    if (iWidth2 <= iWidth) {
                        iWidth = this.f114326M.width();
                    }
                }
                String subTileText = cVar.getSubTileText();
                int i11 = iWidth;
                if (!TextUtils.isEmpty(subTileText)) {
                    this.f114325L.setTextSize(i() ? this.f114317D : this.f114316C);
                    if (this.f114321H) {
                        this.f114325L.setFakeBoldText(true);
                    }
                    this.f114325L.getTextBounds(subTileText, 0, subTileText.length(), this.f114326M);
                    int iWidth3 = this.f114326M.width();
                    int iWidth4 = this.f114315B;
                    if (iWidth3 <= iWidth4) {
                        iWidth4 = this.f114326M.width();
                    }
                    i11 = iWidth + iWidth4 + this.f114355r;
                }
                View extraView = cVar.getExtraView();
                int i12 = i11;
                if (extraView != null) {
                    int measuredWidth2 = extraView.getMeasuredWidth();
                    ViewGroup.LayoutParams layoutParams = extraView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    int i13 = measuredWidth2;
                    if (marginLayoutParams != null) {
                        i13 = measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    }
                    if (this.f114336W) {
                        i9 = (i13 * 2) + i11;
                    } else {
                        i9 = i11 + i13;
                        i13 = 0;
                    }
                    cVar.setPadding(cVar.getPaddingLeft() + i13, cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                    i12 = i9;
                }
                int i14 = this.f114354q;
                if (measuredWidth - i12 < i14) {
                    ViewGroup.LayoutParams layoutParams2 = cVar.getLayoutParams();
                    layoutParams2.width = i12 + i14;
                    cVar.setLayoutParams(layoutParams2);
                }
            }
            super.onMeasure(i7, i8);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NotNull View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (i7 == 0) {
            post(new On0.w(this, 1));
        }
    }

    public final void setCurrentItem(int i7) {
        h(i7, 0);
    }

    public final void setupTabs(@Nullable ViewPager viewPager) {
        if (viewPager == null) {
            return;
        }
        this.f114327N = viewPager;
        if (this.f114331R == null) {
            this.f114331R = new b(this);
        }
        this.f114322I = true;
        b bVar = this.f114331R;
        if (bVar != null) {
            BiliTabLayout biliTabLayout = bVar.f114364a;
            biliTabLayout.f114351n = 0;
            biliTabLayout.f114350m = 0;
            viewPager.removeOnPageChangeListener(bVar);
            ViewPager viewPager2 = this.f114327N;
            if (viewPager2 != null) {
                viewPager2.addOnPageChangeListener(bVar);
            }
        }
        this.f114329P.removeAllViews();
        List<String> list = this.f114328O;
        if (list != null && !list.isEmpty()) {
            int size = this.f114328O.size();
            for (int i7 = 0; i7 < size; i7++) {
                d(i7, this.f114328O.get(i7));
            }
        } else if (viewPager.getAdapter() != null) {
            int count = viewPager.getAdapter().getCount();
            for (int i8 = 0; i8 < count; i8++) {
                CharSequence pageTitle = viewPager.getAdapter().getPageTitle(i8);
                if (!TextUtils.isEmpty(pageTitle)) {
                    d(i8, String.valueOf(pageTitle));
                }
            }
        }
        k(this.f114343e, 0);
    }

    public final void setupTabs(@NotNull List<String> list) {
        this.f114328O = list;
        ViewPager viewPager = this.f114327N;
        if (viewPager != null) {
            setupTabs(viewPager);
        }
    }
}
