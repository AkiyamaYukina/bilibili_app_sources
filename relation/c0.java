package com.bilibili.relation;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/c0.class */
@StabilityInferred(parameters = 0)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f86051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f86052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f86053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final HashMap<String, String> f86054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f86055f;

    public c0() {
        this(0);
    }

    public /* synthetic */ c0(int i7) {
        this(0, null, null, null, null, null);
    }

    public c0(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable HashMap<String, String> map, @Nullable String str4) {
        this.f86050a = i7;
        this.f86051b = str;
        this.f86052c = str2;
        this.f86053d = str3;
        this.f86054e = map;
        this.f86055f = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f86050a == c0Var.f86050a && Intrinsics.areEqual(this.f86051b, c0Var.f86051b) && Intrinsics.areEqual(this.f86052c, c0Var.f86052c) && Intrinsics.areEqual(this.f86053d, c0Var.f86053d) && Intrinsics.areEqual(this.f86054e, c0Var.f86054e) && Intrinsics.areEqual(this.f86055f, c0Var.f86055f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f86050a);
        int iHashCode2 = 0;
        String str = this.f86051b;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f86052c;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f86053d;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        HashMap<String, String> map = this.f86054e;
        int iHashCode6 = map == null ? 0 : map.hashCode();
        String str4 = this.f86055f;
        if (str4 != null) {
            iHashCode2 = str4.hashCode();
        }
        return (((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        HashMap<String, String> map = this.f86054e;
        StringBuilder sb = new StringBuilder("ReportParams(from=");
        sb.append(this.f86050a);
        sb.append(", spmid=");
        sb.append(this.f86051b);
        sb.append(", fromSpmid=");
        sb.append(this.f86052c);
        sb.append(", fromScmid=");
        sb.append(this.f86053d);
        sb.append(", clickReportExtras=");
        sb.append(map);
        sb.append(", extendContent=");
        return C8770a.a(sb, this.f86055f, ")");
    }
}
