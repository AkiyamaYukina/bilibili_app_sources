package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/BiligameIntroBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameIntroBean {
    public static final int $stable = 8;

    @JSONField(name = "authority")
    @Nullable
    private String authority;

    @JSONField(name = "developer_name")
    @Nullable
    private String developerName;

    @JSONField(name = "game_name")
    @Nullable
    private String gameName;

    @JSONField(name = "game_version")
    @Nullable
    private String gameVersion;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @JSONField(name = "privacy_policy_link")
    @Nullable
    private String privacyLink;

    @JSONField(name = "record_agent")
    @Nullable
    private String recordAgent;

    @JSONField(name = "record_number")
    @Nullable
    private String recordNumber;

    @JSONField(name = "lasted_update_time")
    @Nullable
    private String updateTime;

    @Nullable
    public final String getAuthority() {
        return this.authority;
    }

    @Nullable
    public final String getDeveloperName() {
        return this.developerName;
    }

    @Nullable
    public final String getGameName() {
        return this.gameName;
    }

    @Nullable
    public final String getGameVersion() {
        return this.gameVersion;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getPrivacyLink() {
        return this.privacyLink;
    }

    @Nullable
    public final String getRecordAgent() {
        return this.recordAgent;
    }

    @Nullable
    public final String getRecordNumber() {
        return this.recordNumber;
    }

    @Nullable
    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final void setAuthority(@Nullable String str) {
        this.authority = str;
    }

    public final void setDeveloperName(@Nullable String str) {
        this.developerName = str;
    }

    public final void setGameName(@Nullable String str) {
        this.gameName = str;
    }

    public final void setGameVersion(@Nullable String str) {
        this.gameVersion = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setPrivacyLink(@Nullable String str) {
        this.privacyLink = str;
    }

    public final void setRecordAgent(@Nullable String str) {
        this.recordAgent = str;
    }

    public final void setRecordNumber(@Nullable String str) {
        this.recordNumber = str;
    }

    public final void setUpdateTime(@Nullable String str) {
        this.updateTime = str;
    }
}
