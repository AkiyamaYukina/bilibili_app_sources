package com.bilibili.tgwt.service;

import android.media.MediaPlayer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/g.class */
public final class g implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatService f111967a;

    public g(ChatService chatService) {
        this.f111967a = chatService;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
        ChatService chatService = this.f111967a;
        if (chatService.f111872U) {
            chatService.f111895n.getPlayerServiceController().j().unregisterVolumeChangeObserver(chatService.f111871T);
        }
        MediaPlayer mediaPlayer = chatService.f111879a0;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }
}
