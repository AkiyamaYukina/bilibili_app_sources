package com.bilibili.ogvvega.tunnel;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/BackoffConfig_JsonDescriptor.class */
public final class BackoffConfig_JsonDescriptor extends PojoClassDescriptor {
    private static final PojoPropertyDescriptor[] properties = createProperties();

    public BackoffConfig_JsonDescriptor() {
        super(BackoffConfig.class, properties);
    }

    private static PojoPropertyDescriptor[] createProperties() {
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("maxTimes", (String[]) null, cls, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("initialDelay", (String[]) null, cls, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("maxDelay", (String[]) null, cls, (Class) null, 3);
        Class cls2 = Float.TYPE;
        return new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, new PojoPropertyDescriptor("factor", (String[]) null, cls2, (Class) null, 3), new PojoPropertyDescriptor("jitter", (String[]) null, cls2, (Class) null, 3)};
    }

    public Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Integer num = (Integer) obj;
        int iIntValue2 = num == null ? 0 : num.intValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Integer num2 = (Integer) obj2;
        int iIntValue3 = num2 == null ? 0 : num2.intValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Integer num3 = (Integer) obj3;
        if (num3 != null) {
            iIntValue = num3.intValue();
        }
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Float f7 = (Float) obj4;
        float fFloatValue = 0.0f;
        float fFloatValue2 = f7 == null ? 0.0f : f7.floatValue();
        Object obj5 = objArr[4];
        if (obj5 == null) {
            i10 |= 16;
        }
        Float f8 = (Float) obj5;
        if (f8 != null) {
            fFloatValue = f8.floatValue();
        }
        return new BackoffConfig(iIntValue2, iIntValue3, iIntValue, fFloatValue2, fFloatValue, i10, null);
    }

    public Object get(Object obj, int i7) {
        BackoffConfig backoffConfig = (BackoffConfig) obj;
        if (i7 == 0) {
            return Integer.valueOf(backoffConfig.getMaxTimes());
        }
        if (i7 == 1) {
            return Integer.valueOf(backoffConfig.getInitialDelay());
        }
        if (i7 == 2) {
            return Integer.valueOf(backoffConfig.getMaxDelay());
        }
        if (i7 == 3) {
            return Float.valueOf(backoffConfig.getFactor());
        }
        if (i7 != 4) {
            return null;
        }
        return Float.valueOf(backoffConfig.getJitter());
    }
}
