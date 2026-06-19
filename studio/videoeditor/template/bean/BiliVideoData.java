package com.bilibili.studio.videoeditor.template.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.compose.runtime.C4277b;
import com.bilibili.app.authorspace.local.service.j;
import com.bilibili.studio.module.tuwen.model.BCutVideoDetectBean;
import com.bilibili.studio.module.tuwen.model.BcutCropParam;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliVideoData.class */
@Keep
public class BiliVideoData implements Serializable, Parcelable {
    public static final Parcelable.Creator<BiliVideoData> CREATOR = new Object();
    public String clipDescription;
    public String clipId;
    public int clipPos;
    public int clipType;
    public String correspondingId;
    public BcutCropParam cropParam;
    public String detectAvatarFilePath;
    public int detectMode;
    public long duration;
    public String filePath;
    public long footageDuration;
    public boolean imageOnly;
    public String mimeType;
    public boolean needImageMatting;
    public boolean needReverse;
    public String originFilePath;
    public int playStyleFrom;
    public String playStyleId;
    public String reversedFilePath;
    public double speed;
    public long trimIn;
    public long trimOut;
    public BCutVideoDetectBean videoDetectResult;
    public String videoId;

    @NonNull
    public BiliVideoTaskInfo videoTaskInfo;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliVideoData$a.class */
    public final class a implements Parcelable.Creator<BiliVideoData> {
        @Override // android.os.Parcelable.Creator
        public final BiliVideoData createFromParcel(Parcel parcel) {
            return new BiliVideoData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiliVideoData[] newArray(int i7) {
            return new BiliVideoData[i7];
        }
    }

    public BiliVideoData() {
        this("0", "", "", 0L, 0L, 1.0d, "video", 0L, 0L);
    }

    public BiliVideoData(Parcel parcel) {
        this.playStyleFrom = 0;
        this.playStyleId = "";
        this.detectMode = 0;
        this.detectAvatarFilePath = null;
        this.videoDetectResult = null;
        this.videoTaskInfo = new BiliVideoTaskInfo();
        this.videoId = parcel.readString();
        this.filePath = parcel.readString();
        this.originFilePath = parcel.readString();
        this.trimIn = parcel.readLong();
        this.trimOut = parcel.readLong();
        this.speed = parcel.readDouble();
        this.mimeType = parcel.readString();
        this.duration = parcel.readLong();
        this.reversedFilePath = parcel.readString();
        this.footageDuration = parcel.readLong();
        this.clipId = parcel.readString();
        this.clipPos = parcel.readInt();
        this.clipType = parcel.readInt();
        this.clipDescription = parcel.readString();
        this.imageOnly = parcel.readByte() != 0;
        this.needReverse = parcel.readByte() != 0;
        this.needImageMatting = parcel.readByte() != 0;
        this.correspondingId = parcel.readString();
        this.playStyleFrom = parcel.readInt();
        this.playStyleId = parcel.readString();
        this.detectMode = parcel.readInt();
        this.detectAvatarFilePath = parcel.readString();
        this.videoDetectResult = (BCutVideoDetectBean) parcel.readParcelable(BCutVideoDetectBean.class.getClassLoader());
        this.cropParam = (BcutCropParam) parcel.readParcelable(BCutVideoDetectBean.class.getClassLoader());
        this.videoTaskInfo = (BiliVideoTaskInfo) parcel.readParcelable(BiliVideoTaskInfo.class.getClassLoader());
    }

    public BiliVideoData(String str, String str2, String str3, long j7, long j8, double d7, String str4, long j9, long j10) {
        this(str, str2, str3, j7, j8, d7, str4, j9, "", j10, CaptureSchema.OLD_INVALID_ID_STRING, -1, 0, "", false, false, false, "", 0, "", 0, null, null);
    }

    public BiliVideoData(String str, String str2, String str3, long j7, long j8, double d7, String str4, long j9, String str5, long j10, String str6, int i7, int i8, String str7, boolean z6, boolean z7, boolean z8, String str8, int i9, String str9, int i10, String str10, BCutVideoDetectBean bCutVideoDetectBean) {
        this.playStyleFrom = 0;
        this.playStyleId = "";
        this.detectMode = 0;
        this.detectAvatarFilePath = null;
        this.videoDetectResult = null;
        this.videoTaskInfo = new BiliVideoTaskInfo();
        this.videoId = str;
        this.filePath = str2;
        this.originFilePath = str3;
        this.trimIn = j7;
        this.trimOut = j8;
        this.speed = d7;
        this.mimeType = str4;
        this.duration = j9;
        this.reversedFilePath = str5;
        this.footageDuration = j10;
        this.clipId = str6;
        this.clipPos = i7;
        this.clipType = i8;
        this.clipDescription = str7;
        this.imageOnly = z6;
        this.needReverse = z7;
        this.needImageMatting = z8;
        this.correspondingId = str8;
        this.playStyleFrom = i9;
        this.playStyleId = str9;
        this.detectMode = i10;
        this.detectAvatarFilePath = str10;
        this.videoDetectResult = bCutVideoDetectBean;
    }

