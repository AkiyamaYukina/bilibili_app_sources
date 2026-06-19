package com.bilibili.opd.app.bizcommon.context;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/f.class */
public final class f {
    @JvmStatic
    public static final int a() {
        Application application = BiliContext.application();
        return application != null ? MultipleThemeUtils.getCurrentThemeId(application) : 2;
    }

    @JvmStatic
    public static final boolean b() {
        Application application = BiliContext.application();
        return application != null ? MultipleThemeUtils.isNightTheme(application) : false;
    }

    @JvmStatic
    public static final boolean c() {
        return BiliContext.application() != null && 2 == a();
    }

    @JvmStatic
    public static final boolean d() {
        return BiliContext.application() != null ? MultipleThemeUtils.isWhiteTheme(BiliContext.application()) : false;
    }
}
