package com.bilibili.ship.theseus.ogv.dubbing;

import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.I;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/p.class */
public final class p implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f91885a;

    public p(q qVar) {
        this.f91885a = qVar;
    }

    public final void onWidgetDismiss(FunctionWidgetToken functionWidgetToken) {
        if (Intrinsics.areEqual(functionWidgetToken.getClazz(), h.class)) {
            q qVar = this.f91885a;
            qVar.c(false);
            qVar.f91902r = null;
            qVar.f91905u = false;
            qVar.f91890e.removeOnWidgetStateChangeListener(this);
        }
    }

    public final void onWidgetShow(FunctionWidgetToken functionWidgetToken) {
        if (Intrinsics.areEqual(functionWidgetToken.getClazz(), h.class)) {
            q qVar = this.f91885a;
            qVar.c(true);
            qVar.f91905u = true;
        }
    }
}
