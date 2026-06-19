package com.bilibili.lib.ui.permission;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/permission/PermissionCode.class */
public final class PermissionCode {
    private static final EnumEntries $ENTRIES;
    private static final PermissionCode[] $VALUES;
    public static final PermissionCode LOCATION = new PermissionCode("LOCATION", 0, 1);
    public static final PermissionCode NONE = new PermissionCode("NONE", 1, 0);
    private final int code;

    private static final /* synthetic */ PermissionCode[] $values() {
        return new PermissionCode[]{LOCATION, NONE};
    }

    static {
        PermissionCode[] permissionCodeArr$values = $values();
        $VALUES = permissionCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(permissionCodeArr$values);
    }

    private PermissionCode(String str, int i7, int i8) {
        this.code = i8;
    }

    @NotNull
    public static EnumEntries<PermissionCode> getEntries() {
        return $ENTRIES;
    }

    public static PermissionCode valueOf(String str) {
        return (PermissionCode) Enum.valueOf(PermissionCode.class, str);
    }

    public static PermissionCode[] values() {
        return (PermissionCode[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
