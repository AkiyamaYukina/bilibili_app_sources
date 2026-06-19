package com.bilibili.pegasus.components.graduation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Y.class */
@StabilityInferred(parameters = 1)
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f76098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f76099b;

    public Y(@NotNull String str, @Nullable String str2) {
        this.f76098a = str;
        this.f76099b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y6 = (Y) obj;
        return Intrinsics.areEqual(this.f76098a, y6.f76098a) && Intrinsics.areEqual(this.f76099b, y6.f76099b);
    }

    public final int hashCode() {
        int iHashCode = this.f76098a.hashCode();
        String str = this.f76099b;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GraduationSeasonValueParts(integer=");
        sb.append(this.f76098a);
        sb.append(", decimal=");
        return C8770a.a(sb, this.f76099b, ")");
    }
}
