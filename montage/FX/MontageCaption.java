package com.bilibili.montage.FX;

import android.graphics.PointF;
import android.graphics.RectF;
import com.bilibili.montage.avinfo.MontageColor;
import com.bilibili.montage.avinfo.MontageControlPointPair;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCaption.class */
public class MontageCaption extends MontageFx {
    public static final int BOUNDING_TYPE_FRAME = 2;
    public static final int BOUNDING_TYPE_TEXT = 0;
    public static final int BOUNDING_TYPE_TEXT_FRAME = 1;
    public static final int BOUNDING_TYPE_TEXT_ORIGIN_FRAME = 3;
    public static final int DEFAULT_CATEGORY = 0;
    public static final int LETTER_SPACING_TYPE_ABSOLUTE = 1;
    public static final int LETTER_SPACING_TYPE_PERCENTAGE = 0;
    public static final int NOT_USE_ASSET_DEFAULT_PARAM = 1;
    public static final int ROLE_IN_THEME_GENERAL = 0;
    public static final int ROLE_IN_THEME_TITLE = 1;
    public static final int ROLE_IN_THEME_TRAILER = 2;
    public static final int TEXT_ALIGNMENT_BOTTOM = 4;
    public static final int TEXT_ALIGNMENT_CENTER = 1;
    public static final int TEXT_ALIGNMENT_LEFT = 0;
    public static final int TEXT_ALIGNMENT_RIGHT = 2;
    public static final int TEXT_ALIGNMENT_TOP = 3;
    public static final int TEXT_ALIGNMENT_VCENTER = 5;
    public static final int THEME_CATEGORY = 2;
    public static final int USER_CATEGORY = 1;
    public static final int USE_ASSET_DEFAULT_PARAM = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCaption$MotionParameters.class */
    public static class MotionParameters {
        public float anchorX = 0.0f;
        public float anchorY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float rotationZ = 0.0f;
        public float transX = 0.0f;
        public float transY = 0.0f;
    }

    private native boolean nativeApplyCaptionStyle(long j7, String str);

    private native boolean nativeApplyModularCaptionAnimation(long j7, String str);

    private native boolean nativeApplyModularCaptionContext(long j7, String str);

    private native boolean nativeApplyModularCaptionInAnimation(long j7, String str);

    private native boolean nativeApplyModularCaptionOutAnimation(long j7, String str);

    private native boolean nativeApplyModularCaptionRenderer(long j7, String str);

    private native PointF nativeGetAnchorPoint(long j7);

    private native MontageColor nativeGetBackgroundColor(long j7);

    private native float nativeGetBackgroundRadius(long j7);

    private native boolean nativeGetBold(long j7);

    private native List<PointF> nativeGetBoundingRectangleVertices(long j7);

    private native List<PointF> nativeGetCaptionBoundingVertices(long j7, int i7);

    private native String nativeGetCaptionStylePackageId(long j7);

    private native PointF nativeGetCaptionTranslation(long j7);

    private native int nativeGetCategory(long j7);

    private native MontageControlPointPair nativeGetControlPoint(long j7, String str);

    private native boolean nativeGetDrawOutline(long j7);

    private native boolean nativeGetDrawShadow(long j7);

    private native String nativeGetFontFamily(long j7);

    private native String nativeGetFontFilePath(long j7);

    private native float nativeGetFontSize(long j7);

    private native boolean nativeGetItalic(long j7);

    private native float nativeGetLetterSpacing(long j7);

    private native float nativeGetLineSpacing(long j7);

    private native String nativeGetModularCaptionContextPackageId(long j7);

    private native String nativeGetModularCaptionRendererPackageId(long j7);

    private native float nativeGetOpacity(long j7);

    private native MontageColor nativeGetOutlineColor(long j7);

    private native float nativeGetOutlineWidth(long j7);

    private native int nativeGetRoleInTheme(long j7);

    private native float nativeGetRotationZ(long j7);

    private native float nativeGetScaleX(long j7);

    private native float nativeGetScaleY(long j7);

    private native MontageColor nativeGetShadowColor(long j7);

    private native float nativeGetShadowFeather(long j7);

    private native PointF nativeGetShadowOffset(long j7);

    private native String nativeGetText(long j7);

    private native int nativeGetTextAlignment(long j7);

    private native RectF nativeGetTextBoundingRect(long j7);

