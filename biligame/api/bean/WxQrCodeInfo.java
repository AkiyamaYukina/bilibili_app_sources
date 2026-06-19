package com.bilibili.biligame.api.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/WxQrCodeInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WxQrCodeInfo {
    public static final int $stable = 8;

    @JSONField(name = TextSource.CFG_CONTENT)
    @Nullable
    private String content;

    @JSONField(name = "is_followed")
    private int followed;

    @JSONField(name = "qrcode_url")
    @Nullable
    private String qrcodeUrl;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final int getFollowed() {
        return this.followed;
    }

    @Nullable
    public final String getQrcodeUrl() {
        return this.qrcodeUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setFollowed(int i7) {
        this.followed = i7;
    }

    public final void setQrcodeUrl(@Nullable String str) {
        this.qrcodeUrl = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
