package com.bilibili.mediastreaming.data;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliSocketStatus.class */
public final class BiliSocketStatus {
    private static final EnumEntries $ENTRIES;
    private static final BiliSocketStatus[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int value;
    public static final BiliSocketStatus UNDEFINE = new BiliSocketStatus("UNDEFINE", 0, 0);
    public static final BiliSocketStatus INIT = new BiliSocketStatus("INIT", 1, 1);
    public static final BiliSocketStatus OPENED = new BiliSocketStatus("OPENED", 2, 2);
    public static final BiliSocketStatus LISTENING = new BiliSocketStatus("LISTENING", 3, 3);
    public static final BiliSocketStatus CONNECTING = new BiliSocketStatus("CONNECTING", 4, 4);
    public static final BiliSocketStatus CONNECTED = new BiliSocketStatus("CONNECTED", 5, 5);
    public static final BiliSocketStatus BROKEN = new BiliSocketStatus("BROKEN", 6, 6);
    public static final BiliSocketStatus CLOSING = new BiliSocketStatus("CLOSING", 7, 7);
    public static final BiliSocketStatus CLOSED = new BiliSocketStatus("CLOSED", 8, 8);
    public static final BiliSocketStatus NONEXIST = new BiliSocketStatus("NONEXIST", 9, 9);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliSocketStatus$a.class */
    public static final class a {
        @NotNull
        public static BiliSocketStatus a(@Nullable Integer num) {
            return (num != null && num.intValue() == 1) ? BiliSocketStatus.INIT : (num != null && num.intValue() == 2) ? BiliSocketStatus.OPENED : (num != null && num.intValue() == 3) ? BiliSocketStatus.LISTENING : (num != null && num.intValue() == 4) ? BiliSocketStatus.CONNECTING : (num != null && num.intValue() == 5) ? BiliSocketStatus.CONNECTED : (num != null && num.intValue() == 6) ? BiliSocketStatus.BROKEN : (num != null && num.intValue() == 7) ? BiliSocketStatus.CLOSING : (num != null && num.intValue() == 8) ? BiliSocketStatus.CLOSED : (num != null && num.intValue() == 9) ? BiliSocketStatus.NONEXIST : BiliSocketStatus.UNDEFINE;
        }
    }

    private static final /* synthetic */ BiliSocketStatus[] $values() {
        return new BiliSocketStatus[]{UNDEFINE, INIT, OPENED, LISTENING, CONNECTING, CONNECTED, BROKEN, CLOSING, CLOSED, NONEXIST};
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.bilibili.mediastreaming.data.BiliSocketStatus$a, java.lang.Object] */
    static {
        BiliSocketStatus[] biliSocketStatusArr$values = $values();
        $VALUES = biliSocketStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliSocketStatusArr$values);
        Companion = new Object();
    }

    private BiliSocketStatus(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<BiliSocketStatus> getEntries() {
        return $ENTRIES;
    }

    public static BiliSocketStatus valueOf(String str) {
        return (BiliSocketStatus) Enum.valueOf(BiliSocketStatus.class, str);
    }

    public static BiliSocketStatus[] values() {
        return (BiliSocketStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
