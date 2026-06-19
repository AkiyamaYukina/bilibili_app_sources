package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameCollection.class */
@Keep
public class BiligameCollection {

    @JSONField(name = "collection_style_type")
    public int collectionStyleType;

    @JSONField(name = "cover_image")
    public String coverImage;

    @JSONField(name = "game_list")
    public List<BiligameMainGame> gameList;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "sub_title")
    public String subTitle;

    @JSONField(name = "summary")
    public String summary;

    @JSONField(name = "type")
    public int type;

    @JSONField(name = "type_id")
    public long typeId;
}
