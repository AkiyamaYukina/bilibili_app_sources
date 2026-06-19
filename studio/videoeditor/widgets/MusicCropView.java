package com.bilibili.studio.videoeditor.widgets;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
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
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.widgets.MusicCropView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/MusicCropView.class */
public class MusicCropView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LongSparseArray<String> f110348A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public a f110349B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f110353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f110354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f110355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f110356g;
    public final Paint h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f110357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f110358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f110359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f110360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f110361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Bitmap f110362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bitmap f110363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Xfermode f110364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint f110365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final VelocityTracker f110366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ValueAnimator f110367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final OverScroller f110368t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f110369u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f110370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f110371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f110372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f110373y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f110374z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/MusicCropView$a.class */
    public interface a {
        void a();

        void b(long j7);

        void c(long j7);
    }

    public MusicCropView(Context context) {
        this(context, null);
    }

    public MusicCropView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f110366r = VelocityTracker.obtain();
        this.f110373y = 0;
        this.f110374z = false;
        this.f110348A = new LongSparseArray<>();
        this.f110355f = context;
        this.f110357i = new Rect();
        this.f110358j = new RectF();
        this.f110359k = new Rect();
        this.f110360l = new RectF();
        Paint paint = new Paint();
        this.f110356g = paint;
        paint.setAntiAlias(true);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), 2131234908);
        this.f110362n = bitmapDecodeResource;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        this.f110363o = bitmapCreateBitmap;
        bitmapCreateBitmap.eraseColor(getResources().getColor(2131102728));
        Paint paint2 = new Paint();
        this.f110365q = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(getResources().getColor(R.color.white));
        paint2.setStyle(Paint.Style.FILL);
        this.f110361m = new RectF();
        TextPaint textPaint = new TextPaint();
        this.h = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(DensityUtil.dp2px(context, 10.0f));
        textPaint.setColor(getResources().getColor(R.color.white));
        this.f110350a = DensityUtil.dp2px(context, 50.0f);
        this.f110351b = DensityUtil.dp2px(context, 1.0f);
        this.f110352c = DensityUtil.dp2px(context, 10.0f);
        this.f110353d = DensityUtil.dp2px(context, 20.0f);
        this.f110354e = DensityUtil.dp2px(context, 0.5f);
        this.f110364p = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f110367s = new ValueAnimator();
        this.f110368t = new OverScroller(context);
    }

    public final void a(long j7) {
        if (this.f110374z) {
            return;
        }
        long j8 = j7 / 10000;
        this.f110371w = j8;
        this.f110372x = j8 - ((long) this.f110370v);
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
        RectF rectF = this.f110358j;
        float f7 = this.f110350a - this.f110370v;
        rectF.left = f7;
        rectF.right = f7;
        for (int i7 = 0; i7 < this.f110373y / this.f110362n.getWidth(); i7++) {
            this.f110358j.left = ((this.f110362n.getWidth() * i7) + this.f110350a) - this.f110370v;
            RectF rectF2 = this.f110358j;
            rectF2.right = rectF2.left + this.f110362n.getWidth();
            int iSaveLayer = canvas.saveLayer(this.f110358j, this.f110356g, 31);
            canvas.drawBitmap(this.f110362n, (Rect) null, this.f110358j, this.f110356g);
            if (this.f110374z) {
                RectF rectF3 = this.f110360l;
                float f8 = ((((long) this.f110350a) + (((long) this.f110351b) << 1)) + this.f110371w) - ((long) this.f110370v);
                rectF3.right = f8;
                rectF3.left = f8 - this.f110372x;
            } else {
                RectF rectF4 = this.f110360l;
                int i8 = this.f110350a;
                rectF4.left = (this.f110351b << 1) + i8;
                rectF4.right = ((long) i8) + this.f110372x;
            }
            this.f110356g.setXfermode(this.f110364p);
            canvas.drawBitmap(this.f110363o, (Rect) null, this.f110360l, this.f110356g);
            this.f110356g.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
        int width = this.f110373y % this.f110362n.getWidth();
        int i9 = 0;
        if (width > 0) {
            RectF rectF5 = this.f110358j;
            float f9 = rectF5.right;
            rectF5.left = f9;
            rectF5.right = f9 + width;
            Rect rect = this.f110359k;
            rect.right = width;
            rect.bottom = this.f110362n.getHeight();
            int iSaveLayer2 = canvas.saveLayer(this.f110358j, this.f110356g, 31);
            canvas.drawBitmap(this.f110362n, this.f110359k, this.f110358j, this.f110356g);
            RectF rectF6 = this.f110360l;
            int i10 = this.f110350a;
            int i11 = this.f110370v;
            rectF6.left = i10 - i11;
            if (this.f110374z) {
                float f10 = (((long) i10) + this.f110371w) - ((long) i11);
                rectF6.right = f10;
                rectF6.left = f10 - this.f110372x;
            } else {
                rectF6.left = i10;
                rectF6.right = ((long) i10) + this.f110372x;
            }
            this.f110356g.setXfermode(this.f110364p);
            canvas.drawBitmap(this.f110363o, (Rect) null, this.f110360l, this.f110356g);
            this.f110356g.setXfermode(null);
            canvas.restoreToCount(iSaveLayer2);
            i9 = 0;
        }
        while (i9 < this.f110348A.size()) {
            long jKeyAt = this.f110348A.keyAt(i9) / 10000;
            String strValueAt = this.f110348A.valueAt(i9);
            RectF rectF7 = this.f110361m;
            int i12 = this.f110351b;
            long j7 = i12;
            long j8 = this.f110370v;
            rectF7.left = (jKeyAt - j7) - j8;
            rectF7.right = (j7 + jKeyAt) - j8;
            float f11 = this.f110352c;
            rectF7.top = f11;
            rectF7.bottom = f11 + this.f110353d;
            float f12 = i12;
            canvas.drawRoundRect(rectF7, f12, f12, this.f110365q);
            canvas.drawText(strValueAt, (jKeyAt - ((long) (((int) this.h.measureText(strValueAt)) >> 1))) - ((long) this.f110370v), getMeasuredHeight() - this.f110354e, this.h);
            i9++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        Rect rect = this.f110357i;
        int i9 = this.f110350a;
        rect.left = i9;
        rect.right = (i9 + this.f110351b) << 1;
        rect.bottom = DensityUtil.dp2px(this.f110355f, 40.0f);
        RectF rectF = this.f110358j;
        rectF.bottom = rectF.top + DensityUtil.dp2px(this.f110355f, 40.0f);
        this.f110360l.bottom = this.f110358j.top + DensityUtil.dp2px(this.f110355f, 40.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        int action = motionEvent.getAction();
        int x6 = (int) motionEvent.getX();
        this.f110366r.computeCurrentVelocity(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE);
        this.f110366r.addMovement(motionEvent);
        if (action == 0) {
            this.f110374z = true;
            this.f110369u = x6;
            ValueAnimator valueAnimator = this.f110367s;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f110367s.end();
                this.f110367s.cancel();
            }
            a aVar = this.f110349B;
            if (aVar == null) {
                return true;
            }
            aVar.a();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                int i8 = this.f110369u - x6;
                int i9 = this.f110370v;
                int i10 = i9 + i8;
                if (i10 >= 0 && i10 <= (i7 = this.f110373y)) {
                    if (i9 >= i7 - 95) {
                        this.f110370v = i7 - 100;
                    } else {
                        a aVar2 = this.f110349B;
                        if (aVar2 != null) {
                            aVar2.b(((long) i9) * 10000);
                        }
                        this.f110370v += i8;
                        invalidate();
                    }
                }
                this.f110369u = x6;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        this.f110372x = 0L;
        int xVelocity = (int) this.f110366r.getXVelocity();
        if (Math.abs(xVelocity) < 50) {
            this.f110374z = false;
            int i11 = this.f110370v;
            int i12 = this.f110373y;
            if (i11 >= i12 - 95) {
                this.f110370v = i12 - 100;
            }
            invalidate();
            a aVar3 = this.f110349B;
            if (aVar3 != null) {
                aVar3.c(((long) this.f110370v) * 10000);
            }
        } else if (!this.f110367s.isRunning()) {
            this.f110368t.fling(this.f110370v, 0, -xVelocity, 0, 0, this.f110373y - 100, 0, 0, 0, 0);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1500L);
            this.f110367s = duration;
            duration.setInterpolator(new DecelerateInterpolator());
            this.f110367s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.studio.videoeditor.widgets.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MusicCropView f110445a;

                {
                    this.f110445a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    MusicCropView musicCropView = this.f110445a;
                    if (!musicCropView.f110368t.computeScrollOffset() || musicCropView.f110368t.getCurrX() < 0 || musicCropView.f110368t.getCurrX() > musicCropView.f110373y - 100) {
                        return;
                    }
                    musicCropView.f110370v = musicCropView.f110368t.getCurrX();
                    musicCropView.invalidate();
                    MusicCropView.a aVar4 = musicCropView.f110349B;
                    if (aVar4 != null) {
                        aVar4.b(((long) musicCropView.f110370v) * 10000);
                    }
                }
            });
            this.f110367s.addListener(new g(this));
            this.f110367s.start();
        }
        this.f110366r.clear();
        return true;
    }

    public void setMusicStartTime(long j7) {
        if (j7 < 0) {
            this.f110370v = 0;
        } else {
            this.f110370v = (int) (j7 / 10000);
        }
        invalidate();
    }

    public void setMusicTotalTime(long j7) {
        this.f110373y = (int) ((j7 / 10000) - 25);
        invalidate();
    }

    public void setOnCropChangedListener(a aVar) {
        this.f110349B = aVar;
    }

    public void setRefrainTags(LongSparseArray<String> longSparseArray) {
        this.f110348A = longSparseArray;
        invalidate();
    }
}
