package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PayMode.class */
public final class PayMode {
    private static final EnumEntries $ENTRIES;
    private static final PayMode[] $VALUES;
    private final int mode;
    public static final PayMode Unknown = new PayMode("Unknown", 0, -1);
    public static final PayMode Free = new PayMode("Free", 1, 0);
    public static final PayMode NeedPay = new PayMode("NeedPay", 2, 1);

    private static final /* synthetic */ PayMode[] $values() {
        return new PayMode[]{Unknown, Free, NeedPay};
    }

    static {
        PayMode[] payModeArr$values = $values();
        $VALUES = payModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(payModeArr$values);
    }

    private PayMode(String str, int i7, int i8) {
        this.mode = i8;
    }

    @NotNull
    public static EnumEntries<PayMode> getEntries() {
        return $ENTRIES;
    }

    public static PayMode valueOf(String str) {
        return (PayMode) Enum.valueOf(PayMode.class, str);
    }

    public static PayMode[] values() {
        return (PayMode[]) $VALUES.clone();
    }

    public final int getMode() {
        return this.mode;
    }
}
