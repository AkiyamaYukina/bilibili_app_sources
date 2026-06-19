package com.bilibili.studio.template.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.bilibili.droid.ScreenUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/widget/VolumeSeekBar.class */
public class VolumeSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f108663b;

    public VolumeSeekBar(Context context) {
        super(context);
        g();
    }

    public VolumeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public final void g() {
        Paint paint = new Paint();
        this.f108663b = paint;
        paint.setAntiAlias(true);
        this.f108663b.setColor(-1);
        this.f108663b.setStrokeWidth(ScreenUtil.dip2px(getContext(), 3.0f));
        this.f108663b.setStyle(Paint.Style.FILL);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            int max = getMax();
            if (getProgress() <= (max / 2) + 3) {
                int i7 = max / 2;
            }
        }
    }
}
