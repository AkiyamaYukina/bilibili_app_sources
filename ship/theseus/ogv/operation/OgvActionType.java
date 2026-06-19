package com.bilibili.ship.theseus.ogv.operation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OgvActionType.class */
public final class OgvActionType implements com.bilibili.bson.adapter.a<String> {
    private static final EnumEntries $ENTRIES;
    private static final OgvActionType[] $VALUES;

    @NotNull
    private final String value;
    public static final OgvActionType LINK = new OgvActionType("LINK", 0, "link");
    public static final OgvActionType TASK = new OgvActionType("TASK", 1, "task");
    public static final OgvActionType VIP_FREE = new OgvActionType("VIP_FREE", 2, "vip-free");
    public static final OgvActionType CLOSE = new OgvActionType("CLOSE", 3, "close");
    public static final OgvActionType CLOSE_AND_BACK_PAGE = new OgvActionType("CLOSE_AND_BACK_PAGE", 4, "close_and_back_page");
    public static final OgvActionType FREEZE_ACTIVATION = new OgvActionType("FREEZE_ACTIVATION", 5, "freeze_activation");

    private static final /* synthetic */ OgvActionType[] $values() {
        return new OgvActionType[]{LINK, TASK, VIP_FREE, CLOSE, CLOSE_AND_BACK_PAGE, FREEZE_ACTIVATION};
    }

    static {
        OgvActionType[] ogvActionTypeArr$values = $values();
        $VALUES = ogvActionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(ogvActionTypeArr$values);
    }

    private OgvActionType(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<OgvActionType> getEntries() {
        return $ENTRIES;
    }

    public static OgvActionType valueOf(String str) {
        return (OgvActionType) Enum.valueOf(OgvActionType.class, str);
    }

    public static OgvActionType[] values() {
        return (OgvActionType[]) $VALUES.clone();
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
