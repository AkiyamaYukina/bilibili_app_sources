package com.bilibili.playerbizcommonv2.danmaku.widget;

import com.bilibili.lib.accountinfo.BiliAccountInfo;
import java.util.concurrent.Callable;
import kotlin.Lazy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/p.class */
public final /* synthetic */ class p implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Lazy<String> lazy = q.f81673x;
        BiliAccountInfo.Companion companion = BiliAccountInfo.Companion;
        if (companion.get().getAccountInfoFromCache() != null) {
            return null;
        }
        companion.get().requestForMyAccountInfo();
        return null;
    }
}
