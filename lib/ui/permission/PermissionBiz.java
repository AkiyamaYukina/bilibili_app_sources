package com.bilibili.lib.ui.permission;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/permission/PermissionBiz.class */
public final class PermissionBiz {
    private static final EnumEntries $ENTRIES;
    private static final PermissionBiz[] $VALUES;
    private final int code;
    public static final PermissionBiz FOLLOWING = new PermissionBiz("FOLLOWING", 0, 1);
    public static final PermissionBiz MALL_TICKET = new PermissionBiz("MALL_TICKET", 1, 2);
    public static final PermissionBiz MALL_ADDRESS = new PermissionBiz("MALL_ADDRESS", 2, 3);
    public static final PermissionBiz AD = new PermissionBiz("AD", 3, 4);
    public static final PermissionBiz UPPER = new PermissionBiz("UPPER", 4, 5);
    public static final PermissionBiz APPLET = new PermissionBiz("APPLET", 5, 6);
    public static final PermissionBiz NONE = new PermissionBiz("NONE", 6, 0);

    private static final /* synthetic */ PermissionBiz[] $values() {
        return new PermissionBiz[]{FOLLOWING, MALL_TICKET, MALL_ADDRESS, AD, UPPER, APPLET, NONE};
    }

    static {
        PermissionBiz[] permissionBizArr$values = $values();
        $VALUES = permissionBizArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(permissionBizArr$values);
    }

    private PermissionBiz(String str, int i7, int i8) {
        this.code = i8;
    }

    @NotNull
    public static EnumEntries<PermissionBiz> getEntries() {
        return $ENTRIES;
    }

    public static PermissionBiz valueOf(String str) {
        return (PermissionBiz) Enum.valueOf(PermissionBiz.class, str);
    }

    public static PermissionBiz[] values() {
        return (PermissionBiz[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
