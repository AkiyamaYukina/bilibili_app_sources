package com.bilibili.studio.centerplus.util;

import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.ui.PermissionsChecker;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/k.class */
public final class k {
    @Invocation(category = InvocationCategory.INVOKE_STATIC, name = "checkSelfPermission", owner = {"androidx.core.content.ContextCompat"}, scope = {})
    public static int a(Context context, String str) {
        String str2 = str;
        if (Build.VERSION.SDK_INT >= 33) {
            if ("android.permission.READ_EXTERNAL_STORAGE".equals(str)) {
                str2 = "android.permission.READ_MEDIA_IMAGES";
            } else {
                str2 = str;
                if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) {
                    return 0;
                }
            }
        }
        return ContextCompat.checkSelfPermission(context, str2);
    }

    @JvmStatic
    public static final boolean b(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 34 ? PermissionsChecker.checkSelfPermissions(context, new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}) : i7 >= 33 ? PermissionsChecker.checkSelfPermissions(context, new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"}) : PermissionsChecker.checkSelfPermissions(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(@org.jetbrains.annotations.Nullable android.content.Context r3) {
        /*
            r0 = 0
            r8 = r0
            r0 = r3
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L13
            r0 = 0
            return r0
        L13:
            r0 = r3
            java.lang.String r1 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            int r0 = a(r0, r1)
            if (r0 != 0) goto L21
            r0 = 1
            r4 = r0
            goto L23
        L21:
            r0 = 0
            r4 = r0
        L23:
            r0 = r3
            java.lang.String r1 = "android.permission.READ_MEDIA_VIDEO"
            int r0 = a(r0, r1)
            if (r0 != 0) goto L31
            r0 = 1
            r5 = r0
            goto L33
        L31:
            r0 = 0
            r5 = r0
        L33:
            r0 = r3
            java.lang.String r1 = "android.permission.READ_MEDIA_IMAGES"
            int r0 = a(r0, r1)
            if (r0 != 0) goto L41
            r0 = 1
            r6 = r0
            goto L43
        L41:
            r0 = 0
            r6 = r0
        L43:
            r0 = r8
            r7 = r0
            r0 = r4
            if (r0 == 0) goto L5a
            r0 = r6
            if (r0 == 0) goto L57
            r0 = r8
            r7 = r0
            r0 = r5
            if (r0 != 0) goto L5a
        L57:
            r0 = 1
            r7 = r0
        L5a:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.util.k.c(android.content.Context):boolean");
    }
}
