package com.bilibili.playerbizcommonv2.web;

import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import com.bilibili.playerbizcommonv2.web.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/m.class */
public final class m<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerV3WebGeneralUIComponent.c f82234a;

    public m(PlayerV3WebGeneralUIComponent.c cVar) {
        this.f82234a = cVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
        w wVar = (w) obj;
        boolean zAreEqual = Intrinsics.areEqual(wVar, w.b.f82267a);
        PlayerV3WebGeneralUIComponent.c cVar = this.f82234a;
        if (zAreEqual) {
            cVar.f82160k.setVisibility(8);
            cVar.f82161l.setVisibility(0);
            cVar.f82162m.setVisibility(8);
        } else if (Intrinsics.areEqual(wVar, w.c.f82268a)) {
            cVar.f82160k.setVisibility(0);
            cVar.f82161l.setVisibility(8);
            cVar.f82162m.setVisibility(8);
        } else {
            if (!Intrinsics.areEqual(wVar, w.a.f82266a)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.f82160k.setVisibility(8);
            cVar.f82161l.setVisibility(8);
            cVar.f82162m.setVisibility(0);
        }
        return Unit.INSTANCE;
    }
}
