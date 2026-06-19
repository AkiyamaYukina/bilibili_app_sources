package com.bilibili.ship.theseus.ogv.season;

import com.bilibili.bson.adapter.a;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/PayStatus.class */
public final class PayStatus implements a<Integer> {
    private static final EnumEntries $ENTRIES;
    private static final PayStatus[] $VALUES;
    private final int value;
    public static final PayStatus STATUS_UNKNOWN = new PayStatus("STATUS_UNKNOWN", 0, -1);
    public static final PayStatus STATUS_ALL_FREE = new PayStatus("STATUS_ALL_FREE", 1, 2);
    public static final PayStatus STATUS_VIP_FREE = new PayStatus("STATUS_VIP_FREE", 2, 6);
    public static final PayStatus STATUS_VIP_FIRST = new PayStatus("STATUS_VIP_FIRST", 3, 7);
    public static final PayStatus STATUS_VIP_ONLY = new PayStatus("STATUS_VIP_ONLY", 4, 13);
    public static final PayStatus STATUS_NONE_FREE = new PayStatus("STATUS_NONE_FREE", 5, 8);
    public static final PayStatus STATUS_NONE_FIRST = new PayStatus("STATUS_NONE_FIRST", 6, 9);
    public static final PayStatus STATUS_PAY_PACK = new PayStatus("STATUS_PAY_PACK", 7, 12);
    public static final PayStatus STATUS_WHITELIST = new PayStatus("STATUS_WHITELIST", 8, 14);
    public static final PayStatus STATUS_SVIP_FIRST = new PayStatus("STATUS_SVIP_FIRST", 9, 22);
    public static final PayStatus STATUS_FINALE_PREMIERE = new PayStatus("STATUS_FINALE_PREMIERE", 10, 23);
    public static final PayStatus STATUS_UPDATE_MORE = new PayStatus("STATUS_UPDATE_MORE", 11, 24);

    private static final /* synthetic */ PayStatus[] $values() {
        return new PayStatus[]{STATUS_UNKNOWN, STATUS_ALL_FREE, STATUS_VIP_FREE, STATUS_VIP_FIRST, STATUS_VIP_ONLY, STATUS_NONE_FREE, STATUS_NONE_FIRST, STATUS_PAY_PACK, STATUS_WHITELIST, STATUS_SVIP_FIRST, STATUS_FINALE_PREMIERE, STATUS_UPDATE_MORE};
    }

    static {
        PayStatus[] payStatusArr$values = $values();
        $VALUES = payStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(payStatusArr$values);
    }

    private PayStatus(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<PayStatus> getEntries() {
        return $ENTRIES;
    }

    public static PayStatus valueOf(String str) {
        return (PayStatus) Enum.valueOf(PayStatus.class, str);
    }

    public static PayStatus[] values() {
        return (PayStatus[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Integer m9146getValue() {
        return Integer.valueOf(this.value);
    }
}
