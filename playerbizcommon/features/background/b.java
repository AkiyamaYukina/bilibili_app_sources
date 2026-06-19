package com.bilibili.playerbizcommon.features.background;

import tv.danmaku.biliplayerv2.collection.Collections;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/b.class */
public final /* synthetic */ class b implements Collections.IteratorAction {
    public static StringBuilder a(long j7, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j7);
        return sb;
    }

    public void run(Object obj) {
        ((g) obj).b();
    }
}
