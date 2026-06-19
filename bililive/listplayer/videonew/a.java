package com.bilibili.bililive.listplayer.videonew;

import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/videonew/a.class */
public interface a {

    /* JADX INFO: renamed from: com.bilibili.bililive.listplayer.videonew.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/videonew/a$a.class */
    public interface InterfaceC0345a {
        void onReady();
    }

    void D();

    boolean Z(long j7);

    void gd(@NotNull RecyclerView.ViewHolder viewHolder);

    int getCurrentPosition();

    @Nullable
    IPlayerContainer getPlayerContainer();

    int getPlayerState();

    void mc(boolean z6);

    void pause();

    void restoreVolume();

    void resume();

    void te(@NotNull RecyclerView.ViewHolder viewHolder);
}
