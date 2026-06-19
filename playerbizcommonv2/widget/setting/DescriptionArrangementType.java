package com.bilibili.playerbizcommonv2.widget.setting;

import com.bilibili.live.streaming.source.TextSource;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/DescriptionArrangementType.class */
public final class DescriptionArrangementType {
    private static final EnumEntries $ENTRIES;
    private static final DescriptionArrangementType[] $VALUES;
    public static final DescriptionArrangementType Vertical = new DescriptionArrangementType(TextSource.STR_SCROLL_VERTICAL, 0);
    public static final DescriptionArrangementType Horizontal = new DescriptionArrangementType(TextSource.STR_SCROLL_HORIZONTAL, 1);

    private static final /* synthetic */ DescriptionArrangementType[] $values() {
        return new DescriptionArrangementType[]{Vertical, Horizontal};
    }

    static {
        DescriptionArrangementType[] descriptionArrangementTypeArr$values = $values();
        $VALUES = descriptionArrangementTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(descriptionArrangementTypeArr$values);
    }

    private DescriptionArrangementType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<DescriptionArrangementType> getEntries() {
        return $ENTRIES;
    }

    public static DescriptionArrangementType valueOf(String str) {
        return (DescriptionArrangementType) Enum.valueOf(DescriptionArrangementType.class, str);
    }

    public static DescriptionArrangementType[] values() {
        return (DescriptionArrangementType[]) $VALUES.clone();
    }
}
