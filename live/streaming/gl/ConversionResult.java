package com.bilibili.live.streaming.gl;

import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/ConversionResult.class */
public interface ConversionResult {
    @Nullable
    Object getOpaque();

    void release();

    int store(@NotNull ByteBuffer byteBuffer);
}
