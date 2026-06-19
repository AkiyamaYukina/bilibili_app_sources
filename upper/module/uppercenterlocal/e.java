package com.bilibili.upper.module.uppercenterlocal;

import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.ui.RouteConstKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/e.class */
public final /* synthetic */ class e implements Function1 {
    public final Object invoke(Object obj) {
        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
        mutableBundleLike.put(RouteConstKt.PROPS_STATUSBAR_MODE, "0");
        mutableBundleLike.put(RouteConstKt.PROPS_STATUSBAR_IMMERSIVE, "1");
        return Unit.INSTANCE;
    }
}
