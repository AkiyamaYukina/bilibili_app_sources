package com.bilibili.search2.main;

import android.os.Bundle;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/G.class */
public final class G {
    @Nullable
    public static final Integer a(@Nullable Bundle bundle, @NotNull String str) {
        Integer intOrNull = null;
        if (bundle != null) {
            Object obj = bundle.get(str);
            if (obj == null) {
                intOrNull = null;
            } else if (obj instanceof Integer) {
                intOrNull = (Integer) obj;
            } else if (obj instanceof Number) {
                intOrNull = Integer.valueOf(((Number) obj).intValue());
            } else {
                intOrNull = null;
                if (obj instanceof String) {
                    intOrNull = StringsKt.toIntOrNull((String) obj);
                }
            }
        }
        return intOrNull;
    }

    @Nullable
    public static final Long b(@Nullable Bundle bundle, @NotNull String str) {
        Long longOrNull = null;
        if (bundle != null) {
            Object obj = bundle.get(str);
            if (obj == null) {
                longOrNull = null;
            } else if (obj instanceof Long) {
                longOrNull = (Long) obj;
            } else if (obj instanceof Number) {
                longOrNull = Long.valueOf(((Number) obj).longValue());
            } else {
                longOrNull = null;
                if (obj instanceof String) {
                    longOrNull = StringsKt.toLongOrNull((String) obj);
                }
            }
        }
        return longOrNull;
    }
}
