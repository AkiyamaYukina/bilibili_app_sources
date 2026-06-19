package com.bilibili.ship.theseus.ogv.intro.headline;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/DeliveryButton_JsonDescriptor.class */
public final class DeliveryButton_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93107a = {new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};

    public DeliveryButton_JsonDescriptor() {
        super(DeliveryButton.class, f93107a);
    }

    public final Object constructWith(Object[] objArr) {
        return new DeliveryButton((String) objArr[0], (String) objArr[1], (String) objArr[2], (Map) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        DeliveryButton deliveryButton = (DeliveryButton) obj;
        if (i7 == 0) {
            return deliveryButton.f93103a;
        }
        if (i7 == 1) {
            return deliveryButton.f93104b;
        }
        if (i7 == 2) {
            return deliveryButton.f93105c;
        }
        if (i7 != 3) {
            return null;
        }
        return deliveryButton.f93106d;
    }
}
