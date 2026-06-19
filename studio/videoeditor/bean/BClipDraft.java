package com.bilibili.studio.videoeditor.bean;

import androidx.annotation.Keep;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BClipDraft.class */
@Keep
public class BClipDraft {
    private static final String TAG = "BClipDraft";
    private int mBackgroundMode;
    private int mBizFrom;
    private int mClipType;
    private long mCompoundAnimDuration;
    private long mCompoundAnimId;
    private String mCompoundAnimPackagePath;
    private String mCompoundAnimPackageUrl;
    private String mFilePath;
    private String mId;
    private long mInAnimDuration;
    private long mInAnimId;
    private String mInAnimPackagePath;
    private String mInAnimPackageUrl;
    private long mInPoint;
    private String mMaterialId;
    private int mMediaType;
    private BClipNativeAudio mNativeAudio;
    private long mOutAnimDuration;
    private long mOutAnimId;
    private String mOutAnimPackagePath;
    private String mOutAnimPackageUrl;
    private long mOutPoint;
    private float mPlayRate;
    private BClipReginInfo mRegionInfo;
    private int mRotation;
    private long mTrimIn;
    private long mTrimOut;
    private String mVoiceFx;

    public BClipDraft() {
        this.mBackgroundMode = 0;
        this.mInAnimId = -1L;
        this.mInAnimDuration = 0L;
        this.mOutAnimId = -1L;
        this.mOutAnimDuration = 0L;
        this.mCompoundAnimId = -1L;
        this.mCompoundAnimDuration = 0L;
        this.mClipType = 0;
    }

