package com.bilibili.search2.result.holder.recommend;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.Item;
import com.bapis.bilibili.polymer.app.search.v1.SearchUPRecommend;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchResultAll;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/SearchUPRecommendItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchUPRecommendItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "id")
    private long id;

    @JSONField(name = "more_text")
    @Nullable
    private String moreText;

    @JSONField(name = "more_url")
    @Nullable
    private String moreUrl;

    @JSONField(name = "show_follow_button")
    private int showFollowButton;

    @JSONField(name = "card_style")
    private int style;

    @JSONField(name = "items")
    @Nullable
    private List<UPRecommendItem> upItems;

    public SearchUPRecommendItem(@NotNull SearchUPRecommend searchUPRecommend, @NotNull Item item, @NotNull SearchResultAll searchResultAll) {
        this.style = 1;
        this.id = searchUPRecommend.getId();
        this.style = searchUPRecommend.getCardStyle();
        this.moreUrl = searchUPRecommend.getMoreUrl();
        this.moreText = searchUPRecommend.getMoreText();
        setTitle(searchUPRecommend.getTitle());
        this.showFollowButton = searchUPRecommend.getShowFollowButton();
        ArrayList arrayList = new ArrayList();
        Iterator it = searchUPRecommend.getItemsList().iterator();
        while (it.hasNext()) {
            arrayList.add(new UPRecommendItem((com.bapis.bilibili.polymer.app.search.v1.UPRecommendItem) it.next(), item, searchResultAll));
        }
        this.upItems = arrayList;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getMoreText() {
        return this.moreText;
    }

    @Nullable
    public final String getMoreUrl() {
        return this.moreUrl;
    }

    public final int getStyle() {
        return this.style;
    }

    @Nullable
    public final List<UPRecommendItem> getUpItems() {
        return this.upItems;
    }

    public final boolean isShowFollowButton() {
        boolean z6 = true;
        if (this.showFollowButton != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setMoreText(@Nullable String str) {
        this.moreText = str;
    }

    public final void setMoreUrl(@Nullable String str) {
        this.moreUrl = str;
    }

    public final void setStyle(int i7) {
        this.style = i7;
    }

    public final void setUpItems(@Nullable List<UPRecommendItem> list) {
        this.upItems = list;
    }
}
