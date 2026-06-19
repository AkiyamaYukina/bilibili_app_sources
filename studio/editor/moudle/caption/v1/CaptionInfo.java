package com.bilibili.studio.editor.moudle.caption.v1;

import Bw0.c;
import C.d;
import Di0.C1600d;
import P50.p;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.editor.editdata.EditFxClip;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/CaptionInfo.class */
@Keep
public class CaptionInfo extends EditFxClip implements Serializable, Cloneable {
    public float anchorX;
    public float anchorY;
    public String bClipID;
    public Color backgroundColor;
    public BPointF boundingRectPos;
    public long capTimeDuration;
    public long capTimeInVideo;
    public CaptionAssetBean captionAssetBean;
    public Color color;
    public boolean drawBackgroundColor;
    public boolean drawOutLine;
    public String font;
    public float fontSize;
    public long id;
    public int idFont;
    public int idFontColor;
    public int idOutLineColor;
    public int idTmp;
    public boolean isInTheme;
    public boolean isStyleEdited;
    public boolean isTemp;
    public float lineSpacing;

    @Nullable
    public String materialId;
    public Color outLineColor;
    public float outLineWidth;
    public BPointF pos;
    public Range range;
    public float rotation;

    @Deprecated
    public String style;
    public long tempDuration;
    public String tempFormat;
    public int tempType;
    public String templateLicPath;

    @Deprecated
    public String templatePath;
    public String text;
    public int textAlign;
    public BRectF textFrameOriginRect;
    public String textOrigin;
    public String themeId;

    @JSONField(serialize = false)
    public transient p timelineCaption;
    public Boolean verticalLayout;
    public int verticalTextAlign;
    public String videoPath;
    public float zValue;
    public float captionScale = 1.0f;
    public float translationX = 0.0f;
    public float translationY = 0.0f;
    public float captionScaleBeforeAutoAdjust = -1.0f;
    public int inAnimId = -1;
    public int inAnimDuration = 1000;
    public int outAnimId = -1;
    public int outAnimDuration = 1000;
    public int circleAnimId = -1;
    public int circleAnimDuration = 1000;
    public int flowerId = -1;
    public boolean isRhythmConfig = false;
    public float letterSpacing = 100.0f;
    public boolean textBold = false;
    public boolean textItalic = false;
    public boolean textUnderline = false;
    public boolean canReplace = false;
    public int materialType = 3;
    public int captionType = 0;
    public boolean isCustomAdd = false;
    public int txtMax = 60;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/CaptionInfo$BRectF.class */
    @Keep
    public static class BRectF extends RectF implements Serializable, Cloneable {
        public BRectF() {
        }

        public BRectF(float f7, float f8, float f9, float f10) {
            ((RectF) this).left = f7;
            ((RectF) this).top = f8;
            ((RectF) this).right = f9;
            ((RectF) this).bottom = f10;
        }

        public BRectF(Rect rect) {
            if (rect == null) {
                ((RectF) this).bottom = 0.0f;
                ((RectF) this).right = 0.0f;
                ((RectF) this).top = 0.0f;
                ((RectF) this).left = 0.0f;
                return;
            }
            ((RectF) this).left = rect.left;
            ((RectF) this).top = rect.top;
            ((RectF) this).right = rect.right;
            ((RectF) this).bottom = rect.bottom;
        }

        public BRectF(RectF rectF) {
            if (rectF == null) {
                ((RectF) this).bottom = 0.0f;
                ((RectF) this).right = 0.0f;
                ((RectF) this).top = 0.0f;
                ((RectF) this).left = 0.0f;
                return;
            }
            ((RectF) this).left = rectF.left;
            ((RectF) this).top = rectF.top;
            ((RectF) this).right = rectF.right;
            ((RectF) this).bottom = rectF.bottom;
        }

