package com.bilibili.upper.module.uppercenter.view;

import SG0.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.theme.R$color;
import com.bilibili.upper.module.uppercenter.view.BiliUpperTabLayout;
import eJ0.C6931i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/BiliUpperTabLayout.class */
@StabilityInferred(parameters = 0)
public final class BiliUpperTabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public static final FastOutSlowInInterpolator f114133I = new FastOutSlowInInterpolator();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public d f114134A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f114135B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f114136C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f114137D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f114138E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f114139F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f114140G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f114141H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Function2<String, String, Unit> f114142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f114145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f114146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f114148g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f114149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f114150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f114151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f114152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f114153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f114154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f114155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f114156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f114157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f114158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f114159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f114160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f114161u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f114162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public ValueAnimator f114163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final List<a> f114164x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final c f114165y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public ViewPager f114166z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/BiliUpperTabLayout$a.class */
    public interface a {
        void a(int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/BiliUpperTabLayout$b.class */
    @StabilityInferred(parameters = 1)
    public static class b implements a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/BiliUpperTabLayout$c.class */
    public final class c extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final RectF f114167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final RectF f114168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final RectF f114169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ValueAnimator f114170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Paint f114171e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Paint f114172f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final Paint f114173g;

        @NotNull
        public final List<Rect> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public Rect[] f114174i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final BiliUpperTabLayout f114175j;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/BiliUpperTabLayout$c$a.class */
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliUpperTabLayout f114176a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f114177b;

            public a(BiliUpperTabLayout biliUpperTabLayout, int i7) {
                this.f114176a = biliUpperTabLayout;
                this.f114177b = i7;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                BiliUpperTabLayout biliUpperTabLayout = this.f114176a;
                int i7 = this.f114177b;
                biliUpperTabLayout.f114161u = i7;
                biliUpperTabLayout.c(i7);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull BiliUpperTabLayout biliUpperTabLayout, Context context) {
            super(context);
            this.f114175j = biliUpperTabLayout;
            this.f114167a = new RectF();
            this.f114168b = new RectF();
            this.f114169c = new RectF();
            this.h = new ArrayList();
            setWillNotDraw(false);
            if (biliUpperTabLayout.f114143b > 0) {
                Paint paint = new Paint(1);
                paint.setColor(biliUpperTabLayout.f114146e);
                this.f114171e = paint;
            }
            Integer numValueOf = Integer.valueOf(biliUpperTabLayout.f114159s);
            numValueOf = numValueOf.intValue() == 0 ? null : numValueOf;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                Paint paint2 = new Paint(1);
                paint2.setColor(iIntValue);
                this.f114172f = paint2;
            }
            Integer numValueOf2 = Integer.valueOf(biliUpperTabLayout.f114160t);
            Integer num = numValueOf2.intValue() != 0 ? numValueOf2 : null;
            if (num != null) {
                int iIntValue2 = num.intValue();
                Paint paint3 = new Paint(1);
                paint3.setColor(iIntValue2);
                this.f114173g = paint3;
            }
        }

        private final List<Rect> getShowRect() {
            ((ArrayList) this.h).clear();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                Rect rectB = b(i7);
                if (rectB != null) {
                    if (rectB.right <= 0 || rectB.left >= getWidth()) {
                        rectB = null;
                    }
                    if (rectB != null) {
                        ((ArrayList) this.h).add(rectB);
                    }
                }
            }
            return this.h;
        }

        public final boolean a(int i7) {
            boolean z6 = false;
            if (i7 >= 0) {
                z6 = false;
                if (i7 < getChildCount()) {
                    z6 = true;
                }
            }
            return z6;
        }

        public final Rect b(int i7) {
            if (this.f114174i == null) {
                int childCount = getChildCount();
                Rect[] rectArr = new Rect[childCount];
                for (int i8 = 0; i8 < childCount; i8++) {
                    rectArr[i8] = new Rect();
                }
                this.f114174i = rectArr;
            }
            View childAt = getChildAt(i7);
            Rect rect = null;
            if (childAt != null) {
                Rect[] rectArr2 = this.f114174i;
                rect = null;
                if (rectArr2 != null) {
                    Rect rect2 = (Rect) ArraysKt.getOrNull(rectArr2, i7);
                    rect = null;
                    if (rect2 != null) {
                        rect2.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        rect = rect2;
                    }
                }
            }
            return rect;
        }

        public final void c(float f7, int i7) {
            ValueAnimator valueAnimator;
            if (a(i7)) {
                ValueAnimator valueAnimator2 = this.f114170d;
                if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.f114170d) != null) {
                    valueAnimator.cancel();
                }
                Rect rectB = b(i7);
                if (rectB == null) {
                    return;
                }
                Rect rectB2 = b(i7 + 1);
                BLog.e("BiliUpperTabLayout", "jumpToPosition, position = " + i7 + ", " + rectB + ", " + rectB2);
                d(new RectF(rectB), rectB2, f7);
            }
        }

        public final void d(RectF rectF, Rect rect, float f7) {
            if (rect == null) {
                this.f114167a.set(rectF);
            } else {
                RectF rectF2 = this.f114167a;
                float f8 = rectF.left;
                float f9 = 1 - f7;
                rectF2.set((rect.left * f7) + (f8 * f9), rectF.top, (rect.right * f7) + (rectF.right * f9), rectF.bottom);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }

        public final void e(boolean z6, int i7, int i8) {
            if (a(i7)) {
                final RectF rectF = this.f114167a;
                final Rect rectB = b(i7);
                if (rectB == null) {
                    return;
                }
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(this, rectF, rectB) { // from class: cJ0.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BiliUpperTabLayout.c f58844a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final RectF f58845b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Rect f58846c;

                    {
                        this.f58844a = this;
                        this.f58845b = rectF;
                        this.f58846c = rectB;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f58844a.d(this.f58845b, this.f58846c, valueAnimator.getAnimatedFraction());
                    }
                };
                if (!z6) {
                    ValueAnimator valueAnimator = this.f114170d;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                    }
                    ValueAnimator valueAnimator2 = this.f114170d;
                    if (valueAnimator2 != null) {
                        valueAnimator2.addUpdateListener(animatorUpdateListener);
                        return;
                    }
                    return;
                }
                ValueAnimator valueAnimator3 = new ValueAnimator();
                BiliUpperTabLayout biliUpperTabLayout = this.f114175j;
                valueAnimator3.setInterpolator(BiliUpperTabLayout.f114133I);
                valueAnimator3.setDuration(i8);
                valueAnimator3.setFloatValues(0.0f, 1.0f);
                valueAnimator3.addUpdateListener(animatorUpdateListener);
                valueAnimator3.addListener(new a(biliUpperTabLayout, i7));
                valueAnimator3.start();
                this.f114170d = valueAnimator3;
            }
        }

        public final void f(int i7, int i8) {
            if (i8 == 0) {
                return;
            }
            View childAt = getChildAt(i7);
            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                TextViewCompat.setTextAppearance(textView, i8);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onDraw(@NotNull Canvas canvas) {
            Function2<String, String, Unit> function2 = this.f114175j.f114142a;
            if (function2 != null) {
                function2.invoke("BiliUpperTabLayout", this.f114167a.toString());
            }
            Paint paint = this.f114173g;
            if (paint != null) {
                BiliUpperTabLayout biliUpperTabLayout = this.f114175j;
                Iterator<T> it = getShowRect().iterator();
                while (it.hasNext()) {
                    this.f114169c.set((Rect) it.next());
                    if (canvas != null) {
                        RectF rectF = this.f114169c;
                        float f7 = biliUpperTabLayout.f114158r;
                        canvas.drawRoundRect(rectF, f7, f7, paint);
                    }
                }
            }
            Paint paint2 = this.f114172f;
            if (paint2 != null) {
                BiliUpperTabLayout biliUpperTabLayout2 = this.f114175j;
                if (canvas != null) {
                    RectF rectF2 = this.f114167a;
                    float f8 = biliUpperTabLayout2.f114158r;
                    canvas.drawRoundRect(rectF2, f8, f8, paint2);
                }
            }
            Paint paint3 = this.f114171e;
            if (paint3 != null) {
                BiliUpperTabLayout biliUpperTabLayout3 = this.f114175j;
                float fWidth = (this.f114167a.width() - biliUpperTabLayout3.f114143b) / 2;
                RectF rectF3 = this.f114168b;
                RectF rectF4 = this.f114167a;
                rectF3.left = rectF4.left + fWidth;
                rectF3.right = rectF4.right - fWidth;
                float f9 = rectF4.bottom;
                rectF3.top = f9 - biliUpperTabLayout3.f114144c;
                rectF3.bottom = f9;
                if (canvas != null) {
                    float f10 = biliUpperTabLayout3.f114145d;
                    canvas.drawRoundRect(rectF3, f10, f10, paint3);
                }
            }
            super.onDraw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
            super.onLayout(z6, i7, i8, i9, i10);
            ValueAnimator valueAnimator = this.f114170d;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                c(0.0f, this.f114175j.f114161u);
            } else {
                e(false, this.f114175j.f114162v, -1);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/BiliUpperTabLayout$d.class */
    public static final class d implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f114178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final WeakReference<BiliUpperTabLayout> f114179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f114180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f114181d;

        public d(@NotNull BiliUpperTabLayout biliUpperTabLayout, boolean z6) {
            this.f114178a = z6;
            this.f114179b = new WeakReference<>(biliUpperTabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
            this.f114180c = this.f114181d;
            this.f114181d = i7;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
            BiliUpperTabLayout biliUpperTabLayout;
            boolean z6 = (this.f114181d == 2 && this.f114180c == 0) ? false : true;
            if (!this.f114178a || (biliUpperTabLayout = this.f114179b.get()) == null) {
                return;
            }
            FastOutSlowInInterpolator fastOutSlowInInterpolator = BiliUpperTabLayout.f114133I;
            biliUpperTabLayout.e(i7, f7, z6);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            BiliUpperTabLayout biliUpperTabLayout = this.f114179b.get();
            if (biliUpperTabLayout == null || biliUpperTabLayout.getCurrentPosition() == i7) {
                return;
            }
            biliUpperTabLayout.d(i7, true);
        }
    }

    @JvmOverloads
    public BiliUpperTabLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public BiliUpperTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BiliUpperTabLayout(Context context, AttributeSet attributeSet, int i7) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f114142a = BiliUpperTabLayout$mLogger$1.INSTANCE;
        this.f114161u = -1;
        this.f114162v = -1;
        this.f114164x = new ArrayList();
        this.f114140G = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IE0.a.f10164d, 0, 0);
        this.f114143b = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f114144c = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, C6931i.a(context, 3.0f));
        this.f114145d = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, C6931i.a(getContext(), 1.5f));
        this.f114146e = typedArrayObtainStyledAttributes.getColor(5, ResourcesCompat.getColor(context.getResources(), R$color.Brand_pink, null));
        this.f114156p = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f114157q = typedArrayObtainStyledAttributes.getResourceId(18, 0);
        this.f114147f = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, 0);
        this.f114148g = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.f114149i = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        this.f114150j = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.f114151k = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.f114152l = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.f114153m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f114154n = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f114155o = typedArrayObtainStyledAttributes.getInteger(3, 300);
        this.f114158r = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f114159s = typedArrayObtainStyledAttributes.getColor(15, 0);
        this.f114160t = typedArrayObtainStyledAttributes.getColor(16, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f114135B = ViewConfiguration.get(context).getScaledTouchSlop();
        c cVar = new c(this, context);
        this.f114165y = cVar;
        addView(cVar, -1, -1);
        post(new i(this));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(final int i7, @NotNull List list) {
        this.f114165y.removeAllViews();
        this.f114161u = -1;
        this.f114162v = -1;
        int i8 = 0;
        for (Object obj : list) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            TextView textView = new TextView(getContext());
            textView.setText(str);
            textView.setGravity(17);
            final int i9 = i8;
            textView.setOnClickListener(new View.OnClickListener(this, i9) { // from class: cJ0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliUpperTabLayout f58839a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f58840b;

                {
                    this.f58839a = this;
                    this.f58840b = i9;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BiliUpperTabLayout biliUpperTabLayout = this.f58839a;
                    int i10 = this.f58840b;
                    FastOutSlowInInterpolator fastOutSlowInInterpolator = BiliUpperTabLayout.f114133I;
                    biliUpperTabLayout.d(i10, true);
                }
            });
            boolean z6 = i8 == 0;
            boolean z7 = i8 == ((ArrayList) list).size() - 1;
            textView.setPadding(this.f114148g, this.f114149i, this.h, this.f114150j);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            int i10 = this.f114153m;
            layoutParams.setMarginStart((i10 <= 0 || !z6) ? this.f114151k : i10);
            int i11 = this.f114154n;
            layoutParams.setMarginEnd((i11 <= 0 || !z7) ? this.f114152l : i11);
            textView.setLayoutParams(layoutParams);
            this.f114165y.addView(textView, i8);
            this.f114165y.f(i8, this.f114157q);
            i8++;
        }
        post(new Runnable(this, i7) { // from class: cJ0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliUpperTabLayout f58841a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f58842b;

            {
                this.f58841a = this;
                this.f58842b = i7;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BiliUpperTabLayout biliUpperTabLayout = this.f58841a;
                int i12 = this.f58842b;
                FastOutSlowInInterpolator fastOutSlowInInterpolator = BiliUpperTabLayout.f114133I;
                biliUpperTabLayout.d(i12, false);
            }
        });
    }

    public final int b(int i7, float f7) {
        View childAt = this.f114165y.getChildAt(i7);
        if (childAt == null) {
            return 0;
        }
        float right = 0.0f;
        if (f7 > 0.0f) {
            if (this.f114165y.getChildAt(i7 + 1) == null) {
                return 0;
            }
            right = (((r0.getRight() + r0.getLeft()) / 2) - ((childAt.getRight() + childAt.getLeft()) / 2)) * f7;
        }
        if (!this.f114139F) {
            return childAt.getLeft() < getScrollX() ? childAt.getLeft() : childAt.getRight() - getScrollX() > getWidth() ? childAt.getRight() - getWidth() : getScrollX();
        }
        int width = this.f114165y.getWidth() - getWidth();
        int right2 = (((childAt.getRight() + childAt.getLeft()) / 2) - (getWidth() / 2)) + ((int) right);
        if (right2 < 0) {
            right2 = 0;
        }
        if (right2 > width) {
            right2 = width;
        }
        return right2;
    }

    public final void c(int i7) {
        int size = ((ArrayList) this.f114164x).size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i8 = size - 1;
            ((a) ((ArrayList) this.f114164x).get(size)).getClass();
            if (i8 < 0) {
                return;
            } else {
                size = i8;
            }
        }
    }

    public final void d(int i7, boolean z6) {
        ValueAnimator valueAnimator;
        if (this.f114165y.a(i7)) {
            int i8 = this.f114162v;
            Integer numValueOf = Integer.valueOf(i8);
            if (i8 < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                this.f114165y.f(numValueOf.intValue(), this.f114157q);
                int size = ((ArrayList) this.f114164x).size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i9 = size - 1;
                        ((a) ((ArrayList) this.f114164x).get(size)).getClass();
                        if (i9 < 0) {
                            break;
                        } else {
                            size = i9;
                        }
                    }
                }
            }
            this.f114162v = i7;
            ViewPager viewPager = this.f114166z;
            if (viewPager != null) {
                viewPager.setCurrentItem(i7);
            }
            this.f114165y.f(i7, this.f114156p);
            int size2 = ((ArrayList) this.f114164x).size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i10 = size2 - 1;
                    ((a) ((ArrayList) this.f114164x).get(size2)).a(i7);
                    if (i10 < 0) {
                        break;
                    } else {
                        size2 = i10;
                    }
                }
            }
            if (!z6) {
                e(i7, 0.0f, true);
                this.f114161u = i7;
                c(i7);
                return;
            }
            if (this.f114165y.a(i7)) {
                int scrollX = getScrollX();
                int iB = b(i7, 0.0f);
                if (scrollX != iB) {
                    if (this.f114163w == null) {
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        valueAnimator2.setInterpolator(f114133I);
                        valueAnimator2.setDuration(this.f114155o);
                        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: cJ0.c

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final BiliUpperTabLayout f58843a;

                            {
                                this.f58843a = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                BiliUpperTabLayout biliUpperTabLayout = this.f58843a;
                                FastOutSlowInInterpolator fastOutSlowInInterpolator = BiliUpperTabLayout.f114133I;
                                biliUpperTabLayout.scrollTo(((Integer) valueAnimator3.getAnimatedValue()).intValue(), 0);
                            }
                        });
                        this.f114163w = valueAnimator2;
                    }
                    ValueAnimator valueAnimator3 = this.f114163w;
                    if (valueAnimator3 != null) {
                        valueAnimator3.setIntValues(scrollX, iB);
                    }
                    ValueAnimator valueAnimator4 = this.f114163w;
                    if (valueAnimator4 != null) {
                        valueAnimator4.start();
                    }
                }
                c cVar = this.f114165y;
                int i11 = this.f114155o;
                if (cVar.a(i7)) {
                    ValueAnimator valueAnimator5 = cVar.f114170d;
                    if (valueAnimator5 != null && valueAnimator5.isRunning() && (valueAnimator = cVar.f114170d) != null) {
                        valueAnimator.cancel();
                    }
                    cVar.e(true, i7, i11);
                }
            }
        }
    }

    public final void e(int i7, float f7, boolean z6) {
        ValueAnimator valueAnimator;
        if (this.f114165y.a(i7)) {
            if (z6) {
                this.f114165y.c(f7, i7);
            }
            ValueAnimator valueAnimator2 = this.f114163w;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.f114163w) != null) {
                valueAnimator.cancel();
            }
            int iB = b(i7, f7);
            if (((int) getScaleX()) != iB) {
                scrollTo(iB, 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(@org.jetbrains.annotations.Nullable androidx.viewpager.widget.ViewPager r6, int r7) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenter.view.BiliUpperTabLayout.f(androidx.viewpager.widget.ViewPager, int):void");
    }

    public final boolean getAverageLayout() {
        return this.f114141H;
    }

    public final int getCurrentPosition() {
        return this.f114162v;
    }

    public final boolean getScrollToCenter() {
        return this.f114139F;
    }

    public final boolean getScrollWithDrag() {
        return this.f114140G;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f114136C = motionEvent.getPointerId(0);
            this.f114137D = (int) (motionEvent.getX() + 0.5f);
            this.f114138E = getScrollX();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f114136C);
            if (iFindPointerIndex >= 0) {
                int x6 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int i7 = this.f114138E;
                boolean z6 = i7 != 0 || x6 - this.f114137D <= this.f114135B;
                boolean z7 = z6;
                if (i7 == this.f114165y.getWidth() - getWidth()) {
                    z7 = z6;
                    if (this.f114137D - x6 > this.f114135B) {
                        z7 = false;
                    }
                }
                boolean z8 = false;
                if (z7) {
                    z8 = false;
                    if (super.onInterceptTouchEvent(motionEvent)) {
                        z8 = true;
                    }
                }
                return z8;
            }
            Log.e("BiliUpperTabLayout", "Invalid pointerId=" + this.f114136C + " in onInterceptTouchEvent");
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.f114136C = motionEvent.getPointerId(actionIndex);
            this.f114137D = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f114138E = getScrollX();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setAverageLayout(boolean z6) {
        this.f114141H = z6;
    }

    public final void setScrollToCenter(boolean z6) {
        this.f114139F = z6;
    }

    public final void setScrollWithDrag(boolean z6) {
        this.f114140G = z6;
    }
}
