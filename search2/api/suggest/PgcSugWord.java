package com.bilibili.search2.api.suggest;

import Rs0.a;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/suggest/PgcSugWord.class */
@StabilityInferred(parameters = 0)
@Keep
public final class PgcSugWord extends a {
    public static final int $stable = 8;

    @JSONField(name = "label")
    @Nullable
    private String label;

    @JSONField(name = "rating")
    private float rating;

    @JSONField(name = "style")
    @Nullable
    private String style;

    @JSONField(name = "styles")
    @Nullable
    private String styles;

    @JSONField(name = "vote")
    private int vote;

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public final float getRating() {
        return this.rating;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    public final String getStyles() {
        return this.styles;
    }

    public final int getVote() {
        return this.vote;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setRating(float f7) {
        this.rating = f7;
    }

    public final void setStyle(@Nullable String str) {
        this.style = str;
    }

    public final void setStyles(@Nullable String str) {
        this.styles = str;
    }

    public final void setVote(int i7) {
        this.vote = i7;
    }
}