    public BiliVideoData(String str, String str2, String str3, long j7, long j8, double d7, String str4, long j9, String str5, long j10, String str6, int i7, int i8, String str7, boolean z6, boolean z7, boolean z8, String str8, int i9, String str9, int i10, String str10, BCutVideoDetectBean bCutVideoDetectBean, BcutCropParam bcutCropParam) {
        this.playStyleFrom = 0;
        this.playStyleId = "";
        this.detectMode = 0;
        this.detectAvatarFilePath = null;
        this.videoDetectResult = null;
        this.videoTaskInfo = new BiliVideoTaskInfo();
        this.videoId = str;
        this.filePath = str2;
        this.originFilePath = str3;
        this.trimIn = j7;
        this.trimOut = j8;
        this.speed = d7;
        this.mimeType = str4;
        this.duration = j9;
        this.reversedFilePath = str5;
        this.footageDuration = j10;
        this.clipId = str6;
        this.clipPos = i7;
        this.clipType = i8;
        this.clipDescription = str7;
        this.imageOnly = z6;
        this.needReverse = z7;
        this.needImageMatting = z8;
        this.correspondingId = str8;
        this.playStyleFrom = i9;
        this.playStyleId = str9;
        this.detectMode = i10;
        this.detectAvatarFilePath = str10;
        this.videoDetectResult = bCutVideoDetectBean;
        this.cropParam = bcutCropParam;
    }

    public static BiliVideoData convert2BiliVideoData(long j7, String str, String str2, long j8, long j9, double d7, String str3, long j10, String str4, long j11, String str5, int i7, int i8, String str6, boolean z6, boolean z7, boolean z8, String str7, int i9) {
        return new BiliVideoData(j.a(j7, ""), str, str2, j8, j9, d7, str3, j10, str4, j11, str5, i7, i8, str6, z6, z7, z8, str7, 0, "", i9, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiliVideoData{videoId='");
        sb.append(this.videoId);
        sb.append("', filePath='");
        sb.append(this.filePath);
        sb.append("', originFilePath='");
        sb.append(this.originFilePath);
        sb.append("', trimIn=");
        sb.append(this.trimIn);
        sb.append(", trimOut=");
        sb.append(this.trimOut);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", mimeType='");
        sb.append(this.mimeType);
        sb.append("', duration=");
        sb.append(this.duration);
        sb.append(", reversedFilePath='");
        sb.append(this.reversedFilePath);
        sb.append("', footageDuration=");
        sb.append(this.footageDuration);
        sb.append(", clipId='");
        sb.append(this.clipId);
        sb.append("', clipPos=");
        sb.append(this.clipPos);
        sb.append(", clipType=");
        sb.append(this.clipType);
        sb.append(", clipDescription='");
        sb.append(this.clipDescription);
        sb.append("', imageOnly=");
        sb.append(this.imageOnly);
        sb.append(", needReverse=");
        sb.append(this.needReverse);
        sb.append(", needImageMatting=");
        sb.append(this.needImageMatting);
        sb.append(", correspondingId='");
        sb.append(this.correspondingId);
        sb.append("', playStyleFrom='");
        sb.append(this.playStyleFrom);
        sb.append("', playStyleId='");
        sb.append(this.playStyleId);
        sb.append("', detectMode='");
        return C4277b.a(this.detectMode, "'}", sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.videoId);
        parcel.writeString(this.filePath);
        parcel.writeString(this.originFilePath);
        parcel.writeLong(this.trimIn);
        parcel.writeLong(this.trimOut);
        parcel.writeDouble(this.speed);
        parcel.writeString(this.mimeType);
        parcel.writeLong(this.duration);
        parcel.writeString(this.reversedFilePath);
        parcel.writeLong(this.footageDuration);
        parcel.writeString(this.clipId);
        parcel.writeInt(this.clipPos);
        parcel.writeInt(this.clipType);
        parcel.writeString(this.clipDescription);
        parcel.writeByte(this.imageOnly ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needReverse ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needImageMatting ? (byte) 1 : (byte) 0);
        parcel.writeString(this.correspondingId);
        parcel.writeInt(this.playStyleFrom);
        parcel.writeString(this.playStyleId);
        parcel.writeInt(this.detectMode);
        parcel.writeString(this.detectAvatarFilePath);
        parcel.writeParcelable(this.videoDetectResult, i7);
        parcel.writeParcelable(this.cropParam, i7);
        parcel.writeParcelable(this.videoTaskInfo, i7);
    }
}
