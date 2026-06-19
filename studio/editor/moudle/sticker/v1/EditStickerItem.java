package com.bilibili.studio.editor.moudle.sticker.v1;

import Di0.C1600d;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.studio.editor.moudle.sticker.v1.VideoFxStickerBean;
import com.bilibili.studio.videoeditor.editor.common.PreviewItem;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/EditStickerItem.class */
@Keep
public class EditStickerItem implements Comparable<EditStickerItem>, Cloneable {
    private long bgmDuration;
    private long inPoint;
    private int mDownloadStatus;
    private long mDuration;

    @Nullable
    private EditCustomizeSticker mEditCustomizeSticker;

    @Nullable
    private EditFxSticker mEditFxSticker;
    private int mFileStatus;
    private Float mNormalizeTranslationX;
    private Float mNormalizeTranslationY;
    private PreviewItem mPreviewItem;
    private int mPriority;
    private Float mScaleFactor;
    private int mStickerType;
    private float mZValue;
    private long outPoint;

    public EditStickerItem() {
        Float fValueOf = Float.valueOf(0.0f);
        this.mNormalizeTranslationX = fValueOf;
        this.mNormalizeTranslationY = fValueOf;
        this.mScaleFactor = Float.valueOf(1.0f);
        this.mPriority = 1;
        this.mDownloadStatus = 1;
        this.mPreviewItem = new PreviewItem();
    }

    public EditStickerItem(int i7) {
        Float fValueOf = Float.valueOf(0.0f);
        this.mNormalizeTranslationX = fValueOf;
        this.mNormalizeTranslationY = fValueOf;
        this.mScaleFactor = Float.valueOf(1.0f);
        this.mStickerType = i7;
        this.mPreviewItem = new PreviewItem(-1, (String) null);
    }

