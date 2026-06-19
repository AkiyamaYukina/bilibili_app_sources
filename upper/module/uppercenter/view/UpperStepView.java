package com.bilibili.upper.module.uppercenter.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import com.bilibili.upper.module.uppercenter.view.UpperStepView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/UpperStepView.class */
@StabilityInferred(parameters = 0)
public final class UpperStepView extends ConstraintLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f114203o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Float> f114204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, ? extends View> f114205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f114208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Drawable f114209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Drawable f114210g;

    @Nullable
    public Drawable h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Drawable f114211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Drawable f114212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final RectF f114213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final RectF f114214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Paint f114215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Paint f114216n;

    @JvmOverloads
    public UpperStepView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public UpperStepView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UpperStepView(Context context, AttributeSet attributeSet, int i7, int i8) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f114204a = new ArrayList();
        this.f114213k = new RectF();
        this.f114214l = new RectF();
        this.f114215m = new Paint(1);
        this.f114216n = new Paint(1);
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IE0.a.f10173n, 0, 0);
        setProgressCorner(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        setProgressHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0));
        setProgressBackgroundColor(typedArrayObtainStyledAttributes.getColor(3, 0));
        setProgressColor(typedArrayObtainStyledAttributes.getColor(5, 0));
        setProgressBackgroundDrawable(typedArrayObtainStyledAttributes.getResourceId(4, 0));
        setProgressDrawable(typedArrayObtainStyledAttributes.getResourceId(7, 0));
        setStepNotBeginDrawable(typedArrayObtainStyledAttributes.getResourceId(2, 0));
        setStepDoingDrawable(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        setStepCompleteDrawable(typedArrayObtainStyledAttributes.getResourceId(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        post(new Runnable(this) { // from class: cJ0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UpperStepView f58854a;

            {
                this.f58854a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpperStepView upperStepView = this.f58854a;
                int i9 = UpperStepView.f114203o;
                int measuredHeight = upperStepView.getMeasuredHeight() / 2;
                int i10 = upperStepView.f114207d / 2;
                int i11 = measuredHeight - i10;
                int i12 = i10 + measuredHeight;
                int paddingLeft = upperStepView.getPaddingLeft();
                int measuredWidth = upperStepView.getMeasuredWidth() - upperStepView.getPaddingRight();
                RectF rectF = upperStepView.f114213k;
                float f7 = paddingLeft;
                float f8 = i11;
                float f9 = measuredWidth;
                float f10 = i12;
                rectF.set(f7, f8, f9, f10);
                Float f11 = (Float) CollectionsKt.getOrNull(upperStepView.f114204a, upperStepView.f114206c);
                float fWidth = (upperStepView.f114213k.width() * (f11 != null ? f11.floatValue() : 1.0f)) + upperStepView.f114213k.left;
                upperStepView.f114214l.set(f7, f8, fWidth, f10);
                Drawable drawable = upperStepView.f114209f;
                if (drawable != null) {
                    drawable.setBounds(paddingLeft, i11, measuredWidth, i12);
                }
                Drawable drawable2 = upperStepView.f114210g;
                if (drawable2 != null) {
                    drawable2.setBounds(paddingLeft, i11, (int) fWidth, i12);
                }
                upperStepView.postInvalidateOnAnimation();
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Drawable drawableMutate;
        super.onDraw(canvas);
        Drawable drawable = this.f114209f;
        if (drawable != null) {
            drawable.draw(canvas);
        } else {
            RectF rectF = this.f114213k;
            float f7 = this.f114208e;
            canvas.drawRoundRect(rectF, f7, f7, this.f114215m);
        }
        Drawable drawable2 = this.f114210g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        } else {
            RectF rectF2 = this.f114214l;
            float f8 = this.f114208e;
            canvas.drawRoundRect(rectF2, f8, f8, this.f114216n);
        }
        int i7 = 0;
        for (Object obj : this.f114204a) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            int i8 = this.f114206c;
            Drawable drawable3 = i7 < i8 ? this.f114212j : i7 == i8 ? this.f114211i : i7 > i8 ? this.h : null;
            if (drawable3 != null && (drawableMutate = drawable3.mutate()) != null) {
                int intrinsicWidth = drawableMutate.getIntrinsicWidth() / 2;
                int intrinsicHeight = drawableMutate.getIntrinsicHeight() / 2;
                int iRoundToInt = MathKt.roundToInt((((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) * fFloatValue) + getPaddingLeft());
                int measuredHeight = getMeasuredHeight() / 2;
                drawableMutate.setBounds(iRoundToInt - intrinsicWidth, measuredHeight - intrinsicHeight, iRoundToInt + intrinsicWidth, measuredHeight + intrinsicHeight);
                if (fFloatValue == 0.0f) {
                    drawableMutate.getBounds().offset(intrinsicWidth, 0);
                } else if (fFloatValue == 1.0f) {
                    drawableMutate.getBounds().offset(0 - intrinsicWidth, 0);
                }
                drawableMutate.draw(canvas);
            }
            i7++;
        }
    }

    public final void setCurrentStep(int i7) {
        this.f114206c = i7;
        RectF rectF = this.f114214l;
        Float f7 = (Float) CollectionsKt.getOrNull(this.f114204a, i7);
        rectF.right = (this.f114213k.width() * (f7 != null ? f7.floatValue() : 1.0f)) + this.f114213k.left;
    }

    public final void setProgressBackgroundColor(int i7) {
        this.f114215m.setColor(i7);
    }

    public final void setProgressBackgroundDrawable(int i7) {
        if (i7 > 0) {
            this.f114209f = ContextCompat.getDrawable(getContext(), i7);
        }
    }

    public final void setProgressColor(int i7) {
        this.f114216n.setColor(i7);
    }

    public final void setProgressCorner(float f7) {
        this.f114208e = f7;
    }

    public final void setProgressDrawable(int i7) {
        if (i7 > 0) {
            this.f114210g = ContextCompat.getDrawable(getContext(), i7);
        }
    }

    public final void setProgressHeight(int i7) {
        this.f114207d = i7;
    }

    public final void setStep(@NotNull Collection<Float> collection) {
        Function1<? super Integer, ? extends View> function1;
        if (collection.size() < 2) {
            return;
        }
        ((ArrayList) this.f114204a).clear();
        ((ArrayList) this.f114204a).addAll(collection);
        removeAllViews();
        if (((ArrayList) this.f114204a).isEmpty() || (function1 = this.f114205b) == null) {
            return;
        }
        int i7 = 0;
        for (Object obj : (ArrayList) this.f114204a) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            View view = (View) function1.invoke(Integer.valueOf(i7));
            if (view == null) {
                return;
            }
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.topToTop = getId();
            layoutParams.bottomToBottom = getId();
            if (fFloatValue == 0.0f) {
                layoutParams.startToStart = getId();
            } else if (fFloatValue == 1.0f) {
                layoutParams.endToEnd = getId();
            } else {
                View guideline = new Guideline(getContext());
                guideline.setId(ViewGroup.generateViewId());
                ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams2.orientation = 1;
                layoutParams2.guidePercent = fFloatValue;
                addView(guideline, layoutParams2);
                layoutParams.startToStart = guideline.getId();
                layoutParams.endToEnd = guideline.getId();
            }
            addView(view, layoutParams);
            i7++;
        }
    }

    public final void setStepCompleteDrawable(int i7) {
        if (i7 > 0) {
            this.f114212j = ContextCompat.getDrawable(getContext(), i7);
        }
    }

    public final void setStepDoingDrawable(int i7) {
        if (i7 > 0) {
            this.f114211i = ContextCompat.getDrawable(getContext(), i7);
        }
    }

    public final void setStepNotBeginDrawable(int i7) {
        if (i7 > 0) {
            this.h = ContextCompat.getDrawable(getContext(), i7);
        }
    }

    public final void setStepViewCreator(@Nullable Function1<? super Integer, ? extends View> function1) {
        this.f114205b = function1;
    }
}
