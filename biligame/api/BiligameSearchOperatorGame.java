package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSearchOperatorGame.class */
@Keep
public class BiligameSearchOperatorGame {

    @JSONField(name = "game_list")
    public List<BiligameMainGame> gameList;

    @JSONField(name = "search_game_base_id")
    public int searchGameBaseId = 0;

    @JSONField(name = "operator_id")
    public String operatorId = "";

    @JSONField(name = "operator_name")
    public String operatorName = "";
}
