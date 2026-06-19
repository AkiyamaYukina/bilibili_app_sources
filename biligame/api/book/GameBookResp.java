package com.bilibili.biligame.api.book;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/book/GameBookResp.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameBookResp implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "reserve_tip")
    @Nullable
    private String reserveTip;

    @JSONField(name = "reserved_games")
    @Nullable
    private List<Integer> reservedGames;

    @Nullable
    public final String getReserveTip() {
        return this.reserveTip;
    }

    @Nullable
    public final List<Integer> getReservedGames() {
        return this.reservedGames;
    }

    public final void setReserveTip(@Nullable String str) {
        this.reserveTip = str;
    }

    public final void setReservedGames(@Nullable List<Integer> list) {
        this.reservedGames = list;
    }
}
