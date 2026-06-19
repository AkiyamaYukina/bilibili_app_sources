package com.bilibili.pegasus.promo.setting;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/InlineVolumeSettingConfig.class */
@StabilityInferred(parameters = 1)
@Keep
public final class InlineVolumeSettingConfig {
    public static final int $stable = 0;

    @SerializedName("guidance_button_text")
    @Nullable
    private final String guidanceButtonText;

    @SerializedName("guidance_cd_time")
    private final int guidanceCdTime;

    @SerializedName("guidance_title")
    @Nullable
    private final String guidanceTitle;

    @SerializedName("setting_enable")
    private final boolean settingEnable = true;

    @SerializedName("setting_switch_text")
    @Nullable
    private final String settingSwitchText;

    @SerializedName("setting_title")
    @Nullable
    private final String settingTitle;

    @Nullable
    public final String getGuidanceButtonText() {
        String str = this.guidanceButtonText;
        return (str == null || StringsKt.isBlank(str)) ? "默认打开" : this.guidanceButtonText;
    }

    public final int getGuidanceCdTime() {
        int i7 = this.guidanceCdTime;
        int i8 = i7;
        if (i7 < 1) {
            i8 = 180;
        }
        return i8;
    }

    @Nullable
    public final String getGuidanceTitle() {
        String str = this.guidanceTitle;
        return (str == null || StringsKt.isBlank(str)) ? "默认打开声音，播放体验更丰富" : this.guidanceTitle;
    }

    public final boolean getSettingEnable() {
        return this.settingEnable;
    }

    @Nullable
    public final String getSettingSwitchText() {
        String str = this.settingSwitchText;
        return (str == null || StringsKt.isBlank(str)) ? "启动应用时，声音默认开启" : this.settingSwitchText;
    }

    @Nullable
    public final String getSettingTitle() {
        String str = this.settingTitle;
        return (str == null || StringsKt.isBlank(str)) ? "首页大卡默认声音状态" : this.settingTitle;
    }
}
