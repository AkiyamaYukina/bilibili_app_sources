package com.bilibili.pegasus.fakepegasus;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/n.class */
@StabilityInferred(parameters = 1)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f77472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f77473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Integer f77474f;

    public n(int i7, int i8, int i9, float f7, float f8, @Nullable Integer num) {
        this.f77469a = i7;
        this.f77470b = i8;
        this.f77471c = i9;
        this.f77472d = f7;
        this.f77473e = f8;
        this.f77474f = num;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f77469a == nVar.f77469a && this.f77470b == nVar.f77470b && this.f77471c == nVar.f77471c && Float.compare(this.f77472d, nVar.f77472d) == 0 && Float.compare(this.f77473e, nVar.f77473e) == 0 && Intrinsics.areEqual(this.f77474f, nVar.f77474f);
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.n.a(this.f77473e, androidx.compose.animation.n.a(this.f77472d, I.a(this.f77471c, I.a(this.f77470b, Integer.hashCode(this.f77469a) * 31, 31), 31), 31), 31);
        Integer num = this.f77474f;
        return iA + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PegasusLayoutConfig(horizontalPadding=");
        sb.append(this.f77469a);
        sb.append(", spanCount=");
        sb.append(this.f77470b);
        sb.append(", itemSpacing=");
        sb.append(this.f77471c);
        sb.append(", titleTextSize=");
        sb.append(this.f77472d);
        sb.append(", infoTextSize=");
        sb.append(this.f77473e);
        sb.append(", showMoreButtonWidth=");
        return e4.c.a(sb, this.f77474f, ")");
    }
}
