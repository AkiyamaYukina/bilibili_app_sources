package com.bilibili.ogvvega.tunnel;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/HeartbeatConfig_JsonDescriptor.class */
public final class HeartbeatConfig_JsonDescriptor extends PojoClassDescriptor {
    private static final PojoPropertyDescriptor[] properties = createProperties();

    public HeartbeatConfig_JsonDescriptor() {
        super(HeartbeatConfig.class, properties);
    }

    private static PojoPropertyDescriptor[] createProperties() {
        Class cls = Long.TYPE;
        return new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("interval", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("timeout", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("maxRetryTimes", (String[]) null, Integer.TYPE, (Class) null, 3)};
    }

    public Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Long l7 = (Long) obj;
        long jLongValue = 0;
        long jLongValue2 = l7 == null ? 0L : l7.longValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Long l8 = (Long) obj2;
        if (l8 != null) {
            jLongValue = l8.longValue();
        }
        Object obj3 = objArr[2];
        if (obj3 == null) {
            i8 |= 4;
        }
        Integer num = (Integer) obj3;
        return new HeartbeatConfig(jLongValue2, jLongValue, num == null ? 0 : num.intValue(), i8, null);
    }

    public Object get(Object obj, int i7) {
        HeartbeatConfig heartbeatConfig = (HeartbeatConfig) obj;
        if (i7 == 0) {
            return Long.valueOf(heartbeatConfig.getInterval());
        }
        if (i7 == 1) {
            return Long.valueOf(heartbeatConfig.getTimeout());
        }
        if (i7 != 2) {
            return null;
        }
        return Integer.valueOf(heartbeatConfig.getMaxRetryTimes());
    }
}
