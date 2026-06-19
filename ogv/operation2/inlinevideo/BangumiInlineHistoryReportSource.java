package com.bilibili.ogv.operation2.inlinevideo;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/BangumiInlineHistoryReportSource.class */
public final class BangumiInlineHistoryReportSource {
    private static final EnumEntries $ENTRIES;
    private static final BangumiInlineHistoryReportSource[] $VALUES;
    public static final BangumiInlineHistoryReportSource CINEMA_INLINE = new BangumiInlineHistoryReportSource("CINEMA_INLINE", 0, "cinema-inline");

    @NotNull
    private final String fromId;

    private static final /* synthetic */ BangumiInlineHistoryReportSource[] $values() {
        return new BangumiInlineHistoryReportSource[]{CINEMA_INLINE};
    }

    static {
        BangumiInlineHistoryReportSource[] bangumiInlineHistoryReportSourceArr$values = $values();
        $VALUES = bangumiInlineHistoryReportSourceArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bangumiInlineHistoryReportSourceArr$values);
    }

    private BangumiInlineHistoryReportSource(String str, int i7, String str2) {
        this.fromId = str2;
    }

    @NotNull
    public static EnumEntries<BangumiInlineHistoryReportSource> getEntries() {
        return $ENTRIES;
    }

    public static BangumiInlineHistoryReportSource valueOf(String str) {
        return (BangumiInlineHistoryReportSource) Enum.valueOf(BangumiInlineHistoryReportSource.class, str);
    }

    public static BangumiInlineHistoryReportSource[] values() {
        return (BangumiInlineHistoryReportSource[]) $VALUES.clone();
    }

    @NotNull
    public final String getFromId() {
        return this.fromId;
    }
}
