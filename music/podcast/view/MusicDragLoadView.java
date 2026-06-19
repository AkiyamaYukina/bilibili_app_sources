package com.bilibili.music.podcast.view;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.content.ContextCompat;
import androidx.core.view.InterfaceC4572p;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLMobileHumanActionNative;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicDragLoadView.class */
public final class MusicDragLoadView extends ViewGroup implements InterfaceC4572p, NestedScrollingParent {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f67063q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NestedScrollingParentHelper f67064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f67068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public RecyclerView f67069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final int[] f67070g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public i f67071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ValueAnimator f67072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final e f67073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public c f67074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f67075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f67076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f67077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Paint f67078p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicDragLoadView$a.class */
    public static final class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicDragLoadView f67079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f67080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f67081c;

        public a(MusicDragLoadView musicDragLoadView, boolean z6, boolean z7) {
            this.f67079a = musicDragLoadView;
            this.f67080b = z6;
            this.f67081c = z7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            c cVar;
            MusicDragLoadView musicDragLoadView = this.f67079a;
            musicDragLoadView.f67072j = null;
            if (musicDragLoadView.f67067d == 0 && (cVar = musicDragLoadView.f67074l) != null) {
                cVar.setRefreshState(false);
            }
            if (this.f67080b) {
                if (!this.f67081c) {
                    i iVar = this.f67079a.f67071i;
                    if (iVar != null) {
                        iVar.b();
                        return;
                    }
                    return;
                }
                c cVar2 = this.f67079a.f67074l;
                if (cVar2 != null) {
                    cVar2.setRefreshState(true);
                }
                i iVar2 = this.f67079a.f67071i;
                if (iVar2 != null) {
                    iVar2.a();
                }
            }
        }
    }

    public MusicDragLoadView(@NotNull Context context) {
        this(context, null);
    }

    public MusicDragLoadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f67064a = new NestedScrollingParentHelper(this);
        this.f67070g = new int[2];
        this.f67073k = new e();
        this.f67076n = true;
        this.f67077o = true;
        this.f67075m = context.getResources().getDimensionPixelSize(2131166705);
        this.f67066c = context.getResources().getDisplayMetrics().heightPixels;
        this.h = (int) DpUtils.dp2px(context, 16.0f);
        int color = ContextCompat.getColor(context, R.color.transparent);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        this.f67078p = paint;
    }

    public final void a(int i7, boolean z6, boolean z7) {
        if (this.f67067d != i7) {
            ValueAnimator valueAnimator = this.f67072j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f67072j.cancel();
                this.f67072j = null;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f67067d, i7);
            this.f67072j = valueAnimatorOfInt;
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.setDuration(300L);
            }
            ValueAnimator valueAnimator2 = this.f67072j;
            if (valueAnimator2 != null) {
                valueAnimator2.setInterpolator(this.f67073k);
            }
            ValueAnimator valueAnimator3 = this.f67072j;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new a(this, z6, z7));
            }
            ValueAnimator valueAnimator4 = this.f67072j;
            if (valueAnimator4 != null) {
                valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.music.podcast.view.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MusicDragLoadView f67236a;

                    {
                        this.f67236a = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        MusicDragLoadView musicDragLoadView = this.f67236a;
                        int i8 = MusicDragLoadView.f67063q;
                        musicDragLoadView.b(((Integer) valueAnimator5.getAnimatedValue()).intValue());
                    }
                });
            }
            ValueAnimator valueAnimator5 = this.f67072j;
            if (valueAnimator5 != null) {
                valueAnimator5.start();
            }
        }
    }

    public final void b(int i7) {
        View view;
        if (i7 > 0) {
            int i8 = this.f67075m;
            if (i7 >= i8) {
                int i9 = this.f67068e;
                int iMax = Math.max((this.f67066c * 4) / 3, getHeight());
                int i10 = this.f67075m;
                float fMax = Math.max(0.0f, (i7 - i10) * 0.5f);
                double d7 = i9 - i8;
                double d8 = 1;
                double d9 = -fMax;
                double d10 = iMax - i10;
                double d11 = d10;
                if (d10 == 0.0d) {
                    d11 = 1.0d;
                }
                i7 = ((int) Math.min((d8 - Math.pow(100.0d, d9 / d11)) * d7, fMax)) + this.f67075m;
            }
        } else {
            int i11 = this.f67068e;
            int iMax2 = Math.max((this.f67066c * 4) / 3, getHeight());
            float f7 = -Math.min(0.0f, i7 * 0.5f);
            double d12 = i11;
            double d13 = 1;
            double d14 = -f7;
            double d15 = iMax2;
            double d16 = d15;
            if (d15 == 0.0d) {
                d16 = 1.0d;
            }
            i7 = (int) (-Math.min((d13 - Math.pow(100.0d, d14 / d16)) * d12, f7));
        }
        int i12 = this.f67067d;
        this.f67067d = i7;
        RecyclerView recyclerView = this.f67069f;
        if (recyclerView != null) {
            recyclerView.setTranslationY(i7);
        }
        if (this.f67067d > 0 || i12 > 0) {
            c cVar = this.f67074l;
            if (cVar != null && (view = cVar.getView()) != null) {
                view.setTranslationY(this.f67067d);
            }
            if (i12 != i7) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(@NotNull Canvas canvas, @NotNull View view, long j7) {
        RecyclerView recyclerView = this.f67069f;
        c cVar = this.f67074l;
        if (cVar == null || !Intrinsics.areEqual(cVar.getView(), view) || recyclerView == null) {
            return super.drawChild(canvas, view, j7);
        }
        int iMax = Math.max(recyclerView.getPaddingTop() + recyclerView.getTop() + this.f67067d, view.getTop());
        canvas.drawRect(getPaddingLeft(), view.getTop(), getWidth(), iMax, this.f67078p);
        canvas.save();
        canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
        boolean zDrawChild = super.drawChild(canvas, view, j7);
        canvas.restore();
        return zDrawChild;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return super.getNestedScrollAxes();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            KeyEvent.Callback childAt = getChildAt(i7);
            if (childAt instanceof RecyclerView) {
                this.f67069f = (RecyclerView) childAt;
            } else if (childAt instanceof c) {
                c cVar = (c) childAt;
                cVar.setThemeColor(ContextCompat.getColor(getContext(), R$color.Ga5));
                this.f67074l = cVar;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RecyclerView recyclerView = this.f67069f;
        int measuredHeight = 0;
        int measuredWidth = recyclerView != null ? recyclerView.getMeasuredWidth() : 0;
        RecyclerView recyclerView2 = this.f67069f;
        if (recyclerView2 != null) {
            measuredHeight = recyclerView2.getMeasuredHeight();
        }
        RecyclerView recyclerView3 = this.f67069f;
        if (recyclerView3 != null) {
            recyclerView3.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
        }
        c cVar = this.f67074l;
        View view = cVar != null ? cVar.getView() : null;
        if (view != null) {
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            int i11 = -this.f67075m;
            view.layout(paddingLeft, i11, measuredWidth2 + paddingLeft, measuredHeight2 + i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        View view;
        super.onMeasure(i7, i8);
        if (this.f67068e <= 0) {
            this.f67068e = getMeasuredHeight();
        }
        RecyclerView recyclerView = this.f67069f;
        if (recyclerView != null) {
            recyclerView.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingBottom()) - getPaddingTop(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
        }
        c cVar = this.f67074l;
        if (cVar == null || (view = cVar.getView()) == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(this.f67075m, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedPreScroll(@NotNull View view, int i7, int i8, @NotNull int[] iArr) {
        int i9 = 0;
        if (this.f67065b * i8 > 0) {
            if (Math.abs(i8) > Math.abs(this.f67065b)) {
                i8 = this.f67065b;
                this.f67065b = 0;
            } else {
                this.f67065b -= i8;
            }
            b(this.f67065b);
            i9 = i8;
        }
        iArr[1] = iArr[1] + i9;
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedPreScroll(@NotNull View view, int i7, int i8, @NotNull int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScroll(@NotNull View view, int i7, int i8, int i9, int i10) {
        int i11 = i10 + this.f67070g[1];
        if ((i11 <= 0 || view.canScrollVertically(1) || !this.f67077o) && (i11 >= 0 || view.canScrollVertically(-1) || !this.f67076n)) {
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        int i12 = this.f67065b - i11;
        this.f67065b = i12;
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
        this.f67065b = this.f67067d;
        this.f67064a.onNestedScrollAccepted(view, view2, i7);
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i7) {
        return (i7 & 2) != 0;
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
        this.f67065b = 0;
        this.f67064a.onStopNestedScroll(view);
        int i7 = this.f67067d;
        if (i7 <= 0) {
            if (i7 < (-this.h)) {
                a(0, true, false);
                return;
            } else {
                a(0, false, true);
                return;
            }
        }
        int i8 = this.f67075m;
        if (i7 > i8) {
            a(i8, true, true);
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
        this.f67077o = z6;
    }

    public final void setEnableRefresh(boolean z6) {
        this.f67076n = z6;
    }

    public final void setListener(@Nullable i iVar) {
        this.f67071i = iVar;
    }
}
