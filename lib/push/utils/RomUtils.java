package com.bilibili.lib.push.utils;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import java.util.Locale;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/utils/RomUtils.class */
public class RomUtils {
    public static boolean checkIs360Rom() {
        String str = Build.MANUFACTURER;
        return !TextUtils.isEmpty(str) && str.contains("QiKU");
    }

    public static boolean checkSupportVersion() {
        return true;
    }

    public static String getEmuiVersion() {
        return getSystemProperty("ro.build.version.emui");
    }

    public static String getHarmonyVersion() {
        return getSystemProperty("hw_sc.build.platform.version");
    }

    public static int getMiuiVersion() {
        String systemProperty = getSystemProperty("ro.miui.ui.version.name");
        if (TextUtils.isEmpty(systemProperty)) {
            return -1;
        }
        try {
            return Integer.parseInt(systemProperty.substring(1));
        } catch (Exception e7) {
            Log.e("RomUtils", "get miui version code error");
            return -1;
        }
    }

    public static String getMiuiVersion2() {
        return getSystemProperty("ro.miui.ui.version.name");
    }

    public static String getSystemProperty(String str) {
        return SystemProperties.get(str, null);
    }

    public static boolean isCoolPadRom() {
        String str = Build.MODEL;
        String str2 = Build.FINGERPRINT;
        return (!TextUtils.isEmpty(str) && str.toLowerCase(Locale.getDefault()).contains("coolpad")) || (!TextUtils.isEmpty(str2) && str2.toLowerCase(Locale.getDefault()).contains("coolpad"));
    }

    public static boolean isDomesticSpecialRom() {
        return isMiuiRom() || isHuaweiRom() || isMeizuRom() || checkIs360Rom() || isOppoRom() || isVivoRom() || isLetvRom() || isZTERom() || isLenovoRom() || isCoolPadRom();
    }

    public static boolean isHaierRom() {
        return false;
    }

    public static boolean isHonorRom() {
        String str = Build.MANUFACTURER;
        return !TextUtils.isEmpty(str) && str.contains("HONOR");
    }

    public static boolean isHuaweiByExtraCheck() {
        return (TextUtils.isEmpty(getEmuiVersion()) && TextUtils.isEmpty(getHarmonyVersion())) ? false : true;
    }

    public static boolean isHuaweiRom() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(SocializeMedia.HUAWEI) || str.contains("huawei") || str.contains("HONOR") || str.contains("honor");
    }

    public static boolean isHuaweiRomNew() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(SocializeMedia.HUAWEI) || str.contains("huawei");
    }

    public static boolean isLenovoRom() {
        String str = Build.FINGERPRINT;
        if (!TextUtils.isEmpty(str)) {
            return str.contains("VIBEUI_V2");
        }
        String systemProperty = getSystemProperty("ro.build.version.incremental");
        return !TextUtils.isEmpty(systemProperty) && systemProperty.contains("VIBEUI_V2");
    }

    public static boolean isLetvRom() {
        return !TextUtils.isEmpty(getSystemProperty("ro.letv.eui"));
    }

    public static boolean isMeizuRom() {
        String systemProperty = getSystemProperty("ro.build.display.id");
        return !TextUtils.isEmpty(getSystemProperty("ro.build.flyme.version")) || (!TextUtils.isEmpty(systemProperty) && systemProperty.toLowerCase(Locale.getDefault()).contains("flyme"));
    }

    public static boolean isMiuiRom() {
        return !TextUtils.isEmpty(getSystemProperty("ro.miui.ui.version.name"));
    }

    public static boolean isOnePlusInsertingFrameRom() {
        String lowerCase = Build.MODEL.toLowerCase();
        return isOnePlusRom() && (lowerCase.contains("in2020") || lowerCase.contains("in2021") || lowerCase.contains("in2023") || lowerCase.contains("in2025"));
    }

    public static boolean isOnePlusRom() {
        String str = Build.FINGERPRINT;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oneplus");
        }
        String str2 = Build.MANUFACTURER;
        return !TextUtils.isEmpty(str2) && str2.toLowerCase(Locale.getDefault()).contains("oneplus");
    }

    public static boolean isOppoRom() {
        String systemProperty = getSystemProperty("ro.product.brand");
        return !TextUtils.isEmpty(systemProperty) && systemProperty.toLowerCase(Locale.getDefault()).contains("oppo");
    }

    public static boolean isRealmeRom() {
        return Build.BRAND.equalsIgnoreCase("realme") || Build.MANUFACTURER.equalsIgnoreCase("realme") || Build.FINGERPRINT.toLowerCase().contains("realme");
    }

    public static boolean isSamsungRom() {
        String str = Build.FINGERPRINT;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("samsung");
        }
        String str2 = Build.MANUFACTURER;
        return !TextUtils.isEmpty(str2) && str2.toLowerCase(Locale.getDefault()).contains("samsung");
    }

    public static boolean isSmartisanRom() {
        return false;
    }

    public static boolean isVivoRom() {
        String systemProperty = getSystemProperty("ro.vivo.os.name");
        return !TextUtils.isEmpty(systemProperty) && systemProperty.toLowerCase(Locale.getDefault()).contains("funtouch");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isZTERom() {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r6 = r0
            r0 = r6
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = r0
            r0 = 1
            r5 = r0
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 != 0) goto L3a
            r0 = r4
            r3 = r0
            r0 = r6
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "nubia"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L38
            r0 = r6
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "zte"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L36
            r0 = r4
            r3 = r0
            goto L38
        L36:
            r0 = 0
            r3 = r0
        L38:
            r0 = r3
            return r0
        L3a:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            r6 = r0
            r0 = r6
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6a
            r0 = r5
            r3 = r0
            r0 = r6
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "nubia"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L6c
            r0 = r6
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "zte"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L6a
            r0 = r5
            r3 = r0
            goto L6c
        L6a:
            r0 = 0
            r3 = r0
        L6c:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.utils.RomUtils.isZTERom():boolean");
    }
}
