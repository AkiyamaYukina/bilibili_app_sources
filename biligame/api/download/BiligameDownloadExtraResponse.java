package com.bilibili.biligame.api.download;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/download/BiligameDownloadExtraResponse.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameDownloadExtraResponse {
    public static final int $stable = 8;

    @JSONField(name = "download_info")
    @Nullable
    private List<BiligameDownloadExtraBean> downloadInfo;

    @JSONField(name = "trail")
    @NotNull
    private String trail = "";

    @Nullable
    public final List<BiligameDownloadExtraBean> getDownloadInfo() {
        return this.downloadInfo;
    }

    @NotNull
    public final String getTrail() {
        return this.trail;
    }

    public final void setDownloadInfo(@Nullable List<BiligameDownloadExtraBean> list) {
        this.downloadInfo = list;
    }

    public final void setTrail(@NotNull String str) {
        this.trail = str;
    }
}
