package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameMessageNotice.class */
@Keep
public class BiligameMessageNotice {
    public static final int TYPE_CREATE = 0;
    public static final int TYPE_JUMP_LINK = 1;

    @JSONField(name = "bulletin_no")
    public String id;

    @JSONField(name = "link")
    public String link;

    @JSONField(name = "title")
    public String title;

    @JSONField(name = "type")
    public int type;
}
