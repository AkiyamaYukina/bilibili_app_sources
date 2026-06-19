package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/HotActListInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class HotActListInfo implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "has_more")
    private boolean hasMore;
    private int index;

    @Nullable
    private List<ActivityInfoBean> list = CollectionsKt.emptyList();

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final List<ActivityInfoBean> getList() {
        return this.list;
    }

    public final void setHasMore(boolean z6) {
        this.hasMore = z6;
    }

    public final void setIndex(int i7) {
        this.index = i7;
    }

    public final void setList(@Nullable List<ActivityInfoBean> list) {
        this.list = list;
    }
}
