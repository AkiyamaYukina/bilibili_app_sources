package com.bilibili.studio.editor.repository.data;

import Dp.b;
import P50.d;
import P50.g;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.editor.moudle.sticker.v1.EditFxSticker;
import com.bilibili.studio.videoeditor.editor.editdata.EditFxClip;
import com.bilibili.studio.videoeditor.editor.editdata.PointF;
import com.bilibili.studio.videoeditor.editor.editdata.Size;
import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/repository/data/BiliEditorStickerInfo.class */
@Keep
public final class BiliEditorStickerInfo extends EditFxClip implements Cloneable, Serializable {

    @NotNull
    public static final a Companion = new Object();
    public static final int STICKER_NORMAL = 0;

    @Nullable
    private Long bgmDuration;

    @JSONField(serialize = false)
    @Nullable
    private transient d bgmTrack;

    @Nullable
    private Long bgmTrimIn;

    @Nullable
    private Long bgmTrimOut;

    @Nullable
    private String clipId;

    @Nullable
    private String clipPath;

    @Nullable
    private String cover;

    @Nullable
    private EditCustomizeSticker editCustomizeSticker;

    @Nullable
    private EditFxSticker editFxSticker;

    @JSONField(serialize = false)
    @Nullable
    private transient g iFx;
    private boolean isRhythmConfig;
    private int materialType;

    @Nullable
    private Range range;
    private float rotationZ;
    private boolean selectedByUser;
    private int stickerType;
    private long trimInClip;

    @Nullable
    private Size videoSize;
    private float zValue;
    private long createTime = System.currentTimeMillis();
    private float scaleFactor = 1.0f;

    @NotNull
    private PointF translationPointF = new PointF();

    @NotNull
    private String stickerUUID = UUID.randomUUID().toString();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/repository/data/BiliEditorStickerInfo$Range.class */
    @Keep
    public static final class Range implements Serializable, Cloneable {
        private float bottom;
        private float left;
        private float right;
        private float top;

        public Range() {
        }

        public Range(float f7, float f8, float f9, float f10) {
            this.left = f7;
            this.top = f8;
            this.right = f9;
            this.bottom = f10;
        }

        @NotNull
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Range m10166clone() {
            Range range;
            try {
                range = (Range) super.clone();
            } catch (CloneNotSupportedException e7) {
                e7.printStackTrace();
                range = new Range(this.left, this.top, this.right, this.bottom);
            }
            return range;
        }

        public boolean equals(@Nullable Object obj) {
            boolean z6 = false;
            if (obj instanceof Range) {
                Range range = (Range) obj;
                z6 = false;
                if (this.left == range.left) {
                    z6 = false;
                    if (this.top == range.top) {
                        z6 = false;
                        if (this.right == range.right) {
                            z6 = false;
                            if (this.bottom == range.bottom) {
                                z6 = true;
                            }
                        }
                    }
                }
            }
            return z6;
        }

        public final float getBottom() {
            return this.bottom;
        }

        public final float getLeft() {
            return this.left;
        }

        public final float getRight() {
            return this.right;
        }

        public final float getTop() {
            return this.top;
        }

        public final void setBottom(float f7) {
            this.bottom = f7;
        }

        public final void setLeft(float f7) {
            this.left = f7;
        }

        public final void setRight(float f7) {
            this.right = f7;
        }

        public final void setTop(float f7) {
            this.top = f7;
        }

        @NotNull
        public String toString() {
            float f7 = this.left;
            float f8 = this.top;
            float f9 = this.right;
            float f10 = this.bottom;
            StringBuilder sbA = b.a("Range{left=", f7, ", top=", f8, ", right=");
            sbA.append(f9);
            sbA.append(", bottom=");
            sbA.append(f10);
            sbA.append(ReporterMap.RIGHT_BRACES);
            return sbA.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/repository/data/BiliEditorStickerInfo$a.class */
    public static final class a {
    }

    @Override // com.bilibili.studio.videoeditor.editor.editdata.EditFxClip
    @NotNull
    /* JADX INFO: renamed from: clone */
    public BiliEditorStickerInfo mo9886clone() {
        BiliEditorStickerInfo biliEditorStickerInfo = (BiliEditorStickerInfo) super.mo9886clone();
        biliEditorStickerInfo.iFx = this.iFx;
        PointF pointF = biliEditorStickerInfo.translationPointF;
        biliEditorStickerInfo.translationPointF = new PointF(pointF.f109462x, pointF.f109463y);
        return biliEditorStickerInfo;
    }

    public final boolean equalsIgnoreTime(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiliEditorStickerInfo)) {
            return false;
        }
        BiliEditorStickerInfo biliEditorStickerInfo = (BiliEditorStickerInfo) obj;
        return Intrinsics.areEqual(this.clipId, biliEditorStickerInfo.clipId) && Intrinsics.areEqual(this.clipPath, biliEditorStickerInfo.clipPath) && this.inPoint == biliEditorStickerInfo.inPoint && this.outPoint == biliEditorStickerInfo.outPoint && this.trimInClip == biliEditorStickerInfo.trimInClip && this.scaleFactor == biliEditorStickerInfo.scaleFactor && this.rotationZ == biliEditorStickerInfo.rotationZ && this.zValue == biliEditorStickerInfo.zValue && Intrinsics.areEqual(this.translationPointF, biliEditorStickerInfo.translationPointF) && Intrinsics.areEqual(this.range, biliEditorStickerInfo.range) && this.isRhythmConfig == biliEditorStickerInfo.isRhythmConfig && Intrinsics.areEqual(this.videoSize, biliEditorStickerInfo.videoSize) && this.stickerType == biliEditorStickerInfo.stickerType && Intrinsics.areEqual(this.editFxSticker, biliEditorStickerInfo.editFxSticker) && Intrinsics.areEqual(this.editCustomizeSticker, biliEditorStickerInfo.editCustomizeSticker) && this.materialType == biliEditorStickerInfo.materialType && this.selectedByUser == biliEditorStickerInfo.selectedByUser;
    }

