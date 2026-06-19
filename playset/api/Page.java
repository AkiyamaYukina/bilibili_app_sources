package com.bilibili.playset.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/Page.class */
@Keep
public class Page implements Parcelable {
    public static final Parcelable.Creator<Page> CREATOR = new Object();
    public Dimension dimension;
    public long duration;
    public String from;
    public long id;
    public String intro;
    public String link;
    public List<Meta> metas;
    public int page;
    public String title;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/Page$a.class */
    public final class a implements Parcelable.Creator<Page> {
        @Override // android.os.Parcelable.Creator
        public final Page createFromParcel(Parcel parcel) {
            return new Page(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Page[] newArray(int i7) {
            return new Page[i7];
        }
    }

    public Page() {
        this.metas = Collections.emptyList();
    }

    public Page(Parcel parcel) {
        this.metas = Collections.emptyList();
        this.duration = parcel.readLong();
        this.from = parcel.readString();
        this.id = parcel.readLong();
        this.metas = parcel.createTypedArrayList(Meta.CREATOR);
        this.page = parcel.readInt();
        this.title = parcel.readString();
        this.intro = parcel.readString();
        this.link = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.id != ((Page) obj).id) {
            z6 = false;
        }
        return z6;
    }

    public int hashCode() {
        long j7 = this.id;
        return this.title.hashCode() + ((int) (j7 ^ (j7 >> 30)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.duration);
        parcel.writeString(this.from);
        parcel.writeLong(this.id);
        parcel.writeTypedList(this.metas);
        parcel.writeInt(this.page);
        parcel.writeString(this.title);
        parcel.writeString(this.intro);
        parcel.writeString(this.link);
    }
}
