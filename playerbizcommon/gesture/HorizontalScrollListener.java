package com.bilibili.playerbizcommon.gesture;

import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/HorizontalScrollListener.class */
public interface HorizontalScrollListener {
    void onCancel();

    void onScroll(float f7, @NotNull Pair<Float, Float> pair);

    void onScrollStart(float f7, @NotNull Pair<Float, Float> pair);

    void onScrollStop(float f7, @NotNull Pair<Float, Float> pair);
}