        public BRectF(BRectF bRectF) {
            if (bRectF == null) {
                ((RectF) this).bottom = 0.0f;
                ((RectF) this).right = 0.0f;
                ((RectF) this).top = 0.0f;
                ((RectF) this).left = 0.0f;
                return;
            }
            ((RectF) this).left = ((RectF) bRectF).left;
            ((RectF) this).top = ((RectF) bRectF).top;
            ((RectF) this).right = ((RectF) bRectF).right;
            ((RectF) this).bottom = ((RectF) bRectF).bottom;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BRectF m9887clone() {
            try {
                return (BRectF) super.clone();
            } catch (CloneNotSupportedException e7) {
                e7.printStackTrace();
                return new BRectF(((RectF) this).left, ((RectF) this).top, ((RectF) this).right, ((RectF) this).bottom);
            }
        }

        @Override // android.graphics.RectF
        public boolean equals(Object obj) {
            boolean z6 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BRectF bRectF = (BRectF) obj;
            if (((RectF) this).left != ((RectF) bRectF).left || ((RectF) this).top != ((RectF) bRectF).top || ((RectF) this).right != ((RectF) bRectF).right || ((RectF) this).bottom != ((RectF) bRectF).bottom) {
                z6 = false;
            }
            return z6;
        }

        @Override // android.graphics.RectF
        public String toString() {
            StringBuilder sb = new StringBuilder("BRectF(");
            sb.append(((RectF) this).left);
            sb.append(", ");
            sb.append(((RectF) this).top);
            sb.append(", ");
            sb.append(((RectF) this).right);
            sb.append(", ");
            return d.a(((RectF) this).bottom, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/CaptionInfo$Color.class */
    @Keep
    public static class Color implements Serializable, Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f106029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f106030b;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f106031g;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f106032r;

        public Color() {
        }

        public Color(float f7, float f8, float f9, float f10) {
            this.f106032r = f7;
            this.f106031g = f8;
            this.f106030b = f9;
            this.f106029a = f10;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Color m9888clone() {
            try {
                return (Color) super.clone();
            } catch (CloneNotSupportedException e7) {
                e7.printStackTrace();
                return null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Color)) {
                return false;
            }
            Color color = (Color) obj;
            return this.f106029a == color.f106029a && this.f106032r == color.f106032r && this.f106031g == color.f106031g && this.f106030b == color.f106030b;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/CaptionInfo$Range.class */
    public static class Range implements Serializable, Cloneable {
        public float bottom;
        public float left;
        public float right;
        public float top;

        public Range() {
        }

        public Range(float f7, float f8, float f9, float f10) {
            this.left = f7;
            this.top = f8;
            this.right = f9;
            this.bottom = f10;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Range m9889clone() {
            try {
                return (Range) super.clone();
            } catch (CloneNotSupportedException e7) {
                e7.printStackTrace();
                return new Range(this.left, this.top, this.right, this.bottom);
            }
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

        public String toString() {
            StringBuilder sb = new StringBuilder("Range{left=");
            sb.append(this.left);
            sb.append(", top=");
            sb.append(this.top);
            sb.append(", right=");
            sb.append(this.right);
            sb.append(", bottom=");
            return C1600d.a(sb, this.bottom, '}');
        }
    }

    public static CaptionInfo duplicate(CaptionInfo captionInfo) {
        CaptionInfo captionInfo2 = new CaptionInfo();
        captionInfo2.update(captionInfo);
        return captionInfo2;
    }

    @Override // com.bilibili.studio.videoeditor.editor.editdata.EditFxClip
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CaptionInfo mo9886clone() {
        CaptionInfo captionInfo = (CaptionInfo) super.mo9886clone();
        BPointF bPointF = this.pos;
        if (bPointF != null) {
            captionInfo.pos = bPointF.m9881clone();
        }
        BPointF bPointF2 = this.boundingRectPos;
        if (bPointF2 != null) {
            captionInfo.boundingRectPos = bPointF2.m9881clone();
        }
        Range range = this.range;
        if (range != null) {
            captionInfo.range = range.m9889clone();
        }
        Color color = this.color;
        if (color != null) {
            captionInfo.color = color.m9888clone();
        }
        CaptionAssetBean captionAssetBean = this.captionAssetBean;
        if (captionAssetBean != null) {
            captionInfo.captionAssetBean = captionAssetBean.m9883clone();
        }
        captionInfo.timelineCaption = this.timelineCaption;
        return captionInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x04c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equalsIgnoreId(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 1229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo.equalsIgnoreId(java.lang.Object):boolean");
    }

    public boolean isAsrCaption() {
        return c.a(this.captionType);
    }

    public boolean isLocalMaterial() {
        return 3 == this.materialType;
    }

    public void limitText() {
        if (this.txtMax <= 0 || TextUtils.isEmpty(this.textOrigin)) {
            return;
        }
        int length = this.textOrigin.length();
        int i7 = this.txtMax;
        if (length <= i7) {
            this.text = this.textOrigin;
        } else {
            this.text = this.textOrigin.substring(0, i7);
        }
    }

    public void update(CaptionInfo captionInfo) {
        if (captionInfo == null) {
            return;
        }
        this.id = captionInfo.id;
        this.materialId = captionInfo.materialId;
        this.text = captionInfo.text;
        this.textOrigin = captionInfo.textOrigin;
        this.captionType = captionInfo.captionType;
        this.inPoint = captionInfo.inPoint;
        this.outPoint = captionInfo.outPoint;
        this.trackLevelIndex = captionInfo.trackLevelIndex;
        this.translationX = captionInfo.translationX;
        this.translationY = captionInfo.translationY;
        BPointF bPointF = captionInfo.pos;
        if (bPointF != null) {
            this.pos = bPointF.m9881clone();
        } else {
            this.pos = null;
        }
        BPointF bPointF2 = captionInfo.boundingRectPos;
        if (bPointF2 != null) {
            this.boundingRectPos = bPointF2.m9881clone();
        } else {
            this.boundingRectPos = null;
        }
        Range range = captionInfo.range;
        if (range != null) {
            this.range = range.m9889clone();
        } else {
            this.range = null;
        }
        Color color = captionInfo.color;
        if (color != null) {
            this.color = color.m9888clone();
        } else {
            this.color = null;
        }
        this.fontSize = captionInfo.fontSize;
        this.font = captionInfo.font;
        this.style = captionInfo.style;
        this.rotation = captionInfo.rotation;
        this.bClipID = captionInfo.bClipID;
        this.templatePath = captionInfo.templatePath;
        CaptionAssetBean captionAssetBean = captionInfo.captionAssetBean;
        if (captionAssetBean != null) {
            this.captionAssetBean = captionAssetBean.m9883clone();
        }
        this.inPoint = captionInfo.inPoint;
        this.inAnimId = captionInfo.inAnimId;
        this.inAnimDuration = captionInfo.inAnimDuration;
        this.outPoint = captionInfo.outPoint;
        this.outAnimId = captionInfo.outAnimId;
        this.outAnimDuration = captionInfo.outAnimDuration;
        this.circleAnimDuration = captionInfo.circleAnimDuration;
        this.circleAnimId = captionInfo.circleAnimId;
        this.flowerId = captionInfo.flowerId;
        this.templateLicPath = captionInfo.templateLicPath;
        this.capTimeInVideo = captionInfo.capTimeInVideo;
        this.capTimeDuration = captionInfo.capTimeDuration;
        this.idTmp = captionInfo.idTmp;
        this.idFont = captionInfo.idFont;
        this.idFontColor = captionInfo.idFontColor;
        this.idOutLineColor = captionInfo.idOutLineColor;
        this.tempFormat = captionInfo.tempFormat;
        this.drawOutLine = captionInfo.drawOutLine;
        this.outLineColor = captionInfo.outLineColor;
        this.outLineWidth = captionInfo.outLineWidth;
        this.textAlign = captionInfo.textAlign;
        this.verticalLayout = captionInfo.verticalLayout;
        this.textOrigin = captionInfo.textOrigin;
        this.txtMax = captionInfo.txtMax;
        this.captionScale = captionInfo.captionScale;
        this.captionScaleBeforeAutoAdjust = captionInfo.captionScaleBeforeAutoAdjust;
        this.anchorX = captionInfo.anchorX;
        this.anchorY = captionInfo.anchorY;
        this.isInTheme = captionInfo.isInTheme;
        this.themeId = captionInfo.themeId;
        this.isTemp = captionInfo.isTemp;
        this.tempDuration = captionInfo.tempDuration;
        this.verticalTextAlign = captionInfo.verticalTextAlign;
        this.letterSpacing = captionInfo.letterSpacing;
        this.lineSpacing = captionInfo.lineSpacing;
        this.zValue = captionInfo.zValue;
        this.isRhythmConfig = captionInfo.isRhythmConfig;
        this.textBold = captionInfo.textBold;
        this.textItalic = captionInfo.textItalic;
        this.textUnderline = captionInfo.textUnderline;
        this.drawBackgroundColor = captionInfo.drawBackgroundColor;
        Color color2 = captionInfo.backgroundColor;
        if (color2 != null) {
            this.backgroundColor = color2.m9888clone();
        } else {
            this.backgroundColor = null;
        }
        if (captionInfo.textFrameOriginRect != null) {
            this.textFrameOriginRect = new BRectF(captionInfo.textFrameOriginRect);
        }
        this.timelineCaption = captionInfo.timelineCaption;
        this.isCustomAdd = captionInfo.isCustomAdd;
    }

    public void updateStyle(CaptionInfo captionInfo) {
        if (captionInfo == null) {
            return;
        }
        this.txtMax = captionInfo.txtMax;
        this.textAlign = captionInfo.textAlign;
        this.verticalTextAlign = captionInfo.verticalTextAlign;
        this.letterSpacing = captionInfo.letterSpacing;
        this.lineSpacing = captionInfo.lineSpacing;
        this.rotation = captionInfo.rotation;
        this.zValue = captionInfo.zValue;
        BPointF bPointF = captionInfo.pos;
        if (bPointF != null) {
            this.pos = bPointF.m9881clone();
        } else {
            this.pos = null;
        }
        BPointF bPointF2 = captionInfo.boundingRectPos;
        if (bPointF2 != null) {
            this.boundingRectPos = bPointF2.m9881clone();
        } else {
            this.boundingRectPos = null;
        }
        this.isRhythmConfig = captionInfo.isRhythmConfig;
        this.anchorX = captionInfo.anchorX;
        this.anchorY = captionInfo.anchorY;
        this.fontSize = captionInfo.fontSize;
        this.captionScale = captionInfo.captionScale;
        this.captionScaleBeforeAutoAdjust = captionInfo.captionScaleBeforeAutoAdjust;
        this.idFont = captionInfo.idFont;
        this.font = captionInfo.font;
        this.textItalic = captionInfo.textItalic;
        this.textBold = captionInfo.textBold;
        this.textUnderline = captionInfo.textUnderline;
        Color color = captionInfo.color;
        if (color != null) {
            this.color = color.m9888clone();
        } else {
            this.color = null;
        }
        this.idTmp = captionInfo.idTmp;
        this.templatePath = captionInfo.templatePath;
        CaptionAssetBean captionAssetBean = captionInfo.captionAssetBean;
        if (captionAssetBean != null) {
            this.captionAssetBean = captionAssetBean.m9883clone();
        }
        this.inPoint = captionInfo.inPoint;
        this.inAnimId = captionInfo.inAnimId;
        this.inAnimDuration = captionInfo.inAnimDuration;
        this.outPoint = captionInfo.outPoint;
        this.outAnimId = captionInfo.outAnimId;
        this.outAnimDuration = captionInfo.outAnimDuration;
        this.circleAnimDuration = captionInfo.circleAnimDuration;
        this.circleAnimId = captionInfo.circleAnimId;
        this.flowerId = captionInfo.flowerId;
        this.templateLicPath = captionInfo.templateLicPath;
        this.style = captionInfo.style;
        this.isTemp = captionInfo.isTemp;
        this.tempFormat = captionInfo.tempFormat;
        this.drawOutLine = captionInfo.drawOutLine;
        Color color2 = captionInfo.outLineColor;
        if (color2 != null) {
            this.outLineColor = color2.m9888clone();
        } else {
            this.outLineColor = null;
        }
        this.outLineWidth = captionInfo.outLineWidth;
        this.textFrameOriginRect = captionInfo.textFrameOriginRect == null ? null : new BRectF(captionInfo.textFrameOriginRect);
        Range range = captionInfo.range;
        if (range != null) {
            this.range = range.m9889clone();
        } else {
            this.range = null;
        }
        this.drawBackgroundColor = captionInfo.drawBackgroundColor;
        Color color3 = captionInfo.backgroundColor;
        if (color3 != null) {
            this.backgroundColor = color3.m9888clone();
        } else {
            this.backgroundColor = null;
        }
    }

    public void updateStyle2(CaptionInfo captionInfo) {
        if (captionInfo == null) {
            return;
        }
        this.txtMax = captionInfo.txtMax;
        this.fontSize = captionInfo.fontSize;
        this.captionScale = captionInfo.captionScale;
        this.captionScaleBeforeAutoAdjust = captionInfo.captionScaleBeforeAutoAdjust;
        this.idFont = captionInfo.idFont;
        this.font = captionInfo.font;
        this.textBold = captionInfo.textBold;
        this.textUnderline = captionInfo.textUnderline;
        Color color = captionInfo.color;
        if (color != null) {
            this.color = color.m9888clone();
        } else {
            this.color = null;
        }
        this.idFontColor = captionInfo.idFontColor;
        this.idTmp = captionInfo.idTmp;
        this.templatePath = captionInfo.templatePath;
        CaptionAssetBean captionAssetBean = captionInfo.captionAssetBean;
        if (captionAssetBean != null) {
            this.captionAssetBean = captionAssetBean.m9883clone();
        }
        this.templateLicPath = captionInfo.templateLicPath;
        this.style = captionInfo.style;
        this.inPoint = captionInfo.inPoint;
        this.inAnimId = captionInfo.inAnimId;
        this.inAnimDuration = captionInfo.inAnimDuration;
        this.outPoint = captionInfo.outPoint;
        this.outAnimId = captionInfo.outAnimId;
        this.outAnimDuration = captionInfo.outAnimDuration;
        this.circleAnimDuration = captionInfo.circleAnimDuration;
        this.circleAnimId = captionInfo.circleAnimId;
        this.flowerId = captionInfo.flowerId;
        this.tempFormat = captionInfo.tempFormat;
        this.drawOutLine = captionInfo.drawOutLine;
        Color color2 = captionInfo.outLineColor;
        if (color2 != null) {
            this.outLineColor = color2.m9888clone();
        } else {
            this.outLineColor = null;
        }
        this.idOutLineColor = captionInfo.idOutLineColor;
        this.outLineWidth = captionInfo.outLineWidth;
    }
}