    private native MontageColor nativeGetTextColor(long j7);

    private native int nativeGetTextVerticalAlignment(long j7);

    private native boolean nativeGetUnderline(long j7);

    private native boolean nativeGetVerticalLayout(long j7);

    private native int nativeGetWeight(long j7);

    private native float nativeGetZValue(long j7);

    private native boolean nativeIsFrameCaption(long j7);

    private native void nativeRotateCaption(long j7, float f7);

    private native void nativeRotateCaption(long j7, float f7, PointF pointF);

    private native void nativeScaleCaption(long j7, float f7, PointF pointF);

    private native void nativeSetAnchorPoint(long j7, PointF pointF);

    private native void nativeSetBackgroundColor(long j7, MontageColor montageColor);

    private native void nativeSetBackgroundRadius(long j7, float f7);

    private native void nativeSetBold(long j7, boolean z6);

    private native void nativeSetCaptionTranslation(long j7, PointF pointF);

    private native boolean nativeSetControlPoint(long j7, String str, MontageControlPointPair montageControlPointPair);

    private native void nativeSetCurrentKeyFrameTime(long j7, long j8);

    private native void nativeSetDrawOutline(long j7, boolean z6);

    private native void nativeSetDrawShadow(long j7, boolean z6);

    private native void nativeSetFontByFilePath(long j7, String str);

    private native void nativeSetFontFamily(long j7, String str);

    private native void nativeSetFontSize(long j7, float f7);

    private native void nativeSetItalic(long j7, boolean z6);

    private native void nativeSetLetterSpacing(long j7, float f7);

    private native void nativeSetLineSpacing(long j7, float f7);

    private native void nativeSetModularCaptionAnimationPeroid(long j7, int i7);

    private native void nativeSetModularCaptionInAnimationDuration(long j7, int i7);

    private native void nativeSetModularCaptionOutAnimationDuration(long j7, int i7);

    private native void nativeSetOpacity(long j7, float f7);

    private native void nativeSetOutlineColor(long j7, MontageColor montageColor);

    private native void nativeSetOutlineWidth(long j7, float f7);

    private native void nativeSetRecordingUserOperation(long j7, boolean z6);

    private native void nativeSetRotationZ(long j7, float f7);

    private native void nativeSetScaleX(long j7, float f7);

    private native void nativeSetScaleY(long j7, float f7);

    private native void nativeSetShadowColor(long j7, MontageColor montageColor);

    private native void nativeSetShadowFeather(long j7, float f7);

    private native void nativeSetShadowOffset(long j7, PointF pointF);

    private native void nativeSetText(long j7, String str);

    private native void nativeSetTextAlignment(long j7, int i7);

    private native void nativeSetTextColor(long j7, MontageColor montageColor);

    private native void nativeSetTextFrameOriginRect(long j7, RectF rectF);

    private native void nativeSetTextVerticalAlignment(long j7, int i7);

    private native void nativeSetUnderline(long j7, boolean z6);

    private native void nativeSetVerticalLayout(long j7, boolean z6);

    private native void nativeSetWeight(long j7, int i7);

    private native void nativeSetZValue(long j7, float f7);

    private native void nativeTranslateCaption(long j7, PointF pointF);

    private native String nativegetModularCaptionAnimationPackageId(long j7);

    private native String nativegetModularCaptionInAnimationPackageId(long j7);

    private native String nativegetModularCaptionOutAnimationPackageId(long j7);

    public boolean applyCaptionStyle(String str) {
        return nativeApplyCaptionStyle(this.mInternalObject, str);
    }

    public boolean applyModularCaptionAnimation(String str) {
        return nativeApplyModularCaptionAnimation(this.mInternalObject, str);
    }

    public boolean applyModularCaptionContext(String str) {
        return nativeApplyModularCaptionContext(this.mInternalObject, str);
    }

    public boolean applyModularCaptionInAnimation(String str) {
        return nativeApplyModularCaptionInAnimation(this.mInternalObject, str);
    }

    public boolean applyModularCaptionOutAnimation(String str) {
        return nativeApplyModularCaptionOutAnimation(this.mInternalObject, str);
    }

    public boolean applyModularCaptionRenderer(String str) {
        return nativeApplyModularCaptionRenderer(this.mInternalObject, str);
    }

