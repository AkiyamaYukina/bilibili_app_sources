package com.bilibili.montage.FX;

import android.graphics.PointF;
import com.bilibili.montage.avinfo.MontageColor;
import com.bilibili.montage.avinfo.MontageControlPointPair;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCompoundCaption.class */
public class MontageCompoundCaption extends MontageFx {
    public static final int BOUNDING_TYPE_FRAME = 2;
    public static final int BOUNDING_TYPE_TEXT = 0;
    public static final int BOUNDING_TYPE_TEXT_FRAME = 1;

    private native PointF nativeGetAnchorPoint(long j7);

    private native MontageColor nativeGetBackgroundColor(long j7, int i7);

    private native List<PointF> nativeGetCaptionBoundingVertices(long j7, int i7, int i8);

    private native int nativeGetCaptionCount(long j7);

    private native String nativeGetCaptionStylePackageId(long j7);

    private native PointF nativeGetCaptionTranslation(long j7);

    private native List<PointF> nativeGetCompoundBoundingVertices(long j7, int i7);

    private native MontageControlPointPair nativeGetControlPoint(long j7, String str);

    private native boolean nativeGetDrawOutline(long j7, int i7);

    private native String nativeGetFontFamily(long j7, int i7);

    private native float nativeGetOpacity(long j7);

    private native MontageColor nativeGetOutlineColor(long j7, int i7);

    private native float nativeGetOutlineWidth(long j7, int i7);

    private native float nativeGetRotationZ(long j7);

    private native float nativeGetScaleX(long j7);

    private native float nativeGetScaleY(long j7);

    private native String nativeGetText(long j7, int i7);

    private native MontageColor nativeGetTextColor(long j7, int i7);

    private native float nativeGetZValue(long j7);

    private native boolean nativeRemoveAllKeyframe(long j7, String str);

    private native boolean nativeRemoveKeyframeAtTime(long j7, String str, long j8);

    private native void nativeRotateCaption(long j7, float f7, PointF pointF);

    private native void nativeRotateCaptionAroundCenter(long j7, float f7, int i7);

    private native void nativeScaleCaption(long j7, float f7, PointF pointF);

    private native void nativeSetAnchorPoint(long j7, PointF pointF);

    private native void nativeSetBackgroundColor(long j7, MontageColor montageColor, int i7);

    private native void nativeSetCaptionTranslation(long j7, PointF pointF);

    private native boolean nativeSetControlPoint(long j7, String str, MontageControlPointPair montageControlPointPair);

    private native void nativeSetCurrentKeyFrameTime(long j7, long j8);

    private native void nativeSetDrawOutline(long j7, boolean z6, int i7);

    private native void nativeSetFontFamily(long j7, int i7, String str);

    private native void nativeSetOpacity(long j7, float f7);

    private native void nativeSetOutlineColor(long j7, MontageColor montageColor, int i7);

    private native void nativeSetOutlineWidth(long j7, float f7, int i7);

    private native void nativeSetRotationZ(long j7, float f7);

    private native void nativeSetScaleX(long j7, float f7);

    private native void nativeSetScaleY(long j7, float f7);

    private native void nativeSetText(long j7, int i7, String str);

    private native void nativeSetTextColor(long j7, int i7, MontageColor montageColor);

    private native void nativeSetZValue(long j7, float f7);

    private native void nativeTranslateCaption(long j7, PointF pointF);

    public PointF getAnchorPoint() {
        return nativeGetAnchorPoint(this.mInternalObject);
    }

    public MontageColor getBackgroundColor(int i7) {
        return nativeGetBackgroundColor(this.mInternalObject, i7);
    }

    public List<PointF> getCaptionBoundingVertices(int i7, int i8) {
        return nativeGetCaptionBoundingVertices(this.mInternalObject, i7, i8);
    }

    public int getCaptionCount() {
        return nativeGetCaptionCount(this.mInternalObject);
    }

    public String getCaptionStylePackageId() {
        return nativeGetCaptionStylePackageId(this.mInternalObject);
    }

    public PointF getCaptionTranslation() {
        return nativeGetCaptionTranslation(this.mInternalObject);
    }

    public List<PointF> getCompoundBoundingVertices(int i7) {
        return nativeGetCompoundBoundingVertices(this.mInternalObject, i7);
    }

