package com.bilibili.lib.push;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushKeys.class */
public class BPushKeys {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushKeys$HonorPushKeys.class */
    public static class HonorPushKeys extends a {
        public boolean isValid(Context context) {
            boolean z6;
            try {
                z6 = !TextUtils.isEmpty(BPushFoundation.getMetaData().getString("com.hihonor.push.app_id"));
            } catch (Exception e7) {
                z6 = false;
            }
            if (!z6) {
                BPushLog.e("BPushKeys", "Must deploy the push platform keys in AndroidManifest like: \n<meta-data android:name=\"com.hihonor.push.app_id\" android:value=\"xxxxxxxxx\">\n");
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushKeys$HwKeys.class */
    public static class HwKeys extends a {
        public boolean isValid(Context context) {
            boolean z6;
            try {
                z6 = !TextUtils.isEmpty(BPushFoundation.getMetaData().getString("com.huawei.hms.client.appid"));
            } catch (Exception e7) {
                z6 = false;
            }
            if (!z6) {
                BPushLog.e("BPushKeys", "Must deploy the push platform keys in AndroidManifest like: \n<meta-data android:name=\"com.huawei.hms.client.appid\" android:value=\"xxxxxxxxx\">\n");
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushKeys$JPushKeys.class */
    public static class JPushKeys extends a {
        public void checkMeizuValid(Context context) {
            try {
                Bundle metaData = BPushFoundation.getMetaData();
                if (!TextUtils.isEmpty(metaData.getString("MEIZU_APPKEY"))) {
                    if (!TextUtils.isEmpty(metaData.getString("MEIZU_APPID"))) {
                        return;
                    }
                }
            } catch (Exception e7) {
            }
            BPushLog.e("BPushKeys", "If not deploy MEIZU_APPID and MEIZU_APPKEY in AndroidManifest,the push will degrade to jiguang push in meizu rom;");
        }

        public boolean isValid(Context context) {
            boolean z6;
            try {
                z6 = !TextUtils.isEmpty(BPushFoundation.getMetaData().getString("JPUSH_APPKEY"));
            } catch (Exception e7) {
                z6 = false;
            }
            if (z6) {
                checkMeizuValid(context);
            } else {
                BPushLog.e("BPushKeys", "Must deploy the JPush platform keys in AndroidManifest like: \n<meta-data android:name=\"JPUSH_APPKEY\" android:value=\"xxxxxxxxx\">\n");
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushKeys$MiKeys.class */
    public static class MiKeys extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f64201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f64202b;

        public String getAppId() {
            return this.f64201a;
        }

        public String getAppKey() {
            return this.f64202b;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean isValid(android.content.Context r6) {
            /*
                r5 = this;
                r0 = r5
                java.lang.String r0 = r0.f64201a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r8 = r0
                r0 = 1
                r7 = r0
                r0 = r8
                if (r0 != 0) goto L1a
                r0 = r5
                java.lang.String r0 = r0.f64202b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L1a
                r0 = 1
                return r0
            L1a:
                r0 = 0
                r8 = r0
                android.os.Bundle r0 = com.bilibili.lib.push.BPushFoundation.getMetaData()     // Catch: java.lang.Exception -> L9e
                r10 = r0
                r0 = r10
                java.lang.String r1 = "BILI_XIAOMI_APPID"
                java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Exception -> L9e
                r6 = r0
                r0 = r10
                java.lang.String r1 = "BILI_XIAOMI_APPKEY"
                java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Exception -> L9e
                r11 = r0
                r0 = r6
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L9e
                r9 = r0
                r0 = 0
                r10 = r0
                r0 = r9
                if (r0 != 0) goto L4f
                r0 = r6
                r1 = 0
                r2 = r6
                int r2 = r2.length()     // Catch: java.lang.Exception -> L9e
                r3 = 1
                int r2 = r2 - r3
                java.lang.String r0 = r0.substring(r1, r2)     // Catch: java.lang.Exception -> L9e
                r6 = r0
                goto L51
            L4f:
                r0 = 0
                r6 = r0
            L51:
                r0 = r5
                r1 = r6
                r0.f64201a = r1     // Catch: java.lang.Exception -> L9e
                r0 = r10
                r6 = r0
                r0 = r11
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L9e
                if (r0 != 0) goto L6f
                r0 = r11
                r1 = 0
                r2 = r11
                int r2 = r2.length()     // Catch: java.lang.Exception -> L9e
                r3 = 1
                int r2 = r2 - r3
                java.lang.String r0 = r0.substring(r1, r2)     // Catch: java.lang.Exception -> L9e
                r6 = r0
            L6f:
                r0 = r5
                r1 = r6
                r0.f64202b = r1     // Catch: java.lang.Exception -> L9e
                r0 = r5
                java.lang.String r0 = r0.f64201a     // Catch: java.lang.Exception -> L9e
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L9e
                if (r0 != 0) goto L8f
                r0 = r5
                java.lang.String r0 = r0.f64202b     // Catch: java.lang.Exception -> L9e
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L9e
                r9 = r0
                r0 = r9
                if (r0 != 0) goto L8f
                goto L91
            L8f:
                r0 = 0
                r7 = r0
            L91:
                r0 = r7
                if (r0 != 0) goto L9c
                java.lang.String r0 = "BPushKeys"
                java.lang.String r1 = "Must deploy the XIAOMI platform keys in AndroidManifest like: \n<meta-data android:name=\"BILI_XIAOMI_APPID\" android:value=\"xxxxxxxxx\">\n<meta-data android:name=\"BILI_XIAOMI_APPKEY\" android:value=\"xxxxxxxxx\">\n"
                com.bilibili.lib.push.BPushLog.e(r0, r1)
            L9c:
                r0 = r7
                return r0
            L9e:
                r6 = move-exception
                r0 = r8
                r7 = r0
                goto L91
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.BPushKeys.MiKeys.isValid(android.content.Context):boolean");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushKeys$OppoPushKeys.class */
    public static class OppoPushKeys extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f64203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f64204b;

        public String getAppKeyId() {
            return this.f64203a;
        }

        public String getSecretId() {
            return this.f64204b;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean isValid(android.content.Context r4) {
            /*
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.f64203a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r6 = r0
                r0 = 1
                r5 = r0
                r0 = r6
                if (r0 != 0) goto L1a
                r0 = r3
                java.lang.String r0 = r0.f64204b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L1a
                r0 = 1
                return r0
            L1a:
                r0 = 0
                r6 = r0
                android.os.Bundle r0 = com.bilibili.lib.push.BPushFoundation.getMetaData()     // Catch: java.lang.Exception -> L82
                r8 = r0
                r0 = r8
                java.lang.String r1 = "OPPO_APPKEYID"
                java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Exception -> L82
                r4 = r0
                r0 = r8
                java.lang.String r1 = "OPPO_SECRETID"
                java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Exception -> L82
                r8 = r0
                r0 = r4
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L82
                if (r0 != 0) goto L3c
                goto L3e
            L3c:
                r0 = 0
                r4 = r0
            L3e:
                r0 = r3
                r1 = r4
                r0.f64203a = r1     // Catch: java.lang.Exception -> L82
                r0 = r8
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L82
                if (r0 != 0) goto L51
                r0 = r8
                r4 = r0
                goto L53
            L51:
                r0 = 0
                r4 = r0
            L53:
                r0 = r3
                r1 = r4
                r0.f64204b = r1     // Catch: java.lang.Exception -> L82
                r0 = r3
                java.lang.String r0 = r0.f64203a     // Catch: java.lang.Exception -> L82
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L82
                if (r0 != 0) goto L73
                r0 = r3
                java.lang.String r0 = r0.f64204b     // Catch: java.lang.Exception -> L82
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L82
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L73
                goto L75
            L73:
                r0 = 0
                r5 = r0
            L75:
                r0 = r5
                if (r0 != 0) goto L80
                java.lang.String r0 = "BPushKeys"
                java.lang.String r1 = "Must deploy the OPPO platform keys in AndroidManifest like: \n<meta-data android:name=\"OPPO_APPKEYID\" android:value=\"xxxxxxxxx\">\n<meta-data android:name=\"OPPO_SECRETID\" android:value=\"xxxxxxxxx\">\n"
                com.bilibili.lib.push.BPushLog.e(r0, r1)
            L80:
                r0 = r5
                return r0
            L82:
                r4 = move-exception
                r0 = r6
                r5 = r0
                goto L75
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.BPushKeys.OppoPushKeys.isValid(android.content.Context):boolean");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushKeys$VivoPushKeys.class */
    public static class VivoPushKeys extends a {
        public boolean isValid(Context context) {
            boolean z6;
            try {
                Bundle metaData = BPushFoundation.getMetaData();
                z6 = false;
                if (!TextUtils.isEmpty(metaData.getString("com.vivo.push.api_key"))) {
                    z6 = false;
                    if (metaData.get("com.vivo.push.app_id") != null) {
                        z6 = true;
                    }
                }
            } catch (Exception e7) {
                z6 = false;
            }
            if (!z6) {
                BPushLog.e("BPushKeys", "Must deploy the push platform keys in AndroidManifest like: \n<meta-data android:name=\"com.vivo.push.api_key\" android:value=\"xxxxxxxxx\">\n<meta-data android:name=\"com.vivo.push.app_id\" android:value=\"xxxxxxxxx\">\n");
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushKeys$a.class */
    public static abstract class a {
    }
}
