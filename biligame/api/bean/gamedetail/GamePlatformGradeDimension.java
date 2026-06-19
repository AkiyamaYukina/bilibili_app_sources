package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GamePlatformGradeDimension.class */
@Keep
public class GamePlatformGradeDimension {

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "score")
    public double score;
}
