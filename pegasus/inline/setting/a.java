package com.bilibili.pegasus.inline.setting;

import com.bilibili.lib.config.BLRemoteConfig;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/inline/setting/a.class */
public final /* synthetic */ class a implements Function0 {
    public final Object invoke() {
        Object inlinePlayToastBean;
        String string = BLRemoteConfig.getInstance().getString("inline_auto_play_toast");
        if (string == null || StringsKt.isBlank(string)) {
            BLog.w("BLRemoteConfigUtil", "get inline_auto_play_toast BLRemote config json string null");
            inlinePlayToastBean = new InlinePlayToastBean();
        } else {
            inlinePlayToastBean = com.bilibili.app.comm.list.common.utils.a.b(string, "inline_auto_play_toast", InlinePlayToastBean.class, new InlinePlayToastBean());
        }
        return (InlinePlayToastBean) inlinePlayToastBean;
    }
}
