package com.bilibili.moduleservice.fasthybrid;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/BWAppletReportService.class */
public interface BWAppletReportService {
    void onClick(@NotNull Context context, @NotNull String str, @NotNull BWAppletReportSceneType bWAppletReportSceneType);

    void onShow(@NotNull Context context, @NotNull String str, @NotNull BWAppletReportSceneType bWAppletReportSceneType);
}
