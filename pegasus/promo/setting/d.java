package com.bilibili.pegasus.promo.setting;

import com.bilibili.lib.blconfig.ConfigManager;
import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/d.class */
public final class d {
    @NotNull
    public static final InlineVolumeSettingConfig a() {
        InlineVolumeSettingConfig inlineVolumeSettingConfig;
        try {
            InlineVolumeSettingConfig inlineVolumeSettingConfig2 = (InlineVolumeSettingConfig) new Gson().fromJson(ConfigManager.Companion.getConfig("pegasus.inline_volume_setting_config_v2", ""), InlineVolumeSettingConfig.class);
            inlineVolumeSettingConfig = inlineVolumeSettingConfig2;
            if (inlineVolumeSettingConfig2 == null) {
                inlineVolumeSettingConfig = new InlineVolumeSettingConfig();
            }
        } catch (Exception e7) {
            BLog.i("getInlineVolumeSettingConfig", "error", e7);
            inlineVolumeSettingConfig = new InlineVolumeSettingConfig();
        }
        return inlineVolumeSettingConfig;
    }
}
