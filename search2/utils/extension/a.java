package com.bilibili.search2.utils.extension;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/extension/a.class */
public final class a {
    public static final void a(@NotNull Bundle bundle) {
        try {
            String string = bundle.getString("total");
            if (string != null) {
                Integer.parseInt(string);
            }
        } catch (Throwable th) {
            BLog.e("BundleExtention", th, new M80.a(bundle, 2));
        }
    }
}
