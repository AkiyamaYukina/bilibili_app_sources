package com.bilibili.lib.push;

import com.bilibili.lib.sharewrapper.SocializeMedia;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/PushType.class */
public final class PushType {
    private static final EnumEntries $ENTRIES;
    private static final PushType[] $VALUES;
    private final int code;
    public static final PushType EMPTY = new PushType("EMPTY", 0, -1);
    public static final PushType XIAOMI = new PushType("XIAOMI", 1, 2);
    public static final PushType HUAWEI = new PushType(SocializeMedia.HUAWEI, 2, 3);
    public static final PushType OPPO = new PushType("OPPO", 3, 5);
    public static final PushType FCM = new PushType("FCM", 4, 7);
    public static final PushType VIVO = new PushType("VIVO", 5, 8);
    public static final PushType HONOR = new PushType("HONOR", 6, 9);

    private static final /* synthetic */ PushType[] $values() {
        return new PushType[]{EMPTY, XIAOMI, HUAWEI, OPPO, FCM, VIVO, HONOR};
    }

    static {
        PushType[] pushTypeArr$values = $values();
        $VALUES = pushTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pushTypeArr$values);
    }

    private PushType(String str, int i7, int i8) {
        this.code = i8;
    }

    @NotNull
    public static EnumEntries<PushType> getEntries() {
        return $ENTRIES;
    }

    public static PushType valueOf(String str) {
        return (PushType) Enum.valueOf(PushType.class, str);
    }

    public static PushType[] values() {
        return (PushType[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
