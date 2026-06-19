package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameHotGame;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailPopNotice.class */
@Keep
public class GameDetailPopNotice extends BiligameHotGame {

    @JSONField(name = "notice_content")
    public String noticeContent;

    @JSONField(name = "notice_image")
    public String noticeImage;

    @JSONField(name = "notice_title")
    public String noticeTitle;
}
