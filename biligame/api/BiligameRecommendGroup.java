package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.BiligameVideoInfo;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameRecommendGroup.class */
@Keep
public class BiligameRecommendGroup {

    @JSONField(name = "collection_id")
    public String collectionId;

    @JSONField(name = "video_count")
    public int count;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "pic")
    public String pic;

    @JSONField(name = "related_game_id")
    public String relatedGameId;

    @JSONField(name = "related_game_name")
    public String relatedGameName;

    @JSONField(name = "title")
    public String title;

    @JSONField(name = "type")
    public String type;

    @JSONField(name = "video_list")
    public List<BiligameVideoInfo> videoList;
}
