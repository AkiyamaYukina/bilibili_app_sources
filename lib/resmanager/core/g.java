package com.bilibili.lib.resmanager.core;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/g.class */
@Entity(tableName = "res_cache")
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "_file_key")
    @NotNull
    public final String f64305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "_ctime")
    public final long f64306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "_location")
    @Nullable
    public final String f64307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ColumnInfo(name = "_access_count")
    public final int f64308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "_access_time")
    public final long f64309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ColumnInfo(name = "_size")
    public final long f64310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ColumnInfo(name = "_biz_type")
    @NotNull
    public final String f64311g;

    @ColumnInfo(name = "_flag")
    public final int h;

    public g(@NotNull String str, long j7, @Nullable String str2, int i7, long j8, long j9, @NotNull String str3, int i8) {
        this.f64305a = str;
        this.f64306b = j7;
        this.f64307c = str2;
        this.f64308d = i7;
        this.f64309e = j8;
        this.f64310f = j9;
        this.f64311g = str3;
        this.h = i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f64305a, gVar.f64305a) && this.f64306b == gVar.f64306b && Intrinsics.areEqual(this.f64307c, gVar.f64307c) && this.f64308d == gVar.f64308d && this.f64309e == gVar.f64309e && this.f64310f == gVar.f64310f && Intrinsics.areEqual(this.f64311g, gVar.f64311g) && this.h == gVar.h;
    }

    public final int hashCode() {
        int iA = C3554n0.a(this.f64305a.hashCode() * 31, 31, this.f64306b);
        String str = this.f64307c;
        return Integer.hashCode(this.h) + E.a(C3554n0.a(C3554n0.a(I.a(this.f64308d, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f64309e), 31, this.f64310f), 31, this.f64311g);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheDbEntity(fileKey=");
        sb.append(this.f64305a);
        sb.append(", ctime=");
        sb.append(this.f64306b);
        sb.append(", location=");
        sb.append(this.f64307c);
        sb.append(", accessCount=");
        sb.append(this.f64308d);
        sb.append(", accessTime=");
        sb.append(this.f64309e);
        sb.append(", size=");
        sb.append(this.f64310f);
        sb.append(", bizType=");
        sb.append(this.f64311g);
        sb.append(", flag=");
        return C4277b.a(this.h, ")", sb);
    }
}
