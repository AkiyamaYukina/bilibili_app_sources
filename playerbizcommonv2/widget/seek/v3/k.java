package com.bilibili.playerbizcommonv2.widget.seek.v3;

import Vn.A;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.ColorInt;
import androidx.compose.animation.C3357h;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/k.class */
@StabilityInferred(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f82986C = NewPlayerUtilsKt.toPx(1);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f82987D = NewPlayerUtilsKt.toPx(2);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f82988E = NewPlayerUtilsKt.toPx(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f82995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f82996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f82997g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f82998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f82999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f83000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f83001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f83002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f83003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f83004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f83005p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f83008s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public ValueAnimator f83010u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f83011v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public ValueAnimator f83014y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Rect f83006q = new Rect();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Rect f83007r = new Rect();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final ArrayList<s> f83009t = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f83012w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Paint f83013x = new Paint(5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f83015z = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final f[] f82989A = new f[3];

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final Lazy f82990B = LazyKt.lazy(new Ex.l(this, 4));

    public k(@ColorInt int i7, @ColorInt int i8, @ColorInt int i9, @ColorInt int i10, @ColorInt int i11, @ColorInt int i12, @ColorInt int i13, @ColorInt int i14, float f7, float f8) {
        this.f82991a = i7;
        this.f82992b = i8;
        this.f82993c = i9;
        this.f82994d = i10;
        this.f82995e = i11;
        this.f82996f = i12;
        this.f82997g = i13;
        this.h = i14;
        this.f82998i = f7;
        this.f82999j = f8;
    }

    public static void d(final k kVar, boolean z6, boolean z7, boolean z8, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z9 = false;
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        if ((i7 & 4) != 0) {
            z8 = false;
        }
        int i12 = ((kVar.f83001l - kVar.f83003n) - kVar.f83005p) / 2;
        long jCurrentTimeMillis = 0;
        if (i12 <= 0) {
            if (z7) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            kVar.f83011v = jCurrentTimeMillis;
            return;
        }
        if (System.currentTimeMillis() - kVar.f83011v < 100) {
            z9 = true;
        }
        int i13 = kVar.f83012w;
        int i14 = f82988E;
        int i15 = f82986C;
        if (i13 == 1) {
            i8 = i12 - i15;
            i9 = i15 + i12;
            i10 = i12 - i14;
            i11 = i9;
        } else if (i13 != 2) {
            i8 = i12 - i15;
            i9 = i15 + i12;
            i11 = i12 + i14;
            i10 = i8;
        } else {
            i8 = i12 - i15;
            int i16 = f82987D;
            i10 = i12 - i16;
            i9 = i15 + i12;
            i11 = i12 + i16;
        }
        int i17 = z6 ? i10 : i8;
        int i18 = z6 ? i11 : i9;
        int i19 = !z6 ? i10 - i8 : i8 - i10;
        int i20 = !z6 ? i11 - i9 : i9 - i11;
        Rect rectCopyBounds = kVar.a().copyBounds();
        if (i17 != rectCopyBounds.top || i18 != rectCopyBounds.bottom || z8 || kVar.f83006q.isEmpty()) {
            C3357h.c(i19, i20, " ", "PlayerSeekbarProgressDrawable", A.b(i17, i18, "updateProgressDrawableBounds: ", ", ", " "));
            if (!z7 && !z9) {
                kVar.e(i17, i18);
                return;
            }
            ValueAnimator valueAnimator = kVar.f83014y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = -1;
            final Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = -1;
            final int i21 = i17;
            final int i22 = i19;
            final int i23 = i18;
            final int i24 = i20;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(i21, i22, i23, i24, intRef, intRef2, kVar) { // from class: com.bilibili.playerbizcommonv2.widget.seek.v3.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f82975a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f82976b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f82977c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f82978d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Ref.IntRef f82979e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Ref.IntRef f82980f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final k f82981g;

                {
                    this.f82975a = i21;
                    this.f82976b = i22;
                    this.f82977c = i23;
                    this.f82978d = i24;
                    this.f82979e = intRef;
                    this.f82980f = intRef2;
                    this.f82981g = kVar;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    int i25 = this.f82975a;
                    int i26 = this.f82976b;
                    int i27 = this.f82977c;
                    int i28 = this.f82978d;
                    Ref.IntRef intRef3 = this.f82979e;
                    Ref.IntRef intRef4 = this.f82980f;
                    k kVar2 = this.f82981g;
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    int i29 = i25 + ((int) (i26 * fFloatValue));
                    int i30 = i27 + ((int) (fFloatValue * i28));
                    if (i29 == intRef3.element && i30 == intRef4.element) {
                        return;
                    }
                    intRef3.element = i29;
                    intRef4.element = i30;
                    kVar2.e(i29, i30);
                }
            });
            valueAnimatorOfFloat.addListener(new j(kVar, i17, i18));
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.start();
            kVar.f83014y = valueAnimatorOfFloat;
            kVar.f83011v = 0L;
        }
    }

    public final r a() {
        return (r) this.f82990B.getValue();
    }

    public final void b(int i7, @NotNull List list) {
        this.f83008s = i7;
        this.f83009t.clear();
        this.f83009t.addAll(list);
        for (f fVar : this.f82989A) {
            if (fVar != null) {
                fVar.f82970d.clear();
                if (list != null) {
                    fVar.f82970d.addAll(list);
                }
                fVar.f82971e = i7;
                fVar.invalidateSelf();
            }
        }
    }

    public final void c(boolean z6) {
        int i7 = z6 ? this.f82992b : 0;
        int i8 = z6 ? this.f82993c : this.f82994d;
        f[] fVarArr = this.f82989A;
        f fVar = fVarArr[1];
        if (fVar != null) {
            fVar.h = i7;
        }
        f fVar2 = fVarArr[2];
        if (fVar2 != null) {
            fVar2.h = i8;
        }
    }

    public final void e(int i7, int i8) {
        int i9 = (this.f83000k - this.f83004o) - this.f83002m;
        float f7 = (i8 - i7) / 2;
        StringBuilder sbB = A.b(i7, i9, "updateSize:  0, ", ", ", ", ");
        sbB.append(i8);
        BLog.i("PlayerSeekbarProgressDrawable", sbB.toString());
        a().a(i7, i9, i8);
        for (f fVar : this.f82989A) {
            if (fVar != null) {
                fVar.f82968b = 0.0f;
                fVar.f82969c = f7;
                fVar.setBounds(0, i7, i9, i8);
                fVar.invalidateSelf();
            }
        }
        int i10 = this.f83002m;
        int i11 = this.f83003n;
        int i12 = i7 + i11;
        int i13 = i8 + i11;
        this.f83006q.set(0, i12, i10, i13);
        Rect rect = this.f83007r;
        int i14 = this.f83000k;
        rect.set(i14 - i10, i12, i14, i13);
    }
}
