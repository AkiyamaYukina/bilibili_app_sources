package com.bilibili.studio.videoeditor.bgm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.collection.C3269h;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import com.bilibili.studio.videoeditor.util.C6632e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/Bgm.class */
@Keep
public class Bgm implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<Bgm> CREATOR = new Object();
    public static final int TYPE_FAVORITE = 1;
    public static final int TYPE_LISTENED = 2;
    public static final int TYPE_NORMAL = 0;
    public String category;

    @JSONField(name = "colors")
    public String[] colors;

    @JSONField(name = "cooperate")
    public long cooperate;

    @JSONField(name = "cooperate_url")
    public String cooperate_url;

    @JSONField(name = "cover")
    public String cover;

    @JSONField(name = "ctime")
    public long ctime;

    @JSONField(name = EditCustomizeSticker.TAG_DURATION)
    public long duration;

    @JSONField(name = "editon_name")
    public String editonName;

    @JSONField(name = "fav")
    public int fav;

    @JSONField(name = "filesize")
    public long filesize;

    @JSONField(name = "font_colors")
    public String[] fontColors;
    public boolean formMusicLibrary;
    public boolean hasData;

    @JSONField(name = "id")
    public long id;
    public int index;
    public int indexInTab;
    public String localPath;
    private int mBgmType;
    private boolean mIsPlayed;
    private boolean mIsSelected;

    @JSONField(name = "markers_download_url")
    public String markerDownloadUrl;
    public String markerLocalPath;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    public long mid;
    public IntelligenceMusicInfo.MusicMarker musicMarker;

    @JSONField(name = "musicians")
    public String musicians;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "outer_tag")
    public String outerTag;

    @JSONField(name = "playurl")
    public String playurl;

    @JSONField(name = "pubtime")
    public long pubtime;

    @JSONField(name = "recommend_point")
    public long recommend_point;

    @JSONField(name = "sid")
    public long sid;
    private long startTime;

    @JSONField(name = "state")
    public int state;

    @JSONField(name = "tags")
    public String[] tags;

    @JSONField(name = "tid")
    public long tid;

    @JSONField(name = "timeline")
    public ArrayList<BgmPointEntry> timeline;
    public long version;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/Bgm$a.class */
    public final class a implements Parcelable.Creator<Bgm> {
        @Override // android.os.Parcelable.Creator
        public final Bgm createFromParcel(Parcel parcel) {
            return new Bgm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Bgm[] newArray(int i7) {
            return new Bgm[i7];
        }
    }

    public Bgm() {
        this.startTime = -1L;
        this.mBgmType = 0;
        this.index = -1;
        this.formMusicLibrary = false;
        this.hasData = true;
    }

    public Bgm(long j7, String str, String str2) {
        this.startTime = -1L;
        this.mBgmType = 0;
        this.index = -1;
        this.formMusicLibrary = false;
        this.hasData = true;
        this.sid = j7;
        this.name = str;
        this.playurl = str2;
    }

    public Bgm(Parcel parcel) {
        this.startTime = -1L;
        this.mBgmType = 0;
        this.index = -1;
        this.formMusicLibrary = false;
        this.hasData = true;
        this.id = parcel.readLong();
        this.sid = parcel.readLong();
        this.tid = parcel.readLong();
        this.mid = parcel.readLong();
        this.name = parcel.readString();
        this.musicians = parcel.readString();
        this.cover = parcel.readString();
        this.playurl = parcel.readString();
        this.state = parcel.readInt();
        this.duration = parcel.readLong();
        this.filesize = parcel.readLong();
        this.ctime = parcel.readLong();
        this.pubtime = parcel.readLong();
        this.tags = parcel.createStringArray();
        this.colors = parcel.createStringArray();
        this.fontColors = parcel.createStringArray();
        this.timeline = parcel.createTypedArrayList(BgmPointEntry.CREATOR);
        this.recommend_point = parcel.readLong();
        this.cooperate = parcel.readLong();
        this.cooperate_url = parcel.readString();
        this.startTime = parcel.readLong();
        this.fav = parcel.readInt();
        this.category = parcel.readString();
        setBgmType(parcel.readInt());
    }

    public Bgm(Bgm bgm) {
        this.startTime = -1L;
        this.mBgmType = 0;
        this.index = -1;
        this.formMusicLibrary = false;
        this.hasData = true;
        restore(bgm);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Bgm m10406clone() {
        try {
            return (Bgm) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
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
        Bgm bgm = (Bgm) obj;
        if (this.id != bgm.id || this.sid != bgm.sid || this.tid != bgm.tid || this.mid != bgm.mid || this.state != bgm.state || this.duration != bgm.duration || this.filesize != bgm.filesize || this.ctime != bgm.ctime || this.pubtime != bgm.pubtime || this.recommend_point != bgm.recommend_point || this.cooperate != bgm.cooperate || this.fav != bgm.fav || this.startTime != bgm.startTime || this.mBgmType != bgm.mBgmType || this.mIsSelected != bgm.mIsSelected || this.mIsPlayed != bgm.mIsPlayed || this.index != bgm.index || !C6632e.a(this.name, bgm.name) || !C6632e.a(this.musicians, bgm.musicians) || !C6632e.a(this.cover, bgm.cover) || !C6632e.a(this.playurl, bgm.playurl) || !Arrays.equals(this.tags, bgm.tags) || !Arrays.equals(this.colors, bgm.colors) || !Arrays.equals(this.fontColors, bgm.fontColors) || !C6632e.a(this.cooperate_url, bgm.cooperate_url)) {
            z6 = false;
        }
        return z6;
    }

    public int getBgmType() {
        return this.mBgmType;
    }

    public long getStartTime() {
        if (this.startTime == -1) {
            this.startTime = this.recommend_point;
        }
        return this.startTime;
    }

    public boolean isPlayed() {
        return this.mIsPlayed;
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public void restore(Bgm bgm) {
        this.id = bgm.id;
        this.sid = bgm.sid;
        this.tid = bgm.tid;
        this.mid = bgm.mid;
        this.name = bgm.name;
        this.category = bgm.category;
        this.musicians = bgm.musicians;
        this.cover = bgm.cover;
        this.playurl = bgm.playurl;
        this.state = bgm.state;
        this.duration = bgm.duration;
        this.filesize = bgm.filesize;
        this.ctime = bgm.ctime;
        this.pubtime = bgm.pubtime;
        this.tags = bgm.tags;
        this.colors = bgm.colors;
        this.fontColors = bgm.fontColors;
        this.timeline = bgm.timeline;
        this.recommend_point = bgm.recommend_point;
        this.cooperate = bgm.cooperate;
        this.cooperate_url = bgm.cooperate_url;
        this.fav = bgm.fav;
        this.startTime = bgm.startTime;
        this.musicMarker = bgm.musicMarker;
    }

    public void setBgmType(int i7) {
        this.mBgmType = i7;
    }

    public void setPlayed(boolean z6) {
        this.mIsPlayed = z6;
    }

    public void setSelected(boolean z6) {
        if (!z6) {
            this.startTime = this.recommend_point;
            this.mIsPlayed = false;
        }
        this.mIsSelected = z6;
    }

    public void setStartTime(long j7) {
        this.startTime = j7;
    }

    public void setStuckPoints(IntelligenceMusicInfo.MusicMarker musicMarker) {
        List<Long> list;
        if (musicMarker == null || (list = musicMarker.markers) == null || list.isEmpty()) {
            return;
        }
        this.musicMarker = musicMarker;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Bgm{id=");
        sb.append(this.id);
        sb.append(", sid=");
        sb.append(this.sid);
        sb.append(", tid=");
        sb.append(this.tid);
        sb.append(", mid=");
        sb.append(this.mid);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', duration=");
        sb.append(this.duration);
        sb.append(", fav=");
        return C3269h.a(sb, this.fav, '}');
    }

    public void transformationBgm(BgmMissionInfo bgmMissionInfo) {
        this.id = bgmMissionInfo.id;
        this.sid = bgmMissionInfo.sid;
        this.tid = bgmMissionInfo.tid;
        this.mid = bgmMissionInfo.mid;
        this.name = bgmMissionInfo.name;
        this.musicians = bgmMissionInfo.musicians;
        this.cover = bgmMissionInfo.cover;
        this.playurl = bgmMissionInfo.playurl;
        this.state = bgmMissionInfo.state;
        this.duration = bgmMissionInfo.duration;
        this.filesize = bgmMissionInfo.filesize;
        this.ctime = bgmMissionInfo.ctime;
        this.pubtime = bgmMissionInfo.pubtime;
        this.recommend_point = bgmMissionInfo.recommend_point;
        this.markerDownloadUrl = bgmMissionInfo.markPointDownloadUrl;
        this.category = bgmMissionInfo.category;
        com.bilibili.studio.videoeditor.extension.b.a(bgmMissionInfo, this);
    }

    public BgmMissionInfo transformationBgmMissionInfo(Bgm bgm) {
        BgmMissionInfo bgmMissionInfo = new BgmMissionInfo();
        bgmMissionInfo.id = bgm.id;
        bgmMissionInfo.sid = bgm.sid;
        bgmMissionInfo.tid = bgm.tid;
        bgmMissionInfo.mid = bgm.mid;
        bgmMissionInfo.name = bgm.name;
        bgmMissionInfo.musicians = bgm.musicians;
        bgmMissionInfo.cover = bgm.cover;
        bgmMissionInfo.playurl = bgm.playurl;
        bgmMissionInfo.state = bgm.state;
        bgmMissionInfo.duration = bgm.duration;
        bgmMissionInfo.filesize = bgm.filesize;
        bgmMissionInfo.ctime = bgm.ctime;
        bgmMissionInfo.pubtime = bgm.pubtime;
        bgmMissionInfo.recommend_point = bgm.recommend_point;
        bgmMissionInfo.markPointDownloadUrl = bgm.markerDownloadUrl;
        bgmMissionInfo.category = bgm.category;
        return bgmMissionInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.id);
        parcel.writeLong(this.sid);
        parcel.writeLong(this.tid);
        parcel.writeLong(this.mid);
        parcel.writeString(this.name);
        parcel.writeString(this.musicians);
        parcel.writeString(this.cover);
        parcel.writeString(this.playurl);
        parcel.writeInt(this.state);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.filesize);
        parcel.writeLong(this.ctime);
        parcel.writeLong(this.pubtime);
        parcel.writeStringArray(this.tags);
        parcel.writeStringArray(this.colors);
        parcel.writeStringArray(this.fontColors);
        parcel.writeTypedList(this.timeline);
        parcel.writeLong(this.recommend_point);
        parcel.writeLong(this.cooperate);
        parcel.writeString(this.cooperate_url);
        parcel.writeLong(this.startTime);
        parcel.writeInt(this.fav);
        parcel.writeString(this.category);
        parcel.writeInt(getBgmType());
    }
}
