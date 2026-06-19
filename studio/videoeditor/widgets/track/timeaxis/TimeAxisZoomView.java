package com.bilibili.studio.videoeditor.widgets.track.timeaxis;

import AC0.i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import oD0.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/track/timeaxis/TimeAxisZoomView.class */
public final class TimeAxisZoomView extends View {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f110534p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Paint f110536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f110537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f110538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f110539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f110540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f110541g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final b f110542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f110543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public a f110544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f110545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f110546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f110547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f110548o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/track/timeaxis/TimeAxisZoomView$a.class */
    public interface a {
        void a();

        void b(long j7, boolean z6);
    }

    public TimeAxisZoomView(@NotNull Context context) {
        this(context, null);
    }

    public TimeAxisZoomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        int iH = i.h(context) / 2;
        this.f110535a = iH;
        Paint paint = new Paint(1);
        this.f110536b = paint;
        this.h = DensityUtil.dp2px(2.0f);
        rD0.b bVar = new rD0.b(this);
        this.f110545l = Color.parseColor("#999999");
        this.f110546m = DensityUtil.dp2px(getContext(), 44.0f);
        this.f110547n = iH;
        paint.setColor(this.f110545l);
        paint.setTextSize(DensityUtil.dp2px(10.0f));
        paint.setTextAlign(Paint.Align.CENTER);
        this.f110541g = (int) ((paint.getFontMetrics().ascent + paint.getFontMetrics().descent) / 2);
        b bVar2 = new b(context);
        this.f110542i = bVar2;
        bVar2.i = bVar;
        this.f110543j = 4;
        this.f110538d = rD0.a.a(4);
    }

    private final void setContentLength(long j7) {
        this.f110540f = j7;
        setTotalLength(j7 + ((long) this.f110547n));
    }

    private final void setTotalLength(long j7) {
        this.f110539e = j7;
        this.f110542i.j = j7 - ((long) this.f110535a);
    }

    private final void setXScrolled(long j7) {
        this.f110537c = j7;
        this.f110542i.l = j7;
    }

    public final void a(long j7, boolean z6) {
        setXScrolled(j7);
        a aVar = this.f110544k;
        if (aVar != null) {
            aVar.b(this.f110537c, z6);
        }
        invalidate();
    }

    public final float b() {
        float f7 = this.f110548o;
        int i7 = rD0.a.a;
        return (f7 * 1.0f) / rD0.a.b(this.f110543j);
    }

    public final void c(int i7, boolean z6) {
        float f7 = this.f110538d;
        if (-1 > i7 || i7 >= 2) {
            i7 = (int) (i7 * 0.4f);
        }
        float f8 = f7 + i7;
        float f9 = (((long) this.f110535a) + this.f110537c) - ((long) this.f110547n);
        float f10 = this.f110540f;
        float f11 = (f9 * 1.0f) / f10;
        float f12 = this.f110548o;
        float f13 = rD0.a.a;
        if (f8 >= f13) {
            int i8 = this.f110543j;
            if (i8 < 10) {
                int i9 = i8 + 1;
                this.f110543j = i9;
                if (i9 >= 5) {
                    this.f110538d = f10 / b();
                } else {
                    float fA = rD0.a.a(i9);
                    this.f110538d = fA;
                    setContentLength(MathKt.roundToLong(b() * fA));
                }
            } else {
                this.f110538d = f13;
                setContentLength(MathKt.roundToLong(b() * f13));
            }
        } else {
            float f14 = rD0.a.b;
            if (f8 <= f14) {
                int i10 = this.f110543j;
                if (i10 > 1) {
                    int i11 = i10 - 1;
                    this.f110543j = i11;
                    if (i11 >= 6) {
                        this.f110538d = f10 / b();
                    } else {
                        float fA2 = rD0.a.a(i11);
                        this.f110538d = fA2;
                        setContentLength(MathKt.roundToLong(b() * fA2));
                    }
                } else {
                    this.f110538d = f14;
                    setContentLength(MathKt.roundToLong(b() * f14));
                }
            } else {
                this.f110538d = f8;
                setContentLength(MathKt.roundToLong(b() * f8));
            }
        }
        long jRoundToLong = MathKt.roundToLong(((((f11 * f12) * 1.0f) / this.f110548o) * this.f110540f) + this.f110547n);
        long j7 = this.f110535a;
        a aVar = this.f110544k;
        if (aVar != null) {
            aVar.a();
        }
        a(jRoundToLong - j7, true);
        invalidate();
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        this.f110542i.a();
    }

    public final long getFrameDuration() {
        return (long) (((this.f110548o * 1.0f) / this.f110540f) * this.f110546m);
    }

    public final int getFrameWidth() {
        return this.f110546m;
    }

    @Nullable
    public final a getGestureListener() {
        return this.f110544k;
    }

    public final int getOffset() {
        return this.f110547n;
    }

    public final int getScaleColor() {
        return this.f110545l;
    }

    public final long getTotalDuration() {
        return this.f110548o;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        String[] strArr;
        String str;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        int i7 = rD0.a.a;
        switch (this.f110543j) {
            case 6:
                strArr = rD0.a.n;
                break;
            case 7:
                strArr = rD0.a.o;
                break;
            case 8:
                strArr = rD0.a.p;
                break;
            case 9:
                strArr = rD0.a.q;
                break;
            case 10:
                strArr = rD0.a.r;
                break;
            default:
                strArr = rD0.a.m;
                break;
        }
        int length = strArr.length;
        long jMax = Math.max(this.f110547n, this.f110537c);
        long j7 = this.f110547n;
        long jMin = Math.min(this.f110539e, ((long) getWidth()) + this.f110537c);
        long j8 = this.f110547n;
        long jFloor = (long) Math.floor((jMax - j7) / this.f110538d);
        long jCeil = (long) Math.ceil((jMin - j8) / this.f110538d);
        if (jFloor > jCeil) {
            return;
        }
        while (true) {
            String str2 = strArr[(int) (jFloor % ((long) length))];
            if (Intrinsics.areEqual(str2, "flag_start")) {
                int i8 = rD0.a.a;
                int i9 = this.f110543j;
                int i10 = 1;
                switch (i9) {
                    case 1:
                        f7 = jFloor;
                        f8 = 1.0E7f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 2:
                        f7 = jFloor;
                        f8 = 5000000.0f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 3:
                        f7 = jFloor;
                        f8 = 2500000.0f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 4:
                    default:
                        f12 = (jFloor * 1000000.0f) / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 5:
                        f7 = jFloor;
                        f8 = 500000.0f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 6:
                        f7 = jFloor;
                        f8 = 250000.0f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 7:
                        f9 = jFloor;
                        f10 = 166666.67f;
                        f11 = (f9 * f10) + 1;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 8:
                        f7 = jFloor;
                        f8 = 83333.336f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 9:
                        f7 = jFloor;
                        f8 = 50000.0f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 10:
                        f9 = jFloor;
                        f10 = 33333.336f;
                        f11 = (f9 * f10) + 1;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                }
                long j9 = (long) f12;
                if (i9 == 1) {
                    i10 = 20;
                } else if (i9 == 2) {
                    i10 = 10;
                } else if (i9 == 3) {
                    i10 = 5;
                } else if (i9 == 4) {
                    i10 = 2;
                }
                long j10 = 60;
                long j11 = j9 / j10;
                long j12 = j9 % j10;
                long j13 = i10;
                if (j9 <= 0) {
                    str = "00:00";
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str = String.format(Locale.CHINESE, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11), Long.valueOf(j12 - (j12 % j13))}, 2));
                }
            } else {
                str = str2;
                if (Intrinsics.areEqual(str2, "flag_point")) {
                    float fRoundToLong = MathKt.roundToLong((jFloor * this.f110538d) + this.f110547n) - this.f110537c;
                    float height = getHeight() / 2;
                    str = str2;
                    if (canvas != null) {
                        canvas.drawCircle(fRoundToLong, height, this.h, this.f110536b);
                        str = str2;
                    }
                }
            }
            float fRoundToLong2 = MathKt.roundToLong((jFloor * this.f110538d) + this.f110547n) - this.f110537c;
            float height2 = (getHeight() / 2) - this.f110541g;
            if (!Intrinsics.areEqual(str, "flag_point") && canvas != null) {
                canvas.drawText(str, fRoundToLong2, height2, this.f110536b);
            }
            if (jFloor == jCeil) {
                return;
            } else {
                jFloor++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        this.f110542i.b(motionEvent);
        return true;
    }

    public final void setFrameWidth(int i7) {
        this.f110546m = i7;
    }

    public final void setGestureListener(@Nullable a aVar) {
        this.f110544k = aVar;
    }

    public final void setOffset(int i7) {
        this.f110547n = i7;
        setTotalLength(this.f110540f + ((long) i7));
    }

    public final void setScaleColor(int i7) {
        this.f110545l = i7;
    }

    public final void setTotalDuration(long j7) {
        this.f110548o = j7;
        int i7 = rD0.a.a;
        setContentLength(MathKt.roundToLong(((j7 * 1.0f) / rD0.a.b(this.f110543j)) * this.f110538d));
    }
}
