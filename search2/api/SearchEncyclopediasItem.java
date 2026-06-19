package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.account.interfaces.v1.k;
import com.bapis.bilibili.polymer.app.search.v1.SearchPediaPicCard;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchEncyclopediasItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchEncyclopediasItem extends BaseSearchItem {
    public static final int $stable = 8;
    private int coverType;

    @JSONField(name = "pic_navigation")
    @Nullable
    private List<PicNavigation> picNavigation;

    public SearchEncyclopediasItem() {
        this(null, 1, null);
    }

    public SearchEncyclopediasItem(@NotNull SearchPediaPicCard searchPediaPicCard) {
        this(null, 1, null);
        setCover(searchPediaPicCard.getCover());
        ArrayList arrayList = new ArrayList();
        for (com.bapis.bilibili.polymer.app.search.v1.PicNavigation picNavigation : searchPediaPicCard.getPicNavigationList()) {
            arrayList.add(new PicNavigation(picNavigation.getTitle(), picNavigation.getUri(), picNavigation.getCoverSunUrl(), picNavigation.getCoverNightUrl()));
        }
        if (!arrayList.isEmpty()) {
            this.picNavigation = arrayList;
        }
        this.coverType = searchPediaPicCard.getCoverType();
    }

    public SearchEncyclopediasItem(@Nullable List<PicNavigation> list) {
        this.picNavigation = list;
    }

    public /* synthetic */ SearchEncyclopediasItem(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<PicNavigation>) ((i7 & 1) != 0 ? null : list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchEncyclopediasItem copy$default(SearchEncyclopediasItem searchEncyclopediasItem, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = searchEncyclopediasItem.picNavigation;
        }
        return searchEncyclopediasItem.copy(list);
    }

    @Nullable
    public final List<PicNavigation> component1() {
        return this.picNavigation;
    }

    @NotNull
    public final SearchEncyclopediasItem copy(@Nullable List<PicNavigation> list) {
        return new SearchEncyclopediasItem(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchEncyclopediasItem) && Intrinsics.areEqual(this.picNavigation, ((SearchEncyclopediasItem) obj).picNavigation);
    }

    public final int getCoverType() {
        return this.coverType;
    }

    @Nullable
    public final List<PicNavigation> getPicNavigation() {
        return this.picNavigation;
    }

    public int hashCode() {
        List<PicNavigation> list = this.picNavigation;
        return list == null ? 0 : list.hashCode();
    }

    public final void setPicNavigation(@Nullable List<PicNavigation> list) {
        this.picNavigation = list;
    }

    @NotNull
    public String toString() {
        return k.a("SearchEncyclopediasItem(picNavigation=", ")", this.picNavigation);
    }
}
