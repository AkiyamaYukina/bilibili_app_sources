package com.bilibili.studio.editor.moudle.caption.setting.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.collection.SparseArrayCompat;
import androidx.compose.animation.C3303a;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.magicasakura.widgets.Tintable;
import n.C8047a;
import zg0.C9193a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/UpperPagerSlidingTabStrip.class */
public class UpperPagerSlidingTabStrip extends HorizontalScrollView implements Tintable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f105972A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final a f105973B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @ColorRes
    public int f105974C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout.LayoutParams f105975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout.LayoutParams f105976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager.OnPageChangeListener f105977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f105978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f105979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f105980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f105981g;
    public ViewPager h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f105982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f105983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f105984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f105985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f105986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f105987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f105988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f105989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f105990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f105991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f105992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseArrayCompat<Float> f105993t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f105994u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f105995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f105996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f105997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f105998y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f105999z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/UpperPagerSlidingTabStrip$SavedState.class */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f106000a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/UpperPagerSlidingTabStrip$SavedState$a.class */
        public final class a implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, com.bilibili.studio.editor.moudle.caption.setting.widget.UpperPagerSlidingTabStrip$SavedState] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f106000a = parcel.readInt();
                return baseSavedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f106000a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/UpperPagerSlidingTabStrip$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperPagerSlidingTabStrip f106001a;

        public a(UpperPagerSlidingTabStrip upperPagerSlidingTabStrip) {
            this.f106001a = upperPagerSlidingTabStrip;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            int currentItem = this.f106001a.h.getCurrentItem();
            if (currentItem == iIntValue) {
                d dVar = this.f106001a.f105979e;
                if (dVar != null) {
                    dVar.U();
                    return;
                }
                return;
            }
            e eVar = this.f106001a.f105980f;
            if (eVar != null) {
                eVar.onTabClick();
            }
            this.f106001a.h.setCurrentItem(iIntValue, Math.abs(currentItem - iIntValue) < 3);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/UpperPagerSlidingTabStrip$b.class */
    public interface b {
        int a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/UpperPagerSlidingTabStrip$c.class */
    public final class c implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperPagerSlidingTabStrip f106002a;

        public c(UpperPagerSlidingTabStrip upperPagerSlidingTabStrip) {
            this.f106002a = upperPagerSlidingTabStrip;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
            UpperPagerSlidingTabStrip upperPagerSlidingTabStrip = this.f106002a;
            if (i7 == 0) {
                upperPagerSlidingTabStrip.c(upperPagerSlidingTabStrip.h.getCurrentItem(), 0);
            }
            ViewPager.OnPageChangeListener onPageChangeListener = upperPagerSlidingTabStrip.f105978d;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i7);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
            UpperPagerSlidingTabStrip upperPagerSlidingTabStrip = this.f106002a;
            if (i7 >= upperPagerSlidingTabStrip.f105981g.getChildCount()) {
                return;
            }
            upperPagerSlidingTabStrip.f105983j = i7;
            upperPagerSlidingTabStrip.f105984k = f7;
            upperPagerSlidingTabStrip.c(i7, upperPagerSlidingTabStrip.f105981g.getChildAt(i7) != null ? (int) (r0.getWidth() * f7) : 0);
            upperPagerSlidingTabStrip.invalidate();
            ViewPager.OnPageChangeListener onPageChangeListener = upperPagerSlidingTabStrip.f105978d;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrolled(i7, f7, i8);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            UpperPagerSlidingTabStrip upperPagerSlidingTabStrip;
            int i8 = 0;
            while (true) {
                upperPagerSlidingTabStrip = this.f106002a;
                if (i8 >= upperPagerSlidingTabStrip.f105981g.getChildCount()) {
                    break;
                }
                upperPagerSlidingTabStrip.f105981g.getChildAt(i8).setSelected(i7 == i8);
                i8++;
            }
            ViewPager.OnPageChangeListener onPageChangeListener = upperPagerSlidingTabStrip.f105978d;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(i7);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/UpperPagerSlidingTabStrip$d.class */
    public interface d {
        void U();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/UpperPagerSlidingTabStrip$e.class */
    public interface e {
        void onTabClick();
    }

    public UpperPagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public UpperPagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f105983j = 0;
        this.f105984k = 0.0f;
        this.f105986m = -10066330;
        this.f105987n = false;
        this.f105988o = true;
        this.f105989p = false;
        this.f105990q = 0;
        this.f105991r = 0;
        this.f105992s = 0;
        this.f105993t = new SparseArrayCompat<>();
        this.f105994u = 52;
        this.f105995v = 8;
        this.f105996w = 24;
        this.f105997x = Integer.MAX_VALUE;
        this.f105999z = 0;
        this.f105972A = 0;
        this.f105973B = new a(this);
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f105981g = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setClipChildren(false);
        addView(linearLayout);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f105994u = (int) TypedValue.applyDimension(1, this.f105994u, displayMetrics);
        this.f105995v = (int) TypedValue.applyDimension(1, this.f105995v, displayMetrics);
        this.f105996w = (int) TypedValue.applyDimension(1, this.f105996w, displayMetrics);
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9193a.f130314n);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0);
            this.f105974C = resourceId;
            this.f105986m = resourceId != 0 ? ThemeUtils.getColorById(context, resourceId) : this.f105986m;
            this.f105995v = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, this.f105995v);
            this.f105996w = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, this.f105996w);
            this.f105972A = typedArrayObtainStyledAttributes.getResourceId(14, this.f105972A);
            this.f105987n = typedArrayObtainStyledAttributes.getBoolean(13, this.f105987n);
            this.f105994u = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, this.f105994u);
            this.f105988o = typedArrayObtainStyledAttributes.getBoolean(19, this.f105988o);
            this.f105997x = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, Integer.MAX_VALUE);
            this.f105998y = typedArrayObtainStyledAttributes.getResourceId(0, 2131887653);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0);
            linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            this.f105989p = typedArrayObtainStyledAttributes.getBoolean(7, false);
            this.f105990q = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
            this.f105991r = typedArrayObtainStyledAttributes.getDimensionPixelSize(23, 0);
            this.f105992s = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, 0);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.f105985l = paint;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            this.f105975a = new LinearLayout.LayoutParams(-2, -1);
            this.f105976b = new LinearLayout.LayoutParams(0, -1, 1.0f);
            this.f105977c = getPageListener();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(int i7, View view) {
        view.setFocusable(true);
        view.setTag(Integer.valueOf(i7));
        view.setOnClickListener(this.f105973B);
        this.f105981g.addView(view, i7, this.f105987n ? this.f105976b : this.f105975a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float b(android.view.View r6) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.setting.widget.UpperPagerSlidingTabStrip.b(android.view.View):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r5, int r6) {
        /*
            r4 = this;
            r0 = r4
            int r0 = r0.f105982i
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r4
            android.widget.LinearLayout r0 = r0.f105981g
            r1 = r5
            android.view.View r0 = r0.getChildAt(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L1c
            r0 = r6
            r7 = r0
            goto L24
        L1c:
            r0 = r8
            int r0 = r0.getLeft()
            r1 = r6
            int r0 = r0 + r1
            r7 = r0
        L24:
            r0 = r5
            if (r0 > 0) goto L2e
            r0 = r7
            r5 = r0
            r0 = r6
            if (r0 <= 0) goto L35
        L2e:
            r0 = r7
            r1 = r4
            int r1 = r1.f105994u
            int r0 = r0 - r1
            r5 = r0
        L35:
            r0 = r5
            r1 = r4
            int r1 = r1.f105999z
            if (r0 == r1) goto L48
            r0 = r4
            r1 = r5
            r0.f105999z = r1
            r0 = r4
            r1 = r5
            r2 = 0
            r0.scrollTo(r1, r2)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.setting.widget.UpperPagerSlidingTabStrip.c(int, int):void");
    }

    public final void d() {
        for (int i7 = 0; i7 < this.f105982i; i7++) {
            View childAt = this.f105981g.getChildAt(i7);
            childAt.setBackgroundResource(this.f105972A);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (textView.getId() == 2131308533) {
                    textView.setTextAppearance(textView.getContext(), this.f105998y);
                    if (this.f105988o) {
                        textView.setAllCaps(true);
                    }
                }
            } else if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt);
            }
        }
    }

    public final void e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (textView.getId() == 2131308533) {
                    textView.setTextAppearance(textView.getContext(), this.f105998y);
                    if (this.f105988o) {
                        textView.setAllCaps(true);
                    }
                }
            } else if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt);
            }
        }
    }

    public int getIndicatorColor() {
        return this.f105986m;
    }

    public int getIndicatorHeight() {
        return this.f105995v;
    }

    public ViewPager.OnPageChangeListener getPageListener() {
        return new c(this);
    }

    public int getScrollOffset() {
        return this.f105994u;
    }

    public boolean getShouldExpand() {
        return this.f105987n;
    }

    public int getTabBackground() {
        return this.f105972A;
    }

    public int getTabCount() {
        return this.f105982i;
    }

    public int getTabPaddingLeftRight() {
        return this.f105996w;
    }

    public int getTabTextAppearance() {
        return this.f105998y;
    }

    public int getTabTextMaxWidth() {
        return this.f105997x;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f105982i == 0) {
            return;
        }
        int height = getHeight();
        this.f105985l.setColor(this.f105986m);
        View childAt = this.f105981g.getChildAt(this.f105983j);
        int left = this.f105981g.getLeft();
        float fB = b(childAt);
        float left2 = childAt.getLeft() + left + fB;
        float right = (childAt.getRight() + left) - fB;
        float fA = right;
        float fA2 = left2;
        if (this.f105984k > 0.0f) {
            int i7 = this.f105983j;
            fA = right;
            fA2 = left2;
            if (i7 < this.f105982i - 1) {
                View childAt2 = this.f105981g.getChildAt(i7 + 1);
                float fB2 = b(childAt2);
                float left3 = childAt2.getLeft() + left;
                float right2 = childAt2.getRight() + left;
                float f7 = this.f105984k;
                fA2 = C8047a.a(1.0f, f7, left2, (left3 + fB2) * f7);
                fA = C8047a.a(1.0f, f7, right, (right2 - fB2) * f7);
            }
        }
        int i8 = this.f105992s;
        if (i8 <= 0) {
            canvas.drawRect(fA2, height - this.f105995v, fA, height, this.f105985l);
            return;
        }
        int i9 = this.f105991r;
        if (i9 == 0) {
            canvas.drawRoundRect(fA2, height - this.f105995v, fA, height, i8, i8, this.f105985l);
            return;
        }
        float fA3 = C3303a.a(fA - fA2, i9, 2.0f, fA2);
        if (fA3 > 0.0f) {
            canvas.drawRoundRect(fA3, height - this.f105995v, fA3 + i9, height, i8, i8, this.f105985l);
        } else {
            canvas.drawRoundRect(fA2, height - this.f105995v, fA, height, i8, i8, this.f105985l);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        this.f105983j = savedState.f106000a;
        Parcelable superState = savedState.getSuperState();
        try {
            superState.getClass().getDeclaredField("isLayoutRtl").setBoolean(superState, false);
        } catch (Exception e7) {
        }
        super.onRestoreInstanceState(superState);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, android.view.View$BaseSavedState, com.bilibili.studio.editor.moudle.caption.setting.widget.UpperPagerSlidingTabStrip$SavedState] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f106000a = this.f105983j;
        return baseSavedState;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && super.onTouchEvent(motionEvent);
    }

    public void setAllCaps(boolean z6) {
        this.f105988o = z6;
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        if (isEnabled() == z6) {
            return;
        }
        for (int i7 = 0; i7 < this.f105982i; i7++) {
            this.f105981g.getChildAt(i7).setEnabled(z6);
        }
        super.setEnabled(z6);
    }

    @Deprecated
    public void setIndicatorColor(@ColorInt int i7) {
        this.f105986m = i7;
        invalidate();
    }

    public void setIndicatorColorResource(@ColorRes int i7) {
        this.f105974C = i7;
        this.f105986m = getResources().getColor(i7);
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.f105995v = i7;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f105978d = onPageChangeListener;
    }

    public void setOnPageReselectedListener(d dVar) {
        this.f105979e = dVar;
    }

    public void setOnTabClickListener(e eVar) {
        this.f105980f = eVar;
    }

    public void setScrollOffset(int i7) {
        this.f105994u = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z6) {
        this.f105987n = z6;
        requestLayout();
    }

    public void setTabBackground(int i7) {
        this.f105972A = i7;
    }

    public void setTabPaddingLeftRight(int i7) {
        this.f105996w = i7;
        d();
    }

    public void setTabTextAppearance(int i7) {
        this.f105998y = i7;
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setViewPager(ViewPager viewPager) {
        this.h = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.addOnPageChangeListener(this.f105977c);
        this.f105981g.removeAllViews();
        this.f105993t.clear();
        PagerAdapter adapter = this.h.getAdapter();
        if (adapter == 0) {
            return;
        }
        this.f105982i = adapter.getCount();
        for (int i7 = 0; i7 < this.f105982i; i7++) {
            if (adapter instanceof b) {
                int iA = ((b) adapter).a();
                TintImageView tintImageView = new TintImageView(getContext());
                tintImageView.setImageResource(iA);
                a(i7, tintImageView);
            } else {
                CharSequence pageTitle = adapter.getPageTitle(i7);
                TintTextView tintTextView = new TintTextView(getContext());
                tintTextView.setText(pageTitle);
                tintTextView.setMaxWidth(this.f105997x);
                tintTextView.setGravity(17);
                tintTextView.setEllipsize(TextUtils.TruncateAt.END);
                tintTextView.setSingleLine();
                int i8 = this.f105996w;
                tintTextView.setPadding(i8, 0, i8, 0);
                tintTextView.setId(2131308533);
                tintTextView.setAllCaps(false);
                a(i7, tintTextView);
            }
        }
        d();
        getViewTreeObserver().addOnGlobalLayoutListener(new com.bilibili.studio.editor.moudle.caption.setting.widget.b(this));
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
        int colorById;
        if (this.f105974C == 0 || (colorById = ThemeUtils.getColorById(getContext(), this.f105974C)) == this.f105986m) {
            return;
        }
        setIndicatorColor(colorById);
    }
}
