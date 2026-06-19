package com.bilibili.studio.videoeditor.editor.imagemake.ui;

import O21.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.studio.videoeditor.editor.imagemake.views.GestureCropImageView;
import com.bilibili.studio.videoeditor.editor.imagemake.views.OverlayView;
import com.bilibili.studio.videoeditor.w;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/imagemake/ui/EditCropView.class */
public class EditCropView extends FrameLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f109466j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureCropImageView f109467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OverlayView f109468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f109469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GestureDetector f109470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScaleGestureDetector f109471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f109472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f109473g;
    public final Matrix h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f109474i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/imagemake/ui/EditCropView$a.class */
    public final class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditCropView f109475a;

        public a(EditCropView editCropView) {
            this.f109475a = editCropView;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
            EditCropView editCropView = this.f109475a;
            float f9 = -f7;
            float f10 = -f8;
            int i7 = EditCropView.f109466j;
            editCropView.getClass();
            if (f9 == 0.0f && f10 == 0.0f) {
                return true;
            }
            editCropView.h.postTranslate(f9, f10);
            editCropView.postInvalidate();
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/imagemake/ui/EditCropView$b.class */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<EditCropView> f109476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f109477b = 500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f109478c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f109479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f109480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f109481f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f109482g;
        public final EditCropView h;

        public b(EditCropView editCropView, EditCropView editCropView2, float f7, float f8, float f9, float f10) {
            this.h = editCropView;
            this.f109476a = new WeakReference<>(editCropView2);
            this.f109479d = f7;
            this.f109480e = f8;
            this.f109481f = f9;
            this.f109482g = f10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            EditCropView editCropView = this.f109476a.get();
            float fMin = Math.min(this.f109477b, System.currentTimeMillis() - this.f109478c);
            float fA = pC0.a.a(fMin, this.f109480e - this.f109479d, this.f109477b) + this.f109479d;
            float fA2 = this.f109481f - pC0.a.a(fMin, this.f109481f, this.f109477b);
            float fA3 = this.f109482g - pC0.a.a(fMin, this.f109482g, this.f109477b);
            if (fMin < this.f109477b) {
                EditCropView.b(editCropView, fA, fA2, fA3);
                editCropView.post(this);
            } else {
                EditCropView.b(editCropView, fA, fA2, fA3);
                this.h.f109474i = false;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/imagemake/ui/EditCropView$c.class */
    public final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditCropView f109483a;

        public c(EditCropView editCropView) {
            this.f109483a = editCropView;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            EditCropView editCropView = this.f109483a;
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            EditCropView editCropView2 = this.f109483a;
            EditCropView.a(editCropView, scaleFactor, editCropView2.f109472f, editCropView2.f109473g);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, qC0.b$a] */
    public EditCropView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = new Matrix();
        this.f109474i = false;
        LayoutInflater.from(context).inflate(2131498297, (ViewGroup) this, true);
        GestureCropImageView gestureCropImageView = (GestureCropImageView) findViewById(2131305946);
        this.f109467a = gestureCropImageView;
        OverlayView overlayView = (OverlayView) findViewById(2131305961);
        this.f109468b = overlayView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f110271i);
        overlayView.getClass();
        overlayView.f109510l = typedArrayObtainStyledAttributes.getBoolean(2, false);
        int color = typedArrayObtainStyledAttributes.getColor(3, overlayView.getResources().getColor(2131101440));
        overlayView.f109511m = color;
        overlayView.f109513o.setColor(color);
        Paint paint = overlayView.f109513o;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        overlayView.f109513o.setStrokeWidth(1.0f);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, overlayView.getResources().getDimensionPixelSize(2131165928));
        int color2 = typedArrayObtainStyledAttributes.getColor(4, overlayView.getResources().getColor(2131101438));
        overlayView.f109515q.setStrokeWidth(dimensionPixelSize);
        overlayView.f109515q.setColor(color2);
        overlayView.f109515q.setStyle(style);
        overlayView.f109523y = dimensionPixelSize * 6;
        overlayView.f109516r.setColor(color2);
        overlayView.f109516r.setStyle(Paint.Style.FILL);
        overlayView.f109508j = typedArrayObtainStyledAttributes.getBoolean(10, true);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, overlayView.getResources().getDimensionPixelSize(2131165929));
        int color3 = typedArrayObtainStyledAttributes.getColor(6, overlayView.getResources().getColor(2131101439));
        overlayView.f109514p.setStrokeWidth(dimensionPixelSize2);
        overlayView.f109514p.setColor(color3);
        overlayView.f109505f = typedArrayObtainStyledAttributes.getInt(8, 2);
        overlayView.f109506g = typedArrayObtainStyledAttributes.getInt(7, 2);
        overlayView.f109509k = typedArrayObtainStyledAttributes.getBoolean(11, true);
        gestureCropImageView.getClass();
        float fAbs = Math.abs(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        float fAbs2 = Math.abs(typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        if (fAbs == 0.0f || fAbs2 == 0.0f) {
            gestureCropImageView.f125925z = 0.0f;
        } else {
            gestureCropImageView.f125925z = fAbs / fAbs2;
        }
        typedArrayObtainStyledAttributes.recycle();
        gestureCropImageView.setCropBoundsChangeListener(new o(this));
        gestureCropImageView.setTransformMatrixListener(new Object());
        overlayView.setOverlayViewChangeListener(new oC0.a(this));
        this.f109470d = new GestureDetector(getContext(), new a(this), null, true);
        this.f109471e = new ScaleGestureDetector(getContext(), new c(this));
    }

    public static void a(EditCropView editCropView, float f7, float f8, float f9) {
        if (f7 == 0.0f) {
            editCropView.getClass();
            return;
        }
        float currentScale = f7;
        if (editCropView.getCurrentScale() * f7 <= 0.4f) {
            currentScale = 0.4f / editCropView.getCurrentScale();
        }
        editCropView.h.postScale(currentScale, currentScale, f8, f9);
        editCropView.postInvalidate();
    }

    public static void b(EditCropView editCropView, float f7, float f8, float f9) {
        if (f7 == 0.0f) {
            editCropView.getClass();
            return;
        }
        editCropView.h.setTranslate(f8, f9);
        editCropView.h.postScale(f7 / editCropView.getCurrentScale(), f7 / editCropView.getCurrentScale(), f8, f9);
        editCropView.postInvalidate();
    }

    private float getCurrentScale() {
        Matrix matrix = this.h;
        matrix.getValues(new float[9]);
        double dPow = Math.pow(r0[0], 2.0d);
        matrix.getValues(new float[9]);
        return (float) Math.sqrt(Math.pow(r0[3], 2.0d) + dPow);
    }

    private float getCurrentTransX() {
        float[] fArr = new float[9];
        this.h.getValues(fArr);
        return fArr[2];
    }

    private float getCurrentTransY() {
        float[] fArr = new float[9];
        this.h.getValues(fArr);
        return fArr[5];
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.concat(this.h);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @NonNull
    public GestureCropImageView getCropImageView() {
        return this.f109467a;
    }

    @NonNull
    public OverlayView getOverlayView() {
        return this.f109468b;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f109474i) {
            return super.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 0) {
            removeCallbacks(this.f109469c);
        }
        boolean z6 = false;
        if (motionEvent.getPointerCount() > 1) {
            this.f109472f = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f109473g = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        this.f109470d.onTouchEvent(motionEvent);
        this.f109471e.onTouchEvent(motionEvent);
        if (motionEvent.getAction() != 1 && (motionEvent.getAction() & 255) != 6) {
            return true;
        }
        if (getCurrentScale() < 1.0f) {
            b bVar = new b(this, this, getCurrentScale(), 1.0f, getCurrentTransX(), getCurrentTransY());
            this.f109469c = bVar;
            postDelayed(bVar, 0L);
            this.f109474i = true;
            return true;
        }
        if (getCurrentScale() != 1.0f) {
            return true;
        }
        boolean z7 = ((getCurrentScale() - 1.0f) * ((float) getWidth())) / 2.0f < Math.abs(getCurrentTransX());
        if (((getCurrentScale() - 1.0f) * getHeight()) / 2.0f < Math.abs(getCurrentTransY())) {
            z6 = true;
        }
        float currentScale = 0.0f;
        float currentScale2 = z7 ? (((getCurrentScale() - 1.0f) * getWidth()) / 2.0f) - getCurrentTransX() : 0.0f;
        if (z6) {
            currentScale = (((getCurrentScale() - 1.0f) * getHeight()) / 2.0f) - getCurrentTransY();
        }
        b bVar2 = new b(this, this, getCurrentScale(), getCurrentScale(), -currentScale2, -currentScale);
        this.f109469c = bVar2;
        postDelayed(bVar2, 0L);
        this.f109474i = true;
        return true;
    }

    public void setInit(boolean z6) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
