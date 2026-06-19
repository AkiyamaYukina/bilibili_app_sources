package com.bilibili.mall;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/IMallNeulService.class */
public interface IMallNeulService {
    void onPreheat(@Nullable String str);

    void onPreload(@NotNull Map<String, String> map);
}
