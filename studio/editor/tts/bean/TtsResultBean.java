package com.bilibili.studio.editor.tts.bean;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/bean/TtsResultBean.class */
@Keep
public final class TtsResultBean {

    @JSONField(name = "err_msg")
    @Nullable
    private String errMsg;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    private int status;

    @JSONField(name = "url")
    @Nullable
    private String url;

    @Nullable
    public final String getErrMsg() {
        return this.errMsg;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setErrMsg(@Nullable String str) {
        this.errMsg = str;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
