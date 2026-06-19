package com.bilibili.mini.player.biz;

import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.mini.player.biz.b;
import com.bilibili.mini.player.common.utils.i;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/a.class */
public final /* synthetic */ class a implements PassportObserver {
    public final void onChange(Topic topic) {
        BLog.i("DefaultMiniPlayerBizManager", "login status change to " + topic);
        if ((topic == null ? -1 : b.a.f66056a[topic.ordinal()]) == 1) {
            i.a();
        }
    }
}
