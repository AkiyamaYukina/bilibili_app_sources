package com.bilibili.ship.theseus.ogv.intro;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/S.class */
public final /* synthetic */ class S implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnitedActivityComposeContainerService f92274a;

    public final Object invoke(Object obj, Object obj2) {
        com.bilibili.ship.theseus.ogv.operation.d dVar = (com.bilibili.ship.theseus.ogv.operation.d) obj;
        Boolean bool = (Boolean) obj2;
        bool.getClass();
        com.bilibili.app.comment3.ui.widget.p pVar = this.f92274a.f92285g;
        if (pVar != null) {
            pVar.invoke(dVar, bool);
        }
        return Unit.INSTANCE;
    }
}
