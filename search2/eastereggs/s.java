package com.bilibili.search2.eastereggs;

import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/s.class */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f86533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f86534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f86535c;

    static {
        ConfigManager.Companion companion = ConfigManager.Companion;
        Boolean bool = (Boolean) Contract.get$default(companion.ab(), "search_egg_use_opt_download", (Object) null, 2, (Object) null);
        f86533a = bool != null ? bool.booleanValue() : true;
        Boolean bool2 = (Boolean) Contract.get$default(companion.ab(), "search_easter_egg_4g", (Object) null, 2, (Object) null);
        boolean zBooleanValue = true;
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        f86534b = zBooleanValue;
    }
}
