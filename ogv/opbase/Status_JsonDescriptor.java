package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/Status_JsonDescriptor.class */
public final class Status_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69945a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("follow", (String[]) null, Boolean.TYPE, (Class) null, 7);
        Class cls = Integer.TYPE;
        f69945a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("follow_status", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor(IVideoLikeRouteService.ACTION_LIKE, (String[]) null, cls, (Class) null, 7)};
    }

    public Status_JsonDescriptor() {
        super(Status.class, f69945a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Integer num = (Integer) obj2;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Integer num2 = (Integer) obj3;
        return new Status(iIntValue, num2 == null ? 0 : num2.intValue(), i9, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        Status status = (Status) obj;
        if (i7 == 0) {
            return Boolean.valueOf(status.c());
        }
        if (i7 == 1) {
            return Integer.valueOf(status.b());
        }
        if (i7 != 2) {
            return null;
        }
        return Integer.valueOf(status.a());
    }
}
