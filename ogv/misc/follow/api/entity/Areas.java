package com.bilibili.ogv.misc.follow.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/Areas.class */
@StabilityInferred(parameters = 0)
@Bson
@Parcelize
public final class Areas implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Areas> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f69106b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/Areas$a.class */
    public static final class a implements Parcelable.Creator<Areas> {
        @Override // android.os.Parcelable.Creator
        public final Areas createFromParcel(Parcel parcel) {
            return new Areas(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Areas[] newArray(int i7) {
            return new Areas[i7];
        }
    }

    public Areas() {
        this(0L, null, 3);
    }

    public Areas(long j7, @Nullable String str) {
        this.f69105a = j7;
        this.f69106b = str;
    }

    public /* synthetic */ Areas(long j7, String str, int i7) {
        this((i7 & 1) != 0 ? -1L : j7, (i7 & 2) != 0 ? "" : str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f69105a);
        parcel.writeString(this.f69106b);
    }
}
