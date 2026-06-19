package com.bilibili.moduleservice.main;

import android.content.Context;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/ThemeService.class */
public interface ThemeService {
    void callThemeExpired(@Nullable Context context);

    int getCurThemeTypeForH5();

    int getCurThemeTypeForH5(int i7);
}
