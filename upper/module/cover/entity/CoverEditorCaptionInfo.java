package com.bilibili.upper.module.cover.entity;

import androidx.annotation.Keep;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/entity/CoverEditorCaptionInfo.class */
@Keep
public class CoverEditorCaptionInfo implements Cloneable {
    public float anchorPointX;
    public float anchorPointY;
    public CaptionAssetBean captionAssetBean;
    public long captionId;
    public float captionScale;
    public boolean drawOutLine;
    public int flowerId;
    public Integer fontColor;
    public float fontSize;
    public String fontType;
    public int idFontColorIndex;
    public int idFontOutlineIndex;
    public int idFontTemplateIndex;
    public int idFontTypeIndex;
    public boolean isStyleEdited;
    public boolean isTempCaption;
    public int outlineColor;
    public float outlineWidth;
    public float rotation;
    public String templateFormat;
    public int templateType;
    public String text;
    public int textLimitLength;
    public float translationX;
    public float translationY;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CoverEditorCaptionInfo m10646clone() {
        try {
            return (CoverEditorCaptionInfo) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return new CoverEditorCaptionInfo();
        }
    }
}
