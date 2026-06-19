package com.bilibili.lib.ui.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bilibili.app.comment3.utils.r;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.gripper.GripperExecute;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.settings2.ISettings;
import com.bilibili.lib.settings2.Settings2Service;
import com.bilibili.magicasakura.utils.ThemeUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/util/MultipleThemeUtils.class */
public class MultipleThemeUtils {
    public static final int DEFAULT_THEME_ID = 2;
    public static final int NIGHT_THEME_ID = 1;
    public static final String PREFERENCE_KEY = "theme_entries_current_key";
    public static final int THEME_ID_WHITE = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f64945a = -1;

    public static int getContextDayNightMode(@NonNull Context context) {
        return context.getResources().getConfiguration().uiMode & (-16);
    }

    public static int getCurrentNightMode(@NonNull Context context) {
        return isNightTheme(context) ? 2 : 1;
    }

    public static int getCurrentThemeId(@NonNull Context context) {
        if (!BiliContext.isMainProcess()) {
            SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference(context);
            if (bLKVSharedPreference.contains(PREFERENCE_KEY)) {
                return bLKVSharedPreference.getInt(PREFERENCE_KEY, 2);
            }
            int iOptInteger = BiliGlobalPreferenceHelper.getInstance(context).optInteger(PREFERENCE_KEY, 2);
            bLKVSharedPreference.edit().putInt(PREFERENCE_KEY, iOptInteger).apply();
            return iOptInteger;
        }
        if (f64945a == -1) {
            SharedPreferences bLKVSharedPreference2 = BiliGlobalPreferenceHelper.getBLKVSharedPreference(context);
            if (bLKVSharedPreference2.contains(PREFERENCE_KEY)) {
                setCurrentTheme(bLKVSharedPreference2.getInt(PREFERENCE_KEY, 2));
            } else {
                setCurrentTheme(BiliGlobalPreferenceHelper.getInstance(context).optInteger(PREFERENCE_KEY, 2));
                bLKVSharedPreference2.edit().putInt(PREFERENCE_KEY, f64945a).apply();
            }
        }
        return f64945a;
    }

    public static boolean isContextModeDay(@NonNull Context context) {
        return (getContextDayNightMode(context) & 16) == 16;
    }

    public static boolean isContextModeNight(@NonNull Context context) {
        return (getContextDayNightMode(context) & 32) == 32;
    }

    public static boolean isExtraTheme(@NonNull Context context) {
        int currentThemeId = getCurrentThemeId(context);
        boolean z6 = true;
        if (currentThemeId == 1 || currentThemeId == 8 || currentThemeId == 2) {
            z6 = false;
        }
        return z6;
    }

    public static boolean isNightFollowSystem(Context context) {
        if (Build.VERSION.SDK_INT <= 26) {
            return false;
        }
        ISettings iSettings = (ISettings) GripperExecute.Companion.of().get(ISettings.class);
        ISettings iSettings2 = iSettings;
        if (iSettings == null) {
            iSettings2 = ((Settings2Service) BLRouter.INSTANCE.get(Settings2Service.class, "default")).settings2();
        }
        return iSettings2.night(context).c(false);
    }

    public static boolean isNightModeForActivity(@NonNull Activity activity) {
        return (activity.getResources().getConfiguration().uiMode & 32) == 32;
    }

    public static boolean isNightModeForDevice(@NonNull Application application) {
        return (application.getResources().getConfiguration().uiMode & 32) == 32;
    }

    public static boolean isNightTheme(@NonNull Context context) {
        boolean z6 = true;
        if (getCurrentThemeId(context) != 1) {
            z6 = false;
        }
        return z6;
    }

    public static boolean isWhiteTheme(@NonNull Context context) {
        return getCurrentThemeId(context) == 8;
    }

    @NonNull
    @Deprecated
    public static Drawable refreshMenuIconTint(@NonNull Context context, @NonNull Drawable drawable) {
        return r.a(ThemeUtils.getColorById(context, 2131103911), drawable);
    }

