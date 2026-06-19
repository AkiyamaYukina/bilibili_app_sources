package com.bilibili.ogv.pub.review.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewPublishInfo.class */
@Bson
public final class ReviewPublishInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewPublishInfo> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("media")
    @NonNull
    public ReviewMediaBase f71723a = new ReviewMediaBase();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("review")
    public PublishReview f71724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UserReview f71725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f71726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f71727e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewPublishInfo$PublishReview.class */
    @Bson
    public static class PublishReview implements Parcelable {
        public static final Parcelable.Creator<PublishReview> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f71728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("is_open")
        public boolean f71729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("is_coin")
        public boolean f71730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @SerializedName("short_review")
        public UserReview f71731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName("long_review")
        public UserReview f71732e;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewPublishInfo$PublishReview$a.class */
        public final class a implements Parcelable.Creator<PublishReview> {
            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.pub.review.bean.ReviewPublishInfo$PublishReview, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final PublishReview createFromParcel(Parcel parcel) {
                ?? obj = new Object();
                obj.f71728a = parcel.readInt();
                obj.f71729b = parcel.readByte() != 0;
                boolean z6 = false;
                if (parcel.readByte() != 0) {
                    z6 = true;
                }
                obj.f71730c = z6;
                obj.f71731d = (UserReview) parcel.readParcelable(UserReview.class.getClassLoader());
                obj.f71732e = (UserReview) parcel.readParcelable(UserReview.class.getClassLoader());
                return obj;
            }

            @Override // android.os.Parcelable.Creator
            public final PublishReview[] newArray(int i7) {
                return new PublishReview[i7];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f71728a);
            parcel.writeByte(this.f71729b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f71730c ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f71731d, i7);
            parcel.writeParcelable(this.f71732e, i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewPublishInfo$a.class */
    public final class a implements Parcelable.Creator<ReviewPublishInfo> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.pub.review.bean.ReviewPublishInfo, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final ReviewPublishInfo createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f71723a = new ReviewMediaBase();
            obj.f71723a = (ReviewMediaBase) parcel.readParcelable(ReviewMediaBase.class.getClassLoader());
            obj.f71725c = (UserReview) parcel.readParcelable(UserReview.class.getClassLoader());
            obj.f71724b = (PublishReview) parcel.readParcelable(PublishReview.class.getClassLoader());
            obj.f71726d = parcel.readByte() != 0;
            boolean z6 = false;
            if (parcel.readByte() != 0) {
                z6 = true;
            }
            obj.f71727e = z6;
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewPublishInfo[] newArray(int i7) {
            return new ReviewPublishInfo[i7];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f71723a, i7);
        parcel.writeParcelable(this.f71725c, i7);
        parcel.writeParcelable(this.f71724b, i7);
        parcel.writeByte(this.f71726d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71727e ? (byte) 1 : (byte) 0);
    }
}
