package com.bilibili.studio.material.internal.net;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/net/Bgm.class */
@Keep
public final class Bgm {

    @JSONField(name = "sid")
    @NotNull
    private String sid = "";

    @JSONField(name = "play_url")
    @NotNull
    private String url = "";

    @JSONField(name = "name")
    @NotNull
    private String name = "";

    @NotNull
    private String cover = "";

    @NotNull
    public final String getCover() {
        return this.cover;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setCover(@NotNull String str) {
        this.cover = str;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setSid(@NotNull String str) {
        this.sid = str;
    }

    public final void setUrl(@NotNull String str) {
        this.url = str;
    }
}