    public EditStickerItem(VideoFxStickerBean.FxDataBean fxDataBean) {
        Float fValueOf = Float.valueOf(0.0f);
        this.mNormalizeTranslationX = fValueOf;
        this.mNormalizeTranslationY = fValueOf;
        this.mScaleFactor = Float.valueOf(1.0f);
        this.mEditFxSticker = new EditFxSticker(fxDataBean);
        this.mPriority = fxDataBean.rank;
        this.mDownloadStatus = 1;
        this.mPreviewItem = new PreviewItem(1, fxDataBean.coverUrl);
        this.mFileStatus = 2;
        this.mStickerType = 1;
        long j7 = fxDataBean.durationMs;
        long j8 = j7 == 0 ? 3000000L : j7 * 1000;
        this.mDuration = j8;
        if (j8 > 0 && j8 < TransitionInfo.DEFAULT_DURATION) {
            this.mDuration = TransitionInfo.DEFAULT_DURATION;
        }
        VideoFxStickerBean.SoundInfo soundInfo = fxDataBean.soundInfo;
        if (soundInfo != null) {
            this.bgmDuration = soundInfo.duration;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditStickerItem m10140clone() {
        EditStickerItem editStickerItem = new EditStickerItem();
        EditFxSticker editFxSticker = this.mEditFxSticker;
        if (editFxSticker != null) {
            editStickerItem.mEditFxSticker = editFxSticker.m10139clone();
        } else {
            editStickerItem.mEditFxSticker = null;
        }
        PreviewItem previewItem = this.mPreviewItem;
        if (previewItem != null) {
            try {
                editStickerItem.mPreviewItem = previewItem.m10444clone();
            } catch (CloneNotSupportedException e7) {
                PreviewItem previewItem2 = new PreviewItem();
                editStickerItem.mPreviewItem = previewItem2;
                previewItem2.setResId(this.mPreviewItem.getResId());
                editStickerItem.mPreviewItem.setUrl(this.mPreviewItem.getUrl());
                editStickerItem.mPreviewItem.setSrc(this.mPreviewItem.getSrc());
            }
        } else {
            editStickerItem.mPreviewItem = null;
        }
        EditCustomizeSticker editCustomizeSticker = this.mEditCustomizeSticker;
        if (editCustomizeSticker != null) {
            editStickerItem.mEditCustomizeSticker = editCustomizeSticker.m10138clone();
        } else {
            editStickerItem.mEditCustomizeSticker = null;
        }
        editStickerItem.mDownloadStatus = this.mDownloadStatus;
        editStickerItem.mFileStatus = this.mFileStatus;
        editStickerItem.mPriority = this.mPriority;
        editStickerItem.mDuration = this.mDuration;
        editStickerItem.mStickerType = this.mStickerType;
        editStickerItem.bgmDuration = this.bgmDuration;
        editStickerItem.inPoint = this.inPoint;
        editStickerItem.outPoint = this.outPoint;
        editStickerItem.mZValue = this.mZValue;
        return editStickerItem;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull EditStickerItem editStickerItem) {
        return this.mPriority - editStickerItem.getPriority();
    }

    public long getBgmDuration() {
        return this.bgmDuration;
    }

    public int getDownloadStatus() {
        return this.mDownloadStatus;
    }

    public long getDuration() {
        return this.mDuration;
    }

    @Nullable
    public EditCustomizeSticker getEditCustomizeSticker() {
        return this.mEditCustomizeSticker;
    }

    @Nullable
    public EditFxSticker getEditFxSticker() {
        return this.mEditFxSticker;
    }

    public int getFileStatus() {
        return this.mFileStatus;
    }

    public long getInPoint() {
        return this.inPoint;
    }

    public Float getNormalizeTranslationX() {
        return this.mNormalizeTranslationX;
    }

    public Float getNormalizeTranslationY() {
        return this.mNormalizeTranslationY;
    }

    public long getOutPoint() {
        return this.outPoint;
    }

    public PreviewItem getPreviewItem() {
        return this.mPreviewItem;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public Float getScaleFactor() {
        return this.mScaleFactor;
    }

    public int getStickerType() {
        return this.mStickerType;
    }

    public float getZValue() {
        return this.mZValue;
    }

    public void setBgmDuration(long j7) {
        this.bgmDuration = j7;
    }

    public void setDownloadStatus(int i7) {
        this.mDownloadStatus = i7;
    }

    public void setDuration(long j7) {
        this.mDuration = j7;
    }

    public void setEditCustomizeSticker(EditCustomizeSticker editCustomizeSticker) {
        this.mEditCustomizeSticker = editCustomizeSticker;
    }

    public void setEditFxSticker(EditFxSticker editFxSticker) {
        this.mEditFxSticker = editFxSticker;
    }

    public void setFileStatus(int i7) {
        this.mFileStatus = i7;
    }

    public void setInPoint(long j7) {
        this.inPoint = j7;
    }

    public void setNormalizeTranslationX(Float f7) {
        this.mNormalizeTranslationX = f7;
    }

    public void setNormalizeTranslationY(Float f7) {
        this.mNormalizeTranslationY = f7;
    }

    public void setOutPoint(long j7) {
        this.outPoint = j7;
    }

    public void setPreviewItem(PreviewItem previewItem) {
        this.mPreviewItem = previewItem;
    }

    public void setPriority(int i7) {
        this.mPriority = i7;
    }

    public void setScaleFactor(Float f7) {
        this.mScaleFactor = f7;
    }

    public void setStickerType(int i7) {
        this.mStickerType = i7;
    }

    public void setZValue(float f7) {
        this.mZValue = f7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EditStickerItem{mEditFxSticker=");
        sb.append(this.mEditFxSticker);
        sb.append(", mEditCustomizeSticker=");
        sb.append(this.mEditCustomizeSticker);
        sb.append(", mPreviewItem=");
        sb.append(this.mPreviewItem);
        sb.append(", mPriority=");
        sb.append(this.mPriority);
        sb.append(", mDownloadStatus=");
        sb.append(this.mDownloadStatus);
        sb.append(", mFileStatus=");
        sb.append(this.mFileStatus);
        sb.append(", mStickerType=");
        sb.append(this.mStickerType);
        sb.append(", mDuration=");
        sb.append(this.mDuration);
        sb.append(", zValue=");
        return C1600d.a(sb, this.mZValue, '}');
    }
}
