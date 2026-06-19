package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.account.interfaces.v1.k;
import com.bapis.bilibili.polymer.app.search.v1.SearchNPSCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchNpsItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchNpsItem extends BaseSearchItem {
    public static final int $stable = 8;

    @NotNull
    private final List<String> options;

    public SearchNpsItem() {
        this(null, 1, null);
    }

    public SearchNpsItem(@NotNull SearchNPSCard searchNPSCard) {
        this(null, 1, null);
        setTitle(searchNPSCard.getTitle());
        Iterator it = CollectionsKt.filterNotNull(searchNPSCard.getOptionsList()).iterator();
        while (it.hasNext()) {
            this.options.add(((SearchNPSCard.Option) it.next()).getText());
        }
    }

    public SearchNpsItem(@NotNull List<String> list) {
        this.options = list;
    }

    public /* synthetic */ SearchNpsItem(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<String>) ((i7 & 1) != 0 ? new ArrayList() : list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchNpsItem copy$default(SearchNpsItem searchNpsItem, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = searchNpsItem.options;
        }
        return searchNpsItem.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.options;
    }

    @NotNull
    public final SearchNpsItem copy(@NotNull List<String> list) {
        return new SearchNpsItem(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchNpsItem) && Intrinsics.areEqual(this.options, ((SearchNpsItem) obj).options);
    }

    @NotNull
    public final List<String> getOptions() {
        return this.options;
    }

    public int hashCode() {
        return this.options.hashCode();
    }

    @NotNull
    public String toString() {
        return k.a("SearchNpsItem(options=", ")", this.options);
    }
}
