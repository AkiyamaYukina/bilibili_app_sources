package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/Tag_JsonDescriptor.class */
public final class Tag_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69948a = {new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("type", (String[]) null, Integer.class, (Class) null, 0)};

    public Tag_JsonDescriptor() {
        super(Tag.class, f69948a);
    }

    public final Object constructWith(Object[] objArr) {
        return new Tag((String) objArr[0], (Integer) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        Tag tag = (Tag) obj;
        if (i7 == 0) {
            return tag.f69946a;
        }
        if (i7 != 1) {
            return null;
        }
        return tag.f69947b;
    }
}
