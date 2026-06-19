package com.bilibili.studio.videoeditor.bgm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/BgmPointEntry.class */
@Keep
public class BgmPointEntry implements Parcelable, Serializable {
    public static final Parcelable.Creator<BgmPointEntry> CREATOR = new Object();

    @JSONField(name = "comment")
    public String comment;

    @JSONField(name = "point")
    public long point;

    @JSONField(name = "recommend")
    public int recommend;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/BgmPointEntry$a.class */
    public final class a implements Parcelable.Creator<BgmPointEntry> {
        @Override // android.os.Parcelable.Creator
        public final BgmPointEntry createFromParcel(Parcel parcel) {
            return new BgmPointEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BgmPointEntry[] newArray(int i7) {
            return new BgmPointEntry[i7];
        }
    }

    public BgmPointEntry() {
    }

    public BgmPointEntry(Parcel parcel) {
        this.point = parcel.readLong();
        this.comment = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.point);
        parcel.writeString(this.comment);
    }
}
