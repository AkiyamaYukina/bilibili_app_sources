package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.card.GameCardButton;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameVideoGroupTop.class */
@Keep
public class BiligameVideoGroupTop {

    @JSONField(name = "android_book_link")
    public String androidBookLink;

    @JSONField(name = "android_game_status")
    public int androidGameStatus;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "pic")
    public String pic;

    @JSONField(name = "play_count")
    public int playCount;

    @JSONField(name = "android_skip_detail_link")
    public String protocolLink;

    @JSONField(name = "related_game_id")
    public String relatedGameId;

    @JSONField(name = "small_game_link")
    public String smallGameLink;

    @JSONField(name = GameCardButton.extraParamSource)
    public int source;

    @JSONField(name = "subtitle")
    public String subTitle;

    @JSONField(name = "type")
    public String type;

    @JSONField(name = "video_count")
    public int videoCount;
}
