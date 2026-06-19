package com.bilibili.playset.checkin;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.playset.api.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ks0.AbstractC7785a;
import ks0.InterfaceC7786b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/CheckInList.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CheckInList extends AbstractC7785a<InterfaceC7786b> {
    public static final int $stable = 8;

    @Nullable
    private List<InterfaceC7786b> items;

    @JSONField(name = "list")
    @Nullable
    private List<CheckInItem> list;

    @JSONField(name = MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
    @Nullable
    private Page page;

    @JSONField(name = "tab_name")
    @Nullable
    private String tabName;

    public CheckInList() {
        this(null, null, null, 7, null);
    }

    public CheckInList(@Nullable List<CheckInItem> list, @Nullable Page page, @Nullable String str) {
        this.list = list;
        this.page = page;
        this.tabName = str;
    }

    public /* synthetic */ CheckInList(List list, Page page, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : page, (i7 & 4) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckInList copy$default(CheckInList checkInList, List list, Page page, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = checkInList.list;
        }
        if ((i7 & 2) != 0) {
            page = checkInList.page;
        }
        if ((i7 & 4) != 0) {
            str = checkInList.tabName;
        }
        return checkInList.copy(list, page, str);
    }

    @Override // ks0.AbstractC7785a
    public void addItems(@NotNull List<InterfaceC7786b> list) {
        if (this.list == null) {
            this.list = new ArrayList();
        }
        List<InterfaceC7786b> list2 = this.items;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int size = this.items.size();
        int i7 = size;
        if (size > 0) {
            i7 = size;
            if (getItems().get(size - 1) instanceof f) {
                i7 = size - 1;
            }
        }
        getItems().addAll(i7, list);
    }

    @Nullable
    public final List<CheckInItem> component1() {
        return this.list;
    }

    @Nullable
    public final Page component2() {
        return this.page;
    }

    @Nullable
    public final String component3() {
        return this.tabName;
    }

    @NotNull
    public final CheckInList copy(@Nullable List<CheckInItem> list, @Nullable Page page, @Nullable String str) {
        return new CheckInList(list, page, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckInList)) {
            return false;
        }
        CheckInList checkInList = (CheckInList) obj;
        return Intrinsics.areEqual(this.list, checkInList.list) && Intrinsics.areEqual(this.page, checkInList.page) && Intrinsics.areEqual(this.tabName, checkInList.tabName);
    }

    @Override // ks0.AbstractC7785a
    public int getGroupType() {
        return 1;
    }

    @Override // ls0.c
    @Nullable
    public List<InterfaceC7786b> getItems() {
        if (this.items == null) {
            this.items = new ArrayList();
            List<CheckInItem> list = this.list;
            if (list != null && !list.isEmpty()) {
                this.items.addAll(this.list);
            }
        }
        return this.items;
    }

    @Nullable
    public final List<CheckInItem> getList() {
        return this.list;
    }

    @Nullable
    public final Page getPage() {
        return this.page;
    }

    @Nullable
    public final String getTabName() {
        return this.tabName;
    }

    public int hashCode() {
        List<CheckInItem> list = this.list;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Page page = this.page;
        int iHashCode3 = page == null ? 0 : page.hashCode();
        String str = this.tabName;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final void setList(@Nullable List<CheckInItem> list) {
        this.list = list;
    }

    public final void setPage(@Nullable Page page) {
        this.page = page;
    }

    public final void setTabName(@Nullable String str) {
        this.tabName = str;
    }

    @NotNull
    public String toString() {
        List<CheckInItem> list = this.list;
        Page page = this.page;
        String str = this.tabName;
        StringBuilder sb = new StringBuilder("CheckInList(list=");
        sb.append(list);
        sb.append(", page=");
        sb.append(page);
        sb.append(", tabName=");
        return C8770a.a(sb, str, ")");
    }
}
