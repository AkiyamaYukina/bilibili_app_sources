package com.bilibili.ogv.opbase;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/NewestTime.class */
@StabilityInferred(parameters = 0)
@Keep
public final class NewestTime {
    public static final int $stable = 8;

    @JSONField(name = "newest_mtime")
    @Nullable
    private Long newestTime = 0L;

    @Nullable
    public final Long getNewestTime() {
        return this.newestTime;
    }

    public final void setNewestTime(@Nullable Long l7) {
        this.newestTime = l7;
    }
}
