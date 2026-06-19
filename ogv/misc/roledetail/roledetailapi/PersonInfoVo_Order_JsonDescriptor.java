package com.bilibili.ogv.misc.roledetail.roledetailapi;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.misc.roledetail.roledetailapi.PersonInfoVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/roledetailapi/PersonInfoVo_Order_JsonDescriptor.class */
public final class PersonInfoVo_Order_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69274a = {new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("type", (String[]) null, Integer.TYPE, (Class) null, 3)};

    public PersonInfoVo_Order_JsonDescriptor() {
        super(PersonInfoVo.Order.class, f69274a);
    }

    public final Object constructWith(Object[] objArr) {
        PersonInfoVo.Order order = new PersonInfoVo.Order();
        Object obj = objArr[0];
        if (obj != null) {
            order.f69271a = (String) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            order.f69272b = ((Integer) obj2).intValue();
        }
        return order;
    }

    public final Object get(Object obj, int i7) {
        PersonInfoVo.Order order = (PersonInfoVo.Order) obj;
        if (i7 == 0) {
            return order.f69271a;
        }
        if (i7 != 1) {
            return null;
        }
        return Integer.valueOf(order.f69272b);
    }
}
