package com.bilibili.playerbizcommon.features.danmaku.view;

import HG0.ViewOnClickListenerC2111u0;
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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.theme.R$color;
import java.util.Locale;
import kotlin.jvm.JvmOverloads;
import n.C8047a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qq0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerPagerSlidingTabStrip.class */
public final class PlayerPagerSlidingTabStrip extends HorizontalScrollView {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f79735y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final LinearLayout.LayoutParams f79736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final LinearLayout.LayoutParams f79737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f79738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ViewPager.OnPageChangeListener f79739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LinearLayout f79740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ViewPager f79741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79742g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f79743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Paint f79744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f79745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f79746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f79747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f79748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f79749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f79750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f79751q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @ColorInt
    public final int f79752r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @ColorInt
    public final int f79753s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f79754t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f79755u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f79756v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final Locale f79757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final ViewOnClickListenerC2111u0 f79758x;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerPagerSlidingTabStrip$SavedState.class */
    public static final class SavedState extends View.BaseSavedState {

        @NotNull
        public static final a CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79759a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerPagerSlidingTabStrip$SavedState$a.class */
        public static final class a implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, com.bilibili.playerbizcommon.features.danmaku.view.PlayerPagerSlidingTabStrip$SavedState] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f79759a = parcel.readInt();
                return baseSavedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f79759a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerPagerSlidingTabStrip$a.class */
    public interface a {
        int a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerPagerSlidingTabStrip$b.class */
    public final class b implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerPagerSlidingTabStrip f79760a;

