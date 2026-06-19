package com.bilibili.studio.editor.moudle.templatev2.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/bean/EditorTemplateMaterial.class */
@Keep
public final class EditorTemplateMaterial {

    @JSONField(name = "type")
    private int materialType;

    @JSONField(name = EditCustomizeSticker.TAG_TEMPLATE_ID)
    @NotNull
    private String templateId = "";

    @JSONField(name = "download_url")
    @NotNull
    private String downloadUrl = "";

    @JSONField(name = "id")
    @NotNull
    private String materialId = "";

    @NotNull
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @NotNull
    public final String getMaterialId() {
        return this.materialId;
    }

    public final int getMaterialType() {
        return this.materialType;
    }

    @NotNull
    public final String getTemplateId() {
        return this.templateId;
    }

    public final void setDownloadUrl(@NotNull String str) {
        this.downloadUrl = str;
    }

    public final void setMaterialId(@NotNull String str) {
        this.materialId = str;
    }

    public final void setMaterialType(int i7) {
        this.materialType = i7;
    }

    public final void setTemplateId(@NotNull String str) {
        this.templateId = str;
    }
}