    public MontageControlPointPair getControlPoint(String str) {
        return nativeGetControlPoint(this.mInternalObject, str);
    }

    public boolean getDrawOutline(int i7) {
        return nativeGetDrawOutline(this.mInternalObject, i7);
    }

    public String getFontFamily(int i7) {
        return nativeGetFontFamily(this.mInternalObject, i7);
    }

    public float getOpacity() {
        return nativeGetOpacity(this.mInternalObject);
    }

    public MontageColor getOutlineColor(int i7) {
        return nativeGetOutlineColor(this.mInternalObject, i7);
    }

    public float getOutlineWidth(int i7) {
        return nativeGetOutlineWidth(this.mInternalObject, i7);
    }

    public float getRotationZ() {
        return nativeGetRotationZ(this.mInternalObject);
    }

    public float getScaleX() {
        return nativeGetScaleX(this.mInternalObject);
    }

    public float getScaleY() {
        return nativeGetScaleY(this.mInternalObject);
    }

    public String getText(int i7) {
        return nativeGetText(this.mInternalObject, i7);
    }

    public MontageColor getTextColor(int i7) {
        return nativeGetTextColor(this.mInternalObject, i7);
    }

    public float getZValue() {
        return nativeGetZValue(this.mInternalObject);
    }

    @Override // com.bilibili.montage.FX.MontageFx
    public boolean removeAllKeyframe(String str) {
        return nativeRemoveAllKeyframe(this.mInternalObject, str);
    }

    @Override // com.bilibili.montage.FX.MontageFx
    public boolean removeKeyframeAtTime(String str, long j7) {
        return nativeRemoveKeyframeAtTime(this.mInternalObject, str, j7);
    }

    public void rotateCaption(float f7, PointF pointF) {
        nativeRotateCaption(this.mInternalObject, f7, pointF);
    }

    public void rotateCaptionAroundCenter(float f7, int i7) {
        nativeRotateCaptionAroundCenter(this.mInternalObject, f7, i7);
    }

    public void scaleCaption(float f7, PointF pointF) {
        nativeScaleCaption(this.mInternalObject, f7, pointF);
    }

    public void setAnchorPoint(PointF pointF) {
        nativeSetAnchorPoint(this.mInternalObject, pointF);
    }

    public void setBackgroundColor(MontageColor montageColor, int i7) {
        nativeSetBackgroundColor(this.mInternalObject, montageColor, i7);
    }

    public void setCaptionTranslation(PointF pointF) {
        nativeSetCaptionTranslation(this.mInternalObject, pointF);
    }

    public boolean setControlPoint(String str, MontageControlPointPair montageControlPointPair) {
        return nativeSetControlPoint(this.mInternalObject, str, montageControlPointPair);
    }

    public void setCurrentKeyFrameTime(long j7) {
        nativeSetCurrentKeyFrameTime(this.mInternalObject, j7);
    }

    public void setDrawOutline(boolean z6, int i7) {
        nativeSetDrawOutline(this.mInternalObject, z6, i7);
    }

    public void setFontFamily(int i7, String str) {
        nativeSetFontFamily(this.mInternalObject, i7, str);
    }

    public void setOpacity(float f7) {
        nativeSetOpacity(this.mInternalObject, f7);
    }

    public void setOutlineColor(MontageColor montageColor, int i7) {
        nativeSetOutlineColor(this.mInternalObject, montageColor, i7);
    }

    public void setOutlineWidth(float f7, int i7) {
        nativeSetOutlineWidth(this.mInternalObject, f7, i7);
    }

    public void setRotationZ(float f7) {
        nativeSetRotationZ(this.mInternalObject, f7);
    }

    public void setScaleX(float f7) {
        nativeSetScaleX(this.mInternalObject, f7);
    }

    public void setScaleY(float f7) {
        nativeSetScaleY(this.mInternalObject, f7);
    }

    public void setText(int i7, String str) {
        nativeSetText(this.mInternalObject, i7, str);
    }

    public void setTextColor(int i7, MontageColor montageColor) {
        nativeSetTextColor(this.mInternalObject, i7, montageColor);
    }

    public void setZValue(float f7) {
        nativeSetZValue(this.mInternalObject, f7);
    }

    public void translateCaption(PointF pointF) {
        nativeTranslateCaption(this.mInternalObject, pointF);
    }
}
