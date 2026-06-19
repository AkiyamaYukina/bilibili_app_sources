package com.bilibili.playset.widget.favorite;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/OGV_JsonDescriptor.class */
public final class OGV_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f85731a = {new PojoPropertyDescriptor("type_name", (String[]) null, String.class, (Class) null, 5)};

    public OGV_JsonDescriptor() {
        super(OGV.class, f85731a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OGV((String) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        OGV ogv = (OGV) obj;
        if (i7 != 0) {
            return null;
        }
        return ogv.getTypeName();
    }
}
