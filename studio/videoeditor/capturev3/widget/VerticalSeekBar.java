package com.bilibili.studio.videoeditor.capturev3.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bilibili.studio.videoeditor.util.DensityUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/VerticalSeekBar.class */
public class VerticalSeekBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f109416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f109417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap f109418g;
    public final Rect h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f109419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f109420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f109421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f109422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f109423m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/VerticalSeekBar$a.class */
    public interface a {
    }

    public VerticalSeekBar(Context context) {
        this(context, null);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f109422l = 100;
        int iDp2px = DensityUtil.dp2px(context, 18.0f);
        this.f109414c = iDp2px;
        this.f109415d = iDp2px / 2;
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.f109416e = paint;
        paint.setColor(-1);
        this.f109416e.setStyle(Paint.Style.FILL);
        this.f109416e.setStrokeWidth(1.0f);
        Paint paint2 = new Paint(1);
        this.f109417f = paint2;
        paint2.setFilterBitmap(true);
        this.f109417f.setDither(true);
        this.f109418g = ((BitmapDrawable) resources.getDrawable(2131241245)).getBitmap();
        this.h = new Rect(0, 0, this.f109418g.getWidth(), this.f109418g.getHeight());
        this.f109419i = new Rect();
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getY() <= this.f109415d) {
            Rect rect = this.f109419i;
            rect.top = 0;
            rect.bottom = this.f109414c;
            invalidate();
            return;
        }
        float y6 = motionEvent.getY();
        int i7 = this.f109413b;
        if (y6 >= i7 - this.f109415d) {
            Rect rect2 = this.f109419i;
            rect2.bottom = i7;
            rect2.top = i7 - this.f109414c;
            invalidate();
            return;
        }
        this.f109419i.top = ((int) motionEvent.getY()) - this.f109415d;
        this.f109419i.bottom = ((int) motionEvent.getY()) + this.f109415d;
        int iCenterY = (int) ((((this.f109413b - r0) - this.f109419i.centerY()) / (this.f109413b - this.f109414c)) * this.f109422l);
        this.f109421k = iCenterY;
        this.f109423m = iCenterY;
        a aVar = this.f109420j;
        if (aVar != null) {
            ((CaptureFocusExposureView) aVar).b(iCenterY);
        }
        invalidate();
    }

    public int getMax() {
        return this.f109422l;
    }

    public int getProgress() {
        return this.f109421k;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i7 = this.f109412a;
        canvas.drawLine(i7 / 2, this.f109413b, i7 / 2, this.f109419i.bottom, this.f109416e);
        int i8 = this.f109412a;
        canvas.drawLine(i8 / 2, this.f109419i.top, i8 / 2, 0.0f, this.f109416e);
        canvas.drawBitmap(this.f109418g, this.h, this.f109419i, this.f109417f);
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        this.f109412a = getMeasuredWidth();
        this.f109413b = getMeasuredHeight();
        Rect rect = this.f109419i;
        int i9 = this.f109412a;
        int i10 = this.f109414c;
        rect.left = (i9 - i10) / 2;
        rect.right = (i9 + i10) / 2;
        int i11 = (int) ((this.f109421k / this.f109422l) * (r0 - i10));
        rect.top = i11;
        rect.bottom = i11 + i10;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.widget.VerticalSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMax(int i7) {
        this.f109422l = i7;
    }

    public void setProgress(int i7) {
        if (this.f109423m == i7) {
            return;
        }
        this.f109421k = i7;
        this.f109423m = i7;
        Rect rect = this.f109419i;
        int i8 = this.f109413b;
        int i9 = this.f109414c;
        int i10 = (int) ((1.0f - (i7 / this.f109422l)) * (i8 - i9));
        rect.top = i10;
        rect.bottom = i10 + i9;
        a aVar = this.f109420j;
        if (aVar != null) {
            ((CaptureFocusExposureView) aVar).b(i7);
        }
        invalidate();
    }

    public void setSeekChangeListener(a aVar) {
        this.f109420j = aVar;
    }
}
