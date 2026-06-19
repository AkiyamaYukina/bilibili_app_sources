package com.bilibili.music.podcast;

import Ki0.j;
import Ki0.o;
import Ki0.r;
import com.bilibili.music.podcast.data.MusicPlayVideo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/a.class */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MusicPlayVideo f66369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f66370b;

    public a(MusicPlayVideo musicPlayVideo, j jVar) {
        this.f66369a = musicPlayVideo;
        this.f66370b = jVar;
    }

    @Override // Ki0.o
    public final void a(r rVar) {
        int i7 = rVar.f12932a;
        j jVar = this.f66370b;
        if (i7 == 0 && this.f66369a != null) {
            jVar.f().f12928e = true;
        } else if (i7 == 2) {
            jVar.f().f12928e = false;
        }
    }
}
