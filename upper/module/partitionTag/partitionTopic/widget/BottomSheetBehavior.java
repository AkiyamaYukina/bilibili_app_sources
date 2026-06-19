package com.bilibili.upper.module.partitionTag.partitionTopic.widget;

import K7.L;
import S9.r;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.C3259x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.a;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/BottomSheetBehavior.class */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f113824K = R.style.Widget_Design_BottomSheet_Modal;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f113825A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public WeakReference<V> f113826B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f113827C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NonNull
    public final ArrayList<e> f113828D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public VelocityTracker f113829E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f113830F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f113831G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f113832H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public Map<View, Integer> f113833I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final c f113834J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f113836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f113837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f113839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f113841g;
    public MaterialShapeDrawable h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ShapeAppearanceModel f113842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f113843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BottomSheetBehavior<V>.f f113844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ValueAnimator f113845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f113846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f113847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f113848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f113849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f113850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f113851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f113852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f113853t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f113854u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public ViewDragHelper f113855v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f113856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f113857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f113858y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f113859z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/BottomSheetBehavior$SavedState.class */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f113860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f113861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f113862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f113863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f113864e;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/BottomSheetBehavior$SavedState$a.class */
        public final class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f113860a = parcel.readInt();
            this.f113861b = parcel.readInt();
            this.f113862c = parcel.readInt() == 1;
            this.f113863d = parcel.readInt() == 1;
            this.f113864e = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f113860a = bottomSheetBehavior.f113854u;
            this.f113861b = bottomSheetBehavior.f113838d;
            this.f113862c = bottomSheetBehavior.f113836b;
            this.f113863d = bottomSheetBehavior.f113852s;
            this.f113864e = bottomSheetBehavior.f113853t;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f113860a);
            parcel.writeInt(this.f113861b);
            parcel.writeInt(this.f113862c ? 1 : 0);
            parcel.writeInt(this.f113863d ? 1 : 0);
            parcel.writeInt(this.f113864e ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/BottomSheetBehavior$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f113865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f113866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BottomSheetBehavior f113867c;

        public a(BottomSheetBehavior bottomSheetBehavior, View view, int i7) {
            this.f113867c = bottomSheetBehavior;
            this.f113865a = view;
            this.f113866b = i7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f113867c.settleToState(this.f113865a, this.f113866b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/BottomSheetBehavior$b.class */
    public final class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomSheetBehavior f113868a;

        public b(BottomSheetBehavior bottomSheetBehavior) {
            this.f113868a = bottomSheetBehavior;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MaterialShapeDrawable materialShapeDrawable = this.f113868a.h;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setInterpolation(fFloatValue);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/BottomSheetBehavior$c.class */
    public final class c extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomSheetBehavior f113869a;

        public c(BottomSheetBehavior bottomSheetBehavior) {
            this.f113869a = bottomSheetBehavior;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(@NonNull View view, int i7, int i8) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(@NonNull View view, int i7, int i8) {
            BottomSheetBehavior bottomSheetBehavior = this.f113869a;
            return MathUtils.clamp(i7, bottomSheetBehavior.getExpandedOffset(), bottomSheetBehavior.f113852s ? bottomSheetBehavior.f113825A : bottomSheetBehavior.f113850q);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewVerticalDragRange(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = this.f113869a;
            return bottomSheetBehavior.f113852s ? bottomSheetBehavior.f113825A : bottomSheetBehavior.f113850q;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i7) {
            if (i7 == 1) {
                this.f113869a.setStateInternal(1);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(@NonNull View view, int i7, int i8, int i9, int i10) {
            this.f113869a.dispatchOnSlide(i8);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(@NonNull View view, float f7, float f8) {
            int i7;
            int i8 = 6;
            BottomSheetBehavior bottomSheetBehavior = this.f113869a;
            if (f8 < 0.0f) {
                if (bottomSheetBehavior.f113836b) {
                    i7 = bottomSheetBehavior.f113847n;
                } else {
                    int top = view.getTop();
                    i7 = bottomSheetBehavior.f113848o;
                    if (top <= i7) {
                        i7 = bottomSheetBehavior.f113846m;
                    }
                }
                i8 = 3;
            } else if (bottomSheetBehavior.f113852s && bottomSheetBehavior.shouldHide(view, f8) && (view.getTop() > bottomSheetBehavior.f113850q || Math.abs(f7) < Math.abs(f8))) {
                i7 = bottomSheetBehavior.f113825A;
                i8 = 5;
            } else if (f8 == 0.0f || Math.abs(f7) > Math.abs(f8)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.f113836b) {
                    int i9 = bottomSheetBehavior.f113848o;
                    if (top2 < i9) {
                        if (top2 < Math.abs(top2 - bottomSheetBehavior.f113850q)) {
                            i7 = bottomSheetBehavior.f113846m;
                            i8 = 3;
                        } else {
                            i7 = bottomSheetBehavior.f113848o;
                        }
                    } else if (Math.abs(top2 - i9) < Math.abs(top2 - bottomSheetBehavior.f113850q)) {
                        i7 = bottomSheetBehavior.f113848o;
                    } else {
                        i7 = bottomSheetBehavior.f113850q;
                        i8 = 4;
                    }
                } else if (Math.abs(top2 - bottomSheetBehavior.f113847n) < Math.abs(top2 - bottomSheetBehavior.f113850q)) {
                    i7 = bottomSheetBehavior.f113847n;
                    i8 = 3;
                } else {
                    i7 = bottomSheetBehavior.f113850q;
                    i8 = 4;
                }
            } else {
                if (bottomSheetBehavior.f113836b) {
                    i7 = bottomSheetBehavior.f113850q;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f113848o) < Math.abs(top3 - bottomSheetBehavior.f113850q)) {
                        i7 = bottomSheetBehavior.f113848o;
                    } else {
                        i7 = bottomSheetBehavior.f113850q;
                    }
                }
                i8 = 4;
            }
            bottomSheetBehavior.startSettlingAnimation(view, i8, i7, true);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(@NonNull View view, int i7) {
            BottomSheetBehavior bottomSheetBehavior = this.f113869a;
            int i8 = bottomSheetBehavior.f113854u;
            if (i8 == 1 || bottomSheetBehavior.f113832H) {
                return false;
            }
            if (i8 == 3 && bottomSheetBehavior.f113830F == i7) {
                WeakReference<View> weakReference = bottomSheetBehavior.f113827C;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = bottomSheetBehavior.f113826B;
            boolean z6 = false;
            if (weakReference2 != null) {
                z6 = false;
                if (weakReference2.get() == view) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/BottomSheetBehavior$d.class */
    public final class d implements androidx.core.view.accessibility.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f113870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BottomSheetBehavior f113871b;

        public d(BottomSheetBehavior bottomSheetBehavior, int i7) {
            this.f113871b = bottomSheetBehavior;
            this.f113870a = i7;
        }

        @Override // androidx.core.view.accessibility.a
        public final boolean perform(@NonNull View view, @Nullable a.AbstractC0233a abstractC0233a) {
            this.f113871b.setState(this.f113870a);
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/BottomSheetBehavior$e.class */
    public static abstract class e {
        public abstract void a();

        public abstract void b();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/BottomSheetBehavior$f.class */
    public final class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f113872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f113873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f113874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BottomSheetBehavior f113875d;

        public f(BottomSheetBehavior bottomSheetBehavior, View view, int i7) {
            this.f113875d = bottomSheetBehavior;
            this.f113872a = view;
            this.f113874c = i7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewDragHelper viewDragHelper = this.f113875d.f113855v;
            if (viewDragHelper == null || !viewDragHelper.continueSettling(true)) {
                this.f113875d.setStateInternal(this.f113874c);
            } else {
                ViewCompat.postOnAnimation(this.f113872a, this);
            }
            this.f113873b = false;
        }
    }

    public BottomSheetBehavior() {
        this.f113835a = 0;
        this.f113836b = true;
        this.f113844k = null;
        this.f113849p = 0.5f;
        this.f113851r = -1.0f;
        this.f113854u = 4;
        this.f113828D = new ArrayList<>();
        this.f113834J = new c(this);
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i7;
        super(context, attributeSet);
        this.f113835a = 0;
        this.f113836b = true;
        this.f113844k = null;
        this.f113849p = 0.5f;
        this.f113851r = -1.0f;
        this.f113854u = 4;
        this.f113828D = new ArrayList<>();
        this.f113834J = new c(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        this.f113841g = typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        if (zHasValue) {
            createMaterialShapeDrawable(context, attributeSet, zHasValue, MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            createMaterialShapeDrawable(context, attributeSet, zHasValue);
        }
        createShapeValueAnimator();
        this.f113851r = typedArrayObtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue == null || (i7 = typedValuePeekValue.data) != -1) {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            setPeekHeight(i7);
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        setExpandedOffset(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        typedArrayObtainStyledAttributes.recycle();
        this.f113837c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void addAccessibilityActionForState(V v7, AccessibilityNodeInfoCompat.a aVar, int i7) {
        ViewCompat.replaceAccessibilityAction(v7, aVar, null, new d(this, i7));
    }

    private void calculateCollapsedOffset() {
        int iMax = this.f113839e ? Math.max(this.f113840f, this.f113825A - ((this.f113859z * 9) / 16)) : this.f113838d;
        if (this.f113836b) {
            this.f113850q = Math.max(this.f113825A - iMax, this.f113847n);
        } else {
            this.f113850q = this.f113825A - iMax;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.f113848o = (int) ((1.0f - this.f113849p) * this.f113825A);
    }

    private void createMaterialShapeDrawable(@NonNull Context context, AttributeSet attributeSet, boolean z6) {
        createMaterialShapeDrawable(context, attributeSet, z6, null);
    }

    private void createMaterialShapeDrawable(@NonNull Context context, AttributeSet attributeSet, boolean z6, @Nullable ColorStateList colorStateList) {
        if (this.f113841g) {
            this.f113842i = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, f113824K).build();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f113842i);
            this.h = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            if (z6 && colorStateList != null) {
                this.h.setFillColor(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.h.setTint(typedValue.data);
        }
    }

    private void createShapeValueAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f113845l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f113845l.addUpdateListener(new b(this));
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v7) {
        ViewGroup.LayoutParams layoutParams = v7.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExpandedOffset() {
        return this.f113836b ? this.f113847n : this.f113846m;
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.f113829E;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f113837c);
        return this.f113829E.getYVelocity(this.f113830F);
    }

    private void reset() {
        this.f113830F = -1;
        VelocityTracker velocityTracker = this.f113829E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f113829E = null;
        }
    }

    private void restoreOptionalState(@NonNull SavedState savedState) {
        int i7 = this.f113835a;
        if (i7 == 0) {
            return;
        }
        if (i7 == -1 || (i7 & 1) == 1) {
            this.f113838d = savedState.f113861b;
        }
        if (i7 == -1 || (i7 & 2) == 2) {
            this.f113836b = savedState.f113862c;
        }
        if (i7 == -1 || (i7 & 4) == 4) {
            this.f113852s = savedState.f113863d;
        }
        if (i7 == -1 || (i7 & 8) == 8) {
            this.f113853t = savedState.f113864e;
        }
    }

    private void settleToStatePendingLayout(int i7) {
        V v7 = this.f113826B.get();
        if (v7 == null) {
            return;
        }
        ViewParent parent = v7.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v7)) {
            v7.post(new a(this, v7, i7));
        } else {
            settleToState(v7, i7);
        }
    }

    private void updateAccessibilityActions() {
        V v7;
        WeakReference<V> weakReference = this.f113826B;
        if (weakReference == null || (v7 = weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(v7, AccessibilityNodeInfoCompat.ACTION_COLLAPSE);
        ViewCompat.removeAccessibilityAction(v7, 262144);
        ViewCompat.removeAccessibilityAction(v7, AccessibilityNodeInfoCompat.ACTION_DISMISS);
        if (this.f113852s && this.f113854u != 5) {
            addAccessibilityActionForState(v7, AccessibilityNodeInfoCompat.a.f47432n, 5);
        }
        int i7 = this.f113854u;
        int i8 = 6;
        if (i7 == 3) {
            if (this.f113836b) {
                i8 = 4;
            }
            addAccessibilityActionForState(v7, AccessibilityNodeInfoCompat.a.f47431m, i8);
        } else if (i7 == 4) {
            if (this.f113836b) {
                i8 = 3;
            }
            addAccessibilityActionForState(v7, AccessibilityNodeInfoCompat.a.f47430l, i8);
        } else {
            if (i7 != 6) {
                return;
            }
            addAccessibilityActionForState(v7, AccessibilityNodeInfoCompat.a.f47431m, 4);
            addAccessibilityActionForState(v7, AccessibilityNodeInfoCompat.a.f47430l, 3);
        }
    }

    private void updateDrawableForTargetState(int i7) {
        ValueAnimator valueAnimator;
        if (i7 == 2) {
            return;
        }
        boolean z6 = i7 == 3;
        if (this.f113843j != z6) {
            this.f113843j = z6;
            if (this.h == null || (valueAnimator = this.f113845l) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f113845l.reverse();
                return;
            }
            float f7 = z6 ? 0.0f : 1.0f;
            this.f113845l.setFloatValues(1.0f - f7, f7);
            this.f113845l.start();
        }
    }

    private void updateImportantForAccessibility(boolean z6) {
        WeakReference<V> weakReference = this.f113826B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                if (this.f113833I != null) {
                    return;
                } else {
                    this.f113833I = new HashMap(childCount);
                }
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (childAt != this.f113826B.get()) {
                    if (z6) {
                        this.f113833I.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        ViewCompat.setImportantForAccessibility(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f113833I;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.setImportantForAccessibility(childAt, this.f113833I.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z6) {
                return;
            }
            this.f113833I = null;
        }
    }

    public void addBottomSheetCallback(@NonNull e eVar) {
        if (this.f113828D.contains(eVar)) {
            return;
        }
        this.f113828D.add(eVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void disableShapeAnimations() {
        this.f113845l = null;
    }

    public void dispatchOnSlide(int i7) {
        if (this.f113826B.get() == null || this.f113828D.isEmpty()) {
            return;
        }
        if (i7 <= this.f113850q) {
            getExpandedOffset();
        }
        for (int i8 = 0; i8 < this.f113828D.size(); i8++) {
            this.f113828D.get(i8).a();
        }
    }

    @Nullable
    @VisibleForTesting
    public View findScrollingChild(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i7));
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getHalfExpandedRatio() {
        return this.f113849p;
    }

    public int getPeekHeight() {
        return this.f113839e ? -1 : this.f113838d;
    }

    @VisibleForTesting
    public int getPeekHeightMin() {
        return this.f113840f;
    }

    public int getSaveFlags() {
        return this.f113835a;
    }

    public boolean getSkipCollapsed() {
        return this.f113853t;
    }

    public int getState() {
        return this.f113854u;
    }

    public boolean isFitToContents() {
        return this.f113836b;
    }

    public boolean isHideable() {
        return this.f113852s;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f113826B = null;
        this.f113855v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f113826B = null;
        this.f113855v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v7, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!v7.isShown()) {
            this.f113856w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.f113829E == null) {
            this.f113829E = VelocityTracker.obtain();
        }
        this.f113829E.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x6 = (int) motionEvent.getX();
            this.f113831G = (int) motionEvent.getY();
            if (this.f113854u != 2) {
                WeakReference<View> weakReference = this.f113827C;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x6, this.f113831G)) {
                    this.f113830F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f113832H = true;
                }
            }
            this.f113856w = this.f113830F == -1 && !coordinatorLayout.isPointInChildBounds(v7, x6, this.f113831G);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f113832H = false;
            this.f113830F = -1;
            if (this.f113856w) {
                this.f113856w = false;
                return false;
            }
        }
        if (!this.f113856w && (viewDragHelper = this.f113855v) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            if (actionMasked == 2) {
                WeakReference<View> weakReference2 = this.f113827C;
                View view2 = null;
                if (weakReference2 != null) {
                    view2 = weakReference2.get();
                }
                if (view2 != null) {
                    BLog.i("PBottomSheetBehavior", "BottomSheetBehavior onInterceptTouchEvent  scroll != null, isPointInChildBounds : " + coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()));
                } else {
                    BLog.i("PBottomSheetBehavior", "BottomSheetBehavior onInterceptTouchEvent  scroll == null");
                }
                if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    BLog.i("PBottomSheetBehavior", "BottomSheetBehavior onInterceptTouchEvent  *** return false");
                    return false;
                }
            }
            BLog.i("PBottomSheetBehavior", "BottomSheetBehavior onInterceptTouchEvent  *** return true");
            return true;
        }
        WeakReference<View> weakReference3 = this.f113827C;
        View view3 = null;
        if (weakReference3 != null) {
            view3 = weakReference3.get();
        }
        boolean z6 = (actionMasked != 2 || view3 == null || this.f113856w || this.f113854u == 1 || coordinatorLayout.isPointInChildBounds(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f113855v == null || r.a(motionEvent, (float) this.f113831G) <= ((float) this.f113855v.getTouchSlop())) ? false : true;
        BLog.i("PBottomSheetBehavior", "BottomSheetBehavior onInterceptTouchEvent ********************************* finally return " + Boolean.valueOf(z6) + " **************************");
        StringBuilder sb = new StringBuilder("BottomSheetBehavior onInterceptTouchEvent action == MotionEvent.ACTION_MOVE : ");
        sb.append(actionMasked == 2);
        BLog.i("PBottomSheetBehavior", sb.toString());
        StringBuilder sb2 = new StringBuilder("BottomSheetBehavior onInterceptTouchEvent scroll != null : ");
        sb2.append(view3 != null);
        BLog.i("PBottomSheetBehavior", sb2.toString());
        StringBuilder sb3 = new StringBuilder("BottomSheetBehavior onInterceptTouchEvent !ignoreEvents : ");
        sb3.append(!this.f113856w);
        BLog.i("PBottomSheetBehavior", sb3.toString());
        BLog.i("PBottomSheetBehavior", "BottomSheetBehavior onInterceptTouchEvent state = : " + this.f113854u);
        BLog.i("PBottomSheetBehavior", "BottomSheetBehavior onInterceptTouchEvent parent.isPointInChildBounds(scroll, (int) event.getX(), (int) event.getY()) : " + coordinatorLayout.isPointInChildBounds(view3, (int) motionEvent.getX(), (int) motionEvent.getY()));
        StringBuilder sb4 = new StringBuilder("BottomSheetBehavior onInterceptTouchEvent viewDragHelper != null : ");
        sb4.append(this.f113855v != null);
        BLog.i("PBottomSheetBehavior", sb4.toString());
        StringBuilder sb5 = new StringBuilder("BottomSheetBehavior onInterceptTouchEvent Math.abs(initialY - event.getY()) > viewDragHelper.getTouchSlop() : ");
        boolean z7 = false;
        if (r.a(motionEvent, this.f113831G) > this.f113855v.getTouchSlop()) {
            z7 = true;
        }
        L.a(sb5, z7, "PBottomSheetBehavior");
        return z6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v7, int i7) {
        MaterialShapeDrawable materialShapeDrawable;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v7)) {
            v7.setFitsSystemWindows(true);
        }
        if (this.f113826B == null) {
            this.f113840f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            this.f113826B = new WeakReference<>(v7);
            if (this.f113841g && (materialShapeDrawable = this.h) != null) {
                ViewCompat.setBackground(v7, materialShapeDrawable);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.h;
            if (materialShapeDrawable2 != null) {
                float f7 = this.f113851r;
                float elevation = f7;
                if (f7 == -1.0f) {
                    elevation = ViewCompat.getElevation(v7);
                }
                materialShapeDrawable2.setElevation(elevation);
                boolean z6 = this.f113854u == 3;
                this.f113843j = z6;
                this.h.setInterpolation(z6 ? 0.0f : 1.0f);
            }
            updateAccessibilityActions();
            if (ViewCompat.getImportantForAccessibility(v7) == 0) {
                ViewCompat.setImportantForAccessibility(v7, 1);
            }
        }
        if (this.f113855v == null) {
            this.f113855v = ViewDragHelper.create(coordinatorLayout, this.f113834J);
        }
        int top = v7.getTop();
        coordinatorLayout.onLayoutChild(v7, i7);
        this.f113859z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f113825A = height;
        this.f113847n = Math.max(0, height - v7.getHeight());
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i8 = this.f113854u;
        if (i8 == 3) {
            ViewCompat.offsetTopAndBottom(v7, getExpandedOffset());
        } else if (i8 == 6) {
            ViewCompat.offsetTopAndBottom(v7, this.f113848o);
        } else if (this.f113852s && i8 == 5) {
            ViewCompat.offsetTopAndBottom(v7, this.f113825A);
        } else if (i8 == 4) {
            ViewCompat.offsetTopAndBottom(v7, this.f113850q);
        } else if (i8 == 1 || i8 == 2) {
            ViewCompat.offsetTopAndBottom(v7, top - v7.getTop());
        }
        this.f113827C = new WeakReference<>(findScrollingChild(v7));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onNestedPreFling(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r8, @androidx.annotation.NonNull V r9, @androidx.annotation.NonNull android.view.View r10, float r11, float r12) {
        /*
            r7 = this;
            r0 = r7
            java.lang.ref.WeakReference<android.view.View> r0 = r0.f113827C
            r15 = r0
            r0 = 0
            r14 = r0
            r0 = r14
            r13 = r0
            r0 = r15
            if (r0 == 0) goto L3c
            r0 = r14
            r13 = r0
            r0 = r10
            r1 = r15
            java.lang.Object r1 = r1.get()
            if (r0 != r1) goto L3c
            r0 = r7
            int r0 = r0.f113854u
            r1 = 3
            if (r0 != r1) goto L39
            r0 = r14
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r0 = super.onNestedPreFling(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3c
        L39:
            r0 = 1
            r13 = r0
        L3c:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.partitionTag.partitionTopic.widget.BottomSheetBehavior.onNestedPreFling(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, float, float):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v7, @NonNull View view, int i7, int i8, @NonNull int[] iArr, int i9) {
        if (i9 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f113827C;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v7.getTop();
        int i10 = top - i8;
        if (i8 > 0) {
            if (i10 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                ViewCompat.offsetTopAndBottom(v7, -expandedOffset);
                setStateInternal(3);
            } else {
                iArr[1] = i8;
                ViewCompat.offsetTopAndBottom(v7, -i8);
                setStateInternal(1);
            }
        } else if (i8 < 0 && !view.canScrollVertically(-1)) {
            int i11 = this.f113850q;
            if (i10 <= i11 || this.f113852s) {
                iArr[1] = i8;
                ViewCompat.offsetTopAndBottom(v7, -i8);
                setStateInternal(1);
            } else {
                int i12 = top - i11;
                iArr[1] = i12;
                ViewCompat.offsetTopAndBottom(v7, -i12);
                setStateInternal(4);
            }
        }
        dispatchOnSlide(v7.getTop());
        this.f113857x = i8;
        this.f113858y = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v7, @NonNull View view, int i7, int i8, int i9, int i10, int i11, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v7, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v7, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i7 = savedState.f113860a;
        if (i7 == 1 || i7 == 2) {
            this.f113854u = 4;
        } else {
            this.f113854u = i7;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v7) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v7), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v7, @NonNull View view, @NonNull View view2, int i7, int i8) {
        boolean z6 = false;
        this.f113857x = 0;
        this.f113858y = false;
        if ((i7 & 2) != 0) {
            z6 = true;
        }
        return z6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v7, @NonNull View view, int i7) {
        int expandedOffset;
        int i8 = 3;
        if (v7.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.f113827C;
        if (weakReference != null && view == weakReference.get() && this.f113858y) {
            if (this.f113857x > 0) {
                expandedOffset = getExpandedOffset();
            } else if (this.f113852s && shouldHide(v7, getYVelocity())) {
                expandedOffset = this.f113825A;
                i8 = 5;
            } else if (this.f113857x == 0) {
                int top = v7.getTop();
                if (!this.f113836b) {
                    int i9 = this.f113848o;
                    if (top < i9) {
                        if (top < Math.abs(top - this.f113850q)) {
                            expandedOffset = this.f113846m;
                        } else {
                            expandedOffset = this.f113848o;
                        }
                    } else if (Math.abs(top - i9) < Math.abs(top - this.f113850q)) {
                        expandedOffset = this.f113848o;
                    } else {
                        expandedOffset = this.f113850q;
                        i8 = 4;
                    }
                    i8 = 6;
                } else if (Math.abs(top - this.f113847n) < Math.abs(top - this.f113850q)) {
                    expandedOffset = this.f113847n;
                } else {
                    expandedOffset = this.f113850q;
                    i8 = 4;
                }
            } else {
                if (this.f113836b) {
                    expandedOffset = this.f113850q;
                } else {
                    int top2 = v7.getTop();
                    if (Math.abs(top2 - this.f113848o) < Math.abs(top2 - this.f113850q)) {
                        expandedOffset = this.f113848o;
                        i8 = 6;
                    } else {
                        expandedOffset = this.f113850q;
                    }
                }
                i8 = 4;
            }
            startSettlingAnimation(v7, i8, expandedOffset, false);
            this.f113858y = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v7, @NonNull MotionEvent motionEvent) {
        if (motionEvent != null) {
            BLog.i("PBottomSheetBehavior", "BottomSheetBehavior onTouchEvent  event = " + motionEvent.getAction());
        }
        if (!v7.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f113854u == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.f113855v;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.f113829E == null) {
            this.f113829E = VelocityTracker.obtain();
        }
        this.f113829E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f113856w && r.a(motionEvent, this.f113831G) > this.f113855v.getTouchSlop()) {
            this.f113855v.captureChildView(v7, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f113856w;
    }

    public void removeBottomSheetCallback(@NonNull e eVar) {
        this.f113828D.remove(eVar);
    }

    @Deprecated
    public void setBottomSheetCallback(e eVar) {
        Log.w("PBottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f113828D.clear();
        if (eVar != null) {
            this.f113828D.add(eVar);
        }
    }

    public void setExpandedOffset(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f113846m = i7;
    }

    public void setFitToContents(boolean z6) {
        if (this.f113836b == z6) {
            return;
        }
        this.f113836b = z6;
        if (this.f113826B != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.f113836b && this.f113854u == 6) ? 3 : this.f113854u);
        updateAccessibilityActions();
    }

    public void setHalfExpandedRatio(@FloatRange(from = 0.0d, to = 1.0d) float f7) {
        if (f7 <= 0.0f || f7 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f113849p = f7;
    }

    public void setHideable(boolean z6) {
        if (this.f113852s != z6) {
            this.f113852s = z6;
            if (!z6 && this.f113854u == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setNestedScrollingChildRef(View view) {
        if (view != null) {
            this.f113827C = new WeakReference<>(view);
        } else {
            this.f113827C = null;
        }
    }

    public void setPeekHeight(int i7) {
        setPeekHeight(i7, false);
    }

    public final void setPeekHeight(int i7, boolean z6) {
        V v7;
        if (i7 == -1) {
            if (this.f113839e) {
                return;
            } else {
                this.f113839e = true;
            }
        } else {
            if (!this.f113839e && this.f113838d == i7) {
                return;
            }
            this.f113839e = false;
            this.f113838d = Math.max(0, i7);
        }
        if (this.f113826B != null) {
            calculateCollapsedOffset();
            if (this.f113854u != 4 || (v7 = this.f113826B.get()) == null) {
                return;
            }
            if (z6) {
                settleToStatePendingLayout(this.f113854u);
            } else {
                v7.requestLayout();
            }
        }
    }

    public void setSaveFlags(int i7) {
        this.f113835a = i7;
    }

    public void setSkipCollapsed(boolean z6) {
        this.f113853t = z6;
    }

    public void setState(int i7) {
        if (i7 == this.f113854u) {
            return;
        }
        if (this.f113826B != null) {
            settleToStatePendingLayout(i7);
            return;
        }
        if (i7 == 4 || i7 == 3 || i7 == 6 || (this.f113852s && i7 == 5)) {
            this.f113854u = i7;
        }
    }

    public void setStateInternal(int i7) {
        if (this.f113854u == i7) {
            return;
        }
        this.f113854u = i7;
        WeakReference<V> weakReference = this.f113826B;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (i7 == 6 || i7 == 3) {
            updateImportantForAccessibility(true);
        } else if (i7 == 5 || i7 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i7);
        for (int i8 = 0; i8 < this.f113828D.size(); i8++) {
            this.f113828D.get(i8).b();
        }
        updateAccessibilityActions();
    }

    public void settleToState(@NonNull View view, int i7) {
        int expandedOffset;
        int i8;
        if (i7 == 4) {
            expandedOffset = this.f113850q;
            i8 = i7;
        } else if (i7 == 6) {
            int i9 = this.f113848o;
            expandedOffset = i9;
            i8 = i7;
            if (this.f113836b) {
                int i10 = this.f113847n;
                expandedOffset = i9;
                i8 = i7;
                if (i9 <= i10) {
                    i8 = 3;
                    expandedOffset = i10;
                }
            }
        } else if (i7 == 3) {
            expandedOffset = getExpandedOffset();
            i8 = i7;
        } else {
            if (!this.f113852s || i7 != 5) {
                throw new IllegalArgumentException(C3259x.a(i7, "Illegal state argument: "));
            }
            expandedOffset = this.f113825A;
            i8 = i7;
        }
        startSettlingAnimation(view, i8, expandedOffset, false);
    }

    public boolean shouldHide(@NonNull View view, float f7) {
        boolean z6 = true;
        if (this.f113853t) {
            return true;
        }
        if (view.getTop() < this.f113850q) {
            return false;
        }
        if (Math.abs(((f7 * 0.1f) + view.getTop()) - this.f113850q) / this.f113838d <= 0.5f) {
            z6 = false;
        }
        return z6;
    }

    public void startSettlingAnimation(View view, int i7, int i8, boolean z6) {
        if (!(z6 ? this.f113855v.settleCapturedViewAt(view.getLeft(), i8) : this.f113855v.smoothSlideViewTo(view, view.getLeft(), i8))) {
            setStateInternal(i7);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i7);
        if (this.f113844k == null) {
            this.f113844k = new f(this, view, i7);
        }
        BottomSheetBehavior<V>.f fVar = this.f113844k;
        if (fVar.f113873b) {
            fVar.f113874c = i7;
            return;
        }
        fVar.f113874c = i7;
        ViewCompat.postOnAnimation(view, fVar);
        this.f113844k.f113873b = true;
    }
}
