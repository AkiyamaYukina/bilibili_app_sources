package com.bilibili.playerbizcommonv2.widget.quality;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/i.class */
@StabilityInferred(parameters = 1)
public final class C5812i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f82828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f82829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f82830c;

    public C5812i(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f82828a = str;
        this.f82829b = str2;
        this.f82830c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5812i)) {
            return false;
        }
        C5812i c5812i = (C5812i) obj;
        return Intrinsics.areEqual(this.f82828a, c5812i.f82828a) && Intrinsics.areEqual(this.f82829b, c5812i.f82829b) && Intrinsics.areEqual(this.f82830c, c5812i.f82830c);
    }

    public final int hashCode() {
        return this.f82830c.hashCode() + I.E.a(this.f82828a.hashCode() * 31, 31, this.f82829b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HdrCardData(imageUrl=");
        sb.append(this.f82828a);
        sb.append(", title=");
        sb.append(this.f82829b);
        sb.append(", subtitle=");
        return C8770a.a(sb, this.f82830c, ")");
    }
}
