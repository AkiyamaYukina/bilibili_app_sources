package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameNewMessageStatus.class */
@Keep
public class BiligameNewMessageStatus {

    @JSONField(name = "attitude_message")
    public boolean hasAttitudeNewMsg;

    @JSONField(name = "notice_message")
    public boolean hasNoticeNewMsg;

    @JSONField(name = "reply_message")
    public boolean hasReplyNewMsg;

    @JSONField(name = "order_message")
    public boolean hasSystemNewMsg;

    @JSONField(name = "system_notice_message")
    public boolean hasSystemNotice;

    @JSONField(name = "my_game_message_count")
    public int myGameMessageCount;

    @JSONField(name = "my_game_play_benefit")
    public int myGamePlayBenefit;

    @JSONField(name = "my_game_play_game")
    public int myGamePlayGame;

    @JSONField(name = "show")
    public boolean show;
}
