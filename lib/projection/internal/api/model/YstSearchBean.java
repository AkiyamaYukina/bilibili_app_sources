package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/YstSearchBean.class */
@Keep
public final class YstSearchBean {

    @JSONField(name = "no_device_text")
    @Nullable
    private String noDeviceText;

    @JSONField(name = "refresh_text")
    @Nullable
    private String refreshText;

    @JSONField(name = "searching_text")
    @Nullable
    private String searchingText;

    @Nullable
    public final String getNoDeviceText() {
        return this.noDeviceText;
    }

    @Nullable
    public final String getRefreshText() {
        return this.refreshText;
    }

    @Nullable
    public final String getSearchingText() {
        return this.searchingText;
    }

    public final void setNoDeviceText(@Nullable String str) {
        this.noDeviceText = str;
    }

    public final void setRefreshText(@Nullable String str) {
        this.refreshText = str;
    }

    public final void setSearchingText(@Nullable String str) {
        this.searchingText = str;
    }
}
