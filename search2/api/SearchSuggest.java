package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSuggest.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchSuggest {
    public static final int $stable = 8;

    @JSONField(name = "exp_str")
    @Nullable
    private String expStr;

    @JSONField(name = "list")
    @Nullable
    private List<? extends Rs0.a> list;

    @JSONField(name = "trackid")
    @Nullable
    private String trackId;

    @JSONField(deserialize = false, serialize = false)
    private int version;

    @Nullable
    public final String getExpStr() {
        return this.expStr;
    }

    @Nullable
    public final List<Rs0.a> getList() {
        return this.list;
    }

    @Nullable
    public final String getTrackId() {
        return this.trackId;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setExpStr(@Nullable String str) {
        this.expStr = str;
    }

    public final void setList(@Nullable List<? extends Rs0.a> list) {
        this.list = list;
    }

    public final void setTrackId(@Nullable String str) {
        this.trackId = str;
    }

    public final void setVersion(int i7) {
        this.version = i7;
    }
}
