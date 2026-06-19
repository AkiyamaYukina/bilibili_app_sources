package com.bilibili.ship.theseus.united.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.JsonAdapter;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/VideoDimension.class */
@StabilityInferred(parameters = 0)
@Parcelize
@JsonAdapter(nullSafe = false, value = VideoDimensionTypeAdapterFactory.class)
public final class VideoDimension implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VideoDimension> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98735b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/VideoDimension$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/VideoDimension$b.class */
    public static final class b implements Parcelable.Creator<VideoDimension> {
        @Override // android.os.Parcelable.Creator
        public final VideoDimension createFromParcel(Parcel parcel) {
            return new VideoDimension(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDimension[] newArray(int i7) {
            return new VideoDimension[i7];
        }
    }

    public VideoDimension(int i7, int i8) {
        this.f98734a = i7;
        this.f98735b = i8;
        if (i7 <= 0) {
            throw new IllegalArgumentException(C3259x.a(i7, "Invalid width: ").toString());
        }
        if (i8 <= 0) {
            throw new IllegalArgumentException(C3259x.a(i8, "Invalid height: ").toString());
        }
    }

    public final float a() {
        return this.f98734a / this.f98735b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDimension)) {
            return false;
        }
        VideoDimension videoDimension = (VideoDimension) obj;
        return this.f98734a == videoDimension.f98734a && this.f98735b == videoDimension.f98735b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98735b) + (Integer.hashCode(this.f98734a) * 31);
    }

    @NotNull
    public final String toString() {
        return androidx.compose.runtime.collection.d.a(this.f98734a, this.f98735b, "VideoDimension(width=", ", height=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f98734a);
        parcel.writeInt(this.f98735b);
    }
}
