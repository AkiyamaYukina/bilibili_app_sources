package com.bilibili.biligame.api.bean.discover;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/discover/GameTopicVideo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameTopicVideo {
    public static final int $stable = 8;

    @JSONField(name = "av_id")
    @Nullable
    private String avId;

    @JSONField(name = "bv_id")
    @Nullable
    private String bvId;

    @JSONField(name = "cid")
    @Nullable
    private String cid;

    @JSONField(name = "start_play_position")
    private int startPlayPosition;

    @JSONField(name = "video_cover_image")
    @Nullable
    private String videoCoverImage;

    @Nullable
    public final String getAvId() {
        return this.avId;
    }

    @Nullable
    public final String getBvId() {
        return this.bvId;
    }

    @Nullable
    public final String getCid() {
        return this.cid;
    }

    public final int getStartPlayPosition() {
        return this.startPlayPosition;
    }

    @Nullable
    public final String getVideoCoverImage() {
        return this.videoCoverImage;
    }

    public final void setAvId(@Nullable String str) {
        this.avId = str;
    }

    public final void setBvId(@Nullable String str) {
        this.bvId = str;
    }

    public final void setCid(@Nullable String str) {
        this.cid = str;
    }

    public final void setStartPlayPosition(int i7) {
        this.startPlayPosition = i7;
    }

    public final void setVideoCoverImage(@Nullable String str) {
        this.videoCoverImage = str;
    }
}
