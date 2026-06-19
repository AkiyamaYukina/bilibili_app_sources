package com.bilibili.biligame.api.bean.discover;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/discover/RecommendReason.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RecommendReason {
    public static final int $stable = 8;

    @JSONField
    @Nullable
    private String category;

    @JSONField(name = "reason_text")
    @Nullable
    private String reasonText;

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getReasonText() {
        return this.reasonText;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setReasonText(@Nullable String str) {
        this.reasonText = str;
    }
}
