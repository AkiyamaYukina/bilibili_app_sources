package com.bilibili.search2.result.ogv.aggregate.subpage;

import Ps0.C2786g;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.VerticalSearchResult;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/subpage/BiliSearchOgvAggregateResult.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiliSearchOgvAggregateResult extends VerticalSearchResult<BaseSearchItem> {
    public static final int $stable = 8;

    @Nullable
    private List<C2786g> extraWordList;
    private boolean needOrder;

    @Nullable
    public final List<C2786g> getExtraWordList() {
        return this.extraWordList;
    }

    public final boolean getNeedOrder() {
        return this.needOrder;
    }

    public final void setExtraWordList(@Nullable List<C2786g> list) {
        this.extraWordList = list;
    }

    public final void setNeedOrder(boolean z6) {
        this.needOrder = z6;
    }
}
