package com.bilibili.search2.eastereggs;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/f.class */
public final /* synthetic */ class f implements MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EasterEggVideoView f86515a;

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
        EasterEggVideoView easterEggVideoView = this.f86515a;
        int i9 = EasterEggVideoView.f86465A;
        k.a("video egg play error", "MediaPlayer error: " + i7 + ", " + i8);
        easterEggVideoView.f86467b = -1;
        easterEggVideoView.f86468c = -1;
        MediaPlayer.OnErrorListener onErrorListener = easterEggVideoView.f86478n;
        if (onErrorListener == null) {
            return true;
        }
        onErrorListener.onError(easterEggVideoView.f86470e, i7, i8);
        return true;
    }
}
