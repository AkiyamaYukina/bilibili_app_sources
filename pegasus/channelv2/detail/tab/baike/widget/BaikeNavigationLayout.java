package com.bilibili.pegasus.channelv2.detail.tab.baike.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.GravityCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.magicasakura.widgets.Tintable;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/BaikeNavigationLayout.class */
public class BaikeNavigationLayout extends HorizontalScrollView implements Tintable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final a f75177G = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f75178A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f75179B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f75180C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f75181D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f75182E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final b f75183F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout.LayoutParams f75184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout.LayoutParams f75185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f75186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f75189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75190g;
    public ValueAnimator h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f75191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f75192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f75193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f75194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f75195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f75196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f75197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f75198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SparseArrayCompat<Float> f75199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PagerSlidingTabStrip.PageReselectedListener f75200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PagerSlidingTabStrip.TabClickListener f75201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList<String> f75202t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f75203u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f75204v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f75205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f75206x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f75207y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f75208z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/BaikeNavigationLayout$SavedState.class */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75209a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/BaikeNavigationLayout$SavedState$a.class */
        public final class a implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, com.bilibili.pegasus.channelv2.detail.tab.baike.widget.BaikeNavigationLayout$SavedState] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f75209a = parcel.readInt();
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
            parcel.writeInt(this.f75209a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/BaikeNavigationLayout$a.class */
    public final class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return androidx.customview.widget.b.a(f8, f8, f8, f8, f8, 1.0f);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/BaikeNavigationLayout$b.class */
    public final class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaikeNavigationLayout f75210a;

        public b(BaikeNavigationLayout baikeNavigationLayout) {
            this.f75210a = baikeNavigationLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            int i7 = 0;
            while (i7 < this.f75210a.f75186c.getChildCount()) {
                View childAt = this.f75210a.f75186c.getChildAt(i7);
                a aVar = BaikeNavigationLayout.f75177G;
                TextView textView = (TextView) childAt.findViewById(2131308533);
                textView.setSelected(iIntValue == i7);
                textView.setTypeface(iIntValue == i7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
                i7++;
            }
            this.f75210a.b(iIntValue);
            BaikeNavigationLayout baikeNavigationLayout = this.f75210a;
            if (baikeNavigationLayout.f75188e == iIntValue) {
                PagerSlidingTabStrip.PageReselectedListener pageReselectedListener = baikeNavigationLayout.f75200r;
                if (pageReselectedListener != null) {
                    pageReselectedListener.onReselected(iIntValue);
                    return;
                }
                return;
            }
            PagerSlidingTabStrip.TabClickListener tabClickListener = baikeNavigationLayout.f75201s;
            if (tabClickListener != null) {
                tabClickListener.onTabClick(iIntValue);
            }
        }
    }

    public BaikeNavigationLayout(Context context) {
        this(context, null);
    }

    public BaikeNavigationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f75187d = 0;
        this.f75188e = 0;
        this.f75189f = 0.0f;
        this.f75190g = 0;
        this.f75192j = new RectF();
        this.f75193k = false;
        this.f75194l = -723724;
        this.f75195m = 0;
        this.f75196n = false;
        this.f75197o = false;
        this.f75198p = 0;
        this.f75199q = new SparseArrayCompat<>();
        this.f75202t = new ArrayList<>();
        this.f75203u = 100;
        this.f75204v = 8;
        this.f75205w = 0;
        this.f75206x = Integer.MAX_VALUE;
        this.f75208z = 0;
        this.f75178A = 0;
        this.f75180C = 4;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        this.f75181D = iApplyDimension;
        this.f75182E = iApplyDimension * 2;
        this.f75183F = new b(this);
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f75186c = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setClipChildren(false);
        linearLayout.setGravity(GravityCompat.START);
        addView(linearLayout);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f75203u = (int) TypedValue.applyDimension(1, this.f75203u, displayMetrics);
        this.f75204v = (int) TypedValue.applyDimension(1, this.f75204v, displayMetrics);
        this.f75205w = (int) TypedValue.applyDimension(1, this.f75205w, displayMetrics);
        this.f75180C = (int) TypedValue.applyDimension(1, 4, displayMetrics);
        TypedValue.applyDimension(1, 100, displayMetrics);
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fl.a.a);
        try {
            this.f75194l = typedArrayObtainStyledAttributes.getColor(2, this.f75194l);
            this.f75204v = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.f75204v);
            this.f75205w = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, this.f75205w);
            this.f75178A = typedArrayObtainStyledAttributes.getResourceId(8, this.f75178A);
            this.f75196n = typedArrayObtainStyledAttributes.getBoolean(7, this.f75196n);
            this.f75203u = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, this.f75203u);
            this.f75197o = typedArrayObtainStyledAttributes.getBoolean(12, this.f75197o);
            this.f75206x = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, Integer.MAX_VALUE);
            this.f75207y = typedArrayObtainStyledAttributes.getResourceId(0, 2131887653);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
            linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            typedArrayObtainStyledAttributes.getBoolean(4, false);
            this.f75198p = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.f75191i = paint;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            this.f75184a = new LinearLayout.LayoutParams(-2, -1);
            this.f75185b = new LinearLayout.LayoutParams(0, -1, 1.0f);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getItemCount() {
        ArrayList<String> arrayList = this.f75202t;
        return arrayList == null ? 0 : arrayList.size();
    }

    public final void a(List<String> list) {
        if (((ArrayList) list).size() > 0) {
            this.f75202t.clear();
            this.f75186c.removeAllViews();
            this.f75199q.clear();
            this.f75187d = 0;
            this.f75202t.addAll(list);
            int i7 = 0;
            while (i7 < getItemCount()) {
                ArrayList<String> arrayList = this.f75202t;
                String str = (arrayList == null || arrayList.size() <= i7) ? "" : this.f75202t.get(i7);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setGravity(17);
                int i8 = this.f75181D;
                linearLayout.setPadding(i8, 0, i8, 0);
                TintTextView tintTextView = new TintTextView(getContext());
                tintTextView.setTextSize(13.0f);
                tintTextView.setText(str);
                tintTextView.setMaxWidth(this.f75206x);
                tintTextView.setGravity(17);
                tintTextView.setEllipsize(TextUtils.TruncateAt.END);
                tintTextView.setSingleLine();
                tintTextView.setId(2131308533);
                linearLayout.addView(tintTextView, new ViewGroup.LayoutParams(-2, -1));
                linearLayout.setFocusable(true);
                linearLayout.setTag(Integer.valueOf(i7));
                linearLayout.setOnClickListener(this.f75183F);
                this.f75186c.addView(linearLayout, i7, this.f75196n ? this.f75185b : this.f75184a);
                i7++;
            }
            d();
            getViewTreeObserver().addOnGlobalLayoutListener(new com.bilibili.pegasus.channelv2.detail.tab.baike.widget.b(this));
        }
    }

    public final void b(int i7) {
        if (i7 == this.f75187d) {
            return;
        }
        this.f75190g = getScrollX();
        this.f75188e = this.f75187d;
        this.f75187d = i7;
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.h = valueAnimator2;
            valueAnimator2.addUpdateListener(new com.bilibili.pegasus.channelv2.detail.tab.baike.widget.a(this));
        } else {
            valueAnimator.cancel();
        }
        this.h.setFloatValues(this.f75188e - this.f75187d, 0.0f);
        this.h.setDuration(600L);
        this.h.setInterpolator(f75177G);
        this.h.start();
    }

    public final void c(int i7, int i8) {
        if (getItemCount() == 0) {
            return;
        }
        int left = (i7 > 0 ? this.f75186c.getChildAt(i7).getLeft() - this.f75182E : 0) + i8;
        if (left != this.f75208z) {
            this.f75208z = left;
            scrollTo(left, 0);
        }
    }

    public final void d() {
        for (int i7 = 0; i7 < getItemCount(); i7++) {
            View childAt = this.f75186c.getChildAt(i7);
            childAt.setBackgroundResource(this.f75178A);
            TextView textView = (TextView) childAt.findViewById(2131308533);
            if (textView.getId() == 2131308533) {
                textView.setTextAppearance(textView.getContext(), this.f75207y);
                ColorStateList colorStateList = this.f75179B;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                if (this.f75197o) {
                    textView.setAllCaps(true);
                }
            }
        }
    }

    public int getCurrentPosition() {
        return this.f75187d;
    }

    public int getIndicatorColor() {
        return this.f75194l;
    }

    public int getIndicatorHeight() {
        return this.f75204v;
    }

    public int getScrollOffset() {
        return this.f75203u;
    }

    public boolean getShouldExpand() {
        return this.f75196n;
    }

    public int getTabBackground() {
        return this.f75178A;
    }

    public int getTabPaddingLeftRight() {
        return this.f75205w;
    }

    public int getTabTextAppearance() {
        return this.f75207y;
    }

    public int getTabTextMaxWidth() {
        return this.f75206x;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || getItemCount() == 0 || !this.f75193k) {
            return;
        }
        int height = getHeight();
        this.f75191i.setColor(this.f75194l);
        View childAt = this.f75186c.getChildAt(this.f75187d);
        int left = this.f75186c.getLeft();
        float measuredWidth = childAt == null ? 0.0f : ((childAt.getMeasuredWidth() - childAt.findViewById(2131308533).getMeasuredWidth()) / 2) - this.f75198p;
        float left2 = childAt.getLeft() + left + measuredWidth;
        float right = (childAt.getRight() + left) - measuredWidth;
        float f7 = right;
        float f8 = left2;
        if (this.f75189f != 0.0f) {
            int i7 = this.f75188e;
            f7 = right;
            f8 = left2;
            if (i7 != this.f75187d) {
                View childAt2 = this.f75186c.getChildAt(i7);
                float measuredWidth2 = childAt2 == null ? 0.0f : ((childAt2.getMeasuredWidth() - childAt2.findViewById(2131308533).getMeasuredWidth()) / 2) - this.f75198p;
                float left3 = childAt2.getLeft() + left;
                float right2 = childAt2.getRight() + left;
                float f9 = this.f75189f;
                float f10 = this.f75188e - this.f75187d;
                float f11 = left2 + ((((left3 + measuredWidth2) - left2) * f9) / f10);
                float f12 = right + ((((right2 - measuredWidth2) - right) * f9) / f10);
                f8 = f11;
                f7 = f12;
            }
        }
        RectF rectF = this.f75192j;
        rectF.left = f8;
        float f13 = (height - this.f75204v) / 2.0f;
        rectF.top = f13;
        rectF.right = f7;
        rectF.bottom = height - f13;
        float f14 = this.f75180C;
        canvas.drawRoundRect(rectF, f14, f14, this.f75191i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        this.f75187d = savedState.f75209a;
        Parcelable superState = savedState.getSuperState();
        try {
            superState.getClass().getDeclaredField("isLayoutRtl").setBoolean(superState, false);
        } catch (Exception e7) {
        }
        super.onRestoreInstanceState(superState);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, android.view.View$BaseSavedState, com.bilibili.pegasus.channelv2.detail.tab.baike.widget.BaikeNavigationLayout$SavedState] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f75209a = this.f75187d;
        return baseSavedState;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zIsEnabled = isEnabled();
        boolean z6 = true;
        if (zIsEnabled) {
            requestDisallowInterceptTouchEvent(true);
        }
        if (!zIsEnabled || !super.onTouchEvent(motionEvent)) {
            z6 = false;
        }
        return z6;
    }

    public void setAllCaps(boolean z6) {
        this.f75197o = z6;
    }

    public void setBackgroundColorInt(@ColorInt int i7) {
        this.f75195m = 0;
        setBackgroundColor(i7);
    }

    public void setBackgroundColorResource(@ColorRes int i7) {
        this.f75195m = i7;
        setBackgroundColor(ThemeUtils.getColorById(getContext(), i7));
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        if (isEnabled() == z6) {
            return;
        }
        for (int i7 = 0; i7 < getItemCount(); i7++) {
            this.f75186c.getChildAt(i7).setEnabled(z6);
        }
        super.setEnabled(z6);
    }

    public void setIndicatorColor(@ColorInt int i7) {
        this.f75194l = i7;
        invalidate();
    }

    public void setIndicatorColorResource(@ColorRes int i7) {
        this.f75194l = getResources().getColor(i7);
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.f75204v = i7;
        invalidate();
    }

    public void setReselectedListener(PagerSlidingTabStrip.PageReselectedListener pageReselectedListener) {
        this.f75200r = pageReselectedListener;
    }

    public void setScrollOffset(int i7) {
        this.f75203u = i7;
        invalidate();
    }

    public void setSelectPosition(int i7) {
        if (i7 < 0 || i7 >= this.f75186c.getChildCount()) {
            return;
        }
        int i8 = 0;
        while (i8 < this.f75186c.getChildCount()) {
            TextView textView = (TextView) this.f75186c.getChildAt(i8).findViewById(2131308533);
            textView.setSelected(i7 == i8);
            textView.setTypeface(i7 == i8 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            i8++;
        }
        b(i7);
    }

    public void setShouldExpand(boolean z6) {
        this.f75196n = z6;
        requestLayout();
    }

    public void setShowIndicator(boolean z6) {
        this.f75193k = z6;
    }

    public void setTabBackground(int i7) {
        this.f75178A = i7;
    }

    public void setTabClickListener(PagerSlidingTabStrip.TabClickListener tabClickListener) {
        this.f75201s = tabClickListener;
    }

    public void setTabPaddingLeftRight(int i7) {
        this.f75205w = i7;
        d();
    }

    public void setTabTextAppearance(int i7) {
        this.f75207y = i7;
        d();
    }

    public void setTextColorStateList(ColorStateList colorStateList) {
        this.f75179B = colorStateList;
        d();
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
        int color = ThemeUtils.getColor(getContext(), this.f75194l);
        if (color != this.f75194l) {
            setIndicatorColor(color);
        }
        int i7 = this.f75195m;
        if (i7 != 0) {
            setBackgroundColorResource(i7);
        }
    }
}
