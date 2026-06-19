package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameRankCategory.class */
@Keep
public class BiligameRankCategory extends BiligameCategory {

    @JSONField(name = "rank_list")
    public List<BiligameRank> rankList;
}
