package com.bilibili.studio.material.internal.net;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/net/ResourceResponse.class */
@Keep
public final class ResourceResponse {

    @JSONField(name = "list")
    @NotNull
    private List<ResourceItem> list = new ArrayList();

    @NotNull
    public final List<ResourceItem> getList() {
        return this.list;
    }

    public final void setList(@NotNull List<ResourceItem> list) {
        this.list = list;
    }
}
