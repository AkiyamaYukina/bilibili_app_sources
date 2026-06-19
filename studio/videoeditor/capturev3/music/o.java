package com.bilibili.studio.videoeditor.capturev3.music;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/o.class */
public interface o {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/o$a.class */
    public interface a {
        void onPrepared();
    }

    static /* synthetic */ void a(o oVar, String str, boolean z6, long j7, int i7) {
        if ((i7 & 2) != 0) {
            z6 = true;
        }
        if ((i7 & 4) != 0) {
            j7 = 0;
        }
        oVar.b(j7, 0L, str, z6);
    }

    void b(long j7, long j8, @NotNull String str, boolean z6);
}
