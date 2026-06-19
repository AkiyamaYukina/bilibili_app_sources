package com.bilibili.lib.projection.internal.api.model;

import H0.e;
import I.E;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.room.B;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionQualityInfo.class */
public final class ProjectionQualityInfo implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f63005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f63006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f63007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f63008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f63009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f63010g;

    @NotNull
    public final String h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionQualityInfo$a.class */
    public static final class a implements Parcelable.Creator<ProjectionQualityInfo> {
        @Override // android.os.Parcelable.Creator
        public final ProjectionQualityInfo createFromParcel(Parcel parcel) {
            int i7 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i8 = parcel.readInt();
            boolean z6 = true;
            if (parcel.readInt() != 1) {
                z6 = false;
            }
            return new ProjectionQualityInfo(i7, string, string2, string3, string4, i8, z6, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProjectionQualityInfo[] newArray(int i7) {
            return new ProjectionQualityInfo[i7];
        }
    }

    public ProjectionQualityInfo(int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i8, boolean z6, @NotNull String str5) {
        this.f63004a = i7;
        this.f63005b = str;
        this.f63006c = str2;
        this.f63007d = str3;
        this.f63008e = str4;
        this.f63009f = i8;
        this.f63010g = z6;
        this.h = str5;
    }

    @NotNull
    public final String a() {
        return !StringsKt.isBlank(this.f63007d) ? this.f63007d : !StringsKt.isBlank(this.f63006c) ? this.f63006c : "";
    }

    public final boolean b() {
        boolean z6 = true;
        if ((this.f63009f & 1) == 0) {
            z6 = false;
        }
        return z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectionQualityInfo)) {
            return false;
        }
        ProjectionQualityInfo projectionQualityInfo = (ProjectionQualityInfo) obj;
        return this.f63004a == projectionQualityInfo.f63004a && Intrinsics.areEqual(this.f63005b, projectionQualityInfo.f63005b) && Intrinsics.areEqual(this.f63006c, projectionQualityInfo.f63006c) && Intrinsics.areEqual(this.f63007d, projectionQualityInfo.f63007d) && Intrinsics.areEqual(this.f63008e, projectionQualityInfo.f63008e) && this.f63009f == projectionQualityInfo.f63009f && this.f63010g == projectionQualityInfo.f63010g && Intrinsics.areEqual(this.h, projectionQualityInfo.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + z.a(I.a(this.f63009f, E.a(E.a(E.a(E.a(Integer.hashCode(this.f63004a) * 31, 31, this.f63005b), 31, this.f63006c), 31, this.f63007d), 31, this.f63008e), 31), 31, this.f63010g);
    }

    @NotNull
    public final String toString() {
        int i7 = this.f63004a;
        String str = this.f63005b;
        String str2 = this.f63006c;
        String str3 = this.f63007d;
        String str4 = this.f63008e;
        int i8 = this.f63009f;
        boolean z6 = this.f63010g;
        String str5 = this.h;
        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "ProjectionQualityInfo(quality=", ", format=", str, ", description=");
        B.a(str2, ", displayDesc=", str3, ", superscript=", sbB);
        e.b(i8, str4, ", flags=", ", isShowYSTSubscript=", sbB);
        sbB.append(z6);
        sbB.append(", subscriptYSTStr=");
        sbB.append(str5);
        sbB.append(")");
        return sbB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f63004a);
        parcel.writeString(this.f63005b);
        parcel.writeString(this.f63006c);
        parcel.writeString(this.f63007d);
        parcel.writeString(this.f63008e);
        parcel.writeInt(i7);
        parcel.writeInt(this.f63010g ? 1 : 0);
        parcel.writeString(this.h);
    }
}
