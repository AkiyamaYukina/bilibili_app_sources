package com.bilibili.moduleservice.restrict;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/restrict/RestrictedModeService.class */
public interface RestrictedModeService {
    boolean isLessonModeEnable();

    boolean isLessonModeEnable(@NotNull String str);

    boolean isRestrictedMode();

    boolean isTeenagersModeEnable();

    boolean isTeenagersModeEnable(@NotNull String str);

    void routeToLessonInterceptPage(@NotNull Context context);

    void routeToTeenagersInterceptPage(@NotNull Context context);
}
