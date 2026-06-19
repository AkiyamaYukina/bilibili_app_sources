package com.bilibili.search2.api.oversea;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/oversea/a.class */
public interface a {
    @NotNull
    default List<a> getAllItems() {
        List<a> subItems = getSubItems();
        return (subItems == null || subItems.isEmpty()) ? CollectionsKt.listOf(this) : getSubItems();
    }

    @NotNull
    default List<a> getSubItems() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    String getTitle();

    @NotNull
    c getTranslateRequestParam();

    long getTranslatedStatus();

    @Nullable
    String getTranslatedTitle();

    void setTranslatedStatus(long j7);

    void setTranslatedTitle(@Nullable String str);
}
