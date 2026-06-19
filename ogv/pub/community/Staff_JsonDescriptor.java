package com.bilibili.ogv.pub.community;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Staff_JsonDescriptor.class */
public final class Staff_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71534a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("info", (String[]) null, String.class, (Class) null, 5)};

    public Staff_JsonDescriptor() {
        super(Staff.class, f71534a);
    }

    public final Object constructWith(Object[] objArr) {
        return new Staff((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        Staff staff = (Staff) obj;
        if (i7 == 0) {
            return staff.f71532a;
        }
        if (i7 != 1) {
            return null;
        }
        return staff.f71533b;
    }
}
