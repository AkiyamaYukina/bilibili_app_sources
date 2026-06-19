package com.bilibili.music.podcast.utils;

import Qi0.C2831a;
import com.bilibili.music.podcast.data.MusicRecommendTopCard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/t.class */
public interface t {
    void a(@Nullable MusicRecommendTopCard musicRecommendTopCard);

    default boolean b() {
        return true;
    }

    default void c(@NotNull C2831a.C0108a c0108a) {
    }

    @Nullable
    default Ah1.b getHost() {
        return null;
    }
}
