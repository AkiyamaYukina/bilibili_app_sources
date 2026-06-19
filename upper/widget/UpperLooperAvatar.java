package com.bilibili.upper.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.studio.videoeditor.CaptionFx;
import java.lang.ref.WeakReference;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmOverloads;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/UpperLooperAvatar.class */
@StabilityInferred(parameters = 0)
public final class UpperLooperAvatar extends ViewGroup {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f114453j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ValueAnimator f114454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f114455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f114457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String[] f114460g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f114461i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/UpperLooperAvatar$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public WeakReference<UpperLooperAvatar> f114462a;

        public a() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(@NotNull Message message) {
            UpperLooperAvatar upperLooperAvatar;
            super.handleMessage(message);
            try {
                WeakReference<UpperLooperAvatar> weakReference = this.f114462a;
                if (weakReference == null || (upperLooperAvatar = weakReference.get()) == null || upperLooperAvatar.getContext() == null || ContextUtilKt.requireActivity(upperLooperAvatar.getContext()) == null || ContextUtilKt.requireActivity(upperLooperAvatar.getContext()).isDestroyed()) {
                    return;
                }
                UpperLooperAvatar.a(upperLooperAvatar);
                upperLooperAvatar.getHandler().sendEmptyMessageDelayed(CaptionFx.BUBBLEPATH_FIELD_NUMBER, ((long) 1000) + upperLooperAvatar.h);
            } catch (IllegalArgumentException e7) {
            }
        }
    }

    @JvmOverloads
    public UpperLooperAvatar(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public UpperLooperAvatar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public UpperLooperAvatar(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f114455b = 0.8f;
        this.f114456c = 4;
        this.f114457d = 16.0f;
        this.f114460g = new String[0];
        this.h = 500L;
        this.f114461i = LazyKt.lazy(new GS.j(this, 2));
    }

    public static final void a(final UpperLooperAvatar upperLooperAvatar) {
        String[] strArr = upperLooperAvatar.f114460g;
        if (strArr.length != 0 && strArr.length > upperLooperAvatar.f114456c) {
            int i7 = upperLooperAvatar.f114459f;
            if (i7 >= strArr.length - 1) {
                upperLooperAvatar.f114459f = 0;
            } else {
                upperLooperAvatar.f114459f = i7 + 1;
            }
            ValueAnimator valueAnimator = upperLooperAvatar.f114454a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            BiliImageView biliImageViewC = upperLooperAvatar.c();
            ImageRequestBuilder.placeholderImageResId$default(BiliImageLoader.INSTANCE.with(upperLooperAvatar.getContext()).url(upperLooperAvatar.f114460g[upperLooperAvatar.f114459f]), 2131233999, (ScaleType) null, 2, (Object) null).into(biliImageViewC);
            upperLooperAvatar.addView(biliImageViewC);
            if (upperLooperAvatar.getChildCount() >= upperLooperAvatar.f114456c) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) (upperLooperAvatar.getChildAt(0).getMeasuredWidth() * upperLooperAvatar.f114455b));
                upperLooperAvatar.f114454a = valueAnimatorOfInt;
                if (valueAnimatorOfInt != null) {
                    valueAnimatorOfInt.setDuration(upperLooperAvatar.h);
                }
                ValueAnimator valueAnimator2 = upperLooperAvatar.f114454a;
                if (valueAnimator2 != null) {
                    valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(upperLooperAvatar) { // from class: com.bilibili.upper.widget.G

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final UpperLooperAvatar f114394a;

                        {
                            this.f114394a = upperLooperAvatar;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            UpperLooperAvatar upperLooperAvatar2 = this.f114394a;
                            int i8 = UpperLooperAvatar.f114453j;
                            upperLooperAvatar2.f114458e = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                            upperLooperAvatar2.requestLayout();
                        }
                    });
                }
                ValueAnimator valueAnimator3 = upperLooperAvatar.f114454a;
                if (valueAnimator3 != null) {
                    valueAnimator3.addListener(new H(upperLooperAvatar));
                }
                ValueAnimator valueAnimator4 = upperLooperAvatar.f114454a;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getHandler() {
        return (a) this.f114461i.getValue();
    }

    public final BiliImageView c() {
        BiliImageView biliImageView = new BiliImageView(getContext());
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.setRoundAsCircle(true);
        roundingParams.setBorder(-1, ListExtentionsKt.toPx(1));
        biliImageView.getGenericProperties().setRoundingParams(roundingParams);
        return biliImageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getHandler().removeCallbacksAndMessages(null);
        ValueAnimator valueAnimator = this.f114454a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f114454a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11 = this.f114458e;
        int i12 = -i11;
        int i13 = -i11;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            i13 = i14 == 0 ? i13 + measuredWidth : (int) ((measuredWidth * this.f114455b) + i13);
            childAt.layout(i12, 0, i13, measuredHeight);
            i12 = (int) ((measuredWidth * this.f114455b) + i12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        int iCoerceAtLeast = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int px = ListExtentionsKt.toPx(this.f114457d);
            layoutParams.width = px;
            layoutParams.height = px;
            childAt.setLayoutParams(layoutParams);
            measureChild(childAt, i7, i8);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i11 = i10;
            if (i9 < this.f114456c) {
                i11 = i9 == 0 ? i10 + measuredWidth : (int) ((measuredWidth * this.f114455b) + i10);
            }
            iCoerceAtLeast = RangesKt.coerceAtLeast(iCoerceAtLeast, measuredHeight);
            i9++;
            i10 = i11;
        }
        int i12 = mode2 == 1073741824 ? size2 : i10;
        if (mode == 1073741824) {
            iCoerceAtLeast = size;
        }
        setMeasuredDimension(i12, iCoerceAtLeast);
    }

    public final void setData(@Nullable String[] strArr) {
        if (strArr == null || strArr.length == 0 || strArr.length <= this.f114456c) {
            return;
        }
        this.f114460g = strArr;
        getHandler().removeCallbacksAndMessages(null);
        ValueAnimator valueAnimator = this.f114454a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f114454a = null;
        removeAllViews();
        int i7 = this.f114456c;
        for (int i8 = 0; i8 < i7; i8++) {
            BiliImageView biliImageViewC = c();
            ImageRequestBuilder.placeholderImageResId$default(BiliImageLoader.INSTANCE.with(getContext()).url(this.f114460g[i8]), 2131233999, (ScaleType) null, 2, (Object) null).into(biliImageViewC);
            addView(biliImageViewC);
        }
        this.f114459f = this.f114456c - 1;
    }
}
