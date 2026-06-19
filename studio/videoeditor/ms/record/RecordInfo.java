package com.bilibili.studio.videoeditor.ms.record;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.nvsstreaming.AudioClipInfo;
import java.io.Serializable;
import java.util.Objects;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/record/RecordInfo.class */
@Keep
public class RecordInfo extends AudioClipInfo implements Serializable {
    public String asrCacheKey;
    public String bClipID;
    public long capTimeDuration;
    public long capTimeInVideo;
    String clipPath;
    long finalIN;
    long finalOut;
    public String fxId;
    public String fxName;
    long id;
    long lengthToClipLift;
    public double speed;
    int speedStateToCut = 0;
    public long standFinalIn;
    public long standFinalOut;
    public long standInPoint;
    public long standOutPoint;
    public String videoPath;
    public float volumn;

    public RecordInfo() {
    }

    public RecordInfo(long j7, String str, long j8, long j9, double d7) {
        this.id = j7;
        this.localPath = str;
        this.inPoint = j8;
        this.outPoint = j9;
        this.trimIn = 0L;
        this.trimOut = j9 - j8;
        this.speed = d7;
    }

    @Override // com.bilibili.studio.videoeditor.editor.editdata.EditFxClip
    /* JADX INFO: renamed from: clone */
    public RecordInfo mo9886clone() {
        RecordInfo recordInfo = new RecordInfo(getId(), getPath(), getInPoint(), getOutPoint(), getSpeed());
        recordInfo.setTrimIn(getTrimIn());
        recordInfo.setTrimOut(getTrimOut());
        recordInfo.setVolumn(getVolumn());
        recordInfo.setFxName(getFxName());
        recordInfo.setFinalIN(getFinalIN());
        recordInfo.setFinalOut(getFinalOut());
        recordInfo.setClipPath(getClipPath());
        recordInfo.setLengthToClipLift(getLengthToClipLift());
        recordInfo.setStandFinalIn(getStandFinalIn());
        recordInfo.setStandFinalOut(getStandFinalOut());
        recordInfo.setStandInPoint(getStandInPoint());
        recordInfo.setStandOutPoint(getStandOutPoint());
        recordInfo.setSpeedStateToCut(getSpeedStateToCut());
        recordInfo.videoPath = getVideoPath();
        recordInfo.setbClipID(getbClipID());
        recordInfo.setCapTimeDuration(getCapTimeDuration());
        recordInfo.setCapTimeInVideo(getCapTimeInVideo());
        recordInfo.trackLevelIndex = this.trackLevelIndex;
        recordInfo.fxId = this.fxId;
        recordInfo.asrCacheKey = this.asrCacheKey;
        return recordInfo;
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordInfo)) {
            return false;
        }
        RecordInfo recordInfo = (RecordInfo) obj;
        if (this.inPoint != recordInfo.inPoint || this.outPoint != recordInfo.outPoint || Float.compare(recordInfo.volumn, this.volumn) != 0 || Double.compare(recordInfo.speed, this.speed) != 0 || this.trimIn != recordInfo.trimIn || this.trimOut != recordInfo.trimOut || this.standFinalIn != recordInfo.standFinalIn || this.standFinalOut != recordInfo.standFinalOut || this.standInPoint != recordInfo.standInPoint || this.standOutPoint != recordInfo.standOutPoint || this.capTimeInVideo != recordInfo.capTimeInVideo || this.capTimeDuration != recordInfo.capTimeDuration || this.id != recordInfo.id || this.finalIN != recordInfo.finalIN || this.finalOut != recordInfo.finalOut || this.lengthToClipLift != recordInfo.lengthToClipLift || this.speedStateToCut != recordInfo.speedStateToCut || !Objects.equals(this.fxName, recordInfo.fxName) || !Objects.equals(this.bClipID, recordInfo.bClipID) || !Objects.equals(this.videoPath, recordInfo.videoPath) || !Objects.equals(this.localPath, recordInfo.localPath) || !Objects.equals(this.clipPath, recordInfo.clipPath) || this.trackLevelIndex != recordInfo.trackLevelIndex || !Objects.equals(this.fxId, recordInfo.fxId)) {
            z6 = false;
        }
        return z6;
    }

    public String getAsrCacheKey() {
        return this.asrCacheKey;
    }

    public long getCapTimeDuration() {
        return this.capTimeDuration;
    }

    public long getCapTimeInVideo() {
        return this.capTimeInVideo;
    }

    public String getClipPath() {
        return this.clipPath;
    }

    public long getFinalIN() {
        return this.finalIN;
    }

    public long getFinalOut() {
        return this.finalOut;
    }

    public String getFxId() {
        return this.fxId;
    }

    public String getFxName() {
        return this.fxName;
    }

    public long getId() {
        return this.id;
    }

    public long getInPoint() {
        return this.inPoint;
    }

    public long getLengthToClipLift() {
        return this.lengthToClipLift;
    }

    public long getOutPoint() {
        return this.outPoint;
    }

    public String getPath() {
        return this.localPath;
    }

    public double getSpeed() {
        return this.speed;
    }

    public int getSpeedStateToCut() {
        return this.speedStateToCut;
    }

    public long getStandFinalIn() {
        return this.standFinalIn;
    }

    public long getStandFinalOut() {
        return this.standFinalOut;
    }

    public long getStandInPoint() {
        return this.standInPoint;
    }

    public long getStandOutPoint() {
        return this.standOutPoint;
    }

    public long getTrimIn() {
        return this.trimIn;
    }

    public long getTrimOut() {
        return this.trimOut;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public float getVolumn() {
        return this.volumn;
    }

    public String getbClipID() {
        return this.bClipID;
    }

    public void setAsrCacheKey(String str) {
        this.asrCacheKey = str;
    }

    public void setCapTimeDuration(long j7) {
        this.capTimeDuration = j7;
    }

    public void setCapTimeInVideo(long j7) {
        this.capTimeInVideo = j7;
    }

    public void setClipPath(String str) {
        this.clipPath = str;
    }

    public void setFinalIN(long j7) {
        this.finalIN = j7;
    }

    public void setFinalOut(long j7) {
        this.finalOut = j7;
    }

    public void setFxId(String str) {
        this.fxId = str;
    }

    public void setFxName(String str) {
        this.fxName = str;
    }

    public void setId(long j7) {
        this.id = j7;
    }

    public void setInPoint(long j7) {
        this.inPoint = j7;
    }

    public void setLengthToClipLift(long j7) {
        this.lengthToClipLift = j7;
    }

    public void setOutPoint(long j7) {
        this.outPoint = j7;
    }

    public void setPath(String str) {
        this.localPath = str;
    }

    public void setSpeed(double d7) {
        this.speed = d7;
    }

    public void setSpeedStateToCut(int i7) {
        this.speedStateToCut = i7;
    }

    public void setStandFinalIn(long j7) {
        this.standFinalIn = j7;
    }

    public void setStandFinalOut(long j7) {
        this.standFinalOut = j7;
    }

    public void setStandInPoint(long j7) {
        this.standInPoint = j7;
    }

    public void setStandOutPoint(long j7) {
        this.standOutPoint = j7;
    }

    public void setTrimIn(long j7) {
        this.trimIn = j7;
    }

    public void setTrimOut(long j7) {
        this.trimOut = j7;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setVolumn(float f7) {
        this.volumn = f7;
    }

    public void setbClipID(String str) {
        this.bClipID = str;
    }

    @Override // com.bilibili.studio.videoeditor.editor.editdata.EditFxClip
    public String toString() {
        StringBuilder sb = new StringBuilder("RecordInfo{id=");
        sb.append(this.id);
        sb.append(", path='");
        sb.append(this.localPath);
        sb.append("', inPoint=");
        sb.append(this.inPoint);
        sb.append(", outPoint=");
        sb.append(this.outPoint);
        sb.append(", standInPoint='");
        sb.append(this.standInPoint);
        sb.append("', standOutPoint='");
        sb.append(this.standOutPoint);
        sb.append("', standFinalIn='");
        sb.append(this.standFinalIn);
        sb.append("', standFinalOut='");
        sb.append(this.standFinalOut);
        sb.append("', trimIn=");
        sb.append(this.trimIn);
        sb.append(", trimOut=");
        sb.append(this.trimOut);
        sb.append(", finalIN=");
        sb.append(this.finalIN);
        sb.append(", finalOut=");
        sb.append(this.finalOut);
        sb.append(", lengthToClipLift=");
        sb.append(this.lengthToClipLift);
        sb.append(", clipPath='");
        sb.append(this.clipPath);
        sb.append("', fxName='");
        sb.append(this.fxName);
        sb.append("', volumn=");
        sb.append(this.volumn);
        sb.append(", trackIndex=");
        sb.append(this.trackLevelIndex);
        sb.append(", fxId='");
        return C8770a.a(sb, this.fxId, "'}");
    }
}
