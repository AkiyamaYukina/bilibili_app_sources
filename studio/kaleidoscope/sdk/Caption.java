package com.bilibili.studio.kaleidoscope.sdk;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/Caption.class */
public interface Caption extends Fx {
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

    boolean applyCaptionStyle(String str);

    boolean applyModularCaptionAnimation(String str);

    boolean applyModularCaptionContext(String str);

    boolean applyModularCaptionInAnimation(String str);

    boolean applyModularCaptionOutAnimation(String str);

    boolean applyModularCaptionRenderer(String str);

    long changeInPoint(long j7);

    PointF getAnchorPoint();

    boolean getBold();

    List<PointF> getBoundingRectangleVertices();

    List<PointF> getCaptionBoundingVertices(int i7);

    String getCaptionStylePackageId();

    PointF getCaptionTranslation();

    int getCategory();

    @Nullable
    ControlPointPair getControlPoint(String str);

    boolean getDrawOutline();

    boolean getDrawShadow();

    String getFontFilePath();

    float getFontSize();

    boolean getItalic();

    float getLetterSpacing();

    float getLineSpacing();

    String getModularCaptionAnimationPackageId();

    String getModularCaptionContextPackageId();

    String getModularCaptionInAnimationPackageId();

    String getModularCaptionOutAnimationPackageId();

    String getModularCaptionRendererPackageId();

    float getOpacity();

    Color getOutlineColor();

    float getOutlineWidth();

    int getRoleInTheme();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    Color getShadowColor();

    float getShadowFeather();

    PointF getShadowOffset();

    String getText();

    int getTextAlignment();

    RectF getTextBoundingRect();

    Color getTextColor();

    int getTextVerticalAlignment();

    boolean getUnderline();

    boolean getVerticalLayout();

    float getZValue();

    boolean isFrameCaption();

    void rotateCaption(float f7);

    void rotateCaption(float f7, PointF pointF);

    void scaleCaption(float f7, PointF pointF);

    void setAnchorPoint(PointF pointF);

    void setBackgroundColor(@NonNull Color color);

    void setBold(boolean z6);

    void setCaptionTranslation(PointF pointF);

    boolean setControlPoint(String str, @NonNull ControlPointPair controlPointPair);

    void setCurrentKeyFrameTime(long j7);

    void setDrawOutline(boolean z6);

    void setDrawShadow(boolean z6);

    void setFontByFilePath(String str);

    void setFontSize(float f7);

    void setItalic(boolean z6);

    void setLetterSpacing(float f7);

    void setLineSpacing(float f7);

    void setModularCaptionAnimationPeroid(int i7);

    void setModularCaptionInAnimationDuration(int i7);

    void setModularCaptionOutAnimationDuration(int i7);

    void setOpacity(float f7);

    void setOutlineColor(Color color);

    void setOutlineWidth(float f7);

    void setRecordingUserOperation(boolean z6);

    void setRotationZ(float f7);

    void setScaleX(float f7);

    void setScaleY(float f7);

    void setShadowColor(Color color);

    void setShadowFeather(float f7);

    void setShadowOffset(PointF pointF);

    void setText(String str);

    void setTextAlignment(int i7);

    void setTextColor(@NonNull Color color);

    void setTextFrameOriginRect(RectF rectF);

    void setTextVerticalAlignment(int i7);

    void setTimelineCaption(Object obj);

    void setUnderline(boolean z6);

    void setVerticalLayout(boolean z6);

    void setZValue(float f7);

    void translateCaption(PointF pointF);
}
