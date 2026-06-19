package com.bilibili.studio.videoeditor.capturev3.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/RecordButtonV3.class */
public class RecordButtonV3 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f109395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f109396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f109397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f109398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f109399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f109400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f109401g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f109402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f109403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f109404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f109405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f109406m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RectF f109407n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f109408o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f109409p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/RecordButtonV3$a.class */
    public interface a {
        void a(boolean z6);

        boolean b();

        void c();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/RecordButtonV3$b.class */
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<RecordButtonV3> f109410a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            RecordButtonV3 recordButtonV3 = this.f109410a.get();
            switch (message.what) {
                case 43981:
                    if (recordButtonV3 != null && recordButtonV3.getStatus() == 1) {
                        recordButtonV3.setWaveValue((recordButtonV3.getWaveValue() + 5.0d) % 180.0d);
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 43981;
                        sendMessageDelayed(messageObtain, 30L);
                        break;
                    }
                    break;
                case 43982:
                    if (recordButtonV3 != null && recordButtonV3.getWaveValue() > 0.0d && recordButtonV3.getWaveValue() % 180.0d != 0.0d) {
                        recordButtonV3.setWaveValue((recordButtonV3.getWaveValue() - 10.0d) % 180.0d);
                        recordButtonV3.invalidate();
                        Message messageObtain2 = Message.obtain();
                        messageObtain2.what = 43982;
                        sendMessageDelayed(messageObtain2, 30L);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Handler, com.bilibili.studio.videoeditor.capturev3.widget.RecordButtonV3$b] */
    public RecordButtonV3(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109395a = 0.0d;
        this.f109396b = 60000000L;
        this.f109404k = true;
        ?? handler = new Handler();
        handler.f109410a = new WeakReference<>(this);
        this.f109409p = handler;
        this.f109400f = DensityUtil.dp2px(7.0f);
        this.f109403j = DensityUtil.dp2px(6.0f);
        this.f109402i = 0;
        this.f109397c = 0L;
        this.f109398d = 0L;
        this.f109399e = 0L;
        this.f109406m = new RectF();
        this.f109407n = new RectF();
        this.f109405l = new Paint();
    }

    public final void a(boolean z6) {
        this.f109402i = 2;
        invalidate();
        this.f109399e = 0L;
        if (z6) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 43982;
            this.f109409p.sendMessageDelayed(messageObtain, 30L);
        }
    }

    public int getStatus() {
        return this.f109402i;
    }

    public double getWaveValue() {
        return this.f109395a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f109405l.reset();
        this.f109405l.setAntiAlias(true);
        this.f109405l.setStyle(Paint.Style.FILL);
        this.f109405l.setColor(ContextCompat.getColor(getContext(), 2131104213));
        float f7 = this.f109401g / 2.0f;
        canvas.drawCircle(f7, this.h / 2.0f, (float) (((Math.sin(Math.toRadians(this.f109395a)) * 0.2d) + 1.0d) * ((double) f7)), this.f109405l);
        int i7 = this.f109402i;
        if (i7 == 0 || i7 == 2) {
            this.f109405l.setColor(ContextCompat.getColor(getContext(), 2131104212));
            float f8 = this.f109401g / 2.0f;
            canvas.drawCircle(f8, this.h / 2.0f, f8 - this.f109400f, this.f109405l);
            return;
        }
        this.f109405l.setColor(ContextCompat.getColor(getContext(), R.color.white));
        float f9 = this.f109403j / 2.0f;
        canvas.drawRoundRect(this.f109406m, f9, f9, this.f109405l);
        float f10 = this.f109403j / 2.0f;
        canvas.drawRoundRect(this.f109407n, f10, f10, this.f109405l);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        this.f109401g = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.h = measuredHeight;
        RectF rectF = this.f109406m;
        int i9 = this.f109401g;
        float f7 = i9 / 2.0f;
        int i10 = this.f109403j;
        rectF.left = f7 - ((i10 * 5.0f) / 3.0f);
        rectF.right = (i9 / 2.0f) - ((i10 * 2.0f) / 3.0f);
        rectF.top = (measuredHeight / 2.0f) - (i10 * 2.0f);
        rectF.bottom = (i10 * 2.0f) + (measuredHeight / 2.0f);
        RectF rectF2 = this.f109407n;
        rectF2.left = ((i10 * 2.0f) / 3.0f) + (i9 / 2.0f);
        rectF2.right = ((i10 * 5.0f) / 3.0f) + (i9 / 2.0f);
        rectF2.top = (measuredHeight / 2.0f) - (i10 * 2.0f);
        rectF2.bottom = (i10 * 2.0f) + (measuredHeight / 2.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.f109404k || motionEvent.getAction() != 0) {
            return true;
        }
        int i7 = this.f109402i;
        if (i7 != 0) {
            if (i7 == 1) {
                if (this.f109399e < TransitionInfo.DEFAULT_DURATION) {
                    return true;
                }
                this.f109402i = 2;
                invalidate();
                Message messageObtain = Message.obtain();
                messageObtain.what = 43982;
                this.f109409p.sendMessage(messageObtain);
                a aVar2 = this.f109408o;
                if (aVar2 == null) {
                    return true;
                }
                aVar2.c();
                return true;
            }
            if (i7 != 2) {
                return true;
            }
        }
        if (this.f109396b - this.f109397c <= TransitionInfo.DEFAULT_DURATION && (aVar = this.f109408o) != null) {
            aVar.a(true);
            return true;
        }
        a aVar3 = this.f109408o;
        if (!(aVar3 != null ? aVar3.b() : true)) {
            return true;
        }
        this.f109402i = 1;
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 43981;
        this.f109409p.sendMessage(messageObtain2);
        invalidate();
        return true;
    }

    public void setMaxRecordDuration(long j7) {
        this.f109396b = j7;
    }

    public void setRecordListener(a aVar) {
        this.f109408o = aVar;
    }

    public void setWaveValue(double d7) {
        this.f109395a = d7;
    }
}
