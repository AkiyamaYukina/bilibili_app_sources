package com.bilibili.studio.videoeditor.capturev3.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/BiliMusicBeatGalleryBean.class */
@Keep
public class BiliMusicBeatGalleryBean implements Parcelable {
    public static final Parcelable.Creator<BiliMusicBeatGalleryBean> CREATOR = new Object();

    @JSONField(name = "ctime")
    public long cTime;

    @JSONField(name = "cover")
    public String cover;

    @JSONField(name = "download_url")
    public String downloadUrl;

    @JSONField(name = "id")
    public long id;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public long mRank;

    @JSONField(name = "mtime")
    public long mTime;

    @JSONField(name = "max_cnt")
    public int maxCount;

    @JSONField(name = "min_cnt")
    public int minCount;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "player_url")
    public String playUrl;

    @JSONField(name = "tags")
    public String tags;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/BiliMusicBeatGalleryBean$a.class */
    public final class a implements Parcelable.Creator<BiliMusicBeatGalleryBean> {
        @Override // android.os.Parcelable.Creator
        public final BiliMusicBeatGalleryBean createFromParcel(Parcel parcel) {
            return new BiliMusicBeatGalleryBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiliMusicBeatGalleryBean[] newArray(int i7) {
            return new BiliMusicBeatGalleryBean[i7];
        }
    }

    public BiliMusicBeatGalleryBean() {
    }

    public BiliMusicBeatGalleryBean(Parcel parcel) {
        this.cover = parcel.readString();
        this.cTime = parcel.readLong();
        this.downloadUrl = parcel.readString();
        this.id = parcel.readLong();
        this.maxCount = parcel.readInt();
        this.minCount = parcel.readInt();
        this.mTime = parcel.readLong();
        this.name = parcel.readString();
        this.playUrl = parcel.readString();
        this.mRank = parcel.readLong();
        this.tags = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.cover);
        parcel.writeLong(this.cTime);
        parcel.writeString(this.downloadUrl);
        parcel.writeLong(this.id);
        parcel.writeInt(this.maxCount);
        parcel.writeInt(this.minCount);
        parcel.writeLong(this.mTime);
        parcel.writeString(this.name);
        parcel.writeString(this.playUrl);
        parcel.writeLong(this.mRank);
        parcel.writeString(this.tags);
    }
}
