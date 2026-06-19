package com.bilibili.biligame.beantri.comment;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/beantri/comment/VideoCommentConfig.class */
@StabilityInferred(parameters = 0)
@Keep
public final class VideoCommentConfig {
    public static final int $stable = 8;

    @JSONField(name = "is_show_video")
    private boolean videoCommentEnable;

    @JSONField(name = "video_count")
    private int videoCountLimit = 3;

    public final boolean getVideoCommentEnable() {
        return this.videoCommentEnable;
    }

    public final int getVideoCountLimit() {
        return this.videoCountLimit;
    }

    public final void setVideoCommentEnable(boolean z6) {
        this.videoCommentEnable = z6;
    }

    public final void setVideoCountLimit(int i7) {
        this.videoCountLimit = i7;
    }
}
