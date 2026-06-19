package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ThirdUiBeen.class */
@Keep
public final class ThirdUiBeen {

    @JSONField(name = "title_text")
    @Nullable
    private String titleText;

    @Nullable
    public final String getTitleText() {
        return this.titleText;
    }

    public final void setTitleText(@Nullable String str) {
        this.titleText = str;
    }
}
