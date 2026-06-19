package com.bilibili.live.streaming.source;

import android.os.Build;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.log.LivePusherLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/GifSource.class */
public final class GifSource extends FilterBase {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String GIF_PATH = "gif_path";

    @NotNull
    public static final String HEIGHT = "height";

    @NotNull
    public static final String ID = "GifSource";
    public static final int MAX_HEIGHT = 2048;
    public static final int MAX_WIDTH = 2048;

    @NotNull
    public static final String WIDTH = "width";

    @Nullable
    private FilterBase mGifImplement;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/GifSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        LivePusherLog.i$default(ID, this + ", destroy!!", null, 4, null);
        FilterBase filterBase = this.mGifImplement;
        if (filterBase != null) {
            filterBase.destroy();
        }
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getHeight() {
        FilterBase filterBase = this.mGifImplement;
        return filterBase != null ? filterBase.getHeight() : 0;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return ID;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getWidth() {
        FilterBase filterBase = this.mGifImplement;
        return filterBase != null ? filterBase.getWidth() : 0;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(@Nullable JSONObject jSONObject) {
        FilterBase gifSourceOnLowerThanL;
        if (Build.VERSION.SDK_INT >= 28) {
            LivePusherLog.i$default(ID, "use GifSourcePOrHigher...", null, 4, null);
            gifSourceOnLowerThanL = new GifSourcePOrHigher();
        } else {
            LivePusherLog.i$default(ID, "use GifSourceOnLowerThanL...", null, 4, null);
            gifSourceOnLowerThanL = new GifSourceOnLowerThanL();
        }
        this.mGifImplement = gifSourceOnLowerThanL;
        gifSourceOnLowerThanL.init(this.mCtx);
        FilterBase filterBase = this.mGifImplement;
        if (filterBase != null) {
            filterBase.loadConfig(jSONObject);
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() {
        FilterBase filterBase = this.mGifImplement;
        return filterBase != null ? filterBase.render() : false;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public JSONObject saveConfig() {
        FilterBase filterBase = this.mGifImplement;
        return filterBase == null ? new JSONObject() : filterBase.saveConfig();
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) throws BGLException {
        FilterBase filterBase = this.mGifImplement;
        if (filterBase != null) {
            filterBase.tick(j7);
        }
    }
}
