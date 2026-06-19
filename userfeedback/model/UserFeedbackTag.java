package com.bilibili.userfeedback.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/model/UserFeedbackTag.class */
@Keep
public class UserFeedbackTag {

    @Nullable
    @JSONField(name = "id")
    public String id;

    @Nullable
    @JSONField(name = "name")
    public String name;

    public UserFeedbackTag() {
    }

    public UserFeedbackTag(@Nullable String str, @Nullable String str2) {
        this.id = str;
        this.name = str2;
    }
}
