package com.bilibili.ogv.pub.review.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.bson.common.Bson;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.JvmField;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewAuthor.class */
@Bson
@Parcelize
public final class ReviewAuthor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReviewAuthor> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(EditCustomizeSticker.TAG_MID)
    @JvmField
    public final long f71698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("uname")
    @JvmField
    @NotNull
    public final String f71699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("avatar")
    @JvmField
    @NotNull
    public final String f71700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("vip")
    @JvmField
    @Nullable
    public final UserVip f71701d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewAuthor$a.class */
    public static final class a implements Parcelable.Creator<ReviewAuthor> {
        @Override // android.os.Parcelable.Creator
        public final ReviewAuthor createFromParcel(Parcel parcel) {
            return new ReviewAuthor(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UserVip.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewAuthor[] newArray(int i7) {
            return new ReviewAuthor[i7];
        }
    }

    public ReviewAuthor(long j7, @NotNull String str, @NotNull String str2, @Nullable UserVip userVip) {
        this.f71698a = j7;
        this.f71699b = str;
        this.f71700c = str2;
        this.f71701d = userVip;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f71698a);
        parcel.writeString(this.f71699b);
        parcel.writeString(this.f71700c);
        UserVip userVip = this.f71701d;
        if (userVip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userVip.writeToParcel(parcel, i7);
        }
    }
}
