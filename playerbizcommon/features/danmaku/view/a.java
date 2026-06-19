package com.bilibili.playerbizcommon.features.danmaku.view;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/a.class */
public class a extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f79762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f79763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f79764e;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.danmaku.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/a$a.class */
    public interface InterfaceC0518a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/a$b.class */
    public interface b {
    }

    public a(Context context) {
        super(context);
    }

    private Drawable getTickDrawable() {
        Drawable drawableFindDrawableByLayerId;
        Drawable drawable = this.f79762c;
        Drawable progressDrawable = drawable;
        if (drawable == null) {
            progressDrawable = getProgressDrawable();
            if (progressDrawable != null) {
                Drawable drawableMutate = progressDrawable.mutate();
                drawableFindDrawableByLayerId = drawableMutate;
                if (drawableMutate instanceof LayerDrawable) {
                    drawableFindDrawableByLayerId = ((LayerDrawable) progressDrawable).findDrawableByLayerId(R.id.background);
                }
            } else {
                drawableFindDrawableByLayerId = null;
            }
            if (drawableFindDrawableByLayerId != null) {
                progressDrawable = drawableFindDrawableByLayerId;
            }
        }
        return progressDrawable;
    }

    public String getCurrentLabel() {
        return String.valueOf(getProgress());
    }

    public b getOnSectionChangedListener() {
        return this.f79763d;
    }

    public int getSection() {
        int progress = getProgress();
        int i7 = progress / 100;
        int i8 = i7;
        if (progress % 100 >= 50) {
            i8 = i7 + 1;
        }
        return i8;
    }

    @Override // android.widget.AbsSeekBar
    public Drawable getThumb() {
        Drawable thumb = this.f79764e;
        if (thumb == null) {
            thumb = super.getThumb();
        }
        return thumb;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        synchronized (this) {
            if (this.f79764e != null) {
                int height = getHeight();
                Rect bounds = this.f79764e.getBounds();
                int iHeight = bounds.height();
                this.f79764e.setBounds(bounds.left, (height - iHeight) / 2, bounds.right, (height + iHeight) / 2);
            }
            super.onDraw(canvas);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i7, int i8) {
        synchronized (this) {
            super.onMeasure(i7, i8);
        }
    }

    public void setAdapter(InterfaceC0518a interfaceC0518a) {
    }

    public void setOnSectionChangedListener(b bVar) {
        this.f79763d = bVar;
    }

    public void setSectionCount(int i7) {
        int iMax = Math.max(0, i7);
        this.f79761b = iMax;
        int[] iArr = new int[iMax + 1];
        setMax(iMax * 100);
    }

    public void setSelectedSection(int i7) {
        if (i7 < 0 || i7 > this.f79761b) {
            return;
        }
        setProgress(i7 * 100);
    }

    public void setSelectedTextColor(int i7) {
    }

    public void setTextColor(int i7) {
    }

    public void setTextSize(int i7) {
        TypedValue.applyDimension(2, i7, getContext().getResources().getDisplayMetrics());
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        super.setThumb(drawable);
        this.f79764e = drawable;
    }

    public void setTickDrawable(Drawable drawable) {
        this.f79762c = drawable;
    }
}
