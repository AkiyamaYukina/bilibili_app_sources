package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/PageHeader_JsonDescriptor.class */
public final class PageHeader_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69880a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("sub_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5)};

    public PageHeader_JsonDescriptor() {
        super(PageHeader.class, f69880a);
    }

    public final Object constructWith(Object[] objArr) {
        return new PageHeader((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        PageHeader pageHeader = (PageHeader) obj;
        if (i7 == 0) {
            return pageHeader.f69876a;
        }
        if (i7 == 1) {
            return pageHeader.a();
        }
        if (i7 == 2) {
            return pageHeader.f69878c;
        }
        if (i7 != 3) {
            return null;
        }
        return pageHeader.f69879d;
    }
}
