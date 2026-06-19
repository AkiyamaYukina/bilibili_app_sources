package com.bilibili.module.vip.combine;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipActionType.class */
public final class VipActionType implements com.bilibili.bson.adapter.a<String> {
    private static final EnumEntries $ENTRIES;
    private static final VipActionType[] $VALUES;

    @NotNull
    private final String value;
    public static final VipActionType Continue = new VipActionType("Continue", 0, "continue");
    public static final VipActionType Cancel = new VipActionType("Cancel", 1, "cancel");
    public static final VipActionType OpenLink = new VipActionType("OpenLink", 2, "open");

    private static final /* synthetic */ VipActionType[] $values() {
        return new VipActionType[]{Continue, Cancel, OpenLink};
    }

    static {
        VipActionType[] vipActionTypeArr$values = $values();
        $VALUES = vipActionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(vipActionTypeArr$values);
    }

    private VipActionType(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<VipActionType> getEntries() {
        return $ENTRIES;
    }

    public static VipActionType valueOf(String str) {
        return (VipActionType) Enum.valueOf(VipActionType.class, str);
    }

    public static VipActionType[] values() {
        return (VipActionType[]) $VALUES.clone();
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
