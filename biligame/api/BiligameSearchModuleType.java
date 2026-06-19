package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSearchModuleType.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameSearchModuleType {
    public static final int $stable = 8;

    @JSONField(name = "module_type")
    private int moduleType = 1;

    public final int getModuleType() {
        return this.moduleType;
    }

    public final void setModuleType(int i7) {
        this.moduleType = i7;
    }
}
