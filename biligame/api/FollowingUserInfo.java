package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/FollowingUserInfo.class */
@Keep
public class FollowingUserInfo {

    @JSONField(name = "face")
    public String face;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    public String mid;

    @JSONField(name = "uname")
    public String nick;
}
