package com.bilibili.studio.template.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/VideoTemplateMusicBean.class */
@Keep
public class VideoTemplateMusicBean implements Serializable, Parcelable {
    public static final Parcelable.Creator<VideoTemplateMusicBean> CREATOR = new Object();
    public int downloadStatus;
    public String downloadUrl;

    @JSONField(name = "end_time")
    public float endTime;

    @JSONField(name = "fade_in")
    public float fadeIn;

    @JSONField(name = "fade_out")
    public float fadeOut;
    public String localPath;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "sid")
    public String sid;

    @JSONField(name = "start_time")
    public float startTime;

    @JSONField(name = "video")
    public String videoUrl;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/VideoTemplateMusicBean$a.class */
    public final class a implements Parcelable.Creator<VideoTemplateMusicBean> {
        @Override // android.os.Parcelable.Creator
        public final VideoTemplateMusicBean createFromParcel(Parcel parcel) {
            return new VideoTemplateMusicBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTemplateMusicBean[] newArray(int i7) {
            return new VideoTemplateMusicBean[i7];
        }
    }

    public VideoTemplateMusicBean() {
    }

    public VideoTemplateMusicBean(Parcel parcel) {
        this.videoUrl = parcel.readString();
        this.sid = parcel.readString();
        this.name = parcel.readString();
        this.startTime = parcel.readFloat();
        this.endTime = parcel.readFloat();
        this.fadeIn = parcel.readFloat();
        this.fadeOut = parcel.readFloat();
        this.downloadUrl = parcel.readString();
        this.downloadStatus = parcel.readInt();
        this.localPath = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.videoUrl = parcel.readString();
        this.sid = parcel.readString();
        this.name = parcel.readString();
        this.startTime = parcel.readFloat();
        this.endTime = parcel.readFloat();
        this.fadeIn = parcel.readFloat();
        this.fadeOut = parcel.readFloat();
        this.downloadUrl = parcel.readString();
        this.downloadStatus = parcel.readInt();
        this.localPath = parcel.readString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoTemplateMusicBean{videoUrl='");
        sb.append(this.videoUrl);
        sb.append("', sid=");
        sb.append(this.sid);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", fadeIn=");
        sb.append(this.fadeIn);
        sb.append(", fadeOut=");
        sb.append(this.fadeOut);
        sb.append(", downloadUrl='");
        sb.append(this.downloadUrl);
        sb.append("', downloadStatus=");
        sb.append(this.downloadStatus);
        sb.append(", localPath='");
        return C8770a.a(sb, this.localPath, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.videoUrl);
        parcel.writeString(this.sid);
        parcel.writeString(this.name);
        parcel.writeFloat(this.startTime);
        parcel.writeFloat(this.endTime);
        parcel.writeFloat(this.fadeIn);
        parcel.writeFloat(this.fadeOut);
        parcel.writeString(this.downloadUrl);
        parcel.writeInt(this.downloadStatus);
        parcel.writeString(this.localPath);
    }
}
