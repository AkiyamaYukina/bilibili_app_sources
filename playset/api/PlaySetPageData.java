package com.bilibili.playset.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySetPageData.class */
@Keep
public class PlaySetPageData {

    @JSONField(name = "has_more")
    public boolean hasMore;

    @JSONField(name = "list")
    public List<PlaySet> list;

    @JSONField(name = "season")
    public PlaySeason season;

    @JSONField(name = "count")
    public int totalCount;
}
