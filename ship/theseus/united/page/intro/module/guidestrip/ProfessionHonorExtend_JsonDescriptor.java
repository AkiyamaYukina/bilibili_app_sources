package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/ProfessionHonorExtend_JsonDescriptor.class */
public final class ProfessionHonorExtend_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f100097a = {new PojoPropertyDescriptor("count", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("self_grant", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("popup", (String[]) null, ProfessionPopup.class, (Class) null, 5)};

    public ProfessionHonorExtend_JsonDescriptor() {
        super(ProfessionHonorExtend.class, f100097a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Integer num = (Integer) objArr[0];
        int iIntValue = num == null ? 0 : num.intValue();
        Boolean bool = (Boolean) objArr[1];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new ProfessionHonorExtend(iIntValue, zBooleanValue, (ProfessionPopup) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        ProfessionHonorExtend professionHonorExtend = (ProfessionHonorExtend) obj;
        if (i7 == 0) {
            return Integer.valueOf(professionHonorExtend.f100094a);
        }
        if (i7 == 1) {
            return Boolean.valueOf(professionHonorExtend.f100095b);
        }
        if (i7 != 2) {
            return null;
        }
        return professionHonorExtend.f100096c;
    }
}
