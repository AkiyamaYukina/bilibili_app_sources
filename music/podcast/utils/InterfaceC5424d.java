package com.bilibili.music.podcast.utils;

import Di0.InterfaceC1597a;
import android.os.Bundle;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.music.podcast.utils.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/d.class */
public interface InterfaceC5424d {
    @Nullable
    MusicPlayItem a();

    @NotNull
    Pair<Integer, Integer> b();

    boolean c();

    void d(@Nullable InterfaceC1597a interfaceC1597a);

    void e(@Nullable Bundle bundle, boolean z6);

    @Nullable
    Ki0.m f();

    @Nullable
    MusicPlayVideo g();

    float getBufferedPercentage();

    int getCurrentPosition();

    int getDuration();

    float getPlaySpeed();

    int getPlayerState();

    void h(int i7);

    boolean i();

    void j();

    boolean k();

    int l();

    void m();

    void n(@Nullable Bundle bundle, boolean z6);

    @NotNull
    int[] o();

    boolean p();

    void pause();

    void resume();

    void seekTo(int i7);

    void setPlaySpeed(float f7);
}
