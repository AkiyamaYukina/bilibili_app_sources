package com.bilibili.music.podcast.utils;

import Si0.c;
import com.bilibili.music.podcast.data.MusicPlayItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.music.podcast.utils.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/h.class */
public final class RunnableC5428h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final c.b f67006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MusicPlayItem f67007b;

    public RunnableC5428h(@Nullable c.b bVar, @NotNull MusicPlayItem musicPlayItem) {
        this.f67006a = bVar;
        this.f67007b = musicPlayItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.b bVar = this.f67006a;
        if (bVar != null) {
            bVar.a(this.f67007b);
        }
    }
}
