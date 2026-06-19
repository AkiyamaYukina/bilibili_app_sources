package com.bilibili.studio.videocompile;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/IBVideoCompileDataReport.class */
public interface IBVideoCompileDataReport {
    void report(boolean z6, @NotNull String str, @NotNull Map<String, String> map);

    void trackT(boolean z6, @NotNull String str, @NotNull Map<String, String> map);
}
