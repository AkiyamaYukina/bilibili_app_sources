package com.bilibili.tgwt.chatroom;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/MsgRetrieveConfig_JsonDescriptor.class */
public final class MsgRetrieveConfig_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110964a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("enabled", (String[]) null, Boolean.TYPE, (Class) null, 3);
        Class cls = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("delay", (String[]) null, cls, (Class) null, 3);
        Class cls2 = Integer.TYPE;
        f110964a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, new PojoPropertyDescriptor("maxRetryTimes", (String[]) null, cls2, (Class) null, 3), new PojoPropertyDescriptor("retryDelay", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("pageSize", (String[]) null, cls2, (Class) null, 3), new PojoPropertyDescriptor("interval", (String[]) null, cls, (Class) null, 3)};
    }

    public MsgRetrieveConfig_JsonDescriptor() {
        super(MsgRetrieveConfig.class, f110964a);
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
        Long l7 = (Long) obj2;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Integer num = (Integer) obj3;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Long l8 = (Long) obj4;
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Integer num2 = (Integer) obj5;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Object obj6 = objArr[5];
        if (obj6 == null) {
            i11 |= 32;
        }
        Long l9 = (Long) obj6;
        return new MsgRetrieveConfig(zBooleanValue, jLongValue, iIntValue, jLongValue2, iIntValue2, l9 == null ? 0L : l9.longValue(), i11);
    }

    public final Object get(Object obj, int i7) {
        MsgRetrieveConfig msgRetrieveConfig = (MsgRetrieveConfig) obj;
        if (i7 == 0) {
            return Boolean.valueOf(msgRetrieveConfig.f110958a);
        }
        if (i7 == 1) {
            return Long.valueOf(msgRetrieveConfig.f110959b);
        }
        if (i7 == 2) {
            return Integer.valueOf(msgRetrieveConfig.f110960c);
        }
        if (i7 == 3) {
            return Long.valueOf(msgRetrieveConfig.f110961d);
        }
        if (i7 == 4) {
            return Integer.valueOf(msgRetrieveConfig.f110962e);
        }
        if (i7 != 5) {
            return null;
        }
        return Long.valueOf(msgRetrieveConfig.f110963f);
    }
}
