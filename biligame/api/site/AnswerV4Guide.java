package com.bilibili.biligame.api.site;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/site/AnswerV4Guide.class */
@StabilityInferred(parameters = 0)
@Keep
public final class AnswerV4Guide {
    public static final int $stable = 8;

    @JSONField(name = "button_a")
    @Nullable
    private String buttonA;

    @JSONField(name = "button_b")
    @Nullable
    private String buttonB;

    @Nullable
    private String desc;

    @Nullable
    private String link;

    @Nullable
    private List<Reward> rewards;
    private int status;

    @Nullable
    private String title;

    @JSONField(name = "view_type")
    private int viewType;

    @Nullable
    public final String getButtonA() {
        return this.buttonA;
    }

    @Nullable
    public final String getButtonB() {
        return this.buttonB;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final List<Reward> getRewards() {
        return this.rewards;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public final void setButtonA(@Nullable String str) {
        this.buttonA = str;
    }

    public final void setButtonB(@Nullable String str) {
        this.buttonB = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setRewards(@Nullable List<Reward> list) {
        this.rewards = list;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setViewType(int i7) {
        this.viewType = i7;
    }
}
