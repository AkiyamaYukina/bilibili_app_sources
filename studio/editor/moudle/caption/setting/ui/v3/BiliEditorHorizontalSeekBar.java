package com.bilibili.studio.editor.moudle.caption.setting.ui.v3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.o;
import androidx.core.view.ViewCompat;
import com.bilibili.studio.videoeditor.w;
import java.util.Arrays;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v3/BiliEditorHorizontalSeekBar.class */
public final class BiliEditorHorizontalSeekBar extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f105895A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f105896B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f105897C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f105898D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f105899E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f105900F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f105901G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f105902H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f105903I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f105904J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f105905K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f105906L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f105907M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f105908N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f105909O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f105910P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f105911Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final String f105912R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f105913S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @NotNull
    public final String f105914T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f105915U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f105916V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @Nullable
    public Paint f105917W;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public int f105918X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public boolean f105919Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public int f105920Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105921a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public Paint f105922a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f105923a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105924b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f105925b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105926c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Nullable
    public Paint f105927c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f105928c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f105929d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f105930d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f105931e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @Nullable
    public a f105932e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f105933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f105934g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f105935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f105936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f105937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f105938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f105939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f105940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f105941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f105942p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Paint f105943p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f105944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f105945r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f105946r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f105947s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f105948t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f105949u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f105950v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f105951v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f105952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f105953x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Bitmap f105954y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public Bitmap f105955z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v3/BiliEditorHorizontalSeekBar$a.class */
    public interface a {
        void a(float f7, float f8);

        void b(float f7, float f8, @Nullable Boolean bool);
    }

    @JvmOverloads
    public BiliEditorHorizontalSeekBar(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public BiliEditorHorizontalSeekBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BiliEditorHorizontalSeekBar(Context context, AttributeSet attributeSet, int i7) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f105921a = 1;
        this.f105924b = 2;
        this.f105926c = 3;
        this.f105929d = 0;
        this.f105933f = 400;
        this.f105947s = -16776961;
        this.f105948t = -16776961;
        this.f105949u = -16776961;
        this.f105950v = -16776961;
        this.f105952w = -16776961;
        this.f105953x = -16776961;
        int i8 = this.f105901G;
        this.f105905K = i8;
        this.f105907M = 400 + i8;
        this.f105908N = 100;
        this.f105912R = " ";
        this.f105913S = 20;
        this.f105914T = " ";
        this.f105915U = 20;
        this.f105916V = 20;
        this.f105918X0 = -1;
        this.f105920Z0 = -1;
        this.f105928c1 = true;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w.f110265b, 0, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i9);
            if (index == 2) {
                this.f105901G = (int) typedArrayObtainStyledAttributes.getDimension(index, b(getContext(), 10.0f));
            } else if (index == 3) {
                this.f105902H = (int) typedArrayObtainStyledAttributes.getDimension(index, b(getContext(), 10.0f));
            } else if (index == 4) {
                this.f105903I = (int) typedArrayObtainStyledAttributes.getDimension(index, b(getContext(), 10.0f));
            } else if (index == 1) {
                this.f105904J = (int) typedArrayObtainStyledAttributes.getDimension(index, b(getContext(), 10.0f));
            } else if (index == 13) {
                this.f105947s = typedArrayObtainStyledAttributes.getColor(index, ViewCompat.MEASURED_STATE_MASK);
            } else if (index == 0) {
                this.f105931e = (int) typedArrayObtainStyledAttributes.getDimension(index, b(getContext(), 10.0f));
            } else if (index == 14) {
                this.f105948t = typedArrayObtainStyledAttributes.getColor(index, -256);
            } else if (index == 20) {
                this.f105949u = typedArrayObtainStyledAttributes.getColor(index, -256);
            } else if (index == 18) {
                this.f105950v = typedArrayObtainStyledAttributes.getColor(index, -256);
            } else if (index == 15) {
                this.f105941o = typedArrayObtainStyledAttributes.getColor(index, -16776961);
            } else if (index == 16) {
                this.f105940n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics()));
            } else if (index == 21) {
                this.f105944q = typedArrayObtainStyledAttributes.getColor(index, -16776961);
            } else if (index == 22) {
                this.f105942p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics()));
            } else if (index == 19) {
                this.f105945r = typedArrayObtainStyledAttributes.getColor(index, -16776961);
            } else if (index == 9) {
                this.f105954y = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(index, 0));
            } else if (index == 11) {
                this.f105955z = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(index, 0));
            } else if (index == 8) {
                this.f105936j = (int) typedArrayObtainStyledAttributes.getDimension(index, b(getContext(), 20.0f));
            } else if (index == 12) {
                this.h = (int) typedArrayObtainStyledAttributes.getDimension(index, b(getContext(), 20.0f));
            } else if (index == 10) {
                this.f105935i = (int) typedArrayObtainStyledAttributes.getDimension(index, b(getContext(), 0.0f));
            } else if (index == 7) {
                this.f105937k = typedArrayObtainStyledAttributes.getBoolean(index, false);
            } else if (index == 23) {
                this.f105952w = typedArrayObtainStyledAttributes.getColor(index, -16776961);
            } else if (index == 25) {
                this.f105953x = typedArrayObtainStyledAttributes.getColor(index, -16776961);
            } else {
                if (index == 29) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f105912R = string != null ? string : "";
                } else if (index == 6) {
                    this.f105913S = typedArrayObtainStyledAttributes.getInt(index, 10);
                } else if (index == 27) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f105914T = string2 != null ? string2 : "";
                } else if (index == 26) {
                    this.f105915U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) TypedValue.applyDimension(2, 16.0f, getResources().getDisplayMetrics()));
                } else if (index == 24) {
                    this.f105916V = (int) typedArrayObtainStyledAttributes.getDimension(index, b(getContext(), 10.0f));
                } else if (index == 5) {
                    this.f105908N = typedArrayObtainStyledAttributes.getInteger(index, 100);
                } else if (index == 28) {
                    this.f105909O = typedArrayObtainStyledAttributes.getInteger(index, 100);
                } else if (index == 17) {
                    this.f105933f = (int) typedArrayObtainStyledAttributes.getDimension(index, b(getContext(), 10.0f));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f105895A = this.f105905K;
        this.f105896B = this.f105907M;
        this.f105910P = this.f105909O;
        this.f105911Q = this.f105908N;
        int iMax = (int) Math.max(this.f105940n, this.f105942p);
        this.f105903I = this.f105937k ? (int) (Math.max(iMax, this.f105916V + this.f105915U) + ((double) this.f105903I)) : iMax + this.f105903I;
        Bitmap bitmap = this.f105954y;
        if (bitmap == null && this.f105955z == null) {
            return;
        }
        this.f105929d = (this.f105955z == null || bitmap == null) ? bitmap != null ? this.f105921a : this.f105924b : this.f105926c;
        if (bitmap != null) {
            this.f105954y = a(this.h, this.f105936j, bitmap);
        }
        Bitmap bitmap2 = this.f105955z;
        if (bitmap2 != null) {
            this.f105955z = a(this.h, this.f105936j, bitmap2);
        }
    }

    public static Bitmap a(int i7, int i8, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(i7 / bitmap.getWidth(), i8 / bitmap.getHeight());
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static int b(@NotNull Context context, float f7) {
        return (int) ((f7 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void c(int i7, boolean z6) {
        this.f105919Y0 = z6;
        if (this.f105918X0 == i7 && Math.abs((((i7 / this.f105908N) * this.f105933f) + this.f105905K) - this.f105895A) <= 10.0d) {
            this.f105928c1 = true;
            postInvalidate();
            return;
        }
        int i8 = this.f105908N;
        int i9 = i7;
        if (i7 > i8) {
            i9 = i8;
        }
        int i10 = this.f105898D;
        if (i10 + i9 >= i8) {
            i9 = i8 - i10;
            this.f105928c1 = false;
        } else {
            this.f105928c1 = true;
        }
        this.f105918X0 = i9;
        this.f105895A = ((i9 / i8) * this.f105933f) + this.f105905K;
        d(false);
        this.f105928c1 = true;
        postInvalidate();
    }

    public final void d(boolean z6) {
        float f7 = this.f105895A;
        int i7 = this.f105905K;
        float f8 = i7;
        int i8 = this.f105908N;
        float f9 = i8;
        int i9 = this.f105933f;
        float f10 = i9;
        this.f105897C = (int) (((f7 - f8) * f9) / f10);
        float f11 = this.f105896B;
        this.f105898D = (int) (f9 - (((f11 - f8) * f9) / f10));
        float f12 = i7;
        int i10 = this.f105909O;
        float f13 = ((f7 - f12) * (i8 - i10)) / i9;
        float f14 = i10;
        int i11 = this.f105899E;
        float f15 = (f13 + f14) / i11;
        this.f105910P = f15;
        float f16 = (i8 - ((((f11 - i7) * (i8 - i10)) / i9) + i10)) / i11;
        this.f105911Q = f16;
        a aVar = this.f105932e1;
        if (aVar == null || !z6) {
            return;
        }
        aVar.a(f15, f16);
        this.f105918X0 = this.f105897C;
        this.f105920Z0 = this.f105898D;
    }

    public final int getLastLeftIconId() {
        return this.f105946r0;
    }

    public final int getLeftProgress() {
        return this.f105897C;
    }

    public final int getMaxProgress() {
        return this.f105908N;
    }

    public final int getRightProgress() {
        return this.f105898D;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        int height = (getHeight() - this.f105904J) - (this.f105936j / 2);
        this.f105906L = height;
        this.f105934g = height - 50;
        if (this.f105937k) {
            if (this.f105943p0 == null) {
                this.f105943p0 = new Paint();
            }
            this.f105943p0.setStrokeWidth(1.0f);
            this.f105943p0.setTextSize(this.f105915U);
            this.f105943p0.setTextAlign(Paint.Align.CENTER);
            this.f105943p0.setAntiAlias(true);
            float f7 = this.f105909O;
            float f8 = this.f105913S;
            while (true) {
                if (f7 > this.f105908N) {
                    break;
                }
                float f9 = ((this.f105933f * f7) / (r0 - this.f105909O)) + this.f105905K;
                int i7 = this.f105906L;
                int i8 = this.f105916V;
                this.f105943p0.setColor(this.f105952w);
                float f10 = i7 - i8;
                canvas.drawLine(f9, this.f105906L, f9, f10, this.f105943p0);
                this.f105943p0.setColor(this.f105953x);
                canvas.drawText(f7 + this.f105914T, f9, f10, this.f105943p0);
                f7 += ((float) (this.f105908N - this.f105909O)) / f8;
            }
        }
        if (this.f105917W == null) {
            this.f105917W = new Paint();
        }
        this.f105917W.setAntiAlias(true);
        this.f105917W.setStrokeWidth(this.f105931e);
        this.f105917W.setColor(this.f105947s);
        Paint paint = this.f105917W;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        float f11 = this.f105895A;
        float f12 = this.f105906L;
        canvas.drawLine(f11, f12, this.f105896B, f12, this.f105917W);
        if (this.f105954y != null) {
            if (this.f105919Y0) {
                this.f105917W.setColor(this.f105950v);
            } else {
                this.f105917W.setColor(this.f105948t);
            }
            this.f105917W.setStrokeCap(cap);
            float f13 = this.f105905K;
            float f14 = this.f105906L;
            canvas.drawLine(f13, f14, this.f105895A, f14, this.f105917W);
        }
        if (this.f105955z != null) {
            this.f105917W.setColor(this.f105949u);
            this.f105917W.setStrokeCap(cap);
            float f15 = this.f105896B;
            float f16 = this.f105906L;
            canvas.drawLine(f15, f16, this.f105907M, f16, this.f105917W);
        }
        if (this.f105922a0 == null) {
            this.f105922a0 = new Paint();
        }
        float f17 = this.h / 2.0f;
        float f18 = this.f105895A - f17;
        float f19 = this.f105896B - f17;
        float f20 = f19;
        if (f19 < f18) {
            f20 = f18;
        }
        if (this.f105928c1) {
            Bitmap bitmap = this.f105955z;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, f20, (this.f105906L - (this.f105936j / 2.0f)) + this.f105935i, this.f105922a0);
            }
            Bitmap bitmap2 = this.f105954y;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, f18, (this.f105906L - (this.f105936j / 2.0f)) + this.f105935i, this.f105922a0);
            }
        } else {
            Bitmap bitmap3 = this.f105954y;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, f18, (this.f105906L - (this.f105936j / 2.0f)) + this.f105935i, this.f105922a0);
            }
            Bitmap bitmap4 = this.f105955z;
            if (bitmap4 != null) {
                canvas.drawBitmap(bitmap4, f20, (this.f105906L - (this.f105936j / 2.0f)) + this.f105935i, this.f105922a0);
            }
        }
        if (this.f105927c0 == null) {
            this.f105927c0 = new Paint();
        }
        this.f105927c0.setAntiAlias(true);
        if (!this.f105928c1) {
            if (this.f105955z != null) {
                this.f105927c0.setColor(this.f105944q);
                this.f105927c0.setTextSize(this.f105942p);
                if (this.f105930d1) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    canvas.drawText(String.format(o.a(this.f105900F, "%.", "f", this.f105912R), Arrays.copyOf(new Object[]{Float.valueOf(this.f105911Q)}, 1)), this.f105896B - ((r0.length() * this.f105940n) / 4.0f), this.f105934g, this.f105927c0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f105954y != null) {
            if (this.f105919Y0) {
                this.f105927c0.setColor(this.f105945r);
            } else {
                this.f105927c0.setColor(this.f105941o);
            }
            this.f105927c0.setTextSize(this.f105940n);
            if (this.f105930d1) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                canvas.drawText(String.format(o.a(this.f105900F, "%.", "f", this.f105912R), Arrays.copyOf(new Object[]{Float.valueOf(this.f105910P)}, 1)), this.f105895A - ((r0.length() * this.f105940n) / 4.0f), this.f105934g, this.f105927c0);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        float f7;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int iMax = (int) (mode == 1073741824 ? Math.max(size, (this.h * 2) + this.f105901G + this.f105902H) : Math.min(size, (this.h * 2) + this.f105901G + this.f105902H));
        int i9 = this.f105901G;
        int i10 = this.f105902H;
        int i11 = this.h;
        int i12 = ((iMax - i9) - i10) - i11;
        this.f105933f = i12;
        int i13 = i11 / 2;
        int i14 = i12 + i9 + i13;
        this.f105907M = i14;
        int i15 = i13 + i9;
        this.f105905K = i15;
        int i16 = this.f105897C;
        this.f105895A = i16 > 0 ? ((i16 / this.f105908N) * i12) + i15 : i15;
        if (this.f105898D > 0) {
            f7 = (((r0 - r0) / this.f105908N) * i12) + i15;
        } else {
            f7 = i14;
        }
        this.f105896B = f7;
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        setMeasuredDimension(iMax, (int) (mode2 == 1073741824 ? Math.max(size2, this.f105904J + this.f105903I + this.f105936j + 10) : Math.min(size2, this.f105904J + this.f105903I + this.f105936j + 10)));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f105930d1 = true;
            boolean z6 = Math.abs((double) (y6 - ((float) this.f105906L))) < ((double) this.f105936j);
            boolean z7 = this.f105954y != null && Math.abs((double) (x6 - this.f105895A)) < ((double) this.h);
            boolean z8 = this.f105955z != null && Math.abs((double) (x6 - this.f105896B)) < ((double) this.h);
            boolean z9 = z7;
            boolean z10 = z8;
            if (z8) {
                z9 = z7;
                z10 = z8;
                if (z7) {
                    z9 = this.f105928c1;
                    z10 = !z9;
                }
            }
            if (z6 && z9) {
                this.f105938l = true;
                this.f105928c1 = true;
                return true;
            }
            if (z6 && z10) {
                this.f105939m = true;
                this.f105928c1 = false;
                return true;
            }
            if (x6 >= this.f105905K && x6 <= this.f105895A - (this.h / 2.0f) && z6) {
                this.f105895A = x6;
                d(true);
                postInvalidate();
                this.f105938l = true;
                return true;
            }
            if (x6 > this.f105907M) {
                return true;
            }
            if (x6 < (this.h / 2.0f) + this.f105896B || !z6) {
                return true;
            }
            this.f105896B = x6;
            d(true);
            postInvalidate();
            this.f105939m = true;
            return true;
        }
        if (action == 1) {
            boolean z11 = this.f105938l;
            a aVar = this.f105932e1;
            if (aVar != null) {
                aVar.b(this.f105910P, this.f105911Q, Boolean.valueOf(z11));
                this.f105918X0 = this.f105897C;
                this.f105920Z0 = this.f105898D;
            }
            this.f105923a1 = false;
            this.f105925b1 = false;
            this.f105939m = false;
            this.f105938l = false;
            this.f105930d1 = false;
            postInvalidate();
            return true;
        }
        if (action != 2) {
            return true;
        }
        this.f105930d1 = true;
        if (this.f105938l) {
            float f7 = this.f105896B - 0;
            if (x6 < f7 && x6 > this.f105905K) {
                this.f105895A = x6;
                this.f105925b1 = false;
                this.f105923a1 = false;
                d(true);
                postInvalidate();
                return true;
            }
            if (!this.f105925b1 && x6 >= f7) {
                this.f105895A = f7;
                this.f105925b1 = true;
                d(true);
                postInvalidate();
                return true;
            }
            if (this.f105923a1) {
                return true;
            }
            float f8 = this.f105905K;
            if (x6 > f8) {
                return true;
            }
            this.f105923a1 = true;
            this.f105895A = f8;
            d(true);
            postInvalidate();
            return true;
        }
        if (!this.f105939m) {
            return true;
        }
        float f9 = this.f105895A + 0;
        if (x6 > f9) {
            float f10 = this.f105907M;
            if (x6 < f10) {
                this.f105896B = x6;
                this.f105925b1 = false;
                this.f105923a1 = false;
                if (x6 > f10) {
                    this.f105896B = f10;
                }
                d(true);
                postInvalidate();
                return true;
            }
        }
        if (!this.f105923a1 && x6 <= f9) {
            this.f105896B = f9;
            this.f105923a1 = true;
            d(true);
            postInvalidate();
            return true;
        }
        if (this.f105925b1) {
            return true;
        }
        float f11 = this.f105907M;
        if (x6 < f11) {
            return true;
        }
        this.f105896B = f11;
        this.f105925b1 = true;
        d(true);
        postInvalidate();
        return true;
    }

    public final void setLeftMoveIcon(int i7) {
        int i8;
        if (this.f105946r0 == i7) {
            return;
        }
        this.f105946r0 = i7;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i7);
        this.f105954y = bitmapDecodeResource;
        if (bitmapDecodeResource == null) {
            this.f105895A = this.f105905K;
            this.f105897C = 0;
        } else {
            int i9 = this.f105929d;
            if (i9 == 0 || i9 == this.f105921a) {
                this.f105929d = this.f105921a;
            } else if (i9 == this.f105924b) {
                this.f105929d = this.f105926c;
            }
            int i10 = this.h;
            if (i10 > 0 && (i8 = this.f105936j) > 0) {
                this.f105954y = a(i10, i8, bitmapDecodeResource);
            }
            requestLayout();
        }
        invalidate();
    }

    public final void setLeftOutColor(int i7) {
        this.f105948t = i7;
    }

    public final void setMaxProgress(int i7) {
        this.f105908N = i7;
        requestLayout();
    }

    public final void setMoveIconLowPadding(int i7) {
        this.f105935i = b(getContext(), i7);
    }

    public final void setOnRangeListener(@Nullable a aVar) {
        this.f105932e1 = aVar;
    }

    public final void setRightMoveIcon(int i7) {
        int i8;
        if (this.f105951v0 == i7) {
            return;
        }
        this.f105951v0 = i7;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i7);
        this.f105955z = bitmapDecodeResource;
        if (bitmapDecodeResource == null) {
            this.f105896B = this.f105907M;
            this.f105898D = 0;
        } else {
            int i9 = this.f105929d;
            if (i9 == 0) {
                this.f105929d = this.f105924b;
            } else if (i9 == this.f105921a) {
                this.f105929d = this.f105926c;
            }
            int i10 = this.h;
            if (i10 > 0 && (i8 = this.f105936j) > 0) {
                this.f105955z = a(i10, i8, bitmapDecodeResource);
            }
            requestLayout();
        }
        invalidate();
    }

    public final void setRightProgress(int i7) {
        if (this.f105920Z0 == i7 && Math.abs((((i7 / this.f105908N) * this.f105933f) + this.f105907M) - this.f105896B) <= 10.0d) {
            this.f105928c1 = false;
            postInvalidate();
            return;
        }
        int i8 = this.f105908N;
        int i9 = i7;
        if (i7 > i8) {
            i9 = i8;
        }
        int i10 = this.f105897C;
        if (i10 + i9 >= i8) {
            i9 = i8 - i10;
            this.f105928c1 = true;
        } else {
            this.f105928c1 = false;
        }
        this.f105920Z0 = i9;
        this.f105896B = (((i8 - i9) / i8) * this.f105933f) + this.f105905K;
        d(false);
        this.f105928c1 = false;
        postInvalidate();
    }
}
