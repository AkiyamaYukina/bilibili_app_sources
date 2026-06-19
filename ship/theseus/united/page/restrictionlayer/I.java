package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/I.class */
public final /* synthetic */ class I implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RestrictionLayerVo f102561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f102562b;

    public /* synthetic */ I(RestrictionLayerVo restrictionLayerVo, G g7) {
        this.f102561a = restrictionLayerVo;
        this.f102562b = g7;
    }

    public final Object invoke() {
        return RestrictionLayerService$showRestrictionLayer$3.AnonymousClass6.invokeSuspend$lambda$0(this.f102561a, this.f102562b);
    }
}
