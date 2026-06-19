package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/StrokePathImageConstraintLayout.class */
public class StrokePathImageConstraintLayout extends TintConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f79195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f79196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f79197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79198g;
    public final Point h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Point f79199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f79200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f79201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f79202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f79203m;

    public StrokePathImageConstraintLayout(Context context) {
        this(context, null);
    }

    public StrokePathImageConstraintLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.f79195d = paint;
        this.f79196e = (int) ((2.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
        int i7 = (int) ((1.5f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
        this.f79197f = i7;
        this.f79198g = false;
        this.h = new Point();
        this.f79199i = new Point();
        this.f79200j = 0.0f;
        this.f79201k = 0.0f;
        this.f79202l = 0.0f;
        this.f79203m = 0;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i7);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, fl.a.e);
            this.f79203m = typedArrayObtainStyledAttributes.getResourceId(0, this.f79203m);
            typedArrayObtainStyledAttributes.recycle();
        }
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f79198g) {
            canvas.drawCircle(this.f79200j, this.f79201k, this.f79202l, this.f79195d);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        View viewFindViewById;
        super.onLayout(z6, i7, i8, i9, i10);
        int i11 = this.f79203m;
        if (i11 == 0 || (viewFindViewById = findViewById(i11)) == null) {
            return;
        }
        this.h.x = viewFindViewById.getLeft();
        this.h.y = viewFindViewById.getTop();
        this.f79199i.x = viewFindViewById.getWidth();
        this.f79199i.y = viewFindViewById.getHeight();
        float f7 = this.h.x;
        int i12 = this.f79199i.x;
        this.f79200j = (i12 / 2.0f) + f7;
        this.f79201k = (r0.y / 2.0f) + r0.y;
        this.f79202l = (this.f79197f / 2.0f) + (i12 / 2.0f) + this.f79196e;
    }

    @Override // com.bilibili.magicasakura.widgets.TintConstraintLayout, androidx.constraintlayout.widget.ConstraintLayout, com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
        this.f79195d.setColor(ThemeUtils.getColorById(getContext(), 2131103284));
        invalidate();
    }
}
