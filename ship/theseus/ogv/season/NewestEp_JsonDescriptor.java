package com.bilibili.ship.theseus.ogv.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/NewestEp_JsonDescriptor.class */
public final class NewestEp_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94448a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 1), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("more", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 1)};

    public NewestEp_JsonDescriptor() {
        super(NewestEp.class, f94448a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new NewestEp(l7 == null ? 0L : l7.longValue(), (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        NewestEp newestEp = (NewestEp) obj;
        if (i7 == 0) {
            return Long.valueOf(newestEp.f94443a);
        }
        if (i7 == 1) {
            return newestEp.f94444b;
        }
        if (i7 == 2) {
            return newestEp.f94445c;
        }
        if (i7 == 3) {
            return newestEp.f94446d;
        }
        if (i7 != 4) {
            return null;
        }
        return newestEp.f94447e;
    }
}
