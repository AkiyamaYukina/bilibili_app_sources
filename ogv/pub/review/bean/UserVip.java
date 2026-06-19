package com.bilibili.ogv.pub.review.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.JvmField;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/UserVip.class */
@Bson
@Parcelize
public final class UserVip implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserVip> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("vipStatus")
    @JvmField
    public int f71771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("vipType")
    @JvmField
    public int f71772b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/UserVip$a.class */
    public static final class a implements Parcelable.Creator<UserVip> {
        @Override // android.os.Parcelable.Creator
        public final UserVip createFromParcel(Parcel parcel) {
            return new UserVip(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final UserVip[] newArray(int i7) {
            return new UserVip[i7];
        }
    }

    public UserVip() {
        this(0, 0, 3);
    }

    public UserVip(int i7, int i8) {
        this.f71771a = i7;
        this.f71772b = i8;
    }

    public /* synthetic */ UserVip(int i7, int i8, int i9) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? 0 : i8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f71771a);
        parcel.writeInt(this.f71772b);
    }
}
