package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.polymer.app.search.v1.SearchHotRecommend;
import com.bapis.bilibili.polymer.app.search.v1.SearchRecommendTipCard;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchRecommendTipItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchRecommendTipItem extends BaseSearchItem {
    public static final int $stable = 8;

    public SearchRecommendTipItem() {
    }

    public SearchRecommendTipItem(@NotNull SearchHotRecommend searchHotRecommend) {
        this();
        setTitle(searchHotRecommend.getTitle());
        setCover(searchHotRecommend.getCover());
    }

    public SearchRecommendTipItem(@NotNull SearchRecommendTipCard searchRecommendTipCard) {
        this();
        setTitle(searchRecommendTipCard.getTitle());
        setCover(searchRecommendTipCard.getCover());
    }
}
