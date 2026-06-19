package com.bilibili.lib.ui.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bilibili.xpref.Xpref;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/util/LanguageUtil.class */
public class LanguageUtil {
    public static final String SIMPLIFIED_CHINESE = "1";
    public static final String SYSTEM_LANGUAGE = "0";
    public static final String TRADITIONAL_CHINESE = "2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f64942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f64943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f64944c;

    static {
        HashSet hashSet = new HashSet();
        f64944c = hashSet;
        hashSet.add(Locale.CHINESE.getLanguage());
        hashSet.add(Locale.ENGLISH.getLanguage());
    }

    public static Locale a() {
        Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
        return ((HashSet) f64944c).contains(locale.getLanguage()) ? locale : Locale.TRADITIONAL_CHINESE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Locale getAppLanguage(android.content.Context r4) {
        /*
            java.lang.String r0 = ""
            r9 = r0
            java.util.Locale r0 = getCurLocale()
            r8 = r0
            r0 = 0
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L15
            r0 = 0
            r7 = r0
            goto L23
        L15:
            java.lang.String r0 = "th"
            r1 = r8
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            boolean r0 = r0.equals(r1)
            r7 = r0
        L23:
            r0 = r7
            if (r0 == 0) goto Lac
            r0 = r4
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L38
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L38
            java.lang.String r0 = r0.getSimOperator()     // Catch: java.lang.Exception -> L38
            r8 = r0
            goto L44
        L38:
            r8 = move-exception
            r0 = r8
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = ""
            r8 = r0
        L44:
            r0 = r8
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L50
            java.util.Locale r0 = java.util.Locale.SIMPLIFIED_CHINESE
            return r0
        L50:
            r0 = r4
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L60
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = r0.getSimOperator()     // Catch: java.lang.Exception -> L60
            r4 = r0
            goto L69
        L60:
            r4 = move-exception
            r0 = r4
            java.lang.String r0 = r0.getMessage()
            r0 = r9
            r4 = r0
        L69:
            r0 = r6
            r5 = r0
            r0 = r4
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L9a
            r0 = r4
            java.lang.String r1 = "454"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L98
            r0 = r4
            java.lang.String r1 = "455"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L98
            r0 = r4
            java.lang.String r1 = "460"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L98
            r0 = r6
            r5 = r0
            r0 = r4
            java.lang.String r1 = "466"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L9a
        L98:
            r0 = 1
            r5 = r0
        L9a:
            r0 = r5
            if (r0 != 0) goto La8
            java.util.Locale r0 = new java.util.Locale
            r1 = r0
            java.lang.String r2 = "th"
            r1.<init>(r2)
            return r0
        La8:
            java.util.Locale r0 = java.util.Locale.SIMPLIFIED_CHINESE
            return r0
        Lac:
            boolean r0 = isSystemChinese()
            if (r0 == 0) goto Lb6
            java.util.Locale r0 = getCurLocale()
            return r0
        Lb6:
            java.util.Locale r0 = java.util.Locale.SIMPLIFIED_CHINESE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.util.LanguageUtil.getAppLanguage(android.content.Context):java.util.Locale");
    }

    public static Locale getCurLocale() {
        return f64943b;
    }

    public static String getCurrentLanguage(Context context) {
        if (context == null) {
            return "2";
        }
        if (TextUtils.isEmpty(f64942a)) {
            f64942a = Xpref.getSharedPreferences(context, "bili_main_settings_preferences").getString("pref_key_language_setting", "0");
        }
        return f64942a;
    }

    public static boolean isAppThai(Context context) {
        Locale appLanguage = getAppLanguage(context);
        if (appLanguage == null) {
            return false;
        }
        return "th".equals(appLanguage.toString().trim());
    }

    public static boolean isSystemChinese() {
        Locale curLocale = getCurLocale();
        if (curLocale == null) {
            return false;
        }
        return curLocale.toString().trim().contains(Locale.CHINESE.toString());
    }

    public static boolean isTraditionalChinese() {
        Locale curLocale = getCurLocale();
        if (curLocale == null) {
            return false;
        }
        return curLocale.toString().contains(Locale.TRADITIONAL_CHINESE.toString());
    }

    public static void updateApplicationConfig(Context context) {
        String currentLanguage = getCurrentLanguage(context);
        Resources resources = context.getApplicationContext().getResources();
        Locale localeA = TextUtils.equals(currentLanguage, "1") ? Locale.SIMPLIFIED_CHINESE : TextUtils.equals(currentLanguage, "2") ? Locale.TRADITIONAL_CHINESE : a();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = localeA;
        configuration.setLocales(new LocaleList(localeA));
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public static void updateCurLanguageIndex(String str) {
        f64942a = str;
    }

    public static Context updateResourceConfig(@NonNull Context context) {
        String currentLanguage = getCurrentLanguage(context);
        Resources resources = context.getResources();
        Locale localeA = TextUtils.equals(currentLanguage, "1") ? Locale.SIMPLIFIED_CHINESE : TextUtils.equals(currentLanguage, "2") ? Locale.TRADITIONAL_CHINESE : a();
        f64943b = localeA;
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(localeA);
        return context.createConfigurationContext(configuration);
    }
}
