package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/ChargingExtVo_JsonDescriptor.class */
public final class ChargingExtVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102515a = {new PojoPropertyDescriptor("hide_bg_img", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public ChargingExtVo_JsonDescriptor() {
        super(ChargingExtVo.class, f102515a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Boolean bool = (Boolean) objArr[0];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new ChargingExtVo(zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        ChargingExtVo chargingExtVo = (ChargingExtVo) obj;
        if (i7 != 0) {
            return null;
        }
        return Boolean.valueOf(chargingExtVo.f102514a);
    }
}
