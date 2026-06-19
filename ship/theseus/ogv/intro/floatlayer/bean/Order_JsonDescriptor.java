package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Order_JsonDescriptor.class */
public final class Order_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92867a = {new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("type", (String[]) null, Integer.TYPE, (Class) null, 3)};

    public Order_JsonDescriptor() {
        super(Order.class, f92867a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        String str = (String) objArr[0];
        Object obj = objArr[1];
        int i7 = obj == null ? 2 : 0;
        Integer num = (Integer) obj;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new Order(str, iIntValue, i7);
    }

    public final Object get(Object obj, int i7) {
        Order order = (Order) obj;
        if (i7 == 0) {
            return order.f92865a;
        }
        if (i7 != 1) {
            return null;
        }
        return Integer.valueOf(order.f92866b);
    }
}
