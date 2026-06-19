package com.bilibili.pegasus.holders.bannerv8;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/w.class */
@StabilityInferred(parameters = 1)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f77833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f77834g;
    public final int h;

    public w(int i7, int i8, int i9, int i10, int i11, int i12, boolean z6, int i13) {
        this.f77828a = i7;
        this.f77829b = i8;
        this.f77830c = i9;
        this.f77831d = i10;
        this.f77832e = i11;
        this.f77833f = i12;
        this.f77834g = z6;
        this.h = i13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f77828a == wVar.f77828a && this.f77829b == wVar.f77829b && this.f77830c == wVar.f77830c && this.f77831d == wVar.f77831d && this.f77832e == wVar.f77832e && this.f77833f == wVar.f77833f && this.f77834g == wVar.f77834g && this.h == wVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + androidx.compose.animation.z.a(I.a(this.f77833f, I.a(this.f77832e, I.a(this.f77831d, I.a(this.f77830c, I.a(this.f77829b, Integer.hashCode(this.f77828a) * 31, 31), 31), 31), 31), 31), 31, this.f77834g);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerV8LayoutSpec(hostWidthPx=");
        sb.append(this.f77828a);
        sb.append(", centerCardWidthPx=");
        sb.append(this.f77829b);
        sb.append(", centerCardHeightPx=");
        sb.append(this.f77830c);
        sb.append(", horizontalPaddingPx=");
        sb.append(this.f77831d);
        sb.append(", cardMarginOffsetPx=");
        sb.append(this.f77832e);
        sb.append(", indicatorMarginRightPx=");
        sb.append(this.f77833f);
        sb.append(", isWideScreen=");
        sb.append(this.f77834g);
        sb.append(", offscreenPageLimit=");
        return C4277b.a(this.h, ")", sb);
    }
}
