package com.bilibili.lib.projection.internal.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/AuthorizeCode.class */
@Keep
public final class AuthorizeCode {

    @JSONField(name = "code")
    @NotNull
    private String code = "";

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final void setCode(@NotNull String str) {
        this.code = str;
    }
}
