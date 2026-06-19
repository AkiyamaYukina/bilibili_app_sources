package com.bilibili.studio.comm.manager;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/l.class */
public final /* synthetic */ class l implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() throws InterruptedException {
        Thread.sleep(500L);
        return Unit.INSTANCE;
    }
}
