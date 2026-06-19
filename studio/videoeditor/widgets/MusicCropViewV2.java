package com.bilibili.studio.videoeditor.widgets;

import android.R;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.widgets.MusicCropViewV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/MusicCropViewV2.class */
public class MusicCropViewV2 extends View {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static long f110375I = 10000;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f110376A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f110377B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f110378C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f110379D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f110380E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f110381F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public LongSparseArray<String> f110382G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public a f110383H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f110387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f110388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f110389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f110390g;
    public final Paint h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f110391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f110392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f110393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f110394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f110395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RectF f110396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bitmap f110397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bitmap f110398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Xfermode f110399q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Paint f110400r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final VelocityTracker f110401s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ValueAnimator f110402t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final OverScroller f110403u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f110404v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f110405w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f110406x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f110407y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f110408z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/MusicCropViewV2$a.class */
    public interface a {
        void a();

        void b(long j7);

        void c(long j7);
    }

    public MusicCropViewV2(Context context) {
        this(context, null);
    }

    public MusicCropViewV2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f110401s = VelocityTracker.obtain();
        this.f110408z = 0;
        this.f110376A = 0;
        this.f110377B = false;
        this.f110378C = 0L;
        this.f110379D = 0L;
        this.f110380E = 0L;
        this.f110381F = false;
        this.f110382G = new LongSparseArray<>();
        this.f110389f = context;
        this.f110392j = new Rect();
        this.f110393k = new RectF();
        this.f110394l = new Rect();
        this.f110395m = new RectF();
        Paint paint = new Paint();
        this.f110390g = paint;
        paint.setAntiAlias(true);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), 2131234908);
        this.f110397o = bitmapDecodeResource;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        this.f110398p = bitmapCreateBitmap;
        bitmapCreateBitmap.eraseColor(getResources().getColor(2131102728));
        Paint paint2 = new Paint();
        this.f110400r = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(getResources().getColor(R.color.white));
        paint2.setStyle(Paint.Style.FILL);
        this.f110396n = new RectF();
        TextPaint textPaint = new TextPaint();
        this.h = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(DensityUtil.dp2px(context, 10.0f));
        textPaint.setColor(getResources().getColor(R.color.white));
        TextPaint textPaint2 = new TextPaint();
        this.f110391i = textPaint2;
        textPaint.setAntiAlias(true);
        textPaint2.setStrokeWidth(DensityUtil.dp2px(context, 2.0f));
        textPaint2.setColor(getResources().getColor(R.color.white));
        textPaint2.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f}, 0.0f));
        this.f110384a = DensityUtil.dp2px(context, 32.0f);
        this.f110385b = DensityUtil.dp2px(context, 1.0f);
        this.f110386c = DensityUtil.dp2px(context, 10.0f);
        this.f110387d = DensityUtil.dp2px(context, 20.0f);
        this.f110388e = DensityUtil.dp2px(context, 0.5f);
        this.f110399q = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f110402t = new ValueAnimator();
        this.f110403u = new OverScroller(context);
    }

    public final void a() {
        long j7 = f110375I;
        if (j7 == 0) {
            return;
        }
        long j8 = this.f110378C;
        this.f110408z = (int) ((j8 / j7) - 25);
        this.f110376A = (int) (((j8 - TransitionInfo.DEFAULT_DURATION) / j7) - 25);
    }

    public final void b(long j7) {
        if (this.f110377B) {
            return;
        }
        long j8 = f110375I;
        if (j8 == 0) {
            return;
        }
        long j9 = j7 / j8;
        this.f110406x = j9;
        this.f110407y = j9 - ((long) this.f110405w);
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f110393k;
        float f7 = this.f110384a - this.f110405w;
        rectF.left = f7;
        rectF.right = f7;
        for (int i7 = 0; i7 < this.f110408z / this.f110397o.getWidth(); i7++) {
            this.f110393k.left = ((this.f110397o.getWidth() * i7) + this.f110384a) - this.f110405w;
            RectF rectF2 = this.f110393k;
            rectF2.right = rectF2.left + this.f110397o.getWidth();
            int iSaveLayer = canvas.saveLayer(this.f110393k, this.f110390g, 31);
            canvas.drawBitmap(this.f110397o, (Rect) null, this.f110393k, this.f110390g);
            if (this.f110377B) {
                RectF rectF3 = this.f110395m;
                float f8 = ((((long) this.f110384a) + (((long) this.f110385b) << 1)) + this.f110406x) - ((long) this.f110405w);
                rectF3.right = f8;
                rectF3.left = f8 - this.f110407y;
            } else {
                RectF rectF4 = this.f110395m;
                int i8 = this.f110384a;
                rectF4.left = (this.f110385b << 1) + i8;
                rectF4.right = ((long) i8) + this.f110407y;
            }
            this.f110390g.setXfermode(this.f110399q);
            canvas.drawBitmap(this.f110398p, (Rect) null, this.f110395m, this.f110390g);
            this.f110390g.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
        int width = this.f110408z % this.f110397o.getWidth();
        int i9 = 0;
        if (width > 0) {
            RectF rectF5 = this.f110393k;
            float f9 = rectF5.right;
            rectF5.left = f9;
            rectF5.right = f9 + width;
            Rect rect = this.f110394l;
            rect.right = width;
            rect.bottom = this.f110397o.getHeight();
            int iSaveLayer2 = canvas.saveLayer(this.f110393k, this.f110390g, 31);
            canvas.drawBitmap(this.f110397o, this.f110394l, this.f110393k, this.f110390g);
            RectF rectF6 = this.f110395m;
            int i10 = this.f110384a;
            int i11 = this.f110405w;
            rectF6.left = i10 - i11;
            if (this.f110377B) {
                float f10 = (((long) i10) + this.f110406x) - ((long) i11);
                rectF6.right = f10;
                rectF6.left = f10 - this.f110407y;
            } else {
                rectF6.left = i10;
                rectF6.right = ((long) i10) + this.f110407y;
            }
            this.f110390g.setXfermode(this.f110399q);
            canvas.drawBitmap(this.f110398p, (Rect) null, this.f110395m, this.f110390g);
            this.f110390g.setXfermode(null);
            canvas.restoreToCount(iSaveLayer2);
            i9 = 0;
        }
        while (i9 < this.f110382G.size()) {
            if (f110375I == 0) {
                return;
            }
            long jKeyAt = (this.f110382G.keyAt(i9) / f110375I) + ((long) this.f110384a);
            String strValueAt = this.f110382G.valueAt(i9);
            RectF rectF7 = this.f110396n;
            int i12 = this.f110385b;
            long j7 = i12;
            long j8 = this.f110405w;
            rectF7.left = (jKeyAt - j7) - j8;
            rectF7.right = (j7 + jKeyAt) - j8;
            float f11 = this.f110386c;
            rectF7.top = f11;
            rectF7.bottom = f11 + this.f110387d;
            float f12 = i12;
            canvas.drawRoundRect(rectF7, f12, f12, this.f110400r);
            canvas.drawText(strValueAt, (jKeyAt - ((long) (((int) this.h.measureText(strValueAt)) >> 1))) - ((long) this.f110405w), getMeasuredHeight() - this.f110388e, this.h);
            i9++;
        }
        if (this.f110381F) {
            float f13 = (((long) this.f110384a) + this.f110380E) - ((long) this.f110385b);
            canvas.drawLine(f13, 0.0f, f13, getMeasuredHeight() - this.f110388e, this.f110391i);
            canvas.drawText(this.f110389f.getString(2131850143), (((int) this.h.measureText(r0)) / 2.0f) + this.f110380E, getMeasuredHeight() - this.f110388e, this.h);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        Rect rect = this.f110392j;
        int i9 = this.f110384a;
        rect.left = i9;
        rect.right = (i9 + this.f110385b) << 1;
        rect.bottom = DensityUtil.dp2px(this.f110389f, 40.0f);
        RectF rectF = this.f110393k;
        rectF.bottom = rectF.top + DensityUtil.dp2px(this.f110389f, 40.0f);
        this.f110395m.bottom = this.f110393k.top + DensityUtil.dp2px(this.f110389f, 40.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x6 = (int) motionEvent.getX();
        this.f110401s.computeCurrentVelocity(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE);
        this.f110401s.addMovement(motionEvent);
        if (action == 0) {
            this.f110377B = true;
            this.f110404v = x6;
            ValueAnimator valueAnimator = this.f110402t;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f110402t.end();
                this.f110402t.cancel();
            }
            a aVar = this.f110383H;
            if (aVar == null) {
                return true;
            }
            aVar.a();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                int i7 = this.f110404v - x6;
                int i8 = this.f110405w;
                int i9 = i8 + i7;
                if (i9 >= 0 && i9 <= this.f110408z) {
                    int i10 = this.f110376A;
                    if (i8 >= i10) {
                        this.f110405w = i10;
                    } else {
                        a aVar2 = this.f110383H;
                        if (aVar2 != null) {
                            aVar2.b(((long) i8) * f110375I);
                        }
                        this.f110405w += i7;
                        invalidate();
                    }
                }
                this.f110404v = x6;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        this.f110407y = 0L;
        int xVelocity = (int) this.f110401s.getXVelocity();
        if (Math.abs(xVelocity) < 50) {
            this.f110377B = false;
            int i11 = this.f110405w;
            int i12 = this.f110376A;
            if (i11 >= i12) {
                this.f110405w = i12;
            }
            invalidate();
            a aVar3 = this.f110383H;
            if (aVar3 != null) {
                aVar3.c(((long) this.f110405w) * f110375I);
            }
        } else if (!this.f110402t.isRunning()) {
            this.f110403u.fling(this.f110405w, 0, -xVelocity, 0, 0, this.f110376A, 0, 0, 0, 0);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
            this.f110402t = duration;
            duration.setInterpolator(new DecelerateInterpolator());
            this.f110402t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.studio.videoeditor.widgets.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MusicCropViewV2 f110447a;

                {
                    this.f110447a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    MusicCropViewV2 musicCropViewV2 = this.f110447a;
                    if (!musicCropViewV2.f110403u.computeScrollOffset() || musicCropViewV2.f110403u.getCurrX() < 0 || musicCropViewV2.f110403u.getCurrX() > musicCropViewV2.f110408z - 100) {
                        return;
                    }
                    musicCropViewV2.f110405w = musicCropViewV2.f110403u.getCurrX();
                    musicCropViewV2.invalidate();
                    MusicCropViewV2.a aVar4 = musicCropViewV2.f110383H;
                    if (aVar4 != null) {
                        aVar4.b(((long) musicCropViewV2.f110405w) * MusicCropViewV2.f110375I);
                    }
                }
            });
            this.f110402t.addListener(new i(this));
            this.f110402t.start();
        }
        this.f110401s.clear();
        return true;
    }

    public void setCropDuration(long j7) {
        if (this.f110380E == 0) {
            Application application = BiliContext.application();
            this.f110380E = ScreenUtil.getScreenWidth(application) - ((int) wj.a.a(application, 64.0f));
        }
        long j8 = this.f110380E;
        if (j8 > 0) {
            f110375I = j7 / j8;
        }
        a();
        long j9 = this.f110379D;
        if (j9 < 0) {
            this.f110405w = 0;
        } else {
            long j10 = f110375I;
            if (j10 != 0) {
                this.f110405w = (int) (j9 / j10);
            }
        }
        invalidate();
    }

    public void setLoop(boolean z6) {
        this.f110381F = z6;
    }

    public void setMusicStartTime(long j7) {
        this.f110379D = j7;
        if (j7 < 0) {
            this.f110405w = 0;
        } else {
            long j8 = f110375I;
            if (j8 != 0) {
                this.f110405w = (int) (j7 / j8);
            }
        }
        invalidate();
    }

    public void setMusicTotalTime(long j7) {
        this.f110378C = j7;
        a();
        invalidate();
    }

    public void setOnCropChangedListener(a aVar) {
        this.f110383H = aVar;
    }

    public void setRefrainTags(LongSparseArray<String> longSparseArray) {
        this.f110382G = longSparseArray;
        invalidate();
    }
}
