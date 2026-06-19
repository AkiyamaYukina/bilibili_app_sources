package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/PlayerUiBean.class */
@Keep
public final class PlayerUiBean {

    @JSONField(name = "dm_tag")
    @Nullable
    private String dmTag;

    @JSONField(name = "official_tag")
    @Nullable
    private String officialTag;

    @Nullable
    public final String getDmTag() {
        return this.dmTag;
    }

    @Nullable
    public final String getOfficialTag() {
        return this.officialTag;
    }

    public final void setDmTag(@Nullable String str) {
        this.dmTag = str;
    }

    public final void setOfficialTag(@Nullable String str) {
        this.officialTag = str;
    }
}
