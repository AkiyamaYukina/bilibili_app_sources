package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GamePlatformGrade.class */
@Keep
public class GamePlatformGrade {

    @JSONField(name = TextSource.CFG_CONTENT)
    public String content;

    @JSONField(name = "dim_list")
    public List<GamePlatformGradeDimension> dimList;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "score")
    public float grade;
}
