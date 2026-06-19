package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.B;
import androidx.fragment.app.z;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/TabInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class TabInfo {
    public static final int $stable = 8;
    private boolean hasClick;

    @JSONField(name = "sort")
    @Nullable
    private Integer sort;

    @JSONField(name = "tab_name")
    @Nullable
    private String tabName;

    @JSONField(name = "tab_url")
    @Nullable
    private String tabUrl;

    public TabInfo() {
        this(null, null, null, false, 15, null);
    }

    public TabInfo(@Nullable Integer num, @Nullable String str, @Nullable String str2, @JSONField(deserialize = false, serialize = false) boolean z6) {
        this.sort = num;
        this.tabName = str;
        this.tabUrl = str2;
        this.hasClick = z6;
    }

    public /* synthetic */ TabInfo(Integer num, String str, String str2, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : num, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? false : z6);
    }

    public static /* synthetic */ TabInfo copy$default(TabInfo tabInfo, Integer num, String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = tabInfo.sort;
        }
        if ((i7 & 2) != 0) {
            str = tabInfo.tabName;
        }
        if ((i7 & 4) != 0) {
            str2 = tabInfo.tabUrl;
        }
        if ((i7 & 8) != 0) {
            z6 = tabInfo.hasClick;
        }
        return tabInfo.copy(num, str, str2, z6);
    }

    @Nullable
    public final Integer component1() {
        return this.sort;
    }

    @Nullable
    public final String component2() {
        return this.tabName;
    }

    @Nullable
    public final String component3() {
        return this.tabUrl;
    }

    public final boolean component4() {
        return this.hasClick;
    }

    @NotNull
    public final TabInfo copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, @JSONField(deserialize = false, serialize = false) boolean z6) {
        return new TabInfo(num, str, str2, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabInfo)) {
            return false;
        }
        TabInfo tabInfo = (TabInfo) obj;
        return Intrinsics.areEqual(this.sort, tabInfo.sort) && Intrinsics.areEqual(this.tabName, tabInfo.tabName) && Intrinsics.areEqual(this.tabUrl, tabInfo.tabUrl) && this.hasClick == tabInfo.hasClick;
    }

    public final boolean getHasClick() {
        return this.hasClick;
    }

    @Nullable
    public final Integer getSort() {
        return this.sort;
    }

    @Nullable
    public final String getTabName() {
        return this.tabName;
    }

    @Nullable
    public final String getTabUrl() {
        return this.tabUrl;
    }

    public int hashCode() {
        Integer num = this.sort;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.tabName;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.tabUrl;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Boolean.hashCode(this.hasClick) + (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31);
    }

    public final void setHasClick(boolean z6) {
        this.hasClick = z6;
    }

    public final void setSort(@Nullable Integer num) {
        this.sort = num;
    }

    public final void setTabName(@Nullable String str) {
        this.tabName = str;
    }

    public final void setTabUrl(@Nullable String str) {
        this.tabUrl = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.sort;
        String str = this.tabName;
        return B.c(this.tabUrl, ", hasClick=", ")", z.b("TabInfo(sort=", num, ", tabName=", str, ", tabUrl="), this.hasClick);
    }
}
