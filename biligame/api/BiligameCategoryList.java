package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.SimpleGame;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameCategoryList.class */
@Keep
public class BiligameCategoryList extends BiligameCategory {

    @JSONField(name = "game_list")
    public List<SimpleGame> gameList;
}
