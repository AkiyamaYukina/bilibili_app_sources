package com.bilibili.biligame.api.book;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/book/AutoDownloadStatus.class */
@StabilityInferred(parameters = 0)
@Keep
public final class AutoDownloadStatus implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "game_base_id")
    private int gameBaseId;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    private int status;

    @JSONField(name = "type")
    @Nullable
    private String type;

    public final int getGameBaseId() {
        return this.gameBaseId;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setGameBaseId(int i7) {
        this.gameBaseId = i7;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
