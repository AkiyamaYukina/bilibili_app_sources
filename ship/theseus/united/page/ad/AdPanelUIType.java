package com.bilibili.ship.theseus.united.page.ad;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelUIType.class */
public final class AdPanelUIType {
    private static final EnumEntries $ENTRIES;
    private static final AdPanelUIType[] $VALUES;
    public static final AdPanelUIType Normal = new AdPanelUIType("Normal", 0);
    public static final AdPanelUIType UnderType = new AdPanelUIType("UnderType", 1);
    public static final AdPanelUIType PageCoverType = new AdPanelUIType("PageCoverType", 2);

    private static final /* synthetic */ AdPanelUIType[] $values() {
        return new AdPanelUIType[]{Normal, UnderType, PageCoverType};
    }

    static {
        AdPanelUIType[] adPanelUITypeArr$values = $values();
        $VALUES = adPanelUITypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(adPanelUITypeArr$values);
    }

    private AdPanelUIType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<AdPanelUIType> getEntries() {
        return $ENTRIES;
    }

    public static AdPanelUIType valueOf(String str) {
        return (AdPanelUIType) Enum.valueOf(AdPanelUIType.class, str);
    }

    public static AdPanelUIType[] values() {
        return (AdPanelUIType[]) $VALUES.clone();
    }
}
