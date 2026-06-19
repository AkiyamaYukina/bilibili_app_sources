package com.bilibili.pegasus.promo.setting;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/VideoModeConfig.class */
@StabilityInferred(parameters = 0)
@Keep
public final class VideoModeConfig {
    public static final int $stable = 8;

    @JSONField(name = "items")
    @Nullable
    private List<VideoModeConfigItem> items;

    @JSONField(name = "switcher")
    private int switcher;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @Nullable
    public final List<VideoModeConfigItem> getItems() {
        return this.items;
    }

    public final int getSwitcher() {
        return this.switcher;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final boolean isValid() {
        List<VideoModeConfigItem> list;
        if (this.switcher != 1 || (list = this.items) == null || list.size() != 2) {
            return false;
        }
        List<VideoModeConfigItem> list2 = this.items;
        if (list2 == null) {
            return true;
        }
        for (VideoModeConfigItem videoModeConfigItem : list2) {
            if (videoModeConfigItem == null || !videoModeConfigItem.isValid()) {
                return false;
            }
        }
        return true;
    }

    public final void setItems(@Nullable List<VideoModeConfigItem> list) {
        this.items = list;
    }

    public final void setSwitcher(int i7) {
        this.switcher = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
