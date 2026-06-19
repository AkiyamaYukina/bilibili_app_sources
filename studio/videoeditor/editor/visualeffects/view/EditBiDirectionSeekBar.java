package com.bilibili.studio.videoeditor.editor.visualeffects.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import com.bilibili.studio.videoeditor.util.K;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.studio.videoeditor.w;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/visualeffects/view/EditBiDirectionSeekBar.class */
public class EditBiDirectionSeekBar extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Paint f109534A = new Paint(1);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f109535B = Color.parseColor("#999999");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f109536C = Color.argb(255, 251, 114, 153);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f109537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f109538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f109539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f109541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f109542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f109543g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f109544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f109545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f109546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f109547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f109548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f109549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final double f109550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final double f109551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f109552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f109553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RectF f109554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f109555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f109556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f109557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f109558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f109559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f109560y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a f109561z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/visualeffects/view/EditBiDirectionSeekBar$a.class */
    public interface a {
        default void a() {
        }

        void onProgressChanged(int i7);
    }

    public EditBiDirectionSeekBar(Context context) {
        this(context, null);
    }

    public EditBiDirectionSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f109553r = new RectF();
        this.f109554s = new RectF();
        this.f109557v = 0.0d;
        this.f109559x = 255;
        float fA = V.a(2131165827, context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f110267d, 0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(8);
        Drawable drawable2 = drawable == null ? ContextCompat.getDrawable(context, 2131234037) : drawable;
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, fA);
        int i7 = (int) dimension;
        this.f109537a = K.a(drawable2, i7, i7);
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(3);
        this.f109538b = K.a(drawable3 == null ? ContextCompat.getDrawable(context, 2131234036) : drawable3, i7, i7);
        Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(9);
        this.f109539c = K.a(drawable4 == null ? ContextCompat.getDrawable(context, 2131234038) : drawable4, i7, i7);
        this.f109550o = typedArrayObtainStyledAttributes.getFloat(5, -100.0f);
        this.f109551p = typedArrayObtainStyledAttributes.getFloat(4, 100.0f);
        int color = typedArrayObtainStyledAttributes.getColor(0, -7829368);
        this.f109542f = color;
        this.f109540d = typedArrayObtainStyledAttributes.getColor(1, f109536C);
        this.f109541e = typedArrayObtainStyledAttributes.getColor(2, f109535B);
        this.f109552q = typedArrayObtainStyledAttributes.getDimension(6, 0.0f);
        this.f109547l = typedArrayObtainStyledAttributes.getDimension(12, V.a(2131165826, context));
        this.f109548m = typedArrayObtainStyledAttributes.getDimension(11, V.a(2131165825, context));
        this.f109543g = typedArrayObtainStyledAttributes.getColor(10, color);
        typedArrayObtainStyledAttributes.recycle();
        float f7 = dimension * 0.5f;
        this.h = f7;
        this.f109544i = f7;
        if (dimension < fA) {
            this.f109560y = fA * 0.5f;
        } else {
            this.f109560y = f7;
        }
        this.f109545j = V.a(2131165824, context);
        this.f109546k = f7;
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f109549n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private void setNormalizedValue(double d7) {
        this.f109557v = Math.max(0.0d, d7);
        invalidate();
    }

    public final float a(double d7) {
        return (float) ((d7 * ((double) (getWidth() - (this.f109546k * 2.0f)))) + ((double) this.f109546k));
    }

    public final void b(MotionEvent motionEvent) {
        float x6 = motionEvent.getX(motionEvent.findPointerIndex(this.f109559x));
        double dMin = 0.0d;
        if (getWidth() > 2.0f * this.f109546k) {
            dMin = Math.min(1.0d, Math.max(0.0d, (x6 - r0) / (r0 - r0)));
        }
        setNormalizedValue(dMin);
    }

    public double getMax() {
        return this.f109551p;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f109553r.set(this.f109546k, (getHeight() - this.f109545j) * 0.5f, getWidth() - this.f109546k, (getHeight() + this.f109545j) * 0.5f);
        Paint paint = f109534A;
        paint.setColor(this.f109542f);
        float f7 = this.f109552q;
        if (f7 > 0.0f) {
            canvas.drawRoundRect(this.f109553r, f7, f7, paint);
        } else {
            canvas.drawRect(this.f109553r, paint);
        }
        double d7 = this.f109551p;
        double d8 = this.f109550o;
        double d9 = d7 - d8;
        double d10 = 0.0d;
        if (0.0d != d9) {
            d10 = (0.0d - d8) / d9;
        }
        float fA = a(d10);
        paint.setColor(this.f109543g);
        this.f109554s.set(fA - (this.f109547l * 0.5f), (getHeight() - this.f109548m) * 0.5f, (this.f109547l * 0.5f) + fA, (getHeight() + this.f109548m) * 0.5f);
        canvas.drawRect(this.f109554s, paint);
        if (fA < a(this.f109557v)) {
            RectF rectF = this.f109553r;
            rectF.left = fA;
            rectF.right = a(this.f109557v);
        } else {
            RectF rectF2 = this.f109553r;
            rectF2.right = fA;
            rectF2.left = a(this.f109557v);
        }
        if (isEnabled()) {
            paint.setColor(this.f109540d);
        } else {
            paint.setColor(this.f109541e);
        }
        float f8 = this.f109552q;
        if (f8 > 0.0f) {
            canvas.drawRoundRect(this.f109553r, f8, f8, paint);
        } else {
            canvas.drawRect(this.f109553r, paint);
        }
        canvas.drawBitmap(isEnabled() ? this.f109556u ? this.f109539c : this.f109537a : this.f109538b, a(this.f109557v) - this.h, (getHeight() * 0.5f) - this.f109544i, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        synchronized (this) {
            int size = View.MeasureSpec.getMode(i7) != 0 ? View.MeasureSpec.getSize(i7) : 200;
            int height = this.f109537a.getHeight();
            int iMin = height;
            if (View.MeasureSpec.getMode(i8) != 0) {
                iMin = Math.min(height, View.MeasureSpec.getSize(i8));
            }
            setMeasuredDimension(size, iMin);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6 = false;
        int i7 = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            int pointerId = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            this.f109559x = pointerId;
            float x6 = motionEvent.getX(motionEvent.findPointerIndex(pointerId));
            this.f109558w = x6;
            if (Math.abs(x6 - a(this.f109557v)) <= this.f109560y) {
                z6 = true;
            }
            this.f109556u = z6;
            if (!z6) {
                return super.onTouchEvent(motionEvent);
            }
            setPressed(true);
            invalidate();
            this.f109555t = true;
            b(motionEvent);
            if (getParent() == null) {
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if (action == 1) {
            if (this.f109555t) {
                b(motionEvent);
                this.f109555t = false;
                a aVar = this.f109561z;
                if (aVar != null) {
                    aVar.a();
                }
                setPressed(false);
            } else {
                this.f109555t = true;
                b(motionEvent);
                this.f109555t = false;
                a aVar2 = this.f109561z;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
            this.f109556u = false;
            invalidate();
            a aVar3 = this.f109561z;
            if (aVar3 == null) {
                return true;
            }
            double d7 = this.f109557v;
            double d8 = this.f109550o;
            aVar3.onProgressChanged((int) F0.a.a(this.f109551p, d8, d7, d8));
            return true;
        }
        if (action == 2) {
            if (!this.f109556u) {
                return true;
            }
            if (this.f109555t) {
                b(motionEvent);
            } else if (Math.abs(motionEvent.getX(motionEvent.findPointerIndex(this.f109559x)) - this.f109558w) > this.f109549n) {
                setPressed(true);
                invalidate();
                this.f109555t = true;
                b(motionEvent);
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            a aVar4 = this.f109561z;
            if (aVar4 == null) {
                return true;
            }
            double d9 = this.f109557v;
            double d10 = this.f109550o;
            aVar4.onProgressChanged((int) F0.a.a(this.f109551p, d10, d9, d10));
            return true;
        }
        if (action == 3) {
            if (this.f109555t) {
                this.f109555t = false;
                a aVar5 = this.f109561z;
                if (aVar5 != null) {
                    aVar5.a();
                }
                setPressed(false);
            }
            invalidate();
            return true;
        }
        if (action == 5) {
            int pointerCount = motionEvent.getPointerCount() - 1;
            this.f109558w = motionEvent.getX(pointerCount);
            this.f109559x = motionEvent.getPointerId(pointerCount);
            invalidate();
            return true;
        }
        if (action != 6) {
            return true;
        }
        int action2 = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action2) == this.f109559x) {
            if (action2 == 0) {
                i7 = 1;
            }
            this.f109558w = motionEvent.getX(i7);
            this.f109559x = motionEvent.getPointerId(i7);
        }
        invalidate();
        return true;
    }

    public void setOnSeekBarChangeListener(a aVar) {
        this.f109561z = aVar;
    }

    public void setProgress(double d7) {
        double d8 = this.f109551p;
        double d9 = this.f109550o;
        double d10 = d8 - d9;
        double d11 = 0.0d == d10 ? 0.0d : (d7 - d9) / d10;
        if (d11 > d8 || d11 < d9) {
            throw new IllegalArgumentException("Value should be in the middle of max and min value");
        }
        this.f109557v = d11;
        invalidate();
    }
}
