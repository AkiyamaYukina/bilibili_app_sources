package com.bilibili.ogv.secondary.part;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/H.class */
public final /* synthetic */ class H implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72780a;

    public final Object invoke(Object obj) {
        switch (this.f72780a) {
            case 0:
                return ((y) CollectionsKt.first((List) obj)).f72917a.getContentType();
            case 1:
                return ((com.bilibili.ship.theseus.united.page.intro.h) obj).f100064a;
            default:
                ((KH0.b) obj).e(null, false);
                return Unit.INSTANCE;
        }
    }
}
