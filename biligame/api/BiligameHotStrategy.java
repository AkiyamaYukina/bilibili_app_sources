package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameHotStrategy.class */
@Keep
public class BiligameHotStrategy {
    public static int STRATEGY_TYPE_NORMAL = 1;
    public static int STRATEGY_TYPE_VIDEO = 2;

    @JSONField(name = "article_type")
    public int articleType;

    @JSONField(name = "article_id")
    public String articleid;

    @JSONField(name = "av_id")
    public String avId;

    @JSONField(name = "bv_id")
    public String bvId;

    @JSONField(name = "content_type")
    public int contentType;

    @JSONField(name = "cover_image")
    public String coverImage;

    @JSONField(name = "expanded_name")
    public String expandedName;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "strategy_id")
    public String strategyid;

    @JSONField(name = "article_title")
    public String title;

    @JSONField(name = "up_count")
    public int upCount;

    @JSONField(name = "view_count")
    public int viewCount;

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof BiligameHotStrategy)) {
            return false;
        }
        BiligameHotStrategy biligameHotStrategy = (BiligameHotStrategy) obj;
        String str = this.articleid;
        if (str == null || !str.equals(biligameHotStrategy.articleid) || this.contentType != biligameHotStrategy.contentType || this.viewCount != biligameHotStrategy.viewCount || this.upCount != biligameHotStrategy.upCount) {
            z6 = false;
        }
        return z6;
    }
}
