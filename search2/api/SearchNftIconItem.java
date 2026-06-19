package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.NftFaceIcon;
import com.bilibili.lib.avatar.ZoomingType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchNftIconItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchNftIconItem {
    public static final int $stable = 8;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @JSONField(name = "region_type")
    private int regionType;

    @JSONField(name = "show_status")
    private int showStatus;

    public SearchNftIconItem() {
        this(0, null, 0, 7, null);
    }

    public SearchNftIconItem(int i7, @Nullable String str, int i8) {
        this.regionType = i7;
        this.icon = str;
        this.showStatus = i8;
    }

    public /* synthetic */ SearchNftIconItem(int i7, String str, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? 0 : i8);
    }

    public SearchNftIconItem(@NotNull NftFaceIcon nftFaceIcon) {
        this(nftFaceIcon.getRegionType(), nftFaceIcon.getIcon(), nftFaceIcon.getShowStatus());
    }

    public static /* synthetic */ SearchNftIconItem copy$default(SearchNftIconItem searchNftIconItem, int i7, String str, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = searchNftIconItem.regionType;
        }
        if ((i9 & 2) != 0) {
            str = searchNftIconItem.icon;
        }
        if ((i9 & 4) != 0) {
            i8 = searchNftIconItem.showStatus;
        }
        return searchNftIconItem.copy(i7, str, i8);
    }

    public final int component1() {
        return this.regionType;
    }

    @Nullable
    public final String component2() {
        return this.icon;
    }

    public final int component3() {
        return this.showStatus;
    }

    @NotNull
    public final com.bilibili.lib.avatar.a convertToNftInfo() {
        int value = ZoomingType.RAW.getValue();
        this.showStatus = value;
        return new com.bilibili.lib.avatar.a(this.regionType, value, this.icon, true);
    }

    @NotNull
    public final SearchNftIconItem copy(int i7, @Nullable String str, int i8) {
        return new SearchNftIconItem(i7, str, i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchNftIconItem)) {
            return false;
        }
        SearchNftIconItem searchNftIconItem = (SearchNftIconItem) obj;
        return this.regionType == searchNftIconItem.regionType && Intrinsics.areEqual(this.icon, searchNftIconItem.icon) && this.showStatus == searchNftIconItem.showStatus;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getRegionType() {
        return this.regionType;
    }

    public final int getShowStatus() {
        return this.showStatus;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.regionType);
        String str = this.icon;
        return Integer.hashCode(this.showStatus) + (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setRegionType(int i7) {
        this.regionType = i7;
    }

    public final void setShowStatus(int i7) {
        this.showStatus = i7;
    }

    @NotNull
    public String toString() {
        return C4277b.a(this.showStatus, ")", bilibili.live.app.service.resolver.a.b(this.regionType, "SearchNftIconItem(regionType=", ", icon=", this.icon, ", showStatus="));
    }
}
