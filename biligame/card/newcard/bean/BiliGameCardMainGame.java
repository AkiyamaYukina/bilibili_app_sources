package com.bilibili.biligame.card.newcard.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/bean/BiliGameCardMainGame.class */
@Keep
public final class BiliGameCardMainGame {

    @JSONField(name = "is_book")
    private boolean booked;

    @JSONField(name = "game_base_id")
    private int gameBaseId = -1;

    @JSONField(name = "android_game_status")
    private int androidGameStatus = -1;

    public final boolean bookGame() {
        int i7 = this.androidGameStatus;
        boolean z6 = true;
        if (i7 != 1) {
            z6 = i7 == 2;
        }
        return z6;
    }

    public final int getAndroidGameStatus() {
        return this.androidGameStatus;
    }

    public final boolean getBooked() {
        return this.booked;
    }

    public final int getGameBaseId() {
        return this.gameBaseId;
    }

    public final void setAndroidGameStatus(int i7) {
        this.androidGameStatus = i7;
    }

    public final void setBooked(boolean z6) {
        this.booked = z6;
    }

    public final void setGameBaseId(int i7) {
        this.gameBaseId = i7;
    }
}