    @NonNull
    public static Drawable refreshMenuIconTint(@NonNull Context context, @NonNull Drawable drawable, @ColorInt int i7) {
        if (i7 == 0) {
            i7 = ThemeUtils.getColorById(context, 2131103911);
        }
        return r.a(i7, drawable);
    }

    @Deprecated
    public static void refreshMenuIconTint(@NonNull Context context, @NonNull Toolbar toolbar) {
        Menu menu = toolbar.getMenu();
        int size = menu.size();
        int colorById = ThemeUtils.getColorById(context, 2131103911);
        for (int i7 = 0; i7 <= size - 1; i7++) {
            MenuItem item = menu.getItem(i7);
            Drawable icon = item.getIcon();
            CharSequence title = item.getTitle();
            if (icon != null) {
                Drawable drawableWrap = DrawableCompat.wrap(icon.mutate());
                DrawableCompat.setTint(drawableWrap, colorById);
                item.setIcon(drawableWrap);
            }
            if (icon == null && !TextUtils.isEmpty(title)) {
                SpannableString spannableString = new SpannableString(item.getTitle());
                spannableString.setSpan(new ForegroundColorSpan(colorById), 0, spannableString.length(), 0);
                item.setTitle(spannableString);
            }
        }
    }

    public static void refreshMenuIconTint(@NonNull Context context, @NonNull Toolbar toolbar, @ColorInt int i7) {
        Menu menu = toolbar.getMenu();
        int size = menu.size();
        if (i7 == 0) {
            i7 = ThemeUtils.getColorById(context, 2131103911);
        }
        for (int i8 = 0; i8 <= size - 1; i8++) {
            MenuItem item = menu.getItem(i8);
            Drawable icon = item.getIcon();
            CharSequence title = item.getTitle();
            if (icon != null) {
                Drawable drawableWrap = DrawableCompat.wrap(icon.mutate());
                DrawableCompat.setTint(drawableWrap, i7);
                item.setIcon(drawableWrap);
            }
            if (icon == null && !TextUtils.isEmpty(title)) {
                SpannableString spannableString = new SpannableString(item.getTitle());
                spannableString.setSpan(new ForegroundColorSpan(i7), 0, spannableString.length(), 0);
                item.setTitle(spannableString);
            }
        }
    }

    @NonNull
    @Deprecated
    public static void refreshMenuTitleTint(@NonNull Context context, @Nullable Toolbar toolbar, @NonNull MenuItem menuItem) {
        int colorById = ThemeUtils.getColorById(context, 2131103911);
        SpannableString spannableString = new SpannableString(menuItem.getTitle());
        spannableString.setSpan(new ForegroundColorSpan(colorById), 0, spannableString.length(), 0);
        menuItem.setTitle(spannableString);
    }

    @NonNull
    public static void refreshMenuTitleTint(@NonNull Context context, @Nullable Toolbar toolbar, @NonNull MenuItem menuItem, @ColorInt int i7) {
        if (i7 == 0) {
            i7 = ThemeUtils.getColorById(context, 2131103911);
        }
        SpannableString spannableString = new SpannableString(menuItem.getTitle());
        spannableString.setSpan(new ForegroundColorSpan(i7), 0, spannableString.length(), 0);
        menuItem.setTitle(spannableString);
    }

    public static void setCurrentTheme(int i7) {
        f64945a = i7;
    }

    public static void setNightFollowSystem(Context context, boolean z6) {
        if (Build.VERSION.SDK_INT <= 26) {
            return;
        }
        ISettings iSettings = (ISettings) GripperExecute.Companion.of().get(ISettings.class);
        ISettings iSettings2 = iSettings;
        if (iSettings == null) {
            iSettings2 = ((Settings2Service) BLRouter.INSTANCE.get(Settings2Service.class, "default")).settings2();
        }
        iSettings2.night(context).a(z6);
    }
}
