package com.bilibili.playerbizcommonv2.web;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/n.class */
public final class n<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerV3WebGeneralUIComponent.c f82235a;

    public n(PlayerV3WebGeneralUIComponent.c cVar) {
        this.f82235a = cVar;
    }

    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        PlayerV3WebGeneralUIComponent.c cVar = this.f82235a;
        ConstraintLayout constraintLayout = cVar.f82151a;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.clear(cVar.f82153c.getId(), 3);
        if (zBooleanValue) {
            constraintSet.connect(cVar.f82153c.getId(), 3, 0, 3);
        } else {
            constraintSet.connect(cVar.f82153c.getId(), 3, cVar.f82152b.getId(), 4);
        }
        constraintSet.applyTo(constraintLayout);
        return Unit.INSTANCE;
    }
}
