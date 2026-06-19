package com.bilibili.music.podcast.view.mini;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/SimpleProgressView.class */
public final class SimpleProgressView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f67299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Paint f67300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f67301c;

    public SimpleProgressView(@NotNull Context context) {
        this(context, null);
    }

    public SimpleProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.f67299a = paint;
        Paint paint2 = new Paint();
        this.f67300b = paint2;
        paint.setColor(ContextCompat.getColor(context, R$color.Brand_pink));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint2.setColor(ContextCompat.getColor(context, R$color.Graph_bg_regular));
        paint2.setStrokeCap(cap);
        paint2.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f67300b);
        canvas.drawRect(0.0f, 0.0f, this.f67301c * getWidth(), getHeight(), this.f67299a);
    }
}
