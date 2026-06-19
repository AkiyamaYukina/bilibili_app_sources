package com.bilibili.search2.result.user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.polymer.app.search.v1.UserSort;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f88545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f88546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f88547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f88548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final UserSort f88549e = null;

    public d(String str, String str2, String str3, String str4) {
        this.f88545a = str;
        this.f88546b = str2;
        this.f88547c = str3;
        this.f88548d = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f88545a, dVar.f88545a) && Intrinsics.areEqual(this.f88546b, dVar.f88546b) && Intrinsics.areEqual(this.f88547c, dVar.f88547c) && Intrinsics.areEqual(this.f88548d, dVar.f88548d) && this.f88549e == dVar.f88549e;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f88545a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f88546b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f88547c;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f88548d;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        UserSort userSort = this.f88549e;
        if (userSort != null) {
            iHashCode = userSort.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "OrderTypeData(name=" + this.f88545a + ", orderType=" + this.f88546b + ", ascend=" + this.f88547c + ", reportName=" + this.f88548d + ", userSort=" + this.f88549e + ")";
    }
}
