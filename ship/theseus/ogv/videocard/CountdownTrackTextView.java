package com.bilibili.ship.theseus.ogv.videocard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/CountdownTrackTextView.class */
@StabilityInferred(parameters = 0)
public final class CountdownTrackTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f94625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Path f94626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Path f94627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PathMeasure f94628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f94629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f94630f;

    @JvmOverloads
    public CountdownTrackTextView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public CountdownTrackTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public CountdownTrackTextView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f94625a = new Paint();
        this.f94626b = new Path();
        this.f94627c = new Path();
        this.f94628d = new PathMeasure();
    }

    public final boolean getCountdownTrackEnabled() {
        return this.f94630f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f94630f) {
            canvas.save();
            this.f94627c.reset();
            PathMeasure pathMeasure = this.f94628d;
            pathMeasure.getSegment(pathMeasure.getLength() * this.f94629e, this.f94628d.getLength(), this.f94627c, true);
            canvas.clipPath(this.f94627c);
            canvas.drawPath(this.f94627c, this.f94625a);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f94625a.setColor(-1);
        this.f94625a.setAntiAlias(true);
        this.f94625a.setDither(true);
        this.f94625a.setStyle(Paint.Style.STROKE);
        this.f94625a.setStrokeWidth(Uj0.c.a(2, getContext()));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (this.f94630f) {
            this.f94626b.moveTo(getWidth(), getHeight() / 2.0f);
            float fA = Uj0.c.a(12, getContext());
            this.f94626b.lineTo(getWidth(), fA);
            float f7 = 2 * fA;
            this.f94626b.arcTo(getWidth() - f7, 0.0f, getWidth(), f7, 0.0f, -90.0f, false);
            this.f94626b.lineTo(fA, 0.0f);
            this.f94626b.arcTo(0.0f, 0.0f, f7, f7, -90.0f, -90.0f, false);
            this.f94626b.lineTo(0.0f, fA);
            this.f94626b.arcTo(0.0f, getHeight() - f7, f7, getHeight(), -180.0f, -90.0f, false);
            this.f94626b.lineTo(getWidth() - fA, getHeight());
            this.f94626b.arcTo(getWidth() - f7, getHeight() - f7, getWidth(), getHeight(), -270.0f, -90.0f, false);
            this.f94626b.lineTo(getWidth(), getHeight() / 2.0f);
            this.f94628d.setPath(this.f94626b, false);
        }
    }

    public final void setCountdownAnimatedValue(float f7) {
        if (this.f94630f) {
            this.f94629e = f7;
            invalidate();
        }
    }

    public final void setCountdownTrackEnabled(boolean z6) {
        this.f94630f = z6;
    }
}
