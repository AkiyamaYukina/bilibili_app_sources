package com.bilibili.playerbizcommonv2.web;

import android.view.ViewGroup;
import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/o.class */
public final class o<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerV3WebGeneralUIComponent.c f82236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlayerV3WebGeneralUIComponent f82237b;

    public o(PlayerV3WebGeneralUIComponent.c cVar, PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent) {
        this.f82236a = cVar;
        this.f82237b = playerV3WebGeneralUIComponent;
    }

    public final Object emit(Object obj, Continuation continuation) {
        int iIntValue = ((Number) obj).intValue();
        PlayerV3WebGeneralUIComponent.c cVar = this.f82236a;
        ViewGroup.LayoutParams layoutParams = cVar.f82152b.getLayoutParams();
        layoutParams.height = RangesKt.coerceAtLeast(iIntValue, 0);
        cVar.f82152b.setLayoutParams(layoutParams);
        this.f82237b.g(cVar);
        return Unit.INSTANCE;
    }
}
