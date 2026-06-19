package com.bilibili.studio.videoeditor.capturev3.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/CaptureScaleProgressBar.class */
public class CaptureScaleProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f109365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f109366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f109367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f109368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedList<Long> f109369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f109370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f109371g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f109372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f109373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f109374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f109375l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/CaptureScaleProgressBar$a.class */
    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<CaptureScaleProgressBar> f109376a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            CaptureScaleProgressBar captureScaleProgressBar = this.f109376a.get();
            int i7 = message.what;
            if (i7 != 21281) {
                if (i7 != 21282 || captureScaleProgressBar == null) {
                    return;
                }
                captureScaleProgressBar.setMaxDuration(captureScaleProgressBar.getMaxDuration() + 12000000);
                Message messageObtain = Message.obtain();
                messageObtain.what = 21281;
                sendMessageDelayed(messageObtain, 25L);
                return;
            }
            if (captureScaleProgressBar != null) {
                captureScaleProgressBar.setMaxDuration(captureScaleProgressBar.getMaxDuration() + 12000000);
                boolean z6 = captureScaleProgressBar.getCurStage() == 356 && captureScaleProgressBar.getMaxDuration() < 300000000;
                boolean z7 = false;
                if (captureScaleProgressBar.getCurStage() == 357) {
                    z7 = false;
                    if (captureScaleProgressBar.getMaxDuration() < 600000000) {
                        z7 = true;
                    }
                }
                if (z6 || z7) {
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 21281;
                    sendMessageDelayed(messageObtain2, 25L);
                }
            }
        }
    }

    public CaptureScaleProgressBar(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [android.os.Handler, com.bilibili.studio.videoeditor.capturev3.widget.CaptureScaleProgressBar$a] */
    public CaptureScaleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f109369e = new LinkedList<>();
        this.h = 60000000L;
        this.f109372i = 355;
        this.f109374k = 0.0f;
        this.f109375l = true;
        Paint paint = new Paint();
        this.f109365a = paint;
        paint.setColor(-1);
        this.f109365a.setAlpha(51);
        Paint paint2 = this.f109365a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f109367c = paint3;
        paint3.setColor(getResources().getColor(2131102728));
        this.f109367c.setStyle(style);
        Paint paint4 = new Paint();
        this.f109368d = paint4;
        paint4.setColor(getResources().getColor(R.color.white));
        this.f109368d.setStyle(style);
        this.f109366b = new RectF();
        this.f109373j = DensityUtil.dp2px(context, 2.0f);
        ?? handler = new Handler();
        handler.f109376a = new WeakReference<>(this);
        this.f109370f = handler;
    }

    public final void a() {
        float fLongValue = this.f109369e.isEmpty() ? 0.0f : this.f109369e.getLast().longValue();
        this.f109371g = fLongValue;
        if (this.f109375l) {
            if (fLongValue >= 0.0f && fLongValue < 4.8E7f) {
                this.f109372i = 355;
                this.h = 60000000L;
            } else if (fLongValue < 4.8E7f || fLongValue >= 2.4E8f) {
                this.f109372i = 357;
                this.h = 600000000L;
            } else {
                this.f109372i = 356;
                this.h = 300000000L;
            }
        }
        invalidate();
    }

    public final void b(long j7) {
        if (j7 >= 0) {
            long j8 = this.h;
            if (j7 > j8) {
                return;
            }
            int i7 = this.f109372i;
            if (i7 == 355) {
                if (j7 > 4.8E7f && j8 == 60000000) {
                    this.f109372i = 356;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 21282;
                    this.f109370f.sendMessage(messageObtain);
                }
            } else if (i7 == 356 && j7 > 2.4E8f && j8 == 300000000) {
                this.f109372i = 357;
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 21282;
                this.f109370f.sendMessage(messageObtain2);
            }
            this.f109371g = j7;
            invalidate();
        }
    }

    public int getCurStage() {
        return this.f109372i;
    }

    public long getMaxDuration() {
        return this.h;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f109366b;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getMeasuredWidth();
        this.f109366b.bottom = getMeasuredHeight();
        RectF rectF2 = this.f109366b;
        float f7 = this.f109374k;
        canvas.drawRoundRect(rectF2, f7, f7, this.f109365a);
        this.f109366b.right = (int) (((getMeasuredWidth() * this.f109371g) * 1.0f) / this.h);
        float measuredHeight = getMeasuredHeight() >> 1;
        float f8 = this.f109374k;
        if (f8 > 0.0f) {
            measuredHeight = f8;
        }
        canvas.drawRoundRect(this.f109366b, measuredHeight, measuredHeight, this.f109367c);
        Iterator<Long> it = this.f109369e.iterator();
        while (it.hasNext()) {
            int iLongValue = (int) (((it.next().longValue() * 1.0f) / this.h) * getMeasuredWidth());
            RectF rectF3 = this.f109366b;
            rectF3.right = iLongValue;
            rectF3.left = iLongValue - this.f109373j;
            canvas.drawRoundRect(rectF3, 0.0f, 0.0f, this.f109368d);
        }
    }

    public void setFixedMaxDuration(long j7) {
        if (this.f109375l) {
            j7 = 60000000;
        }
        this.h = j7;
    }

    public void setMaxDuration(long j7) {
        this.h = j7;
    }

    public void setRadius(float f7) {
        this.f109374k = f7;
    }

    public void setScaleEnabled(boolean z6) {
        this.f109375l = z6;
    }
}
