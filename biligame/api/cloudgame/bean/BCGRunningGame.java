package com.bilibili.biligame.api.cloudgame.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/bean/BCGRunningGame.class */
@Keep
public class BCGRunningGame {
    public String buvid;

    @JSONField(name = "create_time")
    public String createTime;

    @JSONField(name = "game_base_id")
    public String gameBaseId;

    @JSONField(name = "session_id")
    public String sessionId;
}
