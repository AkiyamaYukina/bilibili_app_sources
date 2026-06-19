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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/PageHeader.class */
@StabilityInferred(parameters = 1)
@Bson
public final class PageHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f69876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("sub_title")
    @NotNull
    private final String f69877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f69878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f69879d;

    public PageHeader(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f69876a = str;
        this.f69877b = str2;
        this.f69878c = str3;
        this.f69879d = str4;
    }

    @NotNull
    public final String a() {
        return this.f69877b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageHeader)) {
            return false;
        }
        PageHeader pageHeader = (PageHeader) obj;
        return Intrinsics.areEqual(this.f69876a, pageHeader.f69876a) && Intrinsics.areEqual(this.f69877b, pageHeader.f69877b) && Intrinsics.areEqual(this.f69878c, pageHeader.f69878c) && Intrinsics.areEqual(this.f69879d, pageHeader.f69879d);
    }

    public final int hashCode() {
        return this.f69879d.hashCode() + E.a(E.a(this.f69876a.hashCode() * 31, 31, this.f69877b), 31, this.f69878c);
    }

    @NotNull
    public final String toString() {
        String str = this.f69877b;
        StringBuilder sb = new StringBuilder("PageHeader(title=");
        B.a(this.f69876a, ", desc=", str, ", link=", sb);
        sb.append(this.f69878c);
        sb.append(", cover=");
        return C8770a.a(sb, this.f69879d, ")");
    }
}
