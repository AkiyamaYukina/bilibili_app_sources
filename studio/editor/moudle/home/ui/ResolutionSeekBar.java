package com.bilibili.studio.editor.moudle.home.ui;

import LA.f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C3237a;
import com.bilibili.studio.videoeditor.w;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/ui/ResolutionSeekBar.class */
public class ResolutionSeekBar extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public c f107267A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ValueAnimator f107268B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f107269C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f107270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f107273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f107274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f107275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f107276g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f107277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f107278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f107279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f107280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f107281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f107282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f107283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bitmap[] f107284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f107285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f107286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f107287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f107288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Paint f107289u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f107290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f107291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f107292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f107293y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f107294z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/ui/ResolutionSeekBar$a.class */
    public final class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResolutionSeekBar f107295a;

        public a(ResolutionSeekBar resolutionSeekBar) {
            this.f107295a = resolutionSeekBar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f107295a.f107293y = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f107295a.invalidate();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/ui/ResolutionSeekBar$b.class */
    public final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResolutionSeekBar f107296a;

        public b(ResolutionSeekBar resolutionSeekBar) {
            this.f107296a = resolutionSeekBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f107296a.b(false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/ui/ResolutionSeekBar$c.class */
    public interface c {
    }

    public ResolutionSeekBar(Context context) {
        this(context, null);
    }

    public ResolutionSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f107294z = true;
        ValueAnimator valueAnimatorOfInt = ObjectAnimator.ofInt(0, 1);
        this.f107268B = valueAnimatorOfInt;
        this.f107269C = new Rect();
        a aVar = new a(this);
        b bVar = new b(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.h, 0, 0);
        this.f107270a = typedArrayObtainStyledAttributes.getBoolean(0, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, a(2));
        this.f107271b = dimensionPixelSize;
        this.f107272c = typedArrayObtainStyledAttributes.getColor(14, -7829368);
        this.f107273d = typedArrayObtainStyledAttributes.getColor(16, -65536);
        int i7 = dimensionPixelSize / 2;
        this.f107274e = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, a(2) + i7);
        this.f107275f = typedArrayObtainStyledAttributes.getColor(10, -16776961);
        this.f107276g = typedArrayObtainStyledAttributes.getInteger(11, 0);
        this.h = typedArrayObtainStyledAttributes.getFloat(13, -1.0f);
        this.f107278j = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, i7);
        this.f107277i = typedArrayObtainStyledAttributes.getColor(4, -1);
        int color = typedArrayObtainStyledAttributes.getColor(6, -7829368);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, (int) f.a(12, 2));
        this.f107279k = dimensionPixelSize2;
        this.f107280l = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, a(8));
        this.f107281m = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, a(3));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(9, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f107288t = paint;
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        if (resourceId > 0) {
            String[] stringArray = getResources().getStringArray(resourceId);
            this.f107283o = stringArray;
            this.f107285q = stringArray.length;
        }
        Paint paint2 = new Paint();
        this.f107289u = paint2;
        paint2.setColor(color);
        paint2.setTextSize(dimensionPixelSize2);
        this.f107290v = (int) (paint2.getFontMetrics().bottom - paint2.getFontMetrics().top);
        this.f107291w = (int) ((paint2.getFontMetrics().ascent + paint2.getFontMetrics().descent) / 2.0f);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(aVar);
        valueAnimatorOfInt.addListener(bVar);
    }

    public static int a(int i7) {
        return (int) f.a(i7, 1);
    }

    public final void b(boolean z6) {
        jz0.b bVar = this.f107267A;
        if (bVar != null) {
            int i7 = this.f107293y;
            int i8 = i7 == this.f107286r ? this.f107285q - 1 : i7 / this.f107287s;
            String[] strArr = this.f107283o;
            if (i8 >= strArr.length) {
                return;
            }
            ExportConfigView.a(bVar.a, i8, strArr[i8], z6);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap[] bitmapArr = this.f107284p;
        if (bitmapArr != null && bitmapArr.length > 0) {
            for (Bitmap bitmap : bitmapArr) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
        this.f107284p = null;
        this.f107268B.cancel();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        int i8;
        super.onDraw(canvas);
        this.f107288t.setColor(this.f107272c);
        this.f107288t.setStrokeWidth(this.f107271b);
        String[] strArr = this.f107283o;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        int iRound = Math.round(this.f107289u.measureText(strArr[0])) / 2;
        float f7 = iRound;
        int i9 = this.f107274e;
        canvas.drawLine(f7, i9, this.f107286r + i9, i9, this.f107288t);
        this.f107288t.setColor(this.f107273d);
        int i10 = this.f107274e;
        canvas.drawLine(f7, i10, this.f107293y + i10, i10, this.f107288t);
        int i11 = this.f107274e;
        int i12 = this.f107280l;
        int i13 = this.f107290v;
        int iA = C3237a.a(i13, this.f107279k, 2, (i11 * 2) + i12);
        int i14 = ((i13 / 2) + ((i11 * 2) + i12)) - this.f107291w;
        this.f107288t.setColor(this.f107277i);
        int i15 = 0;
        while (true) {
            int i16 = this.f107285q;
            if (i15 >= i16) {
                this.f107288t.setColor(this.f107275f);
                float f8 = iRound + this.f107293y;
                int i17 = this.f107274e;
                canvas.drawCircle(f8, i17, i17, this.f107288t);
                return;
            }
            int i18 = i15 == 0 ? iRound : i15 == i16 - 1 ? (this.f107286r + iRound) - (this.f107278j * 2) : (this.f107287s * i15) + iRound;
            canvas.drawCircle(i18, i11, this.f107278j, this.f107288t);
            Bitmap[] bitmapArr = this.f107284p;
            if (bitmapArr == null || bitmapArr.length <= i15 || bitmapArr[i15] == null) {
                int iRound2 = Math.round(this.f107289u.measureText(this.f107283o[i15]));
                if (i15 == 0) {
                    i7 = 0;
                } else {
                    if (i15 != this.f107285q - 1) {
                        iRound2 /= 2;
                    }
                    i7 = i18 - iRound2;
                }
                canvas.drawText(this.f107283o[i15], i7, i14, this.f107289u);
            } else {
                int iRound3 = Math.round(this.f107289u.measureText(this.f107283o[i15]));
                int width = this.f107284p[i15].getWidth();
                if (i15 == 0) {
                    i8 = iRound3 / 2;
                } else if (i15 == this.f107285q - 1) {
                    i18 -= width;
                    i8 = (this.f107281m + iRound3) / 2;
                } else {
                    i18 -= (width + iRound3) / 2;
                    i8 = this.f107281m;
                }
                int i19 = i18 - i8;
                int i20 = iRound3 + i19 + this.f107281m;
                canvas.drawText(this.f107283o[i15], i19, i14, this.f107289u);
                this.f107269C.set(i20, iA, width + i20, i14);
                canvas.drawBitmap(this.f107284p[i15], (Rect) null, this.f107269C, this.f107288t);
            }
            i15++;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        int width = getWidth() - (a(14) * 2);
        this.f107286r = width;
        int i11 = this.f107285q;
        if (i11 > 2) {
            this.f107287s = width / (i11 - 1);
        }
        if (this.f107294z) {
            if (this.f107270a) {
                setThumbOffsetByValue(this.h);
            } else {
                setThumbOffsetByIndex(this.f107276g);
            }
        }
        this.f107294z = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            size = 0;
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode2 != 1073741824) {
            int paddingBottom = getPaddingBottom() + getPaddingTop() + (this.f107274e * 2) + this.f107290v + this.f107280l;
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(paddingBottom, size2) : paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e A[PHI: r10
  0x013e: PHI (r10v7 int) = (r10v3 int), (r10v4 int) binds: [B:40:0x013b, B:43:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.home.ui.ResolutionSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentThumbIndex(int i7) {
        this.f107276g = i7;
        if (this.f107287s > 0) {
            setThumbOffsetByIndex(i7);
            invalidate();
        }
    }

    public void setCurrentThumbValue(float f7) {
        this.h = f7;
        if (this.f107287s > 0) {
            setThumbOffsetByValue(f7);
            invalidate();
        }
    }

    public void setIconsBitmap(Bitmap[] bitmapArr) {
        this.f107284p = bitmapArr;
    }

    public void setOnThumbIndexChangedListener(c cVar) {
        this.f107267A = cVar;
    }

    public void setSectionTexts(String[] strArr) {
        this.f107283o = strArr;
        this.f107285q = strArr.length;
    }

    public void setThumbOffsetByIndex(int i7) {
        int i8 = this.f107287s;
        if (i8 > 0) {
            if (i7 >= this.f107285q - 1) {
                this.f107293y = this.f107286r;
            } else if (i7 <= 0) {
                this.f107293y = 0;
            } else {
                this.f107293y = i7 * i8;
            }
        }
    }

    public void setThumbOffsetByValue(float f7) {
        float f8;
        float f9;
        String[] strArr;
        float f10;
        float f11;
        if (this.f107287s > 0) {
            float f12 = 0.0f;
            try {
                f8 = Float.parseFloat(this.f107283o[this.f107285q - 1]);
            } catch (Exception e7) {
                f8 = 0.0f;
            }
            if (f7 >= f8) {
                this.f107293y = this.f107286r;
                return;
            }
            int i7 = 0;
            try {
                f9 = Float.parseFloat(this.f107283o[0]);
            } catch (Exception e8) {
                f9 = 0.0f;
            }
            if (f7 <= f9) {
                this.f107293y = 0;
                return;
            }
            int i8 = 0;
            while (true) {
                strArr = this.f107283o;
                if (i7 >= strArr.length) {
                    break;
                }
                try {
                    f11 = Float.parseFloat(strArr[i7]);
                } catch (Exception e9) {
                    f11 = 0.0f;
                }
                if (f7 >= f11) {
                    i8 = i7;
                }
                i7++;
            }
            if (i8 >= this.f107285q - 1) {
                this.f107293y = this.f107286r;
                return;
            }
            try {
                f10 = Float.parseFloat(strArr[i8]);
            } catch (Exception e10) {
                f10 = 0.0f;
            }
            try {
                f12 = Float.parseFloat(this.f107283o[i8 + 1]);
            } catch (Exception e11) {
            }
            this.f107293y = (int) (((((f7 - f10) * 1.0f) / (f12 - f10)) * this.f107287s) + (i8 * r0));
        }
    }

    public void setValueWithAnimate(int i7) {
        if (this.f107287s == 0) {
            return;
        }
        int i8 = this.f107293y;
        setThumbOffsetByIndex(i7);
        int i9 = this.f107293y;
        int i10 = this.f107287s;
        int i11 = i9 / i10;
        if (i11 >= this.f107285q) {
            b(false);
            return;
        }
        int i12 = i11 * i10;
        if (i8 == i12) {
            return;
        }
        this.f107268B.setIntValues(i8, i12);
        if (this.f107268B.isStarted()) {
            this.f107268B.cancel();
        }
        this.f107268B.start();
    }
}
