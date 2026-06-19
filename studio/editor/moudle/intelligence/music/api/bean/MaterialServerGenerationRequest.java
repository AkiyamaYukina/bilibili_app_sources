package com.bilibili.studio.editor.moudle.intelligence.music.api.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/bean/MaterialServerGenerationRequest.class */
@Keep
public final class MaterialServerGenerationRequest {

    @SerializedName("material_list")
    @NotNull
    private final List<MaterialServerGenerationRequestMaterial> materialList;

    @SerializedName("tab")
    private final int tab;

    public MaterialServerGenerationRequest(int i7, @NotNull List<MaterialServerGenerationRequestMaterial> list) {
        this.tab = i7;
        this.materialList = list;
    }

    @NotNull
    public final List<MaterialServerGenerationRequestMaterial> getMaterialList() {
        return this.materialList;
    }

    public final int getTab() {
        return this.tab;
    }
}
