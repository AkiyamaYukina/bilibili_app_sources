package com.bilibili.ship.theseus.ogv.tabpage;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/TabActivityExtensionField_JsonDescriptor.class */
public final class TabActivityExtensionField_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94559a;

    static {
        Class cls = Long.TYPE;
        f94559a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("biz_key", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("room_num", (String[]) null, cls, (Class) null, 5)};
    }

    public TabActivityExtensionField_JsonDescriptor() {
        super(TabActivityExtensionField.class, f94559a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        long jLongValue = 0;
        long jLongValue2 = l7 == null ? 0L : l7.longValue();
        Long l8 = (Long) objArr[1];
        if (l8 != null) {
            jLongValue = l8.longValue();
        }
        return new TabActivityExtensionField(jLongValue2, jLongValue);
    }

    public final Object get(Object obj, int i7) {
        long jA;
        TabActivityExtensionField tabActivityExtensionField = (TabActivityExtensionField) obj;
        if (i7 == 0) {
            jA = tabActivityExtensionField.a();
        } else {
            if (i7 != 1) {
                return null;
            }
            jA = tabActivityExtensionField.b();
        }
        return Long.valueOf(jA);
    }
}
