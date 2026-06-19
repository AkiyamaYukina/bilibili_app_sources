package com.bilibili.playerbizcommonv2.widget.quality;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/QualityItemStyle.class */
public final class QualityItemStyle {
    private static final EnumEntries $ENTRIES;
    private static final QualityItemStyle[] $VALUES;
    public static final QualityItemStyle FunctionWidget = new QualityItemStyle("FunctionWidget", 0);
    public static final QualityItemStyle Dialog = new QualityItemStyle("Dialog", 1);

    private static final /* synthetic */ QualityItemStyle[] $values() {
        return new QualityItemStyle[]{FunctionWidget, Dialog};
    }

    static {
        QualityItemStyle[] qualityItemStyleArr$values = $values();
        $VALUES = qualityItemStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(qualityItemStyleArr$values);
    }

    private QualityItemStyle(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<QualityItemStyle> getEntries() {
        return $ENTRIES;
    }

    public static QualityItemStyle valueOf(String str) {
        return (QualityItemStyle) Enum.valueOf(QualityItemStyle.class, str);
    }

    public static QualityItemStyle[] values() {
        return (QualityItemStyle[]) $VALUES.clone();
    }
}
