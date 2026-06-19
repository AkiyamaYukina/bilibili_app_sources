package com.bilibili.playerbizcommonv2.danmaku.view;

import Cr0.e;
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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.bililive.room.ui.roomv3.user.spender.LiveBigSpenderVIPGiftBagDialogFragment;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.danmaku.view.PlayerPagerSlidingTabStrip;
import com.bilibili.studio.comm.manager.v;
import com.bilibili.upper.module.contribute.up.manager.f0;
import com.bilibili.upper.module.contribute.up.model.ManuscriptEditV5ViewModel;
import com.bilibili.upper.module.contribute.up.ui.ManuscriptEditFragment;
import com.bilibili.upper.module.contribute.up.ui.hashtag.dialog.PartChooseDialog;
import com.bilibili.upper.module.partitionTag.partition.model.UpperPartitionHuman;
import eH0.n;
import eH0.o;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.JvmOverloads;
import n.C8047a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.sms.SmsLoginDialogActivityV2;
import zG0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerPagerSlidingTabStrip.class */
@StabilityInferred(parameters = 0)
public final class PlayerPagerSlidingTabStrip extends HorizontalScrollView {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f81540z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final LinearLayout.LayoutParams f81541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final LinearLayout.LayoutParams f81542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f81543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ViewPager.OnPageChangeListener f81544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public d f81545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final LinearLayout f81546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ViewPager f81547g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f81549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Paint f81550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f81551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f81552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f81553n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f81554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f81555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f81556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f81557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @ColorInt
    public final int f81558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @ColorInt
    public final int f81559t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f81560u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f81561v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f81562w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final Locale f81563x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Cr0.d f81564y;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerPagerSlidingTabStrip$SavedState.class */
    @StabilityInferred(parameters = 0)
    public static final class SavedState extends View.BaseSavedState {

