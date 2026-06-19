package com.bilibili.ogvcommon.play.vo.base;

import com.bilibili.bson.adapter.a;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/base/ActionType.class */
public final class ActionType implements a<String> {
    private static final EnumEntries $ENTRIES;
    private static final ActionType[] $VALUES;

    @NotNull
    private final String value;
    public static final ActionType LINK = new ActionType("LINK", 0, "link");
    public static final ActionType VIP = new ActionType("VIP", 1, "vip");
    public static final ActionType PAY = new ActionType("PAY", 2, "pay");
    public static final ActionType PACKET = new ActionType("PACKET", 3, "packet");
    public static final ActionType COUPON_LIST_DIALOG = new ActionType("COUPON_LIST_DIALOG", 4, "coupon");
    public static final ActionType FOLLOW = new ActionType("FOLLOW", 5, "follow");
    public static final ActionType UPDATE = new ActionType("UPDATE", 6, "update");
    public static final ActionType BP = new ActionType("BP", 7, "bp");
    public static final ActionType TASK = new ActionType("TASK", 8, "task");

    private static final /* synthetic */ ActionType[] $values() {
        return new ActionType[]{LINK, VIP, PAY, PACKET, COUPON_LIST_DIALOG, FOLLOW, UPDATE, BP, TASK};
    }

    static {
        ActionType[] actionTypeArr$values = $values();
        $VALUES = actionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(actionTypeArr$values);
    }

    private ActionType(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ActionType> getEntries() {
        return $ENTRIES;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
