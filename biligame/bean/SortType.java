package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/SortType.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SortType {
    public static final int $stable = 8;

    @JSONField(name = "sort_type")
    private int sortType;

    @JSONField(name = "sort_type_name")
    @Nullable
    private String sortTypeName;

    public final int getSortType() {
        return this.sortType;
    }

    @Nullable
    public final String getSortTypeName() {
        return this.sortTypeName;
    }

    public final void setSortType(int i7) {
        this.sortType = i7;
    }

    public final void setSortTypeName(@Nullable String str) {
        this.sortTypeName = str;
    }
}
