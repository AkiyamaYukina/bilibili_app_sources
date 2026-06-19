package com.bilibili.biligame.abtest;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/abtest/ReportAbExp.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ReportAbExp implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "ab_exp_id")
    @Nullable
    private String abExpId = "";

    @JSONField(name = "ab_group_id")
    @Nullable
    private String abGroupId = "";

    @Nullable
    public final String getAbExpId() {
        return this.abExpId;
    }

    @Nullable
    public final String getAbGroupId() {
        return this.abGroupId;
    }

    public final void setAbExpId(@Nullable String str) {
        this.abExpId = str;
    }

    public final void setAbGroupId(@Nullable String str) {
        this.abGroupId = str;
    }
}
