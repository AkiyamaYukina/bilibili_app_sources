package com.bilibili.ogv.review.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;
import com.bilibili.ogv.review.reviewpublish.ShortReviewPublishFragment;
import com.bilibili.ogv.review.reviewpublish.q;
import com.bilibili.ogv.review.widget.ReviewRatingBar;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/widget/ReviewRatingBar.class */
public class ReviewRatingBar extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f72570q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f72572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f72575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f72576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f72577g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f72578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ColorRes
    public final int f72579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColorRes
    public final int f72580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<El0.a> f72581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f72582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f72583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f72584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f72585p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/widget/ReviewRatingBar$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f72586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ReviewRatingBar f72588c;

        public a(ReviewRatingBar reviewRatingBar, float f7, boolean z6) {
            this.f72588c = reviewRatingBar;
            this.f72586a = f7;
            this.f72587b = z6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f72588c.f72583n = (int) Math.ceil(r0.f72572b / r0.h);
            ReviewRatingBar reviewRatingBar = this.f72588c;
            float f7 = this.f72586a;
            if (f7 <= 0.0f) {
                f7 = 0.0f;
            }
            reviewRatingBar.f72572b = f7;
            reviewRatingBar.a(f7, this.f72587b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/widget/ReviewRatingBar$b.class */
    public interface b {
    }

    public ReviewRatingBar(Context context) {
        this(context, null);
    }

    public ReviewRatingBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ArrayList arrayList = new ArrayList();
        this.f72581l = arrayList;
        this.f72585p = new Handler(Looper.getMainLooper());
        setFocusable(true);
        setFocusableInTouchMode(true);
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bilibili.ogv.review.b.f72210a);
        try {
            int i7 = typedArrayObtainStyledAttributes.getInt(4, 5);
            this.f72573c = i7;
            this.f72573c = i7 < 0 ? 5 : i7;
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            this.f72575e = drawable;
            this.f72575e = drawable == null ? AppCompatResources.getDrawable(context, 2131234967) : drawable;
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(2);
            this.f72576f = drawable2;
            this.f72576f = drawable2 == null ? AppCompatResources.getDrawable(context, 2131234988) : drawable2;
            this.f72574d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, (int) TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
            this.f72577g = typedArrayObtainStyledAttributes.getBoolean(9, false);
            this.h = typedArrayObtainStyledAttributes.getInt(7, 2);
            this.f72579j = typedArrayObtainStyledAttributes.getResourceId(1, R$color.Ga4);
            this.f72580k = typedArrayObtainStyledAttributes.getResourceId(3, R$color.Ye5);
            this.f72578i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, (int) TypedValue.applyDimension(1, 36.0f, context.getResources().getDisplayMetrics()));
            this.f72571a = typedArrayObtainStyledAttributes.getInt(8, 2);
            typedArrayObtainStyledAttributes.recycle();
            arrayList.clear();
            for (int i8 = 0; i8 < this.f72573c; i8++) {
                El0.a aVar = new El0.a(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i8 == 0) {
                    layoutParams.setMargins(0, 0, this.f72574d / 2, 0);
                } else if (i8 == this.f72573c - 1) {
                    layoutParams.setMargins(this.f72574d / 2, 0, 0, 0);
                } else {
                    int i9 = this.f72574d / 2;
                    layoutParams.setMargins(i9, 0, i9, 0);
                }
                aVar.setLayoutParams(layoutParams);
                Drawable drawable3 = this.f72576f;
                int i10 = this.f72580k;
                Drawable drawableTintDrawableByColorId = i10 != 0 ? ThemeUtils.tintDrawableByColorId(aVar.getContext(), drawable3, i10) : drawable3;
                Drawable drawableNewDrawable = drawableTintDrawableByColorId.getConstantState() == null ? null : drawableTintDrawableByColorId.getConstantState().newDrawable();
                aVar.f4618a.setImageDrawable(new ClipDrawable(drawableNewDrawable != null ? drawableNewDrawable : drawableTintDrawableByColorId, GravityCompat.START, 1));
                Drawable drawable4 = this.f72575e;
                int i11 = this.f72579j;
                Drawable drawableTintDrawableByColorId2 = i11 != 0 ? ThemeUtils.tintDrawableByColorId(aVar.getContext(), drawable4, i11) : drawable4;
                Drawable drawableNewDrawable2 = drawableTintDrawableByColorId2.getConstantState() == null ? null : drawableTintDrawableByColorId2.getConstantState().newDrawable();
                if (drawableNewDrawable2 != null) {
                    drawableTintDrawableByColorId2 = drawableNewDrawable2;
                }
                aVar.f4619b.setImageDrawable(new ClipDrawable(drawableTintDrawableByColorId2, GravityCompat.END, 1));
                aVar.setSize(this.f72578i);
                ((ArrayList) this.f72581l).add(aVar);
                addView(aVar);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(float f7, boolean z6) {
        float fRound = Math.round(f7) / this.h;
        int i7 = (int) fRound;
        float f8 = fRound % 1.0f > 0.0f ? 0.5f : 0.0f;
        int i8 = 0;
        for (int i9 = 0; i9 < ((ArrayList) this.f72581l).size(); i9++) {
            final El0.a aVar = (El0.a) ((ArrayList) this.f72581l).get(i9);
            if (i9 == i7) {
                if (z6) {
                    final float f9 = f8;
                    final int i10 = i9;
                    i8 += 10;
                    this.f72585p.postDelayed(new Runnable(this, aVar, f9, i10) { // from class: El0.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final ReviewRatingBar f4620a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final a f4621b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final float f4622c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final int f4623d;

                        {
                            this.f4620a = this;
                            this.f4621b = aVar;
                            this.f4622c = f9;
                            this.f4623d = i10;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ReviewRatingBar reviewRatingBar = this.f4620a;
                            a aVar2 = this.f4621b;
                            float f10 = this.f4622c;
                            int i11 = this.f4623d;
                            int i12 = ReviewRatingBar.f72570q;
                            reviewRatingBar.getClass();
                            aVar2.setPartialFilled(f10);
                            if (f10 <= 0.0f || i11 <= reviewRatingBar.f72583n) {
                                return;
                            }
                            Animation animationLoadAnimation = AnimationUtils.loadAnimation(reviewRatingBar.getContext(), 2130772281);
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(reviewRatingBar.getContext(), 2130772280);
                            aVar2.startAnimation(animationLoadAnimation);
                            aVar2.startAnimation(animationLoadAnimation2);
                        }
                    }, i8);
                } else {
                    aVar.setPartialFilled(f8);
                }
            } else if (i9 > i7) {
                if (z6) {
                    i8 += 10;
                    this.f72585p.postDelayed(new Runnable(aVar) { // from class: El0.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final a f4624a;

                        {
                            this.f4624a = aVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            a aVar2 = this.f4624a;
                            int i11 = ReviewRatingBar.f72570q;
                            aVar2.setPartialFilled(0.0f);
                        }
                    }, i8);
                } else {
                    aVar.setPartialFilled(0.0f);
                }
            } else if (z6) {
                final int i11 = i9;
                i8 += 10;
                this.f72585p.postDelayed(new Runnable(this, aVar, i11) { // from class: El0.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ReviewRatingBar f4625a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final a f4626b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final int f4627c;

                    {
                        this.f4625a = this;
                        this.f4626b = aVar;
                        this.f4627c = i11;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ReviewRatingBar reviewRatingBar = this.f4625a;
                        a aVar2 = this.f4626b;
                        int i12 = this.f4627c;
                        int i13 = ReviewRatingBar.f72570q;
                        reviewRatingBar.getClass();
                        aVar2.setPartialFilled(1.0f);
                        if (i12 >= reviewRatingBar.f72583n) {
                            Animation animationLoadAnimation = AnimationUtils.loadAnimation(reviewRatingBar.getContext(), 2130772281);
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(reviewRatingBar.getContext(), 2130772280);
                            aVar2.startAnimation(animationLoadAnimation);
                            aVar2.startAnimation(animationLoadAnimation2);
                        }
                    }
                }, i8);
            } else {
                aVar.setPartialFilled(1.0f);
            }
        }
        b bVar = this.f72582m;
        if (bVar != null) {
            q qVar = (q) bVar;
            KProperty<Object>[] kPropertyArr = ShortReviewPublishFragment.f72488A;
            ShortReviewPublishFragment shortReviewPublishFragment = qVar.f72552a;
            shortReviewPublishFragment.hf(f7);
            ReviewPublishInfo reviewPublishInfo = shortReviewPublishFragment.f72497k;
            ReviewPublishInfo reviewPublishInfo2 = reviewPublishInfo;
            if (reviewPublishInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("review");
                reviewPublishInfo2 = null;
            }
            reviewPublishInfo2.f71724b.f71728a = (int) f7;
            shortReviewPublishFragment.m7685if();
        }
    }

    public final void b(float f7) {
        float f8;
        float f9;
        int i7;
        float f10;
        int i8;
        int i9 = 0;
        float f11 = 0.0f;
        while (true) {
            f8 = f11;
            if (i9 >= ((ArrayList) this.f72581l).size()) {
                break;
            }
            El0.a aVar = (El0.a) ((ArrayList) this.f72581l).get(i9);
            int i10 = this.f72571a;
            if (i10 == 2) {
                f10 = f8;
                if (f7 > aVar.getLeft()) {
                    i8 = this.h;
                    f10 = f8 + i8;
                }
            } else {
                f10 = f8;
                if (i10 == 1) {
                    if (f7 > (aVar.getWidth() / 2) + aVar.getLeft()) {
                        i8 = this.h;
                    } else {
                        f10 = f8;
                        if (f7 > aVar.getLeft()) {
                            i8 = this.h / 2;
                        }
                    }
                    f10 = f8 + i8;
                }
            }
            i9++;
            f11 = f10;
        }
        int i11 = this.f72571a;
        if (i11 == 2) {
            f9 = f8;
            if (f8 == 0.0f) {
                i7 = this.h;
                f9 = i7;
            }
        } else {
            f9 = f8;
            if (i11 == 1) {
                f9 = f8;
                if (f8 == 0.0f) {
                    i7 = this.h / 2;
                    f9 = i7;
                }
            }
        }
        if (this.f72572b != f9) {
            c(f9, true);
        }
    }

    public final void c(float f7, boolean z6) {
        if (!ViewCompat.isAttachedToWindow(this)) {
            this.f72584o = new a(this, f7, z6);
            return;
        }
        this.f72583n = (int) Math.ceil(this.f72572b / this.h);
        if (f7 <= 0.0f) {
            f7 = 0.0f;
        }
        this.f72572b = f7;
        a(f7, z6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f72584o;
        if (aVar != null) {
            aVar.run();
            this.f72584o = null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f72577g || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f72577g) {
            return false;
        }
        float x6 = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                return true;
            }
            b(x6);
            return true;
        }
        requestFocus();
        requestFocusFromTouch();
        b(x6);
        return true;
    }

    public void setOnRatingChangeListener(b bVar) {
        this.f72582m = bVar;
    }

    public void setRating(float f7) {
        c(f7, false);
    }
}