        @NotNull
        public static final a CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f81565a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerPagerSlidingTabStrip$SavedState$a.class */
        public static final class a implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, com.bilibili.playerbizcommonv2.danmaku.view.PlayerPagerSlidingTabStrip$SavedState] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f81565a = parcel.readInt();
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
            parcel.writeInt(this.f81565a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerPagerSlidingTabStrip$a.class */
    public interface a {
        int a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerPagerSlidingTabStrip$b.class */
    public final class b implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerPagerSlidingTabStrip f81566a;

        public b(PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip) {
            this.f81566a = playerPagerSlidingTabStrip;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
            PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip = this.f81566a;
            if (i7 == 0) {
                PlayerPagerSlidingTabStrip.a(playerPagerSlidingTabStrip, playerPagerSlidingTabStrip.f81547g.getCurrentItem(), 0);
            }
            if (playerPagerSlidingTabStrip.getDelegatePageListener() != null) {
                playerPagerSlidingTabStrip.getDelegatePageListener().onPageScrollStateChanged(i7);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
            PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip = this.f81566a;
            int childCount = playerPagerSlidingTabStrip.f81546f.getChildCount();
            int i9 = 0;
            while (i9 < childCount) {
                View childAt = playerPagerSlidingTabStrip.f81546f.getChildAt(i9);
                boolean z6 = i7 == i9;
                TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                if (textView != null) {
                    textView.setTextColor(z6 ? playerPagerSlidingTabStrip.f81559t : playerPagerSlidingTabStrip.f81558s);
                }
                i9++;
            }
            playerPagerSlidingTabStrip.f81548i = i7;
            playerPagerSlidingTabStrip.f81549j = f7;
            PlayerPagerSlidingTabStrip.a(playerPagerSlidingTabStrip, i7, (int) (playerPagerSlidingTabStrip.f81546f.getChildAt(i7).getWidth() * f7));
            playerPagerSlidingTabStrip.invalidate();
            if (playerPagerSlidingTabStrip.getDelegatePageListener() != null) {
                playerPagerSlidingTabStrip.getDelegatePageListener().onPageScrolled(i7, f7, i8);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip = this.f81566a;
            int childCount = playerPagerSlidingTabStrip.f81546f.getChildCount();
            int i8 = 0;
            while (i8 < childCount) {
                playerPagerSlidingTabStrip.f81546f.getChildAt(i8).setSelected(i7 == i8);
                i8++;
            }
            if (playerPagerSlidingTabStrip.getDelegatePageListener() != null) {
                playerPagerSlidingTabStrip.getDelegatePageListener().onPageSelected(i7);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerPagerSlidingTabStrip$c.class */
    public interface c {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerPagerSlidingTabStrip$d.class */
    public interface d {
        void onTabClick(int i7);
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
    /* JADX WARN: Type inference failed for: r1v9, types: [Cr0.d] */
    public PlayerPagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i7) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f81543c = new b(this);
        this.f81551l = -298343;
        this.f81554o = 52;
        this.f81555p = 8;
        this.f81556q = 24;
        this.f81557r = Integer.MAX_VALUE;
        this.f81562w = 2131238482;
        final int i8 = 0;
        this.f81564y = new View.OnClickListener(this, i8) { // from class: Cr0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1741a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1742b;

            {
                this.f1741a = i8;
                this.f1742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o oVar;
                LiveBigSpenderVIPGiftBagDialogFragment.a aVar;
                switch (this.f1741a) {
                    case 0:
                        PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip = (PlayerPagerSlidingTabStrip) this.f1742b;
                        int i9 = PlayerPagerSlidingTabStrip.f81540z;
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        int currentItem = playerPagerSlidingTabStrip.f81547g.getCurrentItem();
                        if (currentItem != iIntValue) {
                            PlayerPagerSlidingTabStrip.d dVar = playerPagerSlidingTabStrip.f81545e;
                            if (dVar != null) {
                                dVar.onTabClick(iIntValue);
                            }
                            playerPagerSlidingTabStrip.f81547g.setCurrentItem(iIntValue, Math.abs(currentItem - iIntValue) < 3);
                            break;
                        }
                        break;
                    case 1:
                        PartChooseDialog partChooseDialog = (PartChooseDialog) this.f1742b;
                        partChooseDialog.dismiss();
                        UpperPartitionHuman upperPartitionHuman = partChooseDialog.g;
                        if (upperPartitionHuman != null) {
                            long j7 = upperPartitionHuman.id;
                            String str = upperPartitionHuman.name;
                            if (str != null && (oVar = partChooseDialog.d) != null) {
                                n nVar = oVar.a;
                                ManuscriptEditFragment.ViewData viewData = nVar.d;
                                if (viewData != null) {
                                    viewData.userDidSelectedTags = true;
                                }
                                if (viewData != null) {
                                    viewData.humanTypeId = j7;
                                }
                                if (viewData != null) {
                                    viewData.humanTypeName = str;
                                }
                                int i10 = f0.h;
                                if (!f0.a.a()) {
                                    ManuscriptEditFragment.ViewData viewData2 = nVar.d;
                                    if (viewData2 != null) {
                                        viewData2.zoneChooseIs = true;
                                    }
                                    ManuscriptEditV5ViewModel manuscriptEditV5ViewModel = nVar.e;
                                    if (manuscriptEditV5ViewModel != null) {
                                        manuscriptEditV5ViewModel.v = false;
                                    }
                                    if (manuscriptEditV5ViewModel != null) {
                                        manuscriptEditV5ViewModel.J0();
                                    }
                                }
                                ManuscriptEditV5ViewModel manuscriptEditV5ViewModel2 = nVar.e;
                                if (manuscriptEditV5ViewModel2 != null) {
                                    ManuscriptEditFragment.ViewData viewData3 = nVar.d;
                                    manuscriptEditV5ViewModel2.a1(viewData3, viewData3 != null ? Long.valueOf(viewData3.currentTypeId) : null);
                                }
                                nVar.f();
                                zG0.a.a.getClass();
                                a.a aVar2 = a.a.a;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("tid_name", str);
                                v.a(linkedHashMap);
                                tw0.f.f127691a.d(false, "creation.new-publish.tid.tid-select-confirm.click", linkedHashMap);
                            }
                        }
                        break;
                    case 2:
                        com.bilibili.app.gemini.player.widget.d.q((com.bilibili.app.gemini.player.widget.d) this.f1742b);
                        break;
                    case 3:
                        LiveBigSpenderVIPGiftBagDialogFragment liveBigSpenderVIPGiftBagDialogFragment = (LiveBigSpenderVIPGiftBagDialogFragment) this.f1742b;
                        String str2 = liveBigSpenderVIPGiftBagDialogFragment.g;
                        if (str2 != null && (aVar = liveBigSpenderVIPGiftBagDialogFragment.j) != null) {
                            aVar.h(str2);
                        }
                        liveBigSpenderVIPGiftBagDialogFragment.if(false);
                        break;
                    default:
                        e10.f fVar = ((SmsLoginDialogActivityV2) this.f1742b).r0;
                        if (fVar != null) {
                            fVar.c();
                        }
                        break;
                }
            }
        };
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f81546f = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f81554o = (int) TypedValue.applyDimension(1, this.f81554o, displayMetrics);
        this.f81555p = (int) TypedValue.applyDimension(1, this.f81555p, displayMetrics);
        this.f81556q = (int) TypedValue.applyDimension(1, this.f81556q, displayMetrics);
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.k);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            this.f81551l = resourceId != 0 ? getResources().getColor(resourceId) : this.f81551l;
            this.f81555p = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.f81555p);
            this.f81556q = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, this.f81556q);
            this.f81562w = typedArrayObtainStyledAttributes.getResourceId(5, this.f81562w);
            this.f81552m = typedArrayObtainStyledAttributes.getBoolean(4, this.f81552m);
            this.f81554o = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.f81554o);
            this.f81553n = typedArrayObtainStyledAttributes.getBoolean(11, this.f81553n);
            this.f81557r = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, Integer.MAX_VALUE);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
            this.f81558s = resourceId2 == 0 ? ResourcesCompat.getColor(getResources(), R$color.Text_white, null) : ResourcesCompat.getColor(getResources(), resourceId2, null);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(10, 0);
            this.f81559t = resourceId3 == 0 ? ResourcesCompat.getColor(getResources(), 2131102728, null) : ResourcesCompat.getColor(getResources(), resourceId3, null);
            this.f81560u = typedArrayObtainStyledAttributes.getResourceId(0, 2131886267);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
            linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.f81550k = paint;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            this.f81541a = new LinearLayout.LayoutParams(-2, -1);
            this.f81542b = new LinearLayout.LayoutParams(0, -1, 1.0f);
            if (this.f81563x == null) {
                this.f81563x = getResources().getConfiguration().locale;
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
    public static final void a(com.bilibili.playerbizcommonv2.danmaku.view.PlayerPagerSlidingTabStrip r4, int r5, int r6) {
        /*
            r0 = r4
            int r0 = r0.h
            if (r0 != 0) goto La
            goto L3c
        La:
            r0 = r4
            android.widget.LinearLayout r0 = r0.f81546f
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
            int r1 = r1.f81554o
            int r0 = r0 - r1
            r5 = r0
        L29:
            r0 = r5
            r1 = r4
            int r1 = r1.f81561v
            if (r0 == r1) goto L3c
            r0 = r4
            r1 = r5
            r0.f81561v = r1
            r0 = r4
            r1 = r5
            r2 = 0
            r0.scrollTo(r1, r2)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.view.PlayerPagerSlidingTabStrip.a(com.bilibili.playerbizcommonv2.danmaku.view.PlayerPagerSlidingTabStrip, int, int):void");
    }

    public final void b(int i7, View view) {
        view.setFocusable(true);
        view.setTag(Integer.valueOf(i7));
        view.setOnClickListener(this.f81564y);
        this.f81546f.addView(view, i7, this.f81552m ? this.f81542b : this.f81541a);
    }

    public final void c() {
        int i7 = this.h;
        for (int i8 = 0; i8 < i7; i8++) {
            View childAt = this.f81546f.getChildAt(i8);
            childAt.setBackgroundResource(this.f81562w);
            int i9 = this.f81556q;
            childAt.setPadding(i9, 0, i9, 0);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextAppearance(textView.getContext(), this.f81560u);
                if (this.f81553n) {
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
                textView.setTextAppearance(textView.getContext(), this.f81560u);
                if (this.f81553n) {
                    textView.setAllCaps(true);
                }
            } else if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt);
            }
        }
    }

    @Nullable
    public final ViewPager.OnPageChangeListener getDelegatePageListener() {
        return this.f81544d;
    }

    public final int getIndicatorColor() {
        return this.f81551l;
    }

    public final int getIndicatorHeight() {
        return this.f81555p;
    }

    public final int getScrollOffset() {
        return this.f81554o;
    }

    public final boolean getShouldExpand() {
        return this.f81552m;
    }

    public final int getTabBackground() {
        return this.f81562w;
    }

    public final int getTabPaddingLeftRight() {
        return this.f81556q;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.h == 0) {
            return;
        }
        int height = getHeight();
        Paint paint = this.f81550k;
        if (paint != null) {
            paint.setColor(this.f81551l);
        }
        View childAt = this.f81546f.getChildAt(this.f81548i);
        int left = this.f81546f.getLeft();
        float left2 = childAt.getLeft() + left;
        float right = childAt.getRight() + left;
        float fA = right;
        float fA2 = left2;
        if (this.f81549j > 0.0f) {
            int i7 = this.f81548i;
            fA = right;
            fA2 = left2;
            if (i7 < this.h - 1) {
                View childAt2 = this.f81546f.getChildAt(i7 + 1);
                float left3 = childAt2.getLeft() + left;
                float right2 = childAt2.getRight() + left;
                float f7 = this.f81549j;
                fA2 = C8047a.a(1.0f, f7, left2, left3 * f7);
                fA = C8047a.a(1.0f, f7, right, right2 * f7);
            }
        }
        int i8 = this.f81556q;
        canvas.drawRect(fA2 + i8, height - this.f81555p, fA - i8, height, this.f81550k);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        return isEnabled() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(@NotNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        this.f81548i = savedState.f81565a;
        Parcelable superState = savedState.getSuperState();
        try {
            superState.getClass().getDeclaredField("isLayoutRtl").setBoolean(superState, false);
        } catch (Exception e7) {
        }
        super.onRestoreInstanceState(superState);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, android.view.View$BaseSavedState, com.bilibili.playerbizcommonv2.danmaku.view.PlayerPagerSlidingTabStrip$SavedState] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f81565a = this.f81548i;
        return baseSavedState;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        return isEnabled() && super.onTouchEvent(motionEvent);
    }

    public final void setAllCaps(boolean z6) {
        this.f81553n = z6;
    }

    public final void setDelegatePageListener(@Nullable ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f81544d = onPageChangeListener;
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        if (isEnabled() == z6) {
            return;
        }
        int i7 = this.h;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f81546f.getChildAt(i8).setEnabled(z6);
        }
        super.setEnabled(z6);
    }

    public final void setIndicatorColor(int i7) {
        this.f81551l = i7;
        invalidate();
    }

    public final void setIndicatorColorResource(int i7) {
        this.f81551l = getResources().getColor(i7);
        invalidate();
    }

    public final void setIndicatorHeight(int i7) {
        this.f81555p = i7;
        invalidate();
    }

    public final void setOnPageChangeListener(@Nullable ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f81544d = onPageChangeListener;
    }

    public final void setOnPageReselectedListener(@Nullable c cVar) {
    }

    public final void setOnTabClickListener(@NotNull d dVar) {
        this.f81545e = dVar;
    }

    public final void setScrollOffset(int i7) {
        this.f81554o = i7;
        invalidate();
    }

    public final void setShouldExpand(boolean z6) {
        this.f81552m = z6;
        requestLayout();
    }

    public final void setTabBackground(int i7) {
        this.f81562w = i7;
    }

    public final void setTabPaddingLeftRight(int i7) {
        this.f81556q = i7;
        c();
    }

    public final void setTabTextAppearance(int i7) {
        this.f81560u = i7;
        c();
    }

    public final void setViewPager(@NotNull ViewPager viewPager) {
        this.f81547g = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.setOnPageChangeListener(this.f81543c);
        this.f81546f.removeAllViews();
        int count = this.f81547g.getAdapter().getCount();
        this.h = count;
        for (int i7 = 0; i7 < count; i7++) {
            if (this.f81547g.getAdapter() instanceof a) {
                int iA = ((a) this.f81547g.getAdapter()).a();
                ImageButton imageButton = new ImageButton(getContext());
                imageButton.setImageResource(iA);
                b(i7, imageButton);
            } else {
                CharSequence pageTitle = this.f81547g.getAdapter().getPageTitle(i7);
                TextView textView = new TextView(getContext());
                textView.setText(pageTitle);
                textView.setMaxWidth(this.f81557r);
                textView.setGravity(17);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(this.f81558s);
                textView.setSingleLine();
                b(i7, textView);
            }
        }
        c();
        getViewTreeObserver().addOnGlobalLayoutListener(new e(this));
    }
}
