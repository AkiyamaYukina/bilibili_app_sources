package com.bilibili.playset.api;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/h.class */
@StabilityInferred(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("season_id")
    private final long f84074a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("type_id")
    private final long f84075b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("type_name")
    @Nullable
    private final String f84076c = null;

    public final long a() {
        return this.f84074a;
    }

    public final long b() {
        return this.f84075b;
    }

    @Nullable
    public final String c() {
        return this.f84076c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f84074a == hVar.f84074a && this.f84075b == hVar.f84075b && Intrinsics.areEqual(this.f84076c, hVar.f84076c);
    }

    public final int hashCode() {
        int iA = C3554n0.a(Long.hashCode(this.f84074a) * 31, 31, this.f84075b);
        String str = this.f84076c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        long j7 = this.f84074a;
        long j8 = this.f84075b;
        String str = this.f84076c;
        StringBuilder sbA = z.a(j7, "Ogv(seasonId=", ", typeId=");
        G0.d.a(j8, ", typeName=", str, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
