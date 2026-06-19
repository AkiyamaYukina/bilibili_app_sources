package com.bilibili.ship.theseus.ogv.intro.followup;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.OfficialVerifyType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OfficialVerify_JsonDescriptor.class */
public final class OfficialVerify_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93044a = {new PojoPropertyDescriptor("type", (String[]) null, OfficialVerifyType.class, (Class) null, 7), new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 5)};

    public OfficialVerify_JsonDescriptor() {
        super(OfficialVerify.class, f93044a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        return new OfficialVerify((OfficialVerifyType) obj, (String) objArr[1], i7);
    }

    public final Object get(Object obj, int i7) {
        OfficialVerify officialVerify = (OfficialVerify) obj;
        if (i7 == 0) {
            return officialVerify.f93042a;
        }
        if (i7 != 1) {
            return null;
        }
        return officialVerify.f93043b;
    }
}
