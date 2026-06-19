package com.bilibili.live.streaming.gl;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/FilterInterface.class */
public interface FilterInterface {
    void setFilter(@Nullable Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4);
}
