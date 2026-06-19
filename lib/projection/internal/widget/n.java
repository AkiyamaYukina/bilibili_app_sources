package com.bilibili.lib.projection.internal.widget;

import Ke0.InterfaceC2437a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import le0.InterfaceC7845m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/n.class */
public final class n implements InterfaceC2437a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f64103a;

    public n(o oVar) {
        this.f64103a = oVar;
    }

    @Override // Ke0.InterfaceC2437a
    public final void a() {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        com.bilibili.lib.projection.internal.device.a aVarS2;
        InterfaceC7845m client;
        o oVar = this.f64103a;
        InterfaceC7845m interfaceC7845m = oVar.f64111i;
        if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
            return;
        }
        InterfaceC7845m interfaceC7845m2 = oVar.f64111i;
        IProjectionItem iProjectionItemN = (interfaceC7845m2 == null || (aVarS2 = interfaceC7845m2.s()) == null || (client = aVarS2.getClient()) == null) ? null : client.n(true);
        StandardProjectionItem standardProjectionItem = iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null;
        InterfaceC7845m interfaceC7845m3 = oVar.f64111i;
        reporter.j(standardProjectionItem, (interfaceC7845m3 == null || (aVarS = interfaceC7845m3.s()) == null) ? null : aVarS.getDevice(), 1, "0", "0");
    }
}
