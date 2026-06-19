package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/StrategyRecommend.class */
@Keep
public class StrategyRecommend {

    @JSONField(name = "article_id")
    public String articleId;

    @JSONField(name = "av_id")
    public String avId;

    @JSONField(name = "bv_id")
    public String bvId;

    @JSONField(name = "content_type")
    public int contentType;

    @JSONField(name = "is_red")
    public int isRed;

    @JSONField(name = "recommend_id")
    public String recommendId;

    @JSONField(name = "recommend_name")
    public String recommendName;

    @JSONField(name = "strategy_id")
    public String strategyId;

    public boolean isRed() {
        boolean z6 = true;
        if (this.isRed != 1) {
            z6 = false;
        }
        return z6;
    }
}
