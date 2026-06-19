package com.bilibili.music.podcast.data;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.bilibili.music.podcast.MusicPodcastMainActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/n.class */
public final class n extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Bundle f66479a = new Bundle();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66480b;

    public static Bundle I0(MusicPodcastMainActivity musicPodcastMainActivity) {
        if (musicPodcastMainActivity.getIntent() == null) {
            return null;
        }
        Intent intent = musicPodcastMainActivity.getIntent();
        if (intent.getData() == null || intent.getData().isHierarchical()) {
            return intent.getExtras();
        }
        return null;
    }
}
