package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/f.class */
public final class C5442f implements Function1<LayoutCoordinates, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5439c f68113a;

    public C5442f(InterfaceC5439c interfaceC5439c) {
        this.f68113a = interfaceC5439c;
    }

    public final Object invoke(Object obj) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        InterfaceC5439c interfaceC5439c = this.f68113a;
        if (interfaceC5439c != null) {
            interfaceC5439c.b(LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null));
        }
        return Unit.INSTANCE;
    }
}
