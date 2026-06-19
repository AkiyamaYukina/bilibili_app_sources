package com.bilibili.ogv.kmm.operation.vippreview;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kntr.base.router.Router;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/h.class */
public final class h implements Function2<LazyListScope, Dp, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i> f68939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Router f68940b;

    public h(List<i> list, Router router) {
        this.f68939a = list;
        this.f68940b = router;
    }

    public final Object invoke(Object obj, Object obj2) {
        float fM3894unboximpl = ((Dp) obj2).m3894unboximpl();
        List<i> list = this.f68939a;
        ((LazyListScope) obj).items(((ArrayList) list).size(), null, new f(list), ComposableLambdaKt.composableLambdaInstance(802480018, true, new g(list, fM3894unboximpl, this.f68940b)));
        return Unit.INSTANCE;
    }
}
