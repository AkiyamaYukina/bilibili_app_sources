package com.bilibili.playerbizcommonv2.web;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/p.class */
public final class p<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerV3WebGeneralUIComponent.c f82238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlayerV3WebGeneralUIComponent f82239b;

    public p(PlayerV3WebGeneralUIComponent.c cVar, PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent) {
        this.f82238a = cVar;
        this.f82239b = playerV3WebGeneralUIComponent;
    }

    public final Object emit(Object obj, Continuation continuation) {
        Unit unit;
        int iCoerceAtLeast;
        int iIntValue = ((Number) obj).intValue();
        PlayerV3WebGeneralUIComponent.c cVar = this.f82238a;
        FragmentContainerView fragmentContainerView = cVar.f82160k;
        ViewGroup.LayoutParams layoutParams = fragmentContainerView.getLayoutParams();
        if (layoutParams == null) {
            unit = Unit.INSTANCE;
        } else {
            if (iIntValue > 0) {
                PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.f82239b;
                int measuredHeight = playerV3WebGeneralUIComponent.f82097e.f82264v;
                if (measuredHeight <= 0) {
                    measuredHeight = cVar.f82151a.getMeasuredHeight() - cVar.f82152b.getMeasuredHeight();
                }
                int measuredHeight2 = playerV3WebGeneralUIComponent.f82097e.f82250g ? cVar.f82157g.getMeasuredHeight() : 0;
                View view = cVar.f82155e;
                if (view.getMeasuredHeight() > 0) {
                    iCoerceAtLeast = view.getMeasuredHeight();
                } else {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    iCoerceAtLeast = RangesKt.coerceAtLeast(layoutParams2 != null ? layoutParams2.height : 0, 0);
                }
                layoutParams.height = RangesKt.coerceAtLeast(((measuredHeight - measuredHeight2) - iCoerceAtLeast) - iIntValue, 0);
            } else {
                layoutParams.height = 0;
            }
            fragmentContainerView.setLayoutParams(layoutParams);
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
