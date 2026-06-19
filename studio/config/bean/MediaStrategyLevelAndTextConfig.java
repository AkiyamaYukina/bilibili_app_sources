package com.bilibili.studio.config.bean;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/config/bean/MediaStrategyLevelAndTextConfig.class */
@Keep
public final class MediaStrategyLevelAndTextConfig {

    @Nullable
    private Map<String, Integer> level;

    @Nullable
    private Map<String, ? extends List<String>> text;

    @Nullable
    public final Map<String, Integer> getLevel() {
        return this.level;
    }

    @Nullable
    public final Map<String, List<String>> getText() {
        return this.text;
    }

    public final void setLevel(@Nullable Map<String, Integer> map) {
        this.level = map;
    }

    public final void setText(@Nullable Map<String, ? extends List<String>> map) {
        this.text = map;
    }
}
