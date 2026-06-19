package com.bilibili.studio.editor.moudle.editormain.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bilibili.studio.videoeditor.editor.editdata.PointF;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import fA0.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/widget/EditorVideoPreviewView.class */
public final class EditorVideoPreviewView extends View {
    public static final int h = DensityUtil.dp2px(3.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f107101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Paint f107102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<PointF> f107104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<PointF> f107105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Path f107106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final RectF f107107g;

    @JvmOverloads
    public EditorVideoPreviewView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public EditorVideoPreviewView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public EditorVideoPreviewView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        Paint paint = new Paint();
        this.f107101a = paint;
        this.f107104d = new ArrayList();
        this.f107105e = new ArrayList();
        this.f107107g = new RectF();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStrokeWidth(DensityUtil.dp2px(3.0f));
        Paint paint2 = new Paint();
        this.f107102b = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, 2131104720));
        paint2.setStrokeWidth(DensityUtil.dp2px(1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setPathEffect(null);
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Path path;
        super.onDraw(canvas);
        if (!((ArrayList) this.f107104d).isEmpty() && (path = this.f107106f) != null) {
            canvas.drawPath(path, this.f107102b);
        }
        if (((ArrayList) this.f107105e).isEmpty() || ((ArrayList) this.f107104d).isEmpty()) {
            return;
        }
        PointF pointF = (PointF) ((ArrayList) this.f107105e).get(0);
        PointF pointF2 = (PointF) ((ArrayList) this.f107105e).get(2);
        PointF pointF3 = (PointF) ((ArrayList) this.f107104d).get(0);
        PointF pointF4 = (PointF) ((ArrayList) this.f107104d).get(2);
        float fMin = Math.min(pointF3.f109462x, pointF4.f109462x);
        float fMin2 = Math.min(pointF3.f109463y, pointF4.f109463y);
        float fMax = Math.max(pointF3.f109462x, pointF4.f109462x);
        float fMax2 = Math.max(pointF3.f109463y, pointF4.f109463y);
        float fMin3 = Math.min(pointF.f109462x, fMin);
        float fMin4 = Math.min(pointF.f109463y, fMin2);
        float fMax3 = Math.max(pointF2.f109462x, fMax);
        float fMax4 = Math.max(pointF2.f109463y, fMax2);
        float f7 = pointF.f109462x;
        if ((this.f107103c & 1) == 1) {
            this.f107107g.set(f7, fMin4, h + f7, fMax4);
            canvas.drawRect(this.f107107g, this.f107101a);
        }
        float f8 = pointF2.f109462x;
        if ((this.f107103c & 2) == 2) {
            this.f107107g.set(f8 - h, fMin4, f8, fMax4);
            canvas.drawRect(this.f107107g, this.f107101a);
        }
        float f9 = pointF.f109463y;
        if ((this.f107103c & 4) == 4) {
            this.f107107g.set(fMin3, f9, fMax3, h + f9);
            canvas.drawRect(this.f107107g, this.f107101a);
        }
        float f10 = pointF2.f109463y;
        if ((this.f107103c & 8) == 8) {
            this.f107107g.set(fMin3, f10 - h, fMax3, f10);
            canvas.drawRect(this.f107107g, this.f107101a);
        }
    }

    public final void setBoarderLinePoints(@Nullable List<? extends PointF> list) {
        ((ArrayList) this.f107104d).clear();
        this.f107106f = null;
        if (list != null) {
            if (list.size() < 4) {
                postInvalidate();
                return;
            } else {
                ((ArrayList) this.f107104d).addAll(list);
            }
        }
        this.f107106f = f.a(this.f107104d);
        postInvalidate();
    }

    public final void setLiveWindowPoints(@Nullable List<? extends PointF> list) {
        ((ArrayList) this.f107105e).clear();
        if (list != null) {
            if (list.size() < 4) {
                postInvalidate();
                return;
            } else {
                ((ArrayList) this.f107105e).addAll(list);
            }
        }
        postInvalidate();
    }
}
