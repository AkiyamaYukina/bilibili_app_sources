package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameForumHotPosts.class */
@Keep
public class GameForumHotPosts {

    @JSONField(name = "notice")
    public Notice notice;

    @JSONField(name = "total_count")
    public int totalCount;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameForumHotPosts$Notice.class */
    @Keep
    public static class Notice {
        public String title;
        public String url;
    }
}
