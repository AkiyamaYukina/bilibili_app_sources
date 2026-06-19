package com.bilibili.studio.videoeditor.bean;

import Di0.C1600d;
import P50.s;
import R50.y;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.compose.runtime.C4277b;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.kaleidoscope.sdk.VideoClip;
import com.bilibili.studio.videoeditor.ms.animation.bean.VideoClipAnimation;
import com.bilibili.studio.videoeditor.ms.animation.bean.VideoClipAnimationInfo;
import com.bilibili.studio.videoeditor.nvsstreaming.EditClip;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BClip.class */
@Keep
public class BClip extends EditClip implements Cloneable, Serializable {
    public static final int CLIP_TYPE_FAKE = 1;
    public static final int CLIP_TYPE_LOST = 3;
    public static final int CLIP_TYPE_NORMAL = 0;
    public static final int CLIP_TYPE_TEMPLATE = 2;
    public String asrCacheKey;
    public BVideo bVideo;
    private int backgroundMode;
    private int blendingMode;
    private int clipMaterialType;
    public int clipMediaType;
    private float clipVolume;
    private long compoundAnimDuration;
    private long compoundAnimId;
    private String compoundAnimPackagePath;
    private String compoundAnimPackageUrl;
    public String id;
    private long inAnimDuration;
    private long inAnimId;
    private String inAnimPackagePath;
    private String inAnimPackageUrl;
    public long inPointDef;
    private int mBizFrom;
    private boolean mIsCuted;
    private int mRoleInTheme;
    public String materialId;
    private BClipNativeAudio nativeAudio;
    private boolean needUpdateAnimData;
    public long offsetDef;
    private long outAnimDuration;
    private long outAnimId;
    private String outAnimPackagePath;
    private String outAnimPackageUrl;
    public long outPointDef;
    public float playRate;
    private BClipReginInfo reginInfo;
    private int rotation;
    public String videoPath;
    public String voiceFx;

    public BClip() {
        this.id = UUID.randomUUID().toString();
        this.playRate = 1.0f;
        this.rotation = 0;
        this.backgroundMode = 0;
        this.inAnimId = -1L;
        this.inAnimDuration = 0L;
        this.outAnimId = -1L;
        this.outAnimDuration = 0L;
        this.compoundAnimId = -1L;
        this.compoundAnimDuration = 0L;
        this.needUpdateAnimData = false;
        this.clipMediaType = 1;
        this.mBizFrom = 0;
        this.clipVolume = 1.0f;
        this.clipMaterialType = 0;
        this.blendingMode = 0;
    }

    public BClip(s sVar) {
        super(sVar);
        this.id = UUID.randomUUID().toString();
        this.playRate = 1.0f;
        this.rotation = 0;
        this.backgroundMode = 0;
        this.inAnimId = -1L;
        this.inAnimDuration = 0L;
        this.outAnimId = -1L;
        this.outAnimDuration = 0L;
        this.compoundAnimId = -1L;
        this.compoundAnimDuration = 0L;
        this.needUpdateAnimData = false;
        this.clipMediaType = 1;
        this.mBizFrom = 0;
        this.clipVolume = 1.0f;
        this.clipMaterialType = 0;
        this.blendingMode = 0;
        this.playRate = Double.valueOf(((y) sVar).b.getSpeed()).floatValue();
    }

