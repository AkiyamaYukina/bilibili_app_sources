package com.bilibili.studio.editor.moudle.aistory.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/AIStoryResult.class */
@Keep
public final class AIStoryResult {

    @JSONField(name = "code")
    @Nullable
    private Integer code;

    @JSONField(name = "id")
    @Nullable
    private String id;

    @JSONField(name = "model")
    @Nullable
    private String model;

    @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
    @Nullable
    private String result;

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setResult(@Nullable String str) {
        this.result = str;
    }
}
