package com.bilibili.search2.result.user;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/k.class */
@StabilityInferred(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f88574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f88575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f88576c;

    public k(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f88574a = str;
        this.f88575b = str2;
        this.f88576c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f88574a, kVar.f88574a) && Intrinsics.areEqual(this.f88575b, kVar.f88575b) && Intrinsics.areEqual(this.f88576c, kVar.f88576c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f88574a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f88575b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f88576c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserTypeData(name=");
        sb.append(this.f88574a);
        sb.append(", userType=");
        sb.append(this.f88575b);
        sb.append(", reportName=");
        return C8770a.a(sb, this.f88576c, ")");
    }
}
