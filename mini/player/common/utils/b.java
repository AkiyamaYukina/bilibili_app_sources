package com.bilibili.mini.player.common.utils;

import android.content.SharedPreferences;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/utils/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static final SharedPreferences f66090a = BiliGlobalPreferenceHelper.getBLKVSharedPreference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f66091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f66092c;

    static {
        Integer intOrNull;
        Integer intOrNull2;
        ConfigManager.Companion companion = ConfigManager.Companion;
        String str = (String) companion.config().get("mini_player_permission_days", "30");
        int iIntValue = (str == null || (intOrNull2 = StringsKt.toIntOrNull(str)) == null) ? 30 : intOrNull2.intValue();
        String str2 = (String) companion.config().get("mini_player_permission_count", "3");
        f66091b = (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) ? 3 : intOrNull.intValue();
        f66092c = iIntValue * 86400;
    }

    public static final long a() {
        return System.currentTimeMillis() / ((long) 1000);
    }
}
