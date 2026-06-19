package com.bilibili.biligame.api.comment;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/comment/CommentBanStatus.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CommentBanStatus {
    public static final int $stable = 8;

    @JSONField(name = "ban_state")
    private boolean banState;

    @JSONField(name = "message")
    @Nullable
    private String message;

    public final boolean getBanState() {
        return this.banState;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final void setBanState(boolean z6) {
        this.banState = z6;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }
}
