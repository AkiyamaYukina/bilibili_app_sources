package com.bilibili.studio.videoeditor.capturev3.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/RecordButtonForward.class */
public class RecordButtonForward extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f109381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f109382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f109383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f109384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f109385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f109386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f109387g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f109388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f109389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f109390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f109391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f109392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f109393n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/RecordButtonForward$a.class */
    public interface a {
        void a(boolean z6);

        boolean b();

        void c();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/RecordButtonForward$b.class */
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<RecordButtonForward> f109394a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            RecordButtonForward recordButtonForward = this.f109394a.get();
            switch (message.what) {
                case 43981:
                    if (recordButtonForward != null && recordButtonForward.getStatus() == 1) {
                        recordButtonForward.setWaveValue((recordButtonForward.getWaveValue() + 5.0d) % 180.0d);
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 43981;
                        sendMessageDelayed(messageObtain, 30L);
                        break;
                    }
                    break;
                case 43982:
                    if (recordButtonForward != null && recordButtonForward.getWaveValue() > 0.0d && recordButtonForward.getWaveValue() % 180.0d != 0.0d) {
                        recordButtonForward.setWaveValue((recordButtonForward.getWaveValue() - 10.0d) % 180.0d);
                        recordButtonForward.invalidate();
                        Message messageObtain2 = Message.obtain();
                        messageObtain2.what = 43982;
                        sendMessageDelayed(messageObtain2, 30L);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Handler, com.bilibili.studio.videoeditor.capturev3.widget.RecordButtonForward$b] */
    public RecordButtonForward(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109381a = 0.0d;
        this.f109382b = 60000000L;
        this.f109387g = true;
        this.h = 5.01f;
        ?? handler = new Handler();
        handler.f109394a = new WeakReference<>(this);
        this.f109390k = handler;
        this.f109386f = 0;
        this.f109383c = 0L;
        this.f109384d = 0L;
        this.f109385e = 0L;
        this.f109388i = new Paint();
    }

    public final void a(boolean z6) {
        this.f109386f = 2;
        invalidate();
        this.f109385e = 0L;
        if (z6) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 43982;
            this.f109390k.sendMessageDelayed(messageObtain, 30L);
        }
    }

    public int getStatus() {
        return this.f109386f;
    }

    public double getWaveValue() {
        return this.f109381a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        super.onDraw(canvas);
        this.f109388i.reset();
        this.f109388i.setAntiAlias(true);
        int i7 = this.f109386f;
        if (i7 == 0) {
            if (this.f109391l == null) {
                this.f109391l = BitmapFactory.decodeResource(getContext().getResources(), 2131234587);
            }
            Bitmap bitmap2 = this.f109391l;
            float f7 = this.h;
            canvas.drawBitmap(bitmap2, f7, f7, this.f109388i);
        } else if (i7 == 2) {
            if (this.f109393n == null) {
                this.f109393n = BitmapFactory.decodeResource(getContext().getResources(), 2131234584);
            }
            Bitmap bitmap3 = this.f109393n;
            float f8 = this.h;
            canvas.drawBitmap(bitmap3, f8, f8, this.f109388i);
        } else {
            if (this.f109392m == null) {
                this.f109392m = BitmapFactory.decodeResource(getContext().getResources(), 2131234589);
            }
            canvas.drawBitmap(this.f109392m, 0.0f, 0.0f, this.f109388i);
        }
        if (this.h != 5.01f || this.f109391l == null || (bitmap = this.f109392m) == null) {
            return;
        }
        this.h = (bitmap.getWidth() - this.f109391l.getWidth()) / 2.0f;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.f109387g || motionEvent.getAction() != 0) {
            return true;
        }
        int i7 = this.f109386f;
        if (i7 != 0) {
            if (i7 == 1) {
                if (this.f109385e < TransitionInfo.DEFAULT_DURATION) {
                    return true;
                }
                this.f109386f = 2;
                invalidate();
                Message messageObtain = Message.obtain();
                messageObtain.what = 43982;
                this.f109390k.sendMessage(messageObtain);
                a aVar2 = this.f109389j;
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
        if (this.f109382b - this.f109383c <= TransitionInfo.DEFAULT_DURATION && (aVar = this.f109389j) != null) {
            aVar.a(true);
            return true;
        }
        a aVar3 = this.f109389j;
        if (!(aVar3 != null ? aVar3.b() : true)) {
            return true;
        }
        this.f109386f = 1;
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 43981;
        this.f109390k.sendMessage(messageObtain2);
        invalidate();
        return true;
    }

    public void setMaxRecordDuration(long j7) {
        this.f109382b = j7;
    }

    public void setRecordListener(a aVar) {
        this.f109389j = aVar;
    }

    public void setWaveValue(double d7) {
        this.f109381a = d7;
    }
}
