package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Objects;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditTtsInfo.class */
@Keep
public class EditTtsInfo implements Serializable, Cloneable {
    private long aiStoryTtsId;
    private long captionId;
    private long clipId;
    private long duration;
    private long inPoint;
    private long outPoint;
    private int speedRate = -1;
    private long trimIn;
    private long trimOut;
    private String ttsFilePath;
    private long ttsId;
    private String ttsName;
    private String ttsVoice;
    private String ttsVoiceEngine;
    private float ttsVolume;

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditTtsInfo m10448clone() throws CloneNotSupportedException {
        return (EditTtsInfo) super.clone();
    }

    public boolean equalsIgnoreId(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditTtsInfo)) {
            return false;
        }
        EditTtsInfo editTtsInfo = (EditTtsInfo) obj;
        if (!Objects.equals(this.ttsFilePath, editTtsInfo.ttsFilePath) || this.captionId != editTtsInfo.captionId || Float.compare(this.ttsVolume, editTtsInfo.ttsVolume) != 0 || this.inPoint != editTtsInfo.inPoint || this.outPoint != editTtsInfo.outPoint || this.trimIn != editTtsInfo.trimIn || this.trimOut != editTtsInfo.trimOut || this.duration != editTtsInfo.duration || this.ttsId != editTtsInfo.ttsId || this.speedRate != editTtsInfo.speedRate || !Objects.equals(this.ttsVoice, editTtsInfo.ttsVoice) || !Objects.equals(this.ttsName, editTtsInfo.ttsName) || !Objects.equals(this.ttsVoiceEngine, editTtsInfo.ttsVoiceEngine)) {
            z6 = false;
        }
        return z6;
    }

    public long getAiStoryTtsId() {
        return this.aiStoryTtsId;
    }

    public long getCaptionId() {
        return this.captionId;
    }

    public long getClipId() {
        return this.clipId;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getInPoint() {
        return this.inPoint;
    }

    public long getOutPoint() {
        return this.outPoint;
    }

    public int getSpeedRate() {
        return this.speedRate;
    }

    public long getTrimIn() {
        return this.trimIn;
    }

    public long getTrimOut() {
        return this.trimOut;
    }

    public String getTtsFilePath() {
        return this.ttsFilePath;
    }

    public long getTtsId() {
        return this.ttsId;
    }

    public String getTtsName() {
        return this.ttsName;
    }

    public String getTtsVoice() {
        return this.ttsVoice;
    }

    public String getTtsVoiceEngine() {
        return this.ttsVoiceEngine;
    }

    public float getTtsVolume() {
        return this.ttsVolume;
    }

    public void setAiStoryTtsId(long j7) {
        this.aiStoryTtsId = j7;
    }

    public void setCaptionId(long j7) {
        this.captionId = j7;
    }

    public void setClipId(long j7) {
        this.clipId = j7;
    }

    public void setDuration(long j7) {
        this.duration = j7;
    }

    public void setInPoint(long j7) {
        this.inPoint = j7;
    }

    public void setOutPoint(long j7) {
        this.outPoint = j7;
    }

    public void setSpeedRate(int i7) {
        this.speedRate = i7;
    }

    public void setTrimIn(long j7) {
        this.trimIn = j7;
    }

    public void setTrimOut(long j7) {
        this.trimOut = j7;
    }

    public void setTtsFilePath(String str) {
        this.ttsFilePath = str;
    }

    public void setTtsId(long j7) {
        this.ttsId = j7;
    }

    public void setTtsName(String str) {
        this.ttsName = str;
    }

    public void setTtsVoice(String str) {
        this.ttsVoice = str;
    }

    public void setTtsVoiceEngine(String str) {
        this.ttsVoiceEngine = str;
    }

    public void setTtsVolume(float f7) {
        this.ttsVolume = f7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EditTtsInfo{clipId=");
        sb.append(this.clipId);
        sb.append(", inPoint=");
        sb.append(this.inPoint);
        sb.append(", outPoint=");
        sb.append(this.outPoint);
        sb.append(", trimIn=");
        sb.append(this.trimIn);
        sb.append(", trimOut=");
        sb.append(this.trimOut);
        sb.append(", ttsId=");
        sb.append(this.ttsId);
        sb.append(", ttsVoice='");
        return C8770a.a(sb, this.ttsVoice, "'}");
    }
}