    @Nullable
    public final Long getBgmDuration() {
        return this.bgmDuration;
    }

    @Nullable
    public final d getBgmTrack() {
        return this.bgmTrack;
    }

    @Nullable
    public final Long getBgmTrimIn() {
        return this.bgmTrimIn;
    }

    @Nullable
    public final Long getBgmTrimOut() {
        return this.bgmTrimOut;
    }

    @Nullable
    public final String getClipId() {
        return this.clipId;
    }

    @Nullable
    public final String getClipPath() {
        return this.clipPath;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getDuration() {
        return this.outPoint - this.inPoint;
    }

    @Nullable
    public final EditCustomizeSticker getEditCustomizeSticker() {
        return this.editCustomizeSticker;
    }

    @Nullable
    public final EditFxSticker getEditFxSticker() {
        return this.editFxSticker;
    }

    @Nullable
    public final g getIFx() {
        return this.iFx;
    }

    public final int getMaterialType() {
        return this.materialType;
    }

    @Nullable
    public final Range getRange() {
        return this.range;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final boolean getSelectedByUser() {
        return this.selectedByUser;
    }

    public final int getStickerType() {
        return this.stickerType;
    }

    @NotNull
    public final String getStickerUUID() {
        return this.stickerUUID;
    }

    @NotNull
    public final PointF getTranslationPointF() {
        return this.translationPointF;
    }

    public final long getTrimInClip() {
        return this.trimInClip;
    }

    @Nullable
    public final Size getVideoSize() {
        return this.videoSize;
    }

    public final float getZValue() {
        return this.zValue;
    }

    public final boolean isRhythmConfig() {
        return this.isRhythmConfig;
    }

    public final void setBgmDuration(@Nullable Long l7) {
        this.bgmDuration = l7;
    }

    public final void setBgmTrack(@Nullable d dVar) {
        this.bgmTrack = dVar;
    }

    public final void setBgmTrimIn(@Nullable Long l7) {
        this.bgmTrimIn = l7;
    }

    public final void setBgmTrimOut(@Nullable Long l7) {
        this.bgmTrimOut = l7;
    }

    public final void setClipId(@Nullable String str) {
        this.clipId = str;
    }

    public final void setClipPath(@Nullable String str) {
        this.clipPath = str;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setCreateTime(long j7) {
        this.createTime = j7;
    }

    public final void setEditCustomizeSticker(@Nullable EditCustomizeSticker editCustomizeSticker) {
        this.editCustomizeSticker = editCustomizeSticker;
    }

    public final void setEditFxSticker(@Nullable EditFxSticker editFxSticker) {
        this.editFxSticker = editFxSticker;
    }

    public final void setIFx(@Nullable g gVar) {
        this.iFx = gVar;
    }

    public final void setMaterialType(int i7) {
        this.materialType = i7;
    }

    public final void setRange(@Nullable Range range) {
        this.range = range;
    }

    public final void setRhythmConfig(boolean z6) {
        this.isRhythmConfig = z6;
    }

    public final void setRotationZ(float f7) {
        this.rotationZ = f7;
    }

    public final void setScaleFactor(float f7) {
        this.scaleFactor = f7;
    }

    public final void setSelectedByUser(boolean z6) {
        this.selectedByUser = z6;
    }

    public final void setStickerType(int i7) {
        this.stickerType = i7;
    }

    public final void setStickerUUID(@NotNull String str) {
        this.stickerUUID = str;
    }

    public final void setTranslationPointF(@NotNull PointF pointF) {
        this.translationPointF = pointF;
    }

    public final void setTrimInClip(long j7) {
        this.trimInClip = j7;
    }

    public final void setVideoSize(@Nullable Size size) {
        this.videoSize = size;
    }

    public final void setZValue(float f7) {
        this.zValue = f7;
    }

    public final void updateTranslationPointF(float f7, float f8) {
        PointF pointF = this.translationPointF;
        pointF.f109462x = f7;
        pointF.f109463y = f8;
    }
}
