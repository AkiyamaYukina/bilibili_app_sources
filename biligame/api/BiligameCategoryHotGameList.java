package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameCategoryHotGameList.class */
@Keep
public class BiligameCategoryHotGameList extends BiligameCategory {

    @JSONField(name = "game_list")
    public List<BiligameHotGame> gameList;
}
