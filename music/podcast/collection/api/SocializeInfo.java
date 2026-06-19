package com.bilibili.music.podcast.collection.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/SocializeInfo.class */
@Keep
public class SocializeInfo implements Parcelable {
    public static final Parcelable.Creator<SocializeInfo> CREATOR = new Object();
    public int coin;
    public int collect;
    public long danmaku;
    public boolean isVt;
    public long play;
    public int reply;
    public int share;
    public int thumb_down;
    public int thumb_up;
    public String viewContent;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/SocializeInfo$a.class */
    public final class a implements Parcelable.Creator<SocializeInfo> {
        @Override // android.os.Parcelable.Creator
        public final SocializeInfo createFromParcel(Parcel parcel) {
            return new SocializeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SocializeInfo[] newArray(int i7) {
            return new SocializeInfo[i7];
        }
    }

    public SocializeInfo() {
    }

    public SocializeInfo(Parcel parcel) {
        this.collect = parcel.readInt();
        this.danmaku = parcel.readLong();
        this.play = parcel.readLong();
        this.reply = parcel.readInt();
        this.share = parcel.readInt();
        this.thumb_down = parcel.readInt();
        this.thumb_up = parcel.readInt();
        this.coin = parcel.readInt();
        this.isVt = parcel.readByte() != 0;
        this.viewContent = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void upShare() {
        this.share++;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.collect);
        parcel.writeLong(this.danmaku);
        parcel.writeLong(this.play);
        parcel.writeInt(this.reply);
        parcel.writeInt(this.share);
        parcel.writeInt(this.thumb_down);
        parcel.writeInt(this.thumb_up);
        parcel.writeInt(this.coin);
        parcel.writeByte(this.isVt ? (byte) 1 : (byte) 0);
        parcel.writeString(this.viewContent);
    }
}
