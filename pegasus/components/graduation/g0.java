package com.bilibili.pegasus.components.graduation;

import androidx.compose.foundation.lazy.grid.C3456s;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.ui.RouteConstKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import z61.l;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/g0.class */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76124a;

    public final Object invoke(Object obj) {
        switch (this.f76124a) {
            case 0:
                ((GraphicsLayerScope) obj).mo2736setCompositingStrategyaDBOjCE(1);
                return Unit.INSTANCE;
            case 1:
                return C3456s.a((LazyGridItemSpanScope) obj);
            case 2:
                ((MutableBundleLike) obj).put(RouteConstKt.PROPS_PAGE_FROM, "mweb");
                return Unit.INSTANCE;
            case 3:
                return ((z01.s) obj).k;
            default:
                return Boolean.valueOf(((l.f) obj).b.a() > 0.0d);
        }
    }
}
