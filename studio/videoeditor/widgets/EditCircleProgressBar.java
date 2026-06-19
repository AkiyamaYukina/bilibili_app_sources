package com.bilibili.studio.videoeditor.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.w;
import java.util.Locale;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/EditCircleProgressBar.class */
public class EditCircleProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f110285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f110286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f110287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f110288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f110289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f110290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f110291g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f110292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f110293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f110294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f110295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f110296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f110297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f110298o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f110299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f110300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f110301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f110302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f110303t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f110304u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f110305v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f110306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Paint.Cap f110307x;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/EditCircleProgressBar$SavedState.class */
    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f110308a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/EditCircleProgressBar$SavedState$a.class */
        public final class a implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, com.bilibili.studio.videoeditor.widgets.EditCircleProgressBar$SavedState] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f110308a = parcel.readInt();
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
            parcel.writeInt(this.f110308a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/EditCircleProgressBar$a.class */
    public static final class a implements b {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/EditCircleProgressBar$b.class */
    public interface b {
    }

    public EditCircleProgressBar(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [com.bilibili.studio.videoeditor.widgets.EditCircleProgressBar$b, java.lang.Object] */
    public EditCircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f110285a = new RectF();
        this.f110286b = new Rect();
        Paint paint = new Paint(1);
        this.f110287c = paint;
        Paint paint2 = new Paint(1);
        this.f110288d = paint2;
        Paint paint3 = new Paint(1);
        this.f110289e = paint3;
        TextPaint textPaint = new TextPaint(1);
        this.f110290f = textPaint;
        this.f110294k = 100;
        this.f110304u = new Object();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f110268e);
        this.f110295l = typedArrayObtainStyledAttributes.getColor(0, 0);
        this.f110296m = typedArrayObtainStyledAttributes.getInt(1, 45);
        this.f110305v = typedArrayObtainStyledAttributes.getInt(11, 0);
        this.f110306w = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f110307x = typedArrayObtainStyledAttributes.hasValue(7) ? Paint.Cap.values()[typedArrayObtainStyledAttributes.getInt(7, 0)] : Paint.Cap.BUTT;
        this.f110297n = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, DensityUtil.dp2px(getContext(), 4.0f));
        this.f110299p = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, DensityUtil.dp2px(getContext(), 11.0f));
        this.f110298o = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, DensityUtil.dp2px(getContext(), 1.0f));
        this.f110300q = typedArrayObtainStyledAttributes.getColor(6, getResources().getColor(2131104346));
        this.f110301r = typedArrayObtainStyledAttributes.getColor(4, getResources().getColor(2131104346));
        this.f110302s = typedArrayObtainStyledAttributes.getColor(9, getResources().getColor(2131104346));
        this.f110303t = typedArrayObtainStyledAttributes.getColor(3, -1);
        typedArrayObtainStyledAttributes.recycle();
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(this.f110299p);
        paint.setStyle(this.f110305v == 1 ? Paint.Style.FILL : Paint.Style.STROKE);
        paint.setStrokeWidth(this.f110298o);
        paint.setColor(this.f110300q);
        paint.setStrokeCap(this.f110307x);
        paint2.setStyle(this.f110305v == 1 ? Paint.Style.FILL : Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f110298o);
        paint2.setColor(this.f110303t);
        paint2.setStrokeCap(this.f110307x);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(this.f110295l);
    }

    public final void a(Canvas canvas) {
        int i7 = this.f110305v;
        if (i7 == 1) {
            canvas.drawArc(this.f110285a, -90.0f, 360.0f, false, this.f110288d);
            canvas.drawArc(this.f110285a, -90.0f, (this.f110293j * 360.0f) / this.f110294k, true, this.f110287c);
            return;
        }
        if (i7 == 2) {
            canvas.drawArc(this.f110285a, -90.0f, 360.0f, false, this.f110288d);
            canvas.drawArc(this.f110285a, -90.0f, (this.f110293j * 360.0f) / this.f110294k, false, this.f110287c);
            return;
        }
        int i8 = this.f110296m;
        float f7 = (float) (6.283185307179586d / ((double) i8));
        float f8 = this.f110291g;
        float f9 = f8 - this.f110297n;
        int i9 = (int) ((this.f110293j / this.f110294k) * i8);
        for (int i10 = 0; i10 < this.f110296m; i10++) {
            double d7 = i10 * f7;
            float fSin = (((float) Math.sin(d7)) * f9) + this.h;
            float fCos = this.h - (((float) Math.cos(d7)) * f9);
            float fSin2 = (((float) Math.sin(d7)) * f8) + this.h;
            float fCos2 = this.h - (((float) Math.cos(d7)) * f8);
            if (i10 < i9) {
                canvas.drawLine(fSin, fCos, fSin2, fCos2, this.f110287c);
            } else {
                canvas.drawLine(fSin, fCos, fSin2, fCos2, this.f110288d);
            }
        }
    }

    public final void b(Canvas canvas) {
        b bVar = this.f110304u;
        if (bVar == null) {
            return;
        }
        int i7 = this.f110293j;
        int i8 = this.f110294k;
        ((a) bVar).getClass();
        String str = String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) ((i7 / i8) * 100.0f)));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f110290f.setTextSize(this.f110299p);
        this.f110290f.setColor(this.f110302s);
        this.f110290f.getTextBounds(str, 0, str.length(), this.f110286b);
        canvas.drawText((CharSequence) str, 0, str.length(), this.h, this.f110292i + (this.f110286b.height() / 2), this.f110290f);
    }

    public final void c() {
        Shader linearGradient = null;
        if (this.f110300q == this.f110301r) {
            this.f110287c.setShader(null);
            this.f110287c.setColor(this.f110300q);
            return;
        }
        int i7 = this.f110306w;
        if (i7 == 0) {
            RectF rectF = this.f110285a;
            float f7 = rectF.left;
            linearGradient = new LinearGradient(f7, rectF.top, f7, rectF.bottom, this.f110300q, this.f110301r, Shader.TileMode.CLAMP);
        } else if (i7 == 1) {
            linearGradient = new RadialGradient(this.h, this.f110292i, this.f110291g, this.f110300q, this.f110301r, Shader.TileMode.CLAMP);
        } else if (i7 == 2) {
            double degrees = (this.f110307x == Paint.Cap.BUTT && this.f110305v == 2) ? 0.0d : Math.toDegrees((float) (((((double) this.f110298o) / 3.141592653589793d) * 2.0d) / ((double) this.f110291g)));
            linearGradient = new SweepGradient(this.h, this.f110292i, new int[]{this.f110300q, this.f110301r}, new float[]{0.0f, 1.0f});
            Matrix matrix = new Matrix();
            matrix.postRotate((float) ((-90.0d) - degrees), this.h, this.f110292i);
            linearGradient.setLocalMatrix(matrix);
        }
        this.f110287c.setShader(linearGradient);
    }

    public int getMax() {
        return this.f110294k;
    }

    public int getProgress() {
        return this.f110293j;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        synchronized (this) {
            if (this.f110295l != 0) {
                float f7 = this.h;
                canvas.drawCircle(f7, f7, this.f110291g, this.f110289e);
            }
            a(canvas);
            b(canvas);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setProgress(savedState.f110308a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, android.view.View$BaseSavedState, com.bilibili.studio.videoeditor.widgets.EditCircleProgressBar$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f110308a = this.f110293j;
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        float f7 = i7 / 2;
        this.h = f7;
        float f8 = i8 / 2;
        this.f110292i = f8;
        float fMin = Math.min(f7, f8);
        this.f110291g = fMin;
        RectF rectF = this.f110285a;
        float f9 = this.f110292i;
        rectF.top = f9 - fMin;
        rectF.bottom = f9 + fMin;
        float f10 = this.h;
        rectF.left = f10 - fMin;
        rectF.right = f10 + fMin;
        c();
        RectF rectF2 = this.f110285a;
        float f11 = this.f110298o;
        rectF2.inset(f11 / 2.0f, f11 / 2.0f);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.f110295l = i7;
        this.f110289e.setColor(i7);
        invalidate();
    }

    public void setCap(Paint.Cap cap) {
        this.f110307x = cap;
        this.f110287c.setStrokeCap(cap);
        this.f110288d.setStrokeCap(cap);
        invalidate();
    }

    public void setLineCount(int i7) {
        this.f110296m = i7;
        invalidate();
    }

    public void setLineWidth(float f7) {
        this.f110297n = f7;
        invalidate();
    }

    public void setMax(int i7) {
        this.f110294k = i7;
        invalidate();
    }

    public void setProgress(int i7) {
        this.f110293j = i7;
        invalidate();
    }

    public void setProgressBackgroundColor(int i7) {
        this.f110303t = i7;
        this.f110288d.setColor(i7);
        invalidate();
    }

    public void setProgressEndColor(int i7) {
        this.f110301r = i7;
        c();
        invalidate();
    }

    public void setProgressFormatter(b bVar) {
        this.f110304u = bVar;
        invalidate();
    }

    public void setProgressStartColor(int i7) {
        this.f110300q = i7;
        c();
        invalidate();
    }

    public void setProgressStrokeWidth(float f7) {
        this.f110298o = f7;
        this.f110285a.inset(f7 / 2.0f, f7 / 2.0f);
        invalidate();
    }

    public void setProgressTextColor(int i7) {
        this.f110302s = i7;
        invalidate();
    }

    public void setProgressTextSize(float f7) {
        this.f110299p = f7;
        invalidate();
    }

    public void setShader(int i7) {
        this.f110306w = i7;
        c();
        invalidate();
    }

    public void setStyle(int i7) {
        this.f110305v = i7;
        this.f110287c.setStyle(i7 == 1 ? Paint.Style.FILL : Paint.Style.STROKE);
        this.f110288d.setStyle(this.f110305v == 1 ? Paint.Style.FILL : Paint.Style.STROKE);
        invalidate();
    }
}
