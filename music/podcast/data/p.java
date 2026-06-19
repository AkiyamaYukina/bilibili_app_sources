package com.bilibili.music.podcast.data;

import com.bilibili.music.podcast.data.MusicPlayItem;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/p.class */
public final class p {
    @JvmStatic
    public static final boolean a(@Nullable MusicPlayItem.State state) {
        return state != null ? state.isFav() : false;
    }

    @JvmStatic
    public static final void b(@Nullable MusicPlayItem.State state, boolean z6) {
        if (state == null) {
            return;
        }
        if (!z6 && a(state)) {
            if (state.getFavourite() > 0) {
                state.setFavourite(state.getFavourite() - 1);
            }
            state.setFav(false);
        } else {
            if (!z6 || a(state)) {
                return;
            }
            state.setFavourite(state.getFavourite() + 1);
            state.setFav(true);
        }
    }

    @JvmStatic
    public static final void c(@Nullable MusicPlayItem.State state) {
        if (state == null) {
            return;
        }
        if (state.isLiked()) {
            state.setLike(state.getLike() - 1);
        } else {
            state.setLike(state.getLike() + 1);
        }
        state.setLiked(!state.isLiked());
    }
}
