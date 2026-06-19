package com.bilibili.biligame.api.bean.discover;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/discover/DiscoverTabResp.class */
@StabilityInferred(parameters = 0)
@Keep
public final class DiscoverTabResp implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "type")
    @Nullable
    private String type;

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
