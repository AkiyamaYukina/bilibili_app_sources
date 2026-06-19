package com.bilibili.pegasus.inline.setting;

import com.bilibili.lib.config.BLRemoteConfig;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/inline/setting/b.class */
public final /* synthetic */ class b implements Function0 {
    public final Object invoke() {
        Object autoPlaySetting;
        String string = BLRemoteConfig.getInstance().getString("inline_auto_play_setting");
        if (string == null || StringsKt.isBlank(string)) {
            BLog.w("BLRemoteConfigUtil", "get inline_auto_play_setting BLRemote config json string null");
            autoPlaySetting = new AutoPlaySetting();
        } else {
            autoPlaySetting = com.bilibili.app.comm.list.common.utils.a.b(string, "inline_auto_play_setting", AutoPlaySetting.class, new AutoPlaySetting());
        }
        return (AutoPlaySetting) autoPlaySetting;
    }
}
