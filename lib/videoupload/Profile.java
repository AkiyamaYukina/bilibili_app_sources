package com.bilibili.lib.videoupload;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/Profile.class */
@Keep
public final class Profile {

    @JSONField(name = "upload")
    @NotNull
    private String upload = "ugcfx/st-android";

    @JSONField(name = "meta")
    @NotNull
    private String meta = "fxmeta/st-android";

    @NotNull
    public final String getMeta() {
        return this.meta;
    }

    @NotNull
    public final String getUpload() {
        return this.upload;
    }

    public final void setMeta(@NotNull String str) {
        this.meta = str;
    }

    public final void setUpload(@NotNull String str) {
        this.upload = str;
    }
}
