package com.bilibili.lib.push;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/PushPermissionCode.class */
public final class PushPermissionCode {
    private static final EnumEntries $ENTRIES;
    private static final PushPermissionCode[] $VALUES;
    public static final PushPermissionCode NOT_SUPPORT = new PushPermissionCode("NOT_SUPPORT", 0, 23001);
    private final int code;

    private static final /* synthetic */ PushPermissionCode[] $values() {
        return new PushPermissionCode[]{NOT_SUPPORT};
    }

    static {
        PushPermissionCode[] pushPermissionCodeArr$values = $values();
        $VALUES = pushPermissionCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pushPermissionCodeArr$values);
    }

    private PushPermissionCode(String str, int i7, int i8) {
        this.code = i8;
    }

    @NotNull
    public static EnumEntries<PushPermissionCode> getEntries() {
        return $ENTRIES;
    }

    public static PushPermissionCode valueOf(String str) {
        return (PushPermissionCode) Enum.valueOf(PushPermissionCode.class, str);
    }

    public static PushPermissionCode[] values() {
        return (PushPermissionCode[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
