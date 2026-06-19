package com.bilibili.playset.playlist.entity;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.playset.api.MultitypePlaylist;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/entity/PlaylistDetailBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class PlaylistDetailBean {
    public static final int $stable = 8;

    @Nullable
    private MultitypePlaylist.Info info;

    @Nullable
    private ArrayList<MultitypeMedia> medias;

    @Nullable
    public final MultitypePlaylist.Info getInfo() {
        return this.info;
    }

    @Nullable
    public final ArrayList<MultitypeMedia> getMedias() {
        return this.medias;
    }

    public final void setInfo(@Nullable MultitypePlaylist.Info info) {
        this.info = info;
    }

    public final void setMedias(@Nullable ArrayList<MultitypeMedia> arrayList) {
        this.medias = arrayList;
    }
}
