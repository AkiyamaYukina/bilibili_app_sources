package com.bilibili.topix.center;

import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.topix.center.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/a.class */
@StabilityInferred(parameters = 0)
public final class C6663a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f112391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f112392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f112393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f112394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f112395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f112396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f112397g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f112398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f112399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f112400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f112401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f112402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f112403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f112404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f112405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f112406q = ListExtentionsKt.lazyUnsafe(new S3.e(3));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lazy f112407r = ListExtentionsKt.lazyUnsafe(new Hw.f(7));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f112408s = ListExtentionsKt.lazyUnsafe(new S3.f(5));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f112409t = ListExtentionsKt.lazyUnsafe(new Jm0.l(this, 2));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f112410u = ListExtentionsKt.lazyUnsafe(new S3.h(6));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Lazy f112411v = ListExtentionsKt.lazyUnsafe(new M60.a(this, 3));

    public C6663a(@NotNull String str, float f7, float f8, int i7, int i8, float f9, int i9, int i10, float f10, float f11, float f12, float f13, float f14, int i11, float f15, float f16) {
        this.f112391a = str;
        this.f112392b = f7;
        this.f112393c = f8;
        this.f112394d = i7;
        this.f112395e = i8;
        this.f112396f = f9;
        this.f112397g = i9;
        this.h = i10;
        this.f112398i = f10;
        this.f112399j = f11;
        this.f112400k = f12;
        this.f112401l = f13;
        this.f112402m = f14;
        this.f112403n = i11;
        this.f112404o = f15;
        this.f112405p = f16;
    }

    public final float a() {
        return (ListExtentionsKt.toPx(this.f112401l) * 2) + ((Layout) this.f112411v.getValue()).getHeight();
    }

    public final float b() {
        return (ListExtentionsKt.toPx(this.f112402m) * 2) + ((Layout) this.f112411v.getValue()).getWidth();
    }

    @NotNull
    public final TextPaint c() {
        return (TextPaint) this.f112409t.getValue();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6663a)) {
            return false;
        }
        C6663a c6663a = (C6663a) obj;
        return Intrinsics.areEqual(this.f112391a, c6663a.f112391a) && Float.compare(this.f112392b, c6663a.f112392b) == 0 && Float.compare(this.f112393c, c6663a.f112393c) == 0 && this.f112394d == c6663a.f112394d && this.f112395e == c6663a.f112395e && Float.compare(this.f112396f, c6663a.f112396f) == 0 && this.f112397g == c6663a.f112397g && this.h == c6663a.h && Float.compare(this.f112398i, c6663a.f112398i) == 0 && Float.compare(this.f112399j, c6663a.f112399j) == 0 && Float.compare(this.f112400k, c6663a.f112400k) == 0 && Float.compare(this.f112401l, c6663a.f112401l) == 0 && Float.compare(this.f112402m, c6663a.f112402m) == 0 && this.f112403n == c6663a.f112403n && Float.compare(this.f112404o, c6663a.f112404o) == 0 && Float.compare(this.f112405p, c6663a.f112405p) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f112405p) + androidx.compose.animation.n.a(this.f112404o, I.a(this.f112403n, androidx.compose.animation.n.a(this.f112402m, androidx.compose.animation.n.a(this.f112401l, androidx.compose.animation.n.a(this.f112400k, androidx.compose.animation.n.a(this.f112399j, androidx.compose.animation.n.a(this.f112398i, I.a(this.h, I.a(this.f112397g, androidx.compose.animation.n.a(this.f112396f, I.a(this.f112395e, I.a(this.f112394d, androidx.compose.animation.n.a(this.f112393c, androidx.compose.animation.n.a(this.f112392b, this.f112391a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleData(text=");
        sb.append(this.f112391a);
        sb.append(", textSize=");
        sb.append(this.f112392b);
        sb.append(", cornerRadiusDp=");
        sb.append(this.f112393c);
        sb.append(", renderColor=");
        sb.append(this.f112394d);
        sb.append(", textColor=");
        sb.append(this.f112395e);
        sb.append(", triangleHorizonCenterPositionDp=");
        sb.append(this.f112396f);
        sb.append(", triangleVerticalLocation=");
        sb.append(this.f112397g);
        sb.append(", renderMode=");
        sb.append(this.h);
        sb.append(", renderStrokeWidthDp=");
        sb.append(this.f112398i);
        sb.append(", triangleWidthDp=");
        sb.append(this.f112399j);
        sb.append(", triangleHeightDp=");
        sb.append(this.f112400k);
        sb.append(", paddingVerticalDp=");
        sb.append(this.f112401l);
        sb.append(", paddingHorizontalDp=");
        sb.append(this.f112402m);
        sb.append(", maxWidth=");
        sb.append(this.f112403n);
        sb.append(", offsetXDp=");
        sb.append(this.f112404o);
        sb.append(", offsetYDp=");
        return C.d.a(this.f112405p, ")", sb);
    }
}
