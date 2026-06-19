package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GameStatus.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameStatus {
    public static final int $stable = 8;

    @JSONField(name = "game_status")
    private int gameStatus;

    @JSONField(name = "game_status_name")
    @Nullable
    private String gameStatusName;

    public final int getGameStatus() {
        return this.gameStatus;
    }

    @Nullable
    public final String getGameStatusName() {
        return this.gameStatusName;
    }

    public final void setGameStatus(int i7) {
        this.gameStatus = i7;
    }

    public final void setGameStatusName(@Nullable String str) {
        this.gameStatusName = str;
    }
}
