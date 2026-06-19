package com.bilibili.playerbizcommon.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/api/PlayerCoinResult.class */
@Keep
public final class PlayerCoinResult {

    @JSONField(name = IVideoLikeRouteService.ACTION_LIKE)
    private boolean like;

    @JSONField(name = "prompt")
    private boolean prompt;

    public final boolean getLike() {
        return this.like;
    }

    public final boolean getPrompt() {
        return this.prompt;
    }

    public final void setLike(boolean z6) {
        this.like = z6;
    }

    public final void setPrompt(boolean z6) {
        this.prompt = z6;
    }
}
