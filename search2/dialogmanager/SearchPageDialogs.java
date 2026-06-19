package com.bilibili.search2.dialogmanager;

import androidx.room.RoomDatabase;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/dialogmanager/SearchPageDialogs.class */
public final class SearchPageDialogs {
    private static final EnumEntries $ENTRIES;
    private static final SearchPageDialogs[] $VALUES;

    @NotNull
    private final String key;
    private final int priority;
    public static final SearchPageDialogs DOWN_PULL_REFRESH_BUBBLE = new SearchPageDialogs("DOWN_PULL_REFRESH_BUBBLE", 0, "down_pull_refresh_bubble", 1000);
    public static final SearchPageDialogs DOWN_PULL_REFRESH_SUCCESS_BUBBLE = new SearchPageDialogs("DOWN_PULL_REFRESH_SUCCESS_BUBBLE", 1, "down_pull_refresh_success_bubble", RoomDatabase.MAX_BIND_PARAMETER_CNT);
    public static final SearchPageDialogs FILTER_BUBBLE = new SearchPageDialogs("FILTER_BUBBLE", 2, "search_filter_bubble", 1001);
    public static final SearchPageDialogs AUTHOR_SHARE_BUBBLE = new SearchPageDialogs("AUTHOR_SHARE_BUBBLE", 3, "author_share_bubble", 998);
    public static final SearchPageDialogs AD_INSTALLED_OPEN_DIALOG = new SearchPageDialogs("AD_INSTALLED_OPEN_DIALOG", 4, "ad_installed_open_dialog", 2000);

    private static final /* synthetic */ SearchPageDialogs[] $values() {
        return new SearchPageDialogs[]{DOWN_PULL_REFRESH_BUBBLE, DOWN_PULL_REFRESH_SUCCESS_BUBBLE, FILTER_BUBBLE, AUTHOR_SHARE_BUBBLE, AD_INSTALLED_OPEN_DIALOG};
    }

    static {
        SearchPageDialogs[] searchPageDialogsArr$values = $values();
        $VALUES = searchPageDialogsArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(searchPageDialogsArr$values);
    }

    private SearchPageDialogs(String str, int i7, String str2, int i8) {
        this.key = str2;
        this.priority = i8;
    }

    @NotNull
    public static EnumEntries<SearchPageDialogs> getEntries() {
        return $ENTRIES;
    }

    public static SearchPageDialogs valueOf(String str) {
        return (SearchPageDialogs) Enum.valueOf(SearchPageDialogs.class, str);
    }

    public static SearchPageDialogs[] values() {
        return (SearchPageDialogs[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getPriority() {
        return this.priority;
    }
}
