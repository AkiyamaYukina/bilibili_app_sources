package com.bilibili.search2.result.vertical.live;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/a.class */
public final class a {
    @NotNull
    public static final Bundle a() {
        Bundle bundle = new Bundle();
        HashMap map = new HashMap();
        map.put("user_status", o.b() ? "2" : "3");
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    @NotNull
    public static final Bundle b(@Nullable Bundle bundle) {
        HashMap map = new HashMap();
        map.put("abtest_id", "-99998");
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }
}
