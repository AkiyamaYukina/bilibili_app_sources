package com.bilibili.playerbizcommon.widget.function.feedback;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/UserFeedbackTag.class */
@Keep
public final class UserFeedbackTag {

    @JSONField(name = "id")
    @NotNull
    private String id;

    @JSONField(name = "name")
    @NotNull
    private String name;

    public UserFeedbackTag(@NotNull String str, @NotNull String str2) {
        this.id = str;
        this.name = str2;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setId(@NotNull String str) {
        this.id = str;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }
}
