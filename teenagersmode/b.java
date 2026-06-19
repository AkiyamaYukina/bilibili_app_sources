package com.bilibili.teenagersmode;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.config.BLRemoteConfig;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.xpref.Xpref;
import sD0.j;
import vD0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/b.class */
public final class b {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/b$a.class */
    public static final class a {
        public static boolean a(String str, boolean z6) {
            try {
                String string = JSON.parseObject(BLRemoteConfig.getInstance().getString("teenagers_mode_config")).getString(str);
                if (string == null) {
                    return z6;
                }
                return Integer.parseInt(string) != 0;
            } catch (Exception e7) {
                return z6;
            }
        }
    }

    public static SharedPreferences a(Context context) {
        Context app2 = context;
        if (context == null) {
            app2 = Foundation.instance().getApp();
        }
        return Xpref.getSharedPreferences(app2, "bili_teenagers_mode_preferences" + g());
    }

    public static SharedPreferences b(Context context) {
        Context app2 = context;
        if (context == null) {
            app2 = Foundation.instance().getApp();
        }
        return Xpref.getSharedPreferences(app2, "bili_teenagers_mode_preferences0");
    }

    public static long c() {
        Application application = BiliContext.application();
        if (application == null) {
            return 0L;
        }
        return a(application).getLong("teenagers_mode_time_limited_time", 0L);
    }

    public static boolean d(Context context) {
        SharedPreferences sharedPreferencesB = b(context);
        return sharedPreferencesB.getBoolean("teenagers_mode_server_state", sharedPreferencesB.getBoolean("teenagers_mode_state_enable", false));
    }

    public static boolean e(Context context) {
        boolean z6 = false;
        if (f(context)) {
            z6 = false;
            if (b(context).getBoolean("overseas_teenagers_mode_enabled", false)) {
                z6 = true;
            }
        }
        return z6;
    }

    public static boolean f(Context context) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA.getBoolean("teenagers_mode_server_state", sharedPreferencesA.getBoolean("teenagers_mode_state_enable", false));
    }

    public static long g() {
        Application application = BiliContext.application();
        if (application == null) {
            return 0L;
        }
        BiliAccounts biliAccounts = BiliAccounts.get(application);
        if (biliAccounts.isLogin()) {
            return biliAccounts.mid();
        }
        return 0L;
    }

    public static void h(long j7, Context context) {
        Xpref.getSharedPreferences(context, "bili_teenagers_mode_preferences" + j7).edit().putLong("teenagers_mode_curfew_page_show_time", 0L).apply();
    }

    public static void i(long j7, long j8) {
        Application application = BiliContext.application();
        if (application == null) {
            return;
        }
        Xpref.getSharedPreferences(application, "bili_teenagers_mode_preferences" + j8).edit().putLong("teenagers_mode_time_limited_time", j7).apply();
    }

    public static void j(Context context, boolean z6) {
        a(context).edit().putBoolean("teenagers_mode_curfew_pwd_finished", z6).apply();
    }

    public static void k(Context context, boolean z6) {
        b(context).edit().putBoolean("teenagers_mode_server_state", z6).putBoolean("teenagers_mode_state_enable", z6).apply();
    }

    public static void l(Context context, boolean z6, boolean z7, boolean z8, boolean z9) {
        a(context).edit().putBoolean("teenagers_mode_server_state", z6).putBoolean("teenagers_mode_state_enable", z6).putBoolean("teenagers_mode_parent_control", z8).apply();
        if (z9 && BiliAccounts.get(context).isLogin() && z6 != d(context)) {
            k(context, z6);
        }
        b(context).edit().putBoolean("teenagers_mode_server_force", z7).apply();
    }

    public static void m(Context context, boolean z6) {
        if (z6 && !n(context)) {
            f.a(0L, context);
            j.d.a.k(context, 0L);
        }
        a(context).edit().putBoolean("teenagers_mode_time_limited_pwd_finished", z6).apply();
    }

    public static boolean n(Context context) {
        return b(context).getBoolean("teenagers_mode_use_local_time", true);
    }
}
