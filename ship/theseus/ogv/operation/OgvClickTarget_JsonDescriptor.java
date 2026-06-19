package com.bilibili.ship.theseus.ogv.operation;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OgvClickTarget_JsonDescriptor.class */
public final class OgvClickTarget_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94060a = {new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("action_type", (String[]) null, OgvActionType.class, (Class) null, 6), new PojoPropertyDescriptor("action_arouse_type", (String[]) null, ActionArouseType.class, (Class) null, 7), new PojoPropertyDescriptor("action_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7), new PojoPropertyDescriptor("order_report_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7)};

    public OgvClickTarget_JsonDescriptor() {
        super(OgvClickTarget.class, f94060a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        OgvActionType ogvActionType = (OgvActionType) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        ActionArouseType actionArouseType = (ActionArouseType) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Map map = (Map) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        return new OgvClickTarget(str, ogvActionType, actionArouseType, map, (Map) obj5, i11);
    }

    public final Object get(Object obj, int i7) {
        OgvClickTarget ogvClickTarget = (OgvClickTarget) obj;
        if (i7 == 0) {
            return ogvClickTarget.f94054a;
        }
        if (i7 == 1) {
            return ogvClickTarget.f94055b;
        }
        if (i7 == 2) {
            return ogvClickTarget.f94056c;
        }
        if (i7 == 3) {
            return ogvClickTarget.f94057d;
        }
        if (i7 != 4) {
            return null;
        }
        return ogvClickTarget.f94058e;
    }
}
