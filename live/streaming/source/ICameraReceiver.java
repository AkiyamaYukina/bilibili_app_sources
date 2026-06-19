package com.bilibili.live.streaming.source;

import android.view.Surface;
import com.bilibili.live.streaming.gl.BGLDrawer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/ICameraReceiver.class */
public interface ICameraReceiver extends AutoCloseable {
    int height();

    boolean render(@NotNull BGLDrawer bGLDrawer);

    @NotNull
    Surface surface();

    void tick();

    int width();
}
