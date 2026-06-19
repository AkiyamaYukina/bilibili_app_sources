package com.bilibili.ship.theseus.ogv.chathall;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/g.class */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f91768b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f91767a = i7;
        this.f91768b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91767a) {
            case 0:
                ((h) this.f91768b).f91769a.a((String) obj2);
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    jD.i iVar = (jD.i) this.f91768b;
                    if (iVar.d) {
                        iVar.d = false;
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
