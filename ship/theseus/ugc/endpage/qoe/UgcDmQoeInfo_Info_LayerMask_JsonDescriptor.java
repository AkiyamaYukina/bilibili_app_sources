package com.bilibili.ship.theseus.ugc.endpage.qoe;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo_Info_LayerMask_JsonDescriptor.class */
public final class UgcDmQoeInfo_Info_LayerMask_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f96687a = {new PojoPropertyDescriptor("close_count_down_second", (String[]) null, Long.TYPE, (Class) null, 7)};

    public UgcDmQoeInfo_Info_LayerMask_JsonDescriptor() {
        super(UgcDmQoeInfo.Info.LayerMask.class, f96687a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        Long l7 = (Long) obj;
        return new UgcDmQoeInfo.Info.LayerMask(l7 == null ? 0L : l7.longValue(), i7);
    }

    public final Object get(Object obj, int i7) {
        UgcDmQoeInfo.Info.LayerMask layerMask = (UgcDmQoeInfo.Info.LayerMask) obj;
        if (i7 != 0) {
            return null;
        }
        return Long.valueOf(layerMask.a());
    }
}
