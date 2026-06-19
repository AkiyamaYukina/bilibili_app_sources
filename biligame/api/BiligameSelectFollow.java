package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSelectFollow.class */
@Keep
public class BiligameSelectFollow {

    @JSONField(name = "follow_game_list")
    public List<BiligameMainGame> followGameList;

    @JSONField(name = "recommend_game_list")
    public List<BiligameMainGame> recommendGameList;
}
