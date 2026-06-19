package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameBookNotifyInfo.class */
@Keep
public class BiligameBookNotifyInfo {
    public int count;

    @JSONField(name = "game_list")
    public ArrayList<BiligameBookNotifyGame> gameList;

    @JSONField(name = "notify_status")
    public int notifyStatus;
}
