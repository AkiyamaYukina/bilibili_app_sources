package com.bilibili.studio.editor.moudle.clip.player;

import android.media.MediaPlayer;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/clip/player/g.class */
public final /* synthetic */ class g implements MediaPlayer.OnErrorListener {
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
        StringBuilder sb = new StringBuilder("mp:");
        sb.append(mediaPlayer);
        sb.append(",what:");
        sb.append(i7);
        sb.append(",extra:");
        Z.b(i8, "SystemMediaPlayerImpl", sb);
        return true;
    }
}
