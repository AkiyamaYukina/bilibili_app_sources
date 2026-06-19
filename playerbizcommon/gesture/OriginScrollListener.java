package com.bilibili.playerbizcommon.gesture;

import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/OriginScrollListener.class */
public interface OriginScrollListener {
    void onCancel();

    void onOriginScroll(@NotNull Pair<Float, Float> pair, float f7, float f8);

    boolean onOriginScrollStart(@NotNull Pair<Float, Float> pair);

    void onOriginScrollStop(@NotNull Pair<Float, Float> pair);
}
