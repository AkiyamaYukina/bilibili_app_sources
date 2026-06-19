package com.bilibili.playset.detail.widget;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.playset.detail.widget.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/o.class */
public final class C5930o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84656b;

    public C5930o(int i7, boolean z6) {
        this.f84655a = i7;
        this.f84656b = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5930o)) {
            return false;
        }
        C5930o c5930o = (C5930o) obj;
        return this.f84655a == c5930o.f84655a && this.f84656b == c5930o.f84656b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84656b) + (Integer.hashCode(this.f84655a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutConfig(columns=");
        sb.append(this.f84655a);
        sb.append(", useSmallCard=");
        return androidx.appcompat.app.i.a(sb, this.f84656b, ")");
    }
}
