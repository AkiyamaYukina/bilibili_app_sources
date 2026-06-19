package com.bilibili.ship.theseus.united.page.view;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/StatInfoData_JsonDescriptor.class */
public final class StatInfoData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f104031a = {new PojoPropertyDescriptor("value", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("pure_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 5)};

    public StatInfoData_JsonDescriptor() {
        super(StatInfoData.class, f104031a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new StatInfoData(l7 == null ? 0L : l7.longValue(), (String) objArr[1], (String) objArr[2], (String) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        StatInfoData statInfoData = (StatInfoData) obj;
        if (i7 == 0) {
            return Long.valueOf(statInfoData.f104027a);
        }
        if (i7 == 1) {
            return statInfoData.f104028b;
        }
        if (i7 == 2) {
            return statInfoData.f104029c;
        }
        if (i7 != 3) {
            return null;
        }
        return statInfoData.f104030d;
    }
}
