package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/DeliveryOperationAction_JsonDescriptor.class */
public final class DeliveryOperationAction_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102524a = {new PojoPropertyDescriptor("winId", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("deliver_code", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("exposing", (String[]) null, Boolean.TYPE, (Class) null, 1)};

    public DeliveryOperationAction_JsonDescriptor() {
        super(DeliveryOperationAction.class, f102524a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Boolean bool = (Boolean) objArr[2];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new DeliveryOperationAction(str, str2, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        DeliveryOperationAction deliveryOperationAction = (DeliveryOperationAction) obj;
        if (i7 == 0) {
            return deliveryOperationAction.f102521a;
        }
        if (i7 == 1) {
            return deliveryOperationAction.f102522b;
        }
        if (i7 != 2) {
            return null;
        }
        return Boolean.valueOf(deliveryOperationAction.f102523c);
    }
}
