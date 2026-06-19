package com.bilibili.ogv.pub.reserve;

import androidx.compose.animation.core.I;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/Dimension.class */
@Bson
public final class Dimension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f71626c;

    public Dimension(int i7, int i8, boolean z6) {
        this.f71624a = i7;
        this.f71625b = i8;
        this.f71626c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dimension)) {
            return false;
        }
        Dimension dimension = (Dimension) obj;
        return this.f71624a == dimension.f71624a && this.f71625b == dimension.f71625b && this.f71626c == dimension.f71626c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71626c) + I.a(this.f71625b, Integer.hashCode(this.f71624a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Dimension(width=");
        sb.append(this.f71624a);
        sb.append(", height=");
        sb.append(this.f71625b);
        sb.append(", rotate=");
        return androidx.appcompat.app.i.a(sb, this.f71626c, ")");
    }
}
