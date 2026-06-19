package com.bilibili.tensorflow.data.common;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/h.class */
@Entity(indices = {@Index(unique = true, value = {"_id"})}, tableName = "_tf_business_data")
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    public final long f110737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "_type")
    @NotNull
    public final String f110738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "_data")
    @NotNull
    public final String f110739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ColumnInfo(name = "_event_type")
    @NotNull
    public final String f110740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "_user_id")
    @NotNull
    public final String f110741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ColumnInfo(name = "_time_stamp")
    public final long f110742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ColumnInfo(name = "_report_time_stamp")
    public long f110743g;

    public h(@NotNull String str, @NotNull String str2, long j7, @NotNull String str3, @NotNull String str4, long j8, long j9) {
        this.f110737a = j7;
        this.f110738b = str;
        this.f110739c = str2;
        this.f110740d = str3;
        this.f110741e = str4;
        this.f110742f = j8;
        this.f110743g = j9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f110737a == hVar.f110737a && Intrinsics.areEqual(this.f110738b, hVar.f110738b) && Intrinsics.areEqual(this.f110739c, hVar.f110739c) && Intrinsics.areEqual(this.f110740d, hVar.f110740d) && Intrinsics.areEqual(this.f110741e, hVar.f110741e) && this.f110742f == hVar.f110742f && this.f110743g == hVar.f110743g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f110743g) + C3554n0.a(E.a(E.a(E.a(E.a(Long.hashCode(this.f110737a) * 31, 31, this.f110738b), 31, this.f110739c), 31, this.f110740d), 31, this.f110741e), 31, this.f110742f);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f110743g;
        StringBuilder sb = new StringBuilder("TfDataEntity(entryId=");
        sb.append(this.f110737a);
        sb.append(", type=");
        sb.append(this.f110738b);
        sb.append(", data=");
        sb.append(this.f110739c);
        sb.append(", eventType=");
        sb.append(this.f110740d);
        sb.append(", userId=");
        sb.append(this.f110741e);
        sb.append(", timeStamp=");
        sb.append(this.f110742f);
        return androidx.exifinterface.media.a.a(j7, ", reportTimeStamp=", ")", sb);
    }
}
