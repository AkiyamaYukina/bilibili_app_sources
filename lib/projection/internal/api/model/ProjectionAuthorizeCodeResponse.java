package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionAuthorizeCodeResponse.class */
@Keep
public final class ProjectionAuthorizeCodeResponse {

    @Nullable
    private String code = "";

    @Nullable
    public final String getCode() {
        return this.code;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }
}
