package com.bilibili.lib.ui.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.bilibili.base.BiliGlobalPreferenceHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/util/NightTheme.class */
@Deprecated
public class NightTheme {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static NightTheme f64946b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f64947a;

    public static NightTheme getInstance(@NonNull Context context) {
        if (f64946b == null) {
            synchronized (NightTheme.class) {
                try {
                    if (f64946b == null) {
                        SharedPreferences sharedPreferences = BiliGlobalPreferenceHelper.getInstance(context).getSharedPreferences();
                        NightTheme nightTheme = new NightTheme();
                        nightTheme.f64947a = sharedPreferences;
                        f64946b = nightTheme;
                    }
                } finally {
                }
            }
        }
        return f64946b;
    }

    @Deprecated
    public static boolean isNightTheme(Context context) {
        return MultipleThemeUtils.isNightTheme(context);
    }
}
