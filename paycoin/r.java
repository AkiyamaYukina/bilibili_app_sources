package com.bilibili.paycoin;

import com.bilibili.lib.accountinfo.BiliAccountInfo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/r.class */
public final /* synthetic */ class r implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        return BiliAccountInfo.Companion.get().requestForMyAccountInfo();
    }
}