        public b(PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip) {
            this.f79760a = playerPagerSlidingTabStrip;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
            PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip = this.f79760a;
            if (i7 == 0) {
                PlayerPagerSlidingTabStrip.a(playerPagerSlidingTabStrip, playerPagerSlidingTabStrip.f79741f.getCurrentItem(), 0);
            }
            if (playerPagerSlidingTabStrip.getDelegatePageListener() != null) {
                playerPagerSlidingTabStrip.getDelegatePageListener().onPageScrollStateChanged(i7);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
            PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip = this.f79760a;
            int childCount = playerPagerSlidingTabStrip.f79740e.getChildCount();
            int i9 = 0;
            while (i9 < childCount) {
                View childAt = playerPagerSlidingTabStrip.f79740e.getChildAt(i9);
                boolean z6 = i7 == i9;
                TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                if (textView != null) {
                    textView.setTextColor(z6 ? playerPagerSlidingTabStrip.f79753s : playerPagerSlidingTabStrip.f79752r);
                }
                i9++;
            }
            playerPagerSlidingTabStrip.h = i7;
            playerPagerSlidingTabStrip.f79743i = f7;
            PlayerPagerSlidingTabStrip.a(playerPagerSlidingTabStrip, i7, (int) (playerPagerSlidingTabStrip.f79740e.getChildAt(i7).getWidth() * f7));
            playerPagerSlidingTabStrip.invalidate();
            if (playerPagerSlidingTabStrip.getDelegatePageListener() != null) {
                playerPagerSlidingTabStrip.getDelegatePageListener().onPageScrolled(i7, f7, i8);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip = this.f79760a;
            int childCount = playerPagerSlidingTabStrip.f79740e.getChildCount();
            int i8 = 0;
            while (i8 < childCount) {
                playerPagerSlidingTabStrip.f79740e.getChildAt(i8).setSelected(i7 == i8);
                i8++;
            }
            if (playerPagerSlidingTabStrip.getDelegatePageListener() != null) {
                playerPagerSlidingTabStrip.getDelegatePageListener().onPageSelected(i7);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerPagerSlidingTabStrip$c.class */
    public interface c {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerPagerSlidingTabStrip$d.class */
    public interface d {
    }

    @JvmOverloads
    public PlayerPagerSlidingTabStrip(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public PlayerPagerSlidingTabStrip(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlayerPagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i7) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f79738c = new b(this);
        this.f79745k = -298343;
        this.f79748n = 52;
        this.f79749o = 8;
        this.f79750p = 24;
        this.f79751q = Integer.MAX_VALUE;
        this.f79756v = 2131238482;
        this.f79758x = new ViewOnClickListenerC2111u0(this, 2);
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f79740e = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f79748n = (int) TypedValue.applyDimension(1, this.f79748n, displayMetrics);
        this.f79749o = (int) TypedValue.applyDimension(1, this.f79749o, displayMetrics);
        this.f79750p = (int) TypedValue.applyDimension(1, this.f79750p, displayMetrics);
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.k);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            this.f79745k = resourceId != 0 ? getResources().getColor(resourceId) : this.f79745k;
            this.f79749o = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.f79749o);
            this.f79750p = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, this.f79750p);
            this.f79756v = typedArrayObtainStyledAttributes.getResourceId(5, this.f79756v);
            this.f79746l = typedArrayObtainStyledAttributes.getBoolean(4, this.f79746l);
            this.f79748n = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.f79748n);
            this.f79747m = typedArrayObtainStyledAttributes.getBoolean(11, this.f79747m);
            this.f79751q = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, Integer.MAX_VALUE);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
            this.f79752r = resourceId2 == 0 ? ResourcesCompat.getColor(getResources(), R$color.Text_white, null) : ResourcesCompat.getColor(getResources(), resourceId2, null);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(10, 0);
            this.f79753s = resourceId3 == 0 ? ResourcesCompat.getColor(getResources(), 2131102728, null) : ResourcesCompat.getColor(getResources(), resourceId3, null);
            this.f79754t = typedArrayObtainStyledAttributes.getResourceId(0, 2131886267);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
            linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.f79744j = paint;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            this.f79736a = new LinearLayout.LayoutParams(-2, -1);
            this.f79737b = new LinearLayout.LayoutParams(0, -1, 1.0f);
            if (this.f79757w == null) {
                this.f79757w = getResources().getConfiguration().locale;
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.bilibili.playerbizcommon.features.danmaku.view.PlayerPagerSlidingTabStrip r4, int r5, int r6) {
        /*
            r0 = r4
            int r0 = r0.f79742g
            if (r0 != 0) goto La
            goto L3c
        La:
            r0 = r4
            android.widget.LinearLayout r0 = r0.f79740e
            r1 = r5
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getLeft()
            r1 = r6
            int r0 = r0 + r1
            r7 = r0
            r0 = r5
            if (r0 > 0) goto L22
            r0 = r7
            r5 = r0
            r0 = r6
            if (r0 <= 0) goto L29
        L22:
            r0 = r7
            r1 = r4
            int r1 = r1.f79748n
            int r0 = r0 - r1
            r5 = r0
        L29:
            r0 = r5
            r1 = r4
            int r1 = r1.f79755u
            if (r0 == r1) goto L3c
            r0 = r4
            r1 = r5
            r0.f79755u = r1
            r0 = r4
            r1 = r5
            r2 = 0
            r0.scrollTo(r1, r2)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.danmaku.view.PlayerPagerSlidingTabStrip.a(com.bilibili.playerbizcommon.features.danmaku.view.PlayerPagerSlidingTabStrip, int, int):void");
    }

    public final void b(int i7, View view) {
        view.setFocusable(true);
        view.setTag(Integer.valueOf(i7));
        view.setOnClickListener(this.f79758x);
        this.f79740e.addView(view, i7, this.f79746l ? this.f79737b : this.f79736a);
    }

    public final void c() {
        int i7 = this.f79742g;
        for (int i8 = 0; i8 < i7; i8++) {
            View childAt = this.f79740e.getChildAt(i8);
            childAt.setBackgroundResource(this.f79756v);
            int i9 = this.f79750p;
            childAt.setPadding(i9, 0, i9, 0);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextAppearance(textView.getContext(), this.f79754t);
                if (this.f79747m) {
                    textView.setAllCaps(true);
                }
            } else if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt);
            }
        }
    }

    public final void d(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextAppearance(textView.getContext(), this.f79754t);
                if (this.f79747m) {
                    textView.setAllCaps(true);
                }
            } else if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt);
            }
        }
    }

    @Nullable
    public final ViewPager.OnPageChangeListener getDelegatePageListener() {
        return this.f79739d;
    }

    public final int getIndicatorColor() {
        return this.f79745k;
    }

    public final int getIndicatorHeight() {
        return this.f79749o;
    }

    public final int getScrollOffset() {
        return this.f79748n;
    }

    public final boolean getShouldExpand() {
        return this.f79746l;
    }

    public final int getTabBackground() {
        return this.f79756v;
    }

    public final int getTabPaddingLeftRight() {
        return this.f79750p;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f79742g == 0) {
            return;
        }
        int height = getHeight();
        Paint paint = this.f79744j;
        if (paint != null) {
            paint.setColor(this.f79745k);
        }
        View childAt = this.f79740e.getChildAt(this.h);
        int left = this.f79740e.getLeft();
        float left2 = childAt.getLeft() + left;
        float right = childAt.getRight() + left;
        float fA = right;
        float fA2 = left2;
        if (this.f79743i > 0.0f) {
            int i7 = this.h;
            fA = right;
            fA2 = left2;
            if (i7 < this.f79742g - 1) {
                View childAt2 = this.f79740e.getChildAt(i7 + 1);
                float left3 = childAt2.getLeft() + left;
                float right2 = childAt2.getRight() + left;
                float f7 = this.f79743i;
                fA2 = C8047a.a(1.0f, f7, left2, left3 * f7);
                fA = C8047a.a(1.0f, f7, right, right2 * f7);
            }
        }
        int i8 = this.f79750p;
        canvas.drawRect(fA2 + i8, height - this.f79749o, fA - i8, height, this.f79744j);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        return isEnabled() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(@NotNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        this.h = savedState.f79759a;
        Parcelable superState = savedState.getSuperState();
        try {
            superState.getClass().getDeclaredField("isLayoutRtl").setBoolean(superState, false);
        } catch (Exception e7) {
        }
        super.onRestoreInstanceState(superState);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, android.view.View$BaseSavedState, com.bilibili.playerbizcommon.features.danmaku.view.PlayerPagerSlidingTabStrip$SavedState] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f79759a = this.h;
        return baseSavedState;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        return isEnabled() && super.onTouchEvent(motionEvent);
    }

    public final void setAllCaps(boolean z6) {
        this.f79747m = z6;
    }

    public final void setDelegatePageListener(@Nullable ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f79739d = onPageChangeListener;
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        if (isEnabled() == z6) {
            return;
        }
        int i7 = this.f79742g;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f79740e.getChildAt(i8).setEnabled(z6);
        }
        super.setEnabled(z6);
    }

    public final void setIndicatorColor(int i7) {
        this.f79745k = i7;
        invalidate();
    }

    public final void setIndicatorColorResource(int i7) {
        this.f79745k = getResources().getColor(i7);
        invalidate();
    }

    public final void setIndicatorHeight(int i7) {
        this.f79749o = i7;
        invalidate();
    }

    public final void setOnPageChangeListener(@Nullable ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f79739d = onPageChangeListener;
    }

    public final void setOnPageReselectedListener(@Nullable c cVar) {
    }

    public final void setOnTabClickListener(@NotNull d dVar) {
    }

    public final void setScrollOffset(int i7) {
        this.f79748n = i7;
        invalidate();
    }

    public final void setShouldExpand(boolean z6) {
        this.f79746l = z6;
        requestLayout();
    }

    public final void setTabBackground(int i7) {
        this.f79756v = i7;
    }

    public final void setTabPaddingLeftRight(int i7) {
        this.f79750p = i7;
        c();
    }

    public final void setTabTextAppearance(int i7) {
        this.f79754t = i7;
        c();
    }

    public final void setViewPager(@NotNull ViewPager viewPager) {
        this.f79741f = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.setOnPageChangeListener(this.f79738c);
        this.f79740e.removeAllViews();
        int count = this.f79741f.getAdapter().getCount();
        this.f79742g = count;
        for (int i7 = 0; i7 < count; i7++) {
            if (this.f79741f.getAdapter() instanceof a) {
                int iA = ((a) this.f79741f.getAdapter()).a();
                ImageButton imageButton = new ImageButton(getContext());
                imageButton.setImageResource(iA);
                b(i7, imageButton);
            } else {
                CharSequence pageTitle = this.f79741f.getAdapter().getPageTitle(i7);
                TextView textView = new TextView(getContext());
                textView.setText(pageTitle);
                textView.setMaxWidth(this.f79751q);
                textView.setGravity(17);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(this.f79752r);
                textView.setSingleLine();
                b(i7, textView);
            }
        }
        c();
        getViewTreeObserver().addOnGlobalLayoutListener(new f(this));
    }
}
