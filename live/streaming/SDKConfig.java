package com.bilibili.live.streaming;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/SDKConfig.class */
@Keep
public final class SDKConfig {

    @SerializedName("filter_profile_level")
    private boolean filterProfileLevel = true;

    @SerializedName("use_fix_encoder")
    private boolean useFixEncoder = true;

    public final boolean getFilterProfileLevel() {
        return this.filterProfileLevel;
    }

    public final boolean getUseFixEncoder() {
        return this.useFixEncoder;
    }

    public final void setFilterProfileLevel(boolean z6) {
        this.filterProfileLevel = z6;
    }

    public final void setUseFixEncoder(boolean z6) {
        this.useFixEncoder = z6;
    }
}
