package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.upper.api.bean.uppercenter.InspirationRecord;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/P.class */
public final /* synthetic */ class P implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101038a;

    public /* synthetic */ P(int i7) {
        this.f101038a = i7;
    }

    public final Object invoke(Object obj) {
        switch (this.f101038a) {
            case 0:
                return Unit.INSTANCE;
            default:
                return ((InspirationRecord) obj).getId();
        }
    }
}
