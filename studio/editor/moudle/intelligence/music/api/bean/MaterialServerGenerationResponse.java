package com.bilibili.studio.editor.moudle.intelligence.music.api.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/bean/MaterialServerGenerationResponse.class */
@Keep
public final class MaterialServerGenerationResponse {

    @JSONField(name = "list")
    @Nullable
    private List<MaterialServerGenerationItem> list;

    @Nullable
    public final List<MaterialServerGenerationItem> getList() {
        return this.list;
    }

    public final void setList(@Nullable List<MaterialServerGenerationItem> list) {
        this.list = list;
    }
}
