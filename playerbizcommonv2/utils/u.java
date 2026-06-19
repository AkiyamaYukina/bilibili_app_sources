package com.bilibili.playerbizcommonv2.utils;

import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/u.class */
public final class u {
    @Nullable
    public static final l a(@NotNull Intent intent) {
        long longExtra = intent.getLongExtra("podcast_aid", 0L);
        long longExtra2 = intent.getLongExtra("podcast_cid", 0L);
        l lVar = (longExtra <= 0 || longExtra2 <= 0) ? null : new l(longExtra, longExtra2, intent.getLongExtra("podcast_progress", 0L));
        com.bilibili.biligame.ui.feed.preload.b.a("[playerbizcommonv2-PodcastJumpHelperKt-toListenResult] ", "listen result -> " + lVar, "PodcastJumpHelperKt-toListenResult");
        return lVar;
    }
}
