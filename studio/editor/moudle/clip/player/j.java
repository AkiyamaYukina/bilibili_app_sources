package com.bilibili.studio.editor.moudle.clip.player;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/clip/player/j.class */
public interface j {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/clip/player/j$a.class */
    public interface a {
        void onComplete();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/clip/player/j$b.class */
    public interface b {
        void a(long j7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/clip/player/j$c.class */
    public interface c {
        void onPrepared();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/clip/player/j$d.class */
    public interface d {
        void a(int i7);
    }

    void a(@NotNull b bVar);

    default void b(long j7) {
    }

    default void c(@NotNull d dVar) {
    }

    void d(@NotNull String str, @Nullable c cVar);

    void e(@NotNull a aVar);

    long getCurrentPosition();

    long getDuration();

    int getVideoHeight();

    int getVideoWidth();

    boolean isPlaying();

    void pause();

    void release();

    void seekTo(long j7);

    default void setDisplay(@Nullable SurfaceHolder surfaceHolder) {
    }

    void setSurfaceTexture(@Nullable SurfaceTexture surfaceTexture);

    boolean start();
}
