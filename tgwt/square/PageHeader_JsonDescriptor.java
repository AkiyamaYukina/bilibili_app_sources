package com.bilibili.tgwt.square;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/PageHeader_JsonDescriptor.class */
public final class PageHeader_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f112074a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("sub_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5)};

    public PageHeader_JsonDescriptor() {
        super(PageHeader.class, f112074a);
    }

    public final Object constructWith(Object[] objArr) {
        return new PageHeader((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        PageHeader pageHeader = (PageHeader) obj;
        if (i7 == 0) {
            return pageHeader.f112070a;
        }
        if (i7 == 1) {
            return pageHeader.a();
        }
        if (i7 == 2) {
            return pageHeader.f112072c;
        }
        if (i7 != 3) {
            return null;
        }
        return pageHeader.f112073d;
    }
}
