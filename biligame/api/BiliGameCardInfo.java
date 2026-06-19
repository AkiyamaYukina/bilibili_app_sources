package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiliGameCardInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiliGameCardInfo extends BiligameHotGame {
    public static final int $stable = 8;

    @JSONField(name = "is_book")
    private boolean book;

    @JSONField(name = "game_status")
    private int gameStatus = 2;

    @JSONField(name = "is_online")
    private boolean isOnline;

    @JSONField(name = "link")
    @Nullable
    private String link;

    public final boolean getBook() {
        return this.book;
    }

    public final int getGameStatus() {
        return this.gameStatus;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    public final boolean isOnline() {
        return this.isOnline;
    }

    public final void setBook(boolean z6) {
        this.book = z6;
    }

    public final void setGameStatus(int i7) {
        this.gameStatus = i7;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setOnline(boolean z6) {
        this.isOnline = z6;
    }
}
