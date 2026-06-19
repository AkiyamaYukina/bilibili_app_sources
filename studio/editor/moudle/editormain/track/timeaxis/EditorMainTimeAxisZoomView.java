package com.bilibili.studio.editor.moudle.editormain.track.timeaxis;

import J1.z;
import Mx0.a;
import Mx0.m;
import Nx0.c;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.text.selection.P0;
import com.alipay.sdk.app.PayTask;
import com.bilibili.bangumi.ui.page.detail.view.d;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import dy0.b;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/timeaxis/EditorMainTimeAxisZoomView.class */
public class EditorMainTimeAxisZoomView extends View implements c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f106239A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f106240B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f106241C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f106242D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f106243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Paint f106244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Paint f106245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f106246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f106247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f106248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f106249g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f106250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f106251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f106252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f106253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f106254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f106255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f106256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public a f106257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public b f106258q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Nx0.b f106259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f106260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f106261t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final ValueAnimator f106262u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public String[] f106263v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f106264w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f106265x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f106266y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f106267z;

    public EditorMainTimeAxisZoomView(@NotNull Context context) {
        this(context, null);
    }

    public EditorMainTimeAxisZoomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        int screenWidth = ScreenUtil.getScreenWidth(context) / 2;
        this.f106243a = screenWidth;
        Paint paint = new Paint(1);
        this.f106244b = paint;
        Paint paint2 = new Paint(1);
        this.f106245c = paint2;
        this.f106248f = true;
        this.f106251j = DensityUtil.dp2px(1.0f);
        this.f106253l = Color.parseColor("#4Cffffff");
        this.f106254m = Fx0.a.f6464a;
        this.f106255n = screenWidth;
        this.f106257p = a.f16457j;
        b bVar = new b(context);
        bVar.l = new d(this, bVar);
        this.f106258q = bVar;
        this.f106261t = true;
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(PayTask.f60018j);
        valueAnimatorOfFloat.addUpdateListener(new dy0.a(this, valueAnimatorOfFloat));
        this.f106262u = valueAnimatorOfFloat;
        paint.setColor(this.f106253l);
        paint.setTextSize(DensityUtil.spToPx(context, 10.0f));
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint2.setColor(this.f106253l);
        paint2.setTextAlign(align);
        this.f106250i = (int) ((paint.getFontMetrics().ascent + paint.getFontMetrics().descent) / 2);
        this.f106252k = 4;
        this.f106247e = dy0.c.a(4);
        this.f106263v = new String[0];
        this.f106242D = true;
    }

    private final void setContentLength(int i7) {
        this.h = i7;
        setTotalLength(i7 + this.f106255n);
    }

    private final void setTotalLength(int i7) {
        this.f106249g = i7;
        this.f106258q.m = i7 - this.f106243a;
    }

    @Override // Nx0.c
    public final void G(int i7, @Nullable Long l7, @Nullable m mVar) {
        setXScrolled(i7);
        invalidate();
    }

    @Override // Nx0.c
    public final void P(int i7, int i8, int i9, long j7) {
    }

    public final float a() {
        float f7 = this.f106256o;
        int i7 = dy0.c.a;
        return (f7 * 1.0f) / dy0.c.b(this.f106252k);
    }

    public final int getContentEndPos() {
        return this.f106266y;
    }

    public final int getContentStartPos() {
        return this.f106265x;
    }

    public final int getCurrentGrade() {
        return this.f106252k;
    }

    public final float getCurrentSpanDistance() {
        return this.f106247e;
    }

    public final boolean getDisabled() {
        return this.f106260s;
    }

    public final float getDrawContentEndPos() {
        return this.f106239A;
    }

    public final float getDrawContentStartPos() {
        return this.f106267z;
    }

    public final long getDrawEndIndex() {
        return this.f106241C;
    }

    public final boolean getDrawScaleText() {
        return this.f106242D;
    }

    public final long getDrawStartIndex() {
        return this.f106240B;
    }

    public final boolean getEnableZoomX() {
        return this.f106261t;
    }

    @Nullable
    public final Nx0.b getFlingListener() {
        return this.f106259r;
    }

    public final long getFrameDuration() {
        return (long) (((this.f106256o * 1.0f) / this.h) * this.f106254m);
    }

    public final int getFrameWidth() {
        return this.f106254m;
    }

    public final int getOffset() {
        return this.f106255n;
    }

    public final int getScaleColor() {
        return this.f106253l;
    }

    public final int getScaleSize() {
        return this.f106264w;
    }

    @NotNull
    public final String[] getScales() {
        return this.f106263v;
    }

    @NotNull
    public final b getScrollZoomGesture() {
        return this.f106258q;
    }

    public final float getSpanDistance() {
        return this.f106247e;
    }

    public final long getTotalDuration() {
        return this.f106256o;
    }

    public final int getXScrolled() {
        return this.f106246d;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f106258q.e.forceFinished(true);
        this.f106262u.cancel();
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        String[] strArr;
        String string;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        if (!this.f106242D) {
            return;
        }
        int i7 = dy0.c.a;
        switch (this.f106252k) {
            case 6:
                strArr = dy0.c.n;
                break;
            case 7:
                strArr = dy0.c.o;
                break;
            case 8:
                strArr = dy0.c.p;
                break;
            case 9:
                strArr = dy0.c.q;
                break;
            case 10:
                strArr = dy0.c.r;
                break;
            default:
                strArr = dy0.c.m;
                break;
        }
        this.f106263v = strArr;
        this.f106264w = strArr.length;
        this.f106265x = Math.max(this.f106255n, this.f106246d) - this.f106255n;
        int iMin = Math.min(this.f106249g, getWidth() + this.f106246d) - this.f106255n;
        this.f106266y = iMin;
        int i8 = this.f106265x;
        float f13 = i8;
        float f14 = i8;
        float f15 = this.f106247e;
        float f16 = f13 - (f14 % f15);
        this.f106267z = f16;
        this.f106239A = (iMin % f15) + iMin;
        this.f106240B = MathKt.roundToLong(f16 / f15);
        long jRoundToLong = MathKt.roundToLong(this.f106239A / this.f106247e);
        this.f106241C = jRoundToLong;
        long j7 = this.f106240B;
        if (j7 > jRoundToLong) {
            return;
        }
        while (true) {
            String str = this.f106263v[(int) (j7 % ((long) this.f106264w))];
            if (Intrinsics.areEqual(str, "flag_start")) {
                int i9 = dy0.c.a;
                int i10 = this.f106252k;
                int i11 = 1;
                switch (i10) {
                    case 1:
                        f7 = j7;
                        f8 = 1.0E7f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 2:
                        f7 = j7;
                        f8 = 5000000.0f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 3:
                        f7 = j7;
                        f8 = 2500000.0f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 4:
                    default:
                        f12 = (j7 * 1000000.0f) / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 5:
                        f7 = j7;
                        f8 = 500000.0f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 6:
                        f7 = j7;
                        f8 = 250000.0f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 7:
                        f9 = j7;
                        f10 = 166666.67f;
                        f11 = (f9 * f10) + 1;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 8:
                        f7 = j7;
                        f8 = 83333.336f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 9:
                        f7 = j7;
                        f8 = 50000.0f;
                        f11 = f7 * f8;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                    case 10:
                        f9 = j7;
                        f10 = 33333.336f;
                        f11 = (f9 * f10) + 1;
                        f12 = f11 / TransitionInfo.DEFAULT_DURATION;
                        break;
                }
                long j8 = (long) f12;
                if (i10 == 1) {
                    i11 = 20;
                } else if (i10 == 2) {
                    i11 = 10;
                } else if (i10 == 3) {
                    i11 = 5;
                } else if (i10 == 4) {
                    i11 = 2;
                }
                if (j8 <= 0) {
                    string = "00:00";
                } else {
                    StringBuilder sb = new StringBuilder(5);
                    long j9 = 60;
                    long j10 = j8 / j9;
                    long j11 = j8 % j9;
                    long j12 = j11 - (j11 % ((long) i11));
                    if (j10 > 9) {
                        sb.append(j10);
                        sb.append(":");
                    } else {
                        z.a(j10, "0", ":", sb);
                    }
                    if (j12 > 9) {
                        sb.append(j12);
                    } else {
                        sb.append("0");
                        sb.append(j12);
                    }
                    string = sb.toString();
                }
            } else {
                string = str;
                if (Intrinsics.areEqual(str, "flag_point")) {
                    float fRoundToInt = MathKt.roundToInt((j7 * this.f106247e) + this.f106255n) - this.f106246d;
                    float height = getHeight() / 2;
                    string = str;
                    if (canvas != null) {
                        canvas.drawCircle(fRoundToInt, height, this.f106251j, this.f106245c);
                        string = str;
                    }
                }
            }
            float fRoundToInt2 = MathKt.roundToInt((j7 * this.f106247e) + this.f106255n) - this.f106246d;
            float height2 = (getHeight() / 2) - this.f106250i;
            if (!Intrinsics.areEqual(string, "flag_point") && this.f106248f && canvas != null) {
                canvas.drawText(string, fRoundToInt2, height2, this.f106244b);
            }
            if (j7 == jRoundToLong) {
                return;
            } else {
                j7++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.f106260s) {
            return false;
        }
        b bVar = this.f106258q;
        if (bVar.i) {
            if (bVar.d == null) {
                bVar.d = VelocityTracker.obtain();
            }
            bVar.d.addMovement(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            bVar.h = false;
            bVar.i = false;
            bVar.k = motionEvent.getX();
            bVar.e.forceFinished(true);
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (motionEvent.getPointerCount() < 2) {
                    int x6 = (int) motionEvent.getX(0);
                    if (bVar.i) {
                        int i7 = (bVar.f - x6) + bVar.n;
                        bVar.n = i7;
                        int i8 = i7;
                        if (i7 < 0) {
                            i8 = 0;
                        }
                        bVar.n = i8;
                        int i9 = bVar.m;
                        int i10 = i8;
                        if (i8 > i9) {
                            i10 = i9;
                        }
                        bVar.n = i10;
                        d dVar = bVar.l;
                        if (dVar != null) {
                            dVar.b(i10);
                        }
                    }
                    if (bVar.h && !bVar.i && (velocityTracker = bVar.d) != null) {
                        velocityTracker.clear();
                    }
                    float x7 = motionEvent.getX();
                    float f7 = bVar.k;
                    boolean z6 = bVar.i;
                    StringBuilder sbA = Dp.b.a("GESTURE_DEBUG, x: ", x7, ", preTouchX: ", f7, ", startScroll: ");
                    sbA.append(z6);
                    BLog.d("ScrollZoomGesture", sbA.toString());
                    if (Math.abs(motionEvent.getX() - bVar.k) > ViewConfiguration.get(bVar.a).getScaledTouchSlop()) {
                        bVar.i = true;
                    }
                    bVar.h = false;
                    bVar.f = x6;
                    return true;
                }
                if (bVar.j) {
                    return true;
                }
                if (bVar.h) {
                    int iAbs = Math.abs(((int) motionEvent.getX(0)) - ((int) motionEvent.getX(1)));
                    int iAbs2 = Math.abs(bVar.f - bVar.g);
                    d dVar2 = bVar.l;
                    if (dVar2 != null) {
                        int i11 = iAbs - iAbs2;
                        EditorMainTimeAxisZoomView editorMainTimeAxisZoomView = (EditorMainTimeAxisZoomView) dVar2.a;
                        BLog.e("EditorMainTimeAxisZoomView", "EditorMainTimeAxisZoomView ScrollZoomGestureV2 onZoomByX:" + i11 + ",enableZoomX=" + editorMainTimeAxisZoomView.getEnableZoomX());
                        if (editorMainTimeAxisZoomView.getEnableZoomX() && editorMainTimeAxisZoomView.h != 0 && !editorMainTimeAxisZoomView.f106258q.j) {
                            float f8 = editorMainTimeAxisZoomView.f106247e + ((-1 > i11 || i11 >= 2) ? (int) (i11 * 0.4f) : i11);
                            int i12 = dy0.c.a;
                            int i13 = dy0.c.b;
                            StringBuilder sb = new StringBuilder(",zoomedSpan=");
                            sb.append(f8);
                            sb.append(",maxPX=");
                            sb.append(i12);
                            sb.append(",minPx=");
                            P0.a(i13, "EditorMainTimeAxisZoomView", sb);
                            float f9 = (((editorMainTimeAxisZoomView.f106243a + editorMainTimeAxisZoomView.f106246d) - editorMainTimeAxisZoomView.f106255n) * 1.0f) / editorMainTimeAxisZoomView.h;
                            float f10 = editorMainTimeAxisZoomView.f106256o;
                            float f11 = i12;
                            if (f8 >= f11) {
                                int i14 = editorMainTimeAxisZoomView.f106252k;
                                if (i14 < 10) {
                                    editorMainTimeAxisZoomView.f106252k = i14 + 1;
                                    float f12 = i13;
                                    editorMainTimeAxisZoomView.f106247e = f12;
                                    editorMainTimeAxisZoomView.setContentLength(MathKt.roundToInt(editorMainTimeAxisZoomView.a() * f12));
                                } else {
                                    editorMainTimeAxisZoomView.f106247e = f11;
                                    editorMainTimeAxisZoomView.setContentLength(MathKt.roundToInt(editorMainTimeAxisZoomView.a() * f11));
                                }
                            } else {
                                float f13 = i13;
                                if (f8 <= f13) {
                                    int i15 = editorMainTimeAxisZoomView.f106252k;
                                    if (i15 > 1) {
                                        editorMainTimeAxisZoomView.f106252k = i15 - 1;
                                        editorMainTimeAxisZoomView.f106247e = f11;
                                        editorMainTimeAxisZoomView.setContentLength(MathKt.roundToInt(editorMainTimeAxisZoomView.a() * f11));
                                    } else {
                                        editorMainTimeAxisZoomView.f106247e = f13;
                                        editorMainTimeAxisZoomView.setContentLength(MathKt.roundToInt(editorMainTimeAxisZoomView.a() * f13));
                                    }
                                } else {
                                    editorMainTimeAxisZoomView.f106247e = f8;
                                    editorMainTimeAxisZoomView.setContentLength(MathKt.roundToInt(editorMainTimeAxisZoomView.a() * f8));
                                }
                            }
                            BLog.e("EditorMainTimeAxisZoomView", "zoomByX after grade=" + editorMainTimeAxisZoomView.f106252k + ",currentSpanDistance=" + editorMainTimeAxisZoomView.f106247e + ",contentLength=" + editorMainTimeAxisZoomView.h);
                            editorMainTimeAxisZoomView.setXScrolled(MathKt.roundToInt(((((f9 * f10) * 1.0f) / ((float) editorMainTimeAxisZoomView.f106256o)) * ((float) editorMainTimeAxisZoomView.h)) + ((float) editorMainTimeAxisZoomView.f106255n)) - editorMainTimeAxisZoomView.f106243a);
                            editorMainTimeAxisZoomView.invalidate();
                            editorMainTimeAxisZoomView.invalidate();
                            a aVar = editorMainTimeAxisZoomView.f106257p;
                            long frameDuration = editorMainTimeAxisZoomView.getFrameDuration();
                            int i16 = editorMainTimeAxisZoomView.f106254m;
                            int i17 = editorMainTimeAxisZoomView.f106246d;
                            aVar.c(i17, editorMainTimeAxisZoomView.f106255n, editorMainTimeAxisZoomView.f106249g, i16, frameDuration);
                            Iterator<c> it = aVar.f16462e.iterator();
                            while (it.hasNext()) {
                                it.next().P(i11, i16, i17, frameDuration);
                            }
                        }
                    }
                }
                bVar.h = true;
                bVar.i = false;
                bVar.f = (int) motionEvent.getX(0);
                bVar.g = (int) motionEvent.getX(1);
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        if (!bVar.i) {
            d dVar3 = bVar.l;
            if (dVar3 == null) {
                return true;
            }
            ((EditorMainTimeAxisZoomView) dVar3.a).getClass();
            return true;
        }
        VelocityTracker velocityTracker2 = bVar.d;
        if (velocityTracker2 == null) {
            return true;
        }
        velocityTracker2.computeCurrentVelocity(1000, bVar.c);
        int xVelocity = (int) velocityTracker2.getXVelocity(motionEvent.getPointerId(0));
        if (Math.abs(xVelocity) <= Math.abs(bVar.b)) {
            d dVar4 = bVar.l;
            if (dVar4 == null) {
                return true;
            }
            dVar4.a();
            return true;
        }
        VelocityTracker velocityTracker3 = bVar.d;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
        }
        bVar.d = null;
        bVar.e.fling(bVar.n, 0, -xVelocity, 0, 0, bVar.m, 0, 0, 0, 0);
        d dVar5 = bVar.l;
        if (dVar5 == null) {
            return true;
        }
        EditorMainTimeAxisZoomView editorMainTimeAxisZoomView2 = (EditorMainTimeAxisZoomView) dVar5.a;
        if (editorMainTimeAxisZoomView2.f106262u.isRunning()) {
            editorMainTimeAxisZoomView2.f106262u.cancel();
        }
        editorMainTimeAxisZoomView2.f106262u.start();
        Iterator<Nx0.b> it2 = editorMainTimeAxisZoomView2.f106257p.f16463f.iterator();
        while (it2.hasNext()) {
            it2.next().m();
        }
        return true;
    }

    public final void setContentEndPos(int i7) {
        this.f106266y = i7;
    }

    public final void setContentStartPos(int i7) {
        this.f106265x = i7;
    }

    public final void setDisabled(boolean z6) {
        this.f106260s = z6;
    }

    public final void setDrawContentEndPos(float f7) {
        this.f106239A = f7;
    }

    public final void setDrawContentStartPos(float f7) {
        this.f106267z = f7;
    }

    public final void setDrawEndIndex(long j7) {
        this.f106241C = j7;
    }

    public final void setDrawScaleText(boolean z6) {
        this.f106242D = z6;
    }

    public final void setDrawStartIndex(long j7) {
        this.f106240B = j7;
    }

    public final void setEditorTrackDriver(@NotNull a aVar) {
        this.f106257p = aVar;
    }

    public final void setEnableZoomX(boolean z6) {
        this.f106261t = z6;
    }

    public final void setFlingListener(@Nullable Nx0.b bVar) {
        this.f106259r = bVar;
    }

    public final void setNeedTime(boolean z6) {
        this.f106248f = z6;
    }

    public final void setOffset(int i7) {
        this.f106255n = i7;
        setTotalLength(this.h + i7);
    }

    public final void setScaleColor(int i7) {
        this.f106253l = i7;
    }

    public final void setScaleSize(int i7) {
        this.f106264w = i7;
    }

    public final void setScales(@NotNull String[] strArr) {
        this.f106263v = strArr;
    }

    public final void setScrollZoomGesture(@NotNull b bVar) {
        this.f106258q = bVar;
    }

    public final void setTotalDuration(long j7) {
        this.f106256o = j7;
        int i7 = dy0.c.a;
        setContentLength(MathKt.roundToInt(((j7 * 1.0f) / dy0.c.b(this.f106252k)) * this.f106247e));
    }

    public final void setXScrolled(int i7) {
        this.f106246d = i7;
        this.f106258q.n = i7;
    }
}
