package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameUpdateGame.class */
@Keep
public class BiligameUpdateGame extends BiligameHotGame {

    @JSONField(name = "latest_update")
    public String latestUpdateInfo;
    public Boolean unread = Boolean.FALSE;
    public String version;
}
