package com.bilibili.studio.videoeditor.widgets.track.media;

import AC0.i;
import RB0.b;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.alipay.sdk.app.PayTask;
import com.bilibili.app.gemini.player.widget.like.s;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qD0.InterfaceC8406g;
import qD0.a;
import qD0.b;
import qD0.c;
import qD0.d;
import qD0.e;
import qD0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/track/media/BiliEditorMediaTrackView.class */
public final class BiliEditorMediaTrackView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final s f110506A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final GestureDetector f110507B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final b f110508C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Rect f110509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Rect f110510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Rect f110511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Rect f110512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Paint f110513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Paint f110514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Bitmap f110515g;

    @Nullable
    public final Bitmap h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public ArrayList<a> f110516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f110517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f110518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f110519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f110520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f110521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f110522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f110523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f110524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f110525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f110526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f110527t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final oD0.b f110528u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final d f110529v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ValueAnimator f110530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f110531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public InterfaceC8406g f110532y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final ArrayList<InterfaceC8406g> f110533z;

    public BiliEditorMediaTrackView(@NotNull Context context) {
        this(context, null);
    }

    public BiliEditorMediaTrackView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Bitmap bitmapDecodeStream;
        super(context, attributeSet, -1);
        this.f110509a = new Rect();
        this.f110510b = new Rect();
        this.f110511c = new Rect();
        this.f110512d = new Rect();
        Paint paint = new Paint(1);
        this.f110513e = paint;
        Paint paint2 = new Paint(1);
        this.f110514f = paint2;
        Paint paint3 = new Paint(1);
        int iDp2px = DensityUtil.dp2px(context, 10.0f);
        DensityUtil.dp2px(context, 10.0f);
        DensityUtil.dp2px(context, 10.0f);
        this.f110516i = new ArrayList<>();
        this.f110518k = DensityUtil.dp2px(context, 4.0f);
        this.f110519l = i.h(context) / 2;
        this.f110521n = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.f110527t = true;
        this.f110529v = new d(this);
        this.f110533z = new ArrayList<>();
        this.f110506A = new s(this);
        this.f110507B = new GestureDetector(context, (GestureDetector.OnGestureListener) new c(this));
        this.f110508C = new b(this);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint3.setTextSize(iDp2px);
        paint2.setStyle(style);
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        Rect rect = new Rect();
        paint3.getTextBounds(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, 0, 1, rect);
        rect.width();
        rect.height();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), 2131244228);
        this.f110515g = bitmapDecodeResource;
        RB0.c cVar = RB0.b.f20676d;
        this.f110515g = Bitmap.createScaledBitmap(bitmapDecodeResource, b.a.a(context).f20682c, b.a.a(context).f20682c, true);
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(getResources().getAssets().open(EditVideoInfoUtils.FAKE_FILE_NAME));
        } catch (Exception e7) {
            e7.printStackTrace();
            bitmapDecodeStream = null;
        }
        this.h = bitmapDecodeStream;
        oD0.b bVar = new oD0.b(context);
        this.f110528u = bVar;
        bVar.i = this.f110529v;
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(PayTask.f60018j);
        valueAnimatorOfFloat.addUpdateListener(this.f110508C);
        this.f110530w = valueAnimatorOfFloat;
    }

    public final void a() {
        if (this.f110516i.size() > 0) {
            this.f110524q = ((a) CollectionsKt.first(this.f110516i)).j;
            this.f110525r = ((a) CollectionsKt.last(this.f110516i)).k;
        }
        InterfaceC8406g interfaceC8406g = this.f110532y;
        if (interfaceC8406g != null) {
            interfaceC8406g.c(this.f110526s, this.f110524q, this.f110525r);
        }
        Iterator<T> it = this.f110533z.iterator();
        while (it.hasNext()) {
            ((InterfaceC8406g) it.next()).c(this.f110526s, this.f110524q, this.f110525r);
        }
    }

    public final long b(int i7) {
        long j7 = 0;
        long j8 = 0;
        if (this.f110516i.size() > 0) {
            boolean z6 = false;
            for (a aVar : this.f110516i) {
                int i8 = aVar.j;
                int i9 = this.f110517j / 2;
                if (i7 <= i9 + aVar.k && i8 - i9 <= i7) {
                    z6 = true;
                    j7 = ((long) ((i7 - i8) / aVar.n)) + aVar.f;
                }
            }
            j8 = j7;
            if (!z6) {
                a aVar2 = (a) CollectionsKt.first(this.f110516i);
                a aVar3 = (a) CollectionsKt.last(this.f110516i);
                if (i7 < aVar2.j) {
                    j8 = aVar2.f;
                } else {
                    j8 = j7;
                    if (i7 > aVar3.k) {
                        j8 = ((long) ((i7 - aVar3.j) / aVar3.n)) + aVar3.f;
                    }
                }
            }
        }
        return j8;
    }

    public final void c() {
        oD0.b bVar = this.f110528u;
        oD0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollZoomGesture");
            bVar2 = null;
        }
        bVar2.d.forceFinished(true);
        ValueAnimator valueAnimator = this.f110530w;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeAnimator");
            valueAnimator = null;
        }
        valueAnimator.cancel();
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.removeAllListeners();
    }

    public final void d(int i7) {
        e(this.f110526s + i7);
    }

    public final void e(int i7) {
        setMXScrolled(i7);
        a();
        invalidate();
    }

    public final void f() {
        oD0.b bVar = this.f110528u;
        oD0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollZoomGesture");
            bVar2 = null;
        }
        bVar2.d.forceFinished(true);
        ValueAnimator valueAnimator = this.f110530w;
        ValueAnimator valueAnimator2 = valueAnimator;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeAnimator");
            valueAnimator2 = null;
        }
        if (valueAnimator2.isRunning()) {
            ValueAnimator valueAnimator3 = this.f110530w;
            if (valueAnimator3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTimeAnimator");
                valueAnimator3 = null;
            }
            valueAnimator3.cancel();
        }
    }

    public final int g(long j7) {
        boolean z6 = false;
        if (this.f110516i.size() <= 0) {
            return 0;
        }
        int iC = 0;
        for (a aVar : this.f110516i) {
            long j8 = aVar.f;
            if (j7 <= aVar.g && j8 <= j7) {
                iC = aVar.c(j7 - j8) + aVar.j;
                z6 = true;
            }
        }
        int i7 = iC;
        if (!z6) {
            a aVar2 = (a) CollectionsKt.first(this.f110516i);
            a aVar3 = (a) CollectionsKt.last(this.f110516i);
            if (j7 < aVar2.f) {
                i7 = aVar2.j;
            } else {
                i7 = iC;
                if (j7 > aVar3.g) {
                    i7 = aVar3.k;
                }
            }
        }
        return i7;
    }

    public final int getAllLength() {
        return this.f110522o;
    }

    public final int getContentEnd() {
        return this.f110525r;
    }

    public final int getContentStart() {
        return this.f110524q;
    }

    public final long getContentWidth() {
        return this.f110525r - this.f110524q;
    }

    public final int getDividerWidth() {
        return this.f110517j;
    }

    public final boolean getDrawFakeDivider() {
        return this.f110520m;
    }

    public final int getFakeDividerWidth() {
        return this.f110518k;
    }

    public final int getMDefaultOffset() {
        return this.f110519l;
    }

    public final boolean getMIgnoreMiniVelocity() {
        return this.f110527t;
    }

    public final int getMXScrolled() {
        return this.f110526s;
    }

    @NotNull
    public final ArrayList<a> getMediaClipList() {
        return this.f110516i;
    }

    @Nullable
    public final e getOnBlankAreaTouchListener() {
        return null;
    }

    @Nullable
    public final f getOnMediaTrackClickListener() {
        return null;
    }

    @Nullable
    public final InterfaceC8406g getOnMediaTrackTouchListener() {
        return this.f110532y;
    }

    public final long getTimeDuration() {
        a aVar = (a) CollectionsKt.lastOrNull(this.f110516i);
        return aVar != null ? aVar.g : 0L;
    }

    public final long getTotalDuration() {
        return this.f110523p;
    }

    public final void h() {
        int i7 = 0;
        if (this.f110516i.size() <= 0) {
            setAllLength(0);
            return;
        }
        int i8 = this.f110519l;
        for (a aVar : this.f110516i) {
            i7 = (aVar.i + i8) - aVar.h;
            aVar.j = i8;
            aVar.k = i7;
            i8 = this.f110517j + i7;
        }
        setAllLength(i7);
        long j7 = 0;
        long j8 = 0;
        for (a aVar2 : this.f110516i) {
            aVar2.f = j8;
            j8 += aVar2.e - aVar2.d;
            aVar2.g = j8;
            j7 = j8;
        }
        this.f110523p = j7;
        this.f110524q = ((a) CollectionsKt.first(this.f110516i)).j;
        this.f110525r = ((a) CollectionsKt.last(this.f110516i)).k;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Bitmap bitmapA;
        boolean z6;
        super.onDraw(canvas);
        if (this.f110516i.isEmpty()) {
            return;
        }
        int i7 = this.f110526s;
        int width = getWidth() / 5;
        int i8 = this.f110526s;
        int width2 = getWidth();
        int width3 = getWidth() / 5;
        for (a aVar : this.f110516i) {
            if (canvas != null) {
                canvas.save();
            }
            Rect rect = this.f110511c;
            int i9 = aVar.j;
            int i10 = this.f110526s;
            rect.left = i9 - i10;
            rect.right = aVar.k - i10;
            if (canvas != null) {
                canvas.clipRect(rect);
            }
            int iMax = Math.max(aVar.j, i7 - width);
            if (iMax < Math.min(aVar.k, width3 + width2 + i8)) {
                float f7 = (iMax - aVar.j) + aVar.h;
                float f8 = aVar.n;
                long j7 = (long) (f7 / f8);
                long j8 = ((long) (((r0 - r0) + r0) / f8)) / aVar.m;
                for (long j9 = j7 / r0; j9 <= j8; j9++) {
                    long j10 = aVar.m * j9;
                    int iC = (aVar.j - aVar.h) + aVar.c(j10);
                    int i11 = aVar.l;
                    Rect rect2 = this.f110509a;
                    int i12 = this.f110526s;
                    rect2.left = iC - i12;
                    rect2.right = (i11 + iC) - i12;
                    long j11 = (long) (j10 * aVar.c);
                    if (aVar.o) {
                        bitmapA = this.h;
                    } else {
                        RB0.c cVar = RB0.b.f20676d;
                        RB0.b bVarA = b.a.a(getContext());
                        String str = aVar.a;
                        int i13 = aVar.b;
                        bVarA.getClass();
                        RB0.c cVar2 = RB0.b.f20676d;
                        bitmapA = cVar2 == null ? null : cVar2.get(new b.C0111b(str, i13 == 0 ? 0L : j11));
                    }
                    if (bitmapA == null) {
                        RB0.c cVar3 = RB0.b.f20676d;
                        RB0.b bVarA2 = b.a.a(getContext());
                        String str2 = aVar.a;
                        bVarA2.getClass();
                        bitmapA = RB0.b.a(j11, str2);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bitmapA != null) {
                        this.f110512d.left = (bitmapA.getWidth() - this.f110509a.width()) / 2;
                        Rect rect3 = this.f110512d;
                        rect3.right = this.f110509a.width() + rect3.left;
                        this.f110512d.top = (bitmapA.getHeight() - this.f110509a.height()) / 2;
                        Rect rect4 = this.f110512d;
                        rect4.bottom = this.f110509a.height() + rect4.top;
                        if (canvas != null) {
                            canvas.drawBitmap(bitmapA, this.f110512d, this.f110509a, this.f110513e);
                        }
                    } else if (canvas != null) {
                        canvas.drawBitmap(this.f110515g, (Rect) null, this.f110509a, this.f110513e);
                    }
                    if (z6) {
                        RB0.c cVar4 = RB0.b.f20676d;
                        b.a.a(getContext()).b(this.f110506A, aVar.a, aVar.b, j11, true);
                    }
                }
            }
            if (canvas != null) {
                canvas.restore();
            }
        }
        if (!this.f110520m || this.f110516i.size() <= 1) {
            return;
        }
        int size = this.f110516i.size();
        for (int i14 = 0; i14 < size - 1; i14++) {
            a aVar2 = this.f110516i.get(i14);
            Rect rect5 = this.f110510b;
            int i15 = aVar2.k;
            int i16 = this.f110518k / 2;
            int i17 = this.f110526s;
            rect5.left = (i15 - i16) - i17;
            rect5.right = (i16 + i15) - i17;
            if (canvas != null) {
                canvas.drawRect(rect5, this.f110514f);
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        this.f110509a.set(i7, 0, i9, i10 - i8);
        this.f110511c.set(this.f110509a);
        this.f110512d.set(this.f110509a);
        this.f110510b.set(this.f110509a);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        this.f110507B.onTouchEvent(motionEvent);
        oD0.b bVar = this.f110528u;
        oD0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollZoomGesture");
            bVar2 = null;
        }
        bVar2.b(motionEvent);
        return true;
    }

    public final void setAllLength(int i7) {
        this.f110522o = i7;
        oD0.b bVar = this.f110528u;
        oD0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollZoomGesture");
            bVar2 = null;
        }
        int i8 = this.f110522o;
        int i9 = this.f110521n;
        bVar2.j = (i8 - i9) - (i9 - this.f110519l);
    }

    public final void setContentEnd(int i7) {
        this.f110525r = i7;
    }

    public final void setContentStart(int i7) {
        this.f110524q = i7;
    }

    public final void setDividerWidth(int i7) {
        this.f110517j = i7;
    }

    public final void setDrawFakeDivider(boolean z6) {
        this.f110520m = z6;
    }

    public final void setFakeDividerWidth(int i7) {
        this.f110518k = i7;
    }

    public final void setMDefaultOffset(int i7) {
        this.f110519l = i7;
    }

    public final void setMIgnoreMiniVelocity(boolean z6) {
        this.f110527t = z6;
        oD0.b bVar = this.f110528u;
        oD0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollZoomGesture");
            bVar2 = null;
        }
        bVar2.k = z6;
    }

    public final void setMXScrolled(int i7) {
        this.f110526s = i7;
        oD0.b bVar = this.f110528u;
        oD0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollZoomGesture");
            bVar2 = null;
        }
        bVar2.l = i7;
    }

    public final void setMediaClipList(@NotNull ArrayList<a> arrayList) {
        this.f110516i = arrayList;
        h();
    }

    public final void setOnBlankAreaTouchListener(@Nullable e eVar) {
    }

    public final void setOnMediaTrackClickListener(@Nullable f fVar) {
    }

    public final void setOnMediaTrackTouchListener(@Nullable InterfaceC8406g interfaceC8406g) {
        this.f110532y = interfaceC8406g;
    }

    public final void setTotalDuration(long j7) {
        this.f110523p = j7;
    }
}
