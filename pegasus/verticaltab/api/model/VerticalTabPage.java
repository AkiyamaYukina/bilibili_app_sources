package com.bilibili.pegasus.verticaltab.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/api/model/VerticalTabPage.class */
@Keep
public class VerticalTabPage {

    @JSONField(name = "offset")
    public int offset = 0;

    @JSONField(name = "has_more")
    public boolean hasMore = false;
}
