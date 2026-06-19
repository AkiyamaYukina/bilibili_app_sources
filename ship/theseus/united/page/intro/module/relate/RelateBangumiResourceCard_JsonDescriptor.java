package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/RelateBangumiResourceCard_JsonDescriptor.class */
public final class RelateBangumiResourceCard_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f101046a = {new PojoPropertyDescriptor("label", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("rcmd_reason", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("re_value", (String[]) null, String.class, (Class) null, 5)};

    public RelateBangumiResourceCard_JsonDescriptor() {
        super(RelateBangumiResourceCard.class, f101046a);
    }

    public final Object constructWith(Object[] objArr) {
        return new RelateBangumiResourceCard((String) objArr[0], (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        RelateBangumiResourceCard relateBangumiResourceCard = (RelateBangumiResourceCard) obj;
        if (i7 == 0) {
            return relateBangumiResourceCard.f101043a;
        }
        if (i7 == 1) {
            return relateBangumiResourceCard.b();
        }
        if (i7 != 2) {
            return null;
        }
        return relateBangumiResourceCard.a();
    }
}
