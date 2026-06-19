package com.bilibili.playset.api;

import com.bilibili.lib.riskcontrol.BiliRiskControlCallback;
import com.bilibili.lib.riskcontrol.BiliRiskException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/q.class */
public final class q implements BiliRiskControlCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2<String, BiliRiskException, Unit> f84101a;

    /* JADX WARN: Multi-variable type inference failed */
    public q(Function2<? super String, ? super BiliRiskException, Unit> function2) {
        this.f84101a = function2;
    }

    @Override // com.bilibili.lib.riskcontrol.BiliRiskControlCallback
    public final void onRiskComplete(String str, BiliRiskException biliRiskException) {
        this.f84101a.invoke(str, biliRiskException);
    }
}
