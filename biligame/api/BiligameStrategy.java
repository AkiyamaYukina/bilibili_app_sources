package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameStrategy.class */
@Keep
public class BiligameStrategy {

    @JSONField(name = "expanded_name")
    public String expandedName;

    @JSONField(name = "game_icon")
    public String gameIcon;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "letter_group")
    public String letterGroup;

    @JSONField(name = "strategy_id")
    public String strategyId;

    @JSONField(name = "subscribe_status")
    public String subscribeStatus;

    public String toString() {
        StringBuilder sb = new StringBuilder("BiligameStrategy{strategyId='");
        sb.append(this.strategyId);
        sb.append("', gameName='");
        sb.append(this.gameName);
        sb.append("', gameIcon='");
        sb.append(this.gameIcon);
        sb.append("', subscribeStatus='");
        sb.append(this.subscribeStatus);
        sb.append("', letterGroup='");
        return C8770a.a(sb, this.letterGroup, "'}");
    }
}
