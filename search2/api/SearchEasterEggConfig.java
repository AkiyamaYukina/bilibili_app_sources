package com.bilibili.search2.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.okretro.BaseResponse;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchEasterEggConfig.class */
@StabilityInferred(parameters = 0)
public final class SearchEasterEggConfig extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    private static final long serialVersionUID = 156464231564L;

    @JSONField(name = "data")
    @Nullable
    private List<SearchEasterEggItem> list;

    @JSONField(name = "ver")
    @Nullable
    private String version;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchEasterEggConfig$a.class */
    public static final class a {
    }

    @Nullable
    public final List<SearchEasterEggItem> getList() {
        return this.list;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setList(@Nullable List<SearchEasterEggItem> list) {
        this.list = list;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }
}
