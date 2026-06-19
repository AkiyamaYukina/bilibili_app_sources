package com.bilibili.biligame.api.download;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/download/BiligameTrackInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameTrackInfo implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "callback_url_format")
    @Nullable
    private String callbackUrlFormat;

    @JSONField(name = "track_id")
    @Nullable
    private String trackId;

    @Nullable
    public final String getCallbackUrlFormat() {
        return this.callbackUrlFormat;
    }

    @Nullable
    public final String getTrackId() {
        return this.trackId;
    }

    public final void setCallbackUrlFormat(@Nullable String str) {
        this.callbackUrlFormat = str;
    }

    public final void setTrackId(@Nullable String str) {
        this.trackId = str;
    }
}
