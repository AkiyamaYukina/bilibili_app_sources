package com.bilibili.search2.main.data;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.D;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/c.class */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("keyword")
    @Nullable
    private final String f86802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("time")
    private final long f86803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("qv_id")
    @Nullable
    private final String f86804c;

    public c() {
        this(null, 0L, null);
    }

    public c(@Nullable String str, long j7, @Nullable String str2) {
        this.f86802a = str;
        this.f86803b = j7;
        this.f86804c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f86802a, cVar.f86802a) && this.f86803b == cVar.f86803b && Intrinsics.areEqual(this.f86804c, cVar.f86804c);
    }

    public final int hashCode() {
        String str = this.f86802a;
        int iA = C3554n0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f86803b);
        String str2 = this.f86804c;
        return iA + (str2 == null ? 0 : str2.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = this.f86802a;
        return D.a(", qvId=", this.f86804c, ")", com.bilibili.playerbizcommon.features.background.b.a(this.f86803b, "Query(keyword=", str, ", time="));
    }
}
