package com.bilibili.studio.editor.moudle.aistory.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/AIStorySegmentBean.class */
@Keep
public final class AIStorySegmentBean {

    @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
    @Nullable
    private List<? extends List<String>> result;

    @JSONField(name = "code")
    @Nullable
    private Integer code = -1;

    @JSONField(name = "success")
    @Nullable
    private Boolean success = Boolean.FALSE;

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final List<List<String>> getResult() {
        return this.result;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setResult(@Nullable List<? extends List<String>> list) {
        this.result = list;
    }

    public final void setSuccess(@Nullable Boolean bool) {
        this.success = bool;
    }
}
