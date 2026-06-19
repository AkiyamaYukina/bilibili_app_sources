package com.bilibili.ship.theseus.detail.route.ugc;

import com.bilibili.lib.blrouter.MutableBundleLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/route/ugc/f.class */
public final /* synthetic */ class f implements Function1 {
    public final Object invoke(Object obj) {
        ((MutableBundleLike) obj).put("deeplink_transform_check", "1");
        return Unit.INSTANCE;
    }
}
