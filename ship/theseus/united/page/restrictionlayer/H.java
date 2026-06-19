package com.bilibili.ship.theseus.united.page.restrictionlayer;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/H.class */
public final class H implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f102559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RestrictionLayerVo f102560b;

    public H(RestrictionLayerVo restrictionLayerVo, G g7) {
        this.f102559a = g7;
        this.f102560b = restrictionLayerVo;
    }

    public final Object invoke() {
        this.f102559a.b(this.f102560b);
        return Unit.INSTANCE;
    }
}
