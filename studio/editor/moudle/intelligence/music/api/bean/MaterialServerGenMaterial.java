package com.bilibili.studio.editor.moudle.intelligence.music.api.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/bean/MaterialServerGenMaterial.class */
@Keep
public final class MaterialServerGenMaterial {

    @JSONField(name = "material_id")
    @Nullable
    private List<String> materialId;

    @JSONField(name = "title")
    @Nullable
    private String title = "";

    @JSONField(name = "subtitle")
    @Nullable
    private String subTitle = "";

    @JSONField(name = EditCustomizeSticker.TAG_TEMPLATE_ID)
    @Nullable
    private String templateId = "";

    @JSONField(name = "cover_material_id")
    @Nullable
    private String coverMaterialId = "";

    @JSONField(deserialize = false, serialize = false)
    @NotNull
    private String strategyName = "";

    @Nullable
    public final String getCoverMaterialId() {
        return this.coverMaterialId;
    }

    @Nullable
    public final List<String> getMaterialId() {
        return this.materialId;
    }

    @NotNull
    public final String getStrategyName() {
        return this.strategyName;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTemplateId() {
        return this.templateId;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setCoverMaterialId(@Nullable String str) {
        this.coverMaterialId = str;
    }

    public final void setMaterialId(@Nullable List<String> list) {
        this.materialId = list;
    }

    public final void setStrategyName(@NotNull String str) {
        this.strategyName = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTemplateId(@Nullable String str) {
        this.templateId = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
