package com.bilibili.search2.api;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/OgvClusterInlineTitleStyle.class */
public final class OgvClusterInlineTitleStyle {
    private static final EnumEntries $ENTRIES;
    private static final OgvClusterInlineTitleStyle[] $VALUES;
    private final int style;
    public static final OgvClusterInlineTitleStyle INLINE_TITLE_UNKNOWN = new OgvClusterInlineTitleStyle("INLINE_TITLE_UNKNOWN", 0, 0);
    public static final OgvClusterInlineTitleStyle INLINE_TITLE_NONE = new OgvClusterInlineTitleStyle("INLINE_TITLE_NONE", 1, 1);
    public static final OgvClusterInlineTitleStyle INLINE_TITLE_ONLY_TITLE = new OgvClusterInlineTitleStyle("INLINE_TITLE_ONLY_TITLE", 2, 2);
    public static final OgvClusterInlineTitleStyle INLINE_TITLE_ORIGIN_TITLE = new OgvClusterInlineTitleStyle("INLINE_TITLE_ORIGIN_TITLE", 3, 3);

    private static final /* synthetic */ OgvClusterInlineTitleStyle[] $values() {
        return new OgvClusterInlineTitleStyle[]{INLINE_TITLE_UNKNOWN, INLINE_TITLE_NONE, INLINE_TITLE_ONLY_TITLE, INLINE_TITLE_ORIGIN_TITLE};
    }

    static {
        OgvClusterInlineTitleStyle[] ogvClusterInlineTitleStyleArr$values = $values();
        $VALUES = ogvClusterInlineTitleStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(ogvClusterInlineTitleStyleArr$values);
    }

    private OgvClusterInlineTitleStyle(String str, int i7, int i8) {
        this.style = i8;
    }

    @NotNull
    public static EnumEntries<OgvClusterInlineTitleStyle> getEntries() {
        return $ENTRIES;
    }

    public static OgvClusterInlineTitleStyle valueOf(String str) {
        return (OgvClusterInlineTitleStyle) Enum.valueOf(OgvClusterInlineTitleStyle.class, str);
    }

    public static OgvClusterInlineTitleStyle[] values() {
        return (OgvClusterInlineTitleStyle[]) $VALUES.clone();
    }

    public final int getStyle() {
        return this.style;
    }
}
