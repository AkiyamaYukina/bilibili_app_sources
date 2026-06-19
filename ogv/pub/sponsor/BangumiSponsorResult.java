package com.bilibili.ogv.pub.sponsor;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/sponsor/BangumiSponsorResult.class */
@Bson
public class BangumiSponsorResult implements Parcelable {
    public static final Parcelable.Creator<BangumiSponsorResult> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient boolean f71791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient String f71792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f71793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f71794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient long f71795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f71797g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("pendant_day")
    public int f71798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("pendant_day_text")
    public String f71799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<BangumiPendant> f71800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("point_activity")
    public BangumiSponsorEvent f71801l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/sponsor/BangumiSponsorResult$a.class */
    public final class a implements Parcelable.Creator<BangumiSponsorResult> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.pub.sponsor.BangumiSponsorResult, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final BangumiSponsorResult createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f71791a = parcel.readByte() != 0;
            obj.f71792b = parcel.readString();
            obj.f71793c = parcel.readString();
            obj.f71794d = parcel.readInt();
            obj.f71795e = parcel.readLong();
            obj.f71796f = parcel.readInt();
            obj.f71797g = parcel.readInt();
            obj.h = parcel.readInt();
            obj.f71798i = parcel.readInt();
            obj.f71799j = parcel.readString();
            obj.f71800k = parcel.createTypedArrayList(BangumiPendant.CREATOR);
            obj.f71801l = (BangumiSponsorEvent) parcel.readParcelable(BangumiSponsorEvent.class.getClassLoader());
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final BangumiSponsorResult[] newArray(int i7) {
            return new BangumiSponsorResult[i7];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeByte(this.f71791a ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f71792b);
        parcel.writeString(this.f71793c);
        parcel.writeInt(this.f71794d);
        parcel.writeLong(this.f71795e);
        parcel.writeInt(this.f71796f);
        parcel.writeInt(this.f71797g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.f71798i);
        parcel.writeString(this.f71799j);
        parcel.writeTypedList(this.f71800k);
        parcel.writeParcelable(this.f71801l, i7);
    }
}