    public PointF getAnchorPoint() {
        return nativeGetAnchorPoint(this.mInternalObject);
    }

    public MontageColor getBackgroundColor() {
        return nativeGetBackgroundColor(this.mInternalObject);
    }

    public float getBackgroundRadius() {
        return nativeGetBackgroundRadius(this.mInternalObject);
    }

    public boolean getBold() {
        return nativeGetBold(this.mInternalObject);
    }

    public List<PointF> getBoundingRectangleVertices() {
        return nativeGetBoundingRectangleVertices(this.mInternalObject);
    }

    public List<PointF> getCaptionBoundingVertices(int i7) {
        return nativeGetCaptionBoundingVertices(this.mInternalObject, i7);
    }

    public String getCaptionStylePackageId() {
        return nativeGetCaptionStylePackageId(this.mInternalObject);
    }

    public PointF getCaptionTranslation() {
        return nativeGetCaptionTranslation(this.mInternalObject);
    }

    public int getCategory() {
        return nativeGetCategory(this.mInternalObject);
    }

    public MontageControlPointPair getControlPoint(String str) {
        return nativeGetControlPoint(this.mInternalObject, str);
    }

    public boolean getDrawOutline() {
        return nativeGetDrawOutline(this.mInternalObject);
    }

    public boolean getDrawShadow() {
        return nativeGetDrawShadow(this.mInternalObject);
    }

    public String getFontFamily() {
        return nativeGetFontFamily(this.mInternalObject);
    }

    public String getFontFilePath() {
        return nativeGetFontFilePath(this.mInternalObject);
    }

    public float getFontSize() {
        return nativeGetFontSize(this.mInternalObject);
    }

    public boolean getItalic() {
        return nativeGetItalic(this.mInternalObject);
    }

    public float getLetterSpacing() {
        return nativeGetLetterSpacing(this.mInternalObject);
    }

    public float getLineSpacing() {
        return nativeGetLineSpacing(this.mInternalObject);
    }

    public String getModularCaptionAnimationPackageId() {
        return nativeGetModularCaptionRendererPackageId(this.mInternalObject);
    }

    public String getModularCaptionContextPackageId() {
        return nativeGetModularCaptionRendererPackageId(this.mInternalObject);
    }

    public String getModularCaptionInAnimationPackageId() {
        return nativeGetModularCaptionRendererPackageId(this.mInternalObject);
    }

    public String getModularCaptionOutAnimationPackageId() {
        return nativeGetModularCaptionRendererPackageId(this.mInternalObject);
    }

    public String getModularCaptionRendererPackageId() {
        return nativeGetModularCaptionRendererPackageId(this.mInternalObject);
    }

    public float getOpacity() {
        return nativeGetOpacity(this.mInternalObject);
    }

    public MontageColor getOutlineColor() {
        return nativeGetOutlineColor(this.mInternalObject);
    }

    public float getOutlineWidth() {
        return nativeGetOutlineWidth(this.mInternalObject);
    }

