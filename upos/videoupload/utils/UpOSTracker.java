package com.bilibili.upos.videoupload.utils;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upos/videoupload/utils/UpOSTracker.class */
public interface UpOSTracker {
    void onDelete(@NotNull Map<String, String> map);

    void onInit(@NotNull Map<String, String> map);

    void onMerge(@NotNull Map<String, String> map);

    void onPartEnd(@NotNull Map<String, String> map);

    void onPartStart(@NotNull Map<String, String> map);

    void onPause(@NotNull Map<String, String> map);

    void onPreUpload(@NotNull Map<String, String> map);
}
