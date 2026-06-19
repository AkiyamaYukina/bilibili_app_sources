package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionRedDotResponse.class */
@Keep
public final class ProjectionRedDotResponse {

    @Nullable
    private String code;
    private boolean show;

    @Nullable
    public final String getCode() {
        return this.code;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setShow(boolean z6) {
        this.show = z6;
    }
}
