package com.bilibili.search2.panel;

import com.bilibili.lib.config.BLRemoteConfig;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/panel/f.class */
public final /* synthetic */ class f implements Function0 {
    public final Object invoke() {
        Object searchInlinePlayToastBean;
        String string = BLRemoteConfig.getInstance().getString("search_inline_auto_play_toast");
        if (string == null || StringsKt.isBlank(string)) {
            BLog.w("BLRemoteConfigUtil", "get search_inline_auto_play_toast BLRemote config json string null");
            searchInlinePlayToastBean = new SearchInlinePlayToastBean();
        } else {
            searchInlinePlayToastBean = com.bilibili.app.comm.list.common.utils.a.b(string, "search_inline_auto_play_toast", SearchInlinePlayToastBean.class, new SearchInlinePlayToastBean());
        }
        return (SearchInlinePlayToastBean) searchInlinePlayToastBean;
    }
}
