package com.bilibili.ship.theseus.keel.player;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.media.resource.MediaResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.videoplayer.coreV2.MediaItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GeminiCommonPlayableParams f91098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final MediaItem<?> f91099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MediaResource f91100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f91101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f91102e;

    public e(@NotNull GeminiCommonPlayableParams geminiCommonPlayableParams, @Nullable MediaItem<?> mediaItem, @NotNull MediaResource mediaResource) {
        this.f91098a = geminiCommonPlayableParams;
        this.f91099b = mediaItem;
        this.f91100c = mediaResource;
        this.f91101d = geminiCommonPlayableParams.getAvid();
        this.f91102e = geminiCommonPlayableParams.getCid();
    }

    public final void a() {
        MediaItem<?> mediaItem = this.f91099b;
        if (mediaItem == null || !mediaItem.valid()) {
            return;
        }
        MediaItem.release$default(mediaItem, false, 1, (Object) null);
    }
}
