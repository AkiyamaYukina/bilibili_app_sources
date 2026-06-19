package com.bilibili.ogv.pub.review.bean;

import android.os.Parcel;
import android.os.Parcelable;
import cf.d;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.JvmField;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/UserSeason.class */
@Bson
@Parcelize
public final class UserSeason implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserSeason> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("last_ep_id")
    @Nullable
    private String f71766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("last_ep_index")
    @Nullable
    private String f71767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("last_time")
    @Nullable
    private Long f71768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("last_index_show")
    @JvmField
    @Nullable
    public String f71769d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/UserSeason$a.class */
    public static final class a implements Parcelable.Creator<UserSeason> {
        @Override // android.os.Parcelable.Creator
        public final UserSeason createFromParcel(Parcel parcel) {
            return new UserSeason(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserSeason[] newArray(int i7) {
            return new UserSeason[i7];
        }
    }

    public UserSeason() {
        this(null, null, null, null, 15);
    }

    public UserSeason(@Nullable String str, @Nullable String str2, @Nullable Long l7, @Nullable String str3) {
        this.f71766a = str;
        this.f71767b = str2;
        this.f71768c = l7;
        this.f71769d = str3;
    }

    public /* synthetic */ UserSeason(String str, String str2, Long l7, String str3, int i7) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? 0L : l7, (i7 & 8) != 0 ? null : str3);
    }

    @Nullable
    public final String a() {
        return this.f71767b;
    }

    @Nullable
    public final Long b() {
        return this.f71768c;
    }

    @Nullable
    public final String c() {
        return this.f71766a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f71766a);
        parcel.writeString(this.f71767b);
        Long l7 = this.f71768c;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            d.a(parcel, 1, l7);
        }
        parcel.writeString(this.f71769d);
    }
}
