package com.bilibili.music.podcast.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.content.ContextCompat;
import androidx.core.view.InterfaceC4572p;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLMobileHumanActionNative;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicViewPager2LoadView.class */
public final class MusicViewPager2LoadView extends ViewGroup implements InterfaceC4572p, NestedScrollingParent {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f67136s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NestedScrollingParentHelper f67137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public View f67138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public b f67139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public c f67140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f67141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f67142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f67143g;

    @NotNull
    public final Paint h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Paint f67144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f67145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final int[] f67146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f67147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f67148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public ValueAnimator f67149n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final e f67150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public i f67151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f67152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f67153r;

    public MusicViewPager2LoadView(@NotNull Context context) {
        this(context, null);
    }

    public MusicViewPager2LoadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f67137a = new NestedScrollingParentHelper(this);
        this.f67146k = new int[2];
        this.f67150o = new e();
        this.f67152q = true;
        this.f67153r = true;
        this.f67141e = context.getResources().getDimensionPixelSize(2131166735);
        this.f67142f = context.getResources().getDimensionPixelSize(2131166734);
        int color = ContextCompat.getColor(context, R$color.Ga10_u);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.h = paint;
        int color2 = ContextCompat.getColor(context, R$color.Ga10_u);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(color2);
        paint2.setStyle(style);
        this.f67144i = paint2;
        this.f67148m = context.getResources().getDisplayMetrics().heightPixels;
    }

    public final void a(int i7, boolean z6, boolean z7) {
        if (this.f67145j != i7) {
            ValueAnimator valueAnimator = this.f67149n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f67149n.cancel();
                this.f67149n = null;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f67145j, i7);
            this.f67149n = valueAnimatorOfInt;
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.setDuration(300L);
            }
            ValueAnimator valueAnimator2 = this.f67149n;
            if (valueAnimator2 != null) {
                valueAnimator2.setInterpolator(this.f67150o);
            }
            ValueAnimator valueAnimator3 = this.f67149n;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new u(this, z6, z7));
            }
            ValueAnimator valueAnimator4 = this.f67149n;
            if (valueAnimator4 != null) {
                valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.music.podcast.view.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MusicViewPager2LoadView f67324a;

                    {
                        this.f67324a = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        MusicViewPager2LoadView musicViewPager2LoadView = this.f67324a;
                        int i8 = MusicViewPager2LoadView.f67136s;
                        musicViewPager2LoadView.b(((Integer) valueAnimator5.getAnimatedValue()).intValue());
                    }
                });
            }
            ValueAnimator valueAnimator5 = this.f67149n;
            if (valueAnimator5 != null) {
                valueAnimator5.start();
            }
        }
    }

    public final void b(int i7) {
        c cVar;
        View view;
        b bVar;
        if (i7 > 0) {
            int i8 = this.f67142f;
            if (i7 >= i8) {
                int i9 = this.f67143g;
                int iMax = Math.max((this.f67148m * 4) / 3, getHeight());
                int i10 = this.f67142f;
                float fMax = Math.max(0.0f, (i7 - i10) * 0.5f);
                double d7 = i9 - i8;
                double d8 = 1;
                double d9 = -fMax;
                double d10 = iMax - i10;
                double d11 = d10;
                if (d10 == 0.0d) {
                    d11 = 1.0d;
                }
                i7 = ((int) Math.min((d8 - Math.pow(100.0d, d9 / d11)) * d7, fMax)) + this.f67142f;
            }
        } else {
            int i11 = this.f67141e;
            if (i7 <= (-i11)) {
                int i12 = this.f67143g;
                int iMax2 = Math.max((this.f67148m * 4) / 3, getHeight());
                int i13 = this.f67141e;
                float f7 = -Math.min(0.0f, (i7 + i13) * 0.5f);
                double d12 = i12 - i11;
                double d13 = 1;
                double d14 = -f7;
                double d15 = iMax2 - i13;
                double d16 = d15;
                if (d15 == 0.0d) {
                    d16 = 1.0d;
                }
                i7 = ((int) (-Math.min((d13 - Math.pow(100.0d, d14 / d16)) * d12, f7))) - this.f67141e;
            }
        }
        int i14 = this.f67145j;
        this.f67145j = i7;
        View view2 = this.f67138b;
        if (view2 != null) {
            view2.setTranslationY(i7);
        }
        if (this.f67145j < 0 && (bVar = this.f67139c) != null) {
            bVar.b();
        }
        if ((this.f67145j > 0 || i14 > 0) && (cVar = this.f67140d) != null && (view = cVar.getView()) != null) {
            view.setTranslationY(this.f67145j);
        }
        if (i14 != i7) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(@NotNull Canvas canvas, @NotNull View view, long j7) {
        View view2 = this.f67138b;
        c cVar = this.f67140d;
        if (cVar != null && Intrinsics.areEqual(cVar.getView(), view) && view2 != null) {
            int iMax = Math.max(view2.getPaddingTop() + view2.getTop() + this.f67145j, view.getTop());
            canvas.drawRect(getPaddingLeft(), view.getTop(), getWidth(), iMax, this.f67144i);
            canvas.save();
            canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
            boolean zDrawChild = super.drawChild(canvas, view, j7);
            canvas.restore();
            return zDrawChild;
        }
        b bVar = this.f67139c;
        if (bVar == null || !Intrinsics.areEqual(bVar.getView(), view) || view2 == null) {
            return super.drawChild(canvas, view, j7);
        }
        int iCoerceAtMost = RangesKt.coerceAtMost((view2.getBottom() - view2.getPaddingBottom()) + this.f67145j, view.getBottom());
        canvas.drawRect(getPaddingLeft(), iCoerceAtMost, getWidth(), view.getBottom(), this.h);
        canvas.save();
        canvas.clipRect(view.getLeft(), iCoerceAtMost, view.getRight(), view.getBottom());
        boolean zDrawChild2 = super.drawChild(canvas, view, j7);
        canvas.restore();
        return zDrawChild2;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return super.getNestedScrollAxes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof ViewPager2) || (childAt instanceof RecyclerView)) {
                this.f67138b = childAt;
            } else if (childAt instanceof b) {
                this.f67139c = (b) childAt;
            } else if (childAt instanceof c) {
                c cVar = (c) childAt;
                cVar.setThemeColor(ContextCompat.getColor(getContext(), R$color.Wh0_u));
                this.f67140d = cVar;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        View view = this.f67138b;
        int measuredHeight2 = 0;
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        View view2 = this.f67138b;
        if (view2 != null) {
            measuredHeight2 = view2.getMeasuredHeight();
        }
        View view3 = this.f67138b;
        if (view3 != null) {
            view3.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight2 + paddingTop);
        }
        c cVar = this.f67140d;
        View view4 = cVar != null ? cVar.getView() : null;
        if (view4 != null) {
            int measuredWidth2 = view4.getMeasuredWidth();
            int measuredHeight3 = view4.getMeasuredHeight();
            int i11 = -this.f67142f;
            view4.layout(paddingLeft, i11, measuredWidth2 + paddingLeft, measuredHeight3 + i11);
        }
        b bVar = this.f67139c;
        View view5 = null;
        if (bVar != null) {
            view5 = bVar.getView();
        }
        if (view5 != null) {
            view5.layout(paddingLeft, measuredHeight - this.f67141e, view5.getMeasuredWidth() + paddingLeft, measuredHeight);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        View view;
        View view2;
        super.onMeasure(i7, i8);
        if (this.f67143g <= 0) {
            this.f67143g = getMeasuredHeight();
        }
        View view3 = this.f67138b;
        if (view3 != null) {
            view3.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingBottom()) - getPaddingTop(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
        }
        c cVar = this.f67140d;
        if (cVar != null && (view2 = cVar.getView()) != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(this.f67142f, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
        }
        b bVar = this.f67139c;
        if (bVar == null || (view = bVar.getView()) == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(this.f67141e, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedPreScroll(@NotNull View view, int i7, int i8, @NotNull int[] iArr) {
        int i9 = 0;
        if (this.f67147l * i8 > 0) {
            if (Math.abs(i8) > Math.abs(this.f67147l)) {
                i8 = this.f67147l;
                this.f67147l = 0;
            } else {
                this.f67147l -= i8;
            }
            b(this.f67147l);
            i9 = i8;
        }
        iArr[1] = iArr[1] + i9;
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedPreScroll(@NotNull View view, int i7, int i8, @NotNull int[] iArr, int i9) {
        if (i9 != 0) {
            return;
        }
        onNestedPreScroll(view, i7, i8, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScroll(@NotNull View view, int i7, int i8, int i9, int i10) {
        int i11 = i10 + this.f67146k[1];
        if ((i11 <= 0 || view.canScrollVertically(1) || !this.f67153r) && (i11 >= 0 || view.canScrollVertically(-1) || !this.f67152q)) {
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        int i12 = this.f67147l - i11;
        this.f67147l = i12;
        b(i12);
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedScroll(@NotNull View view, int i7, int i8, int i9, int i10, int i11) {
        if (i11 != 0) {
            return;
        }
        onNestedScroll(view, i7, i8, i9, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i7) {
        this.f67137a.onNestedScrollAccepted(view, view2, i7);
        ValueAnimator valueAnimator = this.f67149n;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f67149n.cancel();
            this.f67149n = null;
        }
        this.f67147l = this.f67145j;
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i7) {
        return isEnabled() && getVisibility() == 0 && (i7 & 2) != 0;
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i7, int i8) {
        if (i8 == 0) {
            return onStartNestedScroll(view, view2, i7);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onStopNestedScroll(@NotNull View view) {
        this.f67137a.onStopNestedScroll(view);
        this.f67147l = 0;
        int i7 = this.f67145j;
        if (i7 > 0) {
            if (i7 > this.f67142f) {
                a(0, true, true);
                return;
            } else {
                a(0, false, true);
                return;
            }
        }
        int i8 = -this.f67141e;
        if (i7 < i8) {
            a(i8, true, false);
        } else {
            a(0, false, true);
        }
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onStopNestedScroll(@NotNull View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void setEnableLoadMore(boolean z6) {
        this.f67153r = z6;
    }

    public final void setEnableRefresh(boolean z6) {
        this.f67152q = z6;
    }

    public final void setListener(@Nullable i iVar) {
        this.f67151p = iVar;
    }
}
