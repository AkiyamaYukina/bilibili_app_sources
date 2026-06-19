package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/ConditionItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ConditionItem {
    public static final int $stable = 8;

    @JSONField(name = "back_up")
    private int backUp;

    @JSONField(name = "cid")
    @Nullable
    private String cid;

    @JSONField(name = "description")
    @Nullable
    private String description;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "ref_id")
    @Nullable
    private String refId;

    @JSONField(name = "rule")
    @Nullable
    private String rule;

    @JSONField(name = "scene")
    @Nullable
    private String scene;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    private int status;

    @JSONField(name = "type")
    private int type;

    @JSONField(name = "url")
    @Nullable
    private String url;

    public final int getBackUp() {
        return this.backUp;
    }

    @Nullable
    public final String getCid() {
        return this.cid;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getRefId() {
        return this.refId;
    }

    @Nullable
    public final String getRule() {
        return this.rule;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final boolean isBackUp() {
        boolean z6 = true;
        if (this.backUp != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setBackUp(int i7) {
        this.backUp = i7;
    }

    public final void setCid(@Nullable String str) {
        this.cid = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRefId(@Nullable String str) {
        this.refId = str;
    }

    public final void setRule(@Nullable String str) {
        this.rule = str;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final boolean unCompleted() {
        return this.status == 0;
    }
}
