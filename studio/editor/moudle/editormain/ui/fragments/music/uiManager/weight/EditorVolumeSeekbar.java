package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.uiManager.weight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.bilibili.droid.DimenUtilsKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qe.i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/uiManager/weight/EditorVolumeSeekbar.class */
public final class EditorVolumeSeekbar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Paint f106867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Path f106868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f106869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f106870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f106871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f106872g;

    @Nullable
    public Drawable h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Paint f106873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f106874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f106875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f106876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f106877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f106878n;

    @JvmOverloads
    public EditorVolumeSeekbar(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public EditorVolumeSeekbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public EditorVolumeSeekbar(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f106874j = "#0CFF4785";
        this.f106875k = "#33FF4785";
        this.f106877m = true;
        this.f106878n = DimenUtilsKt.dpToPx(2);
    }

    public final void g() {
        Rect bounds;
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable == null || (bounds = currentDrawable.getBounds()) == null) {
            return;
        }
        this.f106871f = ((getPaddingTop() + bounds.top) * 1.0f) - this.f106878n;
        float paddingLeft = (bounds.left * 1.0f) + getPaddingLeft();
        this.f106869d = paddingLeft;
        this.f106870e = (((getProgress() * 1.0f) / (getMax() - getMin())) * bounds.width()) + paddingLeft;
        this.f106872g = ((((bounds.width() - this.f106870e) + getPaddingLeft()) * (this.f106871f - getPaddingTop())) / bounds.width()) + getPaddingTop();
    }

    @NotNull
    public final String getEndColor() {
        return this.f106875k;
    }

    @NotNull
    public final String getStartColor() {
        return this.f106874j;
    }

    public final int getTriangleMarginBottom() {
        return this.f106878n;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Paint paint;
        Drawable currentDrawable;
        Rect bounds;
        Path path;
        if (!isEnabled() || Build.VERSION.SDK_INT <= 29) {
            super.onDraw(canvas);
            return;
        }
        this.h = getThumb();
        setThumb(null);
        if (this.f106877m) {
            g();
            Paint paint2 = this.f106867b;
            if (paint2 != null && (path = this.f106868c) != null) {
                path.reset();
                path.moveTo(this.f106869d, this.f106871f);
                path.lineTo(this.f106870e, this.f106871f);
                path.lineTo(this.f106870e, this.f106872g);
                path.close();
                canvas.drawPath(path, paint2);
            }
        }
        super.onDraw(canvas);
        if (this.f106876l && (paint = this.f106873i) != null && (currentDrawable = getCurrentDrawable()) != null && (bounds = currentDrawable.getBounds()) != null) {
            canvas.drawCircle((bounds.width() / 2.0f) + getPaddingLeft() + bounds.left, (bounds.height() / 2.0f) + getPaddingTop() + bounds.top, DimenUtilsKt.dpToPx(2.0f) * 1.0f, paint);
        }
        int iSave = canvas.save();
        canvas.translate((getPaddingLeft() - getThumbOffset()) * 1.0f, getPaddingTop() * 1.0f);
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restoreToCount(iSave);
        setThumb(this.h);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (Build.VERSION.SDK_INT <= 29) {
            return;
        }
        if (this.f106877m && this.f106867b == null) {
            this.f106868c = new Path();
            Paint paintA = i.a(true);
            paintA.setStyle(Paint.Style.FILL);
            this.f106867b = paintA;
        }
        if (this.f106876l && this.f106873i == null) {
            Paint paintA2 = i.a(true);
            paintA2.setStyle(Paint.Style.FILL);
            paintA2.setColor(-1);
            this.f106873i = paintA2;
        }
        g();
        LinearGradient linearGradient = new LinearGradient(this.f106869d, this.f106871f, this.f106870e, this.f106872g, Color.parseColor(this.f106874j), Color.parseColor(this.f106875k), Shader.TileMode.CLAMP);
        Paint paint = this.f106867b;
        if (paint != null) {
            paint.setShader(linearGradient);
        }
    }

    public final void setDrawCircle(boolean z6) {
        this.f106876l = z6;
    }

    public final void setDrawTriangle(boolean z6) {
        this.f106877m = z6;
    }

    public final void setEndColor(@NotNull String str) {
        this.f106875k = str;
    }

    public final void setStartColor(@NotNull String str) {
        this.f106874j = str;
    }

    public final void setTriangleMarginBottom(int i7) {
        this.f106878n = i7;
    }
}
