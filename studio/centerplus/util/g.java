package com.bilibili.studio.centerplus.util;

import android.os.Bundle;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/g.class */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.os.Bundle r4) {
        /*
            r0 = r4
            if (r0 != 0) goto L7
            java.lang.String r0 = "center_plus"
            return r0
        L7:
            java.lang.String r0 = ""
            r5 = r0
            r0 = r4
            java.lang.String r1 = "bbs_key_relation_from_v2"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            r6 = r0
            r0 = r6
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1c
            r0 = r6
            return r0
        L1c:
            r0 = r4
            java.lang.String r1 = "JUMP_PARAMS"
            java.lang.Object r0 = r0.get(r1)
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L2c
            r0 = r5
            r4 = r0
            goto L2c
        L2c:
            r0 = r4
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = r4
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3e
        L38:
            java.lang.String r0 = "center_plus"
            r5 = r0
            goto L6b
        L3e:
            r0 = r4
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "relation_from"
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L50
            goto L5d
        L50:
            r0 = r4
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "relation_from"
            java.lang.String r0 = r0.getQueryParameter(r1)
            r4 = r0
            goto L5f
        L5d:
            r0 = 0
            r4 = r0
        L5f:
            r0 = r4
            r5 = r0
            r0 = r4
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L6b
            goto L38
        L6b:
            r0 = r5
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L75
            java.lang.String r0 = "center_plus"
            return r0
        L75:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.util.g.a(android.os.Bundle):java.lang.String");
    }

    public static int b(Bundle bundle) {
        String strA = a(bundle);
        strA.getClass();
        return !strA.equals("contribute") ? !strA.equals("center_plus") ? 10 : 1 : 9;
    }
}
