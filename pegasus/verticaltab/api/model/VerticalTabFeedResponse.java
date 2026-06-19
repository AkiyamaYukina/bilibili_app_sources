package com.bilibili.pegasus.verticaltab.api.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/api/model/VerticalTabFeedResponse.class */
@Keep
public class VerticalTabFeedResponse {

    @Nullable
    @JSONField(name = "config")
    public VerticalTabConfig config;

    @Nullable
    @JSONField(name = "items")
    public List<BasicIndexItem> items;

    @Nullable
    @JSONField(name = MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
    public VerticalTabPage page;
}
