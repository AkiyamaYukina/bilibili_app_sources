package com.bilibili.ship.theseus.ugc.endpage.qoe;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo_JsonDescriptor.class */
public final class UgcDmQoeInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f96690a = {new PojoPropertyDescriptor("show", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("info", (String[]) null, UgcDmQoeInfo.Info.class, (Class) null, 4)};

    public UgcDmQoeInfo_JsonDescriptor() {
        super(UgcDmQoeInfo.class, f96690a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new UgcDmQoeInfo(zBooleanValue, (UgcDmQoeInfo.Info) objArr[1], i7);
    }

    public final Object get(Object obj, int i7) {
        UgcDmQoeInfo ugcDmQoeInfo = (UgcDmQoeInfo) obj;
        if (i7 == 0) {
            return Boolean.valueOf(ugcDmQoeInfo.f96666a);
        }
        if (i7 != 1) {
            return null;
        }
        return ugcDmQoeInfo.f96667b;
    }
}
