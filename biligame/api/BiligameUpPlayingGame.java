package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameUpPlayingGame.class */
@Keep
public class BiligameUpPlayingGame extends BiligameMainGame {

    @JSONField(name = "game_image")
    public String gameImage;

    @JSONField(name = "up_play_count")
    public int upCount;

    @JSONField(name = "up_play_info")
    public List<UserInfo> upList;
}
