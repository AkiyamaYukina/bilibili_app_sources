package com.bilibili.biligame.api.category;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/category/BiligameCategoryBanner.class */
@Keep
public class BiligameCategoryBanner {

    @JSONField(name = "game_count")
    public int gameCount;

    @JSONField(name = "icon_list")
    public List<String> iconList;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "tag_id")
    public long tagId;
}
