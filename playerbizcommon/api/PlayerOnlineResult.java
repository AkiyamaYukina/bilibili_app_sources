package com.bilibili.playerbizcommon.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/api/PlayerOnlineResult.class */
@Keep
public final class PlayerOnlineResult {

    @JSONField(name = "like_switch")
    private boolean likeSwitch;

    @JSONField(name = "online")
    @Nullable
    private Online online;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/api/PlayerOnlineResult$Online.class */
    @Keep
    public static final class Online {

        @JSONField(name = "total_text")
        @Nullable
        private String text;

        @Nullable
        public final String getText() {
            return this.text;
        }

        public final void setText(@Nullable String str) {
            this.text = str;
        }
    }

    public final boolean getLikeSwitch() {
        return this.likeSwitch;
    }

    @Nullable
    public final Online getOnline() {
        return this.online;
    }

    public final void setLikeSwitch(boolean z6) {
        this.likeSwitch = z6;
    }

    public final void setOnline(@Nullable Online online) {
        this.online = online;
    }
}
