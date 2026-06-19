package com.bilibili.studio.editor.moudle.sticker.v1;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bilibili.studio.videoeditor.editor.editdata.PointF;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/EditFxStickerClip.class */
@Keep
public class EditFxStickerClip implements Serializable {
    public String mAppendBClipId;
    public String mAppendBClipVideoPath;
    public long mClipId;
    public long mClipSpeedTimeTrimIn;
    public EditCustomizeSticker mEditCustomizeSticker;
    public EditFxSticker mEditFxSticker;
    public float mRotationZ;
    public float mScaleFactor;
    public long mSpeedTimeTrimIn;
    public long mSpeedTimeTrimOut;
    public long mStandTimeStart;
    public int mStickerType;
    public PointF mTranslationPointF;

    public void setAppendBClipId(@Nullable String str) {
        this.mAppendBClipId = str;
    }

    public void setAppendBClipVideoPath(@Nullable String str) {
        this.mAppendBClipVideoPath = str;
    }

    public void setClipId(long j7) {
        this.mClipId = j7;
    }

    public void setClipSpeedTimeTrimIn(long j7) {
        this.mClipSpeedTimeTrimIn = j7;
    }

    public void setEditCustomizeSticker(@Nullable EditCustomizeSticker editCustomizeSticker) {
        this.mEditCustomizeSticker = editCustomizeSticker;
    }

    public void setEditFxSticker(@Nullable EditFxSticker editFxSticker) {
        this.mEditFxSticker = editFxSticker;
    }

    public void setRotationZ(float f7) {
        this.mRotationZ = f7;
    }

    public void setScaleFactor(float f7) {
        this.mScaleFactor = f7;
    }

    public void setSpeedTimeTrimIn(long j7) {
        this.mSpeedTimeTrimIn = j7;
    }

    public void setSpeedTimeTrimOut(long j7) {
        this.mSpeedTimeTrimOut = j7;
    }

    public void setStandTimeStart(long j7) {
        this.mStandTimeStart = j7;
    }

    public void setStickerType(int i7) {
        this.mStickerType = i7;
    }

    public void setTranslationPointF(PointF pointF) {
        this.mTranslationPointF = pointF;
    }
}
