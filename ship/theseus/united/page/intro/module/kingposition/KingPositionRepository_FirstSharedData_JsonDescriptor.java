package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionRepository;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionRepository_FirstSharedData_JsonDescriptor.class */
public final class KingPositionRepository_FirstSharedData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f100350a = {new PojoPropertyDescriptor("is_first", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public KingPositionRepository_FirstSharedData_JsonDescriptor() {
        super(KingPositionRepository.FirstSharedData.class, f100350a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Boolean bool = (Boolean) objArr[0];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new KingPositionRepository.FirstSharedData(zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        KingPositionRepository.FirstSharedData firstSharedData = (KingPositionRepository.FirstSharedData) obj;
        if (i7 != 0) {
            return null;
        }
        return Boolean.valueOf(firstSharedData.a());
    }
}
