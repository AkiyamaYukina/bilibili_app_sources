package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/ProfessionPopup_JsonDescriptor.class */
public final class ProfessionPopup_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f100100a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("subtitle", (String[]) null, String.class, (Class) null, 5)};

    public ProfessionPopup_JsonDescriptor() {
        super(ProfessionPopup.class, f100100a);
    }

    public final Object constructWith(Object[] objArr) {
        return new ProfessionPopup((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        ProfessionPopup professionPopup = (ProfessionPopup) obj;
        if (i7 == 0) {
            return professionPopup.f100098a;
        }
        if (i7 != 1) {
            return null;
        }
        return professionPopup.f100099b;
    }
}
