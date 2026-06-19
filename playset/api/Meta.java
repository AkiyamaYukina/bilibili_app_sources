package com.bilibili.playset.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/Meta.class */
@Keep
public class Meta implements Parcelable {
    public static final Parcelable.Creator<Meta> CREATOR = new Object();
    public int quality;
    public long size;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/Meta$a.class */
    public final class a implements Parcelable.Creator<Meta> {
        @Override // android.os.Parcelable.Creator
        public final Meta createFromParcel(Parcel parcel) {
            return new Meta(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Meta[] newArray(int i7) {
            return new Meta[i7];
        }
    }

    public Meta() {
    }

    public Meta(Parcel parcel) {
        this.quality = parcel.readInt();
        this.size = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.quality);
        parcel.writeLong(this.size);
    }
}
