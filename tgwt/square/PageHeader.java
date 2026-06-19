package com.bilibili.tgwt.square;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/PageHeader.class */
@StabilityInferred(parameters = 1)
@Bson
public final class PageHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f112070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("sub_title")
    @NotNull
    private final String f112071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f112072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f112073d;

    public PageHeader(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f112070a = str;
        this.f112071b = str2;
        this.f112072c = str3;
        this.f112073d = str4;
    }

    @NotNull
    public final String a() {
        return this.f112071b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageHeader)) {
            return false;
        }
        PageHeader pageHeader = (PageHeader) obj;
        return Intrinsics.areEqual(this.f112070a, pageHeader.f112070a) && Intrinsics.areEqual(this.f112071b, pageHeader.f112071b) && Intrinsics.areEqual(this.f112072c, pageHeader.f112072c) && Intrinsics.areEqual(this.f112073d, pageHeader.f112073d);
    }

    public final int hashCode() {
        return this.f112073d.hashCode() + E.a(E.a(this.f112070a.hashCode() * 31, 31, this.f112071b), 31, this.f112072c);
    }

    @NotNull
    public final String toString() {
        String str = this.f112071b;
        StringBuilder sb = new StringBuilder("PageHeader(title=");
        B.a(this.f112070a, ", desc=", str, ", link=", sb);
        sb.append(this.f112072c);
        sb.append(", cover=");
        return C8770a.a(sb, this.f112073d, ")");
    }
}
