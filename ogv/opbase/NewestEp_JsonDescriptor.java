package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/NewestEp_JsonDescriptor.class */
public final class NewestEp_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69875a = {new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 3), new PojoPropertyDescriptor("index_show", (String[]) null, String.class, (Class) null, 4)};

    public NewestEp_JsonDescriptor() {
        super(NewestEp.class, f69875a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Long l7 = (Long) obj2;
        return new NewestEp(str, l7 == null ? 0L : l7.longValue(), (String) objArr[2], i8);
    }

    public final Object get(Object obj, int i7) {
        NewestEp newestEp = (NewestEp) obj;
        if (i7 == 0) {
            return newestEp.f69872a;
        }
        if (i7 == 1) {
            return Long.valueOf(newestEp.f69873b);
        }
        if (i7 != 2) {
            return null;
        }
        return newestEp.a();
    }
}
