package com.bilibili.mini.player.biz;

import tv.danmaku.biliplayerv2.collection.Collections;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/e.class */
public final /* synthetic */ class e implements Collections.IteratorAction {
    public final void run(Object obj) {
        int i7 = ScreenStatusReceiver.f66033b;
        ((ScreenStatusListener) obj).onScreenStatusChanged(true);
    }
}
