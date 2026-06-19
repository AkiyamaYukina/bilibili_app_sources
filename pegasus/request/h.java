package com.bilibili.pegasus.request;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.foundation.FoundationAlias;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/h.class */
public final class h {
    public static final boolean a() {
        Application application = BiliContext.application();
        if (application == null) {
            return false;
        }
        return FoundationAlias.getFapps().getVersionCode() > BiliGlobalPreferenceHelper.getBLKVSharedPreference(application).getInt("pegasus_last_request_version_code", 0);
    }
}
