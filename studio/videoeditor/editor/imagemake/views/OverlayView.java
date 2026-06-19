package com.bilibili.studio.videoeditor.editor.imagemake.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/imagemake/views/OverlayView.class */
public class OverlayView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f109497A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public b f109498B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f109499C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f109500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f109501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f109502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f109503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f109504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f109505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f109506g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f109507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f109508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f109509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f109510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f109511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Path f109512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f109513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f109514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint f109515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Paint f109516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f109517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f109518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f109519u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f109520v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f109521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f109522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f109523y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a f109524z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/imagemake/views/OverlayView$a.class */
    public interface a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/imagemake/views/OverlayView$b.class */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<OverlayView> f109525a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f109528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f109529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f109530f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f109527c = System.currentTimeMillis() + 200;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f109526b = 300;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Matrix f109531g = new Matrix();
        public float h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f109532i = 0.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f109533j = 0.0f;

        public b(OverlayView overlayView, float f7, float f8, float f9) {
            this.f109525a = new WeakReference<>(overlayView);
            this.f109528d = f7 - 1.0f;
            this.f109529e = f8;
            this.f109530f = f9;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverlayView overlayView = this.f109525a.get();
            RectF cropViewRect = overlayView.getCropViewRect();
            float fMin = Math.min(this.f109526b, System.currentTimeMillis() - this.f109527c);
            float fA = pC0.a.a(fMin, this.f109528d, this.f109526b) + 1.0f;
            float f7 = fA / this.h;
            this.h = fA;
            float fA2 = pC0.a.a(fMin, this.f109529e, this.f109526b);
            float f8 = fA2 - this.f109532i;
            this.f109532i = fA2;
            float fA3 = pC0.a.a(fMin, this.f109530f, this.f109526b);
            float f9 = fA3 - this.f109533j;
            this.f109533j = fA3;
            this.f109531g.reset();
            if (fMin >= this.f109526b) {
                overlayView.a();
                overlayView.postInvalidate();
                return;
            }
            this.f109531g.setTranslate(f8, f9);
            this.f109531g.mapRect(cropViewRect);
            this.f109531g.setScale(f7, f7, cropViewRect.centerX(), cropViewRect.centerY());
            this.f109531g.mapRect(cropViewRect);
            overlayView.a();
            overlayView.postInvalidate();
            GestureCropImageView gestureCropImageView = overlayView.f109524z.a.f109467a;
            gestureCropImageView.f125923x.set(cropViewRect.left, cropViewRect.top, cropViewRect.right, cropViewRect.bottom);
            if (gestureCropImageView.getCurrentScale() * f7 <= gestureCropImageView.getMaxScale()) {
                gestureCropImageView.u(f8, f9);
                gestureCropImageView.t(f7, gestureCropImageView.f125923x.centerX(), gestureCropImageView.f125923x.centerY());
            } else {
                gestureCropImageView.setImageToWrapCropBounds(false);
            }
            overlayView.post(this);
        }
    }

    public OverlayView(Context context) {
        this(context, null);
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f109500a = new RectF();
        this.f109501b = new RectF();
        this.f109507i = null;
        this.f109512n = new Path();
        this.f109513o = new Paint(1);
        this.f109514p = new Paint(1);
        this.f109515q = new Paint(1);
        this.f109516r = new Paint(1);
        this.f109517s = 0;
        this.f109518t = -1.0f;
        this.f109519u = -1.0f;
        this.f109520v = -1;
        this.f109499C = false;
        this.f109521w = getResources().getDimensionPixelSize(2131165930);
        this.f109522x = getResources().getDimensionPixelSize(2131165931);
    }

    public final void a() {
        RectF rectF = this.f109500a;
        float f7 = rectF.left;
        float f8 = rectF.top;
        float f9 = rectF.right;
        float f10 = rectF.bottom;
        this.f109504e = new float[]{f7, f8, f9, f8, f9, f10, f7, f10};
        rectF.centerX();
        rectF.centerY();
        this.f109507i = null;
        this.f109512n.reset();
        this.f109512n.addCircle(this.f109500a.centerX(), this.f109500a.centerY(), Math.min(this.f109500a.width(), this.f109500a.height()) / 2.0f, Path.Direction.CW);
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.f109500a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        int i8;
        super.onDraw(canvas);
        canvas.save();
        if (this.f109510l) {
            canvas.clipPath(this.f109512n, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f109500a, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f109511m);
        canvas.restore();
        if (this.f109510l) {
            canvas.drawCircle(this.f109500a.centerX(), this.f109500a.centerY(), Math.min(this.f109500a.width(), this.f109500a.height()) / 2.0f, this.f109513o);
        }
        if (this.f109517s == 2) {
            return;
        }
        if (this.f109509k) {
            if (this.f109507i == null && !this.f109500a.isEmpty()) {
                this.f109507i = new float[(this.f109506g * 4) + (this.f109505f * 4)];
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int i11 = i10;
                    i7 = 0;
                    i8 = i11;
                    if (i9 >= this.f109505f) {
                        break;
                    }
                    float[] fArr = this.f109507i;
                    RectF rectF = this.f109500a;
                    fArr[i11] = rectF.left;
                    float fHeight = rectF.height();
                    float f7 = i9 + 1.0f;
                    float f8 = f7 / (this.f109505f + 1);
                    RectF rectF2 = this.f109500a;
                    fArr[i11 + 1] = (f8 * fHeight) + rectF2.top;
                    float[] fArr2 = this.f109507i;
                    fArr2[i11 + 2] = rectF2.right;
                    i10 = i11 + 4;
                    fArr2[i11 + 3] = ((f7 / (this.f109505f + 1)) * rectF2.height()) + this.f109500a.top;
                    i9++;
                }
                while (true) {
                    int i12 = i8;
                    if (i7 >= this.f109506g) {
                        break;
                    }
                    float[] fArr3 = this.f109507i;
                    float fWidth = this.f109500a.width();
                    float f9 = i7 + 1.0f;
                    float f10 = f9 / (this.f109506g + 1);
                    RectF rectF3 = this.f109500a;
                    fArr3[i12] = (f10 * fWidth) + rectF3.left;
                    float[] fArr4 = this.f109507i;
                    fArr4[i12 + 1] = rectF3.top;
                    float fWidth2 = rectF3.width();
                    float f11 = f9 / (this.f109506g + 1);
                    RectF rectF4 = this.f109500a;
                    fArr4[i12 + 2] = (f11 * fWidth2) + rectF4.left;
                    i8 = i12 + 4;
                    this.f109507i[i12 + 3] = rectF4.bottom;
                    i7++;
                }
            }
            float[] fArr5 = this.f109507i;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f109514p);
            }
        }
        if (this.f109508j) {
            canvas.drawRect(this.f109500a, this.f109515q);
        }
        if (this.f109517s == 1) {
            canvas.save();
            RectF rectF5 = this.f109500a;
            canvas.drawCircle(rectF5.left, rectF5.top, this.f109523y, this.f109516r);
            RectF rectF6 = this.f109500a;
            canvas.drawCircle(rectF6.right, rectF6.top, this.f109523y, this.f109516r);
            RectF rectF7 = this.f109500a;
            canvas.drawCircle(rectF7.left, rectF7.bottom, this.f109523y, this.f109516r);
            RectF rectF8 = this.f109500a;
            canvas.drawCircle(rectF8.right, rectF8.bottom, this.f109523y, this.f109516r);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (z6) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int i11 = (width - paddingRight) - paddingLeft;
            if (i11 != this.f109502c || height - paddingTop != this.f109503d) {
                this.f109497A = true;
            }
            this.f109502c = i11;
            this.f109503d = height - paddingTop;
            if (this.f109497A) {
                this.f109497A = false;
                setTargetAspectRatio(this.h);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f109500a.isEmpty() || this.f109517s != 1) {
            return false;
        }
        if ((motionEvent.getAction() & 255) == 0) {
            removeCallbacks(this.f109498B);
        }
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        if ((motionEvent.getAction() & 255) == 0) {
            double d7 = this.f109521w;
            int i7 = -1;
            int i8 = 0;
            while (i8 < 8) {
                double dSqrt = Math.sqrt(Math.pow(y6 - this.f109504e[i8 + 1], 2.0d) + Math.pow(x6 - this.f109504e[i8], 2.0d));
                double d8 = d7;
                if (dSqrt < d7) {
                    i7 = i8 / 2;
                    d8 = dSqrt;
                }
                i8 += 2;
                d7 = d8;
            }
            int i9 = i7;
            if (this.f109517s == 1) {
                i9 = i7;
                if (i7 < 0) {
                    i9 = i7;
                    if (this.f109500a.contains(x6, y6)) {
                        i9 = 4;
                    }
                }
            }
            this.f109520v = i9;
            boolean z6 = (i9 == -1 || i9 == 4) ? false : true;
            if (!z6) {
                this.f109518t = -1.0f;
                this.f109519u = -1.0f;
            } else if (this.f109518t < 0.0f) {
                this.f109518t = x6;
                this.f109519u = y6;
            }
            return z6;
        }
        if ((motionEvent.getAction() & 255) != 2 || motionEvent.getPointerCount() != 1 || this.f109520v == -1) {
            if ((motionEvent.getAction() & 255) != 1) {
                return false;
            }
            this.f109518t = -1.0f;
            this.f109519u = -1.0f;
            this.f109520v = -1;
            oC0.a aVar = this.f109524z;
            if (aVar != null) {
                aVar.a.f109467a.setCropRect(this.f109500a);
            }
            float fWidth = this.f109500a.width() / this.f109500a.height();
            this.h = fWidth;
            int i10 = (int) (this.f109502c / fWidth);
            RectF rectF = new RectF();
            int i11 = this.f109503d;
            if (i10 > i11) {
                int i12 = (this.f109502c - ((int) (i11 * this.h))) / 2;
                rectF.set(getPaddingLeft() + i12, getPaddingTop(), getPaddingLeft() + r0 + i12, getPaddingTop() + this.f109503d);
            } else {
                int i13 = (i11 - i10) / 2;
                rectF.set(getPaddingLeft(), getPaddingTop() + i13, getPaddingLeft() + this.f109502c, getPaddingTop() + i10 + i13);
            }
            b bVar = new b(this, rectF.width() / this.f109500a.width(), rectF.centerX() - this.f109500a.centerX(), rectF.centerY() - this.f109500a.centerY());
            this.f109498B = bVar;
            postDelayed(bVar, 200L);
            return false;
        }
        float fMin = Math.min(Math.max(x6, getPaddingLeft()), getWidth() - getPaddingRight());
        float fMin2 = Math.min(Math.max(y6, getPaddingTop()), getHeight() - getPaddingBottom());
        this.f109501b.set(this.f109500a);
        int i14 = this.f109520v;
        if (i14 == 0) {
            RectF rectF2 = this.f109501b;
            RectF rectF3 = this.f109500a;
            rectF2.set(fMin, fMin2, rectF3.right, rectF3.bottom);
        } else if (i14 == 1) {
            RectF rectF4 = this.f109501b;
            RectF rectF5 = this.f109500a;
            rectF4.set(rectF5.left, fMin2, fMin, rectF5.bottom);
        } else if (i14 == 2) {
            RectF rectF6 = this.f109501b;
            RectF rectF7 = this.f109500a;
            rectF6.set(rectF7.left, rectF7.top, fMin, fMin2);
        } else if (i14 == 3) {
            RectF rectF8 = this.f109501b;
            RectF rectF9 = this.f109500a;
            rectF8.set(fMin, rectF9.top, rectF9.right, fMin2);
        } else if (i14 == 4) {
            this.f109501b.offset(fMin - this.f109518t, fMin2 - this.f109519u);
            if (this.f109501b.left > getLeft() && this.f109501b.top > getTop() && this.f109501b.right < getRight() && this.f109501b.bottom < getBottom()) {
                this.f109500a.set(this.f109501b);
                a();
                postInvalidate();
            }
        }
        boolean z7 = this.f109501b.height() * 1.0f >= ((float) this.f109522x);
        boolean z8 = this.f109501b.width() >= ((float) this.f109522x);
        RectF rectF10 = this.f109500a;
        rectF10.set(z8 ? this.f109501b.left : rectF10.left, z7 ? this.f109501b.top : rectF10.top, z8 ? this.f109501b.right : rectF10.right, z7 ? this.f109501b.bottom : rectF10.bottom);
        oC0.a aVar2 = this.f109524z;
        if (aVar2 != null) {
            aVar2.a.f109467a.setCropRect(this.f109500a);
        }
        if (z7 || z8) {
            a();
            postInvalidate();
        }
        this.f109499C = true;
        this.f109518t = fMin;
        this.f109519u = fMin2;
        return true;
    }

    public void setCircleDimmedLayer(boolean z6) {
        this.f109510l = z6;
    }

    public void setCropFrameColor(@ColorInt int i7) {
        this.f109515q.setColor(i7);
    }

    public void setCropFrameStrokeWidth(@IntRange(from = 0) int i7) {
        this.f109515q.setStrokeWidth(i7);
    }

    public void setCropGridColor(@ColorInt int i7) {
        this.f109514p.setColor(i7);
    }

    public void setCropGridColumnCount(@IntRange(from = 0) int i7) {
        this.f109506g = i7;
        this.f109507i = null;
    }

    public void setCropGridRowCount(@IntRange(from = 0) int i7) {
        this.f109505f = i7;
        this.f109507i = null;
    }

    public void setCropGridStrokeWidth(@IntRange(from = 0) int i7) {
        this.f109514p.setStrokeWidth(i7);
    }

    public void setDimmedColor(@ColorInt int i7) {
        this.f109511m = i7;
    }

    public void setFreestyleCropMode(int i7) {
        this.f109517s = i7;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(a aVar) {
        this.f109524z = aVar;
    }

    public void setShowCropFrame(boolean z6) {
        this.f109508j = z6;
    }

    public void setShowCropGrid(boolean z6) {
        this.f109509k = z6;
    }

    public void setTargetAspectRatio(float f7) {
        this.h = f7;
        if (this.f109502c <= 0) {
            this.f109497A = true;
        } else {
            setupCropBounds(false);
            postInvalidate();
        }
    }

    public void setupCropBounds(boolean z6) {
        int i7 = this.f109502c;
        float f7 = i7;
        float f8 = this.h;
        int i8 = (int) (f7 / f8);
        int i9 = this.f109503d;
        if (i8 > i9) {
            int i10 = (i7 - ((int) (i9 * f8))) / 2;
            this.f109500a.set(getPaddingLeft() + i10, getPaddingTop(), getPaddingLeft() + r0 + i10, getPaddingTop() + this.f109503d);
        } else {
            int i11 = (i9 - i8) / 2;
            this.f109500a.set(getPaddingLeft(), getPaddingTop() + i11, getPaddingLeft() + this.f109502c, getPaddingTop() + i8 + i11);
        }
        oC0.a aVar = this.f109524z;
        if (aVar != null) {
            if (z6) {
                aVar.a.f109467a.setCropRectByRotation(this.f109500a);
            } else {
                aVar.a.f109467a.setCropRect(this.f109500a);
            }
        }
        a();
    }
}
