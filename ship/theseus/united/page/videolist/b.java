package com.bilibili.ship.theseus.united.page.videolist;

import androidx.annotation.ColorInt;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/b.class */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f103583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f103584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f103585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f103586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f103587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f103588g;

    public b(@ColorInt int i7, @ColorInt int i8, @ColorInt int i9, @ColorInt int i10, @ColorInt int i11, @ColorInt int i12, @ColorInt int i13) {
        this.f103582a = i7;
        this.f103583b = i8;
        this.f103584c = i9;
        this.f103585d = i10;
        this.f103586e = i11;
        this.f103587f = i12;
        this.f103588g = i13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f103582a == bVar.f103582a && this.f103583b == bVar.f103583b && this.f103584c == bVar.f103584c && this.f103585d == bVar.f103585d && this.f103586e == bVar.f103586e && this.f103587f == bVar.f103587f && this.f103588g == bVar.f103588g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f103588g) + I.a(this.f103587f, I.a(this.f103586e, I.a(this.f103585d, I.a(this.f103584c, I.a(this.f103583b, Integer.hashCode(this.f103582a) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSelectListColor(titleColor=");
        sb.append(this.f103582a);
        sb.append(", titleSelectColor=");
        sb.append(this.f103583b);
        sb.append(", subtitleColor=");
        sb.append(this.f103584c);
        sb.append(", tabColor=");
        sb.append(this.f103585d);
        sb.append(", tabSelectColor=");
        sb.append(this.f103586e);
        sb.append(", pageBackgroundColor=");
        sb.append(this.f103587f);
        sb.append(", bottomLineColor=");
        return C4277b.a(this.f103588g, ")", sb);
    }
}
