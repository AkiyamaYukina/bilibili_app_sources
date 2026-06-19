package com.bilibili.upper.module.cover_v2.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.studio.editor.moudle.common.AdsorbResult;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/MultiCaptionRectView.class */
@StabilityInferred(parameters = 0)
public final class MultiCaptionRectView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f112987A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public Path f112988B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final Bitmap f112989C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final Bitmap f112990D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Bitmap f112991E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public b f112993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public b f112994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PointF f112995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PointF f112996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PointF f112997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final RectF f112998g;

    @NotNull
    public final RectF h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final RectF f112999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public RectF f113000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public List<PointF> f113001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f113002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f113003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f113004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f113005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Paint f113006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f113007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f113008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f113009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f113010t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f113011u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final GestureDetector f113012v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final rx0.b f113013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final ScaleGestureDetector f113014x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public a f113015y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public a f113016z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/MultiCaptionRectView$a.class */
    public interface a {
        void a();

        void b(float f7);

        void c();

        void d(float f7, float f8);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/MultiCaptionRectView$b.class */
    public interface b {
        void a();

        void b(float f7, float f8);

        void c();

        void d(float f7, float f8, boolean z6);

        void e(@NotNull PointF pointF, float f7, float f8);

        void f(@NotNull PointF pointF, @NotNull PointF pointF2);

        void n();

        void onRotate(float f7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/MultiCaptionRectView$c.class */
    public static final class c implements ScaleGestureDetector.OnScaleGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiCaptionRectView f113017a;

        public c(MultiCaptionRectView multiCaptionRectView) {
            this.f113017a = multiCaptionRectView;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            MultiCaptionRectView multiCaptionRectView = this.f113017a;
            if (multiCaptionRectView.f112993b != null) {
                multiCaptionRectView.getCenter();
            }
            a aVar = this.f113017a.f113015y;
            if (aVar == null) {
                return true;
            }
            aVar.b(scaleFactor);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/MultiCaptionRectView$d.class */
    public static final class d extends b.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiCaptionRectView f113018a;

        public d(MultiCaptionRectView multiCaptionRectView) {
            this.f113018a = multiCaptionRectView;
        }

        public final void b(rx0.b bVar) {
            b bVar2 = this.f113018a.f112993b;
            if (bVar2 != null) {
                bVar2.onRotate(bVar.e());
            }
        }
    }

    public MultiCaptionRectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f112995d = new PointF(0.0f, 0.0f);
        this.f112996e = new PointF(0.0f, 0.0f);
        this.f112997f = new PointF();
        this.f112998g = new RectF();
        this.h = new RectF();
        this.f112999i = new RectF();
        this.f113000j = new RectF();
        this.f113001k = new ArrayList();
        Paint paint = new Paint();
        this.f113006p = paint;
        this.f113007q = true;
        this.f113008r = DensityUtil.dp2px(1.0f);
        AdsorbResult adsorbResult = AdsorbResult.NO_ADSORBED;
        new Pair(adsorbResult, adsorbResult);
        new PointF();
        this.f112988B = new Path();
        this.f112989C = BitmapFactory.decodeResource(getResources(), 2131242534);
        this.f112990D = BitmapFactory.decodeResource(getResources(), 2131242536);
        this.f112991E = BitmapFactory.decodeResource(getResources(), 2131242535);
        d dVar = new d(this);
        c cVar = new c(this);
        this.f113008r = DensityUtil.dp2px(context, 1.0f);
        setLayerType(1, null);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(this.f113008r);
        paint.setStyle(Paint.Style.STROKE);
        this.f113013w = new rx0.b(context, dVar);
        this.f113014x = new ScaleGestureDetector(context, cVar);
        this.f113012v = new GestureDetector(context, new com.bilibili.upper.module.cover_v2.widgets.a(this));
        this.f112992a = DensityUtil.dp2px(context, 10.0f);
    }

    @NotNull
    public final PointF getCenter() {
        PointF pointF;
        if (this.f113001k.size() < 4) {
            pointF = new PointF();
        } else {
            float f7 = 2;
            pointF = new PointF((this.f113001k.get(0).x + this.f113001k.get(2).x) / f7, (this.f113001k.get(0).y + this.f113001k.get(2).y) / f7);
        }
        return pointF;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f113009s && this.f113015y == null && this.f113001k.size() >= 4) {
            canvas.drawPath(this.f112988B, this.f113006p);
            if (this.f113001k.size() >= 4) {
                float width = this.f113001k.get(0).x - (this.f112989C.getWidth() / 2.0f);
                float height = this.f113001k.get(0).y - (this.f112989C.getHeight() / 2.0f);
                float f7 = this.f113001k.get(0).x;
                float f8 = this.f113001k.get(0).y;
                canvas.drawBitmap(this.f112989C, width, height, this.f113006p);
                this.f112998g.set(width, height, (this.f112989C.getWidth() / 2.0f) + f7, (this.f112989C.getHeight() / 2.0f) + f8);
            }
            if (this.f113001k.size() >= 4) {
                float width2 = this.f113001k.get(3).x - (this.f112991E.getWidth() / 2.0f);
                float height2 = this.f113001k.get(3).y - (this.f112991E.getHeight() / 2.0f);
                float f9 = this.f113001k.get(3).x;
                float f10 = this.f113001k.get(3).y;
                canvas.drawBitmap(this.f112991E, width2, height2, this.f113006p);
                this.h.set(width2, height2, (this.f112991E.getWidth() / 2.0f) + f9, (this.f112991E.getHeight() / 2.0f) + f10);
            }
            if (!this.f113007q) {
                this.f112999i.setEmpty();
                return;
            }
            if (this.f113001k.size() >= 4) {
                float height3 = this.f113001k.get(2).x - (this.f112990D.getHeight() / 2.0f);
                float width3 = this.f113001k.get(2).y - (this.f112990D.getWidth() / 2.0f);
                float f11 = this.f113001k.get(2).x;
                float f12 = this.f113001k.get(2).y;
                canvas.drawBitmap(this.f112990D, height3, width3, this.f113006p);
                this.f112999i.set(height3, width3, (this.f112990D.getWidth() / 2.0f) + f11, (this.f112990D.getHeight() / 2.0f) + f12);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x053d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 1366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.widgets.MultiCaptionRectView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDrawRect(@NotNull List<PointF> list) {
        this.f113001k = list;
        if (list.size() < 4) {
            postInvalidate();
            return;
        }
        List<PointF> listMutableListOf = this.f113001k;
        if (listMutableListOf.size() >= 4 && getContext() != null && this.f113001k.size() >= 4) {
            List<PointF> listA = Ww0.a.a(DensityUtil.dp2px(getContext(), 7.0f), listMutableListOf);
            int iSqrt = (int) (Math.sqrt(r0 * 2 * r0) + 0.5d);
            PointF pointF = this.f113001k.get(0);
            PointF pointF2 = listA.get(0);
            float f7 = pointF2.x - pointF.x;
            float f8 = pointF2.y - pointF.y;
            listMutableListOf = listA;
            if (((int) (Math.sqrt((f8 * f8) + (f7 * f7)) + 0.5d)) > iSqrt) {
                listMutableListOf = CollectionsKt.mutableListOf(new PointF[]{listA.get(2), listA.get(3), listA.get(0), listA.get(1)});
            }
        }
        this.f113001k = listMutableListOf;
        Path pathB = px0.a.b(listMutableListOf);
        Path path = pathB;
        if (pathB == null) {
            path = new Path();
        }
        this.f112988B = path;
        postInvalidate();
    }

    public final void setOnCaptionTouchListener(@Nullable b bVar) {
        this.f112993b = bVar;
        if (bVar != null) {
            this.f112994c = bVar;
        }
    }

    public final void setOnCommonTouchListener(@Nullable a aVar) {
        this.f113015y = aVar;
        if (aVar != null) {
            this.f113016z = aVar;
        }
    }

    public final void setRestrictBorderRect(@NotNull RectF rectF) {
        this.f113000j = rectF;
    }

    public final void setShowRect(boolean z6) {
        this.f113009s = z6;
        postInvalidate();
    }
}
