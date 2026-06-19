package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.card.GameCardButton;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameTopicGame.class */
@Keep
public class BiligameTopicGame {

    @JSONField(name = "android_book_link")
    public String bookLink;

    @JSONField(name = "game_icon")
    public String gameIcon;

    @JSONField(name = "game_base_id")
    public int gameId;

    @JSONField(name = "android_game_status")
    public int gameStatus;

    @JSONField(name = "android_skip_detail_link")
    public String protocolLink;

    @JSONField(name = "small_game_link")
    public String smallGameLink;

    @JSONField(name = GameCardButton.extraParamSource)
    public int source;
}
