package com.bilibili.ogv.infra.util;

import android.os.Bundle;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/a.class */
public final class a {
    @NotNull
    public static final Bundle a(@NotNull Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }
}
