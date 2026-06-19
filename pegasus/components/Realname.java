package com.bilibili.pegasus.components;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/Realname.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Realname {
    public static final int $stable = 8;

    @Nullable
    private String title;

    @Nullable
    private String url;

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
