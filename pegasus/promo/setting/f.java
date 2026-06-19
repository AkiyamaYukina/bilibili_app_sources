package com.bilibili.pegasus.promo.setting;

import com.alibaba.fastjson.JSON;
import com.bilibili.lib.dd.DeviceDecision;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/f.class */
public final class f {
    @Nullable
    public static final VideoModeConfig a() {
        try {
            return (VideoModeConfig) JSON.parseObject(DeviceDecision.INSTANCE.dd("pegasus_video_play_style", (String) null), VideoModeConfig.class);
        } catch (Throwable th) {
            BLog.i("PegasusVideoMode", "parse failed ", th);
            return null;
        }
    }
}
