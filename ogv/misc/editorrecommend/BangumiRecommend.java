package com.bilibili.ogv.misc.editorrecommend;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/editorrecommend/BangumiRecommend.class */
@Bson
public class BangumiRecommend implements Parcelable {
    public static final Parcelable.Creator<BangumiRecommend> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f68992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f68993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f68994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f68995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("is_new")
    public boolean f68996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f68997g;

    @SerializedName("is_auto")
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f68998i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/editorrecommend/BangumiRecommend$a.class */
    public final class a implements Parcelable.Creator<BangumiRecommend> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.misc.editorrecommend.BangumiRecommend, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final BangumiRecommend createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f68991a = parcel.readInt();
            obj.f68992b = parcel.readLong();
            obj.f68993c = parcel.readString();
            obj.f68994d = parcel.readString();
            obj.f68995e = parcel.readString();
            obj.f68996f = parcel.readByte() != 0;
            obj.f68997g = parcel.readString();
            boolean z6 = false;
            if (parcel.readByte() != 0) {
                z6 = true;
            }
            obj.h = z6;
            obj.f68998i = parcel.readString();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final BangumiRecommend[] newArray(int i7) {
            return new BangumiRecommend[i7];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f68991a);
        parcel.writeLong(this.f68992b);
        parcel.writeString(this.f68993c);
        parcel.writeString(this.f68994d);
        parcel.writeString(this.f68995e);
        parcel.writeByte(this.f68996f ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68997g);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68998i);
    }
}
