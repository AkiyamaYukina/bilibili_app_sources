package com.bilibili.ship.theseus.cheese.biz.catalog;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogRepository;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogRepository_CoursewareInfo_JsonDescriptor.class */
public final class CheeseCatalogRepository_CoursewareInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f89105a = {new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 3)};

    public CheeseCatalogRepository_CoursewareInfo_JsonDescriptor() {
        super(CheeseCatalogRepository.CoursewareInfo.class, f89105a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        return new CheeseCatalogRepository.CoursewareInfo((String) obj, i7);
    }

    public final Object get(Object obj, int i7) {
        CheeseCatalogRepository.CoursewareInfo coursewareInfo = (CheeseCatalogRepository.CoursewareInfo) obj;
        if (i7 != 0) {
            return null;
        }
        return coursewareInfo.f89103a;
    }
}
