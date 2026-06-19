package com.bilibili.ogv.pub.review.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/MediaRating.class */
@Bson
public final class MediaRating implements Parcelable {
    public static final Parcelable.Creator<MediaRating> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("score")
    public float f71695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("count")
    public int f71696b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/MediaRating$a.class */
    public final class a implements Parcelable.Creator<MediaRating> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.pub.review.bean.MediaRating, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final MediaRating createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f71695a = parcel.readFloat();
            obj.f71696b = parcel.readInt();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final MediaRating[] newArray(int i7) {
            return new MediaRating[i7];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f71695a);
        parcel.writeInt(this.f71696b);
    }
}
