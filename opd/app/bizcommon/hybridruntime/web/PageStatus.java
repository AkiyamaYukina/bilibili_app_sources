package com.bilibili.opd.app.bizcommon.hybridruntime.web;

import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/PageStatus.class */
public final class PageStatus {
    private static final EnumEntries $ENTRIES;
    private static final PageStatus[] $VALUES;
    public static final PageStatus UNKOWN = new PageStatus("UNKOWN", 0);
    public static final PageStatus LOADING = new PageStatus("LOADING", 1);
    public static final PageStatus SUCCESS = new PageStatus(BCGToken.SCHEDULE_STATUS_SUCCESS, 2);
    public static final PageStatus FAIL = new PageStatus("FAIL", 3);
    public static final PageStatus VIEW_EMPTY = new PageStatus("VIEW_EMPTY", 4);
    public static final PageStatus URL_EMPTY = new PageStatus("URL_EMPTY", 5);

    private static final /* synthetic */ PageStatus[] $values() {
        return new PageStatus[]{UNKOWN, LOADING, SUCCESS, FAIL, VIEW_EMPTY, URL_EMPTY};
    }

    static {
        PageStatus[] pageStatusArr$values = $values();
        $VALUES = pageStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pageStatusArr$values);
    }

    private PageStatus(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<PageStatus> getEntries() {
        return $ENTRIES;
    }

    public static PageStatus valueOf(String str) {
        return (PageStatus) Enum.valueOf(PageStatus.class, str);
    }

    public static PageStatus[] values() {
        return (PageStatus[]) $VALUES.clone();
    }
}
