package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import com.bilibili.gripper.api.ad.biz.videodetail.merchandise.IAdMerchandiseViewEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandiseComponent$createViewEntry$adView$2$4.class */
final /* synthetic */ class MerchandiseComponent$createViewEntry$adView$2$4 extends FunctionReferenceImpl implements Function0<Unit> {
    public MerchandiseComponent$createViewEntry$adView$2$4(Object obj) {
        super(0, obj, IAdMerchandiseViewEntry.class, "onStrictShow", "onStrictShow()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m9486invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m9486invoke() {
        ((IAdMerchandiseViewEntry) ((CallableReference) this).receiver).onStrictShow();
    }
}
