package com.bilibili.search2.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/h.class */
@StabilityInferred(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f88825a;

    static {
        Boolean bool = (Boolean) Contract.get$default(ConfigManager.Companion.ab(), "search.ff_search_tab_show_count", (Object) null, 2, (Object) null);
        f88825a = bool != null ? bool.booleanValue() : true;
    }
}