    @JSONField(serialize = false)
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BClip m10399clone() {
        try {
            BClip bClip = (BClip) super.clone();
            BClipReginInfo bClipReginInfo = this.reginInfo;
            if (bClipReginInfo != null) {
                bClip.setReginInfo(bClipReginInfo.copy());
            }
            BClipNativeAudio bClipNativeAudio = this.nativeAudio;
            if (bClipNativeAudio != null) {
                bClip.setNativeAudio(bClipNativeAudio.copy());
            }
            return bClip;
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    @JSONField(serialize = false)
    public BClip cloneNewId() {
        BClip bClipM10399clone = m10399clone();
        if (bClipM10399clone != null) {
            bClipM10399clone.id = UUID.randomUUID().toString();
        }
        return bClipM10399clone;
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BClip)) {
            return false;
        }
        BClip bClip = (BClip) obj;
        if (Float.compare(bClip.playRate, this.playRate) != 0 || this.rotation != bClip.rotation || this.backgroundMode != bClip.backgroundMode || this.inAnimId != bClip.inAnimId || this.inAnimDuration != bClip.inAnimDuration || !Objects.equals(this.inAnimPackagePath, bClip.inAnimPackagePath) || !Objects.equals(this.inAnimPackageUrl, bClip.inAnimPackageUrl) || this.outAnimId != bClip.outAnimId || this.outAnimDuration != bClip.outAnimDuration || !Objects.equals(this.outAnimPackagePath, bClip.outAnimPackagePath) || !Objects.equals(this.outAnimPackageUrl, bClip.outAnimPackageUrl) || this.compoundAnimId != bClip.compoundAnimId || this.compoundAnimDuration != bClip.compoundAnimDuration || !Objects.equals(this.compoundAnimPackagePath, bClip.compoundAnimPackagePath) || !Objects.equals(this.compoundAnimPackageUrl, bClip.compoundAnimPackageUrl) || this.clipMediaType != bClip.clipMediaType || this.mBizFrom != bClip.mBizFrom || this.mIsCuted != bClip.mIsCuted || !Objects.equals(this.reginInfo, bClip.reginInfo) || !Objects.equals(this.nativeAudio, bClip.nativeAudio) || this.mRoleInTheme != bClip.mRoleInTheme || this.inPointDef != bClip.inPointDef || this.outPointDef != bClip.outPointDef || this.offsetDef != bClip.offsetDef || this.clipVolume != bClip.clipVolume || this.blendingMode != bClip.blendingMode || !Objects.equals(this.id, bClip.id) || !Objects.equals(this.materialId, bClip.materialId) || !Objects.equals(this.videoPath, bClip.videoPath) || !Objects.equals(this.bVideo, bClip.bVideo) || !Objects.equals(this.voiceFx, bClip.voiceFx)) {
            z6 = false;
        }
        return z6;
    }

    public String getAsrCacheKey() {
        return this.asrCacheKey;
    }

    public int getBackgroundMode() {
        return this.backgroundMode;
    }

    public int getBizFrom() {
        return this.mBizFrom;
    }

    public int getBlendingMode() {
        return this.blendingMode;
    }

    public int getClipMaterialType() {
        return this.clipMaterialType;
    }

    public float getClipVolume() {
        return this.clipVolume;
    }

    public long getCompoundAnimDuration() {
        return this.compoundAnimDuration;
    }

    public long getCompoundAnimId() {
        return this.compoundAnimId;
    }

    public String getCompoundAnimPackagePath() {
        return this.compoundAnimPackagePath;
    }

    public String getCompoundAnimPackageUrl() {
        return this.compoundAnimPackageUrl;
    }

    @JSONField(serialize = false)
    public long getDuration(boolean z6) {
        long trimOut = getTrimOut() - getTrimIn();
        long j7 = trimOut;
        if (z6) {
            j7 = (long) ((trimOut * 1.0f) / this.playRate);
        }
        return j7;
    }

    public long getInAnimDuration() {
        return this.inAnimDuration;
    }

    public long getInAnimId() {
        return this.inAnimId;
    }

    public String getInAnimPackagePath() {
        return this.inAnimPackagePath;
    }

    public String getInAnimPackageUrl() {
        return this.inAnimPackageUrl;
    }

    public BClipNativeAudio getNativeAudio() {
        return this.nativeAudio;
    }

    public long getOutAnimDuration() {
        return this.outAnimDuration;
    }

    public long getOutAnimId() {
        return this.outAnimId;
    }

    public String getOutAnimPackagePath() {
        return this.outAnimPackagePath;
    }

    public String getOutAnimPackageUrl() {
        return this.outAnimPackageUrl;
    }

    public BClipReginInfo getReginInfo() {
        return this.reginInfo;
    }

    public int getRoleInTheme() {
        return this.mRoleInTheme;
    }

