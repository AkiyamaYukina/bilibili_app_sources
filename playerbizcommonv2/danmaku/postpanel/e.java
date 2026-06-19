package com.bilibili.playerbizcommonv2.danmaku.postpanel;

import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/postpanel/e.class */
public final class e {
    public static final boolean a(PostPanelV2 postPanelV2, long j7) {
        return j7 >= postPanelV2.getStart() && (j7 < postPanelV2.getEnd() || postPanelV2.getEnd() == -1);
    }
}
