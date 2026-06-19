package com.bilibili.ogv.pub.review.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase.class */
@Bson
public class ReviewMediaBase implements Parcelable {
    public static final Parcelable.Creator<ReviewMediaBase> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("media_id")
    public long f71703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("title")
    public String f71704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cover")
    public String f71705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("horizontal_picture")
    public String f71706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("share_url")
    @Nullable
    public String f71707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName(alternate = {"type"}, value = "type_id")
    public int f71708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("type_name")
    public String f71709g;

    @SerializedName("style")
    @Nullable
    public List<ReviewTag> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("rating")
    @Nullable
    public MediaRating f71710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("season_id")
    public long f71711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName(alternate = {"areas"}, value = "area")
    @NonNull
    public List<? extends ReviewArea> f71712k = Collections.emptyList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("new_ep")
    @Nullable
    public MediaEpisodeIndex f71713l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase$ReviewArea.class */
    @Bson
    public static class ReviewArea implements Parcelable {
        public static final Parcelable.Creator<ReviewArea> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("id")
        public int f71714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("name")
        public String f71715b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase$ReviewArea$a.class */
        public final class a implements Parcelable.Creator<ReviewArea> {
            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.pub.review.bean.ReviewMediaBase$ReviewArea, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final ReviewArea createFromParcel(Parcel parcel) {
                ?? obj = new Object();
                obj.f71714a = parcel.readInt();
                obj.f71715b = parcel.readString();
                return obj;
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewArea[] newArray(int i7) {
                return new ReviewArea[i7];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f71714a);
            parcel.writeString(this.f71715b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase$ReviewParam.class */
    @Bson
    public static class ReviewParam implements Parcelable {
        public static final Parcelable.Creator<ReviewParam> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("id")
        public long f71716a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase$ReviewParam$a.class */
        public final class a implements Parcelable.Creator<ReviewParam> {
            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.pub.review.bean.ReviewMediaBase$ReviewParam, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final ReviewParam createFromParcel(Parcel parcel) {
                ?? obj = new Object();
                obj.f71716a = parcel.readLong();
                return obj;
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewParam[] newArray(int i7) {
                return new ReviewParam[i7];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeLong(this.f71716a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase$ReviewTag.class */
    @Bson
    public static class ReviewTag implements Parcelable {
        public static final Parcelable.Creator<ReviewTag> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("id")
        public int f71717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("name")
        public String f71718b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase$ReviewTag$a.class */
        public final class a implements Parcelable.Creator<ReviewTag> {
            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.pub.review.bean.ReviewMediaBase$ReviewTag, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final ReviewTag createFromParcel(Parcel parcel) {
                ?? obj = new Object();
                obj.f71717a = parcel.readInt();
                obj.f71718b = parcel.readString();
                return obj;
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewTag[] newArray(int i7) {
                return new ReviewTag[i7];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f71717a);
            parcel.writeString(this.f71718b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase$a.class */
    public final class a implements Parcelable.Creator<ReviewMediaBase> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.pub.review.bean.ReviewMediaBase, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final ReviewMediaBase createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f71712k = Collections.emptyList();
            obj.f71703a = parcel.readLong();
            obj.f71704b = parcel.readString();
            obj.f71705c = parcel.readString();
            obj.f71706d = parcel.readString();
            obj.f71707e = parcel.readString();
            obj.f71711j = parcel.readLong();
            obj.f71712k = parcel.createTypedArrayList(ReviewArea.CREATOR);
            obj.f71708f = parcel.readInt();
            obj.f71709g = parcel.readString();
            obj.h = parcel.createTypedArrayList(ReviewTag.CREATOR);
            obj.f71713l = (MediaEpisodeIndex) parcel.readParcelable(MediaEpisodeIndex.class.getClassLoader());
            obj.f71710i = (MediaRating) parcel.readParcelable(MediaRating.class.getClassLoader());
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewMediaBase[] newArray(int i7) {
            return new ReviewMediaBase[i7];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f71703a);
        parcel.writeString(this.f71704b);
        parcel.writeString(this.f71705c);
        parcel.writeString(this.f71706d);
        parcel.writeString(this.f71707e);
        parcel.writeLong(this.f71711j);
        parcel.writeTypedList(this.f71712k);
        parcel.writeInt(this.f71708f);
        parcel.writeString(this.f71709g);
        parcel.writeTypedList(this.h);
        parcel.writeParcelable(this.f71713l, i7);
        parcel.writeParcelable(this.f71710i, i7);
    }
}
