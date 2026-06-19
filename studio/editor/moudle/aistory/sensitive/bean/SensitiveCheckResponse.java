package com.bilibili.studio.editor.moudle.aistory.sensitive.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/sensitive/bean/SensitiveCheckResponse.class */
@Keep
public final class SensitiveCheckResponse {

    @JSONField(name = "list")
    @Nullable
    private List<SensitiveCheckResult> list;

    @Nullable
    public final List<SensitiveCheckResult> getList() {
        return this.list;
    }

    public final void setList(@Nullable List<SensitiveCheckResult> list) {
        this.list = list;
    }
}
