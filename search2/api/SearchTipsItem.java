package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchTipsCard;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchTipsItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchTipsItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "cover_night")
    @Nullable
    private String coverNight;

    @JSONField(name = "sub_title")
    @Nullable
    private String subTitle;

    public SearchTipsItem() {
        this(null, null, 3, null);
    }

    public SearchTipsItem(@NotNull SearchTipsCard searchTipsCard) {
        this(null, null, 3, null);
        this.coverNight = searchTipsCard.getCoverNight();
        this.subTitle = searchTipsCard.getSubTitle();
        setTitle(searchTipsCard.getTitle());
        setCover(searchTipsCard.getCover());
    }

    public SearchTipsItem(@Nullable String str, @Nullable String str2) {
        this.coverNight = str;
        this.subTitle = str2;
    }

    public /* synthetic */ SearchTipsItem(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ SearchTipsItem copy$default(SearchTipsItem searchTipsItem, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = searchTipsItem.coverNight;
        }
        if ((i7 & 2) != 0) {
            str2 = searchTipsItem.subTitle;
        }
        return searchTipsItem.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.coverNight;
    }

    @Nullable
    public final String component2() {
        return this.subTitle;
    }

    @NotNull
    public final SearchTipsItem copy(@Nullable String str, @Nullable String str2) {
        return new SearchTipsItem(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTipsItem)) {
            return false;
        }
        SearchTipsItem searchTipsItem = (SearchTipsItem) obj;
        return Intrinsics.areEqual(this.coverNight, searchTipsItem.coverNight) && Intrinsics.areEqual(this.subTitle, searchTipsItem.subTitle);
    }

    @Nullable
    public final String getCoverNight() {
        return this.coverNight;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    public int hashCode() {
        String str = this.coverNight;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.subTitle;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setCoverNight(@Nullable String str) {
        this.coverNight = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    @NotNull
    public String toString() {
        return p.a("SearchTipsItem(coverNight=", this.coverNight, ", subTitle=", this.subTitle, ")");
    }
}
