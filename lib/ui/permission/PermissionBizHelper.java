package com.bilibili.lib.ui.permission;

import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/permission/PermissionBizHelper.class */
public final class PermissionBizHelper {

    @NotNull
    public static final PermissionBizHelper INSTANCE = new PermissionBizHelper();

    @JvmStatic
    @NotNull
    public static final PermissionBiz getPermissionBiz(@NotNull String str) {
        PermissionBiz permissionBiz;
        PermissionBiz[] permissionBizArrValues = PermissionBiz.values();
        int length = permissionBizArrValues.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                permissionBiz = null;
                break;
            }
            PermissionBiz permissionBiz2 = permissionBizArrValues[i7];
            int code = permissionBiz2.getCode();
            Integer intOrNull = StringsKt.toIntOrNull(str);
            Integer num = intOrNull;
            if (intOrNull == null) {
                num = 0;
            }
            if (code == num.intValue()) {
                permissionBiz = permissionBiz2;
                break;
            }
            i7++;
        }
        PermissionBiz permissionBiz3 = permissionBiz;
        if (permissionBiz == null) {
            permissionBiz3 = PermissionBiz.NONE;
        }
        return permissionBiz3;
    }
}
