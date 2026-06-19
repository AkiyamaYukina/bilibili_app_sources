package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchSpecialGuideCard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSpecialGuideItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchSpecialGuideItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "phone")
    @Nullable
    private String phone;

    public SearchSpecialGuideItem() {
    }

    public SearchSpecialGuideItem(@NotNull SearchSpecialGuideCard searchSpecialGuideCard) {
        this.phone = searchSpecialGuideCard.getPhone();
        this.desc = searchSpecialGuideCard.getDesc();
        setTitle(searchSpecialGuideCard.getTitle());
        setCover(searchSpecialGuideCard.getCover());
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }
}
