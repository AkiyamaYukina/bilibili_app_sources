package com.bilibili.studio.template.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/VideoTemplateClip.class */
@Keep
public class VideoTemplateClip implements Serializable, Parcelable {
    public static final Parcelable.Creator<VideoTemplateClip> CREATOR = new Object();

    @JSONField(name = "clip_autoMatting")
    public int autoMatting;

    @JSONField(name = "can_replace")
    public boolean canReplace;

    @JSONField(name = "clip_description")
    public String clipDescription;

    @JSONField(name = "clip_duration")
    public long clipDuration;

    @JSONField(name = "clip_pos")
    public int clipPos;

    @JSONField(name = "clip_type")
    public int clipType;

    @JSONField(name = "clip_wink")
    public int clipWink;

    @JSONField(name = "corresponding_id")
    public String correspondingId;

    @JSONField(name = "detect_mode")
    public int detectMode;
    public String filePath;

    @JSONField(name = "id")
    public String id;

    @JSONField(name = "image_only")
    public int imageOnly;

    @JSONField(name = "need_rewinding")
    public int needReVerse;
    public String originalFilePath;

    @JSONField(name = "play_style_from")
    public int playStyleFrom;

    @Nullable
    @JSONField(name = "play_style_id")
    public String playStyleId;
    public double speed;
    public long trimIn;
    public long trimOut;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/VideoTemplateClip$a.class */
    public final class a implements Parcelable.Creator<VideoTemplateClip> {
        @Override // android.os.Parcelable.Creator
        public final VideoTemplateClip createFromParcel(Parcel parcel) {
            return new VideoTemplateClip(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTemplateClip[] newArray(int i7) {
            return new VideoTemplateClip[i7];
        }
    }

    public VideoTemplateClip() {
        this.speed = 1.0d;
        this.correspondingId = "";
        this.playStyleFrom = 0;
    }

    public VideoTemplateClip(Parcel parcel) {
        this.speed = 1.0d;
        this.correspondingId = "";
        this.playStyleFrom = 0;
        this.clipPos = parcel.readInt();
        this.clipDescription = parcel.readString();
        this.autoMatting = parcel.readInt();
        this.clipWink = parcel.readInt();
        this.clipType = parcel.readInt();
        this.clipDuration = parcel.readLong();
        this.imageOnly = parcel.readInt();
        this.needReVerse = parcel.readInt();
        this.id = parcel.readString();
        this.filePath = parcel.readString();
        this.originalFilePath = parcel.readString();
        this.trimIn = parcel.readLong();
        this.trimOut = parcel.readLong();
        this.speed = parcel.readDouble();
        this.correspondingId = parcel.readString();
        this.playStyleFrom = parcel.readInt();
        this.playStyleId = parcel.readString();
        this.detectMode = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.clipPos = parcel.readInt();
        this.clipDescription = parcel.readString();
        this.autoMatting = parcel.readInt();
        this.clipWink = parcel.readInt();
        this.clipType = parcel.readInt();
        this.clipDuration = parcel.readLong();
        this.imageOnly = parcel.readInt();
        this.needReVerse = parcel.readInt();
        this.id = parcel.readString();
        this.filePath = parcel.readString();
        this.originalFilePath = parcel.readString();
        this.trimIn = parcel.readLong();
        this.trimOut = parcel.readLong();
        this.speed = parcel.readDouble();
        this.correspondingId = parcel.readString();
        this.playStyleFrom = parcel.readInt();
        this.playStyleId = parcel.readString();
        this.detectMode = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.clipPos);
        parcel.writeString(this.clipDescription);
        parcel.writeInt(this.autoMatting);
        parcel.writeInt(this.clipWink);
        parcel.writeInt(this.clipType);
        parcel.writeLong(this.clipDuration);
        parcel.writeInt(this.imageOnly);
        parcel.writeInt(this.needReVerse);
        parcel.writeString(this.id);
        parcel.writeString(this.filePath);
        parcel.writeString(this.originalFilePath);
        parcel.writeLong(this.trimIn);
        parcel.writeLong(this.trimOut);
        parcel.writeDouble(this.speed);
        parcel.writeString(this.correspondingId);
        parcel.writeInt(this.playStyleFrom);
        parcel.writeString(this.playStyleId);
        parcel.writeInt(this.detectMode);
    }
}
