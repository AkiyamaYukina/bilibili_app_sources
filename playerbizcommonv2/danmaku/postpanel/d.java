package com.bilibili.playerbizcommonv2.danmaku.postpanel;

import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.biliplayerv2.service.PlayerProgressObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/postpanel/d.class */
public final class d implements PlayerProgressObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DanmakuTimerService f81225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<PostPanelV2> f81226b;

    public d(DanmakuTimerService danmakuTimerService, List<PostPanelV2> list) {
        this.f81225a = danmakuTimerService;
        this.f81226b = list;
    }

    public final void onPlayerProgressChange(int i7, int i8) {
        Object next;
        Iterator<T> it = this.f81226b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (e.a((PostPanelV2) next, i7)) {
                    break;
                }
            }
        }
        DanmakuTimerService.e(this.f81225a, (PostPanelV2) next);
    }
}
