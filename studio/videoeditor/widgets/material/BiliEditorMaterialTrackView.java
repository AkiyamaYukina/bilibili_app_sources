package com.bilibili.studio.videoeditor.widgets.material;

import AC0.i;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import com.alipay.sdk.app.PayTask;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.widgets.track.media.BiliEditorMediaTrackView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import mD0.InterfaceC7923b;
import mD0.c;
import mD0.d;
import mD0.e;
import mD0.f;
import mD0.g;
import mD0.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/material/BiliEditorMaterialTrackView.class */
public final class BiliEditorMaterialTrackView extends RelativeLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public mD0.a f110463A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final Scroller f110464B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f110465C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final ImageView f110466D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final ImageView f110467E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public View f110468F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public h f110469G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public InterfaceC7923b f110470H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final oD0.a f110471I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f110472J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final g f110473K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final GestureDetector f110474L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<mD0.a> f110475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList<c> f110476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f110478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f110479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Rect f110480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Rect f110481g;

    @Nullable
    public BiliEditorMediaTrackView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f110482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f110483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f110484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f110485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f110486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Paint f110487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Paint f110488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final TextPaint f110489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f110490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f110491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f110492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f110493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f110494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f110495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f110496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f110497x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final ValueAnimator f110498y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public mD0.a f110499z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/material/BiliEditorMaterialTrackView$a.class */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((mD0.a) t7).c), Integer.valueOf(((mD0.a) t8).c));
        }
    }

    public BiliEditorMaterialTrackView(@NotNull Context context) {
        this(context, null);
    }

    public BiliEditorMaterialTrackView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.f110475a = new ArrayList<>();
        this.f110476b = new ArrayList<>();
        int iDp2px = DensityUtil.dp2px(context, 40.0f);
        this.f110477c = iDp2px;
        this.f110478d = DensityUtil.dp2px(context, 10.0f);
        this.f110479e = DensityUtil.dp2px(context, 5.0f);
        this.f110480f = new Rect();
        this.f110481g = new Rect();
        Paint paint = new Paint(1);
        this.f110487n = paint;
        Paint paint2 = new Paint(1);
        this.f110488o = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f110489p = textPaint;
        this.f110490q = -1;
        this.f110491r = -16776961;
        this.f110492s = -65536;
        this.f110493t = DensityUtil.dp2px(context, 10.0f);
        this.f110494u = i.h(context) / 2;
        this.f110495v = DensityUtil.dp2px(context, 60.0f);
        this.f110464B = new Scroller(context, new LinearInterpolator());
        ImageView imageView = new ImageView(context);
        this.f110466D = imageView;
        ImageView imageView2 = new ImageView(context);
        this.f110467E = imageView2;
        this.f110472J = true;
        this.f110473K = new g(this);
        ValueAnimator.AnimatorUpdateListener dVar = new d(this);
        this.f110474L = new GestureDetector(context, (GestureDetector.OnGestureListener) new f(this));
        setWillNotDraw(false);
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.FILL);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(DensityUtil.dp2px(context, 3.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(this.f110493t);
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(PayTask.f60018j);
        valueAnimatorOfFloat.addUpdateListener(dVar);
        this.f110498y = valueAnimatorOfFloat;
        int iDp2px2 = DensityUtil.dp2px(getContext(), 24.0f);
        imageView.setImageResource(2131234900);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDp2px2, iDp2px);
        layoutParams.addRule(15, -1);
        imageView.setScaleType(ImageView.ScaleType.FIT_END);
        imageView.setLayoutParams(layoutParams);
        imageView.setX(-1000.0f);
        addView(imageView);
        imageView2.setImageResource(2131234933);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDp2px2, iDp2px);
        layoutParams2.addRule(15, -1);
        imageView2.setScaleType(ImageView.ScaleType.FIT_START);
        imageView2.setLayoutParams(layoutParams2);
        imageView2.setX(-1000.0f);
        addView(imageView2);
        this.f110471I = new oD0.a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(int r3, mD0.a r4, mD0.a r5) {
        /*
            r0 = r4
            int r0 = r0.c
            r6 = r0
            r0 = r3
            r1 = r4
            int r1 = r1.d
            if (r0 > r1) goto L2a
            r0 = r6
            r1 = r3
            if (r0 > r1) goto L2a
            r0 = r5
            int r0 = r0.c
            r6 = r0
            r0 = r3
            r1 = r5
            int r1 = r1.d
            if (r0 > r1) goto L2a
            r0 = r6
            r1 = r3
            if (r0 > r1) goto L2a
            r0 = 1
            r7 = r0
            goto L2d
        L2a:
            r0 = 0
            r7 = r0
        L2d:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.widgets.material.BiliEditorMaterialTrackView.g(int, mD0.a, mD0.a):boolean");
    }

    private final int getIndicatorPosition() {
        return (DensityUtil.getDevicesWidthPixels(getContext()) / 2) + this.f110482i;
    }

    private final int getLeftHandlePosition() {
        return ((int) (this.f110466D.getX() + this.f110466D.getWidth())) + this.f110482i;
    }

    private final int getRightHandlePosition() {
        return ((int) this.f110467E.getX()) + this.f110482i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMSelectMaterial(mD0.a aVar) {
        this.f110499z = this.f110463A;
        this.f110463A = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Comparator] */
    public final void b() {
        this.f110476b.clear();
        this.f110483j = 0;
        InterfaceC7923b interfaceC7923b = this.f110470H;
        List<mD0.a> listA = interfaceC7923b != null ? interfaceC7923b.a(this.f110475a) : CollectionsKt.sortedWith(this.f110475a, (Comparator) new Object());
        if (listA.isEmpty()) {
            c();
        } else {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                i((mD0.a) it.next());
            }
        }
        m();
    }

    public final void c() {
        int iDp2px;
        int size = this.f110476b.size();
        if (size <= 2) {
            int i7 = this.f110477c;
            int i8 = this.f110478d;
            iDp2px = ((i7 + i8) * size) - i8;
        } else {
            iDp2px = DensityUtil.dp2px(getContext(), 126.0f);
        }
        if (iDp2px != getLayoutParams().height) {
            getLayoutParams().height = iDp2px;
            this.f110480f.set(getLeft(), 0, getRight(), getLayoutParams().height);
            this.f110481g.set(this.f110480f);
            l();
            requestLayout();
        }
    }

    public final void d() {
        if (this.f110476b.size() == 0 || this.f110463A == null) {
            m();
            return;
        }
        int height = getHeight() / 2;
        int i7 = this.f110483j;
        mD0.a aVar = this.f110463A;
        int i8 = aVar.f;
        this.f110483j = Math.max(0, Math.min((height + i7) - (i8 - ((i8 - aVar.e) / 2)), (((c) CollectionsKt.first(this.f110476b)).c - ((c) CollectionsKt.last(this.f110476b)).b) - getHeight()));
        l();
        m();
    }

    public final boolean e(mD0.a aVar, int i7) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        int i8 = aVar.a;
        if (i8 == 1) {
            mD0.a aVar2 = this.f110463A;
            boolean zF = f(aVar2.c + i7, aVar2.d + i7);
            booleanRef.element = zF;
            if (zF) {
                mD0.a aVar3 = this.f110463A;
                aVar3.c += i7;
                aVar3.d += i7;
                invalidate();
                m();
            }
        } else if (i8 == 2) {
            int leftHandlePosition = getLeftHandlePosition();
            int rightHandlePosition = getRightHandlePosition();
            this.f110471I.b = getIndicatorPosition();
            if (Intrinsics.areEqual(this.f110468F, this.f110466D)) {
                this.f110471I.c = leftHandlePosition;
            } else {
                this.f110471I.c = rightHandlePosition;
            }
            int iB = this.f110471I.b(i7, new e(this, booleanRef, leftHandlePosition, rightHandlePosition));
            if (iB != 0) {
                mD0.a aVar4 = this.f110463A;
                if (Intrinsics.areEqual(this.f110468F, this.f110466D)) {
                    aVar4.c += iB;
                } else {
                    aVar4.d += iB;
                }
                m();
            }
        }
        return booleanRef.element;
    }

    public final boolean f(int i7, int i8) {
        BiliEditorMediaTrackView biliEditorMediaTrackView = this.h;
        long jB = 0;
        long jB2 = biliEditorMediaTrackView != null ? biliEditorMediaTrackView.b(i8) : 0L;
        BiliEditorMediaTrackView biliEditorMediaTrackView2 = this.h;
        if (biliEditorMediaTrackView2 != null) {
            jB = biliEditorMediaTrackView2.b(i7);
        }
        boolean z6 = jB2 - jB >= TransitionInfo.DEFAULT_DURATION;
        boolean z7 = false;
        if (i7 >= this.f110485l) {
            z7 = i8 > this.f110486m ? false : z6;
        }
        return z7;
    }

    public final int getColorFixed() {
        return this.f110491r;
    }

    public final int getColorLongPressOut() {
        return this.f110492s;
    }

    public final int getColorMaterialOut() {
        return this.f110490q;
    }

    @NotNull
    public final ArrayList<mD0.a> getMaterialList() {
        return this.f110475a;
    }

    @Nullable
    public final InterfaceC7923b getMaterialSorter() {
        return this.f110470H;
    }

    @Nullable
    public final h getOnMaterialTouchListener() {
        return this.f110469G;
    }

    @Nullable
    public final mD0.i getOnTrackHeightListener() {
        return null;
    }

    @Nullable
    public final mD0.a getSelectMaterial() {
        return this.f110463A;
    }

    public final float getTextSizeMaterial() {
        return this.f110493t;
    }

    public final void h(Canvas canvas, mD0.a aVar) {
        Rect rect = this.f110481g;
        rect.top = aVar.e;
        rect.bottom = aVar.f;
        int i7 = aVar.c;
        int i8 = this.f110482i;
        int i9 = i7 - i8;
        rect.left = i9;
        rect.right = aVar.d - i8;
        if (i9 > getRight() || this.f110481g.right < getLeft() || canvas == null) {
            return;
        }
        canvas.save();
        canvas.clipRect(this.f110481g);
        this.f110487n.setColor(this.f110491r);
        this.f110487n.setTextSize(this.f110493t);
        canvas.drawRect(this.f110481g, this.f110487n);
        if (aVar.a == 1) {
            this.f110488o.setColor(this.f110492s);
        } else {
            this.f110488o.setColor(this.f110490q);
        }
        canvas.drawRect(this.f110481g, this.f110488o);
        String str = aVar.b;
        if (str != null && str.length() != 0) {
            float fAbs = Math.abs(this.f110489p.getFontMetrics().ascent);
            float f7 = this.f110489p.getFontMetrics().descent;
            Rect rect2 = this.f110481g;
            int i10 = rect2.left;
            int i11 = this.f110479e;
            float fCenterY = rect2.centerY();
            canvas.drawText(aVar.b, i10 + i11, (Math.abs(this.f110489p.getFontMetrics().ascent) + fCenterY) - ((fAbs + f7) / 2), this.f110489p);
        }
        canvas.restore();
    }

    public final void i(mD0.a aVar) {
        for (c cVar : this.f110476b) {
            for (mD0.a aVar2 : cVar.a) {
                if (g(aVar2.c, aVar2, aVar) || g(aVar2.d, aVar2, aVar) || g(aVar.c, aVar2, aVar) || g(aVar.d, aVar2, aVar)) {
                    break;
                }
            }
            aVar.getClass();
            cVar.a.add(aVar);
            aVar.e = cVar.b;
            aVar.f = cVar.c;
            return;
        }
        ArrayList arrayList = new ArrayList();
        c cVar2 = new c(arrayList);
        this.f110476b.add(cVar2);
        c();
        k(this.f110476b);
        aVar.e = cVar2.b;
        aVar.f = cVar2.c;
        arrayList.add(aVar);
    }

    public final void j(@NotNull mD0.a aVar) {
        if (Intrinsics.areEqual(this.f110463A, aVar)) {
            setMSelectMaterial(null);
        }
        this.f110484k = this.f110483j;
        this.f110475a.remove(aVar);
        b();
        if (this.f110476b.size() == 0) {
            this.f110483j = 0;
        } else {
            int i7 = ((c) CollectionsKt.first(this.f110476b)).c;
            int i8 = ((c) CollectionsKt.last(this.f110476b)).b;
            this.f110483j = Math.max(0, Math.min(this.f110484k, (i7 - i8) - getHeight()));
        }
        m();
    }

    public final void k(List<c> list) {
        int i7 = (this.f110480f.bottom + this.f110483j) - this.f110477c;
        for (c cVar : list) {
            cVar.b = i7;
            int i8 = this.f110477c;
            cVar.c = i7 + i8;
            i7 = (i7 - this.f110478d) - i8;
        }
    }

    public final void l() {
        k(this.f110476b);
        for (c cVar : this.f110476b) {
            for (mD0.a aVar : cVar.a) {
                aVar.e = cVar.b;
                aVar.f = cVar.c;
            }
        }
    }

    public final void m() {
        h hVar;
        mD0.a aVar;
        int i7;
        if (this.f110472J && (aVar = this.f110463A) != null && ((i7 = aVar.a) == 0 || i7 == 2 || i7 == 2)) {
            this.f110466D.setX((aVar.c - this.f110482i) - this.f110467E.getWidth());
            this.f110466D.setY(this.f110463A.e);
            this.f110467E.setX(this.f110463A.d - this.f110482i);
            this.f110467E.setY(this.f110463A.e);
        } else {
            this.f110466D.setX(-1000.0f);
            this.f110467E.setX(-1000.0f);
        }
        mD0.a aVar2 = this.f110463A;
        if (aVar2 != null) {
            int i8 = aVar2.a;
            if (i8 == 1) {
                h hVar2 = this.f110469G;
                if (hVar2 != null) {
                    hVar2.e(aVar2);
                }
            } else if (i8 == 2 && (hVar = this.f110469G) != null) {
                hVar.f(aVar2, Intrinsics.areEqual(this.f110468F, this.f110466D));
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BiliEditorMediaTrackView biliEditorMediaTrackView = this.h;
        if (biliEditorMediaTrackView != null) {
            biliEditorMediaTrackView.f110533z.remove(this.f110473K);
        }
        ValueAnimator valueAnimator = this.f110498y;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.removeAllListeners();
        valueAnimator.end();
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        for (c cVar : this.f110476b) {
            this.f110487n.setColor(this.f110491r);
            for (mD0.a aVar : cVar.a) {
                if (aVar.a == 0) {
                    h(canvas, aVar);
                }
            }
        }
        mD0.a aVar2 = this.f110463A;
        if (aVar2 != null) {
            int i7 = aVar2.a;
            if (i7 == 1 || i7 == 2) {
                h(canvas, aVar2);
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        this.f110480f.set(getLeft(), 0, getRight(), getLayoutParams().height);
        this.f110481g.set(this.f110480f);
        l();
        d();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (this.f110475a.isEmpty()) {
            setMeasuredDimension(i7, View.MeasureSpec.makeMeasureSpec(DensityUtil.dp2px(getContext(), 0.0f), 0));
        } else {
            super.onMeasure(i7, i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0352  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.widgets.material.BiliEditorMaterialTrackView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setColorFixed(int i7) {
        this.f110491r = i7;
    }

    public final void setColorLongPressOut(int i7) {
        this.f110492s = i7;
    }

    public final void setColorMaterialOut(int i7) {
        this.f110490q = i7;
    }

    public final void setMaterialList(@NotNull List<mD0.a> list) {
        this.f110475a.clear();
        this.f110475a.addAll(list);
        b();
    }

    public final void setMaterialSorter(@Nullable InterfaceC7923b interfaceC7923b) {
        this.f110470H = interfaceC7923b;
    }

    public final void setOnMaterialTouchListener(@Nullable h hVar) {
        this.f110469G = hVar;
    }

    public final void setOnTrackHeightListener(@Nullable mD0.i iVar) {
    }

    public final void setSelectedMaterial(@Nullable mD0.a aVar) {
        if (aVar == null) {
            mD0.a aVar2 = this.f110463A;
            if (aVar2 != null) {
                aVar2.a = 0;
            }
            setMSelectMaterial(null);
            return;
        }
        if (this.f110475a.contains(aVar)) {
            setMSelectMaterial(aVar);
            this.f110463A.a = 0;
            d();
        }
    }

    public final void setShowHandle(boolean z6) {
        this.f110472J = z6;
    }

    public final void setTextSizeMaterial(float f7) {
        this.f110493t = f7;
    }
}
