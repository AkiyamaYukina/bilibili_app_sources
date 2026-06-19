package com.bilibili.biligame.api.site;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/site/NickName.class */
@StabilityInferred(parameters = 0)
@Keep
public final class NickName {
    public static final int $stable = 8;

    @Nullable
    private String name = "";

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
