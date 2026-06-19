package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.ship.theseus.cheese.biz.intro.primary.RelatedCoursesDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/H.class */
public final class H implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f89633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelatedCoursesDetails.Item f89634b;

    public H(L l7, RelatedCoursesDetails.Item item) {
        this.f89633a = l7;
        this.f89634b = item;
    }

    public final Object invoke() {
        this.f89633a.f89642m.invoke(this.f89634b.f89672k);
        return Unit.INSTANCE;
    }
}
