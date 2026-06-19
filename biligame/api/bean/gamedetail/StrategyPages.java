package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameStrategyPage;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/StrategyPages.class */
@Keep
public class StrategyPages {

    @JSONField(name = "list")
    public List<BiligameStrategyPage> list;

    @JSONField(name = "page_number")
    public int pageNumber;

    @JSONField(name = "page_size")
    public int pageSize;
}
