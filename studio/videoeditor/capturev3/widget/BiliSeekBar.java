package com.bilibili.studio.videoeditor.capturev3.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.bilibili.studio.videoeditor.w;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/BiliSeekBar.class */
public final class BiliSeekBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f109326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f109327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f109330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f109331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f109332g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f109333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f109334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f109335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f109336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f109337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f109338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f109339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f109340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f109341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f109342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f109343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f109344t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final RectF f109345u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f109346v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public a f109347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public b f109348x;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/BiliSeekBar$a.class */
    public interface a {
        void a(int i7, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/BiliSeekBar$b.class */
    public interface b {
        void a();

        void b();
    }

    public BiliSeekBar(@NotNull Context context) {
        this(context, null);
    }

    public BiliSeekBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.f109326a = paint;
        this.f109329d = -65536;
        this.f109331f = 100;
        this.f109333i = 30.0f;
        this.f109334j = ViewCompat.MEASURED_STATE_MASK;
        this.f109335k = ViewCompat.MEASURED_STATE_MASK;
        this.f109336l = 8.0f;
        this.f109337m = -7829368;
        this.f109338n = -65536;
        this.f109339o = -65536;
        this.f109340p = 40.0f;
        this.f109341q = 8.0f;
        this.f109342r = -65536;
        this.f109343s = -65536;
        this.f109345u = new RectF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, w.f110266c);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 12);
            int integer = typedArrayObtainStyledAttributes.getInteger(17, 0);
            this.f109328c = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 4);
            this.f109329d = typedArrayObtainStyledAttributes.getColor(14, -1);
            this.f109341q = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 100);
            this.f109342r = typedArrayObtainStyledAttributes.getColor(18, -65536);
            this.f109343s = typedArrayObtainStyledAttributes.getColor(6, -65536);
            this.f109330e = typedArrayObtainStyledAttributes.getInt(11, 0);
            this.f109331f = typedArrayObtainStyledAttributes.getInt(10, 100);
            this.f109332g = typedArrayObtainStyledAttributes.getInt(8, 0);
            this.f109333i = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
            this.f109334j = typedArrayObtainStyledAttributes.getColor(7, ViewCompat.MEASURED_STATE_MASK);
            this.f109335k = typedArrayObtainStyledAttributes.getColor(5, ViewCompat.MEASURED_STATE_MASK);
            this.h = typedArrayObtainStyledAttributes.getBoolean(13, false);
            this.f109340p = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 20);
            this.f109336l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 4);
            this.f109337m = typedArrayObtainStyledAttributes.getColor(0, -7829368);
            this.f109338n = typedArrayObtainStyledAttributes.getColor(1, -65536);
            this.f109339o = typedArrayObtainStyledAttributes.getColor(4, -65536);
            int i7 = typedArrayObtainStyledAttributes.getInt(12, this.f109330e);
            typedArrayObtainStyledAttributes.recycle();
            paint.setTextSize(dimensionPixelSize);
            paint.setFakeBoldText((integer & 1) != 0);
            paint.setTextSkewX((integer & 2) != 0 ? -0.25f : 0.0f);
            b(i7, false);
        }
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.f109327b = fontMetrics.descent - fontMetrics.ascent;
    }

    private final float getThumbStartX() {
        return (this.f109330e >= 0 || this.f109331f <= 0) ? getPaddingLeft() : a(0);
    }

    public final float a(int i7) {
        int i8 = this.f109330e;
        return (((i7 - i8) / (this.f109331f - i8)) * ((getWidth() - getPaddingLeft()) - getPaddingRight())) + getPaddingLeft();
    }

    public final void b(int i7, boolean z6) {
        int i8 = this.f109330e;
        if (i7 >= i8) {
            i8 = this.f109331f;
            if (i7 <= i8) {
                i8 = i7;
            }
        }
        if (i8 == this.f109346v) {
            return;
        }
        this.f109346v = i8;
        postInvalidate();
        a aVar = this.f109347w;
        if (aVar != null) {
            aVar.a(i7, z6);
        }
    }

    public final void c(MotionEvent motionEvent) {
        int iRoundToInt = MathKt.roundToInt(motionEvent.getX());
        float paddingLeft = iRoundToInt < getPaddingLeft() ? 0.0f : iRoundToInt > getWidth() - getPaddingRight() ? 1.0f : (iRoundToInt - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        int i7 = this.f109331f;
        b(MathKt.roundToInt((paddingLeft * (i7 - r0)) + this.f109330e), true);
    }

    public final int getMax() {
        return this.f109331f;
    }

    @Nullable
    public final a getOnProgressChangedListener() {
        return this.f109347w;
    }

    @Nullable
    public final b getOnTrackingChangedListener() {
        return this.f109348x;
    }

    public final int getProgress() {
        return this.f109346v;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        canvas.translate(0.0f, getPaddingTop());
        RectF rectF = this.f109345u;
        float f7 = this.f109340p;
        float f8 = -f7;
        float f9 = 2;
        rectF.top = f8 / f9;
        rectF.bottom = f7 / f9;
        float fA = a(this.f109346v);
        this.f109326a.setColor(this.f109329d);
        canvas.drawText(String.valueOf(this.f109346v), fA, this.f109327b, this.f109326a);
        canvas.translate(0.0f, this.f109341q + this.f109327b + this.f109328c);
        this.f109326a.setColor(this.f109337m);
        this.f109345u.left = getPaddingLeft();
        this.f109345u.right = canvas.getWidth() - getPaddingRight();
        RectF rectF2 = this.f109345u;
        float f10 = this.f109336l;
        canvas.drawRoundRect(rectF2, f10, f10, this.f109326a);
        if (isEnabled()) {
            this.f109326a.setColor(this.f109338n);
        } else {
            this.f109326a.setColor(this.f109339o);
        }
        float thumbStartX = getThumbStartX();
        if (fA - thumbStartX < 0.0f) {
            RectF rectF3 = this.f109345u;
            rectF3.left = fA;
            rectF3.right = thumbStartX;
        } else {
            RectF rectF4 = this.f109345u;
            rectF4.left = thumbStartX;
            rectF4.right = fA;
        }
        RectF rectF5 = this.f109345u;
        float f11 = this.f109336l;
        canvas.drawRoundRect(rectF5, f11, f11, this.f109326a);
        if (this.h) {
            if (isEnabled()) {
                this.f109326a.setColor(this.f109334j);
            } else {
                this.f109326a.setColor(this.f109335k);
            }
            canvas.drawCircle(a(this.f109332g), 0.0f, this.f109333i, this.f109326a);
        }
        if (isEnabled()) {
            this.f109326a.setColor(this.f109342r);
        } else {
            this.f109326a.setColor(this.f109343s);
        }
        canvas.drawCircle(fA, 0.0f, this.f109341q, this.f109326a);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        float f7 = this.f109341q;
        float f8 = 2;
        float f9 = this.f109327b;
        float f10 = this.f109328c;
        setMeasuredDimension(View.resolveSizeAndState((int) ((this.f109341q * f8) + getPaddingLeft() + getPaddingRight()), i7, 0), View.resolveSizeAndState((int) ((f7 * f8) + f9 + f10 + getPaddingTop() + getPaddingBottom()), i8, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            setPressed(true);
            this.f109344t = true;
            b bVar = this.f109348x;
            if (bVar != null) {
                bVar.b();
            }
            c(motionEvent);
            ViewParent parent = getParent();
            if (parent == null) {
                return true;
            }
            parent.requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if (actionMasked == 1) {
            if (this.f109344t) {
                c(motionEvent);
                this.f109344t = false;
                b bVar2 = this.f109348x;
                if (bVar2 != null) {
                    bVar2.a();
                }
                setPressed(false);
            } else {
                this.f109344t = true;
                b bVar3 = this.f109348x;
                if (bVar3 != null) {
                    bVar3.b();
                }
                c(motionEvent);
                this.f109344t = false;
                b bVar4 = this.f109348x;
                if (bVar4 != null) {
                    bVar4.a();
                }
            }
            invalidate();
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return true;
            }
            if (this.f109344t) {
                this.f109344t = false;
                b bVar5 = this.f109348x;
                if (bVar5 != null) {
                    bVar5.a();
                }
                setPressed(false);
            }
            invalidate();
            return true;
        }
        if (this.f109344t) {
            c(motionEvent);
            return true;
        }
        setPressed(true);
        this.f109344t = true;
        b bVar6 = this.f109348x;
        if (bVar6 != null) {
            bVar6.b();
        }
        c(motionEvent);
        ViewParent parent2 = getParent();
        if (parent2 == null) {
            return true;
        }
        parent2.requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public final void setMax(int i7) {
        this.f109331f = i7;
        postInvalidate();
    }

    public final void setOnProgressChangedListener(@Nullable a aVar) {
        this.f109347w = aVar;
    }

    public final void setOnTrackingChangedListener(@Nullable b bVar) {
        this.f109348x = bVar;
    }

    public final void setProgress(int i7) {
        b(i7, false);
    }
}
