package com.bilibili.playerbizcommonv2.widget.coin;

import com.bilibili.lib.accountinfo.BiliAccountInfo;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/coin/d.class */
public final class d implements Callable<Unit> {
    @Override // java.util.concurrent.Callable
    public final Unit call() {
        BiliAccountInfo.Companion.get().requestForMyAccountInfo();
        return Unit.INSTANCE;
    }
}
