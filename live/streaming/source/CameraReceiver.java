package com.bilibili.live.streaming.source;

import android.os.Handler;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CameraReceiver.class */
public abstract class CameraReceiver implements ICameraReceiver {

    @NotNull
    private final Handler mHandler;
    private int mHeight;
    private int mWidth;

    public CameraReceiver(int i7, int i8, @NotNull Handler handler) {
        this.mHandler = handler;
        this.mWidth = i7;
        this.mHeight = i8;
    }

    @NotNull
    public final Handler getMHandler() {
        return this.mHandler;
    }

    public final int getMHeight() {
        return this.mHeight;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    @Override // com.bilibili.live.streaming.source.ICameraReceiver
    public int height() {
        return this.mHeight;
    }

    public final void setMHeight(int i7) {
        this.mHeight = i7;
    }

    public final void setMWidth(int i7) {
        this.mWidth = i7;
    }

    @Override // com.bilibili.live.streaming.source.ICameraReceiver
    public int width() {
        return this.mWidth;
    }
}
