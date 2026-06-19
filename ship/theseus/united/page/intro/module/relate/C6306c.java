package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/c.class */
@StabilityInferred(parameters = 1)
public final class C6306c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f101144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f101145b;

    public C6306c(float f7, float f8) {
        this.f101144a = f7;
        this.f101145b = f8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6306c)) {
            return false;
        }
        C6306c c6306c = (C6306c) obj;
        return Float.compare(this.f101144a, c6306c.f101144a) == 0 && Float.compare(this.f101145b, c6306c.f101145b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f101145b) + (Float.hashCode(this.f101144a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CoverDimension(width=");
        sb.append(this.f101144a);
        sb.append(", height=");
        return C.d.a(this.f101145b, ")", sb);
    }
}
