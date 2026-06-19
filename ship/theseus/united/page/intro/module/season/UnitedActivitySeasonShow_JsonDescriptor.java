package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedActivitySeasonShow_JsonDescriptor.class */
public final class UnitedActivitySeasonShow_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f101508a = {new PojoPropertyDescriptor("button_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("join_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("rule_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("checkin_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("checkin_prompt", (String[]) null, String.class, (Class) null, 5)};

    public UnitedActivitySeasonShow_JsonDescriptor() {
        super(UnitedActivitySeasonShow.class, f101508a);
    }

    public final Object constructWith(Object[] objArr) {
        return new UnitedActivitySeasonShow((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        UnitedActivitySeasonShow unitedActivitySeasonShow = (UnitedActivitySeasonShow) obj;
        if (i7 == 0) {
            return unitedActivitySeasonShow.a();
        }
        if (i7 == 1) {
            return unitedActivitySeasonShow.d();
        }
        if (i7 == 2) {
            return unitedActivitySeasonShow.e();
        }
        if (i7 == 3) {
            return unitedActivitySeasonShow.c();
        }
        if (i7 != 4) {
            return null;
        }
        return unitedActivitySeasonShow.b();
    }
}
