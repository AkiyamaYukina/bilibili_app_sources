package com.bilibili.ogv.pub.review.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.bson.common.Bson;
import com.bilibili.live.streaming.source.TextSource;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/UserReview.class */
@Bson
public class UserReview implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<UserReview> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("review_id")
    @JvmField
    public long f71758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("title")
    @JvmField
    @Nullable
    public String f71759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(TextSource.CFG_CONTENT)
    @JvmField
    @Nullable
    public String f71760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("mtime")
    @JvmField
    public long f71761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("user_rating")
    @JvmField
    @Nullable
    public SimpleRating f71762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("is_coin")
    @JvmField
    public boolean f71763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @JvmField
    @Nullable
    public String f71764g;

    @JvmField
    public int h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/UserReview$a.class */
    public static final class a implements Parcelable.Creator<UserReview> {
        @Override // android.os.Parcelable.Creator
        public final UserReview createFromParcel(Parcel parcel) {
            UserReview userReview = new UserReview();
            userReview.f71758a = parcel.readLong();
            userReview.f71759b = parcel.readString();
            userReview.f71760c = parcel.readString();
            userReview.f71761d = parcel.readLong();
            userReview.f71762e = (SimpleRating) parcel.readParcelable(SimpleRating.class.getClassLoader());
            userReview.f71763f = ((Boolean) parcel.readValue(Boolean.TYPE.getClassLoader())).booleanValue();
            userReview.f71764g = parcel.readString();
            userReview.h = parcel.readInt();
            return userReview;
        }

        @Override // android.os.Parcelable.Creator
        public final UserReview[] newArray(int i7) {
            return new UserReview[i7];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f71758a);
        parcel.writeString(this.f71759b);
        parcel.writeString(this.f71760c);
        parcel.writeLong(this.f71761d);
        parcel.writeParcelable(this.f71762e, i7);
        parcel.writeValue(Boolean.valueOf(this.f71763f));
        parcel.writeString(this.f71764g);
        parcel.writeInt(this.h);
    }
}
