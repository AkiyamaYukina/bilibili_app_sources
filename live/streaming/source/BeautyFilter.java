package com.bilibili.live.streaming.source;

import com.bilibili.live.streaming.AVContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/BeautyFilter.class */
public interface BeautyFilter {
    void onSourceClear();

    int process(int i7, int i8, int i9, long j7);

    int processOES(int i7, @NotNull float[] fArr, int i8, int i9, long j7);

    void setContext(@NotNull AVContext aVContext);
}
