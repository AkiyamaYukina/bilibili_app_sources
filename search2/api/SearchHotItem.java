package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.polymer.app.search.v1.SearchHotBannerCard;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchHotItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchHotItem extends BaseSearchItem {
    public static final int $stable = 8;

    @Nullable
    private final String description;

    @Nullable
    private final String icon;

    @Nullable
    private final String iconNight;

    @Nullable
    private final String moreText;

    @Nullable
    private final String moreUrl;

    @Nullable
    private String title;

    public SearchHotItem(@NotNull SearchHotBannerCard searchHotBannerCard) {
        this.icon = searchHotBannerCard.getIcon();
        this.iconNight = searchHotBannerCard.getIconNight();
        this.moreText = searchHotBannerCard.getMoreText();
        this.moreUrl = searchHotBannerCard.getMoreUrl();
        this.description = searchHotBannerCard.getDescription();
        this.title = searchHotBannerCard.getTitle();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHotItem)) {
            return false;
        }
        SearchHotItem searchHotItem = (SearchHotItem) obj;
        if (Intrinsics.areEqual(this.icon, searchHotItem.icon) && Intrinsics.areEqual(this.iconNight, searchHotItem.iconNight) && Intrinsics.areEqual(this.moreText, searchHotItem.moreText) && Intrinsics.areEqual(this.moreUrl, searchHotItem.moreUrl) && Intrinsics.areEqual(this.description, searchHotItem.description)) {
            return super/*java.lang.Object*/.equals(obj);
        }
        return false;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIconNight() {
        return this.iconNight;
    }

    @Nullable
    public final String getMoreText() {
        return this.moreText;
    }

    @Nullable
    public final String getMoreUrl() {
        return this.moreUrl;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = 0;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.iconNight;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.moreText;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.moreUrl;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.description;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode + super/*java.lang.Object*/.hashCode();
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setTitle(@Nullable String str) {
        this.title = str;
    }
}
