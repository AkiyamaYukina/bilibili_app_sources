package com.bilibili.ogv.misc.follow.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/Progress.class */
@StabilityInferred(parameters = 0)
@Bson
@Parcelize
public final class Progress implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Progress> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("last_ep_id")
    private long f69147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("last_time")
    private long f69148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("index_show")
    @Nullable
    private String f69149c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/Progress$a.class */
    public static final class a implements Parcelable.Creator<Progress> {
        @Override // android.os.Parcelable.Creator
        public final Progress createFromParcel(Parcel parcel) {
            return new Progress(parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Progress[] newArray(int i7) {
            return new Progress[i7];
        }
    }

    public Progress() {
        this(7, 0L, 0L, null);
    }

    public /* synthetic */ Progress(int i7, long j7, long j8, String str) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? -1L : j8, (i7 & 4) != 0 ? "" : str);
    }

    public Progress(long j7, long j8, @Nullable String str) {
        this.f69147a = j7;
        this.f69148b = j8;
        this.f69149c = str;
    }

    @Nullable
    public final String a() {
        return this.f69149c;
    }

    public final long b() {
        return this.f69147a;
    }

    public final long c() {
        return this.f69148b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f69147a);
        parcel.writeLong(this.f69148b);
        parcel.writeString(this.f69149c);
    }
}
