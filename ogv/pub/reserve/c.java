package com.bilibili.ogv.pub.reserve;

import android.os.MessageQueue;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/c.class */
public final /* synthetic */ class c implements MessageQueue.IdleHandler {
    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        VipReserveCacheManager.a();
        return false;
    }
}
