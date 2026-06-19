package com.bilibili.biligame.api.search;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameSearchV2Discover;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/search/BiligameSearchDiscoverResp.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameSearchDiscoverResp {
    public static final int $stable = 8;

    @JSONField(name = "game_event_list")
    @Nullable
    private List<BiligameSearchV2Discover> gameEventList;

    @JSONField(name = "operation_list")
    @Nullable
    private List<BiligameSearchV2Discover> operationList;

    @Nullable
    public final List<BiligameSearchV2Discover> getGameEventList() {
        return this.gameEventList;
    }

    @Nullable
    public final List<BiligameSearchV2Discover> getOperationList() {
        return this.operationList;
    }

    public final boolean isEmpty() {
        List<BiligameSearchV2Discover> list;
        List<BiligameSearchV2Discover> list2 = this.operationList;
        return (list2 == null || list2.isEmpty()) && ((list = this.gameEventList) == null || list.isEmpty());
    }

    public final void setGameEventList(@Nullable List<BiligameSearchV2Discover> list) {
        this.gameEventList = list;
    }

    public final void setOperationList(@Nullable List<BiligameSearchV2Discover> list) {
        this.operationList = list;
    }
}
