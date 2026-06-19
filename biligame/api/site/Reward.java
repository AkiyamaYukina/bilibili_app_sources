package com.bilibili.biligame.api.site;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/site/Reward.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Reward {
    public static final int $stable = 8;

    @Nullable
    private String image;

    @Nullable
    private String text;

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