    public int getRotation() {
        return this.rotation;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.materialId, this.videoPath, Float.valueOf(this.playRate), Integer.valueOf(this.rotation), Integer.valueOf(this.backgroundMode), Long.valueOf(this.inAnimId), Long.valueOf(this.inAnimDuration), this.inAnimPackagePath, this.inAnimPackageUrl, Long.valueOf(this.outAnimId), Long.valueOf(this.outAnimDuration), this.outAnimPackagePath, this.outAnimPackageUrl, Long.valueOf(this.compoundAnimId), Long.valueOf(this.compoundAnimDuration), this.compoundAnimPackagePath, this.compoundAnimPackageUrl, Integer.valueOf(this.clipMediaType), Integer.valueOf(this.mBizFrom), Boolean.valueOf(this.mIsCuted), this.reginInfo, this.nativeAudio, this.bVideo, Integer.valueOf(this.mRoleInTheme), this.voiceFx, Long.valueOf(this.inPointDef), Long.valueOf(this.outPointDef), Long.valueOf(this.offsetDef), Float.valueOf(this.clipVolume), Integer.valueOf(this.blendingMode));
    }

    @JSONField(serialize = false)
    public boolean isAnimAvailable() {
        return isInAnimAvailable() || isOutAnimAvailable() || isCompoundAnimAvailable();
    }

    @JSONField(serialize = false)
    public boolean isCompoundAnimAvailable() {
        return this.compoundAnimId > 0 && !TextUtils.isEmpty(this.compoundAnimPackagePath);
    }

    @JSONField(serialize = false)
    public boolean isFakeClip() {
        boolean z6 = true;
        if (this.clipMaterialType != 1) {
            z6 = false;
        }
        return z6;
    }

    @JSONField(serialize = false)
    public boolean isInAnimAvailable() {
        return this.inAnimId > 0 && !TextUtils.isEmpty(this.inAnimPackagePath);
    }

    @JSONField(serialize = false)
    public boolean isMaterialReplaceClip() {
        return this.clipMaterialType == 3;
    }

    public boolean isNeedUpdateAnimData() {
        return this.needUpdateAnimData;
    }

    @JSONField(serialize = false)
    public boolean isNormalClip() {
        return this.clipMaterialType == 0;
    }

    @JSONField(serialize = false)
    public boolean isOutAnimAvailable() {
        return this.outAnimId > 0 && !TextUtils.isEmpty(this.outAnimPackagePath);
    }

    @JSONField(serialize = false)
    public boolean isTemplateClip() {
        return this.clipMaterialType == 2;
    }

    @JSONField(serialize = false)
    public boolean isVideo() {
        boolean z6 = true;
        if (this.clipMediaType != 1) {
            z6 = false;
        }
        return z6;
    }

    public boolean ismIsCuted() {
        return this.mIsCuted;
    }

    @JSONField(serialize = false)
    public long reset(long j7) {
        long j8 = this.clipMediaType == 1 ? this.bVideo.duration : 3000000L;
        setTrimIn(0L);
        setTrimOut(j8);
        setInPoint(j7);
        setOutPoint(getTrimOut() + j7);
        this.playRate = 0.0f;
        return getOutPoint();
    }

    public void resetAnimation() {
        resetInAnimation();
        resetOutAnimation();
        resetCompoundAnimation();
    }

    public void resetCompoundAnimation() {
        this.compoundAnimId = -1L;
        this.compoundAnimDuration = 0L;
        this.compoundAnimPackagePath = "";
        this.compoundAnimPackageUrl = "";
    }

    public void resetInAnimation() {
        this.inAnimId = -1L;
        this.inAnimDuration = 0L;
        this.inAnimPackagePath = "";
        this.inAnimPackageUrl = "";
    }

    public void resetOutAnimation() {
        this.outAnimId = -1L;
        this.outAnimDuration = 0L;
        this.outAnimPackagePath = "";
        this.outAnimPackageUrl = "";
    }

    @JSONField(serialize = false)
    public void rhythmImage(long j7, long j8) {
        setTrimIn(0L);
        setTrimOut(j7);
        setInPoint(j8);
        setOutPoint(j8 + j7);
    }

    public void setAsrCacheKey(String str) {
        this.asrCacheKey = str;
    }

    public void setBackgroundMode(int i7) {
        this.backgroundMode = i7;
    }

    public void setBackgroundMode(boolean z6) {
        if (z6) {
            setBackgroundMode(1);
        } else {
            setBackgroundMode(0);
        }
    }

    @JSONField(serialize = false)
    public void setBizFrom(int i7) {
        this.mBizFrom = i7;
    }

    public void setBlendingMode(int i7) {
        this.blendingMode = i7;
    }

    public void setClipMaterialType(int i7) {
        this.clipMaterialType = i7;
    }

    public void setClipVolume(float f7) {
        this.clipVolume = f7;
    }

    public void setCompoundAnimDuration(long j7) {
        this.compoundAnimDuration = j7;
    }

    public void setCompoundAnimId(long j7) {
        this.compoundAnimId = j7;
    }

    public void setCompoundAnimPackagePath(String str) {
        this.compoundAnimPackagePath = str;
    }

    public void setCompoundAnimPackageUrl(String str) {
        this.compoundAnimPackageUrl = str;
    }

    public void setInAnimDuration(long j7) {
        this.inAnimDuration = j7;
    }

    public void setInAnimId(long j7) {
        this.inAnimId = j7;
    }

    public void setInAnimPackagePath(String str) {
        this.inAnimPackagePath = str;
    }

    public void setInAnimPackageUrl(String str) {
        this.inAnimPackageUrl = str;
    }

    public void setNativeAudio(BClipNativeAudio bClipNativeAudio) {
        this.nativeAudio = bClipNativeAudio;
    }

    public void setNeedUpdateAnimData(boolean z6) {
        this.needUpdateAnimData = z6;
    }

    public void setOutAnimDuration(long j7) {
        this.outAnimDuration = j7;
    }

    public void setOutAnimId(long j7) {
        this.outAnimId = j7;
    }

    public void setOutAnimPackagePath(String str) {
        this.outAnimPackagePath = str;
    }

    public void setOutAnimPackageUrl(String str) {
        this.outAnimPackageUrl = str;
    }

    public void setReginInfo(BClipReginInfo bClipReginInfo) {
        this.reginInfo = bClipReginInfo;
    }

    public void setRotation(int i7) {
        this.rotation = i7;
    }

    @JSONField(serialize = false)
    public void setmIsCuted(boolean z6) {
        this.mIsCuted = z6;
    }

    @JSONField(serialize = false)
    public String toSimpleString() {
        StringBuilder sb = new StringBuilder("BClip{id='");
        sb.append(this.id);
        sb.append("', videoPath='");
        sb.append(this.videoPath);
        sb.append("', inPoint=");
        sb.append(getInPoint());
        sb.append(", outPoint=");
        sb.append(getOutPoint());
        sb.append(", trimIn=");
        sb.append(getTrimIn());
        sb.append(", trimOut=");
        sb.append(getTrimOut());
        sb.append(", playRate=");
        return C1600d.a(sb, this.playRate, '}');
    }

    @JSONField(serialize = false)
    public String toString() {
        StringBuilder sb = new StringBuilder("BClip{id='");
        sb.append(this.id);
        sb.append("', videoPath='");
        sb.append(this.videoPath);
        sb.append("', inPoint=");
        sb.append(getInPoint());
        sb.append(", outPoint=");
        sb.append(getOutPoint());
        sb.append(", trimIn=");
        sb.append(getTrimIn());
        sb.append(", trimOut=");
        sb.append(getTrimOut());
        sb.append(", playRate=");
        sb.append(this.playRate);
        sb.append(", rotation=");
        sb.append(this.rotation);
        sb.append(", backgroundMode=");
        sb.append(this.backgroundMode);
        sb.append(", inAnimId=");
        sb.append(this.inAnimId);
        sb.append(", inAnimDuration=");
        sb.append(this.inAnimDuration);
        sb.append(", inAnimPackagePath='");
        sb.append(this.inAnimPackagePath);
        sb.append("', inAnimPackageUrl='");
        sb.append(this.inAnimPackageUrl);
        sb.append("', outAnimId=");
        sb.append(this.outAnimId);
        sb.append(", outAnimDuration=");
        sb.append(this.outAnimDuration);
        sb.append(", outAnimPackagePath='");
        sb.append(this.outAnimPackagePath);
        sb.append("', outAnimPackageUrl='");
        sb.append(this.outAnimPackageUrl);
        sb.append("', compoundAnimId=");
        sb.append(this.compoundAnimId);
        sb.append(", compoundAnimDuration=");
        sb.append(this.compoundAnimDuration);
        sb.append(", compoundAnimPackagePath='");
        sb.append(this.compoundAnimPackagePath);
        sb.append("', compoundAnimPackageUrl='");
        sb.append(this.compoundAnimPackageUrl);
        sb.append("', needUpdateAnimData='");
        sb.append(this.needUpdateAnimData);
        sb.append("', clipMediaType=");
        sb.append(this.clipMediaType);
        sb.append(", mBizFrom=");
        sb.append(this.mBizFrom);
        sb.append(", mIsCuted=");
        sb.append(this.mIsCuted);
        sb.append(", bVideo=");
        sb.append(this.bVideo);
        sb.append(", mRoleInTheme=");
        sb.append(this.mRoleInTheme);
        sb.append(", voiceFx='");
        sb.append(this.voiceFx);
        sb.append("', blendingMode='");
        return C4277b.a(this.blendingMode, "'}", sb);
    }

    @JSONField(serialize = false)
    public void update(@Nullable s sVar) {
        if (sVar == null) {
            return;
        }
        VideoClip videoClip = ((y) sVar).b;
        setInPoint(videoClip.getInPoint());
        setOutPoint(videoClip.getOutPoint());
        setTrimIn(videoClip.getTrimIn());
        setTrimOut(videoClip.getTrimOut());
        this.playRate = Double.valueOf(videoClip.getSpeed()).floatValue();
    }

    public void updateAnimInfo(BClipDraft bClipDraft) {
        if (bClipDraft == null) {
            return;
        }
        setInAnimId(bClipDraft.getInAnimId());
        setInAnimDuration(bClipDraft.getInAnimDuration());
        setInAnimPackagePath(bClipDraft.getInAnimPackagePath());
        setInAnimPackageUrl(bClipDraft.getInAnimPackageUrl());
        setOutAnimId(bClipDraft.getOutAnimId());
        setOutAnimDuration(bClipDraft.getOutAnimDuration());
        setOutAnimPackagePath(bClipDraft.getOutAnimPackagePath());
        setOutAnimPackageUrl(bClipDraft.getOutAnimPackageUrl());
        setCompoundAnimId(bClipDraft.getCompoundAnimId());
        setCompoundAnimDuration(bClipDraft.getCompoundAnimDuration());
        setCompoundAnimPackagePath(bClipDraft.getCompoundAnimPackagePath());
        setCompoundAnimPackageUrl(bClipDraft.getCompoundAnimPackageUrl());
    }

    public void updateAnimInfo(VideoClipAnimation videoClipAnimation) {
        if (videoClipAnimation == null) {
            return;
        }
        VideoClipAnimationInfo videoClipAnimationInfo = videoClipAnimation.inAnim;
        if (videoClipAnimationInfo != null) {
            setInAnimId(videoClipAnimationInfo.id);
            setInAnimDuration(videoClipAnimation.inAnim.duration);
            setInAnimPackagePath(videoClipAnimation.inAnim.packagePath);
            setInAnimPackageUrl(videoClipAnimation.inAnim.packageUrl);
        }
        VideoClipAnimationInfo videoClipAnimationInfo2 = videoClipAnimation.outAnim;
        if (videoClipAnimationInfo2 != null) {
            setOutAnimId(videoClipAnimationInfo2.id);
            setOutAnimDuration(videoClipAnimation.outAnim.duration);
            setOutAnimPackagePath(videoClipAnimation.outAnim.packagePath);
            setOutAnimPackageUrl(videoClipAnimation.outAnim.packageUrl);
        }
        VideoClipAnimationInfo videoClipAnimationInfo3 = videoClipAnimation.compoundAnim;
        if (videoClipAnimationInfo3 != null) {
            setCompoundAnimId(videoClipAnimationInfo3.id);
            setCompoundAnimDuration(videoClipAnimation.compoundAnim.duration);
            setCompoundAnimPackagePath(videoClipAnimation.compoundAnim.packagePath);
            setCompoundAnimPackageUrl(videoClipAnimation.compoundAnim.packageUrl);
        }
    }
}
