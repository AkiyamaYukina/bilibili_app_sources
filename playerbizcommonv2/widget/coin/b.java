package com.bilibili.playerbizcommonv2.widget.coin;

import com.bilibili.lib.accountinfo.BiliAccountInfo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/coin/b.class */
public final class b<V> implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b<V> f82439a = (b<V>) new Object();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        BiliAccountInfo.Companion.get().requestForMyAccountInfo();
        return null;
    }
}
