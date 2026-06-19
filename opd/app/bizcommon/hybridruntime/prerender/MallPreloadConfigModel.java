package com.bilibili.opd.app.bizcommon.hybridruntime.prerender;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/prerender/MallPreloadConfigModel.class */
@Keep
public final class MallPreloadConfigModel {

    @JSONField(name = "preloadUrls")
    @Nullable
    private List<String> preloadUrls;

    @JSONField(name = "targetPv")
    @Nullable
    private String targetPv;

    @JSONField(name = "ttl")
    @Nullable
    private Long ttl;

    @Nullable
    public final List<String> getPreloadUrls() {
        return this.preloadUrls;
    }

    @Nullable
    public final String getTargetPv() {
        return this.targetPv;
    }

    @Nullable
    public final Long getTtl() {
        return this.ttl;
    }

    public final void setPreloadUrls(@Nullable List<String> list) {
        this.preloadUrls = list;
    }

    public final void setTargetPv(@Nullable String str) {
        this.targetPv = str;
    }

    public final void setTtl(@Nullable Long l7) {
        this.ttl = l7;
    }
}