    public BClipDraft(BClip bClip) {
        this.mBackgroundMode = 0;
        this.mInAnimId = -1L;
        this.mInAnimDuration = 0L;
        this.mOutAnimId = -1L;
        this.mOutAnimDuration = 0L;
        this.mCompoundAnimId = -1L;
        this.mCompoundAnimDuration = 0L;
        this.mClipType = 0;
        if (bClip == null) {
            return;
        }
        this.mId = bClip.id;
        this.mFilePath = bClip.videoPath;
        this.mTrimIn = bClip.getTrimIn();
        this.mTrimOut = bClip.getTrimOut();
        this.mInPoint = bClip.getInPoint();
        this.mOutPoint = bClip.getOutPoint();
        this.mPlayRate = bClip.playRate;
        this.mRotation = bClip.getRotation();
        this.mBackgroundMode = bClip.getBackgroundMode();
        this.mInAnimId = bClip.getInAnimId();
        this.mInAnimDuration = bClip.getInAnimDuration();
        this.mInAnimPackagePath = bClip.getInAnimPackagePath();
        this.mInAnimPackageUrl = bClip.getInAnimPackageUrl();
        this.mOutAnimId = bClip.getOutAnimId();
        this.mOutAnimDuration = bClip.getOutAnimDuration();
        this.mOutAnimPackagePath = bClip.getOutAnimPackagePath();
        this.mOutAnimPackageUrl = bClip.getOutAnimPackageUrl();
        this.mCompoundAnimId = bClip.getCompoundAnimId();
        this.mCompoundAnimDuration = bClip.getCompoundAnimDuration();
        this.mCompoundAnimPackagePath = bClip.getCompoundAnimPackagePath();
        this.mCompoundAnimPackageUrl = bClip.getCompoundAnimPackageUrl();
        this.mMediaType = bClip.clipMediaType;
        this.mBizFrom = bClip.getBizFrom();
        this.mVoiceFx = bClip.voiceFx;
        this.mMaterialId = bClip.materialId;
        this.mRegionInfo = bClip.getReginInfo() == null ? null : bClip.getReginInfo().copy();
        this.mNativeAudio = bClip.getNativeAudio() == null ? null : bClip.getNativeAudio().copy();
        this.mClipType = bClip.getClipMaterialType();
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BClipDraft)) {
            return false;
        }
        BClipDraft bClipDraft = (BClipDraft) obj;
        if (this.mTrimIn != bClipDraft.mTrimIn || this.mTrimOut != bClipDraft.mTrimOut || this.mInPoint != bClipDraft.mInPoint || this.mOutPoint != bClipDraft.mOutPoint || Float.compare(bClipDraft.mPlayRate, this.mPlayRate) != 0 || this.mRotation != bClipDraft.mRotation || this.mMediaType != bClipDraft.mMediaType || this.mBizFrom != bClipDraft.mBizFrom || !Objects.equals(this.mId, bClipDraft.mId) || !Objects.equals(this.mMaterialId, bClipDraft.mMaterialId) || !Objects.equals(this.mFilePath, bClipDraft.mFilePath) || !Objects.equals(this.mVoiceFx, bClipDraft.mVoiceFx) || !Objects.equals(this.mRegionInfo, bClipDraft.getRegionInfo()) || !Objects.equals(this.mNativeAudio, bClipDraft.getNativeAudio()) || this.mClipType != bClipDraft.mClipType) {
            z6 = false;
        }
        return z6;
    }

    public int getBackgroundMode() {
        return this.mBackgroundMode;
    }

    public int getBizFrom() {
        return this.mBizFrom;
    }

    public int getClipType() {
        return this.mClipType;
    }

    public long getCompoundAnimDuration() {
        return this.mCompoundAnimDuration;
    }

    public long getCompoundAnimId() {
        return this.mCompoundAnimId;
    }

    public String getCompoundAnimPackagePath() {
        return this.mCompoundAnimPackagePath;
    }

    public String getCompoundAnimPackageUrl() {
        return this.mCompoundAnimPackageUrl;
    }

    public String getFilePath() {
        return this.mFilePath;
    }

    public String getId() {
        return this.mId;
    }

    public long getInAnimDuration() {
        return this.mInAnimDuration;
    }

    public long getInAnimId() {
        return this.mInAnimId;
    }

    public String getInAnimPackagePath() {
        return this.mInAnimPackagePath;
    }

    public String getInAnimPackageUrl() {
        return this.mInAnimPackageUrl;
    }

    public long getInPoint() {
        return this.mInPoint;
    }

    public String getMaterialId() {
        return this.mMaterialId;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public BClipNativeAudio getNativeAudio() {
        return this.mNativeAudio;
    }

    public long getOutAnimDuration() {
        return this.mOutAnimDuration;
    }

    public long getOutAnimId() {
        return this.mOutAnimId;
    }

    public String getOutAnimPackagePath() {
        return this.mOutAnimPackagePath;
    }

    public String getOutAnimPackageUrl() {
        return this.mOutAnimPackageUrl;
    }

    public long getOutPoint() {
        return this.mOutPoint;
    }

    public float getPlayRate() {
        return this.mPlayRate;
    }

    public BClipReginInfo getRegionInfo() {
        return this.mRegionInfo;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public long getTrimIn() {
        return this.mTrimIn;
    }

    public long getTrimOut() {
        return this.mTrimOut;
    }

    public String getVoiceFx() {
        return this.mVoiceFx;
    }

    public int hashCode() {
        return Objects.hash(this.mId, this.mMaterialId, this.mFilePath, Long.valueOf(this.mTrimIn), Long.valueOf(this.mTrimOut), Long.valueOf(this.mInPoint), Long.valueOf(this.mOutPoint), Float.valueOf(this.mPlayRate), Integer.valueOf(this.mRotation), Integer.valueOf(this.mMediaType), Integer.valueOf(this.mBizFrom), this.mVoiceFx, this.mRegionInfo, this.mNativeAudio, Integer.valueOf(this.mClipType));
    }

    public boolean isFakeClip() {
        boolean z6 = true;
        if (this.mClipType != 1) {
            z6 = false;
        }
        return z6;
    }

    public void setBackgroundMode(int i7) {
        this.mBackgroundMode = i7;
    }

    public void setBizFrom(int i7) {
        this.mBizFrom = i7;
    }

    public void setClipType(int i7) {
        this.mClipType = i7;
    }

    public void setCompoundAnimDuration(long j7) {
        this.mCompoundAnimDuration = j7;
    }

    public void setCompoundAnimId(long j7) {
        this.mCompoundAnimId = j7;
    }

    public void setCompoundAnimPackagePath(String str) {
        this.mCompoundAnimPackagePath = str;
    }

    public void setCompoundAnimPackageUrl(String str) {
        this.mCompoundAnimPackageUrl = str;
    }

    public void setFilePath(String str) {
        this.mFilePath = str;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setInAnimDuration(long j7) {
        this.mInAnimDuration = j7;
    }

    public void setInAnimId(long j7) {
        this.mInAnimId = j7;
    }

    public void setInAnimPackagePath(String str) {
        this.mInAnimPackagePath = str;
    }

    public void setInAnimPackageUrl(String str) {
        this.mInAnimPackageUrl = str;
    }

    public void setInPoint(long j7) {
        this.mInPoint = j7;
    }

    public void setMaterialId(String str) {
        this.mMaterialId = str;
    }

    public void setMediaType(int i7) {
        this.mMediaType = i7;
    }

    public void setNativeAudio(BClipNativeAudio bClipNativeAudio) {
        this.mNativeAudio = bClipNativeAudio;
    }

    public void setOutAnimDuration(long j7) {
        this.mOutAnimDuration = j7;
    }

    public void setOutAnimId(long j7) {
        this.mOutAnimId = j7;
    }

    public void setOutAnimPackagePath(String str) {
        this.mOutAnimPackagePath = str;
    }

    public void setOutAnimPackageUrl(String str) {
        this.mOutAnimPackageUrl = str;
    }

    public void setOutPoint(long j7) {
        this.mOutPoint = j7;
    }

    public void setPlayRate(float f7) {
        this.mPlayRate = f7;
    }

    public void setRegionInfo(BClipReginInfo bClipReginInfo) {
        this.mRegionInfo = bClipReginInfo;
    }

    public void setRotation(int i7) {
        this.mRotation = i7;
    }

    public void setTrimIn(long j7) {
        this.mTrimIn = j7;
    }

    public void setTrimOut(long j7) {
        this.mTrimOut = j7;
    }

    public void setVoiceFx(String str) {
        this.mVoiceFx = str;
    }
}
