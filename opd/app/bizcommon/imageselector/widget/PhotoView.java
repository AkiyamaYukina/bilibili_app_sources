package com.bilibili.opd.app.bizcommon.imageselector.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.util.LinkedList;
import java.util.Queue;
import n.C8047a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/PhotoView.class */
public class PhotoView extends StaticImageView2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f73946A = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f73947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View.OnClickListener f73948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f73949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Matrix f73950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f73951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f73952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f73953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f73954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final PointF f73955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final PointF f73956v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f73957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f73958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c f73959y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final GestureDetector f73960z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/PhotoView$a.class */
    public final class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PhotoView f73961a;

        public a(PhotoView photoView) {
            this.f73961a = photoView;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
        /* JADX WARN: Type inference failed for: r0v9, types: [android.widget.ImageView, com.bilibili.opd.app.bizcommon.imageselector.widget.PhotoView] */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onDoubleTap(android.view.MotionEvent r7) {
            /*
                Method dump skipped, instruction units count: 409
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.imageselector.widget.PhotoView.a.onDoubleTap(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
            PhotoView photoView = this.f73961a;
            if (photoView.f73951q != 0) {
                return true;
            }
            h hVar = photoView.f73958x;
            if (hVar != null && hVar.isRunning()) {
                return true;
            }
            PhotoView photoView2 = this.f73961a;
            int i7 = PhotoView.f73946A;
            if (!photoView2.x()) {
                return true;
            }
            this.f73961a.m();
            this.f73961a.f73959y = new c(this.f73961a);
            c cVar = this.f73961a.f73959y;
            cVar.setFloatValues(0.0f, 1.0f);
            cVar.setDuration(TransitionInfo.DEFAULT_DURATION);
            cVar.addUpdateListener(cVar);
            cVar.f73962a = new float[]{f7 / 60.0f, f8 / 60.0f};
            this.f73961a.f73959y.start();
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.bilibili.opd.app.bizcommon.imageselector.widget.PhotoView] */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            ?? r02 = this.f73961a;
            View.OnLongClickListener onLongClickListener = r02.f73949o;
            if (onLongClickListener != 0) {
                onLongClickListener.onLongClick(r02);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.bilibili.opd.app.bizcommon.imageselector.widget.PhotoView] */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            ?? r02 = this.f73961a;
            View.OnClickListener onClickListener = r02.f73948n;
            if (onClickListener == 0) {
                return true;
            }
            onClickListener.onClick(r02);
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/PhotoView$b.class */
    public interface b {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/PhotoView$c.class */
    public final class c extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f73962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PhotoView f73963b;

        public c(PhotoView photoView) {
            this.f73963b = photoView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PhotoView photoView = this.f73963b;
            float[] fArr = this.f73962a;
            float f7 = fArr[0];
            float f8 = fArr[1];
            int i7 = PhotoView.f73946A;
            boolean zA = photoView.A(f7, f8, null);
            float[] fArr2 = this.f73962a;
            float f9 = fArr2[0] * 0.9f;
            fArr2[0] = f9;
            float f10 = fArr2[1] * 0.9f;
            fArr2[1] = f10;
            if (zA) {
                float f11 = 0.0f - f9;
                float f12 = 0.0f - f10;
                if (((float) Math.sqrt((f12 * f12) + (f11 * f11))) >= 1.0f) {
                    return;
                }
            }
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/PhotoView$d.class */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f73964a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f73965b = new f();

        public static float[] a(Matrix matrix) {
            if (matrix == null) {
                return new float[2];
            }
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            return new float[]{fArr[0], fArr[4]};
        }

        public static void b(Matrix matrix) {
            e eVar = f73964a;
            if (matrix == null) {
                eVar.getClass();
            } else if (((LinkedList) eVar.f73966a).size() < 16) {
                ((LinkedList) eVar.f73966a).offer(matrix);
            }
        }

        public static Matrix c(Matrix matrix) {
            Matrix matrixC = f73964a.c();
            if (matrix != null) {
                matrixC.set(matrix);
            }
            return matrixC;
        }

        public static void d(RectF rectF) {
            g gVar = f73965b;
            if (rectF == null) {
                gVar.getClass();
            } else if (((LinkedList) gVar.f73966a).size() < 16) {
                ((LinkedList) gVar.f73966a).offer(rectF);
            }
        }

        public static RectF e() {
            return f73965b.c();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/PhotoView$e.class */
    public static final class e extends f<Matrix> {
        @Override // com.bilibili.opd.app.bizcommon.imageselector.widget.PhotoView.f
        public final Matrix a() {
            return new Matrix();
        }

        @Override // com.bilibili.opd.app.bizcommon.imageselector.widget.PhotoView.f
        public final Matrix b(Matrix matrix) {
            Matrix matrix2 = matrix;
            matrix2.reset();
            return matrix2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/PhotoView$f.class */
    public static abstract class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<T> f73966a = new LinkedList();

        public abstract T a();

        public abstract T b(T t7);

        /* JADX WARN: Multi-variable type inference failed */
        public final T c() {
            return this.f73966a.isEmpty() ? (T) a() : (T) b(((LinkedList) this.f73966a).poll());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/PhotoView$g.class */
    public static final class g extends f<RectF> {
        @Override // com.bilibili.opd.app.bizcommon.imageselector.widget.PhotoView.f
        public final RectF a() {
            return new RectF();
        }

        @Override // com.bilibili.opd.app.bizcommon.imageselector.widget.PhotoView.f
        public final RectF b(RectF rectF) {
            RectF rectF2 = rectF;
            rectF2.setEmpty();
            return rectF2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/PhotoView$h.class */
    public final class h extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f73967a = new float[9];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f73968b = new float[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f73969c = new float[9];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final PhotoView f73970d;

        public h(PhotoView photoView) {
            this.f73970d = photoView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (int i7 = 0; i7 < 9; i7++) {
                float[] fArr = this.f73969c;
                float f7 = this.f73967a[i7];
                fArr[i7] = C8047a.a(this.f73968b[i7], f7, fFloatValue, f7);
            }
            this.f73970d.f73950p.setValues(this.f73969c);
            this.f73970d.getClass();
            this.f73970d.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoView(Context context) {
        super(context);
        this.f73947m = false;
        this.f73950p = new Matrix();
        this.f73951q = 0;
        this.f73952r = true;
        this.f73953s = false;
        this.f73954t = 0.0f;
        this.f73955u = new PointF();
        this.f73956v = new PointF();
        this.f73957w = 0.0f;
        this.f73960z = new GestureDetector(getContext(), new a(this));
        w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73947m = false;
        this.f73950p = new Matrix();
        this.f73951q = 0;
        this.f73952r = true;
        this.f73953s = false;
        this.f73954t = 0.0f;
        this.f73955u = new PointF();
        this.f73956v = new PointF();
        this.f73957w = 0.0f;
        this.f73960z = new GestureDetector(getContext(), new a(this));
        w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Matrix getBottomFitWidthMatrix() {
        float width = getWidth();
        float f7 = 0;
        float f8 = -(((width * f7) / f7) - getHeight());
        float height = getHeight();
        RectF rectFC = d.f73965b.c();
        rectFC.set(0.0f, f8, width, height);
        RectF rectFE = d.e();
        q(rectFE);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectFE, rectFC, Matrix.ScaleToFit.CENTER);
        d.d(rectFC);
        d.d(rectFE);
        return matrix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Matrix getFitWidthMatrix() {
        float width = getWidth();
        float f7 = 0;
        float f8 = (width * f7) / f7;
        RectF rectFC = d.f73965b.c();
        rectFC.set(0.0f, 0.0f, width, f8);
        RectF rectFE = d.e();
        q(rectFE);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectFE, rectFC, Matrix.ScaleToFit.CENTER);
        d.d(rectFC);
        d.d(rectFE);
        return matrix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private float getFitWidthOuterScale() {
        RectF rectFE = d.e();
        q(rectFE);
        float width = getWidth() / rectFE.width();
        d.d(rectFE);
        return width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private float getFitWidthScale() {
        RectF rectFE = d.e();
        q(rectFE);
        float width = getWidth() / rectFE.width();
        d.d(rectFE);
        return width;
    }

    private float getOriginSizeScale() {
        RectF rectFE = d.e();
        q(rectFE);
        float fWidth = 0 / rectFE.width();
        d.d(rectFE);
        return fWidth;
    }

    public static float t(RectF rectF, float f7) {
        float f8 = rectF.right;
        float f9 = rectF.left;
        return f8 - f9 < f7 ? uu.c.a(f8, f9, 2.0f, f7 / 2.0f) : f9 > 0.0f ? -f9 : f8 < f7 ? f7 - f8 : 0.0f;
    }

    public static float u(RectF rectF, float f7) {
        float f8 = rectF.bottom;
        float f9 = rectF.top;
        return f8 - f9 < f7 ? uu.c.a(f8, f9, 2.0f, f7 / 2.0f) : f9 > 0.0f ? -f9 : f8 < f7 ? f7 - f8 : 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(float r7, float r8, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.imageselector.widget.PhotoView.A(float, float, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean canScrollHorizontally(int i7) {
        if (this.f73951q == 2) {
            return true;
        }
        RectF rectFP = p(null);
        if (rectFP.isEmpty()) {
            return false;
        }
        if (i7 > 0) {
            boolean z6 = true;
            if (Math.round(rectFP.right) <= getWidth()) {
                z6 = super/*android.widget.ImageView*/.canScrollHorizontally(i7);
            }
            return z6;
        }
        boolean z7 = true;
        if (Math.round(rectFP.left) >= 0) {
            z7 = super/*android.widget.ImageView*/.canScrollHorizontally(i7);
        }
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean canScrollVertically(int i7) {
        if (this.f73951q == 2) {
            return true;
        }
        RectF rectFP = p(null);
        if (rectFP.isEmpty()) {
            return false;
        }
        if (i7 > 0) {
            boolean z6 = true;
            if (Math.round(rectFP.bottom) <= getHeight()) {
                z6 = super/*android.widget.ImageView*/.canScrollVertically(i7);
            }
            return z6;
        }
        boolean z7 = true;
        if (Math.round(rectFP.top) >= 0) {
            z7 = super/*android.widget.ImageView*/.canScrollVertically(i7);
        }
        return z7;
    }

    public RectF getMask() {
        return null;
    }

    public float getMaxScale() {
        return 4.0f;
    }

    public int getPinchMode() {
        return this.f73951q;
    }

    public final void m() {
        h hVar = this.f73958x;
        if (hVar != null) {
            hVar.cancel();
            this.f73958x = null;
        }
        c cVar = this.f73959y;
        if (cVar != null) {
            cVar.cancel();
            this.f73959y = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (x()) {
            canvas.concat(this.f73950p);
        }
        super/*com.bilibili.lib.image2.view.InnerInsulateImageView*/.onDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h hVar;
        super/*com.bilibili.lib.image2.view.BiliImageView*/.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            if (this.f73951q == 2 && x()) {
                Matrix matrixC = d.f73964a.c();
                s(matrixC).postConcat(this.f73950p);
                float f7 = d.a(matrixC)[0];
                float f8 = d.a(this.f73950p)[0];
                float width = getWidth();
                float height = getHeight();
                float maxScale = getMaxScale();
                float f9 = f7 > maxScale ? maxScale / f7 : 1.0f;
                float f10 = f9;
                if (f8 * f9 < 1.0f) {
                    f10 = 1.0f / f8;
                }
                boolean z6 = f10 != 1.0f;
                Matrix matrixC2 = d.c(matrixC);
                PointF pointF = this.f73955u;
                matrixC2.postScale(f10, f10, pointF.x, pointF.y);
                RectF rectFE = d.e();
                q(rectFE);
                matrixC2.mapRect(rectFE);
                float fT = t(rectFE, width);
                float fU = u(rectFE, height);
                if (fT != 0.0f || fU != 0.0f) {
                    z6 = true;
                }
                if (z6) {
                    Matrix matrixC3 = d.c(this.f73950p);
                    PointF pointF2 = this.f73955u;
                    matrixC3.postScale(f10, f10, pointF2.x, pointF2.y);
                    matrixC3.postTranslate(fT, fU);
                    m();
                    h hVar2 = new h(this);
                    this.f73958x = hVar2;
                    Matrix matrix = this.f73950p;
                    hVar2.setFloatValues(0.0f, 1.0f);
                    hVar2.setDuration(200L);
                    hVar2.addUpdateListener(hVar2);
                    matrix.getValues(hVar2.f73967a);
                    matrixC3.getValues(hVar2.f73968b);
                    this.f73958x.start();
                    d.b(matrixC3);
                }
                d.d(rectFE);
                d.b(matrixC2);
                d.b(matrixC);
            }
            if (this.f73951q == 1 && this.f73953s) {
                if (this.f73954t <= getHeight() / 10 && (!this.f73947m || Math.abs(this.f73954t) <= getHeight() / 10)) {
                    if (this.f73954t > 0.0f) {
                        y(new Matrix());
                    } else {
                        y(new Matrix());
                    }
                }
                this.f73953s = false;
                this.f73954t = 0.0f;
            }
            this.f73951q = 0;
        } else if (action == 6) {
            if (this.f73951q == 2 && motionEvent.getPointerCount() > 2) {
                if ((motionEvent.getAction() >> 8) == 0) {
                    z(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                } else if ((motionEvent.getAction() >> 8) == 1) {
                    z(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                }
            }
        } else if (action == 0) {
            h hVar3 = this.f73958x;
            if (hVar3 == null || !hVar3.isRunning()) {
                m();
                this.f73951q = 1;
                this.f73955u.set(motionEvent.getX(), motionEvent.getY());
            }
        } else if (action == 5) {
            m();
            this.f73951q = 2;
            z(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
        } else if (action == 2 && ((hVar = this.f73958x) == null || !hVar.isRunning())) {
            int i7 = this.f73951q;
            if (i7 == 1) {
                A(motionEvent.getX() - this.f73955u.x, motionEvent.getY() - this.f73955u.y, motionEvent);
                this.f73955u.set(motionEvent.getX(), motionEvent.getY());
            } else if (i7 == 2 && motionEvent.getPointerCount() > 1) {
                float x6 = motionEvent.getX(0);
                float y6 = motionEvent.getY(0);
                float x7 = motionEvent.getX(1);
                float y7 = motionEvent.getY(1);
                e eVar = d.f73964a;
                float f11 = x6 - x7;
                float f12 = y6 - y7;
                float fSqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
                float[] fArr = {(motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f};
                this.f73955u.set(fArr[0], fArr[1]);
                PointF pointF3 = this.f73956v;
                float f13 = this.f73957w;
                PointF pointF4 = this.f73955u;
                if (x()) {
                    float f14 = f13 * fSqrt;
                    Matrix matrixC4 = d.f73964a.c();
                    matrixC4.postScale(f14, f14, pointF3.x, pointF3.y);
                    matrixC4.postTranslate(pointF4.x - pointF3.x, pointF4.y - pointF3.y);
                    this.f73950p.set(matrixC4);
                    d.b(matrixC4);
                    invalidate();
                }
            }
        }
        this.f73960z.onTouchEvent(motionEvent);
        return true;
    }

    public final RectF p(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!x()) {
            return rectF;
        }
        Matrix matrixC = d.f73964a.c();
        s(matrixC).postConcat(this.f73950p);
        q(rectF);
        matrixC.mapRect(rectF);
        d.b(matrixC);
        return rectF;
    }

    public final void q(RectF rectF) {
        getGenericProperties().getActualImageBounds(rectF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Matrix s(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (x()) {
            RectF rectFE = d.e();
            q(rectFE);
            float width = getWidth();
            float height = getHeight();
            RectF rectFC = d.f73965b.c();
            rectFC.set(0.0f, 0.0f, width, height);
            matrix.setRectToRect(rectFE, rectFC, Matrix.ScaleToFit.CENTER);
            d.d(rectFC);
            d.d(rectFE);
        }
        return matrix;
    }

    public void setCanCloseByScrollUp(boolean z6) {
        this.f73947m = z6;
    }

    public void setDragClosingListener(b bVar) {
    }

    public void setEnableClosingDrag(boolean z6) {
        this.f73952r = z6;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f73948n = onClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f73949o = onLongClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOuterMatrix(Matrix matrix) {
        this.f73950p.set(matrix);
        invalidate();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w() {
        super/*android.widget.ImageView*/.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x() {
        RectF rectFE = d.e();
        q(rectFE);
        boolean z6 = getDrawable() != null && rectFE.right > 0.0f && rectFE.bottom > 0.0f && getWidth() > 0 && getHeight() > 0;
        d.d(rectFE);
        return z6;
    }

    public final void y(Matrix matrix) {
        this.f73951q = 0;
        m();
        h hVar = new h(this);
        this.f73958x = hVar;
        Matrix matrix2 = this.f73950p;
        hVar.setFloatValues(0.0f, 1.0f);
        hVar.setDuration(300L);
        hVar.addUpdateListener(hVar);
        matrix2.getValues(hVar.f73967a);
        matrix.getValues(hVar.f73968b);
        this.f73958x.start();
    }

    public final void z(float f7, float f8, float f9, float f10) {
        float[] fArr;
        float f11 = f7 - f9;
        float f12 = f8 - f10;
        this.f73957w = d.a(this.f73950p)[0] / ((float) Math.sqrt((f12 * f12) + (f11 * f11)));
        float f13 = (f7 + f9) / 2.0f;
        float f14 = (f8 + f10) / 2.0f;
        Matrix matrix = this.f73950p;
        if (matrix != null) {
            fArr = new float[2];
            Matrix matrixC = d.f73964a.c();
            matrix.invert(matrixC);
            matrixC.mapPoints(fArr, new float[]{f13, f14});
            d.b(matrixC);
        } else {
            fArr = new float[2];
        }
        this.f73956v.set(fArr[0], fArr[1]);
    }
}
