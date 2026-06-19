package com.bilibili.ogv.pub.community;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Area.class */
@Bson
@Parcelize
public final class Area implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Area> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f71486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71487b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Area$a.class */
    public static final class a implements Parcelable.Creator<Area> {
        @Override // android.os.Parcelable.Creator
        public final Area createFromParcel(Parcel parcel) {
            return new Area(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Area[] newArray(int i7) {
            return new Area[i7];
        }
    }

    public Area(long j7, @NotNull String str) {
        this.f71486a = j7;
        this.f71487b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Area)) {
            return false;
        }
        Area area = (Area) obj;
        return this.f71486a == area.f71486a && Intrinsics.areEqual(this.f71487b, area.f71487b);
    }

    public final int hashCode() {
        return this.f71487b.hashCode() + (Long.hashCode(this.f71486a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = n.a(this.f71486a, "Area(id=", ", name=", this.f71487b);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f71486a);
        parcel.writeString(this.f71487b);
    }
}
