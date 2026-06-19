package com.bilibili.biligame.api.category;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameTag;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/category/BiligameCategoryGameList.class */
@Keep
public class BiligameCategoryGameList {

    @JSONField(name = "is_followed")
    public boolean is_followed;

    @JSONField(name = "tag_list")
    public List<BiligameTag> tagList;
}
