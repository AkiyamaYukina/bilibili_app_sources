package com.bilibili.module.list;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/list/JsonViewerService.class */
public interface JsonViewerService {
    static /* synthetic */ void show$default(JsonViewerService jsonViewerService, Context context, String str, String str2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i7 & 2) != 0) {
            str = "";
        }
        if ((i7 & 4) != 0) {
            str2 = "";
        }
        jsonViewerService.show(context, str, str2);
    }

    void show(@NotNull Context context, @NotNull String str, @NotNull String str2);
}
