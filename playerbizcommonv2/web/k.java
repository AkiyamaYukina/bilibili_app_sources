package com.bilibili.playerbizcommonv2.web;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/k.class */
public final class k<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerV3WebGeneralUIComponent.c f82231a;

    public k(PlayerV3WebGeneralUIComponent.c cVar) {
        this.f82231a = cVar;
    }

    public final Object emit(Object obj, Continuation continuation) {
        int iIntValue = ((Number) obj).intValue();
        PlayerV3WebGeneralUIComponent.c cVar = this.f82231a;
        ConstraintLayout constraintLayout = cVar.f82151a;
        int id = cVar.f82152b.getId();
        View viewFindViewById = constraintLayout.findViewById(id);
        ConstraintLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById != null ? viewFindViewById.getLayoutParams() : null;
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
        }
        if (layoutParams != null) {
            int i7 = iIntValue;
            if (iIntValue <= 0) {
                i7 = 0;
            }
            layoutParams.matchConstraintMaxWidth = i7;
            constraintLayout.findViewById(id).setLayoutParams(layoutParams);
        }
        return Unit.INSTANCE;
    }
}
