package com.bilibili.playerbizcommonv2.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintTextView;
import ir0.C7613b;
import kotlin.jvm.JvmOverloads;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/view/CustomMarqueeTextView.class */
@StabilityInferred(parameters = 0)
public final class CustomMarqueeTextView extends TintTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f82068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f82069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f82071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f82072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f82073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f82074g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f82075i;

    @JvmOverloads
    public CustomMarqueeTextView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public CustomMarqueeTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomMarqueeTextView(Context context, AttributeSet attributeSet, int i7, int i8) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f82071d = "";
        this.f82072e = 1.0f;
        this.h = 50.0f;
        this.f82075i = true;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C7613b.f122197c);
        this.h = RangesKt.coerceAtLeast(typedArrayObtainStyledAttributes.getDimension(0, 50.0f), 0.0f);
        this.f82072e = RangesKt.coerceAtLeast(typedArrayObtainStyledAttributes.getFloat(1, 1.0f), 0.1f);
        this.f82075i = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
        getPaint().setColor(getTextColors().getColorForState(getDrawableState(), 0));
        String string = getText().toString();
        this.f82071d = string;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f82068a = getPaint().measureText(this.f82071d);
        this.f82070c = true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        if (!this.f82075i) {
            super.onDraw(canvas);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        this.f82073f = ((getHeight() - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
        if (this.f82068a <= getWidth()) {
            canvas.drawText(this.f82071d, (getWidth() / 2) - (this.f82068a / 2), this.f82073f, getPaint());
            return;
        }
        canvas.drawText(this.f82071d, this.f82069b, this.f82073f, getPaint());
        canvas.drawText(this.f82071d, this.f82074g, this.f82073f, getPaint());
        if (this.f82070c) {
            float f7 = this.f82069b;
            float f8 = this.f82072e;
            float f9 = f7 - f8;
            this.f82069b = f9;
            float f10 = this.f82074g - f8;
            this.f82074g = f10;
            float fMin = Math.min(f9, f10);
            float f11 = this.f82068a;
            if (fMin < (-f11)) {
                if (this.f82069b < this.f82074g) {
                    float f12 = this.h;
                    this.f82074g = f12;
                    this.f82069b = (2 * f12) + f11;
                } else {
                    float f13 = this.h;
                    this.f82069b = f13;
                    this.f82074g = (2 * f13) + f11;
                }
            }
            invalidate();
        }
    }

    public final void setCustomMarqueeEnable(boolean z6) {
        setSelected(z6);
        this.f82075i = z6;
    }

    @Override // android.widget.TextView
    public final void setText(@NotNull CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f82071d = charSequence.toString();
        float fMeasureText = getPaint().measureText(charSequence.toString());
        this.f82068a = fMeasureText;
        this.f82069b = 0.0f;
        this.f82074g = this.h + fMeasureText;
        this.f82070c = true;
        invalidate();
    }

    @Override // com.bilibili.magicasakura.widgets.TintTextView, android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        getPaint().setColor(i7);
        this.f82070c = true;
        invalidate();
    }
}
