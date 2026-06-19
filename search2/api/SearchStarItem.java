package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchStarBannerCard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchStarItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchStarItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "badge")
    @Nullable
    private Tag badge;

    @JSONField(name = "bg_image")
    @Nullable
    private String bgImage;

    @JSONField(name = "card_desc")
    @Nullable
    private String cardDesc;

    public SearchStarItem(@NotNull SearchStarBannerCard searchStarBannerCard) {
        setTitle(searchStarBannerCard.getTitle());
        setCover(searchStarBannerCard.getCover());
        this.bgImage = searchStarBannerCard.getBgImage();
        this.cardDesc = searchStarBannerCard.getCardDesc();
        this.badge = new Tag(searchStarBannerCard.getBadge());
    }

    @Nullable
    public final Tag getBadge() {
        return this.badge;
    }

    @Nullable
    public final String getBgImage() {
        return this.bgImage;
    }

    @Nullable
    public final String getCardDesc() {
        return this.cardDesc;
    }

    public final void setBadge(@Nullable Tag tag) {
        this.badge = tag;
    }

    public final void setBgImage(@Nullable String str) {
        this.bgImage = str;
    }

    public final void setCardDesc(@Nullable String str) {
        this.cardDesc = str;
    }
}
