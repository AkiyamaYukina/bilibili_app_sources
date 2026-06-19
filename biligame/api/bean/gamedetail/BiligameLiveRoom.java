package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/BiligameLiveRoom.class */
@Keep
public class BiligameLiveRoom {

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "live_list")
    public ArrayList<BiligameLiveRoomInfo> liverooms;
}
