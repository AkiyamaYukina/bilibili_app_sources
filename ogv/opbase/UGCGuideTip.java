package com.bilibili.ogv.opbase;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/UGCGuideTip.class */
@StabilityInferred(parameters = 1)
@Bson
public final class UGCGuideTip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f69949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("sub_title")
    @NotNull
    private final String f69950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f69951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f69952d;

    public UGCGuideTip(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f69949a = str;
        this.f69950b = str2;
        this.f69951c = str3;
        this.f69952d = str4;
    }

    @NotNull
    public final String a() {
        return this.f69950b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UGCGuideTip)) {
            return false;
        }
        UGCGuideTip uGCGuideTip = (UGCGuideTip) obj;
        return Intrinsics.areEqual(this.f69949a, uGCGuideTip.f69949a) && Intrinsics.areEqual(this.f69950b, uGCGuideTip.f69950b) && Intrinsics.areEqual(this.f69951c, uGCGuideTip.f69951c) && Intrinsics.areEqual(this.f69952d, uGCGuideTip.f69952d);
    }

    public final int hashCode() {
        return this.f69952d.hashCode() + E.a(E.a(this.f69949a.hashCode() * 31, 31, this.f69950b), 31, this.f69951c);
    }

    @NotNull
    public final String toString() {
        String str = this.f69950b;
        StringBuilder sb = new StringBuilder("UGCGuideTip(title=");
        B.a(this.f69949a, ", subtitle=", str, ", btnTitle=", sb);
        sb.append(this.f69951c);
        sb.append(", jumpModuleId=");
        return C8770a.a(sb, this.f69952d, ")");
    }
}
