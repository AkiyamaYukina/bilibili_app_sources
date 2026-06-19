package com.bilibili.pegasus.components;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.foundation.FoundationAlias;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/O.class */
public final class O implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Application application = BiliContext.application();
        if (application == null) {
            return;
        }
        BiliGlobalPreferenceHelper.getBLKVSharedPreference(application).edit().putInt("pegasus_last_request_version_code", FoundationAlias.getFapps().getVersionCode()).apply();
    }
}
