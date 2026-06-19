package com.bilibili.pegasus.inline.setting;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/inline/setting/AutoPlaySetting.class */
@Keep
final class AutoPlaySetting {

    @JSONField(name = "inline_autoplay_network_all")
    @Nullable
    private String settingAllNetwork;

    @JSONField(name = "inline_autoplay_off")
    @Nullable
    private String settingClose;

    @JSONField(name = "inline_autoplay_title")
    @Nullable
    private String settingTitle;

    @JSONField(name = "inline_autoplay_network_wifi")
    @Nullable
    private String settingWifi;

    @NotNull
    public String getInlineAutoPlayNetworkAll() {
        return d.a(2131841355, this.settingAllNetwork);
    }

    @NotNull
    public String getInlineAutoPlayOff() {
        return d.a(2131845349, this.settingClose);
    }

    @NotNull
    public String getInlineAutoPlayTitle() {
        return d.a(2131845098, this.settingTitle);
    }

    @NotNull
    public String getInlineAutoPlayWifi() {
        return d.a(2131845352, this.settingWifi);
    }

    @Nullable
    public final String getSettingAllNetwork() {
        return this.settingAllNetwork;
    }

    @Nullable
    public final String getSettingClose() {
        return this.settingClose;
    }

    @Nullable
    public final String getSettingTitle() {
        return this.settingTitle;
    }

    @Nullable
    public final String getSettingWifi() {
        return this.settingWifi;
    }

    public final void setSettingAllNetwork(@Nullable String str) {
        this.settingAllNetwork = str;
    }

    public final void setSettingClose(@Nullable String str) {
        this.settingClose = str;
    }

    public final void setSettingTitle(@Nullable String str) {
        this.settingTitle = str;
    }

    public final void setSettingWifi(@Nullable String str) {
        this.settingWifi = str;
    }
}
