package com.bilibili.pegasus.utils;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/F.class */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static F f78855a;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.pegasus.utils.F, java.lang.Object] */
    public static F a() {
        if (f78855a == null) {
            ?? obj = new Object();
            Application application = BiliContext.application();
            if (application != null) {
                BiliGlobalPreferenceHelper.getBLKVSharedPreference(application).getLong("key_pegasus_app_list_first_run_time", -1L);
            }
            f78855a = obj;
        }
        return f78855a;
    }
}
