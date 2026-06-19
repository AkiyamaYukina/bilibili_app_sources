package com.bilibili.ogv.kmm.operation.page;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/MoreLoadingState.class */
public final class MoreLoadingState {
    private static final EnumEntries $ENTRIES;
    private static final MoreLoadingState[] $VALUES;
    public static final MoreLoadingState IDLE = new MoreLoadingState("IDLE", 0);
    public static final MoreLoadingState LOADING = new MoreLoadingState("LOADING", 1);
    public static final MoreLoadingState NO_MORE = new MoreLoadingState("NO_MORE", 2);
    public static final MoreLoadingState ERROR = new MoreLoadingState("ERROR", 3);

    private static final /* synthetic */ MoreLoadingState[] $values() {
        return new MoreLoadingState[]{IDLE, LOADING, NO_MORE, ERROR};
    }

    static {
        MoreLoadingState[] moreLoadingStateArr$values = $values();
        $VALUES = moreLoadingStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(moreLoadingStateArr$values);
    }

    private MoreLoadingState(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<MoreLoadingState> getEntries() {
        return $ENTRIES;
    }

    public static MoreLoadingState valueOf(String str) {
        return (MoreLoadingState) Enum.valueOf(MoreLoadingState.class, str);
    }

    public static MoreLoadingState[] values() {
        return (MoreLoadingState[]) $VALUES.clone();
    }
}
