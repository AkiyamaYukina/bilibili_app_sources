package com.bilibili.lib.util;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/util/Reporter.class */
public interface Reporter {
    void onReport(@NotNull String str, @NotNull Map<String, String> map, boolean z6, @NotNull Function0<Boolean> function0);
}