    public int getRoleInTheme() {
        return nativeGetRoleInTheme(this.mInternalObject);
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

    public MontageColor getShadowColor() {
        return nativeGetShadowColor(this.mInternalObject);
    }

    public float getShadowFeather() {
        return nativeGetShadowFeather(this.mInternalObject);
    }

    public PointF getShadowOffset() {
        return nativeGetShadowOffset(this.mInternalObject);
    }

    public String getText() {
        return nativeGetText(this.mInternalObject);
    }

    public int getTextAlignment() {
        return nativeGetTextAlignment(this.mInternalObject);
    }

    public RectF getTextBoundingRect() {
        return nativeGetTextBoundingRect(this.mInternalObject);
    }

    public MontageColor getTextColor() {
        return nativeGetTextColor(this.mInternalObject);
    }

    public int getTextVerticalAlignment() {
        return nativeGetTextVerticalAlignment(this.mInternalObject);
    }

    public boolean getUnderline() {
        return nativeGetUnderline(this.mInternalObject);
    }

    public boolean getVerticalLayout() {
        return nativeGetVerticalLayout(this.mInternalObject);
    }

    public int getWeight() {
        return nativeGetWeight(this.mInternalObject);
    }

    public float getZValue() {
        return nativeGetZValue(this.mInternalObject);
    }

    public boolean isFrameCaption() {
        return nativeIsFrameCaption(this.mInternalObject);
    }

    public void rotateCaption(float f7) {
        nativeRotateCaption(this.mInternalObject, f7);
    }

    public void rotateCaption(float f7, PointF pointF) {
        nativeRotateCaption(this.mInternalObject, f7, pointF);
    }

    public void scaleCaption(float f7, PointF pointF) {
        nativeScaleCaption(this.mInternalObject, f7, pointF);
    }

    public void setAnchorPoint(PointF pointF) {
        nativeSetAnchorPoint(this.mInternalObject, pointF);
    }

    public void setBackgroundColor(MontageColor montageColor) {
        nativeSetBackgroundColor(this.mInternalObject, montageColor);
    }

    public void setBackgroundRadius(float f7) {
        nativeSetBackgroundRadius(this.mInternalObject, f7);
    }

    public void setBold(boolean z6) {
        nativeSetBold(this.mInternalObject, z6);
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

    public void setDrawOutline(boolean z6) {
        nativeSetDrawOutline(this.mInternalObject, z6);
    }

    public void setDrawShadow(boolean z6) {
        nativeSetDrawShadow(this.mInternalObject, z6);
    }

    public void setFontByFilePath(String str) {
        nativeSetFontByFilePath(this.mInternalObject, str);
    }

    public void setFontFamily(String str) {
        nativeSetFontFamily(this.mInternalObject, str);
    }

    public void setFontSize(float f7) {
        nativeSetFontSize(this.mInternalObject, f7);
    }

    public void setItalic(boolean z6) {
        nativeSetItalic(this.mInternalObject, z6);
    }

    public void setLetterSpacing(float f7) {
        nativeSetLetterSpacing(this.mInternalObject, f7);
    }

    public void setLineSpacing(float f7) {
        nativeSetLineSpacing(this.mInternalObject, f7);
    }

    public void setModularCaptionAnimationPeroid(int i7) {
        nativeSetModularCaptionAnimationPeroid(this.mInternalObject, i7);
    }

    public void setModularCaptionInAnimationDuration(int i7) {
        nativeSetModularCaptionInAnimationDuration(this.mInternalObject, i7);
    }

    public void setModularCaptionOutAnimationDuration(int i7) {
        nativeSetModularCaptionOutAnimationDuration(this.mInternalObject, i7);
    }

    public void setOpacity(float f7) {
        nativeSetOpacity(this.mInternalObject, f7);
    }

    public void setOutlineColor(MontageColor montageColor) {
        nativeSetOutlineColor(this.mInternalObject, montageColor);
    }

    public void setOutlineWidth(float f7) {
        nativeSetOutlineWidth(this.mInternalObject, f7);
    }

    public void setRecordingUserOperation(boolean z6) {
        nativeSetRecordingUserOperation(this.mInternalObject, z6);
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

    public void setShadowColor(MontageColor montageColor) {
        nativeSetShadowColor(this.mInternalObject, montageColor);
    }

    public void setShadowFeather(float f7) {
        nativeSetShadowFeather(this.mInternalObject, f7);
    }

    public void setShadowOffset(PointF pointF) {
        nativeSetShadowOffset(this.mInternalObject, pointF);
    }

    public void setText(String str) {
        nativeSetText(this.mInternalObject, str);
    }

    public void setTextAlignment(int i7) {
        nativeSetTextAlignment(this.mInternalObject, i7);
    }

    public void setTextColor(MontageColor montageColor) {
        nativeSetTextColor(this.mInternalObject, montageColor);
    }

    public void setTextFrameOriginRect(RectF rectF) {
        nativeSetTextFrameOriginRect(this.mInternalObject, rectF);
    }

    public void setTextVerticalAlignment(int i7) {
        nativeSetTextVerticalAlignment(this.mInternalObject, i7);
    }

    public void setUnderline(boolean z6) {
        nativeSetUnderline(this.mInternalObject, z6);
    }

    public void setVerticalLayout(boolean z6) {
        nativeSetVerticalLayout(this.mInternalObject, z6);
    }

    public void setWeight(int i7) {
        nativeSetWeight(this.mInternalObject, i7);
    }

    public void setZValue(float f7) {
        nativeSetZValue(this.mInternalObject, f7);
    }

    public void translateCaption(PointF pointF) {
        nativeTranslateCaption(this.mInternalObject, pointF);
    }
}
