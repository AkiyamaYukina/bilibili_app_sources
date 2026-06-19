package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/StrategyCategory.class */
@Keep
public class StrategyCategory {

    @JSONField(name = "game_base_id")
    public String gameBaseId;

    @JSONField(name = "strategy_id")
    public String strategyId;

    @JSONField(name = "subscribe_status")
    public int subscribeStatus;

    @JSONField(name = "subscribed_strategy_categories")
    public List<StrategyTag> subscribedStrategyCategories;

    @JSONField(name = "un_subscribed_strategy_categories")
    public List<StrategyTag> unSubscribedStrategyCategories;
}
