package com.bilibili.userfeedback.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/model/UserFeedbackItem.class */
@Keep
public class UserFeedbackItem {

    @Nullable
    public String content;
    public long ctime;
    public boolean guide;

    @Nullable
    @JSONField(name = "img_url")
    public String imgUrl;

    @Nullable
    @JSONField(name = "log_url")
    public String logUrl;

    @Nullable
    @JSONField(name = "reply_id")
    public String replyId;
    public int type;
}
