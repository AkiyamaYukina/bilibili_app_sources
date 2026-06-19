package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.ship.theseus.cheese.biz.intro.primary.RelatedCoursesDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/I.class */
public final class I implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f89635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelatedCoursesDetails.Item f89636b;

    public I(L l7, RelatedCoursesDetails.Item item) {
        this.f89635a = l7;
        this.f89636b = item;
    }

    public final Object invoke() {
        C6102x c6102x = this.f89635a.f89643n;
        RelatedCoursesDetails.Item item = this.f89636b;
        c6102x.invoke(Long.valueOf(item.f89668f), item.f89672k);
        return Unit.INSTANCE;
    }
}
