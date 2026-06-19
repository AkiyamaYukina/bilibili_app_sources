package com.bilibili.studio.editor.moudle.intelligence.music.api.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/bean/MaterialServerGenerationItem.class */
@Keep
public final class MaterialServerGenerationItem {

    @JSONField(name = "group_type")
    private int groupType;

    @JSONField(name = "materials")
    @Nullable
    private List<MaterialServerGenMaterial> materials;

    @JSONField(name = "strategy_name")
    @Nullable
    private String strategyName = "";

    @JSONField(name = "group_name")
    @Nullable
    private String groupName = "";

    @Nullable
    public final String getGroupName() {
        return this.groupName;
    }

    public final int getGroupType() {
        return this.groupType;
    }

    @Nullable
    public final List<MaterialServerGenMaterial> getMaterials() {
        return this.materials;
    }

    @Nullable
    public final String getStrategyName() {
        return this.strategyName;
    }

    public final void setGroupName(@Nullable String str) {
        this.groupName = str;
    }

    public final void setGroupType(int i7) {
        this.groupType = i7;
    }

    public final void setMaterials(@Nullable List<MaterialServerGenMaterial> list) {
        this.materials = list;
    }

    public final void setStrategyName(@Nullable String str) {
        this.strategyName = str;
    }
}
