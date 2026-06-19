package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ChargingPlusOperationAction;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/ChargingPlusOperationAction_JsonDescriptor.class */
public final class ChargingPlusOperationAction_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102519a = {new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("showRes", (String[]) null, String.class, (Class) null, 3), new PojoPropertyDescriptor("type", (String[]) null, ChargingPlusOperationAction.TYPE.class, (Class) null, 3)};

    public ChargingPlusOperationAction_JsonDescriptor() {
        super(ChargingPlusOperationAction.class, f102519a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        Object obj = objArr[1];
        if (obj == null) {
            i7 = 2;
        }
        String str2 = (String) obj;
        Object obj2 = objArr[2];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 4;
        }
        return new ChargingPlusOperationAction(str, str2, (ChargingPlusOperationAction.TYPE) obj2, i8);
    }

    public final Object get(Object obj, int i7) {
        ChargingPlusOperationAction chargingPlusOperationAction = (ChargingPlusOperationAction) obj;
        if (i7 == 0) {
            return chargingPlusOperationAction.f102516a;
        }
        if (i7 == 1) {
            return chargingPlusOperationAction.f102517b;
        }
        if (i7 != 2) {
            return null;
        }
        return chargingPlusOperationAction.f102518c;
    }
}
