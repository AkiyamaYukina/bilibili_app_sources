package com.bilibili.music.podcast.collection.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/CoinExtra.class */
public class CoinExtra implements Parcelable {
    public static final Parcelable.Creator<CoinExtra> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @JSONField(name = "max_num")
    public int f66411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JSONField(name = "coin_number")
    public int f66412b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/CoinExtra$a.class */
    public final class a implements Parcelable.Creator<CoinExtra> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.music.podcast.collection.api.CoinExtra, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final CoinExtra createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f66411a = parcel.readInt();
            obj.f66412b = parcel.readInt();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final CoinExtra[] newArray(int i7) {
            return new CoinExtra[i7];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f66411a);
        parcel.writeInt(this.f66412b);
    }
}
