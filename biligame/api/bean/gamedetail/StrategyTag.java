package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/StrategyTag.class */
@Keep
public class StrategyTag {
    public boolean isSelect;

    @JSONField(name = "strategy_category_id")
    public String strategyCategoryId;

    @JSONField(name = "strategy_category_name")
    public String strategyCategoryName;
}
